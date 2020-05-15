package com.google.android.gms.checkin;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.SystemClock;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.checkin.eventlog.EventLogChimeraService;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CheckinIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f29950a = qgn.m32143a("CheckinIntentOperation");

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
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0318, code lost:
        if (p000.cdci.m132536b() != false) goto L_0x031a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x056a A[SYNTHETIC, Splitter:B:203:0x056a] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x057e A[SYNTHETIC, Splitter:B:208:0x057e] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x058e A[Catch:{ all -> 0x0a1b }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x058f A[Catch:{ all -> 0x0a1b }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x05cd A[Catch:{ all -> 0x0a1b }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x05ce A[Catch:{ all -> 0x0a1b }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x05dc  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x05fb A[SYNTHETIC, Splitter:B:228:0x05fb] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0608 A[Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0447, all -> 0x04b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x066f A[SYNTHETIC, Splitter:B:243:0x066f] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0675 A[SYNTHETIC, Splitter:B:245:0x0675] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0686 A[SYNTHETIC, Splitter:B:249:0x0686] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0691 A[SYNTHETIC, Splitter:B:251:0x0691] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x06e2 A[Catch:{ all -> 0x0a08 }] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x06ec A[Catch:{ all -> 0x0a08 }] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x06fc A[SYNTHETIC, Splitter:B:270:0x06fc] */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x07dc A[Catch:{ all -> 0x07d7, all -> 0x084d }] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x07e2 A[Catch:{ all -> 0x07d7, all -> 0x084d }] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x085f  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0866  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x0891 A[SYNTHETIC, Splitter:B:336:0x0891] */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x08f7  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x093c  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x096c  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x09d0  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x09e8  */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x0ad1  */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x0afd  */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0b5f  */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x0b77  */
    public final void onHandleIntent(Intent intent) {
        long elapsedRealtime;
        long elapsedRealtime2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Bundle bundle;
        Throwable th;
        String str6;
        String str7;
        qda qda;
        int i;
        qda qda2;
        Throwable th2;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        Bundle bundle2;
        qda qda3;
        Throwable th3;
        String str16;
        String str17;
        long j;
        String str18;
        String str19;
        String str20;
        String str21;
        int i2;
        String str22;
        qfp qfp;
        qds a;
        SharedPreferences l;
        int i3;
        int i4;
        int i5;
        qdu a2;
        qhj qhj;
        int i6;
        boolean z;
        qcy qcy;
        qdd qdd;
        qda a3;
        qgv qgv;
        int i7;
        qgu qgu;
        String str23;
        String str24;
        int i8;
        String str25;
        List list;
        String str26;
        Throwable th4;
        String str27 = "CheckinTask:duration";
        String str28 = "CheckinTask finished at: %d.";
        String str29 = "CheckinService_versionInfo";
        String str30 = "CheckinService_networkRequest";
        String str31 = "Default Task";
        String str32 = "checkin_task_tag";
        f29950a.mo25412b("onHandleIntent, %s", intent);
        Bundle bundleExtra = intent.getBundleExtra("config_flags_bundle");
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        qez qez = new qez(this, bundleExtra);
        if (svu.m36488a(qez.f41100b.getApplicationContext())) {
            int i9 = Build.VERSION.SDK_INT;
            qez.f41107i.mo24032a(qez.f41102d);
            qez.f41107i.mo24036b(3);
            qez.f41107i.mo24041g();
            qez.f41107i.mo24037c();
            if (!qez.f41108j.mo66813a()) {
                qez.f41108j = bmxv.m108566b(new asfb(qez.f41100b, 1, "Checkin Service", null, "com.google.android.gms"));
            }
            ((asfb) qez.f41108j.mo66814b()).mo49115a(false);
            ((asfb) qez.f41108j.mo66814b()).mo49111a(cdci.m132549o());
            qez.f41104f.f41117c.set(true);
            elapsedRealtime = SystemClock.elapsedRealtime();
            qda qda4 = qda.f40958a;
            String str33 = "unspecified";
            Bundle bundle3 = qez.f41102d;
            elapsedRealtime2 = SystemClock.elapsedRealtime();
            String str34 = "CheckinService_lastSim";
            String str35 = "CheckinService_onStart_checkinReason";
            String str36 = "CheckinService_forceCheckin";
            qez.f41099a.mo25412b("CheckinTask started at: %d.", Long.valueOf(elapsedRealtime2));
            try {
                qfe qfe = qez.f41104f;
                Bundle bundle4 = bundle3;
                try {
                    bundle = bundle4;
                    str15 = "Checkin rescheduled after failure at";
                    try {
                        if (qfe.mo24011b(SystemClock.elapsedRealtime(), qfe.mo24008a(bundle)) > 0) {
                            try {
                                qez.f41099a.mo25412b("Unable to run checkin now.", new Object[0]);
                                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                                String str37 = "checkin_retry_count";
                                qez.f41099a.mo25412b(str28, Long.valueOf(elapsedRealtime3));
                                qdg.m31918a(str27, Long.valueOf(elapsedRealtime3 - elapsedRealtime2));
                                qez.f41104f.mo24010a(elapsedRealtime, qda4);
                                if (bundle.getBoolean("CheckinService_onStart_showNotification", false)) {
                                    qez.f41099a.mo25412b("Show checkin complete notification.", new Object[0]);
                                    qez.mo23999a(qda4.f40962e);
                                }
                                qez.f41099a.mo25414c("Checkin Operation finished with result: %d finish time: %d.", Integer.valueOf(qda4.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                                int i10 = qda4.f40962e;
                                if (i10 == 0) {
                                    qez.f41105g.mo23995a(elapsedRealtime);
                                } else if (i10 == 1 || i10 == 2) {
                                    qez.f41105g.mo23997b(elapsedRealtime);
                                    if (!bmyx.m108640a(',').mo66925c((CharSequence) cdci.m132547m()).contains(String.valueOf(qda4.f40963f))) {
                                        bundle.putInt(str37, bundle.getInt(str37, 0) + 1);
                                        qez.f41099a.mo25412b(str15, new Object[0]);
                                        qez.f41104f.mo24009a(SystemClock.elapsedRealtime(), bundle);
                                        qez.f41107i.mo24031a(qez.m32046a());
                                    }
                                } else {
                                    qez.f41104f.mo24009a(SystemClock.elapsedRealtime(), bundle);
                                    qez.f41107i.mo24031a(qez.m32046a());
                                    qez.f41105g.mo23998c(elapsedRealtime);
                                }
                                qez.f41107i.mo24030a(qda4.f40962e);
                                qgj h = qez.f41107i.mo24042h();
                                if (cdcc.m132526b()) {
                                    qez.f41106h.mo24044a(h);
                                }
                                if (!qez.f41108j.mo66813a() || !((asfb) qez.f41108j.mo66814b()).mo49124e()) {
                                    return;
                                }
                            } catch (Throwable th5) {
                                qda2 = qda4;
                                str11 = "Show checkin complete notification.";
                                str13 = "Checkin Operation finished with result: %d finish time: %d.";
                                str8 = str27;
                                str12 = str28;
                                str9 = str15;
                                th2 = th5;
                                str10 = "checkin_retry_count";
                                str14 = "CheckinService_onStart_showNotification";
                                th = th2;
                                qda = qda2;
                                long elapsedRealtime4 = SystemClock.elapsedRealtime();
                                Throwable th6 = th;
                                String str38 = str2;
                                qez.f41099a.mo25412b(str5, Long.valueOf(elapsedRealtime4));
                                qdg.m31918a(str, Long.valueOf(elapsedRealtime4 - elapsedRealtime2));
                                qez.f41104f.mo24010a(elapsedRealtime, qda);
                                if (bundle.getBoolean(str7, false)) {
                                }
                                qez.f41099a.mo25414c(str6, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                                i = qda.f40962e;
                                if (i != 0) {
                                }
                                qez.f41107i.mo24030a(qda.f40962e);
                                qgj h2 = qez.f41107i.mo24042h();
                                if (cdcc.m132526b()) {
                                }
                                ((asfb) qez.f41108j.mo66814b()).mo49120c();
                                qez.f41108j = bmvz.f131120a;
                                throw th6;
                            }
                        } else {
                            String str39 = str15;
                            try {
                                qfe qfe2 = qez.f41104f;
                                bmxv b = qfe2.f41118d.mo24018b();
                                qfz.m32111a(qfe2.f41116b).mo24024a();
                                if (b.mo66813a()) {
                                    try {
                                        Bundle a4 = qfe2.mo24008a(bundle);
                                        qfe2.f41118d.mo24016a();
                                        bundle2 = a4;
                                    } catch (Throwable th7) {
                                        qda2 = qda4;
                                        str11 = "Show checkin complete notification.";
                                        str8 = str27;
                                        str12 = str28;
                                        th2 = th7;
                                        str10 = "checkin_retry_count";
                                        str14 = "CheckinService_onStart_showNotification";
                                        str9 = str39;
                                        str13 = "Checkin Operation finished with result: %d finish time: %d.";
                                        th = th2;
                                        qda = qda2;
                                        long elapsedRealtime42 = SystemClock.elapsedRealtime();
                                        Throwable th62 = th;
                                        String str382 = str2;
                                        qez.f41099a.mo25412b(str5, Long.valueOf(elapsedRealtime42));
                                        qdg.m31918a(str, Long.valueOf(elapsedRealtime42 - elapsedRealtime2));
                                        qez.f41104f.mo24010a(elapsedRealtime, qda);
                                        if (bundle.getBoolean(str7, false)) {
                                        }
                                        qez.f41099a.mo25414c(str6, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                                        i = qda.f40962e;
                                        if (i != 0) {
                                        }
                                        qez.f41107i.mo24030a(qda.f40962e);
                                        qgj h22 = qez.f41107i.mo24042h();
                                        if (cdcc.m132526b()) {
                                        }
                                        ((asfb) qez.f41108j.mo66814b()).mo49120c();
                                        qez.f41108j = bmvz.f131120a;
                                        throw th62;
                                    }
                                } else {
                                    bundle2 = bundle;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                qda2 = qda4;
                                str11 = "Show checkin complete notification.";
                                str8 = str27;
                                str12 = str28;
                                str10 = "checkin_retry_count";
                                str14 = "CheckinService_onStart_showNotification";
                                str9 = str39;
                                str13 = "Checkin Operation finished with result: %d finish time: %d.";
                                th2 = th;
                                th = th2;
                                qda = qda2;
                                long elapsedRealtime422 = SystemClock.elapsedRealtime();
                                Throwable th622 = th;
                                String str3822 = str2;
                                qez.f41099a.mo25412b(str5, Long.valueOf(elapsedRealtime422));
                                qdg.m31918a(str, Long.valueOf(elapsedRealtime422 - elapsedRealtime2));
                                qez.f41104f.mo24010a(elapsedRealtime, qda);
                                if (bundle.getBoolean(str7, false)) {
                                }
                                qez.f41099a.mo25414c(str6, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                                i = qda.f40962e;
                                if (i != 0) {
                                }
                                qez.f41107i.mo24030a(qda.f40962e);
                                qgj h222 = qez.f41107i.mo24042h();
                                if (cdcc.m132526b()) {
                                }
                                ((asfb) qez.f41108j.mo66814b()).mo49120c();
                                qez.f41108j = bmvz.f131120a;
                                throw th622;
                            }
                            try {
                                if (cdci.f180455a.mo6606a().mo77257t()) {
                                    try {
                                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) qez.f41100b.getSystemService("connectivity")).getActiveNetworkInfo();
                                        if (activeNetworkInfo != null) {
                                            sek sek = qez.f41099a;
                                            boolean isConnected = activeNetworkInfo.isConnected();
                                            qda3 = qda4;
                                            try {
                                                str15 = str39;
                                                StringBuilder sb = new StringBuilder(46);
                                                sb.append("checked scheduled: connected/background: ");
                                                sb.append(isConnected);
                                                sek.mo25409a(sb.toString(), new Object[0]);
                                            } catch (Throwable th9) {
                                                th3 = th9;
                                                str4 = "Show checkin complete notification.";
                                                str6 = "Checkin Operation finished with result: %d finish time: %d.";
                                                str = str27;
                                                str5 = str28;
                                                str2 = str15;
                                                str3 = "checkin_retry_count";
                                                str7 = "CheckinService_onStart_showNotification";
                                                bundle = bundle2;
                                                th = th3;
                                                qda = qda3;
                                                long elapsedRealtime4222 = SystemClock.elapsedRealtime();
                                                Throwable th6222 = th;
                                                String str38222 = str2;
                                                qez.f41099a.mo25412b(str5, Long.valueOf(elapsedRealtime4222));
                                                qdg.m31918a(str, Long.valueOf(elapsedRealtime4222 - elapsedRealtime2));
                                                qez.f41104f.mo24010a(elapsedRealtime, qda);
                                                if (bundle.getBoolean(str7, false)) {
                                                }
                                                qez.f41099a.mo25414c(str6, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                                                i = qda.f40962e;
                                                if (i != 0) {
                                                }
                                                qez.f41107i.mo24030a(qda.f40962e);
                                                qgj h2222 = qez.f41107i.mo24042h();
                                                if (cdcc.m132526b()) {
                                                }
                                                ((asfb) qez.f41108j.mo66814b()).mo49120c();
                                                qez.f41108j = bmvz.f131120a;
                                                throw th6222;
                                            }
                                        } else {
                                            qda3 = qda4;
                                            str15 = str39;
                                            qez.f41099a.mo25409a("checkin scheduled: no active network", new Object[0]);
                                        }
                                        if (activeNetworkInfo != null) {
                                            if (activeNetworkInfo.isConnected()) {
                                            }
                                        }
                                        qda = new qda();
                                        try {
                                            qez.f41099a.mo25416d("Checkin will retry later, network is not available", new Object[0]);
                                            str21 = "checkin_retry_count";
                                            j = elapsedRealtime;
                                            str19 = "Show checkin complete notification.";
                                            str20 = "Checkin Operation finished with result: %d finish time: %d.";
                                            str18 = "CheckinService_onStart_showNotification";
                                            str16 = str27;
                                            str17 = str28;
                                            long elapsedRealtime5 = SystemClock.elapsedRealtime();
                                            qez.f41099a.mo25412b(str17, Long.valueOf(elapsedRealtime5));
                                            qdg.m31918a(str16, Long.valueOf(elapsedRealtime5 - elapsedRealtime2));
                                            long j2 = j;
                                            qez.f41104f.mo24010a(j2, qda);
                                            if (bundle2.getBoolean(str18, false)) {
                                                qez.f41099a.mo25412b(str19, new Object[0]);
                                                qez.mo23999a(qda.f40962e);
                                            }
                                            qez.f41099a.mo25414c(str20, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                                            i2 = qda.f40962e;
                                            if (i2 == 0) {
                                                qez.f41105g.mo23995a(j2);
                                            } else if (i2 == 1 || i2 == 2) {
                                                qez.f41105g.mo23997b(j2);
                                                if (!bmyx.m108640a(',').mo66925c((CharSequence) cdci.m132547m()).contains(String.valueOf(qda.f40963f))) {
                                                    bundle2.putInt(str21, bundle2.getInt(str21, 0) + 1);
                                                    qez.f41099a.mo25412b(str15, new Object[0]);
                                                    qez.f41104f.mo24009a(SystemClock.elapsedRealtime(), bundle2);
                                                    qez.f41107i.mo24031a(qez.m32046a());
                                                }
                                            } else {
                                                qez.f41104f.mo24009a(SystemClock.elapsedRealtime(), bundle2);
                                                qez.f41107i.mo24031a(qez.m32046a());
                                                qez.f41105g.mo23998c(j2);
                                            }
                                            qez.f41107i.mo24030a(qda.f40962e);
                                            qgj h3 = qez.f41107i.mo24042h();
                                            if (cdcc.m132526b()) {
                                                qez.f41106h.mo24044a(h3);
                                            }
                                            if (!qez.f41108j.mo66813a() || !((asfb) qez.f41108j.mo66814b()).mo49124e()) {
                                                return;
                                            }
                                        } catch (Throwable th10) {
                                            bundle = bundle2;
                                            str4 = "Show checkin complete notification.";
                                            str = str27;
                                            str5 = str28;
                                            str3 = "checkin_retry_count";
                                            th = th10;
                                            str6 = "Checkin Operation finished with result: %d finish time: %d.";
                                            str7 = "CheckinService_onStart_showNotification";
                                            str2 = str15;
                                            long elapsedRealtime42222 = SystemClock.elapsedRealtime();
                                            Throwable th62222 = th;
                                            String str382222 = str2;
                                            qez.f41099a.mo25412b(str5, Long.valueOf(elapsedRealtime42222));
                                            qdg.m31918a(str, Long.valueOf(elapsedRealtime42222 - elapsedRealtime2));
                                            qez.f41104f.mo24010a(elapsedRealtime, qda);
                                            if (bundle.getBoolean(str7, false)) {
                                            }
                                            qez.f41099a.mo25414c(str6, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                                            i = qda.f40962e;
                                            if (i != 0) {
                                            }
                                            qez.f41107i.mo24030a(qda.f40962e);
                                            qgj h22222 = qez.f41107i.mo24042h();
                                            if (cdcc.m132526b()) {
                                            }
                                            ((asfb) qez.f41108j.mo66814b()).mo49120c();
                                            qez.f41108j = bmvz.f131120a;
                                            throw th62222;
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        qda3 = qda4;
                                        th3 = th;
                                        str4 = "Show checkin complete notification.";
                                        str = str27;
                                        str5 = str28;
                                        str3 = "checkin_retry_count";
                                        str7 = "CheckinService_onStart_showNotification";
                                        str2 = str39;
                                        str6 = "Checkin Operation finished with result: %d finish time: %d.";
                                        bundle = bundle2;
                                        th = th3;
                                        qda = qda3;
                                        long elapsedRealtime422222 = SystemClock.elapsedRealtime();
                                        Throwable th622222 = th;
                                        String str3822222 = str2;
                                        qez.f41099a.mo25412b(str5, Long.valueOf(elapsedRealtime422222));
                                        qdg.m31918a(str, Long.valueOf(elapsedRealtime422222 - elapsedRealtime2));
                                        qez.f41104f.mo24010a(elapsedRealtime, qda);
                                        if (bundle.getBoolean(str7, false)) {
                                        }
                                        qez.f41099a.mo25414c(str6, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                                        i = qda.f40962e;
                                        if (i != 0) {
                                        }
                                        qez.f41107i.mo24030a(qda.f40962e);
                                        qgj h222222 = qez.f41107i.mo24042h();
                                        if (cdcc.m132526b()) {
                                        }
                                        ((asfb) qez.f41108j.mo66814b()).mo49120c();
                                        qez.f41108j = bmvz.f131120a;
                                        throw th622222;
                                    }
                                } else {
                                    qda3 = qda4;
                                    str15 = str39;
                                }
                                try {
                                    if (cdci.f180455a.mo6606a().mo77239b()) {
                                        qez.mo24000a("");
                                    }
                                    qez.f41107i.mo24029a();
                                    str22 = str36;
                                    if (!bundle2.getBoolean(str22, false)) {
                                    }
                                    EventLogChimeraService.m22376a(qez.f41100b, qez.f41103e);
                                    qez.f41107i.mo24035b();
                                    qfp = qez.f41101c;
                                    a = qdu.m31973a(qfp.f41124c);
                                    l = qdn.m31960l(qfp.f41124c);
                                    str20 = "Checkin Operation finished with result: %d finish time: %d.";
                                    try {
                                        i3 = bundle2.getInt("checkin_retry_count", 0);
                                        String str40 = str35;
                                        if (bundle2.containsKey(str40)) {
                                            str21 = "checkin_retry_count";
                                            try {
                                                i4 = qhi.m32172a(bundle2.getInt(str40, 0));
                                            } catch (Throwable th12) {
                                                th3 = th12;
                                                str4 = "Show checkin complete notification.";
                                                str7 = "CheckinService_onStart_showNotification";
                                                str = str27;
                                                str5 = str28;
                                                str3 = str21;
                                                str6 = str20;
                                                str2 = str15;
                                                bundle = bundle2;
                                                th = th3;
                                                qda = qda3;
                                                long elapsedRealtime4222222 = SystemClock.elapsedRealtime();
                                                Throwable th6222222 = th;
                                                String str38222222 = str2;
                                                qez.f41099a.mo25412b(str5, Long.valueOf(elapsedRealtime4222222));
                                                qdg.m31918a(str, Long.valueOf(elapsedRealtime4222222 - elapsedRealtime2));
                                                qez.f41104f.mo24010a(elapsedRealtime, qda);
                                                if (bundle.getBoolean(str7, false)) {
                                                }
                                                qez.f41099a.mo25414c(str6, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                                                i = qda.f40962e;
                                                if (i != 0) {
                                                }
                                                qez.f41107i.mo24030a(qda.f40962e);
                                                qgj h2222222 = qez.f41107i.mo24042h();
                                                if (cdcc.m132526b()) {
                                                }
                                                ((asfb) qez.f41108j.mo66814b()).mo49120c();
                                                qez.f41108j = bmvz.f131120a;
                                                throw th6222222;
                                            }
                                        } else {
                                            str21 = "checkin_retry_count";
                                            i4 = 1;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        str4 = "Show checkin complete notification.";
                                        str16 = str27;
                                        str5 = str28;
                                        str6 = str20;
                                        str2 = str15;
                                        str3 = "checkin_retry_count";
                                        str7 = "CheckinService_onStart_showNotification";
                                        th3 = th;
                                        bundle = bundle2;
                                        th = th3;
                                        qda = qda3;
                                        long elapsedRealtime42222222 = SystemClock.elapsedRealtime();
                                        Throwable th62222222 = th;
                                        String str382222222 = str2;
                                        qez.f41099a.mo25412b(str5, Long.valueOf(elapsedRealtime42222222));
                                        qdg.m31918a(str, Long.valueOf(elapsedRealtime42222222 - elapsedRealtime2));
                                        qez.f41104f.mo24010a(elapsedRealtime, qda);
                                        if (bundle.getBoolean(str7, false)) {
                                        }
                                        qez.f41099a.mo25414c(str6, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                                        i = qda.f40962e;
                                        if (i != 0) {
                                        }
                                        qez.f41107i.mo24030a(qda.f40962e);
                                        qgj h22222222 = qez.f41107i.mo24042h();
                                        if (cdcc.m132526b()) {
                                        }
                                        ((asfb) qez.f41108j.mo66814b()).mo49120c();
                                        qez.f41108j = bmvz.f131120a;
                                        throw th62222222;
                                    }
                                } catch (Throwable th14) {
                                    th = th14;
                                    str4 = "Show checkin complete notification.";
                                    str6 = "Checkin Operation finished with result: %d finish time: %d.";
                                    str16 = str27;
                                    str5 = str28;
                                    str2 = str15;
                                    str3 = "checkin_retry_count";
                                    str7 = "CheckinService_onStart_showNotification";
                                    th3 = th;
                                    bundle = bundle2;
                                    th = th3;
                                    qda = qda3;
                                    long elapsedRealtime422222222 = SystemClock.elapsedRealtime();
                                    Throwable th622222222 = th;
                                    String str3822222222 = str2;
                                    qez.f41099a.mo25412b(str5, Long.valueOf(elapsedRealtime422222222));
                                    qdg.m31918a(str, Long.valueOf(elapsedRealtime422222222 - elapsedRealtime2));
                                    qez.f41104f.mo24010a(elapsedRealtime, qda);
                                    if (bundle.getBoolean(str7, false)) {
                                    }
                                    qez.f41099a.mo25414c(str6, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                                    i = qda.f40962e;
                                    if (i != 0) {
                                    }
                                    qez.f41107i.mo24030a(qda.f40962e);
                                    qgj h222222222 = qez.f41107i.mo24042h();
                                    if (cdcc.m132526b()) {
                                    }
                                    ((asfb) qez.f41108j.mo66814b()).mo49120c();
                                    qez.f41108j = bmvz.f131120a;
                                    throw th622222222;
                                }
                                try {
                                    if (!srd.m36077a(qfp.f41124c)) {
                                        str19 = "Show checkin complete notification.";
                                        str18 = "CheckinService_onStart_showNotification";
                                    } else {
                                        str19 = "Show checkin complete notification.";
                                        str18 = "CheckinService_onStart_showNotification";
                                        try {
                                            qfp.f41122a.mo25409a("system was upgraded", new Object[0]);
                                            i4 = 7;
                                        } catch (Throwable th15) {
                                            th = th15;
                                            str16 = str27;
                                            str5 = str28;
                                            str3 = str21;
                                            str6 = str20;
                                            str2 = str15;
                                            str4 = str19;
                                            str7 = str18;
                                            th3 = th;
                                            bundle = bundle2;
                                            th = th3;
                                            qda = qda3;
                                            long elapsedRealtime4222222222 = SystemClock.elapsedRealtime();
                                            Throwable th6222222222 = th;
                                            String str38222222222 = str2;
                                            qez.f41099a.mo25412b(str5, Long.valueOf(elapsedRealtime4222222222));
                                            qdg.m31918a(str, Long.valueOf(elapsedRealtime4222222222 - elapsedRealtime2));
                                            qez.f41104f.mo24010a(elapsedRealtime, qda);
                                            if (bundle.getBoolean(str7, false)) {
                                                qez.f41099a.mo25412b(str4, new Object[0]);
                                                qez.mo23999a(qda.f40962e);
                                            }
                                            qez.f41099a.mo25414c(str6, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                                            i = qda.f40962e;
                                            if (i != 0) {
                                                qez.f41105g.mo23995a(elapsedRealtime);
                                            } else if (i == 1 || i == 2) {
                                                qez.f41105g.mo23997b(elapsedRealtime);
                                                if (!bmyx.m108640a(',').mo66925c((CharSequence) cdci.m132547m()).contains(String.valueOf(qda.f40963f))) {
                                                    bundle.putInt(str3, bundle.getInt(str3, 0) + 1);
                                                    qez.f41099a.mo25412b(str38222222222, new Object[0]);
                                                    qez.f41104f.mo24009a(SystemClock.elapsedRealtime(), bundle);
                                                    qez.f41107i.mo24031a(qez.m32046a());
                                                }
                                            } else {
                                                qez.f41104f.mo24009a(SystemClock.elapsedRealtime(), bundle);
                                                qez.f41107i.mo24031a(qez.m32046a());
                                                qez.f41105g.mo23998c(elapsedRealtime);
                                            }
                                            qez.f41107i.mo24030a(qda.f40962e);
                                            qgj h2222222222 = qez.f41107i.mo24042h();
                                            if (cdcc.m132526b()) {
                                                qez.f41106h.mo24044a(h2222222222);
                                            }
                                            if (qez.f41108j.mo66813a() && ((asfb) qez.f41108j.mo66814b()).mo49124e()) {
                                                ((asfb) qez.f41108j.mo66814b()).mo49120c();
                                                qez.f41108j = bmvz.f131120a;
                                            }
                                            throw th6222222222;
                                        }
                                    }
                                    SharedPreferences l2 = qdn.m31960l(qfp.f41124c);
                                    if (qdg.m31925f(qfp.f41124c)) {
                                        try {
                                            qft qft = new qft(qfp.f41124c);
                                            int i11 = Build.VERSION.SDK_INT;
                                            i5 = i4;
                                            List<SubscriptionInfo> activeSubscriptionInfoList = ((SubscriptionManager) qft.f41132b.getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoList();
                                            String str41 = "no-sim";
                                            if (activeSubscriptionInfoList == null) {
                                                try {
                                                    j = elapsedRealtime;
                                                    try {
                                                        qft.f41131a.mo25409a("No Subscriptions found on the device", new Object[0]);
                                                        str16 = str27;
                                                        str17 = str28;
                                                    } catch (Throwable th16) {
                                                        th3 = th16;
                                                        str = str27;
                                                        str5 = str28;
                                                        str3 = str21;
                                                        str6 = str20;
                                                        str2 = str15;
                                                        str4 = str19;
                                                        str7 = str18;
                                                        elapsedRealtime = j;
                                                        bundle = bundle2;
                                                        th = th3;
                                                        qda = qda3;
                                                        long elapsedRealtime42222222222 = SystemClock.elapsedRealtime();
                                                        Throwable th62222222222 = th;
                                                        String str382222222222 = str2;
                                                        qez.f41099a.mo25412b(str5, Long.valueOf(elapsedRealtime42222222222));
                                                        qdg.m31918a(str, Long.valueOf(elapsedRealtime42222222222 - elapsedRealtime2));
                                                        qez.f41104f.mo24010a(elapsedRealtime, qda);
                                                        if (bundle.getBoolean(str7, false)) {
                                                        }
                                                        qez.f41099a.mo25414c(str6, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                                                        i = qda.f40962e;
                                                        if (i != 0) {
                                                        }
                                                        qez.f41107i.mo24030a(qda.f40962e);
                                                        qgj h22222222222 = qez.f41107i.mo24042h();
                                                        if (cdcc.m132526b()) {
                                                        }
                                                        ((asfb) qez.f41108j.mo66814b()).mo49120c();
                                                        qez.f41108j = bmvz.f131120a;
                                                        throw th62222222222;
                                                    }
                                                } catch (Throwable th17) {
                                                    th4 = th17;
                                                    str26 = str27;
                                                    str5 = str28;
                                                    str3 = str21;
                                                    str6 = str20;
                                                    str2 = str15;
                                                    str4 = str19;
                                                    str7 = str18;
                                                    bundle = bundle2;
                                                    th = th3;
                                                    qda = qda3;
                                                    long elapsedRealtime422222222222 = SystemClock.elapsedRealtime();
                                                    Throwable th622222222222 = th;
                                                    String str3822222222222 = str2;
                                                    qez.f41099a.mo25412b(str5, Long.valueOf(elapsedRealtime422222222222));
                                                    qdg.m31918a(str, Long.valueOf(elapsedRealtime422222222222 - elapsedRealtime2));
                                                    qez.f41104f.mo24010a(elapsedRealtime, qda);
                                                    if (bundle.getBoolean(str7, false)) {
                                                    }
                                                    qez.f41099a.mo25414c(str6, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                                                    i = qda.f40962e;
                                                    if (i != 0) {
                                                    }
                                                    qez.f41107i.mo24030a(qda.f40962e);
                                                    qgj h222222222222 = qez.f41107i.mo24042h();
                                                    if (cdcc.m132526b()) {
                                                    }
                                                    ((asfb) qez.f41108j.mo66814b()).mo49120c();
                                                    qez.f41108j = bmvz.f131120a;
                                                    throw th622222222222;
                                                }
                                            } else {
                                                j = elapsedRealtime;
                                                try {
                                                    Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
                                                    String str42 = "";
                                                    while (it.hasNext()) {
                                                        SubscriptionInfo next = it.next();
                                                        if (next == null) {
                                                            Iterator<SubscriptionInfo> it2 = it;
                                                            str16 = str27;
                                                            str17 = str28;
                                                            try {
                                                                qft.f41131a.mo25409a("Null subscription info.", new Object[0]);
                                                                it = it2;
                                                                str27 = str16;
                                                                str28 = str17;
                                                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                                                                qft.f41131a.mo25415d("Exception from TelephonyManager methods for getting SIM IDs", e, new Object[0]);
                                                                str41 = qft.mo24019a();
                                                            } catch (Throwable th18) {
                                                                th = th18;
                                                            }
                                                        } else {
                                                            Iterator<SubscriptionInfo> it3 = it;
                                                            str16 = str27;
                                                            str17 = str28;
                                                            String str43 = "[no-sim:no-imsi]";
                                                            int subscriptionId = next.getSubscriptionId();
                                                            int i12 = Build.VERSION.SDK_INT;
                                                            String simSerialNumber = qft.f41133c.createForSubscriptionId(subscriptionId).getSimSerialNumber();
                                                            if (simSerialNumber != null) {
                                                                str43 = str43.replace(str41, simSerialNumber);
                                                            }
                                                            int i13 = Build.VERSION.SDK_INT;
                                                            String subscriberId = qft.f41133c.createForSubscriptionId(subscriptionId).getSubscriberId();
                                                            if (subscriberId != null) {
                                                                str43 = str43.replace("no-imsi", subscriberId);
                                                            }
                                                            String valueOf = String.valueOf(str42);
                                                            String valueOf2 = String.valueOf(str43);
                                                            str42 = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
                                                            it = it3;
                                                            str27 = str16;
                                                            str28 = str17;
                                                        }
                                                    }
                                                    str16 = str27;
                                                    str17 = str28;
                                                    if (str42.isEmpty()) {
                                                        qft.f41131a.mo25416d("SIM IDs not available by subscription", new Object[0]);
                                                        str41 = qft.mo24019a();
                                                    } else {
                                                        str41 = str42;
                                                    }
                                                } catch (Throwable th19) {
                                                    str = str27;
                                                    th3 = th19;
                                                    str5 = str28;
                                                    str3 = str21;
                                                    str6 = str20;
                                                    str2 = str15;
                                                    str4 = str19;
                                                    str7 = str18;
                                                    elapsedRealtime = j;
                                                    bundle = bundle2;
                                                    th = th3;
                                                    qda = qda3;
                                                    long elapsedRealtime4222222222222 = SystemClock.elapsedRealtime();
                                                    Throwable th6222222222222 = th;
                                                    String str38222222222222 = str2;
                                                    qez.f41099a.mo25412b(str5, Long.valueOf(elapsedRealtime4222222222222));
                                                    qdg.m31918a(str, Long.valueOf(elapsedRealtime4222222222222 - elapsedRealtime2));
                                                    qez.f41104f.mo24010a(elapsedRealtime, qda);
                                                    if (bundle.getBoolean(str7, false)) {
                                                    }
                                                    qez.f41099a.mo25414c(str6, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                                                    i = qda.f40962e;
                                                    if (i != 0) {
                                                    }
                                                    qez.f41107i.mo24030a(qda.f40962e);
                                                    qgj h2222222222222 = qez.f41107i.mo24042h();
                                                    if (cdcc.m132526b()) {
                                                    }
                                                    ((asfb) qez.f41108j.mo66814b()).mo49120c();
                                                    qez.f41108j = bmvz.f131120a;
                                                    throw th6222222222222;
                                                }
                                            }
                                            String str44 = str34;
                                            if (!str41.equals(l2.getString(str44, null))) {
                                                sek sek2 = qfp.f41122a;
                                                String valueOf3 = String.valueOf(str41);
                                                sek2.mo25409a(valueOf3.length() == 0 ? new String("subscriberid changed to ") : "subscriberid changed to ".concat(valueOf3), new Object[0]);
                                                l2.edit().putString(str44, str41).apply();
                                                i5 = 6;
                                            }
                                        } catch (Throwable th20) {
                                            str26 = str27;
                                            th4 = th20;
                                            str5 = str28;
                                            str3 = str21;
                                            str6 = str20;
                                            str2 = str15;
                                            str4 = str19;
                                            str7 = str18;
                                            bundle = bundle2;
                                            th = th3;
                                            qda = qda3;
                                            long elapsedRealtime42222222222222 = SystemClock.elapsedRealtime();
                                            Throwable th62222222222222 = th;
                                            String str382222222222222 = str2;
                                            qez.f41099a.mo25412b(str5, Long.valueOf(elapsedRealtime42222222222222));
                                            qdg.m31918a(str, Long.valueOf(elapsedRealtime42222222222222 - elapsedRealtime2));
                                            qez.f41104f.mo24010a(elapsedRealtime, qda);
                                            if (bundle.getBoolean(str7, false)) {
                                            }
                                            qez.f41099a.mo25414c(str6, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                                            i = qda.f40962e;
                                            if (i != 0) {
                                            }
                                            qez.f41107i.mo24030a(qda.f40962e);
                                            qgj h22222222222222 = qez.f41107i.mo24042h();
                                            if (cdcc.m132526b()) {
                                            }
                                            ((asfb) qez.f41108j.mo66814b()).mo49120c();
                                            qez.f41108j = bmvz.f131120a;
                                            throw th62222222222222;
                                        }
                                    } else {
                                        i5 = i4;
                                        j = elapsedRealtime;
                                        str16 = str27;
                                        str17 = str28;
                                        qfp.f41122a.mo25416d("Gms missing READ_PHONE_STATE permission, cannot read hw info.", new Object[0]);
                                    }
                                    String str45 = str33;
                                    a.mo23964a(i5, i3 + 1, bundle2.getString("checkin_source_package", str45), bundle2.getString("checkin_source_class", ""), bundle2.getBoolean("checkin_source_force", false));
                                    a.mo23965a(Math.max(Build.TIME, 1587020400000L));
                                    a.f41019m = qfp.f41125d;
                                    a.f41027u = (int) cdci.f180455a.mo6606a().mo77240c();
                                    boolean z2 = bundle2.getBoolean(str22, false);
                                    String string = bundle2.getString("CheckinService_logUploadPolicy", "UPLOAD_ALL");
                                    if (z2) {
                                        if (!cdci.m132536b()) {
                                            a.f41016j = true;
                                            string = "UPLOAD_NONE";
                                            a.mo23967a(string);
                                            if (!sre.m36080a(qfp.f41124c)) {
                                                a.f41017k = qfp.f41123b;
                                            } else if (sre.m36082b(qfp.f41124c)) {
                                                a.f41017k = "https://checkin.gstatic.com/checkin";
                                            } else {
                                                a.f41017k = cdcf.m132531b();
                                            }
                                            if (!cdci.f180455a.mo6606a().mo77247j()) {
                                                qdt qdt = new qdt();
                                                qdt.f41029b = true;
                                                qdt.f41028a = qfp.f41124c.getSharedPreferences("dns_patcher", 0);
                                                a.f41014h = qdt;
                                            }
                                            a.f41009c = l;
                                            a.f41012f = bundle2.getBoolean("CheckinService_fetchSystemUpdates", false);
                                            a.f41013g = !cdci.m132543i();
                                            String str46 = str31;
                                            String str47 = str32;
                                            a.f41015i = bundle2.getString(str47, str46);
                                            if (!cdci.f180455a.mo6606a().mo77226C()) {
                                                a.f41024r = qfp.mo24015a();
                                            }
                                            int i14 = Build.VERSION.SDK_INT;
                                            if (cdci.m132553s()) {
                                                String str48 = str30;
                                                if (bundle2.containsKey(str48)) {
                                                    a.mo23966a((NetworkRequest) bundle2.getParcelable(str48));
                                                }
                                            }
                                            a2 = a.mo23963a();
                                            qhj = a2.f41046p;
                                            sek sek3 = qez.f41099a;
                                            String string2 = bundle2.getString(str47, str46);
                                            if (qhj == null) {
                                                int a5 = qhi.m32172a(qhj.f41357b);
                                                if (a5 == 0) {
                                                    a5 = 1;
                                                }
                                                i6 = a5 - 1;
                                            } else {
                                                i6 = 0;
                                            }
                                            if (bundle2 != null || !bundle2.getBoolean(str22, false)) {
                                                z = false;
                                            } else {
                                                z = true;
                                            }
                                            int c = svu.m36486a().mo26189c();
                                            long elapsedRealtime6 = SystemClock.elapsedRealtime();
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(string2).length() + 108);
                                            sb2.append("Starting Checkin: ");
                                            sb2.append(string2);
                                            sb2.append(" Reason : ");
                                            sb2.append(i6);
                                            sb2.append(" Force : ");
                                            sb2.append(z);
                                            sb2.append(" UserId : ");
                                            sb2.append(c);
                                            sb2.append(" Start time : ");
                                            sb2.append(elapsedRealtime6);
                                            sek3.mo25414c(sb2.toString(), new Object[0]);
                                            qez.f41107i.mo24038d();
                                            int i15 = Build.VERSION.SDK_INT;
                                            if (!cdci.m132553s()) {
                                                qcy = new qdr(a2);
                                            } else {
                                                qcy = new qdi(a2);
                                            }
                                            Context applicationContext = qez.f41100b.getApplicationContext();
                                            if (cdcl.m132638b()) {
                                                qdd = new qdd(applicationContext, qcy, new qdb(applicationContext));
                                            } else {
                                                qdd = new qdd(applicationContext, qcy);
                                            }
                                            a3 = qdd.mo23927a(a2);
                                            qez.f41107i.mo24033a(a3.f40964g);
                                            qez.f41107i.mo24034a(a3.f40965h);
                                            qez.f41107i.mo24039e();
                                            qgu qgu2 = a3.f40961d;
                                            qgv = a3.f40959b;
                                            i7 = a3.f40962e;
                                            List<Account> list2 = a3.f40960c;
                                            if (i7 == 0 && cdci.f180455a.mo6606a().mo77253p()) {
                                                qdn.m31960l(qez.f41100b.getApplicationContext()).edit().putLong("CheckinService_lastCheckinSuccessTime", System.currentTimeMillis()).apply();
                                            }
                                            qgu = a3.f40961d;
                                            if (qgu == null) {
                                                qhg qhg = qgu.f41235l;
                                                if (qhg == null) {
                                                    qhg = qhg.f41336o;
                                                }
                                                str23 = qhg.f41344g;
                                            } else {
                                                str23 = "";
                                            }
                                            qez.mo24000a(str23);
                                            SharedPreferences l3 = qdn.m31960l(qez.f41100b.getApplicationContext());
                                            if (qgv == null) {
                                                try {
                                                    Intent[] a6 = qde.m31913a(qgv);
                                                    int length = a6.length;
                                                    int i16 = 0;
                                                    while (i16 < length) {
                                                        Intent intent2 = a6[i16];
                                                        qda3 = a3;
                                                        String str49 = str45;
                                                        if (!"com.google.android.checkin.INVALIDATE".equals(intent2.getAction())) {
                                                            qez.f41100b.sendBroadcast(intent2);
                                                        } else {
                                                            if (qgu2 != null) {
                                                                if (qgu2.f41236m.size() != 0) {
                                                                    list = qgu2.f41236m;
                                                                    qcx.m31881a(qez.f41100b, list);
                                                                }
                                                            }
                                                            list = new ArrayList();
                                                            qcx.m31881a(qez.f41100b, list);
                                                        }
                                                        i16++;
                                                        a3 = qda3;
                                                        str45 = str49;
                                                    }
                                                    qda3 = a3;
                                                    str24 = str45;
                                                    if ((qgv.f41252a & 128) != 0) {
                                                        String str50 = str29;
                                                        if (!qgv.f41260i.equals(l3.getString(str50, ""))) {
                                                            l3.edit().putString(str50, qgv.f41260i).apply();
                                                        }
                                                    }
                                                    if ((qgv.f41252a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                                                        qez.f41099a.mo25409a("Clearing the deviceDataVersionInfo.", new Object[0]);
                                                        l3.edit().remove("CheckinService_deviceDataVersionInfo").apply();
                                                    } else if (!qgv.f41261j.equals(l3.getString("CheckinService_deviceDataVersionInfo", ""))) {
                                                        qez.f41099a.mo25409a("Storing the new deviceDataVersionInfo.", new Object[0]);
                                                        l3.edit().putString("CheckinService_deviceDataVersionInfo", qgv.f41261j).apply();
                                                    }
                                                    if (qgv.f41262k.size() > 0) {
                                                        sek sek4 = qez.f41099a;
                                                        int size = qgv.f41262k.size();
                                                        StringBuilder sb3 = new StringBuilder(32);
                                                        sb3.append("Invalidating ");
                                                        sb3.append(size);
                                                        sb3.append(" tokens.");
                                                        sek4.mo25409a(sb3.toString(), new Object[0]);
                                                        qcx.m31881a(qez.f41100b, qgv.f41262k);
                                                    }
                                                } catch (Throwable th21) {
                                                    th = th21;
                                                }
                                            } else {
                                                qda3 = a3;
                                                str24 = str45;
                                            }
                                            if (i7 == 0) {
                                                SharedPreferences l4 = qdn.m31960l(qez.f41100b.getApplicationContext());
                                                qhj qhj2 = a2.f41046p;
                                                if (qhj2 == null || (qhj2.f41356a & 4) == 0) {
                                                    str25 = str24;
                                                } else {
                                                    str25 = qhj2.f41359d;
                                                }
                                                long currentTimeMillis = System.currentTimeMillis();
                                                SharedPreferences.Editor edit = l4.edit();
                                                String valueOf4 = String.valueOf(str25);
                                                edit.putLong(valueOf4.length() == 0 ? new String("CheckinService_last_checkin_ms_") : "CheckinService_last_checkin_ms_".concat(valueOf4), currentTimeMillis).apply();
                                                sek sek5 = qez.f41099a;
                                                StringBuilder sb4 = new StringBuilder(String.valueOf(str25).length() + 64);
                                                sb4.append("Recording last checkin time for package ");
                                                sb4.append(str25);
                                                sb4.append(" as ");
                                                sb4.append(currentTimeMillis);
                                                sek5.mo25412b(sb4.toString(), new Object[0]);
                                            }
                                            SharedPreferences l5 = qdn.m31960l(qez.f41100b);
                                            Intent intent3 = new Intent("com.google.android.checkin.CHECKIN_COMPLETE");
                                            if (i7 == 0) {
                                                intent3.putExtra("success", false);
                                            } else {
                                                intent3.putExtra("success", true);
                                                if (list2 != null) {
                                                    if (!list2.isEmpty()) {
                                                        qff.m32062a(qez.f41100b);
                                                    }
                                                }
                                            }
                                            qez.f41100b.sendBroadcast(intent3);
                                            l5.edit().putLong("CheckinService_checkinCompleteBroadcastTime", System.currentTimeMillis()).apply();
                                            if (i7 == 0) {
                                                SharedPreferences l6 = qdn.m31960l(qez.f41100b);
                                                if (list2 != null) {
                                                    if (!list2.isEmpty()) {
                                                        C1225nr nrVar = new C1225nr(list2.size());
                                                        for (Account account : list2) {
                                                            try {
                                                                nrVar.add(new JSONObject().put("authAccount", account.name).put("accountType", account.type).toString());
                                                            } catch (JSONException e2) {
                                                            }
                                                        }
                                                        l6.edit().putStringSet("CheckinService_accountsReceivedByServer", nrVar).apply();
                                                    }
                                                }
                                                l6.edit().remove("CheckinService_accountsReceivedByServer").apply();
                                            }
                                            if (!a2.f41034d) {
                                                if (i7 != 0) {
                                                    i8 = 8;
                                                } else {
                                                    i8 = 24;
                                                }
                                                qdg.m31917a(i8);
                                            }
                                            qez.f41107i.mo24040f();
                                            qda = qda3;
                                            long elapsedRealtime52 = SystemClock.elapsedRealtime();
                                            qez.f41099a.mo25412b(str17, Long.valueOf(elapsedRealtime52));
                                            qdg.m31918a(str16, Long.valueOf(elapsedRealtime52 - elapsedRealtime2));
                                            long j22 = j;
                                            qez.f41104f.mo24010a(j22, qda);
                                            if (bundle2.getBoolean(str18, false)) {
                                            }
                                            qez.f41099a.mo25414c(str20, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                                            i2 = qda.f40962e;
                                            if (i2 == 0) {
                                            }
                                            qez.f41107i.mo24030a(qda.f40962e);
                                            qgj h32 = qez.f41107i.mo24042h();
                                            if (cdcc.m132526b()) {
                                            }
                                            return;
                                        }
                                    }
                                    a.f41016j = false;
                                    a.f41008b = (DropBoxManager) qfp.f41124c.getSystemService("dropbox");
                                    a.mo23967a(string);
                                    if (!sre.m36080a(qfp.f41124c)) {
                                    }
                                    if (!cdci.f180455a.mo6606a().mo77247j()) {
                                    }
                                    a.f41009c = l;
                                    a.f41012f = bundle2.getBoolean("CheckinService_fetchSystemUpdates", false);
                                    a.f41013g = !cdci.m132543i();
                                    String str462 = str31;
                                    String str472 = str32;
                                    a.f41015i = bundle2.getString(str472, str462);
                                    if (!cdci.f180455a.mo6606a().mo77226C()) {
                                    }
                                    int i142 = Build.VERSION.SDK_INT;
                                    if (cdci.m132553s()) {
                                    }
                                    try {
                                        a2 = a.mo23963a();
                                        qhj = a2.f41046p;
                                        sek sek32 = qez.f41099a;
                                        String string22 = bundle2.getString(str472, str462);
                                        if (qhj == null) {
                                        }
                                        if (bundle2 != null) {
                                        }
                                        z = false;
                                        int c2 = svu.m36486a().mo26189c();
                                        long elapsedRealtime62 = SystemClock.elapsedRealtime();
                                        StringBuilder sb22 = new StringBuilder(String.valueOf(string22).length() + 108);
                                        sb22.append("Starting Checkin: ");
                                        sb22.append(string22);
                                        sb22.append(" Reason : ");
                                        sb22.append(i6);
                                        sb22.append(" Force : ");
                                        sb22.append(z);
                                        sb22.append(" UserId : ");
                                        sb22.append(c2);
                                        sb22.append(" Start time : ");
                                        sb22.append(elapsedRealtime62);
                                        sek32.mo25414c(sb22.toString(), new Object[0]);
                                        qez.f41107i.mo24038d();
                                        int i152 = Build.VERSION.SDK_INT;
                                        if (!cdci.m132553s()) {
                                        }
                                        Context applicationContext2 = qez.f41100b.getApplicationContext();
                                        if (cdcl.m132638b()) {
                                        }
                                        a3 = qdd.mo23927a(a2);
                                    } catch (Throwable th22) {
                                        th = th22;
                                        str3 = str21;
                                        str6 = str20;
                                        str2 = str15;
                                        str4 = str19;
                                        str7 = str18;
                                        elapsedRealtime = j;
                                        str5 = str17;
                                        th3 = th;
                                        bundle = bundle2;
                                        th = th3;
                                        qda = qda3;
                                        long elapsedRealtime422222222222222 = SystemClock.elapsedRealtime();
                                        Throwable th622222222222222 = th;
                                        String str3822222222222222 = str2;
                                        qez.f41099a.mo25412b(str5, Long.valueOf(elapsedRealtime422222222222222));
                                        qdg.m31918a(str, Long.valueOf(elapsedRealtime422222222222222 - elapsedRealtime2));
                                        qez.f41104f.mo24010a(elapsedRealtime, qda);
                                        if (bundle.getBoolean(str7, false)) {
                                        }
                                        qez.f41099a.mo25414c(str6, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                                        i = qda.f40962e;
                                        if (i != 0) {
                                        }
                                        qez.f41107i.mo24030a(qda.f40962e);
                                        qgj h222222222222222 = qez.f41107i.mo24042h();
                                        if (cdcc.m132526b()) {
                                        }
                                        ((asfb) qez.f41108j.mo66814b()).mo49120c();
                                        qez.f41108j = bmvz.f131120a;
                                        throw th622222222222222;
                                    }
                                } catch (Throwable th23) {
                                    th = th23;
                                    str4 = "Show checkin complete notification.";
                                    str7 = "CheckinService_onStart_showNotification";
                                    str16 = str27;
                                    str5 = str28;
                                    str3 = str21;
                                    str6 = str20;
                                    str2 = str15;
                                    th3 = th;
                                    bundle = bundle2;
                                    th = th3;
                                    qda = qda3;
                                    long elapsedRealtime4222222222222222 = SystemClock.elapsedRealtime();
                                    Throwable th6222222222222222 = th;
                                    String str38222222222222222 = str2;
                                    qez.f41099a.mo25412b(str5, Long.valueOf(elapsedRealtime4222222222222222));
                                    qdg.m31918a(str, Long.valueOf(elapsedRealtime4222222222222222 - elapsedRealtime2));
                                    qez.f41104f.mo24010a(elapsedRealtime, qda);
                                    if (bundle.getBoolean(str7, false)) {
                                    }
                                    qez.f41099a.mo25414c(str6, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                                    i = qda.f40962e;
                                    if (i != 0) {
                                    }
                                    qez.f41107i.mo24030a(qda.f40962e);
                                    qgj h2222222222222222 = qez.f41107i.mo24042h();
                                    if (cdcc.m132526b()) {
                                    }
                                    ((asfb) qez.f41108j.mo66814b()).mo49120c();
                                    qez.f41108j = bmvz.f131120a;
                                    throw th6222222222222222;
                                }
                                try {
                                    qez.f41107i.mo24033a(a3.f40964g);
                                    qez.f41107i.mo24034a(a3.f40965h);
                                    qez.f41107i.mo24039e();
                                    qgu qgu22 = a3.f40961d;
                                    qgv = a3.f40959b;
                                    i7 = a3.f40962e;
                                    List<Account> list22 = a3.f40960c;
                                    qdn.m31960l(qez.f41100b.getApplicationContext()).edit().putLong("CheckinService_lastCheckinSuccessTime", System.currentTimeMillis()).apply();
                                    qgu = a3.f40961d;
                                    if (qgu == null) {
                                    }
                                    qez.mo24000a(str23);
                                    SharedPreferences l32 = qdn.m31960l(qez.f41100b.getApplicationContext());
                                    if (qgv == null) {
                                    }
                                    if (i7 == 0) {
                                    }
                                } catch (Throwable th24) {
                                    th = th24;
                                    qda3 = a3;
                                    str3 = str21;
                                    str6 = str20;
                                    str2 = str15;
                                    str4 = str19;
                                    str7 = str18;
                                    elapsedRealtime = j;
                                    str5 = str17;
                                    th3 = th;
                                    bundle = bundle2;
                                    th = th3;
                                    qda = qda3;
                                    long elapsedRealtime42222222222222222 = SystemClock.elapsedRealtime();
                                    Throwable th62222222222222222 = th;
                                    String str382222222222222222 = str2;
                                    qez.f41099a.mo25412b(str5, Long.valueOf(elapsedRealtime42222222222222222));
                                    qdg.m31918a(str, Long.valueOf(elapsedRealtime42222222222222222 - elapsedRealtime2));
                                    qez.f41104f.mo24010a(elapsedRealtime, qda);
                                    if (bundle.getBoolean(str7, false)) {
                                    }
                                    qez.f41099a.mo25414c(str6, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                                    i = qda.f40962e;
                                    if (i != 0) {
                                    }
                                    qez.f41107i.mo24030a(qda.f40962e);
                                    qgj h22222222222222222 = qez.f41107i.mo24042h();
                                    if (cdcc.m132526b()) {
                                    }
                                    ((asfb) qez.f41108j.mo66814b()).mo49120c();
                                    qez.f41108j = bmvz.f131120a;
                                    throw th62222222222222222;
                                }
                                try {
                                    SharedPreferences l52 = qdn.m31960l(qez.f41100b);
                                    Intent intent32 = new Intent("com.google.android.checkin.CHECKIN_COMPLETE");
                                    if (i7 == 0) {
                                    }
                                    qez.f41100b.sendBroadcast(intent32);
                                    l52.edit().putLong("CheckinService_checkinCompleteBroadcastTime", System.currentTimeMillis()).apply();
                                    if (i7 == 0) {
                                    }
                                    if (!a2.f41034d) {
                                    }
                                    qez.f41107i.mo24040f();
                                    qda = qda3;
                                    long elapsedRealtime522 = SystemClock.elapsedRealtime();
                                    qez.f41099a.mo25412b(str17, Long.valueOf(elapsedRealtime522));
                                    qdg.m31918a(str16, Long.valueOf(elapsedRealtime522 - elapsedRealtime2));
                                    long j222 = j;
                                    qez.f41104f.mo24010a(j222, qda);
                                    if (bundle2.getBoolean(str18, false)) {
                                    }
                                    qez.f41099a.mo25414c(str20, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                                    i2 = qda.f40962e;
                                    if (i2 == 0) {
                                    }
                                    qez.f41107i.mo24030a(qda.f40962e);
                                    qgj h322 = qez.f41107i.mo24042h();
                                    if (cdcc.m132526b()) {
                                    }
                                    return;
                                } catch (Throwable th25) {
                                    th = th25;
                                    str3 = str21;
                                    str6 = str20;
                                    str2 = str15;
                                    str4 = str19;
                                    str7 = str18;
                                    elapsedRealtime = j;
                                    str5 = str17;
                                    th3 = th;
                                    bundle = bundle2;
                                    th = th3;
                                    qda = qda3;
                                    long elapsedRealtime422222222222222222 = SystemClock.elapsedRealtime();
                                    Throwable th622222222222222222 = th;
                                    String str3822222222222222222 = str2;
                                    qez.f41099a.mo25412b(str5, Long.valueOf(elapsedRealtime422222222222222222));
                                    qdg.m31918a(str, Long.valueOf(elapsedRealtime422222222222222222 - elapsedRealtime2));
                                    qez.f41104f.mo24010a(elapsedRealtime, qda);
                                    if (bundle.getBoolean(str7, false)) {
                                    }
                                    qez.f41099a.mo25414c(str6, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                                    i = qda.f40962e;
                                    if (i != 0) {
                                    }
                                    qez.f41107i.mo24030a(qda.f40962e);
                                    qgj h222222222222222222 = qez.f41107i.mo24042h();
                                    if (cdcc.m132526b()) {
                                    }
                                    ((asfb) qez.f41108j.mo66814b()).mo49120c();
                                    qez.f41108j = bmvz.f131120a;
                                    throw th622222222222222222;
                                }
                            } catch (Throwable th26) {
                                th = th26;
                                qda3 = qda4;
                                str4 = "Show checkin complete notification.";
                                str16 = str27;
                                str5 = str28;
                                str3 = "checkin_retry_count";
                                str7 = "CheckinService_onStart_showNotification";
                                str2 = str39;
                                str6 = "Checkin Operation finished with result: %d finish time: %d.";
                                th3 = th;
                                bundle = bundle2;
                                th = th3;
                                qda = qda3;
                                long elapsedRealtime4222222222222222222 = SystemClock.elapsedRealtime();
                                Throwable th6222222222222222222 = th;
                                String str38222222222222222222 = str2;
                                qez.f41099a.mo25412b(str5, Long.valueOf(elapsedRealtime4222222222222222222));
                                qdg.m31918a(str, Long.valueOf(elapsedRealtime4222222222222222222 - elapsedRealtime2));
                                qez.f41104f.mo24010a(elapsedRealtime, qda);
                                if (bundle.getBoolean(str7, false)) {
                                }
                                qez.f41099a.mo25414c(str6, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                                i = qda.f40962e;
                                if (i != 0) {
                                }
                                qez.f41107i.mo24030a(qda.f40962e);
                                qgj h2222222222222222222 = qez.f41107i.mo24042h();
                                if (cdcc.m132526b()) {
                                }
                                ((asfb) qez.f41108j.mo66814b()).mo49120c();
                                qez.f41108j = bmvz.f131120a;
                                throw th6222222222222222222;
                            }
                        }
                        ((asfb) qez.f41108j.mo66814b()).mo49120c();
                        qez.f41108j = bmvz.f131120a;
                        return;
                    } catch (Throwable th27) {
                        th = th27;
                        qda2 = qda4;
                        str11 = "Show checkin complete notification.";
                        str13 = "Checkin Operation finished with result: %d finish time: %d.";
                        str8 = str27;
                        str12 = str28;
                        str9 = str15;
                        str10 = "checkin_retry_count";
                        str14 = "CheckinService_onStart_showNotification";
                        th2 = th;
                        th = th2;
                        qda = qda2;
                        long elapsedRealtime42222222222222222222 = SystemClock.elapsedRealtime();
                        Throwable th62222222222222222222 = th;
                        String str382222222222222222222 = str2;
                        qez.f41099a.mo25412b(str5, Long.valueOf(elapsedRealtime42222222222222222222));
                        qdg.m31918a(str, Long.valueOf(elapsedRealtime42222222222222222222 - elapsedRealtime2));
                        qez.f41104f.mo24010a(elapsedRealtime, qda);
                        if (bundle.getBoolean(str7, false)) {
                        }
                        qez.f41099a.mo25414c(str6, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                        i = qda.f40962e;
                        if (i != 0) {
                        }
                        qez.f41107i.mo24030a(qda.f40962e);
                        qgj h22222222222222222222 = qez.f41107i.mo24042h();
                        if (cdcc.m132526b()) {
                        }
                        ((asfb) qez.f41108j.mo66814b()).mo49120c();
                        qez.f41108j = bmvz.f131120a;
                        throw th62222222222222222222;
                    }
                } catch (Throwable th28) {
                    th = th28;
                    bundle = bundle4;
                    qda2 = qda4;
                    str13 = "Checkin Operation finished with result: %d finish time: %d.";
                    str8 = str27;
                    str12 = str28;
                    str9 = "Checkin rescheduled after failure at";
                    str11 = "Show checkin complete notification.";
                    str10 = "checkin_retry_count";
                    str14 = "CheckinService_onStart_showNotification";
                    th2 = th;
                    th = th2;
                    qda = qda2;
                    long elapsedRealtime422222222222222222222 = SystemClock.elapsedRealtime();
                    Throwable th622222222222222222222 = th;
                    String str3822222222222222222222 = str2;
                    qez.f41099a.mo25412b(str5, Long.valueOf(elapsedRealtime422222222222222222222));
                    qdg.m31918a(str, Long.valueOf(elapsedRealtime422222222222222222222 - elapsedRealtime2));
                    qez.f41104f.mo24010a(elapsedRealtime, qda);
                    if (bundle.getBoolean(str7, false)) {
                    }
                    qez.f41099a.mo25414c(str6, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                    i = qda.f40962e;
                    if (i != 0) {
                    }
                    qez.f41107i.mo24030a(qda.f40962e);
                    qgj h222222222222222222222 = qez.f41107i.mo24042h();
                    if (cdcc.m132526b()) {
                    }
                    ((asfb) qez.f41108j.mo66814b()).mo49120c();
                    qez.f41108j = bmvz.f131120a;
                    throw th622222222222222222222;
                }
            } catch (Throwable th29) {
                th = th29;
                qda2 = qda4;
                bundle = bundle3;
                str13 = "Checkin Operation finished with result: %d finish time: %d.";
                str8 = str27;
                str12 = str28;
                str9 = "Checkin rescheduled after failure at";
                str11 = "Show checkin complete notification.";
                str10 = "checkin_retry_count";
                str14 = "CheckinService_onStart_showNotification";
                th2 = th;
                th = th2;
                qda = qda2;
                long elapsedRealtime4222222222222222222222 = SystemClock.elapsedRealtime();
                Throwable th6222222222222222222222 = th;
                String str38222222222222222222222 = str2;
                qez.f41099a.mo25412b(str5, Long.valueOf(elapsedRealtime4222222222222222222222));
                qdg.m31918a(str, Long.valueOf(elapsedRealtime4222222222222222222222 - elapsedRealtime2));
                qez.f41104f.mo24010a(elapsedRealtime, qda);
                if (bundle.getBoolean(str7, false)) {
                }
                qez.f41099a.mo25414c(str6, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
                i = qda.f40962e;
                if (i != 0) {
                }
                qez.f41107i.mo24030a(qda.f40962e);
                qgj h2222222222222222222222 = qez.f41107i.mo24042h();
                if (cdcc.m132526b()) {
                }
                ((asfb) qez.f41108j.mo66814b()).mo49120c();
                qez.f41108j = bmvz.f131120a;
                throw th6222222222222222222222;
            }
        } else {
            qez.f41099a.mo25414c("GmsCore checkin is not enabled.", new Object[0]);
            return;
        }
        th3 = th;
        str3 = str21;
        str6 = str20;
        str2 = str15;
        str4 = str19;
        str7 = str18;
        elapsedRealtime = j;
        str5 = str17;
        bundle = bundle2;
        th = th3;
        qda = qda3;
        long elapsedRealtime42222222222222222222222 = SystemClock.elapsedRealtime();
        Throwable th62222222222222222222222 = th;
        String str382222222222222222222222 = str2;
        qez.f41099a.mo25412b(str5, Long.valueOf(elapsedRealtime42222222222222222222222));
        qdg.m31918a(str, Long.valueOf(elapsedRealtime42222222222222222222222 - elapsedRealtime2));
        qez.f41104f.mo24010a(elapsedRealtime, qda);
        if (bundle.getBoolean(str7, false)) {
        }
        qez.f41099a.mo25414c(str6, Integer.valueOf(qda.f40962e), Long.valueOf(SystemClock.elapsedRealtime()));
        i = qda.f40962e;
        if (i != 0) {
        }
        qez.f41107i.mo24030a(qda.f40962e);
        qgj h22222222222222222222222 = qez.f41107i.mo24042h();
        if (cdcc.m132526b()) {
        }
        ((asfb) qez.f41108j.mo66814b()).mo49120c();
        qez.f41108j = bmvz.f131120a;
        throw th62222222222222222222222;
    }
}
