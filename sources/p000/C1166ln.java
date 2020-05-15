package p000;

import android.graphics.Insets;
import android.graphics.Rect;

/* renamed from: ln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1166ln {

    /* renamed from: a */
    public static final C1166ln f26425a = new C1166ln(0, 0, 0, 0);

    /* renamed from: b */
    public final int f26426b;

    /* renamed from: c */
    public final int f26427c;

    /* renamed from: d */
    public final int f26428d;

    /* renamed from: e */
    public final int f26429e;

    private C1166ln(int i, int i2, int i3, int i4) {
        this.f26426b = i;
        this.f26427c = i2;
        this.f26428d = i3;
        this.f26429e = i4;
    }

    /* renamed from: a */
    public static C1166ln m19401a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f26425a : new C1166ln(i, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C1166ln lnVar = (C1166ln) obj;
            return this.f26429e == lnVar.f26429e && this.f26426b == lnVar.f26426b && this.f26428d == lnVar.f26428d && this.f26427c == lnVar.f26427c;
        }
    }

    public final int hashCode() {
        return (((((this.f26426b * 31) + this.f26427c) * 31) + this.f26428d) * 31) + this.f26429e;
    }

    public final String toString() {
        return "Insets{left=" + this.f26426b + ", top=" + this.f26427c + ", right=" + this.f26428d + ", bottom=" + this.f26429e + '}';
    }

    /* renamed from: a */
    public static C1166ln m19402a(Insets insets) {
        return m19401a(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: a */
    public static C1166ln m19403a(Rect rect) {
        return m19401a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: a */
    public final Insets mo15280a() {
        return Insets.of(this.f26426b, this.f26427c, this.f26428d, this.f26429e);
    }
}
