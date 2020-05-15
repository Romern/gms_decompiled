package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: bkab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkab {

    /* renamed from: a */
    public final /* synthetic */ bkaf f123721a;

    public bkab(bkaf bkaf) {
        this.f123721a = bkaf;
    }

    /* renamed from: a */
    public final void mo65686a(JSONObject jSONObject) {
        this.f123721a.mo65708b(false);
        bkaf bkaf = this.f123721a;
        int a = bjtl.m104564a(jSONObject);
        String a2 = bjtv.m104615a(a);
        if (a != 0) {
            bkaf.f123750N = bkaf.m105041a(a2, bkaf.f123750N, jSONObject);
            if (bkaf.f123749M != null) {
                for (int i = 0; i < bkaf.f123749M.size(); i++) {
                    ArrayList arrayList = bkaf.f123749M;
                    arrayList.set(i, bkaf.m105041a(a2, (btwp) arrayList.get(i), jSONObject));
                }
            }
        }
        String e = bjtl.m104583e(jSONObject);
        if (!TextUtils.isEmpty(e) && !TextUtils.isEmpty(a2)) {
            btwp btwp = bkaf.f123750N;
            if (btwp == null) {
                bkaf.f123750N = bkaf.m105040a(bkaf.mo65710c());
                btwp btwp2 = bkaf.f123750N;
                bxvd bxvd = (bxvd) btwp2.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) btwp2);
                btwo btwo = (btwo) bxvd;
                if (btwo.f164950c) {
                    btwo.mo74035c();
                    btwo.f164950c = false;
                }
                btwp btwp3 = (btwp) btwo.f164949b;
                btwp btwp4 = btwp.f152728s;
                e.getClass();
                int i2 = btwp3.f152730a | 2048;
                btwp3.f152730a = i2;
                btwp3.f152740k = e;
                a2.getClass();
                btwp3.f152730a = i2 | 1;
                btwp3.f152731b = a2;
                bkaf.f123750N = (btwp) btwo.mo74062i();
            } else if (btwp.f152740k.isEmpty() && (a2.equalsIgnoreCase(bkaf.f123750N.f152731b) || TextUtils.isEmpty(bkaf.f123750N.f152731b))) {
                btwp btwp5 = bkaf.f123750N;
                bxvd bxvd2 = (bxvd) btwp5.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) btwp5);
                btwo btwo2 = (btwo) bxvd2;
                if (btwo2.f164950c) {
                    btwo2.mo74035c();
                    btwo2.f164950c = false;
                }
                btwp btwp6 = (btwp) btwo2.f164949b;
                e.getClass();
                btwp6.f152730a |= 2048;
                btwp6.f152740k = e;
                bkaf.f123750N = (btwp) btwo2.mo74062i();
            }
        }
        bkaf.mo65703a(jSONObject);
    }
}
