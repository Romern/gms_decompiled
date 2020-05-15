package p000;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: baav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class baav implements FilenameFilter {

    /* renamed from: a */
    private final Pattern f100395a;

    public baav(Pattern pattern) {
        this.f100395a = pattern;
    }

    public final boolean accept(File file, String str) {
        return this.f100395a.matcher(str).matches();
    }
}
