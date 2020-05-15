package p000;

import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.RecyclerView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity;
import java.util.List;

/* renamed from: apxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apxp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f85073a;

    /* renamed from: b */
    final /* synthetic */ List f85074b;

    /* renamed from: c */
    final /* synthetic */ apup f85075c;

    /* renamed from: d */
    final /* synthetic */ VerifyAppsSettingsChimeraActivity f85076d;

    public apxp(VerifyAppsSettingsChimeraActivity verifyAppsSettingsChimeraActivity, long j, List list, apup apup) {
        this.f85076d = verifyAppsSettingsChimeraActivity;
        this.f85073a = j;
        this.f85074b = list;
        this.f85075c = apup;
    }

    public final void run() {
        apxo apxo;
        int i;
        int i2;
        RecyclerView recyclerView = (RecyclerView) this.f85076d.findViewById(16908298);
        if (System.currentTimeMillis() - this.f85076d.f107542n < 150) {
            apxo = new apxo(recyclerView, recyclerView.getItemAnimator());
            recyclerView.setItemAnimator(null);
        } else {
            apxo = null;
        }
        try {
            if (this.f85076d.f107533b.mo47205d()) {
                this.f85076d.mo58934a(this.f85073a, this.f85074b);
            }
            apxs apxs = new apxs(this.f85076d, this.f85075c);
            apxs.mo47691a(3);
            if (apxs.f85083a != null) {
                Drawable a = apxs.f85086d.mo47673a((int) C0126R.C0127drawable.play_protect_ic_alert_black_24dp, (int) C0126R.color.material_google_red_500);
                apuo[] apuoArr = apxs.f85083a;
                for (apuo apuo : apuoArr) {
                    apxg apxg = new apxg(apxs.f85085c);
                    apxg.mo26086b(3);
                    apxt apxt = new apxt(apxs.f85086d.f107546r, apuo.f84933a);
                    if (!apxt.f85090b) {
                        i = C0126R.string.play_protect_uninstall_pha;
                    } else {
                        i = C0126R.string.play_protect_disable_pha;
                    }
                    apxg.mo26106c(i);
                    apxg.mo26105b(apxt.f85089a);
                    apxg.mo26101a(a);
                    apxg.f85055n = apxs.mo47690a(apuo);
                    apxg.mo26164i();
                    if (!apxt.f85090b) {
                        i2 = C0126R.string.play_protect_uninstall;
                    } else {
                        i2 = C0126R.string.play_protect_disable;
                    }
                    apxs.mo47692a(apxg, true, i2, apuo.f84936d);
                    apxs.f85087e.mo26149a((sui) apxg);
                }
            }
            int i3 = 4;
            apxs.mo47691a(4);
            if (apxs.f85084b != null) {
                Drawable a2 = apxs.f85086d.mo47673a((int) C0126R.C0127drawable.play_protect_ic_check_black_24dp, (int) C0126R.color.material_google_green_500);
                Drawable a3 = apxs.f85086d.mo47673a((int) C0126R.C0127drawable.quantum_ic_expand_more_vd_theme_24, (int) C0126R.color.material_grey_600);
                Drawable a4 = apxs.f85086d.mo47673a((int) C0126R.C0127drawable.quantum_ic_expand_less_vd_theme_24, (int) C0126R.color.material_grey_600);
                apuo[] apuoArr2 = apxs.f85084b;
                int length = apuoArr2.length;
                int i4 = 0;
                while (i4 < length) {
                    apuo apuo2 = apuoArr2[i4];
                    apxg apxg2 = new apxg(apxs.f85085c, a4, a3);
                    apxg2.mo26086b(i3);
                    apxt apxt2 = new apxt(apxs.f85086d.f107546r, apuo2.f84933a);
                    if (apxt2.f85090b) {
                        apxg2.mo26106c((int) C0126R.string.play_protect_pha_disabled);
                        apxg2.mo26105b(apxt2.f85089a);
                    } else {
                        apxg2.mo26106c((int) C0126R.string.play_protect_pha_removed);
                        apxg2.mo26105b(apuo2.f84937e);
                    }
                    apxg2.mo26101a(a2);
                    apxg2.f85057p = apxs.mo47690a(apuo2);
                    apxg2.mo26164i();
                    apxs.mo47692a(apxg2, false, C0126R.string.play_protect_hide, apuo2.f84936d);
                    apxs.f85087e.mo26149a((sui) apxg2);
                    i4++;
                    i3 = 4;
                }
            }
            apxs.f85086d.mo58937g();
            recyclerView.requestLayout();
            if (apxo != null) {
                recyclerView.post(apxo);
            }
        } catch (Throwable th) {
            if (apxo != null) {
                recyclerView.post(apxo);
            }
            throw th;
        }
    }
}
