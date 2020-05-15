package p000;

import android.util.Size;

/* renamed from: oab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oab {

    /* renamed from: a */
    public final int f37023a;

    /* renamed from: b */
    public final int f37024b;

    /* renamed from: c */
    public final int f37025c;

    /* renamed from: d */
    public final int f37026d;

    /* renamed from: e */
    public final int f37027e;

    /* renamed from: f */
    public final int f37028f;

    /* renamed from: g */
    public final int f37029g;

    /* renamed from: h */
    public final float f37030h;

    /* renamed from: i */
    public final int f37031i;

    /* renamed from: j */
    public final float f37032j;

    /* renamed from: k */
    public final Size f37033k;

    public oab(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, float f2, Size size) {
        this.f37023a = i;
        this.f37024b = i2;
        this.f37025c = i3;
        this.f37026d = i4;
        this.f37027e = i5;
        this.f37028f = i6;
        this.f37029g = i7;
        this.f37030h = f;
        this.f37031i = i8;
        this.f37032j = f2;
        this.f37033k = size;
    }

    public final String toString() {
        int i = this.f37023a;
        int i2 = this.f37024b;
        int i3 = this.f37025c;
        int i4 = this.f37027e;
        int i5 = this.f37028f;
        int i6 = this.f37029g;
        int i7 = this.f37026d;
        float f = this.f37030h;
        int i8 = this.f37031i;
        float f2 = this.f37032j;
        String valueOf = String.valueOf(this.f37033k);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 297);
        sb.append("DisplayParams{selectedIndex=");
        sb.append(i);
        sb.append(", codecWidth=");
        sb.append(i2);
        sb.append(", codecHeight=");
        sb.append(i3);
        sb.append(", dispWidth=");
        sb.append(i4);
        sb.append(", dispHeight=");
        sb.append(i5);
        sb.append(", densityDpi=");
        sb.append(i6);
        sb.append(", fps ");
        sb.append(i7);
        sb.append(", pixelAspectRatio ");
        sb.append(f);
        sb.append(", decoder depth=");
        sb.append(i8);
        sb.append(", scaledPixelAspectRatio=");
        sb.append(f2);
        sb.append(", scaledDimensions=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
