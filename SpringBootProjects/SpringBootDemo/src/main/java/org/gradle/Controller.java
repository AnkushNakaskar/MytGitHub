package org.gradle;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("/sample")
	public String display() {
		System.out.println("Ankush");
		return "index.html";
	}

	// @RequestMapping("/fileUpload")
	@ResponseBody
	public String uploadFile(@RequestPart("file") MultipartFile imageFile) {
		System.out.println("Ankush...upload..." + imageFile.getOriginalFilename());

		return imageFile.getName();
	}

	@RequestMapping("/url")
	@ResponseBody
	public String url() {
		System.out.println("Unsecured..");
		return "Un-secured...";
	}

}
