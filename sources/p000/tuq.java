package p000;

import android.app.Activity;
import android.support.p002v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tuq {

    /* renamed from: a */
    public final deu f46692a;

    /* renamed from: b */
    public final String f46693b;

    /* renamed from: c */
    public final Toolbar f46694c;

    /* renamed from: d */
    public MenuItem f46695d;

    /* renamed from: e */
    public String f46696e;

    /* renamed from: f */
    public final rjx f46697f;

    /* renamed from: g */
    public final rjx f46698g;

    public tuq(deu deu, String str, Toolbar toolbar) {
        Activity containerActivity = deu.getContainerActivity();
        allp a = allq.m61232a();
        a.f73626a = 560;
        rjx a2 = allr.m61233a(containerActivity, a.mo40491a());
        rpr b = rpr.m34216b();
        allp allp = new allp();
        allp.f73626a = 80;
        rjx d = allr.m61237d(b, allp.mo40491a());
        this.f46692a = deu;
        this.f46693b = str;
        this.f46696e = str;
        this.f46694c = toolbar;
        this.f46697f = a2;
        this.f46698g = d;
    }

    /* renamed from: a */
    public final void mo26816a(MenuItem menuItem, String str, String str2) {
        if (menuItem != null && menuItem.getActionView() != null) {
            C1280ps.m19906b(menuItem.getActionView(), 1);
            String string = this.f46692a.getString(C0126R.string.common_asm_google_account_product_name);
            menuItem.getActionView().setContentDescription(TextUtils.expandTemplate(this.f46692a.getResources().getText(C0126R.string.pwm_toolbar_popup_description), string, str2, str));
        }
    }
}
