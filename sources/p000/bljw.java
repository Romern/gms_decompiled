package p000;

/* renamed from: bljw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bljw implements bqeh {

    /* renamed from: a */
    final /* synthetic */ bljg f126708a;

    /* renamed from: b */
    final /* synthetic */ bqeh f126709b;

    public bljw(bljg bljg, bqeh bqeh) {
        this.f126708a = bljg;
        this.f126709b = bqeh;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bljg b = blkh.m107293b(this.f126708a);
        try {
            return this.f126709b.mo6375a(obj);
        } finally {
            blkh.m107293b(b);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f126709b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("propagating=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
