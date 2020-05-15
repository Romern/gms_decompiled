package p000;

/* renamed from: ces */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ces implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cev f6625a;

    public ces(cev cev) {
        this.f6625a = cev;
    }

    public final void run() {
        cev cev = this.f6625a;
        while (true) {
            boolean z = cev.f6631c;
            try {
                cev.mo3786a((ceu) cev.f6630b.remove());
                cet cet = cev.f6632d;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
