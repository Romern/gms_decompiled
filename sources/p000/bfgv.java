package p000;

import android.location.GnssMeasurementsEvent;
import android.location.GnssNavigationMessage;
import android.location.GpsStatus;
import android.location.Location;
import android.telephony.CellLocation;
import com.google.android.location.collectionlib.RealCollectorConfig;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bfgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfgv implements bfgn {

    /* renamed from: a */
    final HashMap f113841a = new HashMap();

    /* renamed from: b */
    HashMap f113842b = null;

    /* renamed from: c */
    private boolean f113843c = false;

    /* renamed from: d */
    private final bfew f113844d;

    public bfgv(bfew bfew) {
        this.f113844d = bfew;
    }

    /* renamed from: a */
    private static final float m96708a(double d) {
        if (d >= 3.4028234663852886E38d) {
            return Float.MAX_VALUE;
        }
        if ((-d) < 3.4028234663852886E38d) {
            return (float) d;
        }
        return -3.4028235E38f;
    }

    /* renamed from: a */
    public final void mo61580a(float f, float f2, float f3, float f4) {
    }

    /* renamed from: a */
    public final void mo61582a(float f, float f2, float f3, float f4, int i, long j, long j2) {
    }

    /* renamed from: a */
    public final void mo61585a(int i, int i2) {
    }

    /* renamed from: a */
    public final void mo61586a(int i, int i2, int i3) {
    }

    /* renamed from: a */
    public final void mo61587a(int i, int i2, long j) {
    }

    /* renamed from: a */
    public final void mo61588a(int i, long j) {
    }

    /* renamed from: a */
    public final void mo61589a(int i, String str, CellLocation cellLocation, int i2, long j) {
    }

    /* renamed from: a */
    public final void mo61591a(GnssMeasurementsEvent gnssMeasurementsEvent, long j) {
    }

    /* renamed from: a */
    public final void mo61592a(GnssNavigationMessage gnssNavigationMessage, long j) {
    }

    /* renamed from: a */
    public final void mo61593a(GpsStatus gpsStatus, long j) {
    }

    /* renamed from: a */
    public final void mo61594a(Location location, long j) {
    }

    /* renamed from: a */
    public final void mo61595a(bgma bgma, int i, long j) {
    }

    /* renamed from: a */
    public final void mo61597a(List list, List list2, long j) {
    }

    /* renamed from: a */
    public final void mo61599a(float[] fArr, long j, int i) {
    }

    /* renamed from: b */
    public final void mo61601b(float f, float f2, float f3, int i, long j, long j2) {
        m96709a(j, bfgt.f113814d, new float[]{f, f2, f3});
    }

    /* renamed from: c */
    public final void mo61604c(float f, float f2, float f3, int i, long j, long j2) {
        m96709a(j, bfgt.f113816f, new float[]{f, f2, f3});
    }

    /* renamed from: d */
    public final void mo61606d(float f, float f2, float f3, int i, long j, long j2) {
        m96709a(j, bfgt.f113815e, new float[]{f, f2, f3});
    }

    /* renamed from: d */
    public final void mo61607d(float f, int i, long j, long j2) {
    }

    /* renamed from: e */
    public final void mo61608e(float f, int i, long j, long j2) {
    }

    /* renamed from: a */
    private final void m96709a(long j, bfgt bfgt, float[] fArr) {
        if (!this.f113843c) {
            bfgu bfgu = (bfgu) this.f113841a.get(bfgt);
            if (bfgu == null) {
                bfgu = new bfgu(new ArrayList(), new ArrayList());
                this.f113841a.put(bfgt, bfgu);
            }
            bfgu.f113839a.add(Long.valueOf(j));
            bfgu.f113840b.add(fArr);
        }
    }

    /* renamed from: b */
    public final void mo61602b(float f, int i, long j, long j2) {
        m96709a(j, bfgt.f113821k, new float[]{f});
    }

    /* renamed from: c */
    public final void mo61605c(float f, int i, long j, long j2) {
        m96709a(j, bfgt.f113822l, new float[]{f});
    }

    /* renamed from: a */
    public final void mo61579a() {
        if (!this.f113843c) {
            this.f113843c = true;
            HashMap hashMap = this.f113842b;
            if (hashMap != null && !hashMap.isEmpty()) {
                this.f113844d.mo60955a(this.f113842b);
                return;
            }
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : this.f113841a.entrySet()) {
                int size = ((bfgu) entry.getValue()).f113839a.size();
                int i = ((bfgt) entry.getKey()).f113834A;
                long[] jArr = new long[size];
                int[] iArr = new int[2];
                iArr[1] = size;
                iArr[0] = i;
                float[][] fArr = (float[][]) Array.newInstance(float.class, iArr);
                for (int i2 = 0; i2 < size; i2++) {
                    jArr[i2] = ((Long) ((bfgu) entry.getValue()).f113839a.get(i2)).longValue();
                    for (int i3 = 0; i3 < i; i3++) {
                        fArr[i3][i2] = ((float[]) ((bfgu) entry.getValue()).f113840b.get(i2))[i3];
                    }
                }
                hashMap2.put((bfgt) entry.getKey(), new bfku(jArr, fArr));
            }
            this.f113844d.mo60955a(hashMap2);
        }
    }

    /* renamed from: a */
    public final void mo61581a(float f, float f2, float f3, float f4, float f5, float f6, int i, long j, long j2) {
        m96709a(j, bfgt.f113820j, new float[]{f, f2, f3, f4, f5, f6});
    }

    /* renamed from: a */
    public final void mo61583a(float f, float f2, float f3, int i, long j, long j2) {
        m96709a(j, bfgt.f113813c, new float[]{f, f2, f3});
    }

    /* renamed from: a */
    public final void mo61584a(float f, int i, long j, long j2) {
        m96709a(j, bfgt.f113819i, new float[]{f});
    }

    /* renamed from: a */
    public final void mo61590a(int i, long[] jArr, float[][] fArr) {
        boolean z;
        if (!this.f113843c) {
            HashMap hashMap = this.f113842b;
            if (hashMap == null) {
                hashMap = new HashMap();
                this.f113842b = hashMap;
            }
            bfgt bfgt = (bfgt) RealCollectorConfig.f150690b.get(Integer.valueOf(i));
            if (bfgt != null) {
                if (hashMap.get(bfgt) == null) {
                    z = true;
                } else {
                    z = false;
                }
                bmxy.m108605b(z, "Sensor %s is reported more than once in batching collector.", bfgt);
                hashMap.put(bfgt, new bfku(jArr, fArr));
            }
        }
    }

    /* renamed from: a */
    public final void mo61598a(double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4, double[] dArr5, long j) {
        long j2 = j * 1000000;
        float[] fArr = new float[(dArr.length + dArr2.length + dArr3.length + dArr4.length + dArr5.length)];
        for (int i = 0; i < dArr.length; i++) {
            fArr[i] = m96708a(dArr[i]);
        }
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            fArr[dArr.length + i2] = m96708a(dArr2[i2]);
        }
        for (int i3 = 0; i3 < dArr3.length; i3++) {
            fArr[dArr.length + dArr2.length + i3] = m96708a(dArr3[i3]);
        }
        for (int i4 = 0; i4 < dArr4.length; i4++) {
            fArr[dArr.length + dArr2.length + dArr3.length + i4] = m96708a(dArr4[i4]);
        }
        for (int i5 = 0; i5 < dArr5.length; i5++) {
            fArr[dArr.length + dArr2.length + dArr3.length + dArr4.length + i5] = m96708a(dArr5[i5]);
        }
        m96709a(j2, bfgt.f113823m, fArr);
    }
}
