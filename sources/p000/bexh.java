package p000;

/* renamed from: bexh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bexh {
    LIGHT(new float[]{1.0f, 15.0f, 40.0f, 70.0f, 120.0f}),
    LIGHT_DIFF(new float[]{-30.0f, -10.0f, -1.0f, 1.0f, 10.0f, 30.0f}),
    ACCEL(new float[]{0.002f, 0.004f, 0.01f, 0.06f, 0.3f}),
    ACCEL_DIR_Z(new float[]{-0.8f, 0.0f, 0.36f, 0.65f, 0.8f}),
    LOG_BARK_DIFF(new float[]{3.0f, 9.0f, 13.0f, 25.0f, 50.0f}),
    HOUR(new float[]{4.0f, 16.0f});
    

    /* renamed from: g */
    private final float[] f112903g;

    private bexh(float[] fArr) {
        this.f112903g = fArr;
    }

    /* renamed from: a */
    public final float mo61225a(float f) {
        if (this.f112903g != null) {
            int i = 0;
            while (true) {
                float[] fArr = this.f112903g;
                if (i < fArr.length) {
                    if (f <= fArr[i]) {
                        return (float) (i + 1);
                    }
                    i++;
                } else if (this != HOUR) {
                    return (float) (fArr.length + 1);
                } else {
                    return 1.0f;
                }
            }
        } else {
            throw new UnsupportedOperationException("UI display for this feature is not supported");
        }
    }
}
