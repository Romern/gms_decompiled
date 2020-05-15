package p000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: acmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acmr {

    /* renamed from: a */
    final String f60167a;

    /* renamed from: b */
    final String f60168b;

    /* renamed from: c */
    final Set f60169c = new HashSet();

    /* renamed from: d */
    final Set f60170d = new HashSet();

    /* renamed from: e */
    final Map f60171e = new HashMap();

    public acmr(String str, String str2) {
        this.f60167a = str;
        this.f60168b = str2;
    }

    public final String toString() {
        return String.format(Locale.US, "Deltas for %s [toInsert=%d toUpdate=%d toDelete=%d]", this.f60167a, Integer.valueOf(this.f60169c.size()), Integer.valueOf(this.f60171e.size()), Integer.valueOf(this.f60170d.size()));
    }
}
