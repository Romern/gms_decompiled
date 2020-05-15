package p000;

import android.os.Bundle;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: atub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atub extends atue {

    /* renamed from: a */
    public static final srn f90897a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    public atub(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    /* renamed from: a */
    private static NodeParcelable m76346a(aucb aucb) {
        Map map;
        if (aucb.mo50384b() && (map = (Map) aucb.mo50386d()) != null) {
            axoj axoj = (axoj) map.get("mdm/ringable");
            if (axoj == null) {
                axoj = (axoj) map.get("handle_pay_proxy_intent");
            }
            if (axoj != null) {
                Set b = axoj.mo53307b();
                if (!b.isEmpty()) {
                    if (b.size() > 1) {
                        bnsl bnsl = (bnsl) f90897a.mo68388c();
                        bnsl.mo68432a("atub", "a", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("More than one phone node identified, selecting first available");
                    }
                    return (NodeParcelable) b.iterator().next();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        rkb rkb = this.f90898f.f108919p.f43165D;
        sdo.m34974b(true);
        axpv axpv = new axpv(rkb);
        rkb.mo24787a((rle) axpv);
        atow.m76241a(sdl.m34956a(axpv, axqc.f96268a), 10, TimeUnit.SECONDS).mo50371a(new attz(this, atsy));
    }

    /* renamed from: a */
    public final void mo50177a(MessageEventParcelable messageEventParcelable) {
        boolean z;
        Bundle a = auai.m76640a(messageEventParcelable);
        if ("proxyApiVersionResponse".equals(a.getString("type"))) {
            TokenizePanChimeraActivity tokenizePanChimeraActivity = this.f90898f;
            tokenizePanChimeraActivity.f108914k.removeCallbacks(tokenizePanChimeraActivity.f108916m);
            int i = a.getInt("phoneProxyVersion", 3);
            atsy atsy = this.f90898f.f108906c;
            atsy.f90810B = i;
            int i2 = 1;
            if (i >= 4) {
                z = true;
            } else {
                z = false;
            }
            atsy.f90819K = z;
            int a2 = bpai.m111718a(a.getInt("phoneOsType", 0));
            atsy atsy2 = this.f90898f.f108906c;
            if (a2 != 0) {
                i2 = a2;
            }
            atsy2.f90838ad = i2;
            mo50180a(2, atsy2);
        }
    }
}
