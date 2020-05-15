package p000;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cxg implements assh {
    /* renamed from: a */
    private static final cvj m7824a(cyx cyx) {
        if (cyx.mo8443c("CRT constant p factor p") == null || cyx.mo8443c("CRT constant p factor q") == null || cyx.mo8443c("CRT constant dmodp-1") == null || cyx.mo8443c("CRT constant dmodq-1") == null || cyx.mo8443c("CRT constant q-1modp") == null) {
            return null;
        }
        return new cvj(cvz.m7720b(cyx.mo8443c("CRT constant p factor p")), cvz.m7720b(cyx.mo8443c("CRT constant p factor q")), cvz.m7720b(cyx.mo8443c("CRT constant dmodp-1")), cvz.m7720b(cyx.mo8443c("CRT constant dmodq-1")), cvz.m7720b(cyx.mo8443c("CRT constant q-1modp")));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ asrx mo3414a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONObject jSONObject3 = jSONObject.getJSONObject("profiles");
            JSONObject[] jSONObjectArr = {jSONObject, jSONObject2};
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject3.keys();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                hashMap.put(obj.toUpperCase(), jSONObject3.getJSONObject(obj));
            }
            for (int i = 0; i < 2; i++) {
                cyx.m7945a(linkedHashMap, jSONObjectArr[i]);
            }
            cyx.m7945a(linkedHashMap, (JSONObject) hashMap.get("BF50"));
            cyx.m7945a(linkedHashMap, (JSONObject) hashMap.get("BF51"));
            JSONArray jSONArray = (JSONArray) linkedHashMap.get("Applications");
            Map map = cxh.f12370c;
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i2);
                arrayList.add(new cvp(jSONObject4.getString("AID"), cve.m7664a(cve.m7668a(cvz.m7720b(jSONObject4.getString("FCI"))), cuw.FCI_TEMPLATE), (cvn) map.get(jSONObject4.getString("Behavior")), i2));
            }
            return new cyx(linkedHashMap, hashMap, Collections.unmodifiableList(arrayList));
        } catch (IOException | JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ asry mo3415a(asrx asrx, JSONObject jSONObject, byte[] bArr, asrz asrz, Set set) {
        cyx cyx = (cyx) asrx;
        if (asrz.mo49426b()) {
            return new cxe(new cys(cyx, cyu.m7942a(jSONObject), m7824a(cyx)), new cwg(bArr, asrz));
        }
        throw new assg();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ assc mo3416a(asrx asrx, JSONObject jSONObject, byte[] bArr, asse asse, asrz asrz) {
        cyx cyx = (cyx) asrx;
        cys cys = new cys(cyx, cyu.m7942a(jSONObject), m7824a(cyx));
        int i = (int) asse.f89557a;
        cvx.m7698b(cys.f12409b.f12420d == null, "credential and its CAVV key cannot be null");
        int parseInt = Integer.parseInt(cys.mo8430c().substring(0, 2));
        int parseInt2 = Integer.parseInt(cwd.m7748a(cys.mo8430c().substring(2), 2));
        byte b = cvz.m7720b(cys.f12408a.mo8439a("CAVV_Key_Indicator"))[0];
        String c = cwd.m7754c(String.valueOf(i), 4);
        String c2 = cwd.m7754c(String.valueOf(i), 8);
        byte[] bArr2 = {b};
        String a = cys.mo8424a(6);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMdd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date());
        String c3 = cwd.m7754c(String.valueOf(i), 4);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + String.valueOf(format).length() + String.valueOf(c3).length());
        sb.append(a);
        sb.append(format);
        sb.append(c3);
        return new cyt(parseInt, parseInt2, cvz.m7722b(cys.mo8435h(), bArr2, cvz.m7728d(cys.mo8425a(c)), cvz.m7728d(c), cvz.m7728d(sb.toString()), c2, new byte[]{0}), cys.mo8428b(), cys.mo8423a());
    }
}
