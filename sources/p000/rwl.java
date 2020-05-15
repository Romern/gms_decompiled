package p000;

/* renamed from: rwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rwl extends rvd {
    public rwl() {
        super("LogRecentFixes", 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25188a(rvl rvl) {
        return !rvl.f43761c.mo25217a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final rvl mo25189b(rvl rvl) {
        Throwable th;
        ruf ruf = new ruf();
        try {
            for (ruk ruk : ruf.mo25178b()) {
                rwg rwg = rvl.f43761c;
                bpuk bpuk = (bpuk) bput.f139284e.mo74144da();
                bpun bpun = ruk.f43709h;
                if (bpuk.f164950c) {
                    bpuk.mo74035c();
                    bpuk.f164950c = false;
                }
                bput bput = (bput) bpuk.f164949b;
                bput.f139287b = bpun.f139268j;
                bput.f139286a |= 1;
                bxvd da = bpul.f139253c.mo74144da();
                String str = ruk.f43703b;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpul bpul = (bpul) da.f164949b;
                str.getClass();
                bpul.f139255a |= 1;
                bpul.f139256b = str;
                if (bpuk.f164950c) {
                    bpuk.mo74035c();
                    bpuk.f164950c = false;
                }
                bput bput2 = (bput) bpuk.f164949b;
                bpul bpul2 = (bpul) da.mo74062i();
                bpul2.getClass();
                bput2.f139288c = bpul2;
                bput2.f139286a |= 2;
                bxvd da2 = bpus.f139278e.mo74144da();
                String str2 = ruk.f43704c;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpus bpus = (bpus) da2.f164949b;
                str2.getClass();
                bpus.f139280a |= 1;
                bpus.f139281b = str2;
                int a = bpur.m112304a((int) ruk.f43708g);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpus bpus2 = (bpus) da2.f164949b;
                int i = a - 1;
                if (a != 0) {
                    bpus2.f139282c = i;
                    int i2 = bpus2.f139280a | 2;
                    bpus2.f139280a = i2;
                    if ((i2 & 2) == 0) {
                        bpus2.f139282c = 0;
                        bpus2.f139280a = i2 | 2;
                    }
                    if (bpuk.f164950c) {
                        bpuk.mo74035c();
                        bpuk.f164950c = false;
                    }
                    bput bput3 = (bput) bpuk.f164949b;
                    bpus bpus3 = (bpus) da2.mo74062i();
                    bpus3.getClass();
                    bput3.mo68990a();
                    bput3.f139289d.add(bpus3);
                    rwg.mo25216a((bput) bpuk.mo74062i());
                    ruf.mo25177a(new ruk(ruk.f43702a, ruk.f43703b, ruk.f43704c, ruk.f43705d, ruk.f43706e, ruk.f43708g, ruk.f43709h, false, ruk.f43707f));
                } else {
                    throw null;
                }
            }
            ruf.close();
            rvk d = rvl.mo25205d();
            d.mo25199a(this, 3);
            return d.mo25198a();
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
        throw th;
    }
}
