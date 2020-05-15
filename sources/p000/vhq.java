package p000;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Set;

/* renamed from: vhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vhq implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ Set f49285a;

    public vhq(Set set) {
        this.f49285a = set;
    }

    public final boolean accept(File file, String str) {
        if (str.length() < 36) {
            return true;
        }
        if (!this.f49285a.contains(str.substring(0, 36))) {
            return true;
        }
        return false;
    }
}
