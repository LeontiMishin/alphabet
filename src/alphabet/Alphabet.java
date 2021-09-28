package alphabet;

/**
 *
 * @author Leonti
 */
public class Alphabet {

    public static void main(String[] args) {
    String str = "А а	Б б	В в	Г г	Д д	Е е	Ё ё" +
"Ж ж	З з	И и	Й й	К к	Л л	М м" +
"Н н	О о	П п	Р р	С с	Т т	У у" +
"Ф ф	Х х	Ц ц	Ч ч	Ш ш	Щ щ	Ъ ъ" +
"Ы ы	Ь ь	Э э	Ю ю	Я я";
     char[] result = str.toCharArray();
     
     System.out.println("Char array:");
     
     
    String text = "съешь ещё этих французских булок и галет, да выпей же чаю с молоком, как и я";


    
     for (int i = 0; i < result.length; i++){
//     	System.out.println("Element [" + i + "]: " + result[i]);
        char nul = result[i];
        System.out.println(nul);
}
     
     
     
     
    }
    
}
