package p000;

import com.google.android.chimera.Activity;
import java.util.List;

/* renamed from: wde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wde extends cazu {

    /* renamed from: b */
    private final cazn f50535b;

    /* renamed from: c */
    private final cazn f50536c;

    /* renamed from: d */
    private final cazn f50537d;

    /* renamed from: e */
    private final cazn f50538e;

    /* renamed from: f */
    private final cazn f50539f;

    public wde(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3, cazn cazn4, cazn cazn5) {
        super(cijl2, cbag.m127657a(wde.class), cijl);
        this.f50535b = cbac.m127643a(cazn);
        this.f50536c = cbac.m127643a(cazn2);
        this.f50537d = cbac.m127643a(cazn3);
        this.f50538e = cbac.m127643a(cazn4);
        this.f50539f = cbac.m127643a(cazn5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f50535b.mo75201b(), this.f50536c.mo75201b(), this.f50537d.mo75201b(), this.f50538e.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        boolean z = false;
        wdc wdc = (wdc) list.get(0);
        bxvd bxvd = (bxvd) list.get(1);
        Activity activity = (Activity) list.get(2);
        wdn wdn = (wdn) list.get(3);
        cazn cazn = this.f50539f;
        int a = wdc.mo29013a();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bydg bydg = bydg.f165780g;
        ((bydg) bxvd.f164949b).f165787f = a;
        if (wdc.mo29015c() != null) {
            wdn.mo29047a(wdc.mo29015c());
            return bqga.m112775a((Object) null);
        } else if (wdc.mo29013a() == 3) {
            activity.finish();
            return bqga.m112775a((Object) null);
        } else {
            if (wdc.mo29014b() != null) {
                z = true;
            }
            bmxy.m108589a(z, wdc);
            return cazn.mo75201b();
        }
    }
}
