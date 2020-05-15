package p000;

/* renamed from: rdt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rdt {

    /* renamed from: a */
    public final caik f42762a;

    /* renamed from: b */
    public final long f42763b;

    public rdt(caik caik, long j) {
        this.f42762a = caik;
        this.f42763b = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rdt) {
            rdt rdt = (rdt) obj;
            if (this.f42763b != rdt.f42763b || !this.f42762a.equals(rdt.f42762a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        long j = this.f42763b;
        String valueOf = String.valueOf(this.f42762a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
        sb.append("Key: ");
        sb.append(j);
        sb.append(" \n with PLC:\n");
        sb.append(valueOf);
        return sb.toString();
    }
}
