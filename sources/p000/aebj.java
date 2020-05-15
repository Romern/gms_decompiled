package p000;

import android.os.Bundle;

/* renamed from: aebj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aebj extends aeca {

    /* renamed from: a */
    public final long f63068a;

    /* renamed from: b */
    public final long f63069b;

    public aebj(aebi aebi) {
        super(aebi);
        this.f63068a = aebi.f63066a;
        this.f63069b = aebi.f63067b;
    }

    /* renamed from: a */
    public final void mo33975a(Bundle bundle, int i) {
        super.mo33975a(bundle, i);
        bundle.putLong("window_start", this.f63068a);
        bundle.putLong("window_end", this.f63069b);
    }

    public final String toString() {
        String obj = super.toString();
        long j = this.f63068a;
        long j2 = this.f63069b;
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 64);
        sb.append(obj);
        sb.append(" windowStart=");
        sb.append(j);
        sb.append(" windowEnd=");
        sb.append(j2);
        return sb.toString();
    }

    public aebj(Bundle bundle) {
        super(bundle);
        this.f63068a = bundle.getLong("window_start");
        this.f63069b = bundle.getLong("window_end");
    }
}
