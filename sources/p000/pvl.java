package p000;

/* renamed from: pvl */
final /* synthetic */ class pvl implements Runnable {

    /* renamed from: a */
    private final pvq f40365a;

    /* renamed from: b */
    private final int f40366b;

    public pvl(pvq pvq, int i) {
        this.f40365a = pvq;
        this.f40366b = i;
    }

    public final void run() {
        pvq pvq = this.f40365a;
        int i = this.f40366b;
        qav qav = pvq.f40379n;
        StringBuilder sb = new StringBuilder(32);
        sb.append("onUnselect, reason = ");
        sb.append(i);
        boolean z = false;
        qav.mo23670a(sb.toString(), new Object[0]);
        pvq.f40376B = true;
        if (i == 2 || pvq.f40375A) {
            z = true;
        }
        pvq.mo23744c(z);
    }
}
