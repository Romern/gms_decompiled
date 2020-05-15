package p000;

import com.google.android.gms.contextmanager.ContextData;

/* renamed from: drm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class drm extends tjc {

    /* renamed from: CH */
    private final String f13882CH;

    /* renamed from: a */
    public final dqb f13883a;

    public drm(dqb dqb, String str) {
        sdo.m34959a(dqb);
        this.f13883a = dqb;
        this.f13882CH = str;
    }

    /* renamed from: a */
    public final void mo9499a(ContextData contextData) {
        this.f13883a.mo9435a(new drl(this, contextData), dqy.m9123a(String.valueOf(this.f13882CH).concat("_receive")));
    }

    /* renamed from: b */
    public abstract void mo9500b(ContextData contextData);
}
