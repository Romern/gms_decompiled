package p000;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: bobn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bobn implements FilenameFilter {

    /* renamed from: a */
    private final Pattern f132507a;

    public bobn(Pattern pattern) {
        bmxy.m108581a(pattern);
        this.f132507a = pattern;
    }

    public final boolean accept(File file, String str) {
        return this.f132507a.matcher(str).matches();
    }
}
