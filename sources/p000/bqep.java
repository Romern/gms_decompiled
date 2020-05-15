package p000;

import java.util.logging.Level;

/* renamed from: bqep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqep implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bqeu f140552a;

    public bqep(bqeu bqeu) {
        this.f140552a = bqeu;
    }

    public final void run() {
        this.f140552a.mo69189a(bqet.WILL_CLOSE, bqet.CLOSING);
        bqeu bqeu = this.f140552a;
        bqeu.f140563a.logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "close", "closing {0}", bqeu);
        bqeu.f140564b.close();
        this.f140552a.mo69189a(bqet.CLOSING, bqet.CLOSED);
    }
}
