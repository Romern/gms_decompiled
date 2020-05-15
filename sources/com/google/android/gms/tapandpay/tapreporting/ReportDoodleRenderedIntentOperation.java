package com.google.android.gms.tapandpay.tapreporting;

import android.content.Intent;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReportDoodleRenderedIntentOperation extends asjx {

    /* renamed from: a */
    private static final srn f108735a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public final void mo49205a(Intent intent) {
        AccountInfo accountInfo = (AccountInfo) intent.getParcelableExtra("accountName");
        if (accountInfo != null && intent.hasExtra("doodle_rendered_info")) {
            try {
                btpj btpj = (btpj) bxvk.m124016a(btpj.f149850c, intent.getByteArrayExtra("doodle_rendered_info"), bxus.m123744c());
                String b = askc.m74272b();
                try {
                    atoo.m76235a(new askf(accountInfo, b, this), btpj);
                } catch (atfh | IOException e) {
                    try {
                        atmw.m76192a(this, btpj, accountInfo.f108326b, b, "DoodleRenderedInfos");
                        UploadDoodleRenderedInfosTaskOperation.m93186b(this);
                    } catch (asks e2) {
                        bnsl bnsl = (bnsl) f108735a.mo68388c();
                        bnsl.mo68437a(e2);
                        bnsl.mo68405a("Error persisting doodle rendered info");
                    }
                }
            } catch (bxwf e3) {
            }
        }
    }
}
