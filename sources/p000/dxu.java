package p000;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.Map;

/* renamed from: dxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dxu implements aubg {

    /* renamed from: a */
    final /* synthetic */ ContextManagerClientInfo f14376a;

    /* renamed from: b */
    final /* synthetic */ dxy f14377b;

    public dxu(dxy dxy, ContextManagerClientInfo contextManagerClientInfo) {
        this.f14377b = dxy;
        this.f14376a = contextManagerClientInfo;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo7031a(aucb aucb) {
        if (aucb.mo50384b()) {
            Map map = (Map) aucb.mo50386d();
            if (sqw.m36042a(map)) {
                return aucu.m76778a((Object) false);
            }
            this.f14377b.f14379a.put(this.f14376a.mo18066a(), map);
            new Object[1][0] = map;
            return aucu.m76778a((Object) true);
        }
        new Object[1][0] = aucb.mo50387e();
        return aucu.m76778a((Object) false);
    }
}
