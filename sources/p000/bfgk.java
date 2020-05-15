package p000;

import android.os.HandlerThread;

/* renamed from: bfgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfgk extends HandlerThread {

    /* renamed from: a */
    final /* synthetic */ bfgm f113766a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfgk(bfgm bfgm, String str) {
        super(str);
        this.f113766a = bfgm;
    }

    public final void run() {
        try {
            this.f113766a.f113775a.mo62923b(bgnq.COLLECTIONLIB, 600000, this.f113766a.f113781g);
            super.run();
        } finally {
            this.f113766a.f113775a.mo62925c(bgnq.COLLECTIONLIB);
        }
    }
}
