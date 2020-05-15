package p000;

import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aqvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqvt {

    /* renamed from: a */
    static final bnic f86936a = bnic.m109494a(0, 13, 14, 3, 7, 1, 6, 2, 10, 4, 8, 11);

    /* renamed from: b */
    static final bnic f86937b = bnic.m109494a(0, 13, 14, 3, 7, 1, 6, 10, 4, 8, 11);

    /* renamed from: c */
    static final bnic f86938c = bnic.m109494a(0, 13, 14, 3, 7, 6, 2, 10, 4, 8, 11);

    /* renamed from: d */
    static final bnic f86939d = bnic.m109494a(0, 13, 14, 3, 7, 6, 10, 4, 8, 11);

    /* renamed from: e */
    public final String f86940e;

    /* renamed from: f */
    public final Set f86941f;

    public aqvt(String str, Set set) {
        this.f86940e = str;
        this.f86941f = set;
    }

    /* renamed from: a */
    public static aqvt m72175a(String str, Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.people.smart_profile.SHOW_THESE_CARDS_ONLY")) {
            return new aqvt(str, m72177a(bundle.getIntArray("com.google.android.gms.people.smart_profile.SHOW_THESE_CARDS_ONLY")));
        }
        if (!bundle.containsKey("com.google.android.gms.people.smart_profile.HIDE_THESE_CARDS")) {
            return new aqvt(str, m72176a());
        }
        HashSet hashSet = new HashSet(m72176a());
        hashSet.removeAll(m72177a(bundle.getIntArray("com.google.android.gms.people.smart_profile.HIDE_THESE_CARDS")));
        return new aqvt(str, hashSet);
    }

    /* renamed from: a */
    private static bnic m72176a() {
        if (!cgof.m146336b() && !cgoi.m146341b()) {
            return f86936a;
        }
        if (!cgof.m146336b() || cgoi.m146341b()) {
            return (cgof.m146336b() || !cgoi.m146341b()) ? f86939d : f86937b;
        }
        return f86938c;
    }

    /* renamed from: a */
    private static Set m72177a(int[] iArr) {
        HashSet hashSet = new HashSet();
        for (int i : iArr) {
            hashSet.add(Integer.valueOf(i));
        }
        return hashSet;
    }
}
