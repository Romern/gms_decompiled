package p000;

import com.google.android.gms.drive.internal.model.File;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: uwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class uwk extends uxw {
    public uwk(uvu uvu, vad vad) {
        super(uvu, true, vad);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28102a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(this.f48716b.mo28084a());
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ String mo28105b(Object obj, String str) {
        Collection collection = (Collection) obj;
        throw new UnsupportedOperationException("Cannot query Drive API v2 for a collection of items.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28099a(ujx ujx, String str) {
        return ujx.mo27541S();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo28103a(Object obj, String str) {
        return vpw.m41037b((String) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28100a(File file, Object obj) {
        Collection collection = (Collection) obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28104a(JSONObject jSONObject, Object obj) {
        jSONObject.put(this.f48716b.mo28084a(), new JSONArray((Collection) obj));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28101a(ujx ujx, String str, Object obj, long j) {
        Collection collection = (Collection) obj;
    }
}
