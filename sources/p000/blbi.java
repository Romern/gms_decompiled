package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: blbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blbi {

    /* renamed from: a */
    public int f125826a;

    /* renamed from: b */
    public final C1246ol f125827b;

    public blbi() {
        this.f125826a = 0;
        this.f125827b = new C1246ol();
    }

    /* renamed from: a */
    public final JSONObject mo66445a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("size", this.f125826a);
        JSONObject jSONObject2 = new JSONObject();
        for (int i = 0; i < this.f125827b.mo15640c(); i++) {
            JSONArray jSONArray = new JSONArray();
            for (blbh blbh : (List) this.f125827b.mo15641c(i)) {
                jSONArray.put(blbh.mo66441a());
            }
            jSONObject2.putOpt(Integer.toString(this.f125827b.mo15638b(i)), jSONArray);
        }
        jSONObject.put("map", jSONObject2);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof blbi) {
            blbi blbi = (blbi) obj;
            if (blbi.f125826a == this.f125826a) {
                for (int i = 0; i < this.f125827b.mo15640c(); i++) {
                    if (!((List) this.f125827b.mo15641c(i)).equals(blbi.f125827b.mo15646f(this.f125827b.mo15638b(i)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f125826a;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.f125827b.mo15640c(); i2++) {
            arrayList.add(Integer.valueOf(this.f125827b.mo15638b(i2)));
        }
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) arrayList.get(i3);
            i = (((i * 37) + num.intValue()) * 37) + ((List) this.f125827b.mo15646f(num.intValue())).hashCode();
        }
        return i;
    }

    public final String toString() {
        try {
            return mo66445a().toString();
        } catch (JSONException e) {
            return super.toString();
        }
    }

    public blbi(blbi blbi) {
        this.f125826a = 0;
        C1246ol a = blbi.f125827b.clone();
        bmxy.m108581a(a);
        this.f125827b = a;
        this.f125826a = blbi.f125826a;
    }

    public blbi(JSONObject jSONObject) {
        this.f125826a = 0;
        this.f125827b = new C1246ol();
        JSONObject jSONObject2 = jSONObject.getJSONObject("map");
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            ArrayList arrayList = new ArrayList();
            String next = keys.next();
            Integer valueOf = Integer.valueOf(Integer.parseInt(next));
            JSONArray jSONArray = jSONObject2.getJSONArray(next);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(new blbh(jSONArray.getJSONObject(i)));
            }
            this.f125827b.mo15637a(valueOf.intValue(), arrayList);
        }
        this.f125826a = jSONObject.getInt("size");
    }
}
