package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: avrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avrr extends avrk {
    /* renamed from: a */
    private static int m79088a(SystemUpdateStatus systemUpdateStatus) {
        return (m79093c(systemUpdateStatus) || m79094d(systemUpdateStatus)) ? 31 : 255;
    }

    /* renamed from: b */
    private static ColorFilter m79092b(SystemUpdateStatus systemUpdateStatus) {
        if (m79093c(systemUpdateStatus) || m79094d(systemUpdateStatus)) {
            return new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY);
        }
        return null;
    }

    /* renamed from: c */
    private static boolean m79093c(SystemUpdateStatus systemUpdateStatus) {
        int i = systemUpdateStatus.f109461c;
        return i == 2059 || i == 1547 || i == 267 || i == 262;
    }

    /* renamed from: d */
    private static boolean m79094d(SystemUpdateStatus systemUpdateStatus) {
        int i = systemUpdateStatus.f109461c;
        return i == 518 || i == 1555;
    }

    /* renamed from: e */
    private static boolean m79095e(SystemUpdateStatus systemUpdateStatus) {
        return systemUpdateStatus.f109461c == 774;
    }

    /* renamed from: a */
    private static final void m79089a(avrl avrl, avlf avlf, SystemUpdateStatus systemUpdateStatus) {
        if (avrl.mo51547n() == 1 || System.currentTimeMillis() > systemUpdateStatus.f109477s || systemUpdateStatus.f109465g.f109446a) {
            avlf.mo51346b(new DownloadOptions(false, true));
        } else {
            avrl.mo51554u();
        }
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
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51534b(int i, avrl avrl) {
        String str;
        bmxv bmxv;
        int i2;
        int i3;
        if (avrl.mo51542i().mo66813a() && avrl.mo51541h().mo66813a()) {
            SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) avrl.mo51542i().mo66814b();
            avsf avsf = (avsf) avrl.mo51541h().mo66814b();
            avlf g = avrl.mo51540g();
            if (i != 4) {
                boolean z = true;
                if (i == 8) {
                    avsf.mo51557a(m79090a(8, systemUpdateStatus));
                    if (!systemUpdateStatus.f109471m || systemUpdateStatus.f109461c != 2) {
                        int i4 = systemUpdateStatus.f109461c;
                        if ((i4 == 518 || i4 == 1555) && m79091a((Activity) avrl)) {
                            avrl.mo51539f();
                        } else if (m79095e(systemUpdateStatus)) {
                            ProgressBar l = avsf.mo51573l();
                            l.setIndeterminate(true);
                            l.getProgressDrawable().setAlpha(m79088a(systemUpdateStatus));
                            l.getProgressDrawable().setColorFilter(m79092b(systemUpdateStatus));
                            avrl.mo51540g().mo51340G();
                            Intent intent = new Intent("android.server.checkin.CHECKIN");
                            intent.putExtra("force", true);
                            intent.putExtra("fetchSystemUpdates", true);
                            ((Activity) avrl).sendBroadcast(intent);
                        } else if (m79093c(systemUpdateStatus) || m79094d(systemUpdateStatus)) {
                            m79089a(avrl, g, systemUpdateStatus);
                        } else {
                            avrl.mo51540g().mo51350e();
                        }
                    }
                } else if (i == 11) {
                    if (m79093c(systemUpdateStatus)) {
                        g.mo51346b(new DownloadOptions(true, true));
                    } else {
                        g.mo51343a(new DownloadOptions(true, true));
                    }
                } else if (i == 7) {
                    m79089a(avrl, g, systemUpdateStatus);
                } else if (i == 3) {
                    Activity activity = (Activity) avrl;
                    avry.m79125a(activity, avsf, systemUpdateStatus, avrl.mo51546m());
                    TextView i5 = avsf.mo51570i();
                    if (m79093c(systemUpdateStatus)) {
                        str = activity.getString(C0126R.string.system_update_download_paused_title_text);
                    } else if (m79094d(systemUpdateStatus) || m79095e(systemUpdateStatus)) {
                        str = activity.getString(C0126R.string.system_update_download_failed_status_text);
                    } else if (!systemUpdateStatus.f109471m) {
                        if (!systemUpdateStatus.f109479u) {
                            i3 = C0126R.string.system_update_downloading_title_text;
                        } else {
                            i3 = C0126R.string.system_update_security_update_downloading_title_text;
                        }
                        str = activity.getString(i3);
                    } else {
                        if (!systemUpdateStatus.f109479u) {
                            i2 = C0126R.string.system_update_installing_title_text;
                        } else {
                            i2 = C0126R.string.system_update_security_update_installing_title_text;
                        }
                        str = activity.getString(i2);
                    }
                    i5.setText(str);
                    boolean d = m79094d(systemUpdateStatus);
                    int i6 = C0126R.string.system_update_download_retry_button_text;
                    if (!d && !m79095e(systemUpdateStatus)) {
                        i6 = !m79093c(systemUpdateStatus) ? C0126R.string.common_pause : C0126R.string.system_update_resume_button_text;
                    } else {
                        int i7 = systemUpdateStatus.f109461c;
                        if ((i7 == 518 || i7 == 1555) && m79091a(activity)) {
                            i6 = C0126R.string.system_update_free_up_space_button_text;
                        }
                    }
                    avsf.mo51555a(i6);
                    avsf.mo51569h().setVisibility(0);
                    avsf.mo51567f().setVisibility(0);
                    avsf.mo51568g().setVisibility(0);
                    avsf.mo51570i().setVisibility(0);
                    if (!m79094d(systemUpdateStatus) && !m79095e(systemUpdateStatus)) {
                        bmxv = bmvz.f131120a;
                    } else {
                        int i8 = systemUpdateStatus.f109461c;
                        if (i8 == 518 || i8 == 1555) {
                            bmxv = bmxv.m108566b(activity.getString(C0126R.string.system_update_download_failed_no_space_button_qualifier_text));
                        } else {
                            bmxv = bmxv.m108566b(activity.getString(C0126R.string.system_update_download_failed_status_text));
                        }
                    }
                    if (bmxv.mo66813a()) {
                        avsf.mo51571j().setText((CharSequence) bmxv.mo66814b());
                        avsf.mo51571j().setVisibility(0);
                    } else {
                        avsf.mo51571j().setVisibility(8);
                    }
                    if (m79095e(systemUpdateStatus)) {
                        avsf.mo51574m();
                    } else {
                        ProgressBar l2 = avsf.mo51573l();
                        if (m79094d(systemUpdateStatus) || m79093c(systemUpdateStatus) || (!m79095e(systemUpdateStatus) && !systemUpdateStatus.f109471m && systemUpdateStatus.f109464f > 0.0d)) {
                            z = false;
                        }
                        l2.setIndeterminate(z);
                        l2.setMax(100);
                        l2.setProgress((int) (systemUpdateStatus.f109464f * 100.0d));
                        l2.getProgressDrawable().setAlpha(m79088a(systemUpdateStatus));
                        l2.getProgressDrawable().setColorFilter(m79092b(systemUpdateStatus));
                    }
                    TextView k = avsf.mo51572k();
                    if (systemUpdateStatus.f109461c != 2059) {
                        k.setVisibility(8);
                    } else {
                        int i9 = Build.VERSION.SDK_INT;
                        k.setTextAppearance((Context) avrl, C0126R.style.systemUpdateButtonQualifier);
                        k.setText((int) C0126R.string.system_update_download_paused_no_wifi_status_text);
                        k.setVisibility(0);
                    }
                    avsf.mo51557a(m79090a(3, systemUpdateStatus));
                    avsf.mo51575n();
                }
            } else {
                avry.m79124a(systemUpdateStatus.f109464f, avsf);
            }
        }
    }

    /* renamed from: a */
    private static final boolean m79090a(int i, SystemUpdateStatus systemUpdateStatus) {
        return systemUpdateStatus.f109461c != 2 ? !m79095e(systemUpdateStatus) || i != 8 : i != 8 && !systemUpdateStatus.f109471m;
    }

    /* renamed from: a */
    private static boolean m79091a(Activity activity) {
        return new Intent().setAction("android.os.storage.action.MANAGE_STORAGE").resolveActivity(activity.getPackageManager()) != null;
    }
}
