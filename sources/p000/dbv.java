package p000;

import java.util.HashMap;

/* renamed from: dbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dbv extends daa {

    /* renamed from: a */
    public Long f12752a;

    /* renamed from: b */
    public Long f12753b;

    public dbv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap mo8470a() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f12752a);
        hashMap.put(1, this.f12753b);
        return hashMap;
    }

    public dbv(String str) {
        HashMap a = daa.m8074a(str);
        if (a != null) {
            this.f12752a = (Long) a.get(0);
            this.f12753b = (Long) a.get(1);
        }
    }
}
