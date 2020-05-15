package p000;

import android.content.Context;

/* renamed from: pxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pxa extends pwz {

    /* renamed from: c */
    private final boolean f40548c;

    public pxa(pvd pvd, boolean z) {
        super("MuteRemoteDisplayOperation", pvd, null);
        this.f40548c = z;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        pvd pvd = this.f40546a;
        boolean z = this.f40548c;
        pvj pvj = pvd.f40342g;
        if (pvj != null) {
            pvj.f40384s.execute(new pvg(pvj, z));
        }
    }
}
