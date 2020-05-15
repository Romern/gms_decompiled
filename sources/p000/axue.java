package p000;

/* renamed from: axue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axue implements Comparable {

    /* renamed from: d */
    static final C1231nx f96376d = new C1231nx(100);

    /* renamed from: a */
    public final String f96377a;

    /* renamed from: b */
    public final String f96378b;

    /* renamed from: c */
    public final String f96379c;

    private axue(String str, String str2) {
        if (bmxx.m108577a(str)) {
            throw new IllegalArgumentException("packageName is null or empty");
        } else if (!bmxx.m108577a(str2)) {
            if (!ayha.m83999e() || (!"com.google.android.wearable.app.cn".equals(str) && !"com.google.android.wearable.app".equals(str))) {
                this.f96378b = str;
                this.f96377a = str;
            } else {
                this.f96378b = "com.google.android.wearable.app.cn";
                this.f96377a = "com.google.android.wearable.app";
            }
            this.f96379c = str2;
        } else {
            throw new IllegalArgumentException("signatureDigest is null or empty");
        }
    }

    /* renamed from: a */
    public static axue m83239a(String str, String str2) {
        axue axue = new axue(str, str2);
        synchronized (f96376d) {
            if (f96376d.mo15546a(axue) != null) {
                axue axue2 = (axue) f96376d.mo15546a(axue);
                return axue2;
            }
            f96376d.mo15547a(axue, axue);
            return axue;
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        axue axue = (axue) obj;
        if (axue == this) {
            return 0;
        }
        int compareTo = this.f96377a.compareTo(axue.f96377a);
        if (compareTo != 0) {
            return compareTo;
        }
        return this.f96379c.compareTo(axue.f96379c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof axue) {
            axue axue = (axue) obj;
            return this.f96377a.equals(axue.f96377a) && this.f96379c.equals(axue.f96379c);
        }
    }

    public final int hashCode() {
        return ((this.f96377a.hashCode() + 629) * 37) + this.f96379c.hashCode();
    }

    public final String toString() {
        return String.format("AppKey[%s,%s]", this.f96377a, this.f96379c);
    }
}
