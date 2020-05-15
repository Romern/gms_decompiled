package p000;

/* renamed from: aglt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aglt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f65903a;

    /* renamed from: b */
    final /* synthetic */ agmb f65904b;

    public aglt(agmb agmb, long j) {
        this.f65904b = agmb;
        this.f65903a = j;
    }

    public final void run() {
        aglw aglw;
        agmb agmb = this.f65904b;
        long j = this.f65903a;
        agmb.mo35241h();
        agmb.mo35652o();
        agmb.mo35497E().f65572k.mo35436a("Activity resumed, time", Long.valueOf(j));
        aglx aglx = agmb.f65922e;
        aglx.f65912b.mo35241h();
        if (aglx.f65912b.mo35538v().mo35314a(aghn.f65482ah) && (aglw = aglx.f65911a) != null) {
            aglx.f65912b.f65919b.removeCallbacks(aglw);
        }
        if (aglx.f65912b.mo35538v().mo35314a(aghn.f65492ar)) {
            aglx.f65912b.mo35539w().f65634s.mo35456a(false);
        }
        if (agmb.mo35538v().mo35326g().booleanValue()) {
            aglz aglz = agmb.f65921d;
            aglz.f65917d.mo35241h();
            aglz.f65916c.mo35370c();
            aglz.f65914a = j;
            aglz.f65915b = j;
        }
        agma agma = agmb.f65920c;
        agma.f65918a.mo35241h();
        if (agma.f65918a.f65756y.mo35513q()) {
            if (!agma.f65918a.mo35538v().mo35314a(aghn.f65492ar)) {
                agma.f65918a.mo35539w().f65634s.mo35456a(false);
            }
            agma.mo35649a(agma.f65918a.mo35534A().mo20505a(), false);
        }
    }
}
