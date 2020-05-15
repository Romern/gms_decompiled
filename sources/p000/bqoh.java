package p000;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: bqoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqoh implements bqoj {

    /* renamed from: a */
    final /* synthetic */ bqoc f141333a;

    /* renamed from: b */
    final /* synthetic */ bqnr f141334b;

    public bqoh(bqoc bqoc, bqnr bqnr) {
        this.f141333a = bqoc;
        this.f141334b = bqnr;
    }

    /* renamed from: a */
    public final bqnm mo69317a() {
        bqoc bqoc = this.f141333a;
        return new bqob(bqoc, this.f141334b, bqoc.f141316b);
    }

    /* renamed from: b */
    public final Class mo69319b() {
        return this.f141333a.getClass();
    }

    /* renamed from: c */
    public final Set mo69320c() {
        return this.f141333a.mo69301b();
    }

    /* renamed from: d */
    public final Class mo69321d() {
        return this.f141334b.getClass();
    }

    /* renamed from: a */
    public final bqnm mo69318a(Class cls) {
        try {
            return new bqob(this.f141333a, this.f141334b, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }
}
