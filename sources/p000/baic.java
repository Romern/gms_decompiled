package p000;

import android.accounts.Account;

/* renamed from: baic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baic {

    /* renamed from: a */
    private final cijl f100939a;

    /* renamed from: b */
    private final cijl f100940b;

    /* renamed from: c */
    private final cijl f100941c;

    /* renamed from: d */
    private final cijl f100942d;

    public baic(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4) {
        m86928a(cijl, 1);
        this.f100939a = cijl;
        m86928a(cijl2, 2);
        this.f100940b = cijl2;
        m86928a(cijl3, 3);
        this.f100941c = cijl3;
        m86928a(cijl4, 4);
        this.f100942d = cijl4;
    }

    /* renamed from: a */
    private static void m86928a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }

    /* renamed from: a */
    public final baib mo55704a(String str, Account account, int i, int i2, badj badj) {
        babr babr = (babr) this.f100939a.mo6445a();
        m86928a(babr, 1);
        cayo cayo = (cayo) this.f100940b.mo6445a();
        m86928a(cayo, 2);
        bafj bafj = (bafj) this.f100941c.mo6445a();
        m86928a(bafj, 3);
        baok baok = (baok) this.f100942d.mo6445a();
        m86928a(baok, 4);
        m86928a(str, 5);
        m86928a(account, 6);
        m86928a(badj, 9);
        return new baib(babr, cayo, bafj, baok, str, account, i, i2, badj);
    }
}
