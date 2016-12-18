import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println("Ankush111");
		File f = new File("D:\\VUClip\\Work\\Temp\\Image");
		if (f.isDirectory()) {
			System.out.println("Ankush...");
			System.out.println(f.delete());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.getPath());
//			FileUtils.deleteDirectory(f);
			String path=f.getPath();
			FileUtils.cleanDirectory(f);
			
		}
	}

	public static void delete(File file) throws IOException {

		if (file.isDirectory()) {

			// directory is empty, then delete it
			if (file.list().length == 0) {

				file.delete();
				System.out.println("Directory is deleted : " + file.getAbsolutePath());

			} else {

				// list all the directory contents
				String files[] = file.list();

				for (String temp : files) {
					// construct the file structure
					File fileDelete = new File(file, temp);

					// recursive delete
					delete(fileDelete);
				}

				// check the directory again, if empty then delete it
				if (file.list().length == 0) {
					file.delete();
					System.out.println("Directory is deleted : " + file.getAbsolutePath());
				}
			}

		} else {
			// if file, then delete it
			file.delete();
			System.out.println("File is deleted : " + file.getAbsolutePath());
		}
	}
}
