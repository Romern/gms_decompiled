package p000;

import android.view.View;
import android.view.ViewParent;

/* renamed from: pe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1266pe {

    /* renamed from: a */
    public boolean f26827a;

    /* renamed from: b */
    private ViewParent f26828b;

    /* renamed from: c */
    private ViewParent f26829c;

    /* renamed from: d */
    private final View f26830d;

    /* renamed from: e */
    private int[] f26831e;

    public C1266pe(View view) {
        this.f26830d = view;
    }

    /* renamed from: a */
    private final void m19830a(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f26828b = viewParent;
        } else if (i == 1) {
            this.f26829c = viewParent;
        }
    }

    /* renamed from: c */
    private final int[] m19831c() {
        if (this.f26831e == null) {
            this.f26831e = new int[2];
        }
        return this.f26831e;
    }

    /* renamed from: d */
    private final ViewParent m19832d(int i) {
        if (i == 0) {
            return this.f26828b;
        }
        if (i != 1) {
            return null;
        }
        return this.f26829c;
    }

    /* renamed from: b */
    public final void mo15686b() {
        mo15688c(0);
    }

    /* renamed from: a */
    public final void mo15676a(boolean z) {
        if (this.f26827a) {
            C1280ps.m19866A(this.f26830d);
        }
        this.f26827a = z;
    }

    /* renamed from: b */
    public final boolean mo15687b(int i) {
        return mo15681a(i, 0);
    }

    /* renamed from: c */
    public final void mo15688c(int i) {
        ViewParent d = m19832d(i);
        if (d != null) {
            C1282pu.m19948a(d, this.f26830d, i);
            m19830a(i, (ViewParent) null);
        }
    }

    /* renamed from: a */
    public final boolean mo15677a() {
        return mo15680a(0);
    }

    /* renamed from: a */
    public final boolean mo15678a(float f, float f2) {
        ViewParent d;
        if (!this.f26827a || (d = m19832d(0)) == null) {
            return false;
        }
        return C1282pu.m19951a(d, this.f26830d, f, f2);
    }

    /* renamed from: a */
    public final boolean mo15679a(float f, float f2, boolean z) {
        ViewParent d;
        if (!this.f26827a || (d = m19832d(0)) == null) {
            return false;
        }
        return C1282pu.m19952a(d, this.f26830d, f, f2, z);
    }

    /* renamed from: a */
    public final boolean mo15680a(int i) {
        return m19832d(i) != null;
    }

    /* renamed from: a */
    public final boolean mo15681a(int i, int i2) {
        if (mo15680a(i2)) {
            return true;
        }
        if (!this.f26827a) {
            return false;
        }
        ViewParent parent = this.f26830d.getParent();
        View view = this.f26830d;
        while (parent != null) {
            if (!C1282pu.m19953a(parent, view, this.f26830d, i, i2)) {
                if (parent instanceof View) {
                    view = (View) parent;
                }
                parent = parent.getParent();
            } else {
                m19830a(i2, parent);
                C1282pu.m19954b(parent, view, this.f26830d, i, i2);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo15682a(int i, int i2, int i3, int i4, int[] iArr) {
        return mo15683a(i, i2, i3, i4, iArr, 0, null);
    }

    /* renamed from: a */
    public final boolean mo15683a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent d;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!this.f26827a || (d = m19832d(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f26830d.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            int[] c = m19831c();
            c[0] = 0;
            c[1] = 0;
            iArr3 = c;
        } else {
            iArr3 = iArr2;
        }
        C1282pu.m19949a(d, this.f26830d, i, i2, i3, i4, i5, iArr3);
        if (iArr4 != null) {
            this.f26830d.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo15684a(int i, int i2, int[] iArr, int[] iArr2) {
        return mo15685a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public final boolean mo15685a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent d;
        int i4;
        int i5;
        if (!this.f26827a || (d = m19832d(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f26830d.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i4 = iArr2[1];
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (iArr == null) {
            iArr = m19831c();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C1282pu.m19950a(d, this.f26830d, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f26830d.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i4;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }
}
