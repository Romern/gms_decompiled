package p000;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.quickaccesswallet.GetQuickAccessWalletConfigRequest;
import com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig;
import java.util.List;

/* renamed from: atjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atjb extends atki {
    public atjb(GetQuickAccessWalletConfigRequest getQuickAccessWalletConfigRequest, String str, aswm aswm) {
        super("GetQuickAccessWalletConfig", getQuickAccessWalletConfigRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49618a(status, (QuickAccessWalletConfig) null);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        int i;
        atek atek = new atek(askg.m74279a(((GetQuickAccessWalletConfigRequest) this.f90410b).f108627b.name, context), ((GetQuickAccessWalletConfigRequest) this.f90410b).f108626a);
        atkm atkm = new atkm(atek.f90188b.f89126d);
        long j = atkm.f90420c.getLong("quick_access_wallet_card_size", 0);
        Point point = new Point((int) (j >> 32), (int) j);
        if (point.x == 0 || point.y == 0) {
            DisplayMetrics displayMetrics = atek.f90188b.f89126d.getResources().getDisplayMetrics();
            int round = Math.round(((float) Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels)) * 0.69f);
            point = new Point(round, Math.round(((float) round) / 1.5909091f));
            atkm.mo50010a(point.x, point.y);
        }
        if (cgwk.m147215c()) {
            int i2 = atek.f90189c;
            if (i2 == 5) {
                i = (int) cgwk.f187853a.mo6606a().mo84578k();
            } else if (i2 == 6) {
                i = (int) cgwk.f187853a.mo6606a().mo84576i();
            } else if (i2 != 7) {
                ((bnsl) atek.f90187a.mo68388c()).mo68409a("Unknown card source: %s", atek.f90189c);
                i = 0;
            } else {
                i = (int) cgwk.f187853a.mo6606a().mo84577j();
            }
        } else {
            i = 0;
        }
        List a = atxr.m76517a(asko.m74292a(atek.f90188b.f89126d).mo49214a(), atei.f90185a, "SELECT card_id FROM QuickAccessWalletCards WHERE account_id=? AND environment=? AND wallet_source=? ", atek.mo49900b());
        atel atel = new atel();
        atel.f90190a.f108635a = point.x;
        int i3 = point.y;
        QuickAccessWalletConfig quickAccessWalletConfig = atel.f90190a;
        quickAccessWalletConfig.f108636b = i3;
        quickAccessWalletConfig.f108637c = i;
        QuickAccessWalletConfig quickAccessWalletConfig2 = atel.f90190a;
        quickAccessWalletConfig2.f108638d = (String[]) a.toArray(new String[0]);
        this.f90414d.mo49618a(Status.f30107a, quickAccessWalletConfig2);
    }
}
