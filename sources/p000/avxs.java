package p000;

import android.hardware.Camera;

/* renamed from: avxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avxs {

    /* renamed from: a */
    public final rzj f94069a;

    /* renamed from: b */
    public rzj f94070b;

    public avxs(Camera.Size size, Camera.Size size2) {
        this.f94069a = new rzj(size.width, size.height);
        if (size2 != null) {
            this.f94070b = new rzj(size2.width, size2.height);
        }
    }
}
