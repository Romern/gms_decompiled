package p000;

/* renamed from: yeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yeg {
    /* renamed from: a */
    static yey m43886a(caae caae) {
        return m43887a(caae, -1);
    }

    /* renamed from: a */
    static yey m43887a(caae caae, int i) {
        caah caah = caae.f172330f;
        if (caah == null) {
            caah = caah.f172333d;
        }
        bxwc bxwc = caah.f172337c;
        yeo[] yeoArr = new yeo[bxwc.size()];
        int i2 = 0;
        while (i2 < bxwc.size()) {
            yeoArr[i2] = i2 != i ? new yem(i2) : new yes(i2);
            i2++;
        }
        return new yey(caae, yeoArr);
    }
}
