package p000;

import java.util.HashMap;

/* renamed from: dbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dbi extends daa {

    /* renamed from: a */
    public long f12734a = -1;

    /* renamed from: b */
    public long f12735b = -1;

    public dbi() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap mo8470a() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Long.valueOf(this.f12734a));
        hashMap.put(1, Long.valueOf(this.f12735b));
        return hashMap;
    }

    public dbi(String str) {
        HashMap a = daa.m8074a(str);
        if (a != null) {
            this.f12734a = ((Long) a.get(0)).longValue();
            this.f12735b = ((Long) a.get(1)).longValue();
        }
    }
}
