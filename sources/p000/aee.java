package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: aee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aee {

    /* renamed from: a */
    int f326a = 0;

    /* renamed from: b */
    int f327b;

    /* renamed from: c */
    int f328c;

    /* renamed from: d */
    int f329d;

    /* renamed from: e */
    int f330e;

    /* renamed from: a */
    static final int m596a(int i, int i2) {
        if (i <= i2) {
            return i != i2 ? 4 : 2;
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo521a() {
        this.f326a = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo522a(int i) {
        this.f326a = i | this.f326a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo523a(int i, int i2, int i3, int i4) {
        this.f327b = i;
        this.f328c = i2;
        this.f329d = i3;
        this.f330e = i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo524b() {
        int i = this.f326a;
        if ((i & 7) != 0 && (i & m596a(this.f329d, this.f327b)) == 0) {
            return false;
        }
        int i2 = this.f326a;
        if ((i2 & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS) != 0 && (i2 & (m596a(this.f329d, this.f328c) << 4)) == 0) {
            return false;
        }
        int i3 = this.f326a;
        if ((i3 & 1792) != 0 && (i3 & (m596a(this.f330e, this.f327b) << 8)) == 0) {
            return false;
        }
        int i4 = this.f326a;
        if ((i4 & 28672) == 0 || (i4 & (m596a(this.f330e, this.f328c) << 12)) != 0) {
            return true;
        }
        return false;
    }
}
