package p000;

/* renamed from: caw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caw {
    /* renamed from: a */
    public static byd m3863a(boq boq) {
        int d = (boq.mo3328d() & 192) >> 6;
        byd[] values = byd.values();
        for (byd byd : values) {
            if (d == byd.f6119e) {
                return byd;
            }
        }
        throw new IllegalArgumentException();
    }
}
