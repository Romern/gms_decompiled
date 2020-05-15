package p000;

/* renamed from: bkpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkpv {

    /* renamed from: a */
    public final long f125096a;

    /* renamed from: b */
    public final blhg f125097b;

    /* renamed from: c */
    public final long f125098c;

    public bkpv(long j, blhg blhg, long j2) {
        this.f125096a = j;
        bkww.m106781a(blhg, "command");
        this.f125097b = blhg;
        this.f125098c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bkpv) {
            bkpv bkpv = (bkpv) obj;
            return this.f125096a == bkpv.f125096a && this.f125097b.equals(bkpv.f125097b);
        }
    }

    public final int hashCode() {
        blhg blhg = this.f125097b;
        int hashCode = blhg != null ? blhg.hashCode() : 0;
        long j = this.f125096a;
        return ((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)));
    }
}
