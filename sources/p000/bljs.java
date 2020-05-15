package p000;

/* renamed from: bljs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bljs implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bljg f126700a;

    /* renamed from: b */
    final /* synthetic */ Runnable f126701b;

    public bljs(bljg bljg, Runnable runnable) {
        this.f126700a = bljg;
        this.f126701b = runnable;
    }

    public final void run() {
        bljg b = blkh.m107293b(this.f126700a);
        try {
            this.f126701b.run();
        } finally {
            blkh.m107293b(b);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f126701b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("propagating=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
