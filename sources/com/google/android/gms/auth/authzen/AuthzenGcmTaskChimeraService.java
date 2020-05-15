package com.google.android.gms.auth.authzen;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.auth.authzen.transaction.TransactionReplyIntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthzenGcmTaskChimeraService extends aeah {

    /* renamed from: a */
    private static final sek f10373a = new sek("AuthzenGcmTaskChimeraService");

    /* renamed from: a */
    public static void m6427a(Context context, Intent intent, long j) {
        long j2 = 60 + j;
        String stringExtra = intent.getStringExtra("account");
        byte[] byteArrayExtra = intent.getByteArrayExtra("encryption_key_handle");
        bypc a = ijt.m15553a(intent);
        Bundle bundle = new Bundle();
        bundle.putString("account", stringExtra);
        bundle.putString("encryption_key_handle", Base64.encodeToString(byteArrayExtra, 2));
        bundle.putString("tx_request", Base64.encodeToString(a.mo73642k(), 2));
        String a2 = ikl.m15608a(a);
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.auth.authzen.AuthzenGcmTaskService";
        String valueOf = String.valueOf(a2);
        aebi.f63099k = valueOf.length() == 0 ? new String("dismiss:") : "dismiss:".concat(valueOf);
        aebi.f63102n = true;
        aebi.mo34004a(j, j2);
        aebi.mo34027b(1);
        aebi.f63107s = bundle;
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* renamed from: a */
    public static void m6428a(Context context, String str) {
        aeat a = aeat.m51532a(context);
        String valueOf = String.valueOf(str);
        a.mo33986a(valueOf.length() == 0 ? new String("dismiss:") : "dismiss:".concat(valueOf), "com.google.android.gms.auth.authzen.AuthzenGcmTaskService");
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        String str = aecc.f63128a;
        if (!str.startsWith("dismiss:")) {
            sek sek = f10373a;
            String valueOf = String.valueOf(str);
            sek.mo25418e(valueOf.length() == 0 ? new String("Received unexpected task: ") : "Received unexpected task: ".concat(valueOf), new Object[0]);
            return 2;
        }
        Bundle bundle = aecc.f63129b;
        if (bundle == null) {
            sek sek2 = f10373a;
            String valueOf2 = String.valueOf(str);
            sek2.mo25418e(valueOf2.length() == 0 ? new String("Missing extras for task: ") : "Missing extras for task: ".concat(valueOf2), new Object[0]);
            return 2;
        }
        String string = bundle.getString("account");
        try {
            byte[] decode = Base64.decode(bundle.getString("encryption_key_handle"), 2);
            byte[] decode2 = Base64.decode(bundle.getString("tx_request"), 2);
            bypc bypc = null;
            if (decode2 != null) {
                try {
                    bypc = (bypc) GeneratedMessageLite.m124014a(bypc.f167305k, decode2);
                } catch (bxwf e) {
                    sek sek3 = f10373a;
                    String valueOf3 = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 19);
                    sb.append("Invalid protobuff: ");
                    sb.append(valueOf3);
                    sek3.mo25418e(sb.toString(), new Object[0]);
                }
            }
            sdo.m34959a(this);
            sdo.m34959a((Object) string);
            sdo.m34959a(decode);
            sdo.m34959a(bypc);
            ikj.m15597a(bypc.f167308b.mo73780k(), 11, this);
            ikl.m15607a(this).mo13098a(ikl.m15608a(bypc));
            bxvd da = bypd.f167317i.mo74144da();
            byoo byoo = byoo.EXPIRED;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bypd bypd = (bypd) da.f164949b;
            bypd.f167320b = byoo.f167232j;
            bypd.f167319a |= 1;
            long currentTimeMillis = System.currentTimeMillis();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bypd bypd2 = (bypd) da.f164949b;
            bypd2.f167319a |= 4;
            bypd2.f167322d = currentTimeMillis;
            bypd bypd3 = (bypd) da.mo74062i();
            bxvd da2 = byoz.f167283d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            byoz byoz = (byoz) da2.f164949b;
            bypc.getClass();
            byoz.f167286b = bypc;
            int i = byoz.f167285a | 1;
            byoz.f167285a = i;
            bypd3.getClass();
            byoz.f167287c = bypd3;
            byoz.f167285a = i | 2;
            startService(TransactionReplyIntentOperation.m6530a(string, decode, bypc, new byrz(bysa.TX_REPLY, ((byoz) da2.mo74062i()).mo73642k())));
            return 0;
        } catch (IllegalArgumentException | NullPointerException e2) {
            sek sek4 = f10373a;
            String valueOf4 = String.valueOf(e2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 22);
            sb2.append("Extras parsing error: ");
            sb2.append(valueOf4);
            sek4.mo25418e(sb2.toString(), new Object[0]);
            return 2;
        }
    }
}
