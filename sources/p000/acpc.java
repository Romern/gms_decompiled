package p000;

/* renamed from: acpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acpc {
    /* renamed from: a */
    static long m49648a(long j, long j2) {
        return (j ^ j2) * 1099511628211L;
    }

    /* renamed from: a */
    static long m49649a(long j, String str) {
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                j = (j ^ ((long) str.charAt(i))) * 1099511628211L;
            }
        }
        return j;
    }
}
