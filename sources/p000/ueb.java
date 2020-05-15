package p000;

import android.content.Context;
import com.felicanetworks.sdu.ErrorInfo;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: ueb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ueb extends ucg {

    /* renamed from: f */
    public static final sbw f47336f = new sbw("RequestSyncOperation", "");

    /* renamed from: g */
    private final vcg f47337g;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ucg.<init>(java.lang.String, ubk, uto, int, boolean):void
     arg types: [java.lang.String, ubk, uto, int, int]
     candidates:
      ucg.<init>(java.lang.String, ubk, uto, vcy, boolean):void
      ucg.<init>(java.lang.String, ubk, uto, int, boolean):void */
    public ueb(ubk ubk, uto uto, vcg vcg) {
        super("RequestSyncOperation", ubk, uto, 18, false);
        this.f47337g = vcg;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* renamed from: b */
    public final void mo27230b(Context context) {
        int i;
        uea uea = new uea(this);
        ubk ubk = this.f47237a;
        String str = ubk.f47143d.f47394a.f47682a;
        if (!ubk.mo27097f()) {
            i = 100;
        } else {
            i = ErrorInfo.TYPE_SDU_COMMUNICATIONERROR;
        }
        int a = this.f47337g.mo28218a(str, i, 1, Collections.singletonList(mo27233b().f47396c.f30764b));
        if (a == 0 || a == 1) {
            this.f47337g.mo28222a(str, uea);
        } else if (a == 2) {
            throw new aaaj(1507, "Sync request rate limit exceeded.");
        } else if (a != 3) {
            throw new aaaj(8, "Internal error while requesting sync.");
        } else {
            throw new aaaj(7, "Cannot request a sync while the device is offline.");
        }
    }
}
