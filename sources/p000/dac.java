package p000;

import java.util.HashMap;

/* renamed from: dac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dac extends daa {

    /* renamed from: a */
    public String f12491a;

    /* renamed from: b */
    public long f12492b;

    /* renamed from: c */
    public String f12493c;

    /* renamed from: d */
    public String f12494d;

    /* renamed from: e */
    public String f12495e;

    public dac() {
        this.f12491a = "E";
        this.f12492b = -1;
        this.f12493c = "E";
        this.f12494d = "E";
        this.f12495e = "E";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap mo8470a() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f12491a);
        hashMap.put(4, this.f12495e);
        hashMap.put(3, this.f12494d);
        hashMap.put(2, this.f12493c);
        hashMap.put(1, Long.valueOf(this.f12492b));
        return hashMap;
    }

    public dac(String str) {
        String str2 = "E";
        this.f12491a = str2;
        long j = -1;
        this.f12492b = -1;
        this.f12493c = str2;
        this.f12494d = str2;
        this.f12495e = str2;
        HashMap a = daa.m8074a(str);
        if (a != null) {
            this.f12491a = a.get(0) != null ? (String) a.get(0) : str2;
            this.f12492b = a.get(1) != null ? ((Long) a.get(1)).longValue() : j;
            this.f12493c = a.get(2) != null ? (String) a.get(2) : str2;
            this.f12494d = a.get(3) != null ? (String) a.get(3) : str2;
            this.f12495e = a.get(4) != null ? (String) a.get(4) : str2;
        }
    }
}
