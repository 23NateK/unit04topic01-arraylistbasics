import java.util.ArrayList;

public class ArrayListUtilities {
    public static int getListMax(ArrayList<Integer> items) {
        int maxVal=0;
        for(int value : items){
            if(value>maxVal){
                maxVal=value;
            }
        }
        return maxVal;
    }
    public static ArrayList<String> withoutLongWords(ArrayList<String> items){
        ArrayList<String> noLongWords = new ArrayList<String>();
        for(String word:items){
            if(word.length()<=5){
                noLongWords.add(word);
            }
        }


        return noLongWords;
    }
    public static void removeLongWords(ArrayList<String> items){
        for(int i=items.size()-1;i>=0;i--){
            if(items.get(i).length()>5){
                items.remove(i);
            }
        }
    }
    public static ArrayList<Double> reversed(ArrayList<Double> items){
        ArrayList<Double> newList = new ArrayList<Double>();
        for(int i=items.size()-1;i>=0;i--){
            newList.add(items.get(i));
        }


        return newList;
    }
    public static void reverseInPlace(ArrayList<Double> items){
        int currentpos=0;
        Double currentnum=0.0;

        for(int i=items.size()-1;i>=items.size()/2;i--){
            currentnum=items.get(currentpos);
            items.remove(currentpos);
            items.add(currentpos, items.get(i-1));
            items.remove(i);
            items.add(i, currentnum);
            currentpos++;
        }
    }

}