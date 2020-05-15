package p000;

/* renamed from: bjev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjev {

    /* renamed from: a */
    public final String f122588a;

    /* renamed from: b */
    private final String f122589b;

    public bjev(String str, String str2) {
        this.f122589b = str;
        this.f122588a = str2;
    }

    /* renamed from: a */
    public final String mo65066a() {
        if (this.f122589b.startsWith("oauth2:")) {
            String valueOf = String.valueOf(this.f122588a);
            return valueOf.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf);
        }
        String valueOf2 = String.valueOf(this.f122588a);
        return valueOf2.length() == 0 ? new String("GoogleLogin auth=") : "GoogleLogin auth=".concat(valueOf2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bjev bjev = (bjev) obj;
            return bjzb.m104957a(this.f122589b, bjev.f122589b) && bjzb.m104957a(this.f122588a, bjev.f122588a);
        }
    }

    public final int hashCode() {
        String str = this.f122589b;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        String str2 = this.f122588a;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
