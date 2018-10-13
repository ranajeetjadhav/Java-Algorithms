package src.practice.problem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class ZipUnzip {

	private static final String inputGzFileName = "C:\\data_masking\\db_backup\\mydb.sql.gz";
	private static final String oututGzFileName = "C:\\data_masking\\db_backup\\masked_mydb.sql.gz";
	
	private static final String inputFileName = "C:\\data_masking\\db_backup\\unmasked_infinity.sql";
	private static final String oututFileName = "C:\\data_masking\\db_backup\\masked_infinity.sql";
	
	
	public static void main(String[] args) {
		try {
			decompressGzipFile(inputGzFileName,inputFileName);
			compressGzipFile(inputFileName,oututGzFileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void decompressGzipFile(String gzipFile, String inputFile) throws IOException {
		try {
			FileInputStream fis = new FileInputStream(gzipFile);
			GZIPInputStream gis = new GZIPInputStream(fis);
			FileOutputStream fos = new FileOutputStream(inputFile);

			byte[] buffer = new byte[1024];
			int len;

			while ((len = gis.read(buffer)) != -1) {
				fos.write(buffer, 0, len);
			}
			// close resources
			fos.close();
			gis.close();
		} catch (IOException e) {
			throw new IOException(gzipFile + " failed to unzip");
		}
	}

	private static void compressGzipFile(String outputFile, String gzipFile) throws IOException {
		try {
			FileInputStream fis = new FileInputStream(outputFile);
			FileOutputStream fos = new FileOutputStream(gzipFile);
			GZIPOutputStream gzipOS = new GZIPOutputStream(fos);

			byte[] buffer = new byte[1024];
			int len;
			while ((len = fis.read(buffer)) != -1) {
				gzipOS.write(buffer, 0, len);
			}
			// close resources
			gzipOS.close();
			fos.close();
			fis.close();
		} catch (IOException e) {
			throw new IOException(outputFile + "failed to zip");
		}
	}
}
