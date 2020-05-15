package p000;

/* renamed from: bclj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bclj {
    /* renamed from: a */
    public static bcsz m89242a(cbdr cbdr) {
        bcsy f = bcsz.m89872f();
        f.mo57491b(cbdr.f176778b);
        f.mo57492c(cbdr.f176779c);
        f.mo57490a(cbdr.f176777a.getKey());
        f.mo57489a(cbdr.f176781e);
        bzrt bzrt = cbdr.f176780d;
        if (bzrt != null) {
            f.mo57488a(bclc.m89223a(bzrt));
        }
        return f.mo57487a();
    }

    /* renamed from: a */
    public static cbdr m89243a(bcsz bcsz) {
        bxvd da = cbdr.f176775f.mo74144da();
        ByteString a = ByteString.m123261a(bcsz.mo57340a());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((cbdr) da.f164949b).f176777a = a;
        int c = bcsz.mo57342c();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbdr) da.f164949b).f176778b = c;
        int b = bcsz.mo57341b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbdr) da.f164949b).f176779c = b;
        String e = bcsz.mo57344e();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        e.getClass();
        ((cbdr) da.f164949b).f176781e = e;
        if (bcsz.mo57343d().mo66813a()) {
            bzrt a2 = bclc.m89224a(((Integer) bcsz.mo57343d().mo66814b()).intValue());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a2.getClass();
            ((cbdr) da.f164949b).f176780d = a2;
        }
        return (cbdr) da.mo74062i();
    }
}
