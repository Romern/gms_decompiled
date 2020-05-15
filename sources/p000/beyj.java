package p000;

/* renamed from: beyj */
public final /* synthetic */ class beyj implements Runnable {

    /* renamed from: a */
    private final beyv f113013a;

    /* renamed from: b */
    private final bfch f113014b;

    public beyj(beyv beyv, bfch bfch) {
        this.f113013a = beyv;
        this.f113014b = bfch;
    }

    public final void run() {
        beyv beyv = this.f113013a;
        beyv.f113043f.remove(this.f113014b);
        if (beyv.f113043f.isEmpty() && beyv.f113047j) {
            beyv.mo61260a();
        }
    }
}
