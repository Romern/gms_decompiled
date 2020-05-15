package p000;

import android.accounts.Account;
import android.view.View;
import android.widget.CompoundButton;

/* renamed from: wsr */
final /* synthetic */ class wsr implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private final wtd f51261a;

    public wsr(wtd wtd) {
        this.f51261a = wtd;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        wtd wtd = this.f51261a;
        boolean isChecked = wtd.f51281d.isChecked();
        Account b = wtd.mo29380b();
        int i = 0;
        wtd.f51281d.setEnabled(false);
        wtd.mo29381c().execute(new wst(wtd, isChecked, b));
        View view = wtd.f51282e;
        if (!isChecked) {
            i = 8;
        }
        view.setVisibility(i);
        wtd.f51284g.setVisibility(i);
    }
}
