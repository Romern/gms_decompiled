package p000;

import android.os.Bundle;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* renamed from: beru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beru implements besm {

    /* renamed from: a */
    static final long f112240a = TimeUnit.SECONDS.toMillis(90);

    /* renamed from: b */
    private static final long f112241b = TimeUnit.SECONDS.toMillis(4);

    /* renamed from: c */
    private final bevc f112242c;

    /* renamed from: d */
    private final float[][] f112243d = ((float[][]) Array.newInstance(float.class, 18, 7));

    /* renamed from: e */
    private final long[] f112244e = new long[18];

    /* renamed from: f */
    private final float[] f112245f = new float[6];

    /* renamed from: g */
    private int f112246g = -1;

    /* renamed from: h */
    private long f112247h = -1;

    public beru(ByteBuffer byteBuffer, int i, boolean z) {
        this.f112242c = new bevc(byteBuffer, i, z);
    }

    /* renamed from: a */
    public final ActivityRecognitionResult mo61068a(ActivityRecognitionResult activityRecognitionResult) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo61070a() {
    }

    /* renamed from: b */
    public final void mo61071b() {
    }

    /* renamed from: a */
    public final ActivityRecognitionResult mo61069a(TreeMap treeMap, long j, long j2, long j3, Bundle bundle) {
        long j4 = j;
        float[] fArr = null;
        if (treeMap == null || treeMap.isEmpty()) {
            return null;
        }
        int i = -1;
        if (j4 > this.f112247h + f112240a) {
            this.f112246g = -1;
        } else if (((Long) treeMap.lastKey()).longValue() == this.f112244e[this.f112246g]) {
            return new ActivityRecognitionResult(beul.m95893a(beul.m95894a(this.f112245f)), j2, j3, bevp.CHRE_OAR_DNN_V2_BAR_GRU_V24.f112768am, bundle);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            long longValue = ((Long) entry.getKey()).longValue();
            int i2 = this.f112246g;
            if (i2 == i || longValue > this.f112244e[i2]) {
                this.f112246g = (i2 + 1) % 18;
                float[] fArr2 = new float[this.f112242c.f112593b];
                boolean z = false;
                for (DetectedActivity detectedActivity : (List) entry.getValue()) {
                    int a = detectedActivity.mo43513a();
                    int i3 = 4;
                    if (a == 1) {
                        i3 = 0;
                    } else if (a == 3) {
                        i3 = 5;
                    } else if (a == 4) {
                        i3 = 6;
                    } else if (a == 7) {
                        i3 = 2;
                    } else if (a == 8) {
                        i3 = 1;
                    } else if (a == 16) {
                        i3 = 3;
                    } else if (a != 17) {
                        i3 = -1;
                    }
                    if (i3 >= 0 && i3 < this.f112242c.f112593b) {
                        fArr2[i3] = (float) detectedActivity.f79320e;
                        z = true;
                    }
                }
                if (!z) {
                    fArr2 = null;
                }
                if (fArr2 == null) {
                    return null;
                }
                System.arraycopy(fArr2, 0, this.f112243d[this.f112246g], 0, fArr2.length);
                this.f112244e[this.f112246g] = longValue;
                this.f112247h = j4;
                i = -1;
            }
        }
        long j5 = this.f112244e[this.f112246g];
        this.f112242c.mo61174a();
        int i4 = 0;
        while (i4 < 18) {
            int i5 = ((this.f112246g - i4) + 18) % 18;
            if (this.f112244e[i5] < j5 - f112241b) {
                break;
            }
            fArr = this.f112242c.mo61176c(this.f112243d[i5]);
            i4++;
            j5 = this.f112244e[i5];
        }
        this.f112242c.mo61175b(fArr);
        System.arraycopy(fArr, 0, this.f112245f, 0, fArr.length);
        return new ActivityRecognitionResult(beul.m95893a(beul.m95894a(fArr)), j2, j3, bevp.CHRE_OAR_DNN_V2_BAR_GRU_V24.f112768am, bundle);
    }
}
