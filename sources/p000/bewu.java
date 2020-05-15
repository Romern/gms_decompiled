package p000;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bewu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bewu implements bews {

    /* renamed from: a */
    public final Context f112854a;

    /* renamed from: b */
    private final beww f112855b;

    public bewu(Context context) {
        this.f112854a = context;
        this.f112855b = new beww(context);
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
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        if (r14 != false) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0130 A[SYNTHETIC, Splitter:B:55:0x0130] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0182 A[Catch:{ Exception -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01c4 A[Catch:{ Exception -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo61207a(boolean z) {
        SharedPreferences sharedPreferences;
        int i;
        String str;
        int i2;
        bewv bewv;
        String str2;
        String str3;
        String str4;
        if (ceyj.f183510a.mo6606a().dndNotificationMasterSwitch() && (sharedPreferences = this.f112854a.getSharedPreferences("dndNotificationSharedPreference", 0)) != null && !sharedPreferences.getBoolean("dndNotificationSent", false)) {
            Context context = this.f112854a;
            int i3 = 3;
            if (ceuz.m138278c()) {
                if (cevf.m138284b() && ccra.m131312d()) {
                    SharedPreferences sharedPreferences2 = context.getSharedPreferences("driving_mode_frx_prefs", 0);
                    if (!sharedPreferences2.getBoolean("frx_completed", false) && !sharedPreferences2.getBoolean("gearhead_frx_completed", false) && !ccrp.m131365c()) {
                        i = 2;
                        Context context2 = this.f112854a;
                        beww beww = this.f112855b;
                        if (i == 1) {
                            str = i != 2 ? "DND_NOTIFICATION" : "DRIVE_MODE_NOTIFICATION";
                        } else {
                            str = "UNKNOWN_DONOT_SEND";
                        }
                        StringBuilder sb = new StringBuilder(str.length() + 42);
                        sb.append("Getting notification content for category ");
                        sb.append(str);
                        sb.toString();
                        Intent intent = new Intent();
                        i2 = i - 1;
                        if (i2 != 1) {
                            if (!ceyj.m138432f() || TextUtils.isEmpty(ceyj.m138431e()) || TextUtils.isEmpty(ceyj.m138430d())) {
                                str2 = beww.f112860a.getString(C0126R.string.dnd_notification_title);
                                str3 = beww.f112860a.getString(C0126R.string.dm_dnd_notification_text);
                            } else {
                                str2 = ceyj.m138431e();
                                str3 = ceyj.m138430d();
                            }
                            Context context3 = beww.f112860a;
                            if (!ccrj.m131353b()) {
                                str4 = "com.google.android.gms.carsetup.DrivingModeFrxActivity";
                            } else {
                                str4 = "com.google.android.location.drivingmode.DrivingModeFrxActivity";
                            }
                            intent.setComponent(new ComponentName(context3, str4));
                            intent.putExtra("com.google.android.location.activity.DRIVING_MODE_NOTIFICATION", true);
                        } else if (i2 != 2) {
                            bewv = null;
                            if (bewv != null) {
                                try {
                                    Bundle bundle = new Bundle();
                                    if (ceyj.m138432f()) {
                                        if (!TextUtils.isEmpty(ceyj.m138429c())) {
                                            bundle.putString("android.substName", ceyj.m138429c());
                                            C1102je jeVar = new C1102je(context2);
                                            jeVar.mo13640e(bewv.f112856a);
                                            jeVar.mo13632b(bewv.f112857b);
                                            jeVar.mo13630b(bewv.f112858c);
                                            jeVar.mo13627a(true);
                                            jeVar.f22254f = bewv.f112859d;
                                            jeVar.mo13623a(bundle);
                                            sex a = sex.m35104a(context2);
                                            if (ceyj.f183510a.mo6606a().dndNotificationChannelEnabled()) {
                                                int i4 = Build.VERSION.SDK_INT;
                                                if (!ceyj.f183510a.mo6606a().enableDndNotificationDefaultImportanceChannel()) {
                                                    i3 = 1;
                                                }
                                                try {
                                                    a.mo25442a(new NotificationChannel("com.google.android.location.activity.dnd.notification.dndNotificationChannel", "New services", i3));
                                                } catch (Exception e) {
                                                }
                                                jeVar.f22244B = "com.google.android.location.activity.dnd.notification.dndNotificationChannel";
                                            }
                                            Notification b = jeVar.mo13629b();
                                            int i5 = bewt.f112853a;
                                            bewt.f112853a = i5 + 1;
                                            a.mo25445a("QKFO5tsEEemUURv0IK/OzQ", i5, b);
                                            SharedPreferences.Editor edit = context2.getSharedPreferences("dndNotificationSharedPreference", 0).edit();
                                            edit.putBoolean("dndNotificationSent", true);
                                            edit.commit();
                                            if (!ceyj.m138428b()) {
                                                bewq.m95998a(context2).mo61203a(7);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    bundle.putString("android.substName", "System");
                                    C1102je jeVar2 = new C1102je(context2);
                                    jeVar2.mo13640e(bewv.f112856a);
                                    jeVar2.mo13632b(bewv.f112857b);
                                    jeVar2.mo13630b(bewv.f112858c);
                                    jeVar2.mo13627a(true);
                                    jeVar2.f22254f = bewv.f112859d;
                                    jeVar2.mo13623a(bundle);
                                    sex a2 = sex.m35104a(context2);
                                    if (ceyj.f183510a.mo6606a().dndNotificationChannelEnabled()) {
                                    }
                                    Notification b2 = jeVar2.mo13629b();
                                    int i52 = bewt.f112853a;
                                    bewt.f112853a = i52 + 1;
                                    a2.mo25445a("QKFO5tsEEemUURv0IK/OzQ", i52, b2);
                                    SharedPreferences.Editor edit2 = context2.getSharedPreferences("dndNotificationSharedPreference", 0).edit();
                                    edit2.putBoolean("dndNotificationSent", true);
                                    edit2.commit();
                                    if (!ceyj.m138428b()) {
                                    }
                                } catch (Exception e2) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            str2 = beww.f112860a.getString(C0126R.string.dnd_notification_title);
                            str3 = beww.f112860a.getString(C0126R.string.dnd_notification_text);
                            intent.setComponent(new ComponentName(beww.f112860a, "com.google.android.location.settings.ActivityRecognitionPermissionActivity"));
                        }
                        intent.setFlags(603979776);
                        bewv = new bewv(str2, str3, qkj.m32287a(beww.f112860a, C0126R.C0127drawable.quantum_ic_directions_car_black_24), PendingIntent.getActivity(beww.f112860a, 0, intent, 134217728));
                        if (bewv != null) {
                        }
                    }
                }
                if (ceuz.m138277b()) {
                    int i6 = Build.VERSION.SDK_INT;
                    if (cevc.m138281b()) {
                        if (!cevc.m138281b()) {
                            i = 1;
                            Context context22 = this.f112854a;
                            beww beww2 = this.f112855b;
                            if (i == 1) {
                            }
                            StringBuilder sb2 = new StringBuilder(str.length() + 42);
                            sb2.append("Getting notification content for category ");
                            sb2.append(str);
                            sb2.toString();
                            Intent intent2 = new Intent();
                            i2 = i - 1;
                            if (i2 != 1) {
                            }
                            intent2.setFlags(603979776);
                            bewv = new bewv(str2, str3, qkj.m32287a(beww2.f112860a, C0126R.C0127drawable.quantum_ic_directions_car_black_24), PendingIntent.getActivity(beww2.f112860a, 0, intent2, 134217728));
                            if (bewv != null) {
                            }
                        }
                    }
                    i = 3;
                    Context context222 = this.f112854a;
                    beww beww22 = this.f112855b;
                    if (i == 1) {
                    }
                    StringBuilder sb22 = new StringBuilder(str.length() + 42);
                    sb22.append("Getting notification content for category ");
                    sb22.append(str);
                    sb22.toString();
                    Intent intent22 = new Intent();
                    i2 = i - 1;
                    if (i2 != 1) {
                    }
                    intent22.setFlags(603979776);
                    bewv = new bewv(str2, str3, qkj.m32287a(beww22.f112860a, C0126R.C0127drawable.quantum_ic_directions_car_black_24), PendingIntent.getActivity(beww22.f112860a, 0, intent22, 134217728));
                    if (bewv != null) {
                    }
                }
            }
            i = 1;
            Context context2222 = this.f112854a;
            beww beww222 = this.f112855b;
            if (i == 1) {
            }
            StringBuilder sb222 = new StringBuilder(str.length() + 42);
            sb222.append("Getting notification content for category ");
            sb222.append(str);
            sb222.toString();
            Intent intent222 = new Intent();
            i2 = i - 1;
            if (i2 != 1) {
            }
            intent222.setFlags(603979776);
            bewv = new bewv(str2, str3, qkj.m32287a(beww222.f112860a, C0126R.C0127drawable.quantum_ic_directions_car_black_24), PendingIntent.getActivity(beww222.f112860a, 0, intent222, 134217728));
            if (bewv != null) {
            }
        }
    }
}
