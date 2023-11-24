package org.springframework.mcve.databinder;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
class FileUploadController {

    @PostMapping(path = "/form", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Void> handleFormUpload(final MyForm form) {
        if (form.file() != null) {
            // store the bytes somewhere
            return ResponseEntity
                    .ok()
                    .build();
        }
        return ResponseEntity
                .noContent()
                .build();
    }
}
