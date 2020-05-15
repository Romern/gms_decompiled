package p000;

/* renamed from: bgbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgbf extends bgbt {

    /* renamed from: a */
    private final long f115980a;

    public bgbf(bhcv bhcv, String str, long j) {
        super(bhcv, str);
        this.f115980a = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bgbf) || !super.equals(obj) || this.f115980a != ((bgbf) obj).f115980a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = super.hashCode();
        long j = this.f115980a;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String bgbt = super.toString();
        long j = this.f115980a;
        StringBuilder sb = new StringBuilder(String.valueOf(bgbt).length() + 36);
        sb.append(bgbt);
        sb.append(" maxWaitMillis: ");
        sb.append(j);
        return sb.toString();
    }
}
