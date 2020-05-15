package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: ayvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayvi {

    /* renamed from: a */
    public final byte[][] f98547a;

    /* renamed from: b */
    public final ArrayList f98548b;

    /* renamed from: c */
    public final ayvh f98549c;

    /* renamed from: d */
    public int f98550d = 0;

    /* renamed from: e */
    public int f98551e = 0;

    /* renamed from: f */
    public int f98552f;

    /* renamed from: g */
    public ayve f98553g = null;

    /* renamed from: h */
    private final int f98554h;

    /* renamed from: i */
    private final int f98555i;

    /* renamed from: j */
    private final double[] f98556j;

    /* renamed from: k */
    private double[] f98557k;

    /* renamed from: l */
    private double[] f98558l;

    /* renamed from: m */
    private final ayvg f98559m;

    /* renamed from: a */
    public final void mo54448a() {
        this.f98548b.clear();
        int i = 0;
        this.f98550d = 0;
        this.f98551e = 0;
        this.f98553g = null;
        double d = -1.0d;
        int i2 = -1;
        while (true) {
            double[] dArr = this.f98556j;
            if (i < dArr.length) {
                double d2 = dArr[i];
                this.f98557k[i] = Math.log10(d2);
                if (d2 > d) {
                    i2 = i;
                }
                if (d2 > d) {
                    d = d2;
                }
                i++;
            } else {
                this.f98552f = i2;
                return;
            }
        }
    }

    public ayvi(double[] dArr, ayvg ayvg) {
        int length = dArr.length;
        if (length <= 127) {
            this.f98555i = 1;
            this.f98556j = dArr;
            this.f98554h = length;
            int[] iArr = new int[2];
            iArr[1] = 1;
            iArr[0] = length;
            this.f98547a = (byte[][]) Array.newInstance(byte.class, iArr);
            this.f98548b = new ArrayList(1);
            this.f98559m = ayvg;
            this.f98549c = new ayvh(this);
            int i = this.f98554h;
            this.f98557k = new double[i];
            this.f98558l = new double[i];
            mo54448a();
            return;
        }
        throw new IllegalArgumentException("Only 127 states supported (this is easy to adjust)");
    }

    /* renamed from: a */
    public final void mo54449a(ayve ayve) {
        ayve ayve2 = ayve;
        this.f98552f = -1;
        double[] dArr = this.f98557k;
        this.f98557k = this.f98558l;
        this.f98558l = dArr;
        double d = -1.7976931348623157E308d;
        for (byte b = 0; b < this.f98554h; b = (byte) (b + 1)) {
            double d2 = ayve2.f98536a[b];
            double d3 = -1.7976931348623157E308d;
            byte b2 = -1;
            for (byte b3 = 0; b3 < this.f98554h; b3 = (byte) (b3 + 1)) {
                double d4 = d2 + this.f98559m.f98541a[b3][b] + dArr[b3];
                if (d4 > d3 || b2 == -1) {
                    b2 = b3;
                    d3 = d4;
                }
            }
            if (d3 > d || this.f98552f == -1) {
                this.f98552f = b;
                d = d3;
            }
            this.f98547a[b][this.f98550d] = b2;
            this.f98557k[b] = d3;
        }
        int size = this.f98548b.size();
        int i = this.f98550d;
        if (size <= i) {
            this.f98548b.add(this.f98553g);
        } else {
            this.f98548b.set(i, this.f98553g);
        }
        this.f98553g = ayve2;
        int i2 = this.f98550d + 1;
        this.f98550d = i2;
        int i3 = this.f98555i;
        if (i2 >= i3) {
            this.f98550d = 0;
        }
        if (this.f98551e < i3) {
            this.f98551e = 1;
        }
    }
}
