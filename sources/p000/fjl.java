package p000;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: fjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fjl extends fix {

    /* renamed from: a */
    public String f16727a;

    /* renamed from: b */
    public String f16728b;

    /* renamed from: c */
    public String f16729c;

    /* renamed from: d */
    public String f16730d;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.f16727a);
        hashMap.put("appVersion", this.f16728b);
        hashMap.put("appId", this.f16729c);
        hashMap.put("appInstallerId", this.f16730d);
        return fix.m11795a(hashMap);
    }

    /* renamed from: a */
    public final void mo10877a(fjl fjl) {
        if (!TextUtils.isEmpty(this.f16727a)) {
            fjl.f16727a = this.f16727a;
        }
        if (!TextUtils.isEmpty(this.f16728b)) {
            fjl.f16728b = this.f16728b;
        }
        if (!TextUtils.isEmpty(this.f16729c)) {
            fjl.f16729c = this.f16729c;
        }
        if (!TextUtils.isEmpty(this.f16730d)) {
            fjl.f16730d = this.f16730d;
        }
    }
}
