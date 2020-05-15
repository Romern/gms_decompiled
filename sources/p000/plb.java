package p000;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: plb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class plb implements pue {

    /* renamed from: a */
    final /* synthetic */ pld f39554a;

    public plb(pld pld) {
        this.f39554a = pld;
    }

    /* renamed from: a */
    public final void mo23351a(long j, int i, Object obj) {
        if (i != 0) {
            pld pld = this.f39554a;
            pld.f40173s.mo23677d("onStatusRequestFailed: castStatusCode=%s", pew.m30274a(i));
            pjc pjc = pld.f39573r;
            AtomicLong atomicLong = pjc.f39271d;
            if (pjc.f39329r != null) {
                if (!pjc.f39272A.mo23355a()) {
                    pjc pjc2 = pld.f39573r;
                    pjc2.mo23235a(i, pjc2.f39329r, pjc2.f39330s);
                } else {
                    pld.f39573r.mo23252d(false);
                }
                pjc pjc3 = pld.f39573r;
                pjc3.f39329r = null;
                pjc3.f39330s = null;
            }
        }
    }

    /* renamed from: i */
    public final void mo23352i() {
    }
}
