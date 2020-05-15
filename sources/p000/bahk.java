package p000;

import java.util.List;

/* renamed from: bahk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bahk extends cazu {

    /* renamed from: b */
    private final cijl f100885b;

    /* renamed from: c */
    private final cazn f100886c;

    /* renamed from: d */
    private final cazn f100887d;

    /* renamed from: e */
    private final cazn f100888e;

    /* renamed from: f */
    private final cazn f100889f;

    public bahk(cijl cijl, cijl cijl2, cijl cijl3, cazn cazn, cazn cazn2, cazn cazn3, cazn cazn4) {
        super(cijl2, cbag.m127657a(bahk.class), cijl);
        this.f100885b = cijl3;
        this.f100886c = cbac.m127643a(cazn);
        this.f100887d = cbac.m127643a(cazn2);
        this.f100888e = cbac.m127643a(cazn3);
        this.f100889f = cbac.m127643a(cazn4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f100886c.mo75201b(), this.f100887d.mo75201b(), this.f100889f.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        byhn byhn;
        List list = (List) obj;
        cayo b = cayx.m127580b(this.f100885b);
        bygz bygz = (bygz) list.get(0);
        boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
        cazn cazn = this.f100888e;
        bara bara = (bara) list.get(2);
        if (booleanValue) {
            return cazn.mo75201b();
        }
        if (bygz.f166412a == 2) {
            byhn = (byhn) bygz.f166413b;
        } else {
            byhn = byhn.f166478e;
        }
        ((achw) b.mo16713a()).logVerbose("Changes download skipped for the local %s/%s InternalFootprintsTimeSeriesSyncVariant", Integer.valueOf(byhn.f166481b), Integer.valueOf(byhn.f166482c));
        bara.mo55899b(0);
        bara.mo55897a(0, 0);
        return bqga.m112775a((Object) null);
    }
}
