package p000;

import java.util.List;

/* renamed from: baet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baet extends cazu {

    /* renamed from: b */
    private final cazn f100566b;

    /* renamed from: c */
    private final cazn f100567c;

    /* renamed from: d */
    private final cazn f100568d;

    /* renamed from: e */
    private final cazn f100569e;

    /* renamed from: f */
    private final cazn f100570f;

    /* renamed from: g */
    private final cazn f100571g;

    /* renamed from: h */
    private final cijl f100572h;

    public baet(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3, cazn cazn4, cazn cazn5, cazn cazn6, cijl cijl3) {
        super(cijl2, cbag.m127657a(baet.class), cijl);
        this.f100566b = cbac.m127643a(cazn);
        this.f100567c = cbac.m127643a(cazn2);
        this.f100568d = cbac.m127643a(cazn3);
        this.f100569e = cbac.m127643a(cazn4);
        this.f100570f = cbac.m127643a(cazn5);
        this.f100571g = cbac.m127643a(cazn6);
        this.f100572h = cijl3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f100566b.mo75201b(), this.f100567c.mo75201b(), this.f100568d.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        boolean booleanValue = ((Boolean) list.get(0)).booleanValue();
        boolean booleanValue2 = ((Boolean) list.get(1)).booleanValue();
        byhm byhm = (byhm) list.get(2);
        cazn cazn = this.f100569e;
        cazn cazn2 = this.f100570f;
        cazn cazn3 = this.f100571g;
        cayo b = cayx.m127580b(this.f100572h);
        if (!booleanValue && !booleanValue2) {
            ((achw) b.mo16713a()).mo25418e("Sync called with both upload and download disabled.", new Object[0]);
            return bqga.m112775a(bpyi.f139852o);
        }
        byhm byhm2 = byhm.UNKNOWN;
        int ordinal = byhm.ordinal();
        if (ordinal == 1) {
            return cazn2.mo75201b();
        }
        if (ordinal == 2) {
            return cazn.mo75201b();
        }
        if (ordinal == 3) {
            return cazn3.mo75201b();
        }
        String valueOf = String.valueOf(byhm);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("Not syncing unsupported protocol ");
        sb.append(valueOf);
        throw new baqd(sb.toString(), 1);
    }
}
