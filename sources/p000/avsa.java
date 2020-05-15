package p000;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.SystemUpdateStatus;
import com.google.android.setupdesign.GlifLayout;
import java.util.concurrent.TimeUnit;

/* renamed from: avsa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avsa extends avrk {
    /* renamed from: a */
    private static int m79129a(int i) {
        return i == 3 ? C0126R.string.system_update_switch_network : C0126R.string.system_update_connect_wifi;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avsa.a(avrl, boolean):void
     arg types: [avrl, int]
     candidates:
      avsa.a(int, com.google.android.chimera.Activity):java.lang.CharSequence
      avsa.a(avsf, com.google.android.chimera.Activity):void
      avsa.a(avrl, com.google.android.gms.update.SystemUpdateStatus):boolean
      avrk.a(int, avrl):void
      avsa.a(avrl, boolean):void */
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
        bmxv bmxv;
        int i3;
        if (avrl.mo51541h().mo66813a() && avrl.mo51542i().mo66813a()) {
            SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) avrl.mo51542i().mo66814b();
            avsf avsf = (avsf) avrl.mo51541h().mo66814b();
            if (i == 8) {
                m79131a(8, avrl, systemUpdateStatus, avsf);
                if (m79134a(avrl)) {
                    m79132a(avrl, false);
                    avrl.mo51550q();
                } else if (!m79135a(avrl, systemUpdateStatus)) {
                    avrl.mo51540g().mo51343a(new DownloadOptions(false, true));
                    m79133a((avsf) avrl.mo51541h().mo66814b(), (Activity) avrl);
                } else {
                    m79132a(avrl, true);
                    avsf.mo51571j().setVisibility(0);
                    TextView j = avsf.mo51571j();
                    if (avrl.mo51547n() == 3) {
                        i3 = C0126R.string.system_update_download_paused_using_metered_wifi_status_text;
                    } else {
                        i3 = C0126R.string.system_update_download_paused_using_cellular_status_text;
                    }
                    j.setText(i3);
                }
            } else if (i == 14) {
                m79131a(14, avrl, systemUpdateStatus, avsf);
                m79132a(avrl, false);
                avrl.mo51540g().mo51343a(new DownloadOptions(true, true));
                m79133a((avsf) avrl.mo51541h().mo66814b(), (Activity) avrl);
            } else if (i == 3) {
                m79131a(3, avrl, systemUpdateStatus, avsf);
                boolean m = avrl.mo51546m();
                Activity activity = (Activity) avrl;
                avry.m79125a(activity, avsf, systemUpdateStatus, m);
                int c = avmd.m78788c(System.currentTimeMillis() - systemUpdateStatus.f109472n);
                Drawable g = ((GlifLayout) avsf.mo51565e()).mo71368g();
                int[] intArray = activity.getResources().getIntArray(C0126R.array.escalation_icon_colors);
                int length = intArray.length;
                if (c >= length) {
                    i2 = intArray[length - 1];
                } else {
                    i2 = intArray[c];
                }
                g.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
                avsf.mo51570i().setText(c <= 0 ? !systemUpdateStatus.f109479u ? C0126R.string.system_update_update_available_title_text : C0126R.string.system_update_security_update_available_title_text : C0126R.string.system_update_overdue_status_text);
                avsf.mo51574m();
                avsf.mo51566e(false);
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
                avsf.mo51575n();
                avsf.mo51559b(false);
                avsf.mo51564d(true);
                avsf.mo51558b(activity.getText(C0126R.string.system_update_mobile_data_warning_dialog_message));
            }
        }
    }

    /* renamed from: a */
    private static CharSequence m79130a(int i, Activity activity) {
        return activity.getText(i != 3 ? C0126R.string.system_update_use_cellular : C0126R.string.common_continue);
    }

    /* renamed from: a */
    private static void m79131a(int i, avrl avrl, SystemUpdateStatus systemUpdateStatus, avsf avsf) {
        bmxv bmxv;
        bmxv bmxv2;
        int i2;
        if (i == 3) {
            bmxv = (m79134a(avrl) && avrl.mo51547n() != 0) ? bmxv.m108566b(m79130a(avrl.mo51547n(), (Activity) avrl)) : bmvz.f131120a;
        } else if (i == 8) {
            int n = avrl.mo51547n();
            bmxv = (!m79134a(avrl) && m79135a(avrl, systemUpdateStatus) && n != 0) ? bmxv.m108566b(m79130a(n, (Activity) avrl)) : bmvz.f131120a;
        } else if (i == 14) {
            bmxv = bmvz.f131120a;
        } else {
            throw new IllegalStateException(String.format("Unexpected event: %d to get secondary button text", Integer.valueOf(i)));
        }
        if (bmxv.mo66813a()) {
            avsf.mo51556a((CharSequence) bmxv.mo66814b());
        }
        avsf.mo51562c(bmxv.mo66813a());
        if (i != 3) {
            if (i == 8) {
                bmxv2 = (!m79134a(avrl) && m79135a(avrl, systemUpdateStatus)) ? bmxv.m108566b(Integer.valueOf(m79129a(avrl.mo51547n()))) : bmvz.f131120a;
            } else if (i == 14) {
                bmxv2 = bmvz.f131120a;
            } else {
                throw new IllegalStateException(String.format("Unexpected event: %d to get primary button text", Integer.valueOf(i)));
            }
        } else if (m79134a(avrl)) {
            bmxv2 = bmxv.m108566b(Integer.valueOf(m79129a(avrl.mo51547n())));
        } else {
            if (!avls.m78732a()) {
                i2 = C0126R.string.common_download;
            } else {
                i2 = C0126R.string.system_update_download_and_install_button_text;
            }
            bmxv2 = bmxv.m108566b(Integer.valueOf(i2));
        }
        if (bmxv2.mo66813a()) {
            avsf.mo51555a(((Integer) bmxv2.mo66814b()).intValue());
        }
        avsf.mo51557a(bmxv2.mo66813a());
    }

    /* renamed from: a */
    private static void m79132a(avrl avrl, boolean z) {
        avrl.mo51549p().putBoolean("preDownloadControllerInstanceState", z);
    }

    /* renamed from: a */
    private static void m79133a(avsf avsf, Activity activity) {
        ((GlifLayout) avsf.mo51565e()).mo71368g().setColorFilter(new PorterDuffColorFilter(activity.getResources().getColor(C0126R.color.system_update_notification_color), PorterDuff.Mode.MULTIPLY));
    }

    /* renamed from: a */
    private static boolean m79134a(avrl avrl) {
        return avrl.mo51549p().getBoolean("preDownloadControllerInstanceState");
    }

    /* renamed from: a */
    private static boolean m79135a(avrl avrl, SystemUpdateStatus systemUpdateStatus) {
        if (avrl.mo51547n() == 1 || System.currentTimeMillis() > systemUpdateStatus.f109477s || systemUpdateStatus.f109465g.f109446a) {
            return false;
        }
        return true;
    }
}
