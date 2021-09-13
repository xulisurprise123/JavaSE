package list;

import org.apache.commons.lang.StringUtils;

import java.util.*;

/**
 * @Classname ListUtils
 * @Description TODO
 * @Date 2021-9-13 23:26
 * @Created by xuli
 */
public class ListUtil {
    private Boolean containsFlag() {
        //1、检查数组是否包含某一个值
        String[] arr = new String[]{"小哈", "小黑", "哼哼"};
        boolean contains = Arrays.asList(arr).contains("小黑");
        //是否含有true
        System.out.println("是否含有" + contains);
        return contains;
    }

    private void joinArrays(List list) {
        //2、把数组中的元素用指定的分隔符连接起来
        String str = StringUtils.join(new String[]{"小哈", "小黑", "哼哼"}, ", ");
        System.out.println(str);
    }

    private String[] listToArray(List list) {
        //7、把一个 ArrayList 转换成数组
        String[] arr1 = new String[]{"小哈", "小黑", "哼哼"};
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(arr1));
        String[] stringArr = new String[arrayList.size()];
        arrayList.toArray(stringArr);
        for (String s : stringArr) {
            System.out.println(s);
            //小哈 小黑 哼哼
        }
        return stringArr;

    }

    //3、把一个数组转换成 Set
    private Set ArrayToSet(List list) {
        String[] arr2 = new String[]{"哈登", "保罗", "安东尼"};
        Set<String> set = new HashSet<String>(Arrays.asList(arr2));
        System.out.println(set);//[保罗, 安东尼, 哈登]
        return set;
    }

}