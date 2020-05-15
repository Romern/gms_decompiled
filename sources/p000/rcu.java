package p000;

/* renamed from: rcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rcu {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031 A[RETURN] */
    /* renamed from: a */
    public static int m33345a(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != 2203994) {
            if (hashCode == 2402104 && str.equals("NONE")) {
                c = 0;
                if (c == 0) {
                    return 1;
                }
                if (c == 1) {
                    return 2;
                }
                throw new IllegalArgumentException();
            }
        } else if (str.equals("GZIP")) {
            c = 1;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }

    /* renamed from: a */
    public static /* synthetic */ String m33346a(int i) {
        return i != 1 ? "GZIP" : "NONE";
    }
}
