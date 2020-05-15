package p000;

/* renamed from: nnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nnr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ noj f36112a;

    public nnr(noj noj) {
        this.f36112a = noj;
    }

    public final void run() {
        boolean isEmpty;
        synchronized (this.f36112a.f36216c) {
            isEmpty = this.f36112a.f36216c.isEmpty();
        }
        if (isEmpty) {
            noj noj = this.f36112a;
            noj.mo21299ad();
            if (!noj.mo21257T()) {
                noj.f36218e.mo17318b();
            }
        }
    }
}
