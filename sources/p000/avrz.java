package p000;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.SystemUpdateStatus;
import com.google.android.setupdesign.GlifLayout;
import java.util.concurrent.TimeUnit;

/* renamed from: avrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avrz extends avrk {
    /* renamed from: a */
    private static final void m79127a(avsf avsf, Activity activity) {
        ((GlifLayout) avsf.mo51565e()).mo71368g().setColorFilter(new PorterDuffColorFilter(activity.getResources().getColor(C0126R.color.system_update_notification_color), PorterDuff.Mode.MULTIPLY));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51534b(int i, avrl avrl) {
        int i2;
        int i3;
        bmxv bmxv;
        int i4;
        if (avrl.mo51541h().mo66813a() && avrl.mo51542i().mo66813a()) {
            SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) avrl.mo51542i().mo66814b();
            if (i == 8) {
                if (avrl.mo51547n() == 1 || System.currentTimeMillis() > systemUpdateStatus.f109477s || systemUpdateStatus.f109465g.f109446a) {
                    avrl.mo51540g().mo51343a(new DownloadOptions(false, true));
                    if (((avsf) avrl.mo51541h().mo66814b()).mo51563d() == 1) {
                        m79127a((avsf) avrl.mo51541h().mo66814b(), (Activity) avrl);
                        return;
                    }
                    return;
                }
                avrl.mo51554u();
            } else if (i == 11) {
                avrl.mo51540g().mo51343a(new DownloadOptions(true, true));
                if (((avsf) avrl.mo51541h().mo66814b()).mo51563d() == 1) {
                    m79127a((avsf) avrl.mo51541h().mo66814b(), (Activity) avrl);
                }
            } else if (i == 3) {
                avsf avsf = (avsf) avrl.mo51541h().mo66814b();
                boolean m = avrl.mo51546m();
                Activity activity = (Activity) avrl;
                avry.m79125a(activity, avsf, systemUpdateStatus, m);
                int i5 = Build.VERSION.SDK_INT;
                int c = avmd.m78788c(System.currentTimeMillis() - systemUpdateStatus.f109472n);
                if (avsf.mo51563d() == 1) {
                    Drawable g = ((GlifLayout) avsf.mo51565e()).mo71368g();
                    int[] intArray = activity.getResources().getIntArray(C0126R.array.escalation_icon_colors);
                    int length = intArray.length;
                    if (c >= length) {
                        i4 = intArray[length - 1];
                    } else {
                        i4 = intArray[c];
                    }
                    g.setColorFilter(new PorterDuffColorFilter(i4, PorterDuff.Mode.MULTIPLY));
                }
                TextView i6 = avsf.mo51570i();
                if (c <= 0) {
                    i2 = !systemUpdateStatus.f109479u ? C0126R.string.system_update_update_available_title_text : C0126R.string.system_update_security_update_available_title_text;
                } else {
                    i2 = C0126R.string.system_update_overdue_status_text;
                }
                i6.setText(i2);
                if (!avls.m78732a()) {
                    i3 = C0126R.string.common_download;
                } else {
                    i3 = C0126R.string.system_update_download_and_install_button_text;
                }
                avsf.mo51555a(i3);
                avsf.mo51574m();
                long currentTimeMillis = System.currentTimeMillis() - systemUpdateStatus.f109472n;
                if (c > 0) {
                    int max = (int) Math.max(TimeUnit.MILLISECONDS.toDays(currentTimeMillis), 1L);
                    bmxv = bmxv.m108566b(TextUtils.expandTemplate(activity.getText(C0126R.string.system_update_overdue_warning), activity.getResources().getQuantityString(C0126R.plurals.ota_unit_days, max, Integer.valueOf(max))));
                } else {
                    bmxv = bmvz.f131120a;
                }
                if (bmxv.mo66813a()) {
                    avsf.mo51571j().setText((CharSequence) bmxv.mo66814b());
                    avsf.mo51571j().setVisibility(0);
                } else {
                    avsf.mo51571j().setVisibility(8);
                }
                avsf.mo51572k().setVisibility(8);
                avsf.mo51569h().setVisibility(0);
                avsf.mo51567f().setVisibility(0);
                avsf.mo51568g().setVisibility(0);
                avsf.mo51570i().setVisibility(0);
                avsf.mo51557a(true);
                avsf.mo51575n();
            }
        }
    }
}
