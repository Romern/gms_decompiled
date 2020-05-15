package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: axn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class axn {

    /* renamed from: a */
    public int f2502a = 0;

    public axn() {
    }

    /* renamed from: d */
    private final void m2382d(int i) {
        int d = (mo2827d() ^ -1) & i;
        if (d == 0) {
            mo2831c(i);
            return;
        }
        String hexString = Integer.toHexString(d);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 33);
        sb.append("The option bit(s) 0x");
        sb.append(hexString);
        sb.append(" are invalid!");
        throw new awn(sb.toString(), ErrorInfo.TYPE_SDU_COMMUNICATIONERROR);
    }

    /* renamed from: a */
    public final void mo2828a(int i, boolean z) {
        int i2;
        if (!z) {
            i2 = (i ^ -1) & this.f2502a;
        } else {
            i2 = i | this.f2502a;
        }
        this.f2502a = i2;
    }

    /* renamed from: a */
    public final boolean mo2829a(int i) {
        return (i & this.f2502a) != 0;
    }

    /* renamed from: b */
    public final void mo2830b(int i) {
        m2382d(i);
        this.f2502a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo2831c(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo2827d();

    public final boolean equals(Object obj) {
        return this.f2502a == ((axn) obj).f2502a;
    }

    public final int hashCode() {
        return this.f2502a;
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.f2502a));
        return valueOf.length() == 0 ? new String("0x") : "0x".concat(valueOf);
    }

    public axn(int i) {
        m2382d(i);
        mo2830b(i);
    }
}
