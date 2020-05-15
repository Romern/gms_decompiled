package p000;

import com.google.android.gms.auth.proximity.BlePeripheralChimeraService;
import java.io.IOException;

/* renamed from: jjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jjw implements blvq {

    /* renamed from: a */
    final /* synthetic */ BlePeripheralChimeraService f22662a;

    public jjw(BlePeripheralChimeraService blePeripheralChimeraService) {
        this.f22662a = blePeripheralChimeraService;
    }

    /* renamed from: a */
    public final void mo13805a(blvp blvp) {
        BlePeripheralChimeraService.f11114a.mo25412b("Connection from %s", blvp.mo66756c());
        jke jke = new jke(blvp.mo66756c(), blvp, snp.m35703a(1, 10), true);
        BlePeripheralChimeraService blePeripheralChimeraService = this.f22662a;
        jnl jnl = new jnl(blePeripheralChimeraService, blePeripheralChimeraService.f11115b.mo13907b());
        jke.mo13816a(this.f22662a.f11116c);
        if (this.f22662a.f11117d.mo13800a()) {
            jju jju = this.f22662a.f11117d;
            jju.f22647j.post(new jjj(jju, jke));
        }
        synchronized (jke.f22683e) {
            jke.f22688j = jnl;
            jke.f22690l = jnl;
            jke.f22686h = jke.f22684f.mo14040a("peripheral_role_receive_initiator_hello_time");
            jke.mo13823c(2);
        }
    }

    /* renamed from: a */
    public final void mo13806a(IOException iOException) {
        BlePeripheralChimeraService.f11114a.mo25411b("Failed to create Weave transport", iOException, new Object[0]);
        jsw.m17254a().mo14033a(iOException);
    }
}
