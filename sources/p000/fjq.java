package p000;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: fjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fjq extends fix {

    /* renamed from: a */
    public String f16744a;

    /* renamed from: b */
    public int f16745b;

    /* renamed from: c */
    public int f16746c;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10877a(fix fix) {
        fjq fjq = (fjq) fix;
        int i = this.f16745b;
        if (i != 0) {
            fjq.f16745b = i;
        }
        int i2 = this.f16746c;
        if (i2 != 0) {
            fjq.f16746c = i2;
        }
        if (!TextUtils.isEmpty(this.f16744a)) {
            fjq.f16744a = this.f16744a;
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("language", this.f16744a);
        hashMap.put("screenColors", 0);
        hashMap.put("screenWidth", Integer.valueOf(this.f16745b));
        hashMap.put("screenHeight", Integer.valueOf(this.f16746c));
        hashMap.put("viewportWidth", 0);
        hashMap.put("viewportHeight", 0);
        return fix.m11795a(hashMap);
    }
}
