package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.update.SystemUpdateStatus;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: avmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avmo extends avnf {

    /* renamed from: a */
    public static final sek f93408a = avpq.m79017d("DefaultNotificationControl");

    protected avmo(Context context) {
        super(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
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
    /* renamed from: a */
    public final Notification mo51388a(SystemUpdateStatus systemUpdateStatus, boolean z) {
        String str;
        int i;
        C1102je jeVar = new C1102je(this.f93501f, "system_update.default_notification_channel");
        jeVar.mo13639d(mo51389a(systemUpdateStatus));
        jeVar.mo13637c(true);
        int i2 = systemUpdateStatus.f109461c;
        int i3 = C0126R.C0127drawable.ic_error;
        switch (i2) {
            case 2:
            case 272:
            case 528:
            case 1043:
            case 1296:
            case 1547:
            case 1803:
                int i4 = Build.VERSION.SDK_INT;
                i3 = C0126R.C0127drawable.quantum_ic_system_update_white_24;
                break;
            case 263:
            case 274:
            case 275:
            case 518:
            case 775:
            case 1031:
            case 1040:
            case 1042:
            case 1298:
            case 2059:
            case 2315:
                int i5 = Build.VERSION.SDK_INT;
                if (qkj.m32287a(this.f93501f, C0126R.C0127drawable.ic_error) == 0) {
                    i3 = C0126R.C0127drawable.notification_system_update_download_failure;
                    break;
                }
                break;
            default:
                throw new IllegalStateException(String.format(Locale.US, "Unable to handle the status: %d.", Integer.valueOf(systemUpdateStatus.f109461c)));
        }
        jeVar.mo13630b(qkj.m32287a(this.f93501f, i3));
        jeVar.mo13627a(false);
        jeVar.mo13633b(z);
        jeVar.mo13640e(mo51389a(systemUpdateStatus));
        switch (systemUpdateStatus.f109461c) {
            case 2:
                str = this.f93501f.getString(C0126R.string.system_update_downloading_title_text);
                break;
            case 263:
            case 274:
            case 775:
            case 1031:
            case 1042:
            case 1298:
                str = this.f93501f.getString(C0126R.string.system_update_notification_learn_more);
                break;
            case 272:
                str = this.f93501f.getString(C0126R.string.system_update_notification_learn_more_and_install);
                break;
            case 275:
            case 1040:
            case 2315:
                str = this.f93501f.getString(C0126R.string.system_update_low_battery_text);
                break;
            case 518:
                str = this.f93501f.getString(C0126R.string.system_update_download_error_no_space_notification_message);
                break;
            case 528:
            case 1296:
                str = this.f93501f.getString(C0126R.string.system_update_notification_message_pending_reboot);
                break;
            case 1043:
                str = this.f93501f.getString(C0126R.string.system_update_notification_learn_more_and_install);
                break;
            case 1547:
                str = this.f93501f.getString(C0126R.string.system_update_download_paused_title_text);
                break;
            case 1803:
                long currentTimeMillis = System.currentTimeMillis() - systemUpdateStatus.f109472n;
                if (avmd.m78788c(currentTimeMillis) <= 0) {
                    str = this.f93501f.getString(C0126R.string.system_update_notification_learn_more_and_download);
                    break;
                } else {
                    int max = (int) Math.max(TimeUnit.MILLISECONDS.toDays(currentTimeMillis), 1L);
                    str = TextUtils.expandTemplate(this.f93501f.getText(C0126R.string.system_update_overdue_warning), this.f93501f.getResources().getQuantityString(C0126R.plurals.ota_unit_days, max, Integer.valueOf(max))).toString();
                    break;
                }
            case 2059:
                str = this.f93501f.getString(C0126R.string.system_update_notification_message_wifi_disconnected);
                break;
            default:
                throw new IllegalStateException(String.format(Locale.US, "Unable to handle status: %d.", Integer.valueOf(systemUpdateStatus.f109461c)));
        }
        jeVar.mo13632b(str);
        jeVar.mo13631b(avnh.m78873b(this.f93501f, 4));
        Context context = this.f93501f;
        Intent a = avmg.m78795a();
        a.putExtra("triggered_by_notification", true);
        jeVar.f22254f = PendingIntent.getActivity(context, 0, a, 134217728);
        int i6 = systemUpdateStatus.f109461c;
        if (i6 == 272 || i6 == 528) {
            jeVar.mo13624a(new C1096iz(0, this.f93501f.getString(C0126R.string.system_update_restart_now), avnh.m78873b(this.f93501f, 1)).mo13508a());
            if (avlw.m78757a(this.f93501f)) {
                try {
                    avmc a2 = avmc.m78777a(cfsj.m142903c());
                    Calendar instance = Calendar.getInstance();
                    instance.set(11, (int) (a2.f93374c / 60));
                    instance.set(12, (int) (a2.f93374c % 60));
                    jeVar.mo13624a(new C1096iz(0, TextUtils.expandTemplate(this.f93501f.getString(C0126R.string.system_update_restart_after), DateFormat.getTimeInstance(3).format(instance.getTime())), avnh.m78873b(this.f93501f, 2)).mo13508a());
                } catch (avlq e) {
                    f93408a.mo25418e("Unable to parse restart time window: %s.", cfsj.m142903c());
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (systemUpdateStatus.f109461c != 1803) {
            jeVar.f22271w = C1133kh.m17843b(this.f93501f, C0126R.color.system_update_notification_color);
        } else {
            int c = avmd.m78788c(System.currentTimeMillis() - systemUpdateStatus.f109472n);
            int[] intArray = this.f93501f.getResources().getIntArray(C0126R.array.escalation_icon_colors);
            int length = intArray.length;
            if (c >= length) {
                i = intArray[length - 1];
            } else {
                i = intArray[c];
            }
            jeVar.f22271w = i;
        }
        jeVar.f22268t = true;
        int i8 = Build.VERSION.SDK_INT;
        Bundle bundle = new Bundle();
        bundle.putString("android.substName", this.f93501f.getString(C0126R.string.system_update_module_name));
        jeVar.mo13623a(bundle);
        return jeVar.mo13629b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo51389a(SystemUpdateStatus systemUpdateStatus) {
        int i = systemUpdateStatus.f109461c;
        if (i != 1803) {
            switch (i) {
                case 2:
                    return this.f93501f.getString(C0126R.string.system_update_downloading_title_text);
                case 263:
                case 274:
                case 775:
                case 1031:
                case 1042:
                case 1298:
                    return this.f93501f.getString(C0126R.string.system_update_installation_error_notification_title);
                case 272:
                case 528:
                case 1296:
                    return bmxx.m108577a((String) avma.f93355a.mo51364a()) ? this.f93501f.getString(C0126R.string.system_update_installation_notification_title) : (String) avma.f93355a.mo51364a();
                case 275:
                case 1040:
                case 1547:
                case 2059:
                case 2315:
                    return this.f93501f.getString(C0126R.string.system_update_notification_title_update_paused);
                case 518:
                    return this.f93501f.getString(C0126R.string.system_update_download_error_notification_title);
                case 1043:
                case 1803:
                    return bmxx.m108577a((String) avma.f93355a.mo51364a()) ? this.f93501f.getString(C0126R.string.system_update_update_available_title_text) : (String) avma.f93355a.mo51364a();
                default:
                    throw new IllegalStateException(String.format(Locale.US, "Unable to handle the status: %d.", Integer.valueOf(systemUpdateStatus.f109461c)));
            }
        } else if (avmd.m78788c(System.currentTimeMillis() - systemUpdateStatus.f109472n) > 0) {
            return this.f93501f.getString(C0126R.string.system_update_overdue_status_text);
        } else {
            return bmxx.m108577a((String) avma.f93355a.mo51364a()) ? this.f93501f.getString(C0126R.string.system_update_update_available_title_text) : (String) avma.f93355a.mo51364a();
        }
    }
}
