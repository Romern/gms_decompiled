package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: uaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uaw {

    /* renamed from: a */
    public static final uaw f47070a = new uaw(0, false, true, Collections.emptyList(), null, true);

    /* renamed from: b */
    public final int f47071b;

    /* renamed from: c */
    public final boolean f47072c;

    /* renamed from: d */
    public final boolean f47073d;

    /* renamed from: e */
    public final List f47074e;

    /* renamed from: f */
    public final String f47075f;

    /* renamed from: g */
    public final boolean f47076g;

    public uaw(int i, boolean z, boolean z2, List list, String str, boolean z3) {
        this.f47071b = i;
        this.f47072c = z;
        this.f47073d = z2;
        sdo.m34959a(list);
        this.f47074e = list;
        this.f47075f = str;
        this.f47076g = z3;
    }

    /* renamed from: a */
    public static uaw m37852a(int i, boolean z, boolean z2, String str, String str2, boolean z3) {
        aaal.m21021a(twv.m37575b(i), "Invalid conflict strategy");
        return new uaw(i, z, z2, str == null ? Collections.emptyList() : Collections.singletonList(str), str2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            uaw uaw = (uaw) obj;
            return this.f47071b == uaw.f47071b && this.f47072c == uaw.f47072c && this.f47073d == uaw.f47073d && sdg.m34949a(this.f47074e, uaw.f47074e) && sdg.m34949a(this.f47075f, uaw.f47075f) && this.f47076g == uaw.f47076g;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f47071b), Boolean.valueOf(this.f47072c), Boolean.valueOf(this.f47073d), this.f47074e, this.f47075f, Boolean.valueOf(this.f47076g)});
    }

    /* renamed from: a */
    public static uaw m37853a(JSONObject jSONObject) {
        boolean z;
        int i = jSONObject.has("conflictStrategy") ? jSONObject.getInt("conflictStrategy") : f47070a.f47071b;
        boolean z2 = jSONObject.has("notifyOnCompletion") ? jSONObject.getBoolean("notifyOnCompletion") : f47070a.f47072c;
        if (jSONObject.has("usesDefaultAccount")) {
            z = jSONObject.getBoolean("usesDefaultAccount");
        } else {
            z = vpd.m40996a(jSONObject, "unresolvedAccountName") == null ? f47070a.f47073d : false;
        }
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has("operationTag")) {
            Object obj = jSONObject.get("operationTag");
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    arrayList.add(jSONArray.getString(i2));
                }
            } else {
                arrayList.add(String.valueOf(obj));
            }
        }
        return new uaw(i, z2, z, arrayList, jSONObject.has("binderPackageName") ? jSONObject.getString("binderPackageName") : f47070a.f47075f, jSONObject.has("mustCreateNewRevision") ? jSONObject.getBoolean("mustCreateNewRevision") : f47070a.f47076g);
    }

    /* renamed from: a */
    public final boolean mo27025a() {
        return twv.m37573a(this.f47071b);
    }

    /* renamed from: a */
    public final boolean mo27026a(uaw uaw) {
        return !mo27025a() && !uaw.mo27025a() && this.f47071b == uaw.f47071b && this.f47072c == uaw.f47072c && this.f47073d == uaw.f47073d && sdg.m34949a(this.f47075f, uaw.f47075f) && !this.f47076g;
    }
}
