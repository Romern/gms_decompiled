package p000;

/* renamed from: ilf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ilf {
    /* renamed from: a */
    public static ild m15648a(bypc bypc) {
        bypb bypb = bypc.f167310d;
        if (bypb == null) {
            bypb = bypb.f167289p;
        }
        int a = byoj.m125028a(bypb.f167293c);
        if (a == 0) {
            a = 1;
        }
        if (a == 2) {
            bypb bypb2 = bypc.f167310d;
            if (bypb2 == null) {
                bypb2 = bypb.f167289p;
            }
            byod a2 = byod.m125020a(bypb2.f167296f);
            if (a2 == null) {
                a2 = byod.START_ACTIVITY;
            }
            if (a2 == byod.GENERIC_NOTIFICATION) {
                bypb bypb3 = bypc.f167310d;
                if (bypb3 == null) {
                    bypb3 = bypb.f167289p;
                }
                byoa byoa = bypb3.f167301l;
                if (byoa == null) {
                    byoa = byoa.f167173e;
                }
                if (byoa.f167176b.size() == 1) {
                    return new ilc(bypc);
                }
            }
            return new ilb(bypc);
        }
        String valueOf = String.valueOf(byoj.m125029b(a));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("Unsupported prompt type: ");
        sb.append(valueOf);
        throw new ile(sb.toString());
    }
}
