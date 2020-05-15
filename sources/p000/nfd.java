package p000;

import java.util.Arrays;

/* renamed from: nfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nfd extends nfb {
    /* renamed from: a */
    public final int mo20552a() {
        return 0;
    }

    /* renamed from: a */
    public final byte[] mo20554a(nek nek) {
        return null;
    }

    /* renamed from: b */
    public final boolean mo20556b() {
        return false;
    }

    /* renamed from: c */
    public final boolean mo20557c() {
        return false;
    }

    /* renamed from: a */
    public final Integer mo20553a(int i) {
        return Integer.valueOf(i);
    }

    /* renamed from: c */
    public final byte[] mo20558c(nek nek) {
        byte[] a = nek.mo20526a(nfb.f35449a);
        if (a[1] == 1) {
            return Arrays.copyOfRange(a, 1, 18);
        }
        return Arrays.copyOfRange(a, 1, 14);
    }
}
