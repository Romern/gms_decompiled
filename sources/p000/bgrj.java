package p000;

import android.os.Message;

/* renamed from: bgrj */
final /* synthetic */ class bgrj implements Runnable {

    /* renamed from: a */
    private final bgrk f117331a;

    /* renamed from: b */
    private final Message f117332b;

    public bgrj(bgrk bgrk, Message message) {
        this.f117331a = bgrk;
        this.f117332b = message;
    }

    public final void run() {
        this.f117331a.f117482h.f117486b.mo63148a(8, this.f117332b.getData());
    }
}
