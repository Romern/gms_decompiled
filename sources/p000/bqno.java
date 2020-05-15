package p000;

import java.security.GeneralSecurityException;

/* renamed from: bqno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bqno implements bqnm {

    /* renamed from: a */
    private final bqnr f141311a;

    /* renamed from: b */
    private final Class f141312b;

    public bqno(bqnr bqnr, Class cls) {
        if (bqnr.mo69301b().contains(cls) || Void.class.equals(cls)) {
            this.f141311a = bqnr;
            this.f141312b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", bqnr.toString(), cls.getName()));
    }

    /* renamed from: b */
    private final Object m113036b(bxxc bxxc) {
        if (!Void.class.equals(this.f141312b)) {
            this.f141311a.mo69300a(bxxc);
            return this.f141311a.mo69298a(bxxc, this.f141312b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    /* renamed from: c */
    private final bqnn m113037c() {
        return new bqnn(this.f141311a.mo69302c());
    }

    /* renamed from: a */
    public final Object mo69286a(bxtx bxtx) {
        try {
            return m113036b(this.f141311a.mo69297a(bxtx));
        } catch (bxwf e) {
            String valueOf = String.valueOf(this.f141311a.f141315a.getName());
            throw new GeneralSecurityException(valueOf.length() == 0 ? new String("Failures parsing proto of type ") : "Failures parsing proto of type ".concat(valueOf), e);
        }
    }

    /* renamed from: b */
    public final Class mo69290b() {
        return this.f141312b;
    }

    /* renamed from: c */
    public final bqsd mo69291c(bxtx bxtx) {
        try {
            bxxc a = m113037c().mo69292a(bxtx);
            bxvd da = bqsd.f141509d.mo74144da();
            String a2 = mo69288a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a2.getClass();
            ((bqsd) da.f164949b).f141511a = a2;
            bxtx aL = a.mo73639aL();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aL.getClass();
            ((bqsd) da.f164949b).f141512b = aL;
            int d = this.f141311a.mo69303d();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bqsd) da.f164949b).f141513c = bqsc.m113308a(d);
            return (bqsd) da.mo74062i();
        } catch (bxwf e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    /* renamed from: a */
    public final Object mo69287a(bxxc bxxc) {
        String valueOf = String.valueOf(this.f141311a.f141315a.getName());
        String str = valueOf.length() == 0 ? new String("Expected proto of type ") : "Expected proto of type ".concat(valueOf);
        if (this.f141311a.f141315a.isInstance(bxxc)) {
            return m113036b(bxxc);
        }
        throw new GeneralSecurityException(str);
    }

    /* renamed from: b */
    public final bxxc mo69289b(bxtx bxtx) {
        try {
            return m113037c().mo69292a(bxtx);
        } catch (bxwf e) {
            String valueOf = String.valueOf(this.f141311a.mo69302c().f141313a.getName());
            throw new GeneralSecurityException(valueOf.length() == 0 ? new String("Failures parsing proto of type ") : "Failures parsing proto of type ".concat(valueOf), e);
        }
    }

    /* renamed from: a */
    public final String mo69288a() {
        return this.f141311a.mo69299a();
    }
}
