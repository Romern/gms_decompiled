package p000;

import android.view.View;

/* renamed from: wsh */
final /* synthetic */ class wsh implements View.OnClickListener {

    /* renamed from: a */
    private final wse f51240a;

    public wsh(wse wse) {
        this.f51240a = wse;
    }

    public void onClick(View view) {
        wse wse = this.f51240a;
        wtd wtd = new wtd();
        wse.getSupportFragmentManager().beginTransaction().addToBackStack("devices_list").replace(16908290, wtd, "fast_pair_account_settings").commit();
        buqu buqu = wse.f51235b;
        if (buqu != null) {
            buqu.mo73004a(wtd);
        }
    }
}
