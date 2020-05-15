package p000;

/* renamed from: duj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class duj {

    /* renamed from: a */
    public static final duj f14043a = new duj(-1);

    /* renamed from: b */
    public static final duj f14044b = new duj(-2);

    /* renamed from: c */
    public final long f14045c;

    private duj(long j) {
        this.f14045c = j;
    }

    /* renamed from: a */
    public static duj m9377a(long j) {
        sdo.m34974b(j > 0);
        return new duj(j);
    }

    /* renamed from: a */
    public final boolean mo9619a() {
        return this.f14045c == -1;
    }

    public final String toString() {
        long j = this.f14045c;
        StringBuilder sb = new StringBuilder(26);
        sb.append("Epoch=");
        sb.append(j);
        return sb.toString();
    }
}
