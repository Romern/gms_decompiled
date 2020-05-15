package p000;

import android.widget.ImageView;

/* renamed from: axbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axbc {

    /* renamed from: a */
    public final ImageView[] f95630a;

    /* renamed from: b */
    public final boolean f95631b;

    /* renamed from: c */
    public boolean f95632c = false;

    /* renamed from: d */
    public final int[] f95633d;

    public axbc(ImageView[] imageViewArr, boolean z) {
        this.f95630a = imageViewArr;
        this.f95631b = z;
        this.f95633d = new int[imageViewArr.length];
    }

    /* renamed from: a */
    public final void mo52973a(int i, boolean z) {
        boolean z2;
        ImageView imageView = this.f95630a[i];
        if (bkfr.m105612e(imageView.getContext())) {
            if (this.f95633d[i] < 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z != z2 || this.f95632c) {
                imageView.animate().alpha(!z ? 0.0f : 1.0f);
                return;
            }
            return;
        }
        imageView.clearAnimation();
        imageView.setAlpha(z ? 1 : 0);
    }
}
