package p000;

import com.android.volley.Response;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: akjw */
public final /* synthetic */ class akjw implements Response.Listener {

    /* renamed from: a */
    private final Map f72119a;

    /* renamed from: b */
    private final Response.Listener f72120b;

    public akjw(Map map, Response.Listener listener) {
        this.f72119a = map;
        this.f72120b = listener;
    }

    public final void onResponse(Object obj) {
        Map map = this.f72119a;
        Response.Listener listener = this.f72120b;
        cafc cafc = (cafc) obj;
        ArrayList arrayList = new ArrayList();
        new Object[1][0] = Integer.valueOf(cafc.f172887a.size());
        int i = eoa.f15378a;
        bxwc bxwc = cafc.f172887a;
        int size = bxwc.size();
        for (int i2 = 0; i2 < size; i2++) {
            caet caet = (caet) bxwc.get(i2);
            cafh cafh = caet.f172855b;
            if (cafh == null) {
                cafh = cafh.f172902d;
            }
            String str = cafh.f172905b;
            if (map.containsKey(str)) {
                akkp akkp = (akkp) map.get(str);
                bxvd bxvd = (bxvd) akkp.mo74142c(5);
                bxvd.mo73625a((bxvk) akkp);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                akkp akkp2 = (akkp) bxvd.f164949b;
                akkp akkp3 = akkp.f72169e;
                caet.getClass();
                akkp2.f72174d = caet;
                akkp2.f72171a |= 4;
                arrayList.add((akkp) bxvd.mo74062i());
                map.remove(str);
            }
        }
        arrayList.addAll(map.values());
        listener.onResponse(arrayList);
    }
}
