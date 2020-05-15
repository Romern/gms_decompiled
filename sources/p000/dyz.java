package p000;

import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.nearby.messages.Message;

/* renamed from: dyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dyz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Message f14452a;

    /* renamed from: b */
    final /* synthetic */ dza f14453b;

    public dyz(dza dza, Message message) {
        this.f14453b = dza;
        this.f14452a = message;
    }

    public final void run() {
        dzc dzc = this.f14453b.f14454a;
        dxr dxr = dzc.f14465b;
        ContextData contextData = (ContextData) dzc.f14467l.get(this.f14452a);
        if (contextData == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dyz", "run", 353, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[DetectedBeaconProducer] Got an onLost without a corresponding onFound for message: %s", this.f14452a);
            return;
        }
        tip tip = new tip(contextData);
        dzc dzc2 = this.f14453b.f14454a;
        tip.mo26571a(dwq.m9665i().mo20505a());
        this.f14453b.f14454a.mo9856c(tip.mo26570a());
        this.f14453b.f14454a.f14467l.remove(this.f14452a);
    }
}
