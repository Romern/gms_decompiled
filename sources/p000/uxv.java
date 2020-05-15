package p000;

import org.json.JSONObject;

/* renamed from: uxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class uxv extends uyk {
    public uxv(uvy uvy, boolean z, vad vad) {
        super(uvy, z, vad);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28102a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.getBoolean(this.f48716b.mo28084a()));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ String mo28105b(Object obj, String str) {
        return ((Boolean) obj).toString();
    }

    /* renamed from: a */
    public String mo28107a(Boolean bool) {
        return !bool.booleanValue() ? "0" : "1";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28104a(JSONObject jSONObject, Object obj) {
        jSONObject.put(this.f48716b.mo28084a(), (Boolean) obj);
    }
}
