public class B03 {
    public static void main(String[] args) {
        /*
        Projemizde önemli bir degisiklik yapmak istiyoruz,bu degisiklige 10 gün calisacagiz
        degisikligi yapmaya devam ederken orjinal projemizi riske atmamak
        ve eger son kullanici kullaniyorsa olusabilecek sorunlari engellemek icin
        orjinal proje üzerinde calismak yerine , yeni bir branch olusturup, orda calisiriz.
        calisma sonunda istenilen hedefe ulasmissak
        olusturdugumuz branchi asil branche kopyalariz.

         */

        /*
        - Branch listesini gormek icin => git branch   (main/master cikar)
        - Yeni bir branch olusturmak icin  =>  git branch branchIsmi
        - Istenen branch’e gecmek icin  =>  git checkout branchIsmi
        - Baska bir branch’i kullandigimiz branch ile birlestirme => git merge branchIsmi

        NOT : Merge yaptigimiz branchlerde ayni kod satirinda farkli kodlar varsa conflict
        olusur. Git iki kodu da gosterir ve bizden manuel olarak bunlari duzenlememiz
        istenir.

        Merge yaparken hangi branche birlestirmek istiyorsan oraya gecmelisin.
        bsp: deneme branchini master branchine birlestireceksen , master de olduguna emin ol.
        sonra "git merge deneme" demelisin.
         */
    }
}
