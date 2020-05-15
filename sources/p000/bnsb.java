package p000;

/* renamed from: bnsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnsb extends bnsc {

    /* renamed from: b */
    private final String f132062b;

    /* renamed from: c */
    private final String f132063c;

    /* renamed from: d */
    private final int f132064d;

    /* renamed from: e */
    private final String f132065e;

    /* renamed from: f */
    private int f132066f = 0;

    public bnsb(String str, String str2, int i, String str3) {
        bnuy.m110474a(str, "class name");
        this.f132062b = str;
        bnuy.m110474a(str2, "method name");
        this.f132063c = str2;
        this.f132064d = i;
        this.f132065e = str3;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* renamed from: a */
    public final String mo68449a() {
        return this.f132062b.replace('/', '.');
    }

    /* renamed from: b */
    public final String mo68450b() {
        return this.f132063c;
    }

    /* renamed from: c */
    public final int mo68451c() {
        return this.f132064d;
    }

    /* renamed from: d */
    public final String mo68452d() {
        return this.f132065e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bnsb) {
            bnsb bnsb = (bnsb) obj;
            if (!this.f132062b.equals(bnsb.f132062b) || !this.f132063c.equals(bnsb.f132063c) || this.f132064d != bnsb.f132064d) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f132066f;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((this.f132062b.hashCode() + 4867) * 31) + this.f132063c.hashCode()) * 31) + this.f132064d;
        this.f132066f = hashCode;
        return hashCode;
    }
}
