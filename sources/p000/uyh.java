package p000;

import com.google.android.gms.drive.internal.model.File;
import org.json.JSONObject;

/* renamed from: uyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uyh extends uyk {
    public uyh(uvy uvy) {
        super(uvy, false, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28102a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.getInt(this.f48716b.mo28084a()));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ String mo28105b(Object obj, String str) {
        return Integer.toString(((Integer) obj).intValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28099a(ujx ujx, String str) {
        int i;
        if (ujx.f47825a.f47906ai != null) {
            i = 1;
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo28107a(Object obj) {
        return Integer.toString(((Integer) obj).intValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28100a(File file, Object obj) {
        Integer num = (Integer) obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28104a(JSONObject jSONObject, Object obj) {
        jSONObject.put(this.f48716b.mo28084a(), (Integer) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28101a(ujx ujx, String str, Object obj, long j) {
        Integer num = (Integer) obj;
    }
}
