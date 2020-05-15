package p000;

import android.content.Context;
import java.util.Random;

/* renamed from: acjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acjf {

    /* renamed from: a */
    private final cijl f59981a;

    /* renamed from: b */
    private final cijl f59982b;

    /* renamed from: c */
    private final cijl f59983c;

    public acjf(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4, cijl cijl5) {
        m49218a(cijl, 1);
        this.f59981a = cijl;
        m49218a(cijl2, 2);
        this.f59982b = cijl2;
        m49218a(cijl3, 3);
        m49218a(cijl4, 4);
        this.f59983c = cijl4;
        m49218a(cijl5, 5);
    }

    /* renamed from: a */
    private static void m49218a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }

    /* renamed from: a */
    public final acje mo32791a(ayuj ayuj, String str) {
        Context context = (Context) this.f59981a.mo6445a();
        m49218a(context, 1);
        aeat aeat = (aeat) this.f59982b.mo6445a();
        m49218a(aeat, 2);
        String b = acki.m49314b();
        m49218a(b, 3);
        Random random = (Random) this.f59983c.mo6445a();
        m49218a(random, 4);
        accv b2 = accx.m48946b();
        m49218a(b2, 5);
        m49218a(ayuj, 6);
        m49218a(str, 7);
        return new acje(context, aeat, b, random, b2, ayuj, str);
    }
}
