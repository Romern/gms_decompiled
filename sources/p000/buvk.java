package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.io.IOException;

/* renamed from: buvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buvk implements bluw {

    /* renamed from: a */
    final /* synthetic */ buvo f155044a;

    public buvk(buvo buvo) {
        this.f155044a = buvo;
    }

    /* renamed from: a */
    private final void m120510a(Exception exc) {
        try {
            buvo buvo = this.f155044a;
            int i = buvo.f155057i;
            buvo.f155062d.put(new buvn(exc));
        } catch (InterruptedException e) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("buvk", "a", 233, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("BleGattConnection: Failed to put exception to read buffer");
        }
    }

    /* renamed from: b */
    public final void mo13820b() {
        srn srn = bvcm.f155598a;
        buvo buvo = this.f155044a;
        int i = buvo.f155057i;
        buvo.f155064f.countDown();
        this.f155044a.f155065g.countDown();
        blun blun = this.f155044a.f155061c;
        if (blun != null) {
            blun.mo66713b();
        }
        m120510a((Exception) new IOException("Socket disconnected"));
    }

    /* renamed from: a */
    public final void mo13814a() {
        srn srn = bvcm.f155598a;
        buvo buvo = this.f155044a;
        int i = buvo.f155057i;
        buvo.f155064f.countDown();
    }

    /* renamed from: a */
    public final void mo13815a(IOException iOException) {
        bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
        bnsl.mo68437a(iOException);
        bnsl.mo68432a("buvk", "a", 221, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Socket.onError()");
        buvo buvo = this.f155044a;
        int i = buvo.f155057i;
        buvo.f155064f.countDown();
        blun blun = this.f155044a.f155061c;
        if (blun != null) {
            blun.mo66713b();
        }
        m120510a((Exception) iOException);
    }

    /* renamed from: a */
    public final void mo13818a(byte[] bArr) {
        srn srn = bvcm.f155598a;
        try {
            buvo buvo = this.f155044a;
            int i = buvo.f155057i;
            buvo.f155062d.put(new buvn(bArr));
        } catch (InterruptedException e) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("buvk", "a", (int) BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("BleGattConnection: Failed to put message to read buffer");
        }
    }
}
