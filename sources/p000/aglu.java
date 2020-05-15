package p000;

/* renamed from: aglu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aglu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f65905a;

    /* renamed from: b */
    final /* synthetic */ agmb f65906b;

    public aglu(agmb agmb, long j) {
        this.f65906b = agmb;
        this.f65905a = j;
    }

    public final void run() {
        agmb agmb = this.f65906b;
        long j = this.f65905a;
        agmb.mo35241h();
        agmb.mo35652o();
        agmb.mo35497E().f65572k.mo35436a("Activity paused, time", Long.valueOf(j));
        aglx aglx = agmb.f65922e;
        if (aglx.f65912b.mo35538v().mo35314a(aghn.f65482ah)) {
            aglx.f65911a = new aglw(aglx, aglx.f65912b.mo35534A().mo20505a(), j);
            aglx.f65912b.f65919b.postDelayed(aglx.f65911a, 2000);
        }
        if (agmb.mo35538v().mo35326g().booleanValue()) {
            agmb.f65921d.mo35648b();
        }
        agma agma = agmb.f65920c;
        if (!agma.f65918a.mo35538v().mo35314a(aghn.f65492ar)) {
            agma.f65918a.mo35539w().f65634s.mo35456a(true);
        }
    }
}
