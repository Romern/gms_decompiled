package p000;

/* renamed from: qxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class qxf {

    /* renamed from: a */
    protected final int f42362a;

    public qxf(int i) {
        if (i > 0) {
            this.f42362a = i;
            return;
        }
        StringBuilder sb = new StringBuilder(22);
        sb.append("bad alias: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public long mo24357a(long j) {
        long j2 = (long) this.f42362a;
        return j2 * (j / j2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof qxf) && this.f42362a == ((qxf) obj).f42362a;
        }
        return true;
    }
}
