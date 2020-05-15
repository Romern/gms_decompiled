package p000;

/* renamed from: rct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rct implements Comparable {

    /* renamed from: a */
    public final long f42657a;

    /* renamed from: b */
    private final long f42658b;

    public rct(long j, long j2) {
        this.f42657a = j;
        this.f42658b = j2;
    }

    /* renamed from: a */
    public final int compareTo(rct rct) {
        long j = this.f42657a;
        long j2 = rct.f42657a;
        if (j == j2) {
            j = this.f42658b;
            j2 = rct.f42658b;
        }
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }
}
