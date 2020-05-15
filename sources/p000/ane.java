package p000;

import android.content.Context;
import android.media.MediaRouter;
import android.view.Display;

/* renamed from: ane */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class ane extends and implements alx {

    /* renamed from: r */
    private ame f1837r;

    /* renamed from: s */
    private amg f1838s;

    public ane(Context context, ang ang) {
        super(context, ang);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1062a(anb anb, akn akn) {
        super.mo1062a(anb, akn);
        if (!((MediaRouter.RouteInfo) anb.f960a).isEnabled()) {
            akn.f776a.putBoolean("enabled", false);
        }
        if (mo2197b(anb)) {
            akn.mo881a(1);
        }
        Display a = amh.m1080a(anb.f960a);
        if (a != null) {
            akn.mo892e(a.getDisplayId());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo2197b(anb anb) {
        if (this.f1838s == null) {
            this.f1838s = new amg();
        }
        Object obj = anb.f960a;
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo1069e() {
        super.mo1069e();
        if (this.f1837r == null) {
            this.f1837r = new ame();
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Object mo1071f() {
        return new amf(this);
    }
}
