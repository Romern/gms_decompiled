package p000;

/* renamed from: blju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class blju implements bqeg {

    /* renamed from: a */
    final /* synthetic */ bljg f126704a;

    /* renamed from: b */
    final /* synthetic */ bqeg f126705b;

    public blju(bljg bljg, bqeg bqeg) {
        this.f126704a = bljg;
        this.f126705b = bqeg;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bljg b = blkh.m107293b(this.f126704a);
        try {
            return this.f126705b.mo7073a();
        } finally {
            blkh.m107293b(b);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f126705b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("propagating=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
