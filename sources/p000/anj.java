package p000;

import android.view.ViewGroup;

@Deprecated
/* renamed from: anj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anj {

    /* renamed from: a */
    public float f1840a = -1.0f;

    /* renamed from: b */
    public float f1841b = -1.0f;

    /* renamed from: c */
    public float f1842c = -1.0f;

    /* renamed from: d */
    public float f1843d = -1.0f;

    /* renamed from: e */
    public float f1844e = -1.0f;

    /* renamed from: f */
    public float f1845f = -1.0f;

    /* renamed from: g */
    public float f1846g = -1.0f;

    /* renamed from: h */
    public float f1847h = -1.0f;

    /* renamed from: i */
    public float f1848i;

    /* renamed from: j */
    public final ank f1849j = new ank();

    /* renamed from: a */
    public final void mo2198a(ViewGroup.LayoutParams layoutParams) {
        ank ank = this.f1849j;
        if (!ank.f1851b) {
            layoutParams.width = ank.width;
        }
        ank ank2 = this.f1849j;
        if (!ank2.f1850a) {
            layoutParams.height = ank2.height;
        }
        ank ank3 = this.f1849j;
        ank3.f1851b = false;
        ank3.f1850a = false;
    }

    public final String toString() {
        return String.format("PercentLayoutInformation width: %f height %f, margins (%f, %f,  %f, %f, %f, %f)", Float.valueOf(this.f1840a), Float.valueOf(this.f1841b), Float.valueOf(this.f1842c), Float.valueOf(this.f1843d), Float.valueOf(this.f1844e), Float.valueOf(this.f1845f), Float.valueOf(this.f1846g), Float.valueOf(this.f1847h));
    }

    /* renamed from: a */
    public final void mo2199a(ViewGroup.LayoutParams layoutParams, int i, int i2) {
        boolean z;
        this.f1849j.width = layoutParams.width;
        this.f1849j.height = layoutParams.height;
        ank ank = this.f1849j;
        boolean z2 = false;
        if (!ank.f1851b && ank.width != 0) {
            z = false;
        } else if (this.f1840a < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        ank ank2 = this.f1849j;
        if ((ank2.f1850a || ank2.height == 0) && this.f1841b < 0.0f) {
            z2 = true;
        }
        float f = this.f1840a;
        if (f >= 0.0f) {
            layoutParams.width = Math.round(((float) i) * f);
        }
        float f2 = this.f1841b;
        if (f2 >= 0.0f) {
            layoutParams.height = Math.round(((float) i2) * f2);
        }
        if (this.f1848i >= 0.0f) {
            if (z) {
                layoutParams.width = Math.round(((float) layoutParams.height) * this.f1848i);
                this.f1849j.f1851b = true;
            }
            if (z2) {
                layoutParams.height = Math.round(((float) layoutParams.width) / this.f1848i);
                this.f1849j.f1850a = true;
            }
        }
    }
}
