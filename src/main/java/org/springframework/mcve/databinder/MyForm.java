package org.springframework.mcve.databinder;

import org.springframework.lang.Nullable;
import org.springframework.web.multipart.MultipartFile;

record MyForm(
        String name,
        @Nullable MultipartFile file
) {
}
