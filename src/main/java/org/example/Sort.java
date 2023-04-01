package org.example;
import java.util.ArrayList;
public class Sort {
    public static void ShellSort(ArrayList<Integer> array) {
//  выбираем значение расстояния между сравниваемыми объектами, назовем его шагом
        int step = array.size()/2;
//  цикл длится до тех пор, пока шаг больше 0
        while(step>0) {
//  начинаем проход от индекса, равного значению расстояния
            for(int i = step; i < array.size(); i++) {
//  объявляем вспомогательную переменную; она будет сравниваться с элементом, чей индекс на значение шага левее
                for (int j = i; j >= step && (array.get(j) < array.get(j - step)); j -= step) {
//  если выполняется условие, меняем элементы местами
                    int t = array.get(j);
                    array.set(j,array.get(j - step));
                    array.set(j - step, t);
                }
            }
//  переход к следующему этапу алгоритма; значение шага, т.е. расстояние между сравниваемыми объектами, уменьшается
            step = step/2;
        }
    }
}

