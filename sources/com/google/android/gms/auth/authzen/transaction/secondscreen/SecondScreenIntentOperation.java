package com.google.android.gms.auth.authzen.transaction.secondscreen;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.authzen.transaction.TransactionReplyIntentOperation;
import com.google.android.gms.auth.firstparty.shared.ApplicationInformation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SecondScreenIntentOperation extends IntentOperation {

    /* renamed from: e */
    private static final sek f10499e = new sek("SecondScreenIntentOperation");

    /* renamed from: a */
    private String f10500a;

    /* renamed from: b */
    private bypc f10501b;

    /* renamed from: c */
    private byte[] f10502c;

    /* renamed from: d */
    private bzxo f10503d;

    public SecondScreenIntentOperation() {
    }

    /* renamed from: a */
    public static Intent m6535a(bypc bypc, String str, byte[] bArr) {
        sdo.m34959a(bypc);
        sdo.m34977c(str);
        Intent startIntent = IntentOperation.getStartIntent(rpr.m34216b(), SecondScreenIntentOperation.class, "com.google.android.gms.auth.authzen.transaction.secondscreen.START_FLOW");
        startIntent.putExtra("account", str);
        startIntent.putExtra("tx_request", bypc.mo73642k());
        startIntent.putExtra("encryption_key_handle", bArr);
        return startIntent;
    }

    public final void onHandleIntent(Intent intent) {
        this.f10500a = intent.getStringExtra("account");
        this.f10502c = intent.getByteArrayExtra("encryption_key_handle");
        try {
            bypc bypc = (bypc) bxvk.m124014a(bypc.f167305k, intent.getByteArrayExtra("tx_request"));
            this.f10501b = bypc;
            bypb bypb = bypc.f167310d;
            if (bypb == null) {
                bypb = bypb.f167289p;
            }
            bzxo bzxo = (bzxo) bxvk.m124014a(bzxo.f171782h, bypb.f167304o.mo73780k());
            this.f10503d = bzxo;
            String str = bzxo.f171788e;
            Account account = new Account(this.f10500a, "com.google");
            bzxo bzxo2 = this.f10503d;
            ApplicationInformation applicationInformation = new ApplicationInformation(bzxo2.f171784a, bzxo2.f171785b, bzxo2.f171786c, bzxo2.f171787d);
            gib gib = new gib(new Bundle());
            Bundle bundle = new Bundle();
            bundle.putParcelable("keyApplicationInformationWrapperBundle", applicationInformation);
            gib.f18283a.putBundle("keyApplicationInformationAuthExtrasBundle", bundle);
            Bundle bundle2 = gib.mo11900a().f18284a;
            if (!this.f10503d.f171789f.isEmpty()) {
                bundle2.putString("KEY_DEVICE_NAME", this.f10503d.f171789f);
            }
            if (!this.f10503d.f171790g.isEmpty()) {
                bundle2.putString("KEY_REMOTE_APP_LABEL", this.f10503d.f171790g);
            }
            bundle2.putBoolean("KEY_IS_REMOTE_APP", true);
            try {
                gie.m13188a(getBaseContext(), account, str, bundle2);
                m6537a(this, this.f10500a, this.f10502c, this.f10501b, byoo.APPROVE_SELECTED);
            } catch (UserRecoverableAuthException e) {
                getBaseContext().startActivity(SecondScreenGetTokenChimeraActivity.m6534a(this.f10501b, this.f10500a, this.f10502c, e.mo7366a()));
            } catch (Exception e2) {
                f10499e.mo25415d("general get token exception: ", e2, new Object[0]);
                m6537a(this, this.f10500a, this.f10502c, this.f10501b, byoo.NO_RESPONSE_SELECTED);
            }
        } catch (bxwf e3) {
            f10499e.mo25415d("Unable to parse proto ", e3, new Object[0]);
        }
    }

    SecondScreenIntentOperation(Context context, String str, bypc bypc, byte[] bArr, bzxo bzxo) {
        attachBaseContext(context);
        this.f10500a = str;
        this.f10501b = bypc;
        this.f10502c = bArr;
        this.f10503d = bzxo;
    }

    /* renamed from: a */
    public static void m6536a(Context context, Intent intent, byoo byoo) {
        try {
            m6537a(context, intent.getStringExtra("account"), intent.getByteArrayExtra("encryption_key_handle"), (bypc) bxvk.m124014a(bypc.f167305k, intent.getByteArrayExtra("tx_request")), byoo);
        } catch (bxwf e) {
            f10499e.mo25417e("Unable to parse TxRequest", e, new Object[0]);
        }
    }

    /* renamed from: a */
    private static void m6537a(Context context, String str, byte[] bArr, bypc bypc, byoo byoo) {
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
        bypc.getClass();
        byoz.f167286b = bypc;
        int i = byoz.f167285a | 1;
        byoz.f167285a = i;
        bypd3.getClass();
        byoz.f167287c = bypd3;
        byoz.f167285a = i | 2;
        context.startService(TransactionReplyIntentOperation.m6530a(str, bArr, bypc, new byrz(bysa.TX_REPLY, ((byoz) da2.mo74062i()).mo73642k())));
    }
}
