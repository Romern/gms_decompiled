package p000;

import java.util.List;

/* renamed from: adwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adwa extends advx {

    /* renamed from: a */
    private final List f62833a;

    public adwa(bsjh bsjh) {
        this.f62833a = bsjh.f144794a;
    }

    /* renamed from: a */
    public final float mo33857a(int i) {
        if (i > 0) {
            double d = 0.0d;
            for (int i2 = 0; i2 < this.f62833a.size(); i2++) {
                double floatValue = (double) ((Float) this.f62833a.get(i2)).floatValue();
                double pow = Math.pow((double) i, (double) i2);
                Double.isNaN(floatValue);
                d += floatValue * pow;
            }
            if (d >= 0.0d) {
                if (d <= 1.0d) {
                    return (float) d;
                }
                return 1.0f;
            }
        }
        return 0.0f;
    }
}
