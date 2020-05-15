package p000;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: bqog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqog implements bqoj {

    /* renamed from: a */
    final /* synthetic */ bqnr f141332a;

    public bqog(bqnr bqnr) {
        this.f141332a = bqnr;
    }

    /* renamed from: a */
    public final bqnm mo69317a() {
        bqnr bqnr = this.f141332a;
        return new bqno(bqnr, bqnr.f141316b);
    }

    /* renamed from: b */
    public final Class mo69319b() {
        return this.f141332a.getClass();
    }

    /* renamed from: c */
    public final Set mo69320c() {
        return this.f141332a.mo69301b();
    }

    /* renamed from: d */
    public final Class mo69321d() {
        return null;
    }

    /* renamed from: a */
    public final bqnm mo69318a(Class cls) {
        try {
            return new bqno(this.f141332a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }
}
