package p000;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: agbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agbd extends agas {

    /* renamed from: a */
    public int f65114a;

    /* renamed from: b */
    public String[] f65115b;

    /* renamed from: f */
    private int f65116f;

    /* renamed from: g */
    private int f65117g;

    public agbd(String[] strArr, agap agap) {
        super(strArr, 33, agap);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35136a(agap agap) {
        this.f65116f = agap.mo35147c();
        this.f65117g = agap.mo35147c();
        this.f65114a = agap.mo35147c();
        this.f65115b = agap.mo35148d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof agbd) {
            agbd agbd = (agbd) obj;
            return super.equals(obj) && this.f65116f == agbd.f65116f && this.f65117g == agbd.f65117g && sdg.m34949a(this.f65115b, agbd.f65115b) && this.f65114a == agbd.f65114a;
        }
    }

    public final int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(new Object[]{Integer.valueOf(this.f65116f), Integer.valueOf(this.f65117g), this.f65115b, Integer.valueOf(this.f65114a)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "SRV: %s:%d (prio=%d, weight=%d)", agas.m53825a(this.f65115b), Integer.valueOf(this.f65114a), Integer.valueOf(this.f65116f), Integer.valueOf(this.f65117g));
    }
}
