package p000;

import com.google.android.gms.mdh.SyncPolicy;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.SyncSubPolicy;

/* renamed from: accu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class accu {
    /* renamed from: a */
    public static bacu m48907a(SyncPolicy syncPolicy) {
        bact i = bacu.m86595i();
        i.mo55593a(syncPolicy.f79995a);
        i.mo55594a(m48908a(syncPolicy.f79998d));
        i.mo55596b(m48908a(syncPolicy.f79999e));
        i.mo55598c(m48908a(syncPolicy.f79996b));
        i.mo55599d(m48908a(syncPolicy.f79997c));
        i.f100497a = syncPolicy.f80000f;
        i.mo55595a(syncPolicy.f80001g);
        i.mo55597b(syncPolicy.f80002h);
        return i.mo55592a();
    }

    /* renamed from: a */
    public static bacx m48908a(SyncSubPolicy syncSubPolicy) {
        bacw c = bacx.m86611c();
        c.mo55602a(syncSubPolicy.f80006a);
        c.mo55601a(syncSubPolicy.f80007b);
        return c.mo55600a();
    }

    /* renamed from: a */
    public static SyncStatus m48909a(bacv bacv) {
        return new SyncStatus(bacv.mo55581a(), bacv.mo55582b(), bacv.mo55583c());
    }
}
