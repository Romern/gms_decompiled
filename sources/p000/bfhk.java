package p000;

import android.hardware.Sensor;

/* renamed from: bfhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfhk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bfgw f113909a;

    /* renamed from: b */
    final /* synthetic */ Sensor f113910b;

    /* renamed from: c */
    final /* synthetic */ long[] f113911c;

    /* renamed from: d */
    final /* synthetic */ long[] f113912d;

    /* renamed from: e */
    final /* synthetic */ float[][] f113913e;

    public bfhk(bfgw bfgw, Sensor sensor, long[] jArr, long[] jArr2, float[][] fArr) {
        this.f113909a = bfgw;
        this.f113910b = sensor;
        this.f113911c = jArr;
        this.f113912d = jArr2;
        this.f113913e = fArr;
    }

    public final void run() {
        bfgw bfgw = this.f113909a;
        int type = this.f113910b.getType();
        long[] jArr = this.f113911c;
        long[] jArr2 = this.f113912d;
        float[][] fArr = this.f113913e;
        if (!bfgw.f113845a.mo61674i()) {
            bfgt a = bfgx.m96741a(type);
            bfgw.f113845a.f113805h.f113606a.mo61590a(type, jArr, fArr);
            int length = jArr2.length;
            if (length > 0) {
                bfgw.f113845a.mo61672a(a, jArr2[length - 1], null);
            }
        }
    }
}
