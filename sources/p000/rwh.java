package p000;

import android.os.PatternMatcher;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: rwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rwh implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ PatternMatcher f43791a;

    public rwh(PatternMatcher patternMatcher) {
        this.f43791a = patternMatcher;
    }

    public final boolean accept(File file, String str) {
        return this.f43791a.match(str);
    }
}
