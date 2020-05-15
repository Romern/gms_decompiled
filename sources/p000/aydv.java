package p000;

/* renamed from: aydv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aydv {

    /* renamed from: a */
    public final aydu[] f97260a;

    public aydv(Long[] lArr) {
        aydu[] ayduArr = new aydu[lArr.length];
        this.f97260a = ayduArr;
        int length = ayduArr.length;
        for (int i = 0; i < length; i++) {
            if (lArr[i].longValue() > 0) {
                this.f97260a[i] = new aydy(lArr[i]);
            } else {
                this.f97260a[i] = new aydz();
            }
        }
    }
}
