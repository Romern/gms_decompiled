package p000;

import java.util.Collections;
import java.util.Set;

/* renamed from: bqof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqof implements bqoj {

    /* renamed from: a */
    final /* synthetic */ bqnm f141331a;

    public bqof(bqnm bqnm) {
        this.f141331a = bqnm;
    }

    /* renamed from: a */
    public final bqnm mo69317a() {
        return this.f141331a;
    }

    /* renamed from: b */
    public final Class mo69319b() {
        return this.f141331a.getClass();
    }

    /* renamed from: c */
    public final Set mo69320c() {
        return Collections.singleton(this.f141331a.mo69290b());
    }

    /* renamed from: d */
    public final Class mo69321d() {
        return null;
    }

    /* renamed from: a */
    public final bqnm mo69318a(Class cls) {
        if (this.f141331a.mo69290b().equals(cls)) {
            return this.f141331a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }
}
