package p000;

import java.util.HashSet;

/* renamed from: fg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0985fg {

    /* renamed from: a */
    final C0986fh f16486a;

    /* renamed from: b */
    C0985fg f16487b;

    /* renamed from: c */
    public int f16488c = 0;

    /* renamed from: d */
    int f16489d = -1;

    /* renamed from: e */
    public int f16490e = 0;

    /* renamed from: f */
    public C0983fe f16491f;

    /* renamed from: g */
    final int f16492g;

    /* renamed from: h */
    public int f16493h = 1;

    /* renamed from: i */
    public int f16494i = 1;

    public C0985fg(C0986fh fhVar, int i) {
        this.f16486a = fhVar;
        this.f16492g = i;
    }

    /* renamed from: a */
    private final String m11635a(HashSet hashSet) {
        String str;
        if (!hashSet.add(this)) {
            return "<-";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("null:");
        sb.append(C0984ff.m11579a(this.f16492g));
        if (this.f16487b != null) {
            str = " connected to " + this.f16487b.m11635a(hashSet);
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public final int mo10793a() {
        C0985fg fgVar;
        if (this.f16486a.f16544K == 8) {
            return 0;
        }
        int i = this.f16489d;
        return (i < 0 || (fgVar = this.f16487b) == null || fgVar.f16486a.f16544K != 8) ? this.f16488c : i;
    }

    /* renamed from: b */
    public final void mo10795b() {
        this.f16487b = null;
        this.f16488c = 0;
        this.f16489d = -1;
        this.f16493h = 2;
        this.f16490e = 0;
        this.f16494i = 1;
    }

    /* renamed from: c */
    public final boolean mo10796c() {
        return this.f16487b != null;
    }

    /* renamed from: d */
    public final void mo10797d() {
        C0983fe feVar = this.f16491f;
        if (feVar == null) {
            this.f16491f = new C0983fe(1);
        } else {
            feVar.mo10744a();
        }
    }

    public final String toString() {
        String str;
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        sb.append("null:");
        sb.append(C0984ff.m11579a(this.f16492g));
        if (this.f16487b != null) {
            str = " connected to " + this.f16487b.m11635a(hashSet);
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo10794a(C0985fg fgVar, int i, int i2, int i3, int i4, boolean z) {
        boolean z2 = true;
        if (fgVar == null) {
            this.f16487b = null;
            this.f16488c = 0;
            this.f16489d = -1;
            this.f16493h = 1;
            this.f16490e = 2;
            return;
        }
        if (!z) {
            int i5 = fgVar.f16492g;
            int i6 = this.f16492g;
            if (i5 != i6) {
                int i7 = i6 - 1;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                if (i7 != 6 || i5 == 6 || i5 == 8 || i5 == 9) {
                                    return;
                                }
                            }
                        }
                    }
                    if (!(i5 == 3 || i5 == 5)) {
                        z2 = false;
                    }
                    if (fgVar.f16486a instanceof C0988fj) {
                        if (!z2 && i5 != 9) {
                            return;
                        }
                    }
                    if (!z2) {
                        return;
                    }
                }
                if (!(i5 == 2 || i5 == 4)) {
                    z2 = false;
                }
                if (fgVar.f16486a instanceof C0988fj) {
                    if (!z2 && i5 != 8) {
                        return;
                    }
                }
                if (!z2) {
                }
            } else if (i6 == 7) {
                return;
            } else {
                if (i6 == 6 && (!fgVar.f16486a.mo10830k() || !this.f16486a.mo10830k())) {
                    return;
                }
            }
        }
        this.f16487b = fgVar;
        if (i > 0) {
            this.f16488c = i;
        } else {
            this.f16488c = 0;
        }
        this.f16489d = i2;
        this.f16493h = i3;
        this.f16490e = i4;
    }
}
