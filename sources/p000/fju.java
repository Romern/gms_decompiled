package p000;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: fju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fju extends fix {

    /* renamed from: a */
    public String f16750a;

    /* renamed from: b */
    public String f16751b;

    /* renamed from: c */
    public String f16752c;

    /* renamed from: d */
    public String f16753d;

    /* renamed from: e */
    public boolean f16754e;

    /* renamed from: f */
    public boolean f16755f;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10877a(fix fix) {
        fju fju = (fju) fix;
        if (!TextUtils.isEmpty(this.f16750a)) {
            fju.f16750a = this.f16750a;
        }
        if (!TextUtils.isEmpty(this.f16751b)) {
            fju.f16751b = this.f16751b;
        }
        if (!TextUtils.isEmpty(this.f16752c)) {
            fju.f16752c = this.f16752c;
        }
        if (!TextUtils.isEmpty(this.f16753d)) {
            fju.f16753d = this.f16753d;
        }
        if (this.f16754e) {
            fju.f16754e = true;
        }
        TextUtils.isEmpty(null);
        if (this.f16755f) {
            fju.f16755f = true;
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("hitType", this.f16750a);
        hashMap.put("clientId", this.f16751b);
        hashMap.put("userId", this.f16752c);
        hashMap.put("androidAdId", this.f16753d);
        hashMap.put("AdTargetingEnabled", Boolean.valueOf(this.f16754e));
        hashMap.put("sessionControl", null);
        hashMap.put("nonInteraction", Boolean.valueOf(this.f16755f));
        hashMap.put("sampleRate", Double.valueOf(0.0d));
        return fix.m11795a(hashMap);
    }
}
