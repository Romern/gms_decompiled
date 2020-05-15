package p000;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: bevd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bevd {

    /* renamed from: a */
    public bexc f112607a;

    /* renamed from: b */
    private final beuk f112608b;

    /* renamed from: c */
    private final boolean f112609c;

    /* renamed from: d */
    private final beur f112610d;

    /* renamed from: e */
    private final Class f112611e;

    public bevd(boolean z, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, beur beur, Class cls, bexc bexc) {
        this.f112609c = z;
        this.f112611e = cls;
        if (z) {
            this.f112608b = new beut(byteBuffer, beve.WATCH_ACTIVITY.f112631s);
        } else if (cls == beva.class) {
            this.f112608b = new beva(byteBuffer, byteBuffer2, (int) ceuq.m138266f(), ceuq.m138268h());
        } else if (cls == beuu.class) {
            this.f112608b = new beuu(byteBuffer, (int) ceuq.m138266f(), ceuq.m138267g());
        } else {
            this.f112608b = new beut(byteBuffer, beve.PHONE_ACTIVITY.f112631s);
        }
        this.f112610d = beur;
        this.f112607a = bexc;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: beum.a(beup, double[][], boolean):double[]
     arg types: [bevm, double[][], int]
     candidates:
      beum.a(boolean, double[][], boolean):float
      beum.a(beup, double[][], boolean):double[] */
    /* renamed from: a */
    public final List mo61177a(bfku bfku) {
        List list;
        bfku bfku2 = bfku;
        char c = 1;
        if (this.f112609c) {
            bevm bevm = new bevm();
            double[][] a = bevb.m95937a(bfku2, 128.0d);
            double[][] dArr = new double[a.length][];
            for (int i = 0; i < a.length; i++) {
                double[] dArr2 = a[i];
                double[] dArr3 = new double[dArr2.length];
                dArr3[0] = dArr2[0];
                for (int i2 = 1; i2 < dArr2.length; i2++) {
                    int i3 = i2 - 1;
                    dArr3[i2] = ((dArr3[i3] + dArr2[i2]) - dArr2[i3]) * 0.7d;
                }
                dArr[i] = dArr3;
            }
            float[] fArr = {beum.m95910a(dArr[0]), beum.m95910a(dArr[1]), beum.m95910a(dArr[2])};
            Arrays.sort(fArr);
            bevm.f112691F = fArr[2];
            bevm.f112692G = fArr[1];
            double[][] dArr4 = new double[3][];
            for (int i4 = 0; i4 < 3; i4++) {
                double[] dArr5 = a[i4];
                int length = dArr5.length >> 6;
                double[] dArr6 = new double[length];
                for (int i5 = 0; i5 < length; i5++) {
                    int i6 = i5 * 64;
                    dArr6[i5] = bevl.m95960a(dArr5, i6, i6 + 64);
                }
                dArr4[i4] = dArr6;
            }
            int length2 = dArr4[0].length;
            double[] dArr7 = new double[length2];
            for (int i7 = 0; i7 < length2; i7++) {
                dArr7[i7] = bevl.m95958a(dArr4[0][i7], dArr4[2][i7]);
            }
            int length3 = dArr4[0].length;
            double[] dArr8 = new double[length3];
            int i8 = 0;
            while (i8 < length3) {
                dArr8[i8] = bevl.m95959a(dArr4[0][i8], dArr4[c][i8], dArr4[2][i8]);
                i8++;
                c = 1;
            }
            float[] a2 = bevl.m95961a(dArr7);
            float[] a3 = bevl.m95961a(dArr8);
            bevm.f112693w = a3[0];
            bevm.f112695y = a2[0];
            bevm.f112694x = a3[c];
            bevm.f112696z = a2[c];
            double[] dArr9 = new double[3];
            double[] dArr10 = a[0];
            dArr9[0] = bevl.m95960a(dArr10, 0, dArr10.length);
            double[] dArr11 = a[c];
            dArr9[c] = bevl.m95960a(dArr11, 0, dArr11.length);
            double[] dArr12 = a[2];
            double a4 = bevl.m95960a(dArr12, 0, dArr12.length);
            dArr9[2] = a4;
            double d = dArr9[0];
            double d2 = dArr9[c];
            double a5 = bevl.m95958a(d, a4);
            bevm.f112686A = (float) bevl.m95959a(d, d2, a4);
            bevm.f112687B = (float) a5;
            double sqrt = Math.sqrt((d * d) + (d2 * d2) + (a4 * a4));
            bevm.f112688C = (float) (d / sqrt);
            bevm.f112689D = (float) (d2 / sqrt);
            bevm.f112690E = (float) (a4 / sqrt);
            beum.m95911a((beup) bevm, a, true);
            list = this.f112608b.mo61159a(bevm);
        } else {
            beuq beuq = new beuq();
            if (this.f112611e == beuu.class) {
                List a6 = this.f112608b.mo61160a(beuo.m95915a(bfku));
                if (this.f112607a != null) {
                    beun.m95913a(beuq, bfku2);
                }
                list = a6;
            } else {
                beun.m95913a(beuq, bfku2);
                list = this.f112608b.mo61159a(beuq);
            }
            bexc bexc = this.f112607a;
            if (bexc != null) {
                bexc.f112882b = false;
                bexa bexa = bexc.f112881a;
                if (bexa != null) {
                    ArrayList arrayList = new ArrayList();
                    for (bewy bewy : bexa.f112871c.values()) {
                        if (bewy != null) {
                            arrayList.add(bewy);
                        }
                    }
                    bexa.mo61216a();
                    List a7 = bewy.m96006a(list, beuq, arrayList);
                    if (a7 != null) {
                        bexc.f112882b = true;
                        list = a7;
                    }
                }
            }
        }
        beur beur = this.f112610d;
        return beur != null ? Collections.singletonList(new beus(beur, 100)) : list;
    }
}
