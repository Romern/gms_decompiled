package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

/* renamed from: atau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atau {

    /* renamed from: a */
    public static final srn f89973a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    public final Context f89974b;

    public atau(Context context) {
        this.f89974b = context;
    }

    /* renamed from: a */
    private static PendingIntent m75346a(Context context, Intent intent) {
        return PendingIntent.getService(context, 0, intent, 134217728);
    }

    /* renamed from: a */
    public final void mo49771a(btqg btqg) {
        if (!btqg.f149936b.isEmpty() && !btqg.f149937c.isEmpty() && !btqg.f149939e.isEmpty()) {
            String b = asjg.m74215b(this.f89974b, btqg.f149939e);
            if (!TextUtils.isEmpty(b)) {
                AccountInfo accountInfo = new AccountInfo(b, btqg.f149939e);
                askf askf = new askf(accountInfo, askc.m74272b(), this.f89974b);
                atay a = atay.m75352a(askf);
                C1102je a2 = atbg.m75368a(this.f89974b, atbf.PROMOTIONS);
                a2.mo13640e(btqg.f149936b);
                a2.mo13632b(btqg.f149937c);
                if (!btqg.f149948n.isEmpty()) {
                    a2.mo13636c(btqg.f149948n);
                }
                atbg.m75378d(a2, btqg.f149938d);
                atbg.m75379e(a2, btqg.f149942h);
                int i = btqg.f149940f;
                if (i == 0) {
                    atbg.m75372a(this.f89974b, a2);
                } else {
                    a2.f22271w = i;
                }
                atbg.m75373a(this.f89974b, a2, btqg.f149941g);
                if (!btqg.f149950p.isEmpty()) {
                    atbg.m75374a(a2, btqg.f149950p);
                }
                bmtv bmtv = btqg.f149944j;
                if (bmtv == null) {
                    bmtv = bmtv.f130913c;
                }
                bmum bmum = btqg.f149945k;
                if (bmum == null) {
                    bmum = bmum.f130943d;
                }
                atax a3 = a.mo49774a(bmtv, bmum);
                int i2 = a3.f89982c;
                if (i2 != 1) {
                    String str = btqg.f149946l;
                    bxvd da = bpbx.f135635S.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpbx bpbx = (bpbx) da.f164949b;
                    bpbx.f135657c = 58;
                    bpbx.f135655a |= 1;
                    bxvd da2 = bozl.f135386f.mo74144da();
                    if (str != null) {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bozl bozl = (bozl) da2.f164949b;
                        str.getClass();
                        bozl.f135388a |= 4;
                        bozl.f135391d = str;
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpbx bpbx2 = (bpbx) da.f164949b;
                    bozl bozl2 = (bozl) da2.mo74062i();
                    bozl2.getClass();
                    bpbx2.f135677w = bozl2;
                    bpbx2.f135655a |= 8388608;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpbx bpbx3 = (bpbx) da.f164949b;
                    bpbx3.f135657c = 60;
                    bpbx3.f135655a |= 1;
                    bozl bozl3 = bpbx3.f135677w;
                    if (bozl3 == null) {
                        bozl3 = bozl.f135386f;
                    }
                    bxvd bxvd = (bxvd) bozl3.mo74142c(5);
                    bxvd.mo73625a((bxvk) bozl3);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bozl bozl4 = (bozl) bxvd.f164949b;
                    bozl4.f135389b = i2 - 1;
                    bozl4.f135388a |= 1;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpbx bpbx4 = (bpbx) da.f164949b;
                    bozl bozl5 = (bozl) bxvd.mo74062i();
                    bozl5.getClass();
                    bpbx4.f135677w = bozl5;
                    bpbx4.f135655a |= 8388608;
                    new atam(askf).mo49741a((bpbx) da.mo74062i());
                    a2 = null;
                } else {
                    Context context = this.f89974b;
                    a2.mo13631b(m75346a(context, atbe.m75362a(context, accountInfo, btqg.f149946l)));
                    Context context2 = this.f89974b;
                    a2.f22254f = m75346a(context2, atbe.m75363a(context2, accountInfo, btqg.f149946l, a3.f89981b, a3.f89980a));
                    a2.f22258j = btqg.f149947m;
                    a2.mo13627a(btqg.f149949o);
                }
                if (a2 != null && btqg.f149943i) {
                    atbg.m75371a(this.f89974b, "com.google.android.gms.tapandpay.notifications.LocalNotificationManager", a2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo49772a(byte[] bArr) {
        try {
            btqg btqg = (btqg) bxvk.m124016a(btqg.f149933q, bArr, bxus.m123744c());
            if (btqg.f149935a > 0) {
                Context context = this.f89974b;
                Bundle bundle = new Bundle();
                bundle.putByteArray("localNotification", btqg.mo73642k());
                aeat a = aeat.m51532a(context);
                aebi aebi = new aebi();
                long j = (long) btqg.f149935a;
                aebi.mo34004a(j, cgwz.f187949a.mo6606a().mo84660b() + j);
                aebi.f63097i = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
                aebi.f63099k = "local_notification.oneoff";
                aebi.mo34023a(2);
                aebi.mo34027b(0);
                aebi.f63107s = bundle;
                a.mo33984a(aebi.mo33974b());
                return;
            }
            mo49771a(btqg);
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) f89973a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atau", "a", 59, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to parse proto");
        }
    }
}
