package p000;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: cxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cxt {

    /* renamed from: a */
    public static final cvq f12380a = new cxs(cur.class);

    /* renamed from: b */
    public static final cyi f12381b = new cyi();

    /* renamed from: a */
    public static final boolean m7848a(cyp cyp, String str) {
        cyx cyx = cyp.f12399b.f12408a;
        ArrayList arrayList = new ArrayList();
        if (cyx.f12423a.containsKey("ApplicationBlocked") && cyx.f12423a.get("ApplicationBlocked") != null) {
            JSONArray jSONArray = (JSONArray) cyx.f12423a.get("ApplicationBlocked");
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    arrayList.add(jSONArray.getString(i));
                    i++;
                } catch (JSONException e) {
                    throw new cvk(e);
                }
            }
        }
        return arrayList.contains(str);
    }
}
