package p000;

/* renamed from: pws */
final /* synthetic */ class pws implements Runnable {

    /* renamed from: a */
    private final pwt f40527a;

    public pws(pwt pwt) {
        this.f40527a = pwt;
    }

    public final void run() {
        pwt pwt = this.f40527a;
        boolean a = pwt.mo23784a();
        int i = pwt.f40534f + 1;
        pwt.f40534f = i;
        if (a != pwt.f40533e || i > pwt.f40528a) {
            pwt.f40534f = 0;
            if (a != pwt.f40533e) {
                pwt.f40532d.mo23670a("muting remote display: %b", Boolean.valueOf(!a));
            }
            pwt.f40533e = a;
            boolean z = !a;
            pwt.f40532d.mo23670a("muteRemoteDisplay. isMuted:%b", Boolean.valueOf(z));
            pwt.f40531c.mo16658a(new pxa(pwt.f40530b, z));
        }
    }
}
