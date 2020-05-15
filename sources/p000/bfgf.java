package p000;

import android.content.Context;
import android.media.AudioFormat;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: bfgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfgf extends bfhw {

    /* renamed from: d */
    private final int f113743d;

    /* renamed from: e */
    private final int f113744e;

    public bfgf(Context context, bfev bfev, bfew bfew, bhdb bhdb, bgmk bgmk, int i, int i2) {
        super(context, bfev, bfew, bhdb);
        this.f113743d = i;
        this.f113744e = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo61644a(int i, int i2, long j) {
        boolean z;
        bfev bfev = this.f113805h;
        bfev.post(new bfeu(bfev, this.f113743d, this.f113744e));
        bfhz bfhz = new bfhz(this.f113743d, this.f113744e, i, i2);
        bfhz.f113990h = j;
        float[] fArr = new float[i];
        while (true) {
            boolean z2 = true;
            if (!bfhw.f113975a) {
                return true;
            }
            int read = bfhw.f113976b.read(fArr, 0, i, 0);
            if (read >= 0) {
                if (i % bfhz.f113986d == 0) {
                    z = true;
                } else {
                    z = false;
                }
                bmxy.m108588a(z);
                if (i > bfhz.f113987e * bfhz.f113986d) {
                    z2 = false;
                }
                bmxy.m108588a(z2);
                int i3 = read / bfhz.f113986d;
                ArrayList arrayList = new ArrayList();
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int i6 = i4 + i5;
                    if (i6 >= i3) {
                        break;
                    }
                    if (bfhz.f113989g < bfhz.f113984b) {
                        bfio bfio = bfhz.f113988f;
                        int i7 = bfhz.f113986d;
                        arrayList.addAll(bfio.mo61735a(fArr, i4 * i7, i7 * i5));
                    }
                    int i8 = bfhz.f113989g;
                    int i9 = bfhz.f113985c;
                    int i10 = (i8 + i5) % i9;
                    bfhz.f113989g = i10;
                    int i11 = bfhz.f113984b;
                    i5 = i10 < i11 ? i11 - i10 : i9 - i10;
                    i4 = i6;
                }
                int i12 = i3 - i4;
                if (bfhz.f113989g < bfhz.f113984b) {
                    bfio bfio2 = bfhz.f113988f;
                    int i13 = bfhz.f113986d;
                    arrayList.addAll(bfio2.mo61735a(fArr, i4 * i13, i13 * i12));
                }
                bfhz.f113989g = (bfhz.f113989g + i12) % bfhz.f113985c;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    arrayList2.add(new bfhy((float[]) arrayList.get(i14), bfhz.f113990h, bfhz.f113986d));
                    bfhz.f113990h += (long) bfhz.f113983a;
                }
                int size2 = arrayList2.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    ((bfhv) arrayList2.get(i15)).mo61707a(this.f113805h);
                }
            } else {
                Locale.getDefault();
                new Object[1][0] = Integer.valueOf(read);
                return false;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final AudioFormat mo61645c() {
        return new AudioFormat.Builder().setChannelIndexMask(15).setEncoding(4).setSampleRate(48000).build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo61646d() {
        return 48000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo61647e() {
        return 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo61648f() {
        return 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo61649g() {
        return 6;
    }
}
