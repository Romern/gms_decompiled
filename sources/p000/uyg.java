package p000;

import java.util.Date;
import org.json.JSONObject;

/* renamed from: uyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class uyg extends uyk {
    public uyg(uvy uvy, vad vad) {
        super(uvy, true, vad);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28102a(JSONObject jSONObject) {
        return new Date(jSONObject.getLong(this.f48716b.mo28084a()));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ String mo28105b(Object obj, String str) {
        String a = uhc.m38503a((Date) obj);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2);
        sb.append("'");
        sb.append(a);
        sb.append("'");
        return sb.toString();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo28107a(Object obj) {
        return Long.toString(((Date) obj).getTime());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28104a(JSONObject jSONObject, Object obj) {
        jSONObject.put(this.f48716b.mo28084a(), ((Date) obj).getTime());
    }
}
