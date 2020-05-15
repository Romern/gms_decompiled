package p000;

import android.os.Bundle;
import com.google.android.gms.auth.managed.services.EmmChimeraService;

/* renamed from: jgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jgd extends jgb implements aaai {

    /* renamed from: a */
    private final EmmChimeraService f22405a;

    /* renamed from: b */
    private final aaag f22406b;

    public jgd(EmmChimeraService emmChimeraService, aaag aaag) {
        this.f22405a = emmChimeraService;
        this.f22406b = aaag;
    }

    /* renamed from: a */
    public final void mo13709a(jfz jfz, String str, Bundle bundle) {
        this.f22406b.mo16659a(this.f22405a, new jgf(jfz, str, bundle));
    }

    /* renamed from: a */
    public final void mo13710a(jfz jfz, String str, String str2) {
        this.f22406b.mo16659a(this.f22405a, new jge(jfz, str, str2));
    }
}
