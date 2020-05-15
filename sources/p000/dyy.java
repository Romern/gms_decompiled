package p000;

import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.nearby.messages.Message;

/* renamed from: dyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dyy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Message f14450a;

    /* renamed from: b */
    final /* synthetic */ dza f14451b;

    public dyy(dza dza, Message message) {
        this.f14451b = dza;
        this.f14450a = message;
    }

    public final void run() {
        dzc dzc = this.f14451b.f14454a;
        dxr dxr = dzc.f14465b;
        if (dzc.f14467l.containsKey(this.f14450a)) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dyy", "run", 298, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[DetectedBeaconProducer] Beacon message was already found.  Ignoring.  message=%s", this.f14450a);
            return;
        }
        dzc dzc2 = this.f14451b.f14454a;
        Message message = this.f14450a;
        if (!dzc2.mo9889a(message.f80678d, message.f80677c, message.f80676b)) {
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
            bnsl2.mo68432a("dyy", "run", 311, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("[DetectedBeaconProducer] Beacon message does not match filter. message=%s", this.f14450a);
            return;
        }
        bxvd da = bxkn.f163768d.mo74144da();
        bxvd da2 = bxkm.f163763d.mo74144da();
        String str = this.f14450a.f80678d;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxkm bxkm = (bxkm) da2.f164949b;
        str.getClass();
        int i = bxkm.f163765a | 1;
        bxkm.f163765a = i;
        bxkm.f163766b = str;
        String str2 = this.f14450a.f80677c;
        str2.getClass();
        bxkm.f163765a = i | 2;
        bxkm.f163767c = str2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxkn bxkn = (bxkn) da.f164949b;
        bxkm bxkm2 = (bxkm) da2.mo74062i();
        bxkm2.getClass();
        bxkn.f163772b = bxkm2;
        bxkn.f163771a |= 1;
        ByteString a = ByteString.m123261a(this.f14450a.f80676b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxkn bxkn2 = (bxkn) da.f164949b;
        a.getClass();
        bxkn2.f163771a |= 2;
        bxkn2.f163773c = a;
        tip tip = new tip(5, 26, 1);
        dzc dzc3 = this.f14451b.f14454a;
        tip.mo26574a(tka.m37119b(dwq.m9665i().mo20505a()));
        Message message2 = this.f14450a;
        tip.mo26573a(tju.m37104a(message2.f80678d, message2.f80677c, null));
        tip.mo26572a(bxkn.f163769e, (bxkn) da.mo74062i());
        ContextData a2 = tip.mo26570a();
        this.f14451b.f14454a.mo9856c(a2);
        this.f14451b.f14454a.f14467l.put(this.f14450a, a2);
    }
}
