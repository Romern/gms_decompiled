package p000;

import com.google.android.gms.drive.internal.model.File;
import com.google.android.gms.drive.internal.model.Property;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.CustomProperty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: uxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uxy extends uyk {

    /* renamed from: a */
    public static final String f48707a = String.format(Locale.US, "'%s'", "PUBLIC");

    static {
        Locale locale = Locale.US;
        new Object[1][0] = "PRIVATE";
    }

    public uxy() {
        super(uzm.f48736L, false, vae.f48822q);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28102a(JSONObject jSONObject) {
        uyp uyp = new uyp();
        JSONArray jSONArray = jSONObject.getJSONArray(this.f48716b.mo28084a());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            uyp.mo28112a(new CustomPropertyKey(jSONObject2.getString("key"), jSONObject2.getInt("visibility")), !jSONObject2.isNull("value") ? jSONObject2.getString("value") : null);
        }
        return uyp.mo28111a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ String mo28105b(Object obj, String str) {
        boolean z;
        Iterator it = ((AppVisibleCustomProperties) obj).iterator();
        CustomProperty customProperty = (CustomProperty) it.next();
        sdo.m34975b(!it.hasNext(), "value should have only 1 element");
        if (customProperty.f31069b != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Custom property value may not be null.");
        ArrayList arrayList = new ArrayList();
        arrayList.add(uzs.m39854c("key", vpw.m41037b(customProperty.f31068a.f31064a)));
        arrayList.add(uzs.m39854c("value", vpw.m41037b(customProperty.f31069b)));
        if (customProperty.f31068a.f31065b == 1) {
            arrayList.add(uzs.m39854c("app_id", vpw.m41037b(str)));
        } else {
            arrayList.add(uzs.m39854c("visibility", f48707a));
        }
        return uzs.m39852a(arrayList).f48779b;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ujx.a(java.lang.String, boolean):java.util.List
     arg types: [java.lang.String, int]
     candidates:
      ujx.a(boolean, boolean):void
      ujx.a(java.lang.String, java.lang.String):uot
      ujx.a(boolean, long):void
      ujx.a(java.lang.String, boolean):java.util.List */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28099a(ujx ujx, String str) {
        List a = ujx.mo27550a(str, false);
        uyp uyp = new uyp();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            uot uot = (uot) a.get(i);
            uyp.mo28114a(new CustomProperty(new CustomPropertyKey(uot.mo27784d(), uot.mo27788h() ^ true ? 1 : 0), uot.mo27785e()));
        }
        return uyp.mo28111a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28110a(ujx ujx, String str, Object obj) {
        uyp uyp = new uyp();
        Map a = ((AppVisibleCustomProperties) mo28099a(ujx, str)).mo18261a();
        Iterator it = ((AppVisibleCustomProperties) obj).iterator();
        while (it.hasNext()) {
            CustomPropertyKey customPropertyKey = ((CustomProperty) it.next()).f31068a;
            if (a.containsKey(customPropertyKey)) {
                uyp.mo28112a(customPropertyKey, (String) a.get(customPropertyKey));
            } else {
                uyp.mo28112a(customPropertyKey, null);
            }
        }
        return uyp.mo28111a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo28107a(Object obj) {
        AppVisibleCustomProperties appVisibleCustomProperties = (AppVisibleCustomProperties) obj;
        throw new UnsupportedOperationException("Cannot convert Custom Properties directly to a database value.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28100a(File file, Object obj) {
        String str;
        AppVisibleCustomProperties appVisibleCustomProperties = (AppVisibleCustomProperties) obj;
        ArrayList arrayList = new ArrayList(appVisibleCustomProperties.f31067b.size());
        Iterator it = appVisibleCustomProperties.iterator();
        while (it.hasNext()) {
            CustomProperty customProperty = (CustomProperty) it.next();
            Property property = new Property();
            property.f31050c = customProperty.f31068a.f31064a;
            property.f31048a.add(4);
            if (customProperty.f31068a.f31065b != 0) {
                str = "PRIVATE";
            } else {
                str = "PUBLIC";
            }
            property.f31052e = str;
            property.f31048a.add(8);
            property.f31051d = customProperty.f31069b;
            property.f31048a.add(7);
            arrayList.add(property);
        }
        file.f30966I = arrayList;
        file.f30983a.add(54);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28104a(JSONObject jSONObject, Object obj) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = ((AppVisibleCustomProperties) obj).iterator();
        while (it.hasNext()) {
            CustomProperty customProperty = (CustomProperty) it.next();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("key", customProperty.f31068a.f31064a);
            jSONObject2.put("visibility", customProperty.f31068a.f31065b);
            Object obj2 = customProperty.f31069b;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject2.put("value", obj2);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put(this.f48716b.mo28084a(), jSONArray);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28101a(ujx ujx, String str, Object obj, long j) {
        String str2;
        Iterator it = ((AppVisibleCustomProperties) obj).iterator();
        while (it.hasNext()) {
            CustomProperty customProperty = (CustomProperty) it.next();
            CustomPropertyKey customPropertyKey = customProperty.f31068a;
            if (customPropertyKey.f31065b == 1) {
                str2 = str;
            } else {
                str2 = null;
            }
            ujx.mo27552a(customPropertyKey.f31064a, str2).mo27783a(customProperty.f31069b, Long.valueOf(j));
        }
    }
}
