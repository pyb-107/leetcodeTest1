package mian.day01;

import java.util.Comparator;
import java.util.PriorityQueue;

public class subject02 {
    public static void main(String[] args) {

    }
}
class Solution {
    public int[][] kClosest(int[][] points, int K) {
        //构造一个大顶堆
        //大顶堆的元素是一个数组，数组一号元素保存了点的位置，第二个保存了点到原点的距离
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        //将前K个点放入大顶堆，二维数组中，第一个维度是点的索引，第二个维度保存了点坐标信息，points[n][0]是
        //横坐标，points[n][1]是纵坐标
        for (int i = 0; i < K; ++i){
            priorityQueue.add(new int[]{points[i][0] * points[i][0] + points[i][1] * points[i][1], i});
        }
        int n = points.length;
        for (int i = K; i < n;++i){
            //保存下一个点到原点的距离坐标
            int dist = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            //如果该点的距离小于堆顶部，即这k个点中最近的点，
            if(dist < priorityQueue.element()[0]){
                priorityQueue.remove();
                priorityQueue.add(new int[]{dist,i});
            }
        }
        int [][] ans = new int[K][2];
        for (int i = 0;i < K; ++i){
            ans[i] = points[priorityQueue.poll()[0]];
        }

        return ans;
    }
}