package test;

import java.util.*;




/*












 */
public class Test {


    static class Site {
        public String siteName;
        public Integer count;

        public Site(String siteName, Integer count) {
            this.siteName = siteName;
            this.count = count;
        }
    }


    public static void main(String[] argv) {

        String[] counts = {"900,google.com",
                "60,mail.yahoo.com",
                "10,mobile.sports.yahoo.com",
                "40,sports.yahoo.com",
                "300,yahoo.com",
                "10,stackoverflow.com",
                "20,overflow.com",
                "5,com.com",
                "2,en.wikipedia.org",
                "1,m.wikipedia.org",
                "1,mobile.sports",
                "1,google.co.uk"
        };


        List<Site> list = new ArrayList<>();

        for (String siteName : counts) {
            String[] siteSplit = siteName.split(",");
            String name = siteSplit[1];
            Integer count = Integer.valueOf(siteSplit[0]);
            Site site1 = new Site(name, count);
            list.add(site1);
        }

        //System.out.println(list);


        Map<String, Integer> countMap = new HashMap<>();

        for (Site site : list) {
            String[] siteNames = site.siteName.split("\\.");
            System.out.println(siteNames.length);
            for (int i = 0; i < siteNames.length; i++)
            {
                StringBuilder key = new StringBuilder();
                for (int j = i; j < siteNames.length; j++) {
                    if (j == siteNames.length - 1) {
                        key.append(siteNames[j]);
                    } else {
                        key.append(siteNames[j]).append(".");
                    }
                }

                String key1 = key.toString();
                System.out.println(key1);
                if (countMap.containsKey(key1)) {
                    countMap.put(key1, site.count);
                } else {
                    Integer count1 = countMap.get(key1);
                    countMap.put(key1, count1 + site.count);
                }
            }
        }

        Set<String> keys = countMap.keySet();
        for (String key : keys) {
            System.out.println(key + " " + countMap.get(key));
        }

    }


}
