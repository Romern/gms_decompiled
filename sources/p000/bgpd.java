package p000;

import java.io.File;
import java.io.FileFilter;

/* renamed from: bgpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgpd implements FileFilter {
    public final boolean accept(File file) {
        if (file.isFile()) {
            String name = file.getName();
            int length = name.length();
            int i = 0;
            while (i < length) {
                if (Character.isDigit(name.charAt(i))) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }
}
