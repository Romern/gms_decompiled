package com.google.android.gms.auth.account.accounttransfer;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountTransferIntentOperation extends IntentOperation {

    /* renamed from: c */
    private static final sek f9964c = ght.m13171a("AccountTransfer", "AccountTransferIntentOperation");

    /* renamed from: a */
    gto f9965a;

    /* renamed from: b */
    artq f9966b;

    /* renamed from: d */
    private sns f9967d;

    /* renamed from: a */
    private final gjj m6270a() {
        gjl gjl = new gjl(this.f9965a);
        artq artq = this.f9966b;
        rjo rjo = aqxb.f87025a;
        return new gjj(this, gjl, artq, adyd.m51363a(this), this.f9965a);
    }

    public final void onCreate() {
        f9964c.mo25412b("onCreate()", new Object[0]);
        sns sns = new sns("AccountTransferIntentOperation", 9);
        this.f9967d = sns;
        sns.start();
        this.f9965a = gsw.m13839a(this);
        this.f9966b = aqxb.m72187a(this);
    }

    public final void onDestroy() {
        f9964c.mo25412b("onDestroy()", new Object[0]);
        this.f9967d.quit();
        this.f9967d = null;
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("key_extra_account_type");
            if (!"com.google".equals(stringExtra)) {
                f9964c.mo25416d("Not handling acconut type in onHandleIntent(accountType=%s). Sending completion status", stringExtra);
                gjn.m13284a(gsw.m13839a(this), stringExtra);
                return;
            }
            String action = intent.getAction();
            f9964c.mo25412b("onHandleIntent(intent=%s)", action);
            if ("com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE".equals(action)) {
                m6270a().mo11937a();
            } else if ("com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE".equals(action)) {
                gjl gjl = new gjl(this.f9965a);
                artq artq = this.f9966b;
                rjo rjo = aqxb.f87025a;
                new gjk(this, gjl, artq, adyd.m51363a(this), (goa) goa.f18759a.mo13145b(), new gjm(this, new snr(this.f9967d)), this.f9965a).mo11939a();
            } else if ("com.google.android.gms.auth.START_ACCOUNT_EXPORT".equals(action)) {
                gjj a = m6270a();
                gjj.f18337a.mo25412b("startAccountExport()", new Object[0]);
                try {
                    a.mo11938b();
                } catch (gji e) {
                    gjj.f18337a.mo25417e("startAccountExport() error", e, new Object[0]);
                    gjn.m13286b(a.f18338b);
                }
            }
        } else {
            f9964c.mo25416d("onHandleIntent(intent=null)", new Object[0]);
        }
    }
}
