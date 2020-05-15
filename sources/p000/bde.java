package p000;

import android.graphics.Color;
import java.util.ArrayList;

/* renamed from: bde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bde implements bea {

    /* renamed from: a */
    private int f3029a;

    public bde(int i) {
        this.f3029a = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2999a(bef bef, float f) {
        double d;
        ArrayList arrayList = new ArrayList();
        int n = bef.mo3035n();
        if (n == 1) {
            bef.mo3021a();
        }
        while (bef.mo3026e()) {
            arrayList.add(Float.valueOf((float) bef.mo3031j()));
        }
        if (n == 1) {
            bef.mo3023b();
        }
        int i = this.f3029a;
        if (i == -1) {
            i = arrayList.size() / 4;
            this.f3029a = i;
        }
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f3029a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = (double) ((Float) arrayList.get(i4)).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                Double.isNaN(floatValue);
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                Double.isNaN(floatValue);
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                Double.isNaN(floatValue);
                iArr[i5] = Color.argb(255, i3, i2, (int) (floatValue * 255.0d));
            }
        }
        bbp bbp = new bbp(fArr, iArr);
        int i7 = this.f3029a * 4;
        if (arrayList.size() > i7) {
            int size = (arrayList.size() - i7) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i8 = 0;
            while (i7 < arrayList.size()) {
                if (i7 % 2 != 0) {
                    dArr2[i8] = (double) ((Float) arrayList.get(i7)).floatValue();
                    i8++;
                } else {
                    dArr[i8] = (double) ((Float) arrayList.get(i7)).floatValue();
                }
                i7++;
            }
            for (int i9 = 0; i9 < bbp.mo2980a(); i9++) {
                int i10 = bbp.f2851b[i9];
                double d2 = (double) bbp.f2850a[i9];
                int i11 = 1;
                while (true) {
                    if (i11 >= size) {
                        d = dArr2[size - 1];
                        break;
                    }
                    int i12 = i11 - 1;
                    double d3 = dArr[i12];
                    double d4 = dArr[i11];
                    if (d4 >= d2) {
                        double d5 = dArr2[i12];
                        double d6 = dArr2[i11];
                        Double.isNaN(d2);
                        d = bem.m2818a(d5, d6, (d2 - d3) / (d4 - d3));
                        break;
                    }
                    i11++;
                }
                bbp.f2851b[i9] = Color.argb((int) (d * 255.0d), Color.red(i10), Color.green(i10), Color.blue(i10));
            }
        }
        return bbp;
    }
}
