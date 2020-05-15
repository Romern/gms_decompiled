package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.authzen.transaction.TransactionReplyIntentOperation;

/* renamed from: iff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class iff {
    /* renamed from: a */
    static final void m15364a(Context context, Intent intent, byoo byoo) {
        String stringExtra = intent.getStringExtra("account");
        byte[] byteArrayExtra = intent.getByteArrayExtra("encryption_key_handle");
        bypc a = ijt.m15553a(intent);
        bxvd da = bypd.f167317i.mo74144da();
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
        a.getClass();
        byoz.f167286b = a;
        int i = byoz.f167285a | 1;
        byoz.f167285a = i;
        bypd3.getClass();
        byoz.f167287c = bypd3;
        byoz.f167285a = i | 2;
        context.startService(TransactionReplyIntentOperation.m6530a(stringExtra, byteArrayExtra, a, new byrz(bysa.TX_REPLY, ((byoz) da2.mo74062i()).mo73642k())));
    }
}
