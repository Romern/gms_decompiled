package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: prr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class prr extends aaab {

    /* renamed from: a */
    private final ssh f40115a;

    /* renamed from: b */
    private final pnl f40116b;

    /* renamed from: c */
    private final prm f40117c;

    /* renamed from: d */
    private final qav f40118d = new qav("RCNEnabledOperation");

    public prr(ssh ssh, pnl pnl, prm prm) {
        super(122, "GetRCNEnabledStatusOperation");
        this.f40115a = ssh;
        this.f40116b = pnl;
        this.f40117c = prm;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        boolean z;
        boolean z2 = true;
        try {
            z = this.f40115a.mo26045d();
        } catch (SecurityException e) {
            this.f40118d.mo23676c(e, "Failed to get result from isManagedProfile()", new Object[0]);
            z = true;
        }
        if (!qay.m31789c()) {
            z2 = false;
        } else if (z || !this.f40116b.mo23494d()) {
            z2 = false;
        }
        this.f40117c.mo23580a(z2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f40117c.mo23579a(status);
    }
}
