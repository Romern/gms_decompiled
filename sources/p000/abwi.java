package p000;

/* renamed from: abwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abwi {
    /* renamed from: a */
    public static long m48393a(long j, byte[] bArr) {
        for (byte b : bArr) {
            j = (j ^ ((long) b)) * 1099511628211L;
        }
        return j;
    }
}
