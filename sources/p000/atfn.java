package p000;

import android.content.Context;

/* renamed from: atfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atfn implements brfg {

    /* renamed from: a */
    final /* synthetic */ brff f90246a;

    /* renamed from: b */
    public final /* synthetic */ atfo f90247b;

    public atfn(atfo atfo, brff brff) {
        this.f90247b = atfo;
        this.f90246a = brff;
    }

    /* renamed from: a */
    public final void mo49924a(Context context) {
        this.f90247b.f90248a.post(new atfl(this, context, this.f90246a));
    }
}
