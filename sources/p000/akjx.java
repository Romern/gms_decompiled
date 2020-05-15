package p000;

import com.android.volley.Response;
import java.util.List;
import java.util.Map;

/* renamed from: akjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akjx implements Response.Listener {

    /* renamed from: a */
    final /* synthetic */ Map f72121a;

    /* renamed from: b */
    final /* synthetic */ Response.Listener f72122b;

    /* renamed from: c */
    final /* synthetic */ List f72123c;

    public akjx(Map map, Response.Listener listener, List list) {
        this.f72121a = map;
        this.f72122b = listener;
        this.f72123c = list;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        cafc cafc = (cafc) obj;
        new Object[1][0] = Integer.valueOf(cafc.f172887a.size());
        int i = eoa.f15378a;
        for (int i2 = 0; i2 < cafc.f172887a.size(); i2++) {
            caet caet = (caet) cafc.f172887a.get(i2);
            cafh cafh = caet.f172855b;
            if (cafh == null) {
                cafh = cafh.f172902d;
            }
            akkp akkp = (akkp) this.f72121a.get(cafh.f172905b);
            bxvd bxvd = (bxvd) akkp.mo74142c(5);
            bxvd.mo73625a((bxvk) akkp);
            if (bxvd != null) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                akkp akkp2 = (akkp) bxvd.f164949b;
                akkp akkp3 = akkp.f72169e;
                caet.getClass();
                akkp2.f72174d = caet;
                akkp2.f72171a |= 4;
            }
        }
        this.f72122b.onResponse(this.f72123c);
    }
}
