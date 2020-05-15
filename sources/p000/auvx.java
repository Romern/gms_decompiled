package p000;

import android.os.Bundle;

/* renamed from: auvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auvx implements rjz {

    /* renamed from: a */
    final /* synthetic */ auwc f92627a;

    public auvx(auwc auwc) {
        this.f92627a = auwc;
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        auwc.f92631a.mo50711a("AR API client connection is suppended during removing AR request.", new Object[0]);
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        auwc.f92631a.mo50711a("AR client connected for removing request", new Object[0]);
        auwc auwc = this.f92627a;
        if (((Boolean) auwc.f92645o.mo6606a()).booleanValue()) {
            aucb a = auwc.f92649s.mo24679a(auwc.f92638h);
            a.mo50373a(auvu.f92624a);
            a.mo50372a(auvv.f92625a);
            return;
        }
        rjo rjo = aefo.f63329a;
        aeja.m51917a(auwc.f92644n, auwc.f92638h).mo9458a(new auwa(auwc));
        auwc.f92644n.mo24796b(auwc.f92648r);
        auwc.f92644n.mo24803g();
    }
}
