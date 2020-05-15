package p000;

import android.telephony.SmsMessage;

/* renamed from: tem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tem {

    /* renamed from: a */
    final /* synthetic */ teo f45772a;

    public tem(teo teo) {
        this.f45772a = teo;
    }

    /* renamed from: a */
    public final String mo26442a() {
        cbqg cbqg;
        cbom cbom;
        cbqy cbqy = this.f45772a.f45778c;
        if (cbqy.f178083a == 4) {
            cbqg = (cbqg) cbqy.f178084b;
        } else {
            cbqg = cbqg.f178018b;
        }
        cbnz cbnz = cbqg.f178020a;
        if (cbnz == null) {
            cbnz = cbnz.f177781f;
        }
        if (cbnz.f177783a == 6) {
            cbom = (cbom) cbnz.f177784b;
        } else {
            cbom = cbom.f177836b;
        }
        return cbom.f177838a;
    }

    /* renamed from: a */
    public final void mo26443a(SmsMessage smsMessage) {
        tds a = tds.m36774a(rpr.m34216b());
        teo teo = this.f45772a;
        a.mo26411a(teo.f45780e, teo.f45778c, 10);
        new soa(9, new ten(this.f45772a, smsMessage.getOriginatingAddress(), smsMessage.getMessageBody())).start();
    }
}
