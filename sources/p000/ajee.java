package p000;

import android.content.Context;
import android.os.Bundle;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: ajee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajee {

    /* renamed from: a */
    public final ajbn f70417a;

    /* renamed from: b */
    public final aiwq f70418b;

    public ajee(Context context) {
        this.f70417a = (ajbn) ahgz.m55754a(context, ajbn.class);
        this.f70418b = (aiwq) ahgz.m55754a(context, aiwq.class);
    }

    /* renamed from: a */
    private final bzbz m58588a(Bundle bundle) {
        String string = bundle.getString("PUSH_MESSAGE");
        if (string == null) {
            return null;
        }
        try {
            return (bzbz) bxvk.m124014a(bzbz.f169283c, sqd.m35971c(string));
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ajee", "a", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("%s", "GcmHandler: ");
            return null;
        }
    }

    /* renamed from: a */
    private final void m58589a(bzbz bzbz) {
        srn srn = ahfq.f67120a;
        if ((bzbz.f169285a & 4) != 0) {
            bzca bzca = bzbz.f169286b;
            if (bzca == null) {
                bzca = bzca.f169288c;
            }
            int size = bzca.f169291b.size();
            bzca.f169290a.size();
            if (size > 0) {
                for (int i = 0; i < bzca.f169291b.size(); i++) {
                    ajbn ajbn = this.f70417a;
                    byzr byzr = (byzr) bzca.f169291b.get(i);
                    bxvd bxvd = (bxvd) byzr.mo74142c(5);
                    bxvd.mo73625a((bxvk) byzr);
                    ajbn.mo38449a((bxvf) bxvd);
                }
                return;
            }
            return;
        }
        bnsl bnsl = (bnsl) ahfq.f67120a.mo68388c();
        bnsl.mo68432a("ajee", "a", 92, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Ignoring empty push message");
    }
}
