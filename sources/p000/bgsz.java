package p000;

/* renamed from: bgsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgsz {

    /* renamed from: a */
    public final bgsv f117467a;

    /* renamed from: b */
    public final long[] f117468b;

    /* renamed from: c */
    public int f117469c = 0;

    public bgsz(bgsv bgsv) {
        this.f117467a = bgsv;
        this.f117468b = new long[bgsv.f117462b];
        for (int i = 0; i < bgsv.f117462b; i++) {
            this.f117468b[i] = -(bgsv.f117461a + 1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo63141a(long j) {
        long[] jArr = this.f117468b;
        int i = this.f117469c;
        jArr[i] = j;
        this.f117469c = (i + 1) % this.f117467a.f117462b;
    }
}
