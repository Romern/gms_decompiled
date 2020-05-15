package p000;

/* renamed from: anit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anit {

    /* renamed from: a */
    int f76959a = 0;

    /* renamed from: b */
    int f76960b = 0;

    /* renamed from: c */
    int f76961c = 0;

    /* renamed from: d */
    int f76962d = 0;

    /* renamed from: e */
    int f76963e = 0;

    /* renamed from: f */
    int f76964f = 0;

    /* renamed from: g */
    int f76965g = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo41849a() {
        int i = this.f76962d;
        if (!(i == 1 && this.f76961c == 1 && (this.f76963e == 0 || this.f76965g == 1))) {
            if (this.f76959a <= 0) {
                return false;
            }
            int i2 = this.f76961c;
            if (i2 != 1) {
                if (i2 > 1) {
                    return this.f76960b == 0 || mo41850b() == 0;
                }
                return false;
            } else if (!(i == 0 && this.f76960b == 0)) {
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo41850b() {
        return this.f76963e - this.f76965g;
    }
}
