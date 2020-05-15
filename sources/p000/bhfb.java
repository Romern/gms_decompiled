package p000;

import android.os.Bundle;
import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/* renamed from: bhfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhfb implements C1441vr {

    /* renamed from: a */
    final /* synthetic */ BottomNavigationView f118463a;

    public bhfb(BottomNavigationView bottomNavigationView) {
        this.f118463a = bottomNavigationView;
    }

    /* renamed from: a */
    public final void mo132a(C1443vt vtVar) {
    }

    /* renamed from: a */
    public final boolean mo133a(C1443vt vtVar, MenuItem menuItem) {
        exd exd = this.f118463a.f151071d;
        if (exd == null) {
            return false;
        }
        exf exf = exd.f15966a;
        if (exf.f15973e) {
            return false;
        }
        int b = exf.m11259b(((C1446vw) menuItem).f27454a);
        if (b < 0 || b >= exf.f15972d.size()) {
            return true;
        }
        bsuv bsuv = (bsuv) exf.f15972d.get(b);
        int i = bsuv.f147199b;
        if (i == 2) {
            exf.f15969a.mo10727a(exf.mo10584aU(), (bsxn) bsuv.f147200c, 3);
            return true;
        } else if (i != 3) {
            return true;
        } else {
            fcc.m11454a(exf.getView().findViewById(C0126R.C0129id.bottom_nav_ui_container));
            bsxn aU = exf.mo10584aU();
            bsxn a = exf.f15969a.mo10726a();
            exx exx = new exx();
            Bundle bundle = new Bundle();
            bundle.putByteArray("bottomNavKey", epr.m10927b(a));
            bundle.putInt("selectedTabKey", b);
            bundle.putByteArray("selectedViewKey", epr.m10927b(aU));
            exx.setArguments(bundle);
            exf.f15969a.f16287e.mo10740a(exf.mo10584aU().f147589b, 10203, 3);
            exf.getChildFragmentManager().beginTransaction().add(C0126R.C0129id.menu_drawer_container, exx, "bottom_drawer").commitNow();
            return true;
        }
    }
}
