package p000;

import android.os.Bundle;

/* renamed from: aglv */
final /* synthetic */ class aglv implements Runnable {

    /* renamed from: a */
    private final aglw f65907a;

    public aglv(aglw aglw) {
        this.f65907a = aglw;
    }

    public final void run() {
        aglw aglw = this.f65907a;
        aglx aglx = aglw.f65910c;
        long j = aglw.f65908a;
        long j2 = aglw.f65909b;
        aglx.f65912b.mo35241h();
        aglx.f65912b.mo35497E().f65571j.mo35435a("Application going to the background");
        if (aglx.f65912b.mo35538v().mo35314a(aghn.f65492ar)) {
            aglx.f65912b.mo35539w().f65634s.mo35456a(true);
        }
        if (!aglx.f65912b.mo35538v().mo35326g().booleanValue()) {
            aglx.f65912b.f65921d.mo35648b();
            aglx.f65912b.mo35651a(false, false, j2);
        }
        aglx.f65912b.mo35239f().mo35567a("auto", "_ab", j, new Bundle());
    }
}
