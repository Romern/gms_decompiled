package p000;

import java.util.Arrays;

/* renamed from: uob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class uob {

    /* renamed from: a */
    private final int f48375a;

    /* renamed from: b */
    public final Object f48376b;

    /* renamed from: c */
    protected final int f48377c;

    /* renamed from: d */
    private final int[] f48378d;

    /* renamed from: e */
    private final Object[] f48379e;

    protected uob(int i, uoa uoa) {
        boolean z;
        boolean z2 = true;
        if (uoa.f48370c > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        sdo.m34974b(uoa.f48371d[0] != 0 ? false : z2);
        this.f48375a = uoa.f48370c;
        this.f48378d = uoa.f48371d;
        this.f48379e = uoa.f48372e;
        this.f48376b = mo27751d(i);
        this.f48377c = i;
    }

    /* renamed from: c */
    public final Object mo27750c(int i) {
        Object d = mo27751d(i);
        StringBuilder sb = new StringBuilder(34);
        sb.append("Not present in version ");
        sb.append(i);
        sdo.checkIfNull(d, sb.toString());
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo27751d(int i) {
        if (i < 0) {
            return null;
        }
        int binarySearch = Arrays.binarySearch(this.f48378d, 0, this.f48375a, i);
        if (binarySearch >= 0) {
            return this.f48379e[binarySearch];
        }
        return this.f48379e[(binarySearch ^ -1) - 1];
    }

    /* renamed from: e */
    public final boolean mo27752e(int i) {
        return mo27751d(i) != null;
    }

    /* renamed from: g */
    public final boolean mo27753g() {
        return this.f48376b != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo27754h() {
        sdo.m34972a(mo27753g(), "Not present in current version %d", Integer.valueOf(this.f48377c));
    }
}
