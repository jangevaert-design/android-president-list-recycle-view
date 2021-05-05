package edu.cnm.deepdive.presidenlistrecycleview;

import android.app.Application;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyApplication extends Application {

  private static List<President> presidentList = new ArrayList<President>();
  private static int nextId = 22;

  public MyApplication() {
    fillPresidentList();
  }

  private void fillPresidentList() {

    President p0 = new President(0, "George Washington", 1788,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg/160px-Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg");
    President p1 = new President(1, "John Adams", 1796,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/7/70/John_Adams%2C_Gilbert_Stuart%2C_c1800_1815.jpg/160px-John_Adams%2C_Gilbert_Stuart%2C_c1800_1815.jpg");
    President p2 = new President(2, "Thomas Jefferson", 1800,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/Thomas_Jefferson_by_Rembrandt_Peale%2C_1800.jpg/160px-Thomas_Jefferson_by_Rembrandt_Peale%2C_1800.jpg");
    President p3 = new President(3, "James Madison", 1808,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1d/James_Madison.jpg/160px-James_Madison.jpg");
    President p4 = new President(4, "James Monroe", 1816,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/James_Monroe_White_House_portrait_1819.jpg/160px-James_Monroe_White_House_portrait_1819.jpg");
    President p5 = new President(5, "John Quincy Adams", 1824,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/JQA_Photo.tif/lossy-page1-160px-JQA_Photo.tif.jpg");
    President p6 = new President(6, "Andrew Jackson", 1828,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Andrew_jackson_head.jpg/165px-Andrew_jackson_head.jpg");
    President p7 = new President(7, "Martin Van Buren", 1836,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Martin_Van_Buren_edit.jpg/160px-Martin_Van_Buren_edit.jpg");
    President p8 = new President(8, "William Henry Harrison", 1840,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c5/William_Henry_Harrison_daguerreotype_edit.jpg/160px-William_Henry_Harrison_daguerreotype_edit.jpg");
    President p9 = new President(9, "John Tyler", 1840,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1d/John_Tyler%2C_Jr.jpg/160px-John_Tyler%2C_Jr.jpg");
    President p10 = new President(10, "James K. Polk", 1844,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5e/JKP.jpg/160px-JKP.jpg");
    President p11 = new President(11, "Zachary Taylor", 1848,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Zachary_Taylor_restored_and_cropped.jpg/160px-Zachary_Taylor_restored_and_cropped.jpg");
    President p12 = new President(12, "Millard Fillmore", 1850,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Fillmore.jpg/160px-Fillmore.jpg");
    President p13 = new President(13, "Franklin Pierce", 1852,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/Mathew_Brady_-_Franklin_Pierce_-_alternate_crop_%28cropped%29.jpg/160px-Mathew_Brady_-_Franklin_Pierce_-_alternate_crop_%28cropped%29.jpg");
    President p14 = new President(14, "James Buchanan", 1856,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/James_Buchanan.jpg/160px-James_Buchanan.jpg");
    President p15 = new President(15, "Abraham Lincoln", 1860,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Abraham_Lincoln_O-77_matte_collodion_print.jpg/160px-Abraham_Lincoln_O-77_matte_collodion_print.jpg");
    President p16 = new President(16, "Andrew Johnson", 1864,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/Andrew_Johnson_photo_portrait_head_and_shoulders%2C_c1870-1880-Edit1.jpg/160px-Andrew_Johnson_photo_portrait_head_and_shoulders%2C_c1870-1880-Edit1.jpg");
    President p17 = new President(17, "Ulysses S. Grant", 1868,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/7/75/Ulysses_S_Grant_by_Brady_c1870-restored.jpg/160px-Ulysses_S_Grant_by_Brady_c1870-restored.jpg");
    President p18 = new President(18, "Rutherford B. Hayes", 1876,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/President_Rutherford_Hayes_1870_-_1880_Restored.jpg/160px-President_Rutherford_Hayes_1870_-_1880_Restored.jpg");
    President p19 = new President(19, "James A. Garfield", 1880,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1f/James_Abram_Garfield%2C_photo_portrait_seated.jpg/160px-James_Abram_Garfield%2C_photo_portrait_seated.jpg");
    President p20 = new President(20, "Chester A. Arthur", 1880,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/Chester_Alan_Arthur.jpg/160px-Chester_Alan_Arthur.jpg");
    President p21 = new President(21, "Grover Cleveland", 1884,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Grover_Cleveland_-_NARA_-_518139_%28cropped%29.jpg/160px-Grover_Cleveland_-_NARA_-_518139_%28cropped%29.jpg");
    President p22 = new President(22, "Benjamin Harrison", 1888,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/Benjamin_Harrison%2C_head_and_shoulders_bw_photo%2C_1896.jpg/160px-Benjamin_Harrison%2C_head_and_shoulders_bw_photo%2C_1896.jpg");
    President p23 = new President(23, "Grover Cleveland", 1892,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Grover_Cleveland_-_NARA_-_518139_%28cropped%29.jpg/160px-Grover_Cleveland_-_NARA_-_518139_%28cropped%29.jpg");
    President p24 = new President(24, "William McKinley", 1896,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/Mckinley.jpg/160px-Mckinley.jpg");
    President p25 = new President(25, "Theodore Roosevelt", 1900,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1c/President_Roosevelt_-_Pach_Bros.jpg/160px-President_Roosevelt_-_Pach_Bros.jpg");
    President p26 = new President(26, "William H. Taft", 1908,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/William_Howard_Taft_-_Harris_and_Ewing.jpg/160px-William_Howard_Taft_-_Harris_and_Ewing.jpg");
    President p27 = new President(27, "Woodrow Wilson", 1912,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Thomas_Woodrow_Wilson%2C_Harris_%26_Ewing_bw_photo_portrait%2C_1919.jpg/160px-Thomas_Woodrow_Wilson%2C_Harris_%26_Ewing_bw_photo_portrait%2C_1919.jpg");
    President p28 = new President(28, "Warren G. Harding", 1920,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c4/Warren_G_Harding-Harris_%26_Ewing.jpg/160px-Warren_G_Harding-Harris_%26_Ewing.jpg");
    President p29 = new President(29, "Calvin Coolidge", 1923,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c4/Warren_G_Harding-Harris_%26_Ewing.jpg/160px-Warren_G_Harding-Harris_%26_Ewing.jpg");
    President p30 = new President(30, "Herbert Hoover", 1928,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/President_Hoover_portrait.jpg/165px-President_Hoover_portrait.jpg");
    President p31 = new President(31, "Franklin D. Roosevelt", 1932,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/FDR_1944_Color_Portrait.jpg/160px-FDR_1944_Color_Portrait.jpg");
    President p32 = new President(32, "Harry S. Truman", 1944,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/3/39/TRUMAN_58-766-06_CROPPED.jpg/160px-TRUMAN_58-766-06_CROPPED.jpg");
    President p33 = new President(33, "Dwight D. Eisenhower", 1952,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/6/63/Dwight_D._Eisenhower%2C_official_photo_portrait%2C_May_29%2C_1959.jpg/160px-Dwight_D._Eisenhower%2C_official_photo_portrait%2C_May_29%2C_1959.jpg");
    President p34 = new President(34, "John F. Kennedy", 1960,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/John_F._Kennedy%2C_White_House_color_photo_portrait.jpg/160px-John_F._Kennedy%2C_White_House_color_photo_portrait.jpg");
    President p35 = new President(35, "Lyondon B. Johnson", 1963, "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/37_Lyndon_Johnson_3x4.jpg/160px-37_Lyndon_Johnson_3x4.jpg");
    President p36 = new President(36, "Richard Nixon", 1968, "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Richard_Nixon_presidential_portrait_%281%29.jpg/160px-Richard_Nixon_presidential_portrait_%281%29.jpg");
    President p37 = new President(37, "Gerald Ford", 1974, "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Gerald_Ford_presidential_portrait.jpg/160px-Gerald_Ford_presidential_portrait.jpg");
    President p38 = new President(38, "Jimmy Carter", 1976, "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/JimmyCarterPortrait2.jpg/160px-JimmyCarterPortrait2.jpg");
    President p39 = new President(39, "Ronald Reagan", 1980, "https://upload.wikimedia.org/wikipedia/commons/thumb/1/16/Official_Portrait_of_President_Reagan_1981.jpg/165px-Official_Portrait_of_President_Reagan_1981.jpg");
    President p40 = new President(40, "George H.W. Bush", 1988, "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ee/George_H._W._Bush_presidential_portrait_%28cropped%29.jpg/160px-George_H._W._Bush_presidential_portrait_%28cropped%29.jpg");
    President p41 = new President(41, "Bill Clinton", 1992, "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Bill_Clinton.jpg/160px-Bill_Clinton.jpg");
    President p42 = new President(42, "George W. Bush", 2000, "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/George-W-Bush.jpeg/160px-George-W-Bush.jpeg");
    President p43 = new President(43, "Barack Obama", 2008, "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Official_portrait_of_Barack_Obama.jpg/160px-Official_portrait_of_Barack_Obama.jpg");
    President p44 = new President(44, "Orange Donald", 2016, "https://i.guim.co.uk/img/media/49ef60657ca270f8fd24159c921e8a6a5e14ed2d/906_111_1455_873/master/1455.jpg?width=1200&height=900&quality=85&auto=format&fit=crop&s=85c64bb5bf6a6f32007a91313066bd0d");
    President p45 = new President(45, "Richard Samoni", 2020, "https://static01.nyt.com/images/2011/06/05/books/review/Zacharek-1/Zacharek-1-jumbo.jpg?quality=75&auto=webp&disable=upscale");
    President p46 = new President(46, "Joe Biden", 2020, "https://upload.wikimedia.org/wikipedia/commons/thumb/6/68/Joe_Biden_presidential_portrait.jpg/160px-Joe_Biden_presidential_portrait.jpg");
    presidentList.addAll(Arrays.asList(
        new President[]{p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15,
            p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32,
            p33, p34, p35, p36, p37, p38, p39, p40, p41, p42, p43, p44, p45, p46}));
  }

  public static List<President> getPresidentList() {
    return presidentList;
  }

  public static void setPresidentList(
      List<President> presidentList) {
    MyApplication.presidentList = presidentList;
  }

  public static int getNextId() {
    return nextId;
  }

  public static void setNextId(int nextId) {
    MyApplication.nextId = nextId;
  }
}
