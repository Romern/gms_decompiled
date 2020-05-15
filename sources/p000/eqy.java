package p000;

import java.util.Arrays;

/* renamed from: eqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eqy {

    /* renamed from: a */
    public final ffk f15547a;

    /* renamed from: b */
    public final bsxn f15548b;

    /* renamed from: c */
    public final String f15549c;

    /* renamed from: d */
    public final boolean f15550d;

    /* renamed from: e */
    public final esr f15551e;

    public eqy(ffk ffk, bsxn bsxn, esr esr) {
        this(ffk, bsxn, fgd.m11651b(), esr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eqy)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        eqy eqy = (eqy) obj;
        return sdg.m34949a(this.f15547a, eqy.f15547a) && sdg.m34949a(this.f15548b, eqy.f15548b) && sdg.m34949a(this.f15549c, eqy.f15549c) && this.f15550d == eqy.f15550d && sdg.m34949a(this.f15551e, eqy.f15551e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15547a, this.f15548b, this.f15549c, Boolean.valueOf(this.f15550d), this.f15551e});
    }

    public eqy(ffk ffk, bsxn bsxn, String str, esr esr) {
        this(ffk, bsxn, str, adyf.m51386a(eot.f15436a), esr);
    }

    public eqy(ffk ffk, bsxn bsxn, String str, boolean z, esr esr) {
        this.f15547a = ffk;
        this.f15548b = bsxn;
        this.f15549c = str;
        this.f15550d = z;
        this.f15551e = esr;
    }
}
