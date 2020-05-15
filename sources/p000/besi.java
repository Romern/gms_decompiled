package p000;

import android.os.Bundle;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* renamed from: besi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class besi implements besm {

    /* renamed from: a */
    private int f112285a;

    /* renamed from: b */
    private bevc f112286b;

    /* renamed from: c */
    private final bevc f112287c;

    /* renamed from: d */
    private final bevc f112288d;

    /* renamed from: e */
    private int[] f112289e;

    /* renamed from: f */
    private final int[] f112290f;

    /* renamed from: g */
    private final int[] f112291g;

    /* renamed from: h */
    private int f112292h = 0;

    /* renamed from: i */
    private final float[] f112293i;

    /* renamed from: j */
    private long f112294j = 0;

    /* renamed from: k */
    private long f112295k = 0;

    /* renamed from: l */
    private int f112296l = 0;

    /* renamed from: m */
    private int f112297m = 0;

    /* renamed from: n */
    private int f112298n = 0;

    /* renamed from: o */
    private int f112299o = 0;

    /* renamed from: p */
    private Bundle f112300p = null;

    /* renamed from: q */
    private final boolean f112301q;

    /* renamed from: r */
    private final boolean f112302r;

    /* renamed from: s */
    private final boolean f112303s;

    public besi(ByteBuffer byteBuffer, String str, ByteBuffer byteBuffer2, String str2, String str3, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        int i2;
        this.f112287c = new bevc(byteBuffer, i, z);
        this.f112288d = new bevc(byteBuffer2, i, z);
        this.f112290f = new int[6];
        this.f112291g = new int[6];
        String[] split = str.split(":", -1);
        String[] split2 = str2.split(":", -1);
        for (int i3 = 0; i3 < 6; i3++) {
            this.f112290f[i3] = Integer.parseInt(split[i3]);
            this.f112291g[i3] = Integer.parseInt(split2[i3]);
        }
        this.f112293i = new float[6];
        String[] split3 = str3.split(":", -1);
        for (int i4 = 0; i4 < 6; i4++) {
            this.f112293i[i4] = Float.parseFloat(split3[i4]);
        }
        this.f112286b = this.f112288d;
        this.f112289e = this.f112291g;
        if (z2) {
            i2 = bevp.PHONE_OAR_CNN_V23_BAR_GRU_NON_BATCH_V23.f112768am;
        } else {
            i2 = bevp.PHONE_OAR_DNN_V14_BAR_GRU_NON_BATCH_V23.f112768am;
        }
        this.f112285a = i2;
        this.f112301q = z2;
        this.f112302r = z3;
        this.f112303s = z4;
    }

    /* renamed from: a */
    public final ActivityRecognitionResult mo61068a(ActivityRecognitionResult activityRecognitionResult) {
        int i;
        float f;
        float f2;
        float[] fArr = new float[this.f112286b.f112593b];
        Iterator it = activityRecognitionResult.f79300a.iterator();
        boolean z = false;
        while (true) {
            int i2 = 2;
            if (it.hasNext()) {
                DetectedActivity detectedActivity = (DetectedActivity) it.next();
                int a = detectedActivity.mo43513a();
                if (a == 1) {
                    i2 = 0;
                } else if (a == 3) {
                    i2 = 5;
                } else if (a == 4) {
                    i2 = 6;
                } else if (a != 7) {
                    if (a != 8) {
                        switch (a) {
                            case 16:
                                i2 = 3;
                                break;
                            case 17:
                                i2 = 4;
                                break;
                            case 18:
                                this.f112298n += detectedActivity.f79320e;
                                i2 = -1;
                                break;
                            case 19:
                                this.f112299o += detectedActivity.f79320e;
                                i2 = -1;
                                break;
                            case 20:
                                this.f112296l += detectedActivity.f79320e;
                                i2 = -1;
                                break;
                            case 21:
                                this.f112297m += detectedActivity.f79320e;
                                i2 = -1;
                                break;
                            default:
                                i2 = -1;
                                break;
                        }
                    } else {
                        i2 = 1;
                    }
                }
                if (i2 >= 0 && i2 < this.f112286b.f112593b) {
                    fArr[i2] = (float) detectedActivity.f79320e;
                    z = true;
                }
            } else {
                if (!z) {
                    fArr = null;
                }
                if (fArr == null) {
                    return null;
                }
                int i3 = this.f112292h;
                this.f112292h = i3 + 1;
                if (i3 == 0) {
                    this.f112294j = activityRecognitionResult.f79301b;
                    this.f112295k = activityRecognitionResult.f79302c;
                    this.f112300p = activityRecognitionResult.mo43493c();
                }
                float[] c = this.f112286b.mo61176c(fArr);
                int i4 = this.f112292h;
                int d = beul.m95907d(c);
                if (c[d] <= this.f112293i[d] && i4 < this.f112289e[d]) {
                    return null;
                }
                this.f112286b.mo61175b(c);
                List a2 = beul.m95894a(c);
                float f3 = c[3];
                if (f3 > 0.0f) {
                    int i5 = this.f112298n;
                    int i6 = this.f112299o;
                    int i7 = i5 + i6;
                    if (this.f112302r) {
                        float f4 = 0.33f;
                        if (i7 != 0) {
                            f = ((float) this.f112296l) / ((float) i7);
                        } else {
                            f = 0.33f;
                        }
                        if (i7 != 0) {
                            f2 = ((float) this.f112297m) / ((float) i7);
                        } else {
                            f2 = 0.33f;
                        }
                        if (i7 != 0) {
                            f4 = ((float) i5) / ((float) i7);
                        }
                        beul.m95897a(a2, f3, new float[]{f * f3, f2 * f3, f4 * f3});
                    } else if (this.f112303s) {
                        float f5 = i7 != 0 ? ((float) i6) / ((float) i7) : 0.5f;
                        beul.m95899a(a2, new float[]{f3 * f5, f3 * (1.0f - f5)});
                    }
                }
                int i8 = this.f112285a;
                if (cezo.f183530a.mo6606a().addPersonalizedBitToDetectorInfo() && activityRecognitionResult.f79303d == bevp.PHONE_PERSONALIZATION_AF3_BASED.f112768am) {
                    switch (bevp.m95964a(this.f112285a).ordinal()) {
                        case 52:
                            i = bevp.PHONE_OAR_CNN_V23_PAR_AF3_V2_BAR_GRU_BATCH_V23.f112768am;
                            break;
                        case 53:
                            i = bevp.PHONE_OAR_CNN_V23_PAR_AF3_V2_BAR_GRU_NON_BATCH_V23.f112768am;
                            break;
                        case 54:
                            i = bevp.PHONE_OAR_DNN_V14_PAR_AF3_V2_BAR_GRU_BATCH_V23.f112768am;
                            break;
                        case 55:
                            i = bevp.PHONE_OAR_DNN_V14_PAR_AF3_V2_BAR_GRU_NON_BATCH_V23.f112768am;
                            break;
                    }
                    return new ActivityRecognitionResult(beul.m95893a(a2), this.f112294j, this.f112295k, i, this.f112300p);
                }
                i = i8;
                return new ActivityRecognitionResult(beul.m95893a(a2), this.f112294j, this.f112295k, i, this.f112300p);
            }
        }
    }

    /* renamed from: a */
    public final ActivityRecognitionResult mo61069a(TreeMap treeMap, long j, long j2, long j3, Bundle bundle) {
        return besl.m95710a();
    }

    /* renamed from: b */
    public final void mo61071b() {
        int i;
        this.f112286b = this.f112287c;
        this.f112289e = this.f112290f;
        if (this.f112301q) {
            i = bevp.PHONE_OAR_CNN_V23_BAR_GRU_BATCH_V23.f112768am;
        } else {
            i = bevp.PHONE_OAR_DNN_V14_BAR_GRU_BATCH_V23.f112768am;
        }
        this.f112285a = i;
    }

    /* renamed from: a */
    public final void mo61070a() {
        this.f112292h = 0;
        this.f112296l = 0;
        this.f112297m = 0;
        this.f112298n = 0;
        this.f112299o = 0;
        this.f112287c.mo61174a();
        this.f112288d.mo61174a();
        this.f112286b = this.f112288d;
        this.f112289e = this.f112291g;
        this.f112285a = this.f112301q ? bevp.PHONE_OAR_CNN_V23_BAR_GRU_NON_BATCH_V23.f112768am : bevp.PHONE_OAR_DNN_V14_BAR_GRU_NON_BATCH_V23.f112768am;
    }
}
