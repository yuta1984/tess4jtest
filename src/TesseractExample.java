import java.io.File;
import net.sourceforge.tess4j.*;

public class TesseractExample {
	  public static void main(String[] args) {
	        File imageFile = new File("eurotext.tif");
	        Tesseract instance = Tesseract.getInstance(); // JNA Interface Mapping
	        // Tesseract1 instance = new Tesseract1(); // JNA Direct Mapping

	        try {
	            String result = instance.doOCR(imageFile);
	            System.out.println(result);
	        } catch (TesseractException e) {
	            System.err.println(e.getMessage());
	        }
	    }
}

/**
 * Tess4J（http://tess4j.sourceforge.net/）利用手順  
 *  1. tess4j.jarとそれ以外の依存jarにビルドパスを通す
 *  2. プロジェクトルートに liblept.dll, libtesseract.dll（Win）, liblept.so, libtesseract.so(Linux)を配置
 *  3. 環境変数TESSDATA_PREFIXに言語データ配置フォルダ（tessdata）のパスを設定
 *  4. tessdataディレクトリに言語データファイルを配置
 * 
 */
