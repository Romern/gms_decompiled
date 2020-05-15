package p000;

import android.os.SystemClock;

/* renamed from: aamp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aamp extends aamq {

    /* renamed from: a */
    long f28476a = SystemClock.elapsedRealtime();

    /* renamed from: b */
    int f28477b = 0;

    public aamp(blmp blmp) {
        super(blmp);
    }

    /* renamed from: a */
    public final int mo17038a() {
        return 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo17040b() {
        return this.f28476a + (((long) Math.scalb((float) cecz.f182285a.mo6606a().mo78850r(), this.f28477b)) * 1000);
    }

    public final String toString() {
        String aamq = super.toString();
        int i = this.f28477b;
        StringBuilder sb = new StringBuilder(String.valueOf(aamq).length() + 20);
        sb.append(aamq);
        sb.append(" retries=");
        sb.append(i);
        return sb.toString();
    }
}
