package p000;

import android.content.Intent;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: avrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avrs extends avrk {

    /* renamed from: a */
    private static final bnic f93827a = bnic.m109490a((Object) 518, (Object) 1555);

    /* renamed from: a */
    private static int m79097a(avrl avrl) {
        if (m79106b(avrl)) {
            return avrl.mo51547n() != 3 ? C0126R.string.system_update_use_cellular : C0126R.string.common_continue;
        }
        return C0126R.string.common_pause;
    }

    /* renamed from: b */
    private static final CharSequence m79105b(SystemUpdateStatus systemUpdateStatus, Activity activity) {
        String str;
        if (((int) (systemUpdateStatus.f109464f * 100.0d)) > 0) {
            str = ((int) (systemUpdateStatus.f109464f * 100.0d)) + "%";
        } else {
            str = "0%";
        }
        return TextUtils.expandTemplate(activity.getText(C0126R.string.system_update_download_progress_pecentage_text), str, systemUpdateStatus.f109482x.f109487c);
    }

    /* renamed from: b */
    private static boolean m79108b(SystemUpdateStatus systemUpdateStatus) {
        int i = systemUpdateStatus.f109461c;
        return i == 2059 || i == 1547 || i == 267 || i == 262;
    }

    /* renamed from: c */
    private static boolean m79109c(SystemUpdateStatus systemUpdateStatus) {
        return f93827a.contains(Integer.valueOf(systemUpdateStatus.f109461c));
    }

    /* renamed from: d */
    private static boolean m79110d(SystemUpdateStatus systemUpdateStatus) {
        return systemUpdateStatus.f109461c == 774;
    }

    /* renamed from: a */
    private static int m79098a(avrl avrl, SystemUpdateStatus systemUpdateStatus, Activity activity) {
        if (m79106b(avrl)) {
            return avrl.mo51547n() != 3 ? C0126R.string.system_update_connect_wifi : C0126R.string.system_update_switch_network;
        }
        if (!m79109c(systemUpdateStatus) && !m79110d(systemUpdateStatus)) {
            return C0126R.string.system_update_resume_button_text;
        }
        return (!f93827a.contains(Integer.valueOf(systemUpdateStatus.f109461c)) || !m79104a(activity)) ? C0126R.string.system_update_download_retry_button_text : C0126R.string.system_update_free_up_space_button_text;
    }

    /* renamed from: a */
    private static int m79099a(SystemUpdateStatus systemUpdateStatus) {
        return (m79108b(systemUpdateStatus) || m79109c(systemUpdateStatus)) ? 31 : 255;
    }

    /* renamed from: a */
    private static ColorFilter m79100a(SystemUpdateStatus systemUpdateStatus, Activity activity) {
        if (m79108b(systemUpdateStatus) || m79109c(systemUpdateStatus)) {
            return new PorterDuffColorFilter(activity.getResources().getColor(C0126R.color.paused_progress_bar_tint_color, activity.getTheme()), PorterDuff.Mode.MULTIPLY);
        }
        return null;
    }

    /* renamed from: b */
    private static boolean m79106b(avrl avrl) {
        return avrl.mo51549p().getBoolean("downloadControllerInstanceState");
    }

    /* renamed from: b */
    private static final boolean m79107b(avrl avrl, int i, SystemUpdateStatus systemUpdateStatus) {
        return !m79106b(avrl) ? systemUpdateStatus.f109461c != 2 ? !m79109c(systemUpdateStatus) && !m79110d(systemUpdateStatus) && !m79108b(systemUpdateStatus) : i != 14 && !systemUpdateStatus.f109471m : avrl.mo51547n() != 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avrs.a(avrl, boolean):void
     arg types: [avrl, int]
     candidates:
      avrs.a(com.google.android.gms.update.SystemUpdateStatus, com.google.android.chimera.Activity):android.graphics.ColorFilter
      avrk.a(int, avrl):void
      avrs.a(avrl, boolean):void */
    /* renamed from: a */
    private static final void m79101a(avrl avrl, int i, SystemUpdateStatus systemUpdateStatus, avsf avsf, avlf avlf) {
        SystemUpdateStatus systemUpdateStatus2 = (SystemUpdateStatus) avrl.mo51542i().mo66814b();
        if (avrl.mo51547n() == 1 || System.currentTimeMillis() > systemUpdateStatus2.f109477s || systemUpdateStatus2.f109465g.f109446a) {
            avlf.mo51346b(new DownloadOptions(false, true));
            return;
        }
        m79102a(avrl, true);
        avsf.mo51557a(m79103a(avrl, i, systemUpdateStatus));
        Activity activity = (Activity) avrl;
        avsf.mo51555a(m79098a(avrl, systemUpdateStatus, activity));
        avsf.mo51562c(m79107b(avrl, i, systemUpdateStatus));
        avsf.mo51556a(activity.getText(m79097a(avrl)));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avrs.a(avrl, boolean):void
     arg types: [avrl, int]
     candidates:
      avrs.a(com.google.android.gms.update.SystemUpdateStatus, com.google.android.chimera.Activity):android.graphics.ColorFilter
      avrk.a(int, avrl):void
      avrs.a(avrl, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51534b(int i, avrl avrl) {
        String str;
        bmxv bmxv;
        boolean z;
        int i2;
        int i3;
        int i4;
        if (avrl.mo51542i().mo66813a() && avrl.mo51541h().mo66813a()) {
            SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) avrl.mo51542i().mo66814b();
            avsf avsf = (avsf) avrl.mo51541h().mo66814b();
            avlf g = avrl.mo51540g();
            if (i == 4) {
                avsf.mo51561c(m79105b(systemUpdateStatus, (Activity) avrl));
                avry.m79124a(systemUpdateStatus.f109464f, avsf);
            } else if (i == 8) {
                SystemUpdateStatus systemUpdateStatus2 = (SystemUpdateStatus) avrl.mo51542i().mo66814b();
                avsf avsf2 = (avsf) avrl.mo51541h().mo66814b();
                avlf g2 = avrl.mo51540g();
                avsf2.mo51557a(m79103a(avrl, 8, systemUpdateStatus2));
                if (!systemUpdateStatus2.f109471m || systemUpdateStatus2.f109461c != 2) {
                    if (f93827a.contains(Integer.valueOf(systemUpdateStatus2.f109461c)) && m79104a((Activity) avrl)) {
                        avrl.mo51539f();
                    } else if (m79110d(systemUpdateStatus2)) {
                        ProgressBar l = avsf2.mo51573l();
                        l.setIndeterminate(true);
                        l.getProgressDrawable().setAlpha(m79099a(systemUpdateStatus2));
                        Activity activity = (Activity) avrl;
                        l.getProgressDrawable().setColorFilter(m79100a(systemUpdateStatus2, activity));
                        avrl.mo51540g().mo51340G();
                        Intent intent = new Intent("android.server.checkin.CHECKIN");
                        intent.putExtra("force", true);
                        intent.putExtra("fetchSystemUpdates", true);
                        activity.sendBroadcast(intent);
                    } else if (!m79108b(systemUpdateStatus2) && !m79109c(systemUpdateStatus2)) {
                    } else {
                        if (m79106b(avrl)) {
                            m79102a(avrl, false);
                            avrl.mo51550q();
                            return;
                        }
                        m79101a(avrl, 8, systemUpdateStatus2, avsf2, g2);
                    }
                }
            } else if (i == 14) {
                SystemUpdateStatus systemUpdateStatus3 = (SystemUpdateStatus) avrl.mo51542i().mo66814b();
                avlf g3 = avrl.mo51540g();
                ((avsf) avrl.mo51541h().mo66814b()).mo51562c(m79107b(avrl, 14, systemUpdateStatus3));
                if (m79106b(avrl)) {
                    m79102a(avrl, false);
                    if (m79108b(systemUpdateStatus3)) {
                        g3.mo51346b(new DownloadOptions(true, true));
                    } else {
                        g3.mo51343a(new DownloadOptions(true, true));
                    }
                } else {
                    avrl.mo51540g().mo51350e();
                }
            } else if (i == 7) {
                m79101a(avrl, 7, systemUpdateStatus, avsf, g);
            } else if (i == 3) {
                Activity activity2 = (Activity) avrl;
                avry.m79125a(activity2, avsf, systemUpdateStatus, avrl.mo51546m());
                TextView i5 = avsf.mo51570i();
                if (m79108b(systemUpdateStatus)) {
                    str = activity2.getString(C0126R.string.system_update_download_paused_title_text);
                } else if (m79109c(systemUpdateStatus) || m79110d(systemUpdateStatus)) {
                    str = activity2.getString(C0126R.string.system_update_download_failed_status_text);
                } else if (!systemUpdateStatus.f109471m) {
                    if (!systemUpdateStatus.f109479u) {
                        i4 = C0126R.string.system_update_downloading_title_text_glifv3;
                    } else {
                        i4 = C0126R.string.system_update_security_update_downloading_title_text_glifv3;
                    }
                    str = activity2.getString(i4);
                } else {
                    if (!systemUpdateStatus.f109479u) {
                        i3 = C0126R.string.system_update_installing_title_text_glifv3;
                    } else {
                        i3 = C0126R.string.system_update_security_update_installing_title_text_glifv3;
                    }
                    str = activity2.getString(i3);
                }
                i5.setText(str);
                avsf.mo51555a(m79098a(avrl, systemUpdateStatus, activity2));
                avsf.mo51556a(activity2.getText(m79097a(avrl)));
                avsf.mo51569h().setVisibility(0);
                avsf.mo51567f().setVisibility(0);
                avsf.mo51568g().setVisibility(0);
                avsf.mo51570i().setVisibility(0);
                if (m79109c(systemUpdateStatus) || m79110d(systemUpdateStatus)) {
                    bmxv = f93827a.contains(Integer.valueOf(systemUpdateStatus.f109461c)) ? bmxv.m108566b(activity2.getString(C0126R.string.system_update_download_failed_no_space_button_qualifier_text)) : bmxv.m108566b(activity2.getString(C0126R.string.system_update_download_failed_status_text));
                } else if (m79106b(avrl) || systemUpdateStatus.f109461c == 2059) {
                    if (avrl.mo51547n() == 3) {
                        i2 = C0126R.string.system_update_download_paused_using_metered_wifi_status_text;
                    } else {
                        i2 = C0126R.string.system_update_download_paused_using_cellular_status_text;
                    }
                    bmxv = bmxv.m108566b(activity2.getString(i2));
                } else {
                    bmxv = bmvz.f131120a;
                }
                if (bmxv.mo66813a()) {
                    avsf.mo51571j().setText((CharSequence) bmxv.mo66814b());
                    avsf.mo51571j().setVisibility(0);
                } else {
                    avsf.mo51571j().setVisibility(8);
                }
                if (m79110d(systemUpdateStatus)) {
                    avsf.mo51574m();
                    avsf.mo51566e(false);
                } else {
                    ProgressBar l2 = avsf.mo51573l();
                    if (!m79109c(systemUpdateStatus) && !m79108b(systemUpdateStatus)) {
                        if (m79110d(systemUpdateStatus) || systemUpdateStatus.f109471m) {
                            z = true;
                            l2.setIndeterminate(z);
                            l2.setMax(100);
                            l2.setProgress((int) (systemUpdateStatus.f109464f * 100.0d));
                            l2.getProgressDrawable().setAlpha(m79099a(systemUpdateStatus));
                            l2.getProgressDrawable().setColorFilter(m79100a(systemUpdateStatus, activity2));
                            avsf.mo51561c(m79105b(systemUpdateStatus, activity2));
                            avsf.mo51566e(!systemUpdateStatus.f109471m);
                        } else if (systemUpdateStatus.f109464f <= 0.0d) {
                            z = true;
                            l2.setIndeterminate(z);
                            l2.setMax(100);
                            l2.setProgress((int) (systemUpdateStatus.f109464f * 100.0d));
                            l2.getProgressDrawable().setAlpha(m79099a(systemUpdateStatus));
                            l2.getProgressDrawable().setColorFilter(m79100a(systemUpdateStatus, activity2));
                            avsf.mo51561c(m79105b(systemUpdateStatus, activity2));
                            avsf.mo51566e(!systemUpdateStatus.f109471m);
                        }
                    }
                    z = false;
                    l2.setIndeterminate(z);
                    l2.setMax(100);
                    l2.setProgress((int) (systemUpdateStatus.f109464f * 100.0d));
                    l2.getProgressDrawable().setAlpha(m79099a(systemUpdateStatus));
                    l2.getProgressDrawable().setColorFilter(m79100a(systemUpdateStatus, activity2));
                    avsf.mo51561c(m79105b(systemUpdateStatus, activity2));
                    avsf.mo51566e(!systemUpdateStatus.f109471m);
                }
                avsf.mo51572k().setVisibility(8);
                avsf.mo51557a(m79103a(avrl, 3, systemUpdateStatus));
                avsf.mo51562c(m79107b(avrl, 3, systemUpdateStatus));
                avsf.mo51575n();
                avsf.mo51559b(false);
                avsf.mo51558b(activity2.getString(C0126R.string.system_update_mobile_data_warning_dialog_message));
                avsf.mo51564d(true);
            }
        }
    }

    /* renamed from: a */
    private static final void m79102a(avrl avrl, boolean z) {
        avrl.mo51549p().putBoolean("downloadControllerInstanceState", z);
    }

    /* renamed from: a */
    private static final boolean m79103a(avrl avrl, int i, SystemUpdateStatus systemUpdateStatus) {
        if (m79106b(avrl)) {
            return true;
        }
        if (!m79110d(systemUpdateStatus)) {
            if (!m79109c(systemUpdateStatus)) {
                return m79108b(systemUpdateStatus);
            }
            return true;
        } else if (i != 8) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m79104a(Activity activity) {
        return new Intent().setAction("android.os.storage.action.MANAGE_STORAGE").resolveActivity(activity.getPackageManager()) != null;
    }
}
