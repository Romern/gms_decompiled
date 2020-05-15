package p000;

import com.google.android.gms.drive.internal.model.File;
import org.json.JSONObject;

/* renamed from: uyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class uyk {

    /* renamed from: a */
    private final boolean f48715a;

    /* renamed from: b */
    public final uvy f48716b;

    /* renamed from: c */
    public final vad f48717c;

    public uyk(uvy uvy, boolean z, vad vad) {
        sdo.m34966a(uvy, "field");
        this.f48716b = uvy;
        this.f48715a = z;
        this.f48717c = vad;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo28102a(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo28099a(ujx ujx, String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo28110a(ujx ujx, String str, Object obj) {
        return mo28099a(ujx, str);
    }

    /* renamed from: a */
    public abstract String mo28107a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo28100a(File file, Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo28104a(JSONObject jSONObject, Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo28101a(ujx ujx, String str, Object obj, long j);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28106a(ujx ujx, ukt ukt, long j) {
    }

    /* renamed from: b */
    public String mo28108b(Object obj) {
        if (this.f48715a) {
            return this.f48716b.mo28084a();
        }
        String valueOf = String.valueOf(this.f48716b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("Field ");
        sb.append(valueOf);
        sb.append(" cannot be read directly from the database.");
        throw new UnsupportedOperationException(sb.toString());
    }

    /* renamed from: b */
    public abstract String mo28105b(Object obj, String str);
}
