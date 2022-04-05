import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Game_tree {
    public static void main(String[] args) {

        //int[] arr = {1,2,3,4,5,};
        int[] arr = randomString();
        ArrayList<int[]> list = new ArrayList<>();
        list.add(arr);
        HashMap<Integer, ArrayList<int[]>> graph = new HashMap<>();
        graph.put(0, list);

        for (int i = 1; i< arr.length+1; i++){
            ArrayList<int[]> newList = new ArrayList<>();
            graph.put(i, newList);
        }

        getGraph(graph, 0);

        for (int i = 0; i < graph.size(); i++){
            System.out.print("Level : "+i+": ");
            for (int j = 0; j < graph.get(i).size(); j++){
                System.out.print(Arrays.toString(graph.get(i).get(j))+" ");
            }
            System.out.println();
        }


    }

    static void getGraph(HashMap<Integer, ArrayList<int[]>> graph, int height){

        ArrayList<int[]> parent = new ArrayList<>();

        if (graph.get(height).size()<=0) return;

        for (int i = 0; i < graph.get(height).size(); i++){
            ArrayList<int[]> list = getList(graph.get(height).get(i));
            parent.addAll(list);
        }
        graph.put(height+1, parent);

        getGraph(graph, height+1);
    }

    static ArrayList<int[]> getList(int[] arr){

        ArrayList<int[]> parent  = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            int[] newArr = getArr(arr, i);
            parent.add(newArr);
        }
        return parent;
    }

    static int[] getArr(int[] arr, int index){
        int[] newArr = new int[arr.length-1];

        for (int i = 0; i < index; i++){
            newArr[i] = arr[i];
        }

        for (int i = index+1; i < arr.length; i++){
            newArr[i-1] = arr[i];
        }

        return newArr;
    }
    static int[] randomString(){
        int max = 999999999;
        int min = 9999999;
        int random_number = (int)Math.floor(Math.random()*(max-min+1)+min);
        String number = Integer.toString(random_number);
        int[] arr = new int[number.length()];
        for(int i = 0; i < number.length(); i++){
            arr[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        return arr;
    }

}