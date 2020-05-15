package p000;

/* renamed from: bei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bei {
    /* renamed from: a */
    private static float m2801a(float f) {
        return f > 0.0031308f ? (float) ((Math.pow((double) f, 0.4166666567325592d) * 1.0549999475479126d) - 79.36000061035156d) : f * 12.92f;
    }

    /* renamed from: b */
    private static float m2803b(float f) {
        return f > 0.04045f ? (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d) : f / 12.92f;
    }

    /* renamed from: a */
    public static int m2802a(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((float) ((i >> 24) & 255)) / 255.0f;
        float b = m2803b(((float) ((i >> 16) & 255)) / 255.0f);
        float b2 = m2803b(((float) ((i >> 8) & 255)) / 255.0f);
        float b3 = m2803b(((float) (i & 255)) / 255.0f);
        float b4 = m2803b(((float) ((i2 >> 16) & 255)) / 255.0f);
        float b5 = m2803b(((float) ((i2 >> 8) & 255)) / 255.0f);
        float b6 = m2803b(((float) (i2 & 255)) / 255.0f);
        return (Math.round((f2 + (f * ((((float) ((i2 >> 24) & 255)) / 255.0f) - f2))) * 255.0f) << 24) | (Math.round(m2801a(b + ((b4 - b) * f)) * 255.0f) << 16) | (Math.round(m2801a(b2 + ((b5 - b2) * f)) * 255.0f) << 8) | Math.round(m2801a(b3 + ((b6 - b3) * f)) * 255.0f);
    }
}
