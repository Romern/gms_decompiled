package p000;

import java.io.File;
import java.io.FileFilter;

/* renamed from: zxt */
public final /* synthetic */ class zxt implements FileFilter {

    /* renamed from: a */
    public static final FileFilter f56132a = new zxt();

    private zxt() {
    }

    public final boolean accept(File file) {
        return file.isDirectory();
    }
}
