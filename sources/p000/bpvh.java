package p000;

/* renamed from: bpvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpvh {
    /* renamed from: a */
    public static int m112321a(int i) {
        if (i == -1) {
            return 1;
        }
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? 0 : 6;
        }
        return 5;
    }
}
