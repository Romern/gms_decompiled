package p000;

/* renamed from: yef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yef {
    /* renamed from: a */
    static yeo m43884a(int i, caal caal) {
        int a = caak.m126415a(caal.f172343c);
        if (a == 0) {
            a = 1;
        }
        if (a == 1) {
            return new yes(i);
        }
        if (a == 2) {
            return new yer(i);
        }
        if (a == 4) {
            return new yeu(i);
        }
        String valueOf = String.valueOf(caal.f172342b);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Can't aggregate field ") : "Can't aggregate field ".concat(valueOf));
    }

    /* renamed from: a */
    public static yey m43885a(caae caae) {
        caah caah = caae.f172330f;
        if (caah == null) {
            caah = caah.f172333d;
        }
        bxwc bxwc = caah.f172337c;
        yeo[] yeoArr = new yeo[bxwc.size()];
        for (int i = 0; i < bxwc.size(); i++) {
            yeoArr[i] = m43884a(i, (caal) bxwc.get(i));
        }
        return new yey(caae, yeoArr);
    }
}
