package p000;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* renamed from: kx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1149kx {

    /* renamed from: a */
    public final Shader f25335a;

    /* renamed from: b */
    public int f25336b;

    /* renamed from: c */
    private final ColorStateList f25337c;

    public C1149kx(Shader shader, ColorStateList colorStateList, int i) {
        this.f25335a = shader;
        this.f25337c = colorStateList;
        this.f25336b = i;
    }

    /* renamed from: a */
    static C1149kx m18715a(int i) {
        return new C1149kx(null, null, i);
    }

    /* renamed from: a */
    public final boolean mo14926a() {
        return this.f25335a != null;
    }

    /* renamed from: b */
    public final boolean mo14928b() {
        ColorStateList colorStateList;
        return this.f25335a == null && (colorStateList = this.f25337c) != null && colorStateList.isStateful();
    }

    /* renamed from: c */
    public final boolean mo14929c() {
        return mo14926a() || this.f25336b != 0;
    }

    /* renamed from: a */
    public final boolean mo14927a(int[] iArr) {
        if (!mo14928b()) {
            return false;
        }
        ColorStateList colorStateList = this.f25337c;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.f25336b) {
            return false;
        }
        this.f25336b = colorForState;
        return true;
    }
}
