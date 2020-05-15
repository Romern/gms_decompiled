package p000;

/* renamed from: agtf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agtf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ agth f66444a;

    public agtf(agth agth) {
        this.f66444a = agth;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r0 == p000.bygb.OPT_IN) goto L_0x006a;
     */
    public final void run() {
        String str;
        bxzx bxzx;
        boolean z = true;
        if (agqg.m54865t().booleanValue()) {
            if (!cfmj.m140161j() || agpk.m54726a().mo35843c() == null) {
                bxzx = agpk.m54726a().mo35850j(this.f66444a.f66452f);
            } else {
                bxzx = agpk.m54726a().mo35843c();
            }
            if (bxzx != null) {
                bygb a = bygb.m124774a(bxzx.f165204f);
                if (a == null) {
                    a = bygb.UNRECOGNIZED;
                }
                if (a != bygb.CONSENTED) {
                    if (cfmj.m140161j()) {
                        bygb a2 = bygb.m124774a(bxzx.f165204f);
                        if (a2 == null) {
                            a2 = bygb.UNRECOGNIZED;
                        }
                    }
                }
            }
            agth.f66447g.mo26019b(agyt.m55307c()).mo68405a("User has not consented yet. Will register with dummy data.");
            z = false;
        }
        agth agth = this.f66444a;
        if (!z) {
            str = "dummy_cpid_before_consent";
        } else {
            str = agth.f66451e;
        }
        agta agta = new agta();
        agta.f66418a = agth.f66449c;
        agta.f66419b = agth.f66448b.f80147a;
        agta.f66420c = Long.valueOf(agth.f66450d.f148030b);
        agta.f66421d = str;
        agta.f66422e = z;
        agta.f66425h = 4;
        agta.f66423f = agth.f66448b.f80149c;
        agta.mo36075a().mo36076a();
    }
}
