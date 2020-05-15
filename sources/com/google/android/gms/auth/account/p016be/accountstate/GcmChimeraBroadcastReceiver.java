package com.google.android.gms.auth.account.p016be.accountstate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.BroadcastReceiver;
import java.util.Map;

/* renamed from: com.google.android.gms.auth.account.be.accountstate.GcmChimeraBroadcastReceiver */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: c */
    private static final sek f9990c = ght.m13171a("GcmChimeraBroadcastReceiver");

    /* renamed from: d */
    private static final imk f9991d = glb.f18454a;

    /* renamed from: b */
    private final Map f9992b = bnhe.m109409a("ACCOUNT_SYNC_ACTION", Boolean.valueOf(ccar.m129159b()), "CREDENTIAL_SYNC_ACTION", Boolean.valueOf(ccar.m129160c()));

    public final void onReceive(Context context, Intent intent) {
        imk imk;
        String str;
        bxvd da = bofx.f132950d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bofx bofx = (bofx) da.f164949b;
        bofx.f132953b = 1;
        bofx.f132952a |= 1;
        try {
            String stringExtra = intent.getStringExtra("EXTRA_ACTION");
            if (stringExtra == null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bofx bofx2 = (bofx) da.f164949b;
                bofx2.f132954c = 4;
                bofx2.f132952a |= 2;
                imk = f9991d;
            } else if (!this.f9992b.containsKey(stringExtra)) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bofx bofx3 = (bofx) da.f164949b;
                bofx3.f132954c = 5;
                bofx3.f132952a |= 2;
                imk = f9991d;
            } else if (((Boolean) this.f9992b.get(stringExtra)).booleanValue()) {
                String stringExtra2 = intent.getStringExtra("EXTRA_GAIA_ID");
                if (stringExtra2 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("EXTRA_GAIA_ID", stringExtra2);
                    bundle.putString("EXTRA_ACTION", stringExtra);
                    aeat a = aeat.m51532a(context);
                    aebi aebi = new aebi();
                    aebi.f63097i = "com.google.android.gms.auth.account.be.accountstate.GcmTaskService";
                    byte[] a2 = spn.m35862a(stringExtra2, "SHA-256");
                    if (a2 == null) {
                        str = "";
                    } else {
                        str = srv.m36160a(a2);
                    }
                    String str2 = str.length() == 0 ? new String(stringExtra) : stringExtra.concat(str);
                    if (str2.length() > 100) {
                        str2 = str2.substring(0, 100);
                    }
                    aebi.f63099k = str2;
                    aebi.mo34027b(1);
                    aebi.mo34023a(0);
                    aebi.f63107s = bundle;
                    aebi.mo34004a(0, ccar.f178695a.mo6606a().mo75730d());
                    a.mo33984a(aebi.mo33974b());
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bofx bofx4 = (bofx) da.f164949b;
                    bofx4.f132954c = 1;
                    bofx4.f132952a |= 2;
                    imk = f9991d;
                } else {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bofx bofx5 = (bofx) da.f164949b;
                    bofx5.f132954c = 2;
                    bofx5.f132952a |= 2;
                    imk = f9991d;
                }
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bofx bofx6 = (bofx) da.f164949b;
                bofx6.f132954c = 8;
                bofx6.f132952a |= 2;
                imk = f9991d;
            }
            ((glf) imk.mo12005a(context)).mo12006a(f9990c, (bofx) da.mo74062i());
        } catch (Throwable th) {
            ((glf) f9991d.mo12005a(context)).mo12006a(f9990c, (bofx) da.mo74062i());
            throw th;
        }
    }
}
