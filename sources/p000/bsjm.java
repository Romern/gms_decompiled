package p000;

/* renamed from: bsjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsjm {
    /* renamed from: a */
    public static boolean m115860a(int i) {
        return i > 126 ? i >= 55296 ? i >= 64976 ? i > 65007 && (i & 65534) != 65534 && i <= 1114111 : i > 57343 : i >= 160 : i >= 32 || i == 10 || i == 13 || i == 9 || i == 12;
    }
}
