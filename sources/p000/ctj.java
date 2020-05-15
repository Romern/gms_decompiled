package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: ctj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ctj {

    /* renamed from: a */
    public final String f12014a;

    /* renamed from: b */
    public final ctm f12015b;

    /* renamed from: c */
    public final List f12016c;

    /* renamed from: d */
    public final int f12017d;

    /* renamed from: e */
    public final ctk f12018e;

    public ctj(String str, ctm ctm, List list, ctk ctk, int i) {
        czl.m8004b(false, "card profile cannot be null");
        this.f12016c = list;
        this.f12015b = ctm;
        this.f12018e = ctk;
        this.f12014a = str;
        this.f12017d = i;
    }

    /* renamed from: a */
    public static int m7549a(List list) {
        int i;
        if (!list.isEmpty()) {
            i = ((ctp) Collections.max(list, ctp.m7577a())).mo8289b();
        } else {
            i = Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() != Integer.MAX_VALUE) {
            return valueOf.intValue() + 1;
        }
        return 0;
    }

    /* renamed from: b */
    public final ctj mo8261b(List list) {
        return new ctj(this.f12014a, this.f12015b, Collections.unmodifiableList(list), this.f12018e, this.f12017d);
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ctj ctj = (ctj) obj;
            if (this.f12017d == ctj.f12017d && ((str = this.f12014a) == null ? ctj.f12014a == null : str.equals(ctj.f12014a)) && this.f12015b.equals(ctj.f12015b)) {
                List list = this.f12016c;
                if (list == null ? ctj.f12016c == null : list.equals(ctj.f12016c)) {
                    return this.f12018e.equals(ctj.f12018e);
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.f12014a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode = ((i * 31) + this.f12015b.hashCode()) * 31;
        List list = this.f12016c;
        if (list != null) {
            i2 = list.hashCode();
        }
        return ((((hashCode + i2) * 31) + this.f12017d) * 31) + this.f12018e.hashCode();
    }

    /* renamed from: b */
    public final byte[] mo8262b() {
        return czm.m8020b(mo8260a());
    }

    /* renamed from: a */
    public static ctj m7550a(byte[] bArr) {
        JSONObject jSONObject = (JSONObject) new JSONTokener(czm.m8009a(bArr)).nextValue();
        String optString = jSONObject.optString("tokenRefId", null);
        ctm ctm = new ctm(jSONObject.getJSONObject("ProfileData"));
        List a = m7552a(jSONObject);
        return new ctj(optString, ctm, a, new ctk(jSONObject.getJSONObject("constraints")), jSONObject.optInt("nextAtc", m7549a(a)));
    }

    /* renamed from: a */
    public static List m7551a(List list, int i) {
        HashSet hashSet = new HashSet(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ctp ctp = (ctp) it.next();
            Integer valueOf = Integer.valueOf(ctp.mo8289b());
            if (!hashSet.contains(valueOf) && valueOf.intValue() >= i) {
                hashSet.add(valueOf);
                arrayList.add(ctp);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List m7552a(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("otpks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new ctp(jSONArray.optJSONObject(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final String mo8260a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tokenRefId", this.f12014a);
        jSONObject.put("ProfileData", new JSONObject(this.f12015b.f12027a));
        List<ctp> list = this.f12016c;
        JSONArray jSONArray = new JSONArray();
        for (ctp ctp : list) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("atc", ctp.f12030a);
            jSONObject2.put("ct_emv", ctp.f12032c);
            jSONObject2.put("ct_ms", ctp.f12031b);
            jSONObject2.put("ct_cavv", ctp.f12033d);
            jSONObject2.put("track_data_hash", ctp.f12034e);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("otpks", jSONArray);
        ctk ctk = this.f12018e;
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("hardExpirationTimestamp", ctk.f12021c);
        jSONObject3.put("softExpirationTimestamp", ctk.f12020b);
        jSONObject3.put("lowCredentialsThreshold", ctk.f12019a);
        jSONObject.put("constraints", jSONObject3);
        jSONObject.put("nextAtc", this.f12017d);
        return jSONObject.toString();
    }
}
