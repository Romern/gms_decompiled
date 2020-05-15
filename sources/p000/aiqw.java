package p000;

import java.io.IOException;

/* renamed from: aiqw */
final /* synthetic */ class aiqw implements Runnable {

    /* renamed from: a */
    private final aiqx f69518a;

    /* renamed from: b */
    private final IOException f69519b;

    public aiqw(aiqx aiqx, IOException iOException) {
        this.f69518a = aiqx;
        this.f69519b = iOException;
    }

    public final void run() {
        aiqx aiqx = this.f69518a;
        IOException iOException = this.f69519b;
        bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
        bnsl.mo68437a(iOException);
        bnsl.mo68432a("aiqx", "b", 497, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        aiqy aiqy = aiqx.f69520a;
        byte[] bArr = aiqy.f69521a;
        bnsl.mo68420a("MultiplexBleSocketV1 connected to %s encountered an error with its internal Weave socket.", aiqy.f69522b);
    }
}
