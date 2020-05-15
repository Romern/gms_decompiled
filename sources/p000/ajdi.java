package p000;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: ajdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajdi extends aixg {

    /* renamed from: b */
    public static final /* synthetic */ int f70382b = 0;

    /* renamed from: c */
    private static final rjo f70383c = new rjo("Nearby.MESSAGES_API", f70385e, f70384d);

    /* renamed from: d */
    private static final rje f70384d = new rje();

    /* renamed from: e */
    private static final rjl f70385e = new ajcy();

    /* renamed from: a */
    public final int f70386a;

    public ajdi(Context context, aixi aixi) {
        super(context, f70383c, aixi, rjw.f43159a);
        this.f70386a = ajct.m58517a(context);
    }

    /* renamed from: a */
    private final aucb m58542a(ajdf ajdf) {
        return mo24732b(new ajde(this, ajdf));
    }

    /* renamed from: e */
    public final aucb mo38207e(PendingIntent pendingIntent) {
        sdo.m34959a(pendingIntent);
        return m58542a((ajdf) new ajcx(pendingIntent));
    }

    /* renamed from: g */
    public final sar mo24747g() {
        String str;
        sar g = super.mo24747g();
        rjk rjk = this.f43171z;
        if (!(rjk == null || (str = ((aixi) rjk).f69984e) == null)) {
            g.f43959c = str;
        }
        return g;
    }

    /* renamed from: a */
    private final rod m58543a(Object obj) {
        if (obj != null) {
            return mo24714a(obj, obj.getClass().getName());
        }
        return null;
    }

    /* renamed from: a */
    public final aucb mo38204a(aixf aixf) {
        sdo.m34959a(aixf);
        aucf aucf = new aucf();
        mo24698a(roe.m34171a(aixf, aixf.getClass().getName())).mo50371a(new ajdb(aucf));
        return aucf.f91388a;
    }

    /* renamed from: a */
    public final aucb mo38205a(aixf aixf, aiym aiym) {
        boolean z;
        sdo.m34959a(aixf);
        sdo.m34959a(aiym);
        if (aiym.f70075a.f80697j == 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Strategy.setBackgroundScanMode() is only supported by background subscribe (the version which takes a PendingIntent).");
        rod a = m58543a((Object) aixf);
        rod a2 = m58543a((Object) aiym.f70077c);
        ajcu ajcu = new ajcu(this, a, new ajcz(this, a2, a2), aiym);
        ajcv ajcv = new ajcv(a);
        ajdc ajdc = new ajdc(this, a, ajcu);
        rob rob = a.f43429b;
        sdo.m34966a(rob, "Key must not be null");
        return mo24699a(ajdc, new ajdd(this, rob, ajcv));
    }

    /* renamed from: a */
    public final aucb mo38206a(PendingIntent pendingIntent, aiym aiym) {
        ajdh ajdh;
        sdo.m34959a(pendingIntent);
        sdo.m34959a(aiym);
        rod a = m58543a((Object) aiym.f70077c);
        if (a != null) {
            ajdh = new ajdh(a);
        } else {
            ajdh = null;
        }
        return m58542a((ajdf) new ajcw(pendingIntent, ajdh, aiym));
    }

    /* renamed from: a */
    public final rod mo38505a(aucf aucf) {
        return mo24714a(new ajda(aucf), Status.class.getName());
    }
}
