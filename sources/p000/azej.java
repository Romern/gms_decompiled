package p000;

/* renamed from: azej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azej implements Runnable {

    /* renamed from: a */
    final /* synthetic */ azet f99164a;

    public azej(azet azet) {
        this.f99164a = azet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        return;
     */
    public final void run() {
        azox.m85982b();
        synchronized (this.f99164a.f99185a) {
            if (!this.f99164a.mo54847c()) {
                azet azet = this.f99164a;
                if (!azet.f99202r) {
                    if (azet.f99193i.f111088h) {
                        this.f99164a.mo54840a();
                        return;
                    }
                    azet azet2 = this.f99164a;
                    azet2.f99191g.mo55141a(456, azet2.f99207w);
                    this.f99164a.mo54844a(false);
                }
            }
        }
    }
}
