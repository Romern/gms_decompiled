package p000;

import java.util.Locale;

/* renamed from: akiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akiz {

    /* renamed from: a */
    private final aka f72069a;

    public akiz(aka aka) {
        this.f72069a = aka;
    }

    /* renamed from: d */
    private final int m59864d() {
        return this.f72069a.mo866a("Orientation", 0);
    }

    /* renamed from: a */
    public final int mo39495a() {
        switch (m59864d()) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public final boolean mo39496b() {
        int d = m59864d();
        return d == 4 || d == 5 || d == 7;
    }

    /* renamed from: c */
    public final boolean mo39497c() {
        return m59864d() == 2;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, description=%s}", Integer.valueOf(this.f72069a.mo866a("ImageWidth", 0)), Integer.valueOf(this.f72069a.mo866a("ImageLength", 0)), Integer.valueOf(mo39495a()), Boolean.valueOf(mo39496b()), Boolean.valueOf(mo39497c()), this.f72069a.mo867a("ImageDescription"));
    }
}
