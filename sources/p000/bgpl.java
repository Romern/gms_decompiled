package p000;

/* renamed from: bgpl */
final /* synthetic */ class bgpl implements Runnable {

    /* renamed from: a */
    private final bgpo f117201a;

    /* renamed from: b */
    private final bsax f117202b;

    public bgpl(bgpo bgpo, bsax bsax) {
        this.f117201a = bgpo;
        this.f117202b = bsax;
    }

    public final void run() {
        bfne bfne;
        bgpo bgpo = this.f117201a;
        bsax bsax = this.f117202b;
        bgpm bgpm = bgpo.f117209c;
        if (bgpm != null) {
            bffy bffy = bgpm.f117203a;
            if (bffy.f113728a != null) {
                bwdg a = bffy.mo61637a("g:loc/uil", bsax);
                bffx bffx = new bffx();
                synchronized (bffy.f113729b) {
                    bmxy.m108601b(!bffy.f113729b.containsKey(a), "Duplicated request.");
                    bffy.f113729b.put(a, bffx);
                }
                bffy.f113728a.mo73469a(a);
                while (bffx.f113727b == null) {
                    try {
                        bffx.f113726a.await();
                        break;
                    } catch (InterruptedException e) {
                    }
                }
                bfne = bffx.f113727b;
            } else {
                bfne = bfne.m97311a(null, "Could not initialize MASF service.");
            }
            bffy.m96629a((bsax) bfne.f114467a, (String) bfne.f114468b);
        }
    }
}
