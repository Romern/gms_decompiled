package p000;

import android.os.Message;

/* renamed from: bfhf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfhf extends adzt {

    /* renamed from: a */
    final /* synthetic */ bfhg f113885a;

    public bfhf(bfhg bfhg) {
        this.f113885a = bfhg;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                getLooper().quit();
            }
            super.handleMessage(message);
            return;
        }
        synchronized (this.f113885a.f113891f) {
            bfhg bfhg = this.f113885a;
            bhdb bhdb = bfhg.f113890e;
            bffs bffs = bfhg.f113888c;
            bsax bsax = bfhg.f113887b;
            throw null;
        }
    }
}
