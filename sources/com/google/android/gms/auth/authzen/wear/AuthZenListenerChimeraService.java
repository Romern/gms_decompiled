package com.google.android.gms.auth.authzen.wear;

import com.google.android.gms.auth.authzen.transaction.TransactionReplyIntentOperation;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthZenListenerChimeraService extends axpp {

    /* renamed from: h */
    private static final sek f10508h = new sek("AuthZenListenerService");

    /* renamed from: a */
    igr f10509a;

    /* renamed from: a */
    public final void mo7590a(MessageEventParcelable messageEventParcelable) {
        String str = messageEventParcelable.f110947b;
        f10508h.mo25412b("onMessageReceived: %s, Path: %s", messageEventParcelable, str);
        if ("/send-tx-response".equals(str)) {
            axos a = axos.m82822a(messageEventParcelable.f110948c);
            try {
                bypc bypc = (bypc) bxvk.m124014a(bypc.f167305k, a.mo53343f("tx_request"));
                bypd bypd = (bypd) bxvk.m124014a(bypd.f167317i, a.mo53343f("tx_response"));
                ikl.m15607a(this).mo13098a(ikl.m15608a(bypc));
                String c = a.mo53337c("email");
                byte[] f = a.mo53343f("key_handle");
                bxvd da = byoz.f167283d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byoz byoz = (byoz) da.f164949b;
                bypc.getClass();
                byoz.f167286b = bypc;
                int i = 1 | byoz.f167285a;
                byoz.f167285a = i;
                bypd.getClass();
                byoz.f167287c = bypd;
                byoz.f167285a = 2 | i;
                startService(TransactionReplyIntentOperation.m6530a(c, f, bypc, new byrz(bysa.TX_REPLY, ((byoz) da.mo74062i()).mo73642k())));
                axos axos = new axos();
                axos.mo53331a("tx_request", bypc.mo73642k());
                axos.mo53331a("tx_response", bypd.mo73642k());
                igs a2 = this.f10509a.mo12997a("/send-tx-response-ack", axos.mo53333a());
                if (cceo.m129401b()) {
                    a2.mo12999a();
                } else {
                    a2.mo13000b();
                }
            } catch (bxwf e) {
                f10508h.mo25417e("Received a malformed TxRequest or TxResponse", e, new Object[0]);
            }
        }
    }

    public final void onCreate() {
        super.onCreate();
        rjy rjy = new rjy(this);
        rjy.mo24779a(axoz.f96226a);
        this.f10509a = new igr(this, rjy.mo24784b(), axoz.f96228c, axoz.f96229d);
    }
}
