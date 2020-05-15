package p000;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: wvi */
final /* synthetic */ class wvi implements FilenameFilter {

    /* renamed from: a */
    static final FilenameFilter f51413a = new wvi();

    private wvi() {
    }

    public final boolean accept(File file, String str) {
        return str.startsWith("anr_");
    }
}
