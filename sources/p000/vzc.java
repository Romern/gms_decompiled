package p000;

/* renamed from: vzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vzc {

    /* renamed from: a */
    public final long f50271a;

    /* renamed from: b */
    public final long f50272b;

    public vzc(long j, long j2) {
        long currentTimeMillis = System.currentTimeMillis();
        long e = (cdrq.f181609a.mo6606a().mo78222e() * 1000) + currentTimeMillis;
        long b = currentTimeMillis + (cdrq.f181609a.mo6606a().mo78219b() * 1000);
        j2 = j2 < b ? b : j2;
        e = j2 <= e ? j2 : e;
        this.f50271a = j > e ? e : j;
        this.f50272b = e;
    }
}
