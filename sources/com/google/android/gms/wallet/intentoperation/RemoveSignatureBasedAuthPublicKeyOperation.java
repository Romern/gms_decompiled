package com.google.android.gms.wallet.intentoperation;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RemoveSignatureBasedAuthPublicKeyOperation extends IntentOperation {

    /* renamed from: a */
    private awwo f110262a;

    public final void onCreate() {
        this.f110262a = new awwo(getApplicationContext());
    }

    public final void onHandleIntent(Intent intent) {
        try {
            BuyFlowConfig buyFlowConfig = (BuyFlowConfig) sef.m35067a(intent, "com.google.android.gms.wallet.buyFlowConfig", BuyFlowConfig.CREATOR);
            int a = bmce.m107889a(intent.getIntExtra("EXTRA_AUTHENTICATOR", 0));
            ApplicationParameters applicationParameters = buyFlowConfig.f110418b;
            int i = applicationParameters.f110406a;
            Account account = applicationParameters.f110407b;
            byah a2 = this.f110262a.mo52680a(i, account);
            if (a2 != null) {
                bxvd bxvd = (bxvd) a2.mo74142c(5);
                bxvd.mo73625a((bxvk) a2);
                byae byae = (byae) bxvd;
                ArrayList arrayList = new ArrayList();
                for (bmcv bmcv : Collections.unmodifiableList(((byah) byae.f164949b).f165263f)) {
                    int a3 = bmce.m107889a(bmcv.f128756e);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    if (a3 != a) {
                        arrayList.add(bmcv);
                    }
                }
                if (byae.f164950c) {
                    byae.mo74035c();
                    byae.f164950c = false;
                }
                ((byah) byae.f164949b).f165263f = bxvk.m124030de();
                byae.mo74339a(arrayList);
                this.f110262a.mo52681a(i, account, (byah) byae.mo74062i());
            }
            awfr.m79859a(getApplicationContext(), buyFlowConfig).mo52109d(a);
        } catch (Exception e) {
            awye.m81493a(getApplicationContext(), e);
        }
    }
}
