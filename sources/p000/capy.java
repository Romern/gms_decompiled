package p000;

import java.util.Iterator;
import java.util.List;

/* renamed from: capy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class capy {

    /* renamed from: a */
    public static final byte[] f175522a = {-33, 75};

    /* renamed from: b */
    private final byte[] f175523b = new byte[3];

    /* renamed from: a */
    public static capy m126942a() {
        return new capy();
    }

    /* renamed from: b */
    public static capy m126945b(boolean z, List list) {
        capy capy = new capy();
        if (z && !catg.m127167c(list)) {
            capy.mo74750b();
        }
        if (list.contains(cash.CONTEXT_NOT_MATCHING)) {
            capy.mo74751c();
        }
        if (list.contains(cash.MISSING_CONSENT)) {
            capy.mo74752d();
        }
        return capy;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo74751c() {
        byte[] bArr = this.f175523b;
        bArr[1] = (byte) (bArr[1] | 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo74752d() {
        byte[] bArr = this.f175523b;
        bArr[1] = (byte) (bArr[1] | 2);
    }

    /* renamed from: e */
    public final byte[] mo74753e() {
        return cath.m127170a(f175522a, this.f175523b);
    }

    /* renamed from: a */
    public static capy m126943a(List list) {
        capy capy = new capy();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cash cash = cash.CONTEXT_NOT_MATCHING;
            int ordinal = ((cash) it.next()).ordinal();
            if (ordinal == 0) {
                capy.mo74751c();
            } else if (ordinal == 1 || ordinal == 3 || ordinal == 6) {
                byte[] bArr = capy.f175523b;
                bArr[1] = (byte) (bArr[1] | 1);
            } else if (ordinal == 7) {
                capy.mo74752d();
            }
        }
        return capy;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo74750b() {
        byte[] bArr = this.f175523b;
        bArr[1] = (byte) (bArr[1] | 16);
    }

    /* renamed from: a */
    public static capy m126944a(boolean z, List list) {
        capy a = m126943a(list);
        if (z && !catg.m127167c(list)) {
            a.mo74750b();
        }
        return a;
    }
}
