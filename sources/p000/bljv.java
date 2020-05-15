package p000;

/* renamed from: bljv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bljv implements bmxj {

    /* renamed from: a */
    final /* synthetic */ bljg f126706a;

    /* renamed from: b */
    final /* synthetic */ bmxj f126707b;

    public bljv(bljg bljg, bmxj bmxj) {
        this.f126706a = bljg;
        this.f126707b = bmxj;
    }

    public final Object apply(Object obj) {
        bljg b = blkh.m107293b(this.f126706a);
        try {
            return this.f126707b.apply(obj);
        } finally {
            blkh.m107293b(b);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f126707b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("propagating=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
