package p000;

import java.util.concurrent.Callable;

/* renamed from: bbtx */
final /* synthetic */ class bbtx implements Callable {

    /* renamed from: a */
    private final bbub f103370a;

    /* renamed from: b */
    private final bbua f103371b;

    public bbtx(bbub bbub, bbua bbua) {
        this.f103370a = bbub;
        this.f103371b = bbua;
    }

    public final Object call() {
        bbub bbub = this.f103370a;
        bbua bbua = this.f103371b;
        synchronized (bbub) {
            if (!bbub.f103395p) {
                bbub.f103397r = bbua;
                bbub.f103394o = true;
                bbub.f103395p = false;
                bbub.f103389j.mo56343a(2);
                String valueOf = String.valueOf(bbub.f103381b.mo57058b().mo57074e().mo60492a());
                bbos.m88289a("MsgReceiver", valueOf.length() == 0 ? new String("BindV2 stream opened for ") : "BindV2 stream opened for ".concat(valueOf));
                return null;
            }
            bbos.m88289a("MsgReceiver", "BindV2 stream had an error. Not marking as open.");
            return null;
        }
    }
}
