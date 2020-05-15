package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.cast.JGCastService;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: brsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brsy {

    /* renamed from: a */
    private static final AtomicInteger f143308a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: a */
    private static int m114540a() {
        return f143308a.incrementAndGet();
    }

    /* renamed from: a */
    private static PendingIntent m114541a(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, m114540a(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), JGCastService.FLAG_PRIVATE_DISPLAY);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x032e A[SYNTHETIC, Splitter:B:111:0x032e] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0388 A[SYNTHETIC, Splitter:B:120:0x0388] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x047d  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x04c2  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02d6  */
    /* renamed from: a */
    public static brsx m114542a(Context context, String str, brta brta, String str2, Resources resources, PackageManager packageManager, Bundle bundle) {
        int i;
        String a;
        int[] iArr;
        Uri uri;
        String a2;
        Intent intent;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        Integer a3;
        String a4;
        Integer c;
        Integer c2;
        Integer c3;
        String a5;
        Long l;
        JSONArray d;
        long[] jArr;
        JSONArray d2;
        String a6;
        Uri uri2;
        Context context2 = context;
        String str3 = str;
        brta brta2 = brta;
        Resources resources2 = resources;
        PackageManager packageManager2 = packageManager;
        Bundle bundle2 = bundle;
        C1102je jeVar = new C1102je(context2, str2);
        String b = brta2.mo69846b(resources2, str3, "gcm.n.title");
        if (!TextUtils.isEmpty(b)) {
            jeVar.mo13640e(b);
        }
        String b2 = brta2.mo69846b(resources2, str3, "gcm.n.body");
        if (!TextUtils.isEmpty(b2)) {
            jeVar.mo13632b(b2);
            C1101jd jdVar = new C1101jd();
            jdVar.mo13593a(b2);
            jeVar.mo13626a(jdVar);
        }
        String a7 = brta2.mo69845a("gcm.n.icon");
        int i2 = 0;
        if (!TextUtils.isEmpty(a7)) {
            i = resources2.getIdentifier(a7, "drawable", str3);
            if (i == 0 && (i = resources2.getIdentifier(a7, "mipmap", str3)) == 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(a7).length() + 61);
                sb.append("Icon resource ");
                sb.append(a7);
                sb.append(" not found. Notification will use default icon.");
                Log.w("FirebaseMessaging", sb.toString());
            } else {
                int i3 = Build.VERSION.SDK_INT;
                jeVar.mo13630b(i);
                a = brta2.mo69845a("gcm.n.sound2");
                if (TextUtils.isEmpty(a)) {
                    a = brta2.mo69845a("gcm.n.sound");
                }
                iArr = null;
                if (!TextUtils.isEmpty(a)) {
                    uri = null;
                } else if ("default".equals(a) || resources2.getIdentifier(a, "raw", str3) == 0) {
                    uri = RingtoneManager.getDefaultUri(2);
                } else {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(a).length());
                    sb2.append("android.resource://");
                    sb2.append(str3);
                    sb2.append("/raw/");
                    sb2.append(a);
                    uri = Uri.parse(sb2.toString());
                }
                if (uri != null) {
                    jeVar.mo13622a(uri);
                }
                a2 = brta2.mo69845a("gcm.n.click_action");
                if (TextUtils.isEmpty(a2)) {
                    intent = new Intent(a2);
                    intent.setPackage(str3);
                    intent.setFlags(268435456);
                } else {
                    String a8 = brta2.mo69845a("gcm.n.link_android");
                    if (TextUtils.isEmpty(a8)) {
                        a8 = brta2.mo69845a("gcm.n.link");
                    }
                    if (!TextUtils.isEmpty(a8)) {
                        uri2 = Uri.parse(a8);
                    } else {
                        uri2 = null;
                    }
                    if (uri2 != null) {
                        intent = new Intent("android.intent.action.VIEW");
                        intent.setPackage(str3);
                        intent.setData(uri2);
                    } else {
                        intent = packageManager2.getLaunchIntentForPackage(str3);
                        if (intent == null) {
                            Log.w("FirebaseMessaging", "No activity found to launch app");
                        }
                    }
                }
                if (intent == null) {
                    intent.addFlags(67108864);
                    Bundle bundle3 = new Bundle(brta2.f143310a);
                    for (String str4 : brta2.f143310a.keySet()) {
                        if (str4.startsWith("google.c.") || str4.startsWith("gcm.n.") || str4.startsWith("gcm.notification.")) {
                            bundle3.remove(str4);
                        }
                    }
                    intent.putExtras(bundle3);
                    pendingIntent = PendingIntent.getActivity(context2, m114540a(), intent, JGCastService.FLAG_PRIVATE_DISPLAY);
                    if (m114544a(brta)) {
                        pendingIntent = m114541a(context2, new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN").putExtras(brta.mo69843a()).putExtra("pending_intent", pendingIntent));
                    }
                } else {
                    pendingIntent = null;
                }
                jeVar.f22254f = pendingIntent;
                if (!m114544a(brta)) {
                    pendingIntent2 = m114541a(context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(brta.mo69843a()));
                } else {
                    pendingIntent2 = null;
                }
                if (pendingIntent2 != null) {
                    jeVar.mo13631b(pendingIntent2);
                }
                a3 = m114543a(context2, brta2.mo69845a("gcm.n.color"), bundle2);
                if (a3 != null) {
                    jeVar.f22271w = a3.intValue();
                }
                jeVar.mo13627a(!brta2.mo69847b("gcm.n.sticky"));
                jeVar.f22268t = brta2.mo69847b("gcm.n.local_only");
                a4 = brta2.mo69845a("gcm.n.ticker");
                if (a4 != null) {
                    jeVar.mo13639d(a4);
                }
                c = brta2.mo69848c("gcm.n.notification_priority");
                if (c != null) {
                    c = null;
                } else if (c.intValue() < -2 || c.intValue() > 2) {
                    String valueOf = String.valueOf(c);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 72);
                    sb3.append("notificationPriority is invalid ");
                    sb3.append(valueOf);
                    sb3.append(". Skipping setting notificationPriority.");
                    Log.w("FirebaseMessaging", sb3.toString());
                    c = null;
                }
                if (c != null) {
                    jeVar.f22258j = c.intValue();
                }
                c2 = brta2.mo69848c("gcm.n.visibility");
                if (c2 != null) {
                    c2 = null;
                } else if (c2.intValue() < -1 || c2.intValue() > 1) {
                    String valueOf2 = String.valueOf(c2);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 53);
                    sb4.append("visibility is invalid: ");
                    sb4.append(valueOf2);
                    sb4.append(". Skipping setting visibility.");
                    Log.w("NotificationParams", sb4.toString());
                    c2 = null;
                }
                if (c2 != null) {
                    jeVar.f22272x = c2.intValue();
                }
                c3 = brta2.mo69848c("gcm.n.notification_count");
                if (c3 != null) {
                    c3 = null;
                } else if (c3.intValue() < 0) {
                    String valueOf3 = String.valueOf(c3);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf3).length() + 67);
                    sb5.append("notificationCount is invalid: ");
                    sb5.append(valueOf3);
                    sb5.append(". Skipping setting notificationCount.");
                    Log.w("FirebaseMessaging", sb5.toString());
                    c3 = null;
                }
                if (c3 != null) {
                    jeVar.f22257i = c3.intValue();
                }
                a5 = brta2.mo69845a("gcm.n.event_time");
                if (TextUtils.isEmpty(a5)) {
                    try {
                        l = Long.valueOf(Long.parseLong(a5));
                    } catch (NumberFormatException e) {
                        String e2 = brta.m114545e("gcm.n.event_time");
                        StringBuilder sb6 = new StringBuilder(String.valueOf(e2).length() + 38 + String.valueOf(a5).length());
                        sb6.append("Couldn't parse value of ");
                        sb6.append(e2);
                        sb6.append("(");
                        sb6.append(a5);
                        sb6.append(") into a long");
                        Log.w("NotificationParams", sb6.toString());
                        l = null;
                    }
                } else {
                    l = null;
                }
                if (l != null) {
                    jeVar.f22259k = true;
                    jeVar.mo13619a(l.longValue());
                }
                d = brta2.mo69849d("gcm.n.vibrate_timings");
                if (d == null) {
                    try {
                        if (d.length() > 1) {
                            int length = d.length();
                            jArr = new long[length];
                            for (int i4 = 0; i4 < length; i4++) {
                                jArr[i4] = d.optLong(i4);
                            }
                        } else {
                            throw new JSONException("vibrateTimings have invalid length");
                        }
                    } catch (NumberFormatException | JSONException e3) {
                        String valueOf4 = String.valueOf(d);
                        StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf4).length() + 74);
                        sb7.append("User defined vibrateTimings is invalid: ");
                        sb7.append(valueOf4);
                        sb7.append(". Skipping setting vibrateTimings.");
                        Log.w("NotificationParams", sb7.toString());
                        jArr = null;
                    }
                } else {
                    jArr = null;
                }
                if (jArr != null) {
                    jeVar.mo13628a(jArr);
                }
                d2 = brta2.mo69849d("gcm.n.light_settings");
                if (d2 != null) {
                    int[] iArr2 = new int[3];
                    try {
                        if (d2.length() == 3) {
                            int parseColor = Color.parseColor(d2.optString(0));
                            if (parseColor != -16777216) {
                                iArr2[0] = parseColor;
                                iArr2[1] = d2.optInt(1);
                                iArr2[2] = d2.optInt(2);
                                iArr = iArr2;
                            } else {
                                throw new IllegalArgumentException("Transparent color is invalid");
                            }
                        } else {
                            throw new JSONException("lightSettings don't have all three fields");
                        }
                    } catch (JSONException e4) {
                        String valueOf5 = String.valueOf(d2);
                        StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf5).length() + 58);
                        sb8.append("LightSettings is invalid: ");
                        sb8.append(valueOf5);
                        sb8.append(". Skipping setting LightSettings");
                        Log.w("NotificationParams", sb8.toString());
                    } catch (IllegalArgumentException e5) {
                        String valueOf6 = String.valueOf(d2);
                        String message = e5.getMessage();
                        StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf6).length() + 60 + String.valueOf(message).length());
                        sb9.append("LightSettings is invalid: ");
                        sb9.append(valueOf6);
                        sb9.append(". ");
                        sb9.append(message);
                        sb9.append(". Skipping setting LightSettings");
                        Log.w("NotificationParams", sb9.toString());
                    }
                }
                if (iArr != null) {
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    int i7 = iArr[2];
                    jeVar.f22247E.ledARGB = i5;
                    jeVar.f22247E.ledOnMS = i6;
                    jeVar.f22247E.ledOffMS = i7;
                    if (!(jeVar.f22247E.ledOnMS == 0 || jeVar.f22247E.ledOffMS == 0)) {
                        i2 = 1;
                    }
                    Notification notification = jeVar.f22247E;
                    notification.flags = (notification.flags & -2) | i2;
                }
                boolean b3 = brta2.mo69847b("gcm.n.default_sound");
                if (brta2.mo69847b("gcm.n.default_vibrate_timings")) {
                    b3 |= true;
                }
                if (brta2.mo69847b("gcm.n.default_light_settings")) {
                    b3 |= true;
                }
                jeVar.mo13616a(b3 ? 1 : 0);
                a6 = brta2.mo69845a("gcm.n.tag");
                if (TextUtils.isEmpty(a6)) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    StringBuilder sb10 = new StringBuilder(37);
                    sb10.append("FCM-Notification:");
                    sb10.append(uptimeMillis);
                    a6 = sb10.toString();
                }
                return new brsx(jeVar, a6);
            }
        }
        int i8 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i8 == 0) {
            try {
                i8 = packageManager2.getApplicationInfo(str3, 0).icon;
            } catch (PackageManager.NameNotFoundException e6) {
                String valueOf7 = String.valueOf(e6);
                StringBuilder sb11 = new StringBuilder(String.valueOf(valueOf7).length() + 35);
                sb11.append("Couldn't get own application info: ");
                sb11.append(valueOf7);
                Log.w("FirebaseMessaging", sb11.toString());
            }
        } else {
            int i9 = Build.VERSION.SDK_INT;
        }
        if (i != 0) {
            int i10 = Build.VERSION.SDK_INT;
        } else {
            i = 17301651;
        }
        jeVar.mo13630b(i);
        a = brta2.mo69845a("gcm.n.sound2");
        if (TextUtils.isEmpty(a)) {
        }
        iArr = null;
        if (!TextUtils.isEmpty(a)) {
        }
        if (uri != null) {
        }
        a2 = brta2.mo69845a("gcm.n.click_action");
        if (TextUtils.isEmpty(a2)) {
        }
        if (intent == null) {
        }
        jeVar.f22254f = pendingIntent;
        if (!m114544a(brta)) {
        }
        if (pendingIntent2 != null) {
        }
        a3 = m114543a(context2, brta2.mo69845a("gcm.n.color"), bundle2);
        if (a3 != null) {
        }
        jeVar.mo13627a(!brta2.mo69847b("gcm.n.sticky"));
        jeVar.f22268t = brta2.mo69847b("gcm.n.local_only");
        a4 = brta2.mo69845a("gcm.n.ticker");
        if (a4 != null) {
        }
        c = brta2.mo69848c("gcm.n.notification_priority");
        if (c != null) {
        }
        if (c != null) {
        }
        c2 = brta2.mo69848c("gcm.n.visibility");
        if (c2 != null) {
        }
        if (c2 != null) {
        }
        c3 = brta2.mo69848c("gcm.n.notification_count");
        if (c3 != null) {
        }
        if (c3 != null) {
        }
        a5 = brta2.mo69845a("gcm.n.event_time");
        if (TextUtils.isEmpty(a5)) {
        }
        if (l != null) {
        }
        d = brta2.mo69849d("gcm.n.vibrate_timings");
        if (d == null) {
        }
        if (jArr != null) {
        }
        d2 = brta2.mo69849d("gcm.n.light_settings");
        if (d2 != null) {
        }
        if (iArr != null) {
        }
        boolean b32 = brta2.mo69847b("gcm.n.default_sound");
        if (brta2.mo69847b("gcm.n.default_vibrate_timings")) {
        }
        if (brta2.mo69847b("gcm.n.default_light_settings")) {
        }
        jeVar.mo13616a(b32 ? 1 : 0);
        a6 = brta2.mo69845a("gcm.n.tag");
        if (TextUtils.isEmpty(a6)) {
        }
        return new brsx(jeVar, a6);
    }

    /* renamed from: a */
    private static Integer m114543a(Context context, String str, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                sb.append("Color is invalid: ");
                sb.append(str);
                sb.append(". Notification will use default color.");
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        int i2 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i2 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(C1133kh.m17843b(context, i2));
        } catch (Resources.NotFoundException e2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* renamed from: a */
    static boolean m114544a(brta brta) {
        return brta.mo69847b("google.c.a.e");
    }
}
