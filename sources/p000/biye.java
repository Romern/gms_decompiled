package p000;

/* renamed from: biye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biye {
    /* renamed from: a */
    public static void m102970a(String str, String str2, int i, int i2) {
        boolean z;
        bixv.m102956a(str, String.format("%s cannot be null.", str2));
        int length = str.length();
        if (length > i2) {
            z = false;
        } else {
            z = length >= i;
        }
        bixv.m102958a(z, String.format("Length of %s should be in the range [%s-%s]", str2, Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
