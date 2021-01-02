package com.study;

/**
 * SortTest
 *
 * @auther zhang
 * @date 2020/9/27
 **/
public class SortTest {

    public static void main(String args[]){

        /**
         * 冒泡排序
         */
        System.out.println("---------------冒泡排序-----------------");
        int a1[]={26,13,40,30,68,10};
        maopaoSort(a1);
        System.out.println(showArray(a1));

        /**
         * 选择排序
         */
        System.out.println("---------------选择排序-----------------");
        int a2[]={26,13,40,30,68,10};
        selectSort(a2);
        System.out.println(showArray(a2));

        System.out.println(Integer.MAX_VALUE);

    }

    /**
     * 冒泡排序 总共进行数组长度-1轮比较--我定义为n-1，每一轮有n-1 再减去当前轮数次比较
     * @param a
     * @return
     */
    public static  int[] maopaoSort(int a[]){

        for (int j = 0; j < a.length - 1; j++) {

            for (int i = 0; i < a.length - 1 - j; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }

        }
        return a;
    }

    /**
     * 选择排序
     * @param arry
     * @return
     */
    public static  int[] selectSort(int arry[]){


        for(int j=0;j<arry.length-1;j++){
            int x=j;
            for(int i=j+1;i<arry.length;i++){
                if(arry[i]<arry[x]) {
                    int temp=arry[x];
                    arry[x]=arry[i];
                    arry[i]=temp;
                }
            }

        }
        return arry;
    }

    public static String showArray(int arry[]){
        StringBuffer sb=new StringBuffer("[");

        for(int j=0;j<arry.length;j++){

            if(j!=arry.length-1){
               sb.append(arry[j]).append(",");
            }else{
                sb.append(arry[j]);
            }
        }
        sb.append("]");
        return sb.toString();

    }

}
