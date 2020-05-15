package p000;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: akz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class akz {

    /* renamed from: a */
    public final Context f802a;

    /* renamed from: b */
    public final akx f803b;

    /* renamed from: c */
    public final akw f804c = new akw(this);

    /* renamed from: d */
    public akq f805d;

    /* renamed from: e */
    public akp f806e;

    /* renamed from: f */
    public boolean f807f;

    /* renamed from: g */
    public alb f808g;

    /* renamed from: h */
    public boolean f809h;

    public akz(Context context, akx akx) {
        if (context != null) {
            this.f802a = context;
            this.f803b = akx == null ? new akx(new ComponentName(context, getClass())) : akx;
            return;
        }
        throw new IllegalArgumentException("context must not be null");
    }

    /* renamed from: a */
    public aky mo945a(String str) {
        throw null;
    }

    /* renamed from: b */
    public akv mo950b(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    /* renamed from: b */
    public void mo951b(akp akp) {
    }

    /* renamed from: a */
    public aky mo946a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        } else if (str2 != null) {
            return mo945a(str);
        } else {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
    }

    /* renamed from: a */
    public final void mo947a(akp akp) {
        alw.m1051a();
        if (!C1239oe.m19757a(this.f806e, akp)) {
            this.f806e = akp;
            if (!this.f807f) {
                this.f807f = true;
                this.f804c.sendEmptyMessage(2);
            }
        }
    }

    /* renamed from: a */
    public final void mo948a(akq akq) {
        alw.m1051a();
        this.f805d = akq;
    }

    /* renamed from: a */
    public final void mo949a(alb alb) {
        alw.m1051a();
        if (this.f808g != alb) {
            this.f808g = alb;
            if (!this.f809h) {
                this.f809h = true;
                this.f804c.sendEmptyMessage(1);
            }
        }
    }
}
