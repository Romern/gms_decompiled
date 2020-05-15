package p000;

import android.os.Bundle;

/* renamed from: aebm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aebm extends aeca {

    /* renamed from: a */
    public final long f63072a;

    /* renamed from: b */
    public final long f63073b;

    public aebm(aebl aebl) {
        super(aebl);
        long j = aebl.f63070a;
        this.f63072a = j;
        this.f63073b = Math.min(aebl.f63071b, j);
    }

    /* renamed from: a */
    public final void mo33975a(Bundle bundle, int i) {
        super.mo33975a(bundle, i);
        bundle.putLong("period", this.f63072a);
        bundle.putLong("period_flex", this.f63073b);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof aebm) && super.equals(obj)) {
            aebm aebm = (aebm) obj;
            if (this.f63072a == aebm.f63072a && this.f63073b == aebm.f63073b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String toString() {
        String obj = super.toString();
        long j = this.f63072a;
        long j2 = this.f63073b;
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 54);
        sb.append(obj);
        sb.append(" period=");
        sb.append(j);
        sb.append(" flex=");
        sb.append(j2);
        return sb.toString();
    }

    public aebm(Bundle bundle) {
        super(bundle);
        this.f63072a = bundle.getLong("period");
        this.f63073b = Math.min(bundle.getLong("period_flex"), this.f63072a);
    }
}
