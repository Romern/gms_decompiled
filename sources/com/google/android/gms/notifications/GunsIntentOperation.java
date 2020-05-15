package com.google.android.gms.notifications;

import android.accounts.Account;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.internal.ClientContext;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GunsIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final srn f81215a = srn.m36127a(sgj.GUNS);

    /* renamed from: b */
    private static final long f81216b = TimeUnit.SECONDS.toMicros(10);

    /* renamed from: a */
    public static String m67668a(blcs blcs) {
        if (akoc.m60124c(blcs) && akoc.m60122b(blcs)) {
            blco blco = blcs.f125978c;
            if (blco == null) {
                blco = blco.f125949g;
            }
            String str = blco.f125953c;
            blcw blcw = blcs.f125977b;
            if (blcw == null) {
                blcw = blcw.f125993b;
            }
            String str2 = blcw.f125995a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            return sb.toString();
        } else if (akoc.m60122b(blcs)) {
            blco blco2 = blcs.f125978c;
            if (blco2 == null) {
                blco2 = blco.f125949g;
            }
            String str3 = blco2.f125956f;
            blcw blcw2 = blcs.f125977b;
            if (blcw2 == null) {
                blcw2 = blcw.f125993b;
            }
            String str4 = blcw2.f125995a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append(":");
            sb2.append(str4);
            return sb2.toString();
        } else {
            blco blco3 = blcs.f125978c;
            if (blco3 == null) {
                blco3 = blco.f125949g;
            }
            return blco3.f125956f;
        }
    }

    public final void onCreate() {
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
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00da, code lost:
        if (r4.equals(r9.f126002c.toLowerCase()) == false) goto L_0x00dc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0209 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0210 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0221 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0222 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x022d A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x022e A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0239 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x023a A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0245 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0246 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0255 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0261 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0262 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0269 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x026a A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0270 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0272 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0277 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0278 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x027e A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x027f A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0288 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0289 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0291 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x029b A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x02a2 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x02a3 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x02ab A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x02ac A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x02f2 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x02f3 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x02fa A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x02fb A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0305 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0345 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0346 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0354 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x03c5 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x03c6 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x03d0 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x03d1 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x03e9 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x03ea A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x03f0 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x044e A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0458 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0460 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0461 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0467 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0468 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0472 A[Catch:{ gid | IOException -> 0x0077, all -> 0x05ea }] */
    public final void onHandleIntent(Intent intent) {
        String str;
        Long l;
        Notification notification;
        String str2;
        int i;
        int a;
        int i2;
        blda blda;
        blda blda2;
        blda blda3;
        blda blda4;
        long j;
        blda blda5;
        int i3;
        blda blda6;
        blda blda7;
        boolean z;
        bldb bldb;
        PendingIntent pendingIntent;
        blda blda8;
        blda blda9;
        blda blda10;
        blda blda11;
        blda blda12;
        blcl blcl;
        PendingIntent pendingIntent2;
        int i4;
        String str3;
        Intent intent2 = intent;
        try {
            String action = intent.getAction();
            if (!"com.google.android.gms.notifications.intents.LOAD_NOTIFICATIONS_FROM_DB".equals(action)) {
                blcs a2 = akoc.m60116a(intent);
                if (a2 == null) {
                    ((bnsl) f81215a.mo68388c()).mo68405a("Failed to retrieve payload from intent.");
                } else {
                    if (intent2.hasExtra("com.google.android.gms.notifications.intents.accountName")) {
                        str = intent2.getStringExtra("com.google.android.gms.notifications.intents.accountName");
                    } else if (akoc.m60122b(a2)) {
                        blcw blcw = a2.f125977b;
                        if (blcw == null) {
                            blcw = blcw.f125993b;
                        }
                        str3 = blcw.f125995a;
                        Context applicationContext = getApplicationContext();
                        Iterator it = soz.m35801d(applicationContext, applicationContext.getPackageName()).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                str = null;
                                break;
                            }
                            Account account = (Account) it.next();
                            if (str3.equals(gie.m13198c(applicationContext, account.name))) {
                                str = account.name;
                                break;
                            }
                        }
                    } else {
                        str = null;
                    }
                    int i5 = 1;
                    if (a2.f125979d || "com.google.android.gms.notifications.intents.HANDLE_NOTIFICATION_ACTION".equals(action)) {
                        if (akoc.m60124c(a2)) {
                            Bundle extras = intent.getExtras();
                            boolean z2 = extras.getBoolean("com.google.android.gms.notifications.intents.removeFromSystemTray", true);
                            int a3 = blch.m107015a(extras.getInt("com.google.android.gms.notifications.intents.readState", 0));
                            if (a3 != 0) {
                                i5 = a3;
                            }
                            String string = extras.getString("com.google.android.gms.notifications.intents.actionId", null);
                            if (a2.f125978c == null) {
                                blco blco = blco.f125949g;
                            }
                            if (z2) {
                                if (!cfqb.m142534b()) {
                                    akog.m60129a(this, m67668a(a2));
                                }
                                sex.m35104a(this).mo25444a(m67668a(a2), 1000);
                            }
                            if (!a2.f125979d && !TextUtils.isEmpty(str)) {
                                mo44700a(a2, str, i5, string);
                            }
                        }
                    } else if ("com.google.android.gms.notifications.intents.START_SERVICE".equals(action)) {
                        if (akoc.m60125d(a2)) {
                            if (!TextUtils.isEmpty(str)) {
                                blcy blcy = a2.f125982g;
                                if (blcy == null) {
                                    blcy = blcy.f125998h;
                                }
                                if (!blcy.f126002c.isEmpty()) {
                                    String lowerCase = aknl.m60090a(getApplicationContext()).toLowerCase();
                                    blcy blcy2 = a2.f125982g;
                                    if (blcy2 == null) {
                                        blcy2 = blcy.f125998h;
                                    }
                                }
                                if (intent2.getBooleanExtra("GunsService.refetch", true)) {
                                    mo44699a(intent2, a2, str);
                                }
                            }
                            if (!TextUtils.isEmpty(str)) {
                                Context applicationContext2 = getApplicationContext();
                                if (TextUtils.isEmpty(new sie(aknz.m60112a(applicationContext2, str)).mo25585a(applicationContext2))) {
                                    ((bnsl) f81215a.mo68388c()).mo68420a("Payload has a recipient [%s] without valid credentials - did the user sign out?", str);
                                }
                            }
                            if (!cfpv.f185414a.mo6606a().mo82484a() || a2.f125985j == 0) {
                                l = null;
                            } else if (intent2.getLongExtra("GunsService.serverTimeUsec", 0) != 0) {
                                l = Long.valueOf(a2.f125985j - intent2.getLongExtra("GunsService.serverTimeUsec", 0));
                                if (l.longValue() <= f81216b) {
                                    ((bnsl) f81215a.mo68388c()).mo68420a("Received expired payload for [%s]. Notification not shown", str);
                                }
                            } else {
                                ((bnsl) f81215a.mo68388c()).mo68420a("Server time not available for payload with expiration [%s]. Notification not shown", str);
                            }
                            if (cfpy.f185417a.mo6606a().mo82486a() && intent2.getBooleanExtra("GunsService.intentCallback", true)) {
                                blcm blcm = a2.f125984i;
                                if (blcm == null) {
                                    blcm = blcm.f125941c;
                                }
                                if ((blcm.f125943a & 1) != 0) {
                                    blcm blcm2 = a2.f125984i;
                                    if (blcm2 == null) {
                                        blcm2 = blcm.f125941c;
                                    }
                                    blcp blcp = blcm2.f125944b;
                                    if (blcp == null) {
                                        blcp = blcp.f125957g;
                                    }
                                    aknx.m60108a(this, blcp);
                                }
                            }
                            akoj a4 = akoj.m60132a(getApplicationContext());
                            if (akoc.m60125d(a2)) {
                                aknw a5 = aknw.m60102a(a4.f72355b);
                                blda blda13 = a2.f125980e;
                                if (blda13 == null) {
                                    blda13 = blda.f126015t;
                                }
                                blcn blcn = blda13.f126019c;
                                if (blcn == null) {
                                    blcn = blcn.f125945b;
                                }
                                if (!blcn.f125947a.isEmpty()) {
                                    blda blda14 = a2.f125980e;
                                    if (blda14 == null) {
                                        blda14 = blda.f126015t;
                                    }
                                    blcn blcn2 = blda14.f126019c;
                                    if (blcn2 == null) {
                                        blcn2 = blcn.f125945b;
                                    }
                                    str2 = blcn2.f125947a;
                                } else {
                                    str2 = null;
                                }
                                Bitmap a6 = a5.mo39594a(str2);
                                blda blda15 = a2.f125980e;
                                if (blda15 == null) {
                                    blda15 = blda.f126015t;
                                }
                                if ((blda15.f126017a & 1) != 0) {
                                    blda blda16 = a2.f125980e;
                                    if (blda16 == null) {
                                        blda16 = blda.f126015t;
                                    }
                                    if (blda16.f126018b >= -2) {
                                        blda blda17 = a2.f125980e;
                                        if (blda17 == null) {
                                            blda17 = blda.f126015t;
                                        }
                                        if (blda17.f126018b <= 2) {
                                            blda blda18 = a2.f125980e;
                                            if (blda18 == null) {
                                                blda18 = blda.f126015t;
                                            }
                                            i = blda18.f126018b;
                                            a = akoc.m60115a(a2);
                                            if (a == -1) {
                                                i2 = qkj.m32287a(a4.f72355b, a);
                                            } else {
                                                i2 = 17301543;
                                            }
                                            C1102je jeVar = new C1102je(a4.f72355b);
                                            jeVar.mo13630b(i2);
                                            blda = a2.f125980e;
                                            if (blda != null) {
                                                blda = blda.f126015t;
                                            }
                                            jeVar.mo13640e(blda.f126020d);
                                            blda2 = a2.f125980e;
                                            if (blda2 != null) {
                                                blda2 = blda.f126015t;
                                            }
                                            jeVar.mo13639d(blda2.f126020d);
                                            blda3 = a2.f125980e;
                                            if (blda3 != null) {
                                                blda3 = blda.f126015t;
                                            }
                                            jeVar.mo13632b(blda3.f126021e);
                                            blda4 = a2.f125980e;
                                            if (blda4 != null) {
                                                blda4 = blda.f126015t;
                                            }
                                            jeVar.mo13633b(blda4.f126027k);
                                            jeVar.f22258j = i;
                                            j = a2.f125983h;
                                            if (j > 0) {
                                                jeVar.mo13619a(j / 1000);
                                            }
                                            if (TextUtils.isEmpty(str)) {
                                                jeVar.mo13636c(str);
                                            }
                                            blda5 = a2.f125980e;
                                            if (blda5 != null) {
                                                blda5 = blda.f126015t;
                                            }
                                            if (blda5.f126028l) {
                                                i3 = 4;
                                            } else {
                                                i3 = 6;
                                            }
                                            blda6 = a2.f125980e;
                                            if (blda6 != null) {
                                                blda6 = blda.f126015t;
                                            }
                                            if (!blda6.f126029m) {
                                                i3 |= 1;
                                            }
                                            jeVar.mo13616a(i3);
                                            blda7 = a2.f125980e;
                                            if (blda7 != null) {
                                                blda7 = blda.f126015t;
                                            }
                                            if ((blda7.f126017a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) == 0) {
                                                blda blda19 = a2.f125980e;
                                                if (blda19 == null) {
                                                    blda19 = blda.f126015t;
                                                }
                                                z = blda19.f126032p;
                                            } else {
                                                z = true;
                                            }
                                            jeVar.f22268t = z;
                                            bldb = a2.f125981f;
                                            if (bldb != null) {
                                                bldb = bldb.f126036d;
                                            }
                                            if (akoc.m60120a(bldb)) {
                                                bldb bldb2 = a2.f125981f;
                                                if (bldb2 == null) {
                                                    bldb2 = bldb.f126036d;
                                                }
                                                if (!akoc.m60123b(bldb2)) {
                                                    pendingIntent = null;
                                                    if (a6 != null) {
                                                        jeVar.mo13621a(a6);
                                                    }
                                                    blda8 = a2.f125980e;
                                                    if (blda8 == null) {
                                                        blda8 = blda.f126015t;
                                                    }
                                                    if (!blda8.f126022f.isEmpty()) {
                                                        C1101jd jdVar = new C1101jd();
                                                        blda blda20 = a2.f125980e;
                                                        if (blda20 == null) {
                                                            blda20 = blda.f126015t;
                                                        }
                                                        jdVar.mo13593a(blda20.f126022f);
                                                        blda blda21 = a2.f125980e;
                                                        if (blda21 == null) {
                                                            blda21 = blda.f126015t;
                                                        }
                                                        if (!blda21.f126023g.isEmpty()) {
                                                            blda blda22 = a2.f125980e;
                                                            if (blda22 == null) {
                                                                blda22 = blda.f126015t;
                                                            }
                                                            jdVar.mo13594b(blda22.f126023g);
                                                        } else {
                                                            blda blda23 = a2.f125980e;
                                                            if (blda23 == null) {
                                                                blda23 = blda.f126015t;
                                                            }
                                                            jdVar.mo13594b(blda23.f126020d);
                                                        }
                                                        jeVar.mo13626a(jdVar);
                                                    }
                                                    blda9 = a2.f125980e;
                                                    if (blda9 == null) {
                                                        blda9 = blda.f126015t;
                                                    }
                                                    for (blcz blcz : blda9.f126034r) {
                                                        if (blcz.f126010b.isEmpty()) {
                                                            bnsl bnsl = (bnsl) akoj.f72353a.mo68387b();
                                                            blco blco2 = a2.f125978c;
                                                            if (blco2 == null) {
                                                                blco2 = blco.f125949g;
                                                            }
                                                            bnsl.mo68420a("Ignoring Secondary Action with no text with id: %s", blco2);
                                                        } else {
                                                            int nextInt = a4.f72356c.nextInt();
                                                            int i6 = blcz.f126009a;
                                                            if ((i6 & 2) != 0) {
                                                                pendingIntent2 = PendingIntent.getActivity(a4.f72355b, nextInt, akny.m60111a(a4.f72355b, a2, str, blcz), 134217728);
                                                            } else {
                                                                Context context = a4.f72355b;
                                                                if ((i6 & 32) == 0 || (i4 = blch.m107015a(blcz.f126014f)) == 0) {
                                                                    i4 = 1;
                                                                }
                                                                pendingIntent2 = PendingIntent.getBroadcast(a4.f72355b, nextInt, akny.m60110a(context, intent2, i4, Boolean.valueOf(blcz.f126013e), blcz.f126012d), 134217728);
                                                            }
                                                            jeVar.mo13624a(new C1099jb(0, blcz.f126010b, pendingIntent2));
                                                        }
                                                    }
                                                    blda10 = a2.f125980e;
                                                    if (blda10 == null) {
                                                        blda10 = blda.f126015t;
                                                    }
                                                    if (!blda10.f126024h.isEmpty()) {
                                                        if (pendingIntent != null) {
                                                            blda blda24 = a2.f125980e;
                                                            if (blda24 == null) {
                                                                blda24 = blda.f126015t;
                                                            }
                                                            jeVar.mo13624a(new C1099jb(0, blda24.f126024h, pendingIntent));
                                                        }
                                                    }
                                                    blda11 = a2.f125980e;
                                                    if (blda11 == null) {
                                                        blda11 = blda.f126015t;
                                                    }
                                                    if (!blda11.f126030n) {
                                                        blda blda25 = a2.f125980e;
                                                        if (blda25 == null) {
                                                            blda25 = blda.f126015t;
                                                        }
                                                        blcv blcv = blda25.f126031o;
                                                        if (blcv == null) {
                                                            blcv = blcv.f125988c;
                                                        }
                                                        C1102je jeVar2 = new C1102je(a4.f72355b);
                                                        jeVar2.mo13630b(qkj.m32287a(a4.f72355b, C0126R.C0127drawable.ic_google_g_icon));
                                                        if (blcv != null) {
                                                            if (!blcv.f125990a.isEmpty()) {
                                                                jeVar2.mo13640e(blcv.f125990a);
                                                                if (blcv == null && !blcv.f125991b.isEmpty()) {
                                                                    jeVar2.mo13632b(blcv.f125991b);
                                                                    if (!TextUtils.isEmpty(str)) {
                                                                        jeVar2.mo13636c(str);
                                                                    }
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    jeVar2.mo13632b(str);
                                                                }
                                                                jeVar.f22273y = jeVar2.mo13629b();
                                                            }
                                                        }
                                                        jeVar2.mo13640e(a4.f72355b.getString(C0126R.string.guns_lock_screen_content_title));
                                                        if (blcv == null) {
                                                        }
                                                        if (!TextUtils.isEmpty(str)) {
                                                        }
                                                        jeVar.f22273y = jeVar2.mo13629b();
                                                    } else {
                                                        jeVar.f22272x = 1;
                                                    }
                                                    int i7 = Build.VERSION.SDK_INT;
                                                    blda12 = a2.f125980e;
                                                    if (blda12 == null) {
                                                        blda12 = blda.f126015t;
                                                    }
                                                    blcl = blda12.f126035s;
                                                    if (blcl == null) {
                                                        blcl = blcl.f125932h;
                                                    }
                                                    if (!blcl.f125935b.isEmpty()) {
                                                        Context context2 = a4.f72355b;
                                                        blda blda26 = a2.f125980e;
                                                        if (blda26 == null) {
                                                            blda26 = blda.f126015t;
                                                        }
                                                        blcl blcl2 = blda26.f126035s;
                                                        if (blcl2 == null) {
                                                            blcl2 = blcl.f125932h;
                                                        }
                                                        akof.m60127a(context2, blcl2);
                                                        blda blda27 = a2.f125980e;
                                                        if (blda27 == null) {
                                                            blda27 = blda.f126015t;
                                                        }
                                                        blcl blcl3 = blda27.f126035s;
                                                        if (blcl3 == null) {
                                                            blcl3 = blcl.f125932h;
                                                        }
                                                        jeVar.f22244B = blcl3.f125935b;
                                                    }
                                                    notification = jeVar.mo13629b();
                                                }
                                            }
                                            PendingIntent activity = PendingIntent.getActivity(a4.f72355b, a4.f72356c.nextInt(), akny.m60111a(a4.f72355b, a2, str, null), 134217728);
                                            jeVar.f22254f = activity;
                                            jeVar.mo13631b(PendingIntent.getBroadcast(a4.f72355b, a4.f72356c.nextInt(), akny.m60110a(a4.f72355b, intent2, 6, true, null), 134217728));
                                            pendingIntent = activity;
                                            if (a6 != null) {
                                            }
                                            blda8 = a2.f125980e;
                                            if (blda8 == null) {
                                            }
                                            if (!blda8.f126022f.isEmpty()) {
                                            }
                                            blda9 = a2.f125980e;
                                            if (blda9 == null) {
                                            }
                                            while (r7.hasNext()) {
                                            }
                                            blda10 = a2.f125980e;
                                            if (blda10 == null) {
                                            }
                                            if (!blda10.f126024h.isEmpty()) {
                                            }
                                            blda11 = a2.f125980e;
                                            if (blda11 == null) {
                                            }
                                            if (!blda11.f126030n) {
                                            }
                                            int i72 = Build.VERSION.SDK_INT;
                                            blda12 = a2.f125980e;
                                            if (blda12 == null) {
                                            }
                                            blcl = blda12.f126035s;
                                            if (blcl == null) {
                                            }
                                            if (!blcl.f125935b.isEmpty()) {
                                            }
                                            notification = jeVar.mo13629b();
                                        }
                                    }
                                }
                                i = 0;
                                a = akoc.m60115a(a2);
                                if (a == -1) {
                                }
                                C1102je jeVar3 = new C1102je(a4.f72355b);
                                jeVar3.mo13630b(i2);
                                blda = a2.f125980e;
                                if (blda != null) {
                                }
                                jeVar3.mo13640e(blda.f126020d);
                                blda2 = a2.f125980e;
                                if (blda2 != null) {
                                }
                                jeVar3.mo13639d(blda2.f126020d);
                                blda3 = a2.f125980e;
                                if (blda3 != null) {
                                }
                                jeVar3.mo13632b(blda3.f126021e);
                                blda4 = a2.f125980e;
                                if (blda4 != null) {
                                }
                                jeVar3.mo13633b(blda4.f126027k);
                                jeVar3.f22258j = i;
                                j = a2.f125983h;
                                if (j > 0) {
                                }
                                if (TextUtils.isEmpty(str)) {
                                }
                                blda5 = a2.f125980e;
                                if (blda5 != null) {
                                }
                                if (blda5.f126028l) {
                                }
                                blda6 = a2.f125980e;
                                if (blda6 != null) {
                                }
                                if (!blda6.f126029m) {
                                }
                                jeVar3.mo13616a(i3);
                                blda7 = a2.f125980e;
                                if (blda7 != null) {
                                }
                                if ((blda7.f126017a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) == 0) {
                                }
                                jeVar3.f22268t = z;
                                bldb = a2.f125981f;
                                if (bldb != null) {
                                }
                                if (akoc.m60120a(bldb)) {
                                }
                                PendingIntent activity2 = PendingIntent.getActivity(a4.f72355b, a4.f72356c.nextInt(), akny.m60111a(a4.f72355b, a2, str, null), 134217728);
                                jeVar3.f22254f = activity2;
                                jeVar3.mo13631b(PendingIntent.getBroadcast(a4.f72355b, a4.f72356c.nextInt(), akny.m60110a(a4.f72355b, intent2, 6, true, null), 134217728));
                                pendingIntent = activity2;
                                if (a6 != null) {
                                }
                                blda8 = a2.f125980e;
                                if (blda8 == null) {
                                }
                                if (!blda8.f126022f.isEmpty()) {
                                }
                                blda9 = a2.f125980e;
                                if (blda9 == null) {
                                }
                                while (r7.hasNext()) {
                                }
                                blda10 = a2.f125980e;
                                if (blda10 == null) {
                                }
                                if (!blda10.f126024h.isEmpty()) {
                                }
                                blda11 = a2.f125980e;
                                if (blda11 == null) {
                                }
                                if (!blda11.f126030n) {
                                }
                                int i722 = Build.VERSION.SDK_INT;
                                blda12 = a2.f125980e;
                                if (blda12 == null) {
                                }
                                blcl = blda12.f126035s;
                                if (blcl == null) {
                                }
                                if (!blcl.f125935b.isEmpty()) {
                                }
                                notification = jeVar3.mo13629b();
                            } else {
                                notification = null;
                            }
                            if (notification != null) {
                                sex.m35104a(this).mo25445a(m67668a(a2), 1000, notification);
                                if (!cfqb.m142534b()) {
                                    akog.m60130a(this, m67668a(a2), a2);
                                }
                                if (l != null) {
                                    new skc(this).mo25675a("notifications_expiration", 1, System.currentTimeMillis() + TimeUnit.MICROSECONDS.toMillis(l.longValue()), PendingIntent.getBroadcast(this, m67668a(a2).hashCode(), akny.m60110a(this, intent2, 6, true, null), 134217728), "com.google.android.gms.notifications");
                                }
                                mo44700a(a2, str, 5, null);
                            }
                        } else if ((a2.f125976a & 8) == 0 && intent2.getBooleanExtra("GunsService.refetch", true)) {
                            mo44699a(intent2, a2, str);
                        }
                    }
                }
            } else if (!cfqb.m142534b()) {
                for (blcs blcs : akog.m60128a(this)) {
                    if ((blcs.f125976a & 8) != 0) {
                        bxvd a7 = blcs.f125974l.mo74141a(blcs);
                        blda blda28 = blcs.f125980e;
                        if (blda28 == null) {
                            blda28 = blda.f126015t;
                        }
                        bxvd a8 = blda.f126015t.mo74141a(blda28);
                        if (a8.f164950c) {
                            a8.mo74035c();
                            a8.f164950c = false;
                        }
                        blda blda29 = (blda) a8.f164949b;
                        int i8 = blda29.f126017a | 1024;
                        blda29.f126017a = i8;
                        blda29.f126028l = false;
                        blda29.f126017a = i8 | 2048;
                        blda29.f126029m = false;
                        if (a7.f164950c) {
                            a7.mo74035c();
                            a7.f164950c = false;
                        }
                        blcs blcs2 = (blcs) a7.f164949b;
                        blda blda30 = (blda) a8.mo74062i();
                        blda30.getClass();
                        blcs2.f125980e = blda30;
                        blcs2.f125976a |= 8;
                        blcs = (blcs) a7.mo74062i();
                    }
                    Intent intent3 = new Intent();
                    intent3.putExtra("GunsService.refetch", false);
                    intent3.putExtra("GunsService.intentCallback", false);
                    m67669a(intent3, blcs);
                }
            }
        } catch (gid | IOException e) {
            bnsl bnsl2 = (bnsl) f81215a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68420a("Failed to get account ID for OID: %s.", str3);
            str = null;
        } catch (Throwable th) {
            aseo.m73884b(this, intent);
            throw th;
        }
        aseo.m73884b(this, intent);
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
    /* renamed from: a */
    private final void m67669a(Intent intent, blcs blcs) {
        Context applicationContext = getApplicationContext();
        Intent className = new Intent().setClassName(applicationContext, "com.google.android.gms.notifications.GcmBroadcastReceiver");
        className.setAction("com.google.android.gms.notifications.intents.SHOW_NOTIFICATION");
        className.putExtras(intent);
        className.putExtra("GunsService.refetch", false);
        className.putExtra("gms.gnots.payload", akoc.m60118a((bxxc) blcs));
        applicationContext.sendOrderedBroadcast(className, null);
    }

    /* renamed from: a */
    public final void mo44699a(Intent intent, blcs blcs, String str) {
        blfq blfq;
        int i;
        Intent intent2 = intent;
        blcs blcs2 = blcs;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!akoc.m60124c(blcs)) {
            return;
        }
        if (akoc.m60122b(blcs)) {
            Context applicationContext = getApplicationContext();
            blcw blcw = blcs2.f125977b;
            if (blcw == null) {
                blcw = blcw.f125993b;
            }
            String str2 = blcw.f125995a;
            blco blco = blcs2.f125978c;
            if (blco == null) {
                blco = blco.f125949g;
            }
            aknv aknv = new aknv(applicationContext, str, str2, blco);
            try {
                aknz aknz = aknv.f72326f;
                Context context = aknv.f72322b;
                String str3 = aknv.f72323c;
                String str4 = aknv.f72324d;
                blco blco2 = aknv.f72325e;
                bxvd da = blfm.f126388d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                blfm blfm = (blfm) da.f164949b;
                blco2.getClass();
                if (!blfm.f126391b.mo73666a()) {
                    blfm.f126391b = bxvk.m124021a(blfm.f126391b);
                }
                blfm.f126391b.add(blco2);
                bxvd da2 = blcy.f125998h.mo74144da();
                String a = aknl.m60090a(aknv.f72322b);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                blcy blcy = (blcy) da2.f164949b;
                a.getClass();
                blcy.f126000a |= 2;
                blcy.f126002c = a;
                DisplayMetrics displayMetrics = aknv.f72322b.getResources().getDisplayMetrics();
                if (displayMetrics.densityDpi < 480) {
                    i = displayMetrics.densityDpi < 320 ? displayMetrics.densityDpi < 240 ? displayMetrics.densityDpi < 213 ? displayMetrics.densityDpi >= 160 ? 2 : 1 : 5 : 3 : 4;
                } else {
                    i = 6;
                }
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                blcy blcy2 = (blcy) da2.f164949b;
                blcy2.f126001b = i - 1;
                blcy2.f126000a |= 1;
                int i2 = Build.VERSION.SDK_INT;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                blcy blcy3 = (blcy) da2.f164949b;
                blcy3.f126000a |= 4;
                blcy3.f126003d = i2;
                float f = aknv.f72322b.getResources().getDisplayMetrics().density;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                blcy blcy4 = (blcy) da2.f164949b;
                blcy4.f126000a |= 8;
                blcy4.f126004e = f;
                String id = TimeZone.getDefault().getID();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                blcy blcy5 = (blcy) da2.f164949b;
                id.getClass();
                blcy5.f126000a |= 16;
                blcy5.f126005f = id;
                int i3 = Build.VERSION.SDK_INT;
                ArrayList a2 = akof.m60126a(aknv.f72322b);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                blcy blcy6 = (blcy) da2.f164949b;
                if (!blcy6.f126006g.mo73666a()) {
                    blcy6.f126006g = bxvk.m124021a(blcy6.f126006g);
                }
                bxsy.m123078a(a2, blcy6.f126006g);
                blcy blcy7 = (blcy) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                blfm blfm2 = (blfm) da.f164949b;
                blcy7.getClass();
                blfm2.f126392c = blcy7;
                blfm2.f126390a |= 1;
                blfm blfm3 = (blfm) da.mo74062i();
                ClientContext a3 = aknz.m60112a(context, str3);
                bxvd da3 = blfi.f126366d.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                blfi blfi = (blfi) da3.f164949b;
                blfm3.getClass();
                blfi.f126370c = blfm3;
                blfi.f126368a |= 2;
                blfh a4 = akoh.m60131a(context, str4, byug.m125352a((int) cfqb.m142536d()));
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                blfi blfi2 = (blfi) da3.f164949b;
                a4.getClass();
                blfi2.f126369b = a4;
                blfi2.f126368a |= 1;
                blfq = ((blfj) aknz.f72334a.mo25513a(a3, 1, aknz.m60113a("/gmsgnotsfetchbyidentifier?alt=proto", cfqe.f185447a.mo6606a().mo82521h()), ((blfi) da3.mo74062i()).mo73642k(), blfj.f126372b)).f126374a;
                if (blfq == null) {
                    blfq = blfq.f126402c;
                }
            } catch (VolleyError | gid e) {
                bnsl bnsl = (bnsl) aknv.f72321a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Failed to fetch notification by identifier.");
                blfq = blfq.f126402c;
            }
            long j = blfq.f126405b;
            if (j > 0) {
                intent2.putExtra("GunsService.serverTimeUsec", j);
            }
            if (blfq.f126404a.size() > 0) {
                bxwc bxwc = blfq.f126404a;
                int size = bxwc.size();
                for (int i4 = 0; i4 < size; i4++) {
                    m67669a(intent2, (blcs) bxwc.get(i4));
                }
                return;
            }
            m67669a(intent, blcs);
        }
    }

    /* renamed from: a */
    public final void mo44700a(blcs blcs, String str, int i, String str2) {
        blco blco;
        if (!TextUtils.isEmpty(str) && akoc.m60124c(blcs)) {
            Context applicationContext = getApplicationContext();
            blcw blcw = blcs.f125977b;
            if (blcw == null) {
                blcw = blcw.f125993b;
            }
            String str3 = blcw.f125995a;
            blco blco2 = blcs.f125978c;
            if (blco2 == null) {
                blco = blco.f125949g;
            } else {
                blco = blco2;
            }
            akod akod = new akod(applicationContext, str, str3, blco, i, str2);
            try {
                blco blco3 = akod.f72347e;
                int i2 = akod.f72350h;
                String str4 = akod.f72348f;
                bxvd da = blfn.f126393e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                blfn blfn = (blfn) da.f164949b;
                blco3.getClass();
                blfn.f126396b = blco3;
                int i3 = blfn.f126395a | 1;
                blfn.f126395a = i3;
                blfn.f126397c = i2 - 1;
                int i4 = i3 | 4;
                blfn.f126395a = i4;
                if (str4 != null) {
                    str4.getClass();
                    blfn.f126395a = i4 | 8;
                    blfn.f126398d = str4;
                }
                blfo blfo = (blfo) blfp.f126399b.mo74144da();
                blfo.mo66477a(da);
                akod.f72349g.mo39595a(akod.f72344b, akod.f72345c, akod.f72346d, (blfp) blfo.mo74062i());
            } catch (VolleyError | gid e) {
                bnsl bnsl = (bnsl) akod.f72343a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Failed to update the notification(s) read state.");
            }
        }
    }
}
