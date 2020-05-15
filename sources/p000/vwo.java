package p000;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: vwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vwo implements FilenameFilter {
    public final boolean accept(File file, String str) {
        return str.endsWith(".so");
    }
}
