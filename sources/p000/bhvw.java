package p000;

import com.google.android.gms.contextmanager.ContextData;
import java.util.concurrent.TimeUnit;

/* renamed from: bhvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhvw extends tjc {

    /* renamed from: a */
    final /* synthetic */ bhwa f119710a;

    public bhvw(bhwa bhwa) {
        this.f119710a = bhwa;
    }

    /* renamed from: a */
    public final void mo9499a(ContextData contextData) {
        int i;
        if (contextData != null) {
            bhwa bhwa = this.f119710a;
            bhss bhss = bhwa.f119720g;
            if (bhss == null) {
                bhuj.m101555a().mo64360b("Got ContextData but callback null");
            } else if (contextData.mo18018g() == bhwa.f119714a) {
                tka j = contextData.mo18022j();
                if (j != null) {
                    i = (int) TimeUnit.MILLISECONDS.toSeconds(j.mo18097d());
                } else {
                    i = 0;
                }
                try {
                    bxlu bxlu = (bxlu) contextData.mo18009a(bxlu.f163892d);
                    if (bxlu != null) {
                        bxwc bxwc = bxlu.f163896b;
                        bvoa[] bvoaArr = (bvoa[]) bxwc.toArray(new bvoa[bxwc.size()]);
                        bxwc bxwc2 = bxlu.f163895a;
                        bvnw[] bvnwArr = (bvnw[]) bxwc2.toArray(new bvnw[bxwc2.size()]);
                        bhuj.m101555a();
                        int length = bvnwArr.length;
                        StringBuilder sb = new StringBuilder(57);
                        sb.append("Got ");
                        sb.append(length);
                        sb.append(" personalized places from Context Manager.");
                        sb.toString();
                        bhwa.mo64349a(bvnwArr, bvoaArr, i, contextData.mo18025m(), bhwa.f119719f, 1);
                        bhwa.f119719f = false;
                        bhss.mo64224a(bvnwArr, bvoaArr);
                        return;
                    }
                    throw new bxwf("Extension not set, or set with invalid bytes");
                } catch (bxwf e) {
                    bhwa.mo64349a(new bvnw[0], new bvoa[0], i, contextData.mo18025m(), bhwa.f119719f, 2);
                    bhuj.m101555a().mo64359a("Failure parsing personalized places proto.", e);
                }
            } else {
                bhwp a = bhuj.m101555a();
                int g = contextData.mo18018g();
                StringBuilder sb2 = new StringBuilder(43);
                sb2.append("Got ContextData with wrong name ");
                sb2.append(g);
                a.mo64360b(sb2.toString());
            }
        } else {
            bhuj.m101555a().mo64360b("Received null ContextData update.");
        }
    }
}
