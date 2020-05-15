package p000;

import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: attz */
final /* synthetic */ class attz implements aubq {

    /* renamed from: a */
    private final atub f90894a;

    /* renamed from: b */
    private final atsy f90895b;

    public attz(atub atub, atsy atsy) {
        this.f90894a = atub;
        this.f90895b = atsy;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        Map map;
        atub atub = this.f90894a;
        atsy atsy = this.f90895b;
        NodeParcelable nodeParcelable = null;
        if (aucb.mo50384b() && (map = (Map) aucb.mo50386d()) != null) {
            axoj axoj = (axoj) map.get("mdm/ringable");
            if (axoj == null) {
                axoj = (axoj) map.get("handle_pay_proxy_intent");
            }
            if (axoj != null) {
                Set b = axoj.mo53307b();
                if (!b.isEmpty()) {
                    if (b.size() > 1) {
                        bnsl bnsl = (bnsl) atub.f90897a.mo68388c();
                        bnsl.mo68432a("atub", "a", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("More than one phone node identified, selecting first available");
                    }
                    nodeParcelable = (NodeParcelable) b.iterator().next();
                }
            }
        }
        if (nodeParcelable != null) {
            atsy.f90853p = nodeParcelable.f110950a;
            axoj axoj2 = (axoj) ((Map) aucb.mo50386d()).get("announce_pay_wear_proxy_version");
            if (axoj2 == null || !axoj2.mo53307b().contains(nodeParcelable)) {
                atub.f90898f.f108906c.f90810B = 3;
                atub.mo50180a(2, atsy);
                return;
            }
            atow.m76241a(atub.f90898f.f108920q.mo24694a(atsy.f90853p, "/tapandpay/proxy", auai.m76649a(auaa.m76630a(atsy.f90853p), false)), 10, TimeUnit.SECONDS).mo50371a(new atua(atub));
            return;
        }
        atub.mo50187b(404, 2);
        atub.mo50178a();
    }
}
