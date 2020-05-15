package p000;

import java.nio.ByteBuffer;

/* renamed from: dll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dll {

    /* renamed from: a */
    public static final ByteBuffer f13445a = ByteBuffer.allocate(0);

    /* renamed from: b */
    public static final dld f13446b = new dle();

    /* renamed from: c */
    public static final dld f13447c = new dlf();

    /* renamed from: d */
    public static final dld f13448d = new dlg();

    /* renamed from: e */
    public static final dld f13449e = new dlh();

    /* renamed from: a */
    public static int m8799a(brtm brtm, dld dld, Comparable comparable) {
        Object a = dld.mo9258a();
        int a2 = dld.mo9257a(brtm) - 1;
        int i = 0;
        while (i <= a2) {
            int i2 = (i + a2) >>> 1;
            int compareTo = ((Comparable) dld.mo9259a(brtm, a, i2)).compareTo(comparable);
            if (compareTo < 0) {
                i = i2 + 1;
            } else if (compareTo <= 0) {
                return i2;
            } else {
                a2 = i2 - 1;
            }
        }
        return -(i + 1);
    }
}
