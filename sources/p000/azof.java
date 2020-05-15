package p000;

import android.text.TextUtils;

/* renamed from: azof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azof {
    /* renamed from: a */
    public static boolean m85913a(cbma cbma) {
        int b;
        if (cbma == null) {
            return false;
        }
        int b2 = cipg.m150691b(cbma.f177593a);
        return ((b2 != 0 && b2 == 3) || ((b = cipg.m150691b(cbma.f177593a)) != 0 && b == 18)) && !TextUtils.isEmpty(cbma.f177594b);
    }
}
