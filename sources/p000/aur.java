package p000;

import android.graphics.Matrix;
import java.util.ArrayList;

/* renamed from: aur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aur extends aus {

    /* renamed from: a */
    final Matrix f2293a = new Matrix();

    /* renamed from: b */
    final ArrayList f2294b = new ArrayList();

    /* renamed from: c */
    float f2295c = 0.0f;

    /* renamed from: d */
    public float f2296d = 0.0f;

    /* renamed from: e */
    public float f2297e = 0.0f;

    /* renamed from: f */
    public float f2298f = 1.0f;

    /* renamed from: g */
    public float f2299g = 1.0f;

    /* renamed from: h */
    public float f2300h = 0.0f;

    /* renamed from: i */
    public float f2301i = 0.0f;

    /* renamed from: j */
    final Matrix f2302j = new Matrix();

    /* renamed from: k */
    int f2303k;

    /* renamed from: l */
    public int[] f2304l;

    /* renamed from: m */
    public String f2305m = null;

    /* renamed from: a */
    public final void mo2602a() {
        this.f2302j.reset();
        this.f2302j.postTranslate(-this.f2296d, -this.f2297e);
        this.f2302j.postScale(this.f2298f, this.f2299g);
        this.f2302j.postRotate(this.f2295c, 0.0f, 0.0f);
        this.f2302j.postTranslate(this.f2300h + this.f2296d, this.f2301i + this.f2297e);
    }

    /* renamed from: b */
    public final boolean mo2585b() {
        for (int i = 0; i < this.f2294b.size(); i++) {
            if (((aus) this.f2294b.get(i)).mo2585b()) {
                return true;
            }
        }
        return false;
    }

    public String getGroupName() {
        return this.f2305m;
    }

    public Matrix getLocalMatrix() {
        return this.f2302j;
    }

    public float getPivotX() {
        return this.f2296d;
    }

    public float getPivotY() {
        return this.f2297e;
    }

    public float getRotation() {
        return this.f2295c;
    }

    public float getScaleX() {
        return this.f2298f;
    }

    public float getScaleY() {
        return this.f2299g;
    }

    public float getTranslateX() {
        return this.f2300h;
    }

    public float getTranslateY() {
        return this.f2301i;
    }

    public void setPivotX(float f) {
        if (f != this.f2296d) {
            this.f2296d = f;
            mo2602a();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f2297e) {
            this.f2297e = f;
            mo2602a();
        }
    }

    public void setRotation(float f) {
        if (f != this.f2295c) {
            this.f2295c = f;
            mo2602a();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f2298f) {
            this.f2298f = f;
            mo2602a();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f2299g) {
            this.f2299g = f;
            mo2602a();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f2300h) {
            this.f2300h = f;
            mo2602a();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f2301i) {
            this.f2301i = f;
            mo2602a();
        }
    }

    public aur() {
    }

    /* renamed from: a */
    public final boolean mo2584a(int[] iArr) {
        boolean z = false;
        for (int i = 0; i < this.f2294b.size(); i++) {
            z |= ((aus) this.f2294b.get(i)).mo2584a(iArr);
        }
        return z;
    }

    public aur(aur aur, C1223np npVar) {
        aut aut;
        this.f2295c = aur.f2295c;
        this.f2296d = aur.f2296d;
        this.f2297e = aur.f2297e;
        this.f2298f = aur.f2298f;
        this.f2299g = aur.f2299g;
        this.f2300h = aur.f2300h;
        this.f2301i = aur.f2301i;
        int[] iArr = aur.f2304l;
        this.f2304l = null;
        String str = aur.f2305m;
        this.f2305m = str;
        int i = aur.f2303k;
        this.f2303k = 0;
        if (str != null) {
            npVar.put(str, this);
        }
        this.f2302j.set(aur.f2302j);
        ArrayList arrayList = aur.f2294b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof aur) {
                this.f2294b.add(new aur((aur) obj, npVar));
            } else {
                if (obj instanceof auq) {
                    aut = new auq((auq) obj);
                } else if (obj instanceof aup) {
                    aut = new aup((aup) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f2294b.add(aut);
                String str2 = aut.f2307n;
                if (str2 != null) {
                    npVar.put(str2, aut);
                }
            }
        }
    }
}
