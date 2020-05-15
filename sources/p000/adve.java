package p000;

/* renamed from: adve */
final /* synthetic */ class adve implements bmxz {

    /* renamed from: a */
    private final int f62798a;

    public adve(int i) {
        this.f62798a = i;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        int i = this.f62798a;
        int i2 = ((bsji) obj).f144797a;
        int i3 = 6;
        if (i2 == 0) {
            i3 = 2;
        } else if (i2 == 2) {
            i3 = 4;
        } else if (i2 == 3) {
            i3 = 5;
        } else if (i2 != 4) {
            i3 = i2 != 5 ? i2 != 6 ? 0 : 8 : 7;
        }
        if (i3 == 0) {
            i3 = 1;
        }
        return i3 == i;
    }
}
