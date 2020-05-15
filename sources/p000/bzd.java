package p000;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: bzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzd {

    /* renamed from: a */
    public final Map f6242a = new EnumMap(bxg.class);

    static {
        citv.m151011a(bzd.class);
    }

    public bzd(bzg... bzgArr) {
        bzg bzg = bzgArr[0];
        bxg a = bzg.mo3476a();
        if (!this.f6242a.containsKey(a)) {
            this.f6242a.put(a, bzg);
            return;
        }
        String valueOf = String.valueOf(a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
        sb.append("More than one dgi factory for platform: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }
}
