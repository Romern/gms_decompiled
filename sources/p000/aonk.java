package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: aonk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aonk extends aonl {

    /* renamed from: a */
    private final aonl[] f78575a;

    /* renamed from: b */
    private final int f78576b;

    public aonk(aonl... aonlArr) {
        this.f78575a = aonlArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            aonl[] aonlArr2 = this.f78575a;
            if (i < aonlArr2.length) {
                aonl aonl = aonlArr2[i];
                if (aonl != null) {
                    i2 += aonl.mo42055d();
                }
                i++;
            } else {
                this.f78576b = i2;
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo11412a(int i) {
        int i2 = 0;
        while (true) {
            aonl[] aonlArr = this.f78575a;
            if (i2 < aonlArr.length) {
                aonl aonl = aonlArr[i2];
                if (aonl != null) {
                    if (i < aonl.mo42055d()) {
                        return this.f78575a[i2].mo11412a(i);
                    }
                    i -= this.f78575a[i2].mo42055d();
                }
                i2++;
            } else {
                throw new IllegalStateException("Bad item index");
            }
        }
    }

    /* renamed from: b */
    public final Object mo11416b(int i) {
        int i2 = 0;
        while (true) {
            aonl[] aonlArr = this.f78575a;
            if (i2 < aonlArr.length) {
                aonl aonl = aonlArr[i2];
                if (aonl != null) {
                    if (i < aonl.mo42055d()) {
                        return this.f78575a[i2].mo11416b(i);
                    }
                    i -= this.f78575a[i2].mo42055d();
                }
                i2++;
            } else {
                throw new IllegalStateException("Bad item index");
            }
        }
    }

    /* renamed from: d */
    public final int mo42055d() {
        return this.f78576b;
    }

    /* renamed from: a */
    public final View mo42053a(int i, View view, ViewGroup viewGroup, boolean z) {
        int i2 = 0;
        while (true) {
            aonl[] aonlArr = this.f78575a;
            if (i2 < aonlArr.length) {
                aonl aonl = aonlArr[i2];
                if (aonl != null) {
                    if (i < aonl.mo42055d()) {
                        return this.f78575a[i2].mo42053a(i, view, viewGroup, z);
                    }
                    i -= this.f78575a[i2].mo42055d();
                }
                i2++;
            } else {
                throw new IllegalStateException("Bad item index");
            }
        }
    }

    /* renamed from: a */
    public final void mo43094a(ArrayList arrayList, int i) {
        int i2 = 0;
        while (true) {
            aonl[] aonlArr = this.f78575a;
            if (i2 < aonlArr.length) {
                aonl aonl = aonlArr[i2];
                if (aonl != null) {
                    aonl.mo43094a(arrayList, i);
                    i += this.f78575a[i2].mo42055d();
                }
                i2++;
            } else {
                return;
            }
        }
    }
}
