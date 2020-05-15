package p000;

import org.json.JSONObject;

/* renamed from: uyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class uyi extends uyk {
    public uyi(uvy uvy, vad vad) {
        super(uvy, true, vad);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28102a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.getLong(this.f48716b.mo28084a()));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ String mo28105b(Object obj, String str) {
        return Long.toString(((Long) obj).longValue());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo28107a(Object obj) {
        return Long.toString(((Long) obj).longValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28104a(JSONObject jSONObject, Object obj) {
        jSONObject.put(this.f48716b.mo28084a(), (Long) obj);
    }
}
