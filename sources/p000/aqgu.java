package p000;

/* renamed from: aqgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqgu {

    /* renamed from: a */
    public final String f86087a;

    /* renamed from: b */
    public final long f86088b;

    protected aqgu(String str, long j) {
        this.f86087a = str;
        this.f86088b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aqgu aqgu = (aqgu) obj;
            if (this.f86088b == aqgu.f86088b) {
                String str = this.f86087a;
                return str == null ? aqgu.f86087a == null : str.equals(aqgu.f86087a);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f86087a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.f86088b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }
}
