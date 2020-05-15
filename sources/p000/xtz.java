package p000;

/* renamed from: xtz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xtz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ xub f53102a;

    public xtz(xub xub) {
        this.f53102a = xub;
    }

    public final void run() {
        if (!this.f53102a.mo30139a()) {
            xub.f53108m.mo25416d("Can't send keep-alive: not connected.", new Object[0]);
        } else if (!this.f53102a.f53118l.isDone()) {
            xub.f53108m.mo25416d("Can't send keep-alive, another write in progress.", new Object[0]);
            this.f53102a.f53118l.mo741a(new xty(this), bqfb.INSTANCE);
        } else {
            xub xub = this.f53102a;
            xub.mo30138a(xub.mo30140b((byte) -126, new byte[]{2}));
            this.f53102a.mo30137a(500);
        }
    }
}
