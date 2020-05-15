package p000;

/* renamed from: agmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agmh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ agmo f65932a;

    /* renamed from: b */
    final /* synthetic */ agmn f65933b;

    public agmh(agmn agmn, agmo agmo) {
        this.f65933b = agmn;
        this.f65932a = agmo;
    }

    public final void run() {
        agmn agmn = this.f65933b;
        agmo agmo = this.f65932a;
        agmn.mo35694r();
        agdl agdl = new agdl(agmn);
        agdl.mo35660r();
        agmn.f65948b = agdl;
        agmn.mo35680d().f65293a = agmn.f65947a;
        agdd agdd = new agdd(agmn);
        agdd.mo35660r();
        agmn.f65951e = agdd;
        agkr c = agmo.mo35706c(agmn);
        c.mo35660r();
        agmn.f65952f = c;
        agme b = agmo.mo35705b(agmn);
        b.mo35660r();
        agmn.f65950d = b;
        agmn.f65949c = new agik(agmn);
        if (agmn.f65957k != agmn.f65958l) {
            agmn.mo35497E().f65564c.mo35437a("Not all upload components initialized", Integer.valueOf(agmn.f65957k), Integer.valueOf(agmn.f65958l));
        }
        agmn.f65954h = true;
        agmn agmn2 = this.f65933b;
        agmn2.mo35694r();
        agmn2.mo35684h().mo35364k();
        if (agmn2.mo35681e().f65619d.mo35458a() == 0) {
            agmn2.mo35681e().f65619d.mo35459a(agmn2.mo35691o().mo20505a());
        }
        agmn2.mo35699w();
    }
}
