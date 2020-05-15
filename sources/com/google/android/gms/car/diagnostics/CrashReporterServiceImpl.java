package com.google.android.gms.car.diagnostics;

import android.app.ApplicationErrorReport;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.EventLog;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CrashInfoParcel;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CrashReporterServiceImpl extends nza {

    /* renamed from: a */
    static final ApplicationErrorReport.CrashInfo f29476a = new ApplicationErrorReport.CrashInfo(new Exception("NULL_EXCEPTION"));

    /* renamed from: b */
    private static final bnsn f29477b = odk.m28481a("CAR.FEEDBACK");

    /* renamed from: c */
    private int[] f29478c = null;

    /* renamed from: d */
    private wwr f29479d;

    /* renamed from: e */
    private aoob f29480e;

    /* renamed from: f */
    private String f29481f;

    /* renamed from: g */
    private boolean f29482g;

    /* renamed from: h */
    private aney f29483h;

    /* renamed from: i */
    private String f29484i;

    /* renamed from: j */
    private final Random f29485j = new Random();

    public CrashReporterServiceImpl() {
        super(CrashReporterServiceImpl.class.getSimpleName());
    }

    /* renamed from: a */
    private final Integer m22081a(int i, String str) {
        Integer num = null;
        if (i == -1 || str == null) {
            return null;
        }
        try {
            if (this.f29478c == null) {
                int tagCode = EventLog.getTagCode("am_proc_died");
                if (tagCode != -1) {
                    this.f29478c = new int[]{tagCode};
                } else {
                    bnsi c = f29477b.mo68388c();
                    c.mo68432a("com.google.android.gms.car.diagnostics.CrashReporterServiceImpl", "a", 195, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("am_proc_died tag code not found");
                    return null;
                }
            }
            ArrayList arrayList = new ArrayList();
            EventLog.readEvents(this.f29478c, arrayList);
            int size = arrayList.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Object[] objArr = (Object[]) ((EventLog.Event) arrayList.get(size)).getData();
                if (((Integer) objArr[1]).intValue() == i && String.valueOf(objArr[2]).equals(str)) {
                    num = Integer.valueOf(((Integer) objArr[3]).intValue());
                    break;
                }
                size--;
            }
        } catch (Exception e) {
            bnsi c2 = f29477b.mo68388c();
            c2.mo68437a(e);
            c2.mo68432a("com.google.android.gms.car.diagnostics.CrashReporterServiceImpl", "a", (int) BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68405a("Error looking up event logs");
        }
        return num;
    }

    public final void onCreate() {
        super.onCreate();
        this.f29479d = wvu.m42361a(getApplicationContext());
        this.f29480e = aonx.m66186a(getApplicationContext());
        this.f29483h = anef.m64089a(getApplicationContext());
    }

    public final void onDestroy() {
        this.f29481f = null;
        this.f29484i = null;
        super.onDestroy();
    }

    protected CrashReporterServiceImpl(Context context, wwr wwr, aoob aoob, aney aney) {
        super(CrashReporterServiceImpl.class.getSimpleName());
        attachBaseContext(context);
        this.f29479d = wwr;
        this.f29480e = aoob;
        this.f29483h = aney;
    }

    /* renamed from: a */
    private static String m22082a(PseudonymousIdToken pseudonymousIdToken) {
        String str = pseudonymousIdToken.f83468a;
        if (str == null) {
            return null;
        }
        try {
            return sqd.m35968b(MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8)));
        } catch (NoSuchAlgorithmException e) {
            bnsi c = f29477b.mo68388c();
            c.mo68437a(e);
            c.mo68432a("com.google.android.gms.car.diagnostics.CrashReporterServiceImpl", "a", 162, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Error hashing ID");
            return null;
        }
    }

    /* renamed from: a */
    public static void m22083a(Context context, String str, npq npq) {
        if (context == null || str == null || npq == null) {
            bnsi c = f29477b.mo68388c();
            c.mo68432a("com.google.android.gms.car.diagnostics.CrashReporterServiceImpl", "a", 79, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Got null value, couldn't report crash.");
        } else if (!npd.m27127a(context).f36297d) {
            bnsi c2 = f29477b.mo68388c();
            c2.mo68432a("com.google.android.gms.car.diagnostics.CrashReporterServiceImpl", "a", 85, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68405a("Not reporting crash, telemetry disabled");
        } else {
            Intent component = new Intent().setComponent(new ComponentName(context, "com.google.android.gms.car.diagnostics.CrashReporterService2"));
            component.putExtra("package_name", str);
            component.putExtra("process_id", npq.f36348e);
            component.putExtra("exception", npq.f36346c);
            sef.m35071a(npq.f36345b, component, "car_info");
            component.putExtra("command_history", npq.f36344a);
            component.putExtra("feedback_category_tag", npq.f36349f);
            component.putExtra("process_name", npq.f36347d);
            context.startService(component);
        }
    }

    /* renamed from: a */
    private final void m22084a(nzo nzo) {
        String str;
        int i = 0;
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(npe.m27161b(getApplicationContext()), 0);
            i = packageInfo.versionCode;
            try {
                str = packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException | IllegalStateException | SecurityException e) {
                e = e;
            }
        } catch (PackageManager.NameNotFoundException | IllegalStateException | SecurityException e2) {
            e = e2;
            bnsi c = f29477b.mo68388c();
            c.mo68437a(e);
            c.mo68432a("com.google.android.gms.car.diagnostics.CrashReporterServiceImpl", "a", 385, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Cannot get package info for Gearhead package");
            str = "";
            nzo.f37014a.put("gearhead_version", Integer.toString(i));
            nzo.f37014a.put("gearhead_version_name", str);
        }
        nzo.f37014a.put("gearhead_version", Integer.toString(i));
        nzo.f37014a.put("gearhead_version_name", str);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x032e A[Catch:{ NullPointerException -> 0x036a }, LOOP:1: B:124:0x0328->B:126:0x032e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x034d A[Catch:{ NullPointerException -> 0x036a }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x035a A[Catch:{ NullPointerException -> 0x036a }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01d9 A[SYNTHETIC, Splitter:B:90:0x01d9] */
    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        Integer num;
        boolean z;
        aucb aucb;
        aucb aucb2;
        String stringExtra;
        CrashInfoParcel crashInfoParcel;
        ApplicationErrorReport.CrashInfo crashInfo;
        String str;
        nzo nzo;
        String stringExtra2;
        CarInfo carInfo;
        String stringExtra3;
        String stringExtra4;
        wwv wwv;
        String str2;
        int i;
        String str3;
        String str4;
        String str5;
        bqyq a;
        Intent intent2 = intent;
        if (nzp.m28234a()) {
            int intExtra = intent2.getIntExtra("process_id", -1);
            String stringExtra5 = intent2.getStringExtra("process_name");
            if (intExtra == -1) {
                num = null;
            } else {
                if (stringExtra5 != null) {
                    try {
                        if (this.f29478c == null) {
                            int tagCode = EventLog.getTagCode("am_proc_died");
                            if (tagCode != -1) {
                                this.f29478c = new int[]{tagCode};
                            } else {
                                bnsi c = f29477b.mo68388c();
                                c.mo68432a("com.google.android.gms.car.diagnostics.CrashReporterServiceImpl", "a", 195, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                c.mo68405a("am_proc_died tag code not found");
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        EventLog.readEvents(this.f29478c, arrayList);
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                num = null;
                                break;
                            }
                            Object[] objArr = (Object[]) ((EventLog.Event) arrayList.get(size)).getData();
                            if (((Integer) objArr[1]).intValue() == intExtra && String.valueOf(objArr[2]).equals(stringExtra5)) {
                                num = Integer.valueOf(((Integer) objArr[3]).intValue());
                                break;
                            }
                            size--;
                        }
                    } catch (Exception e) {
                        bnsi c2 = f29477b.mo68388c();
                        c2.mo68437a(e);
                        c2.mo68432a("com.google.android.gms.car.diagnostics.CrashReporterServiceImpl", "a", (int) BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c2.mo68405a("Error looking up event logs");
                        num = null;
                    }
                }
                num = null;
            }
            String str6 = this.f29481f;
            String str7 = this.f29484i;
            if (!this.f29482g || ccqu.m131298b()) {
                z = true;
            } else {
                z = false;
            }
            bnia j = bnic.m109500j();
            if (str6 != null) {
                aucb = null;
            } else if (z) {
                aucb = this.f29480e.mo43118a();
                j.mo67629b(aucb);
            } else {
                aucb = null;
            }
            if (str7 != null || !ccqu.m131298b()) {
                aucb2 = null;
            } else {
                aucb2 = this.f29483h.mo41763b("com.google.android.gms.car", "");
                j.mo67629b(aucb2);
            }
            bnic a2 = j.mo67751a();
            if (!a2.isEmpty()) {
                try {
                    str4 = str7;
                    try {
                        aucu.m76783a(aucu.m76779a((Collection) a2), 600, TimeUnit.MILLISECONDS);
                        if (str6 == null) {
                            if (z) {
                                str6 = m22082a((PseudonymousIdToken) aucb.mo50386d());
                                try {
                                    this.f29481f = str6;
                                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                                    e = e2;
                                    str7 = str4;
                                }
                            }
                        }
                        if (str4 == null) {
                            try {
                                if (ccqu.m131298b()) {
                                    ExperimentTokens experimentTokens = (ExperimentTokens) aucb2.mo50386d();
                                    if (experimentTokens.equals(ExperimentTokens.f82082a) || (a = req.m33478a(experimentTokens, null, false)) == null) {
                                        str5 = "";
                                    } else {
                                        str5 = Base64.encodeToString(a.mo73642k(), 11);
                                    }
                                    try {
                                        this.f29484i = str5;
                                        str7 = str5;
                                    } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                                        e = e3;
                                        str7 = str5;
                                        bnsi c3 = f29477b.mo68388c();
                                        c3.mo68437a(e);
                                        c3.mo68432a("com.google.android.gms.car.diagnostics.CrashReporterServiceImpl", "a", 268, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        c3.mo68405a("Timer exception while waiting for Zwieback and/or Experiment Ids");
                                        this.f29482g = true;
                                        stringExtra = intent2.getStringExtra("package_name");
                                        crashInfoParcel = (CrashInfoParcel) intent2.getParcelableExtra("exception");
                                        if (crashInfoParcel.f29401a == null) {
                                        }
                                        nzo = new nzo();
                                        if (!nqs.m27347a(stringExtra)) {
                                        }
                                        stringExtra2 = intent2.getStringExtra("command_history");
                                        if (stringExtra2 != null) {
                                        }
                                        carInfo = (CarInfo) sef.m35067a(intent2, "car_info", CarInfo.CREATOR);
                                        if (carInfo != null) {
                                        }
                                        stringExtra3 = intent2.getStringExtra("process_name");
                                        if (stringExtra3 != null) {
                                        }
                                        if (num != null) {
                                        }
                                        nzo.f37014a.put("hashed_zwieback", str6);
                                        nzo.f37014a.put("encryptedExperimentIdsProto", str7);
                                        bnsi b = f29477b.mo68387b();
                                        b.mo68432a("com.google.android.gms.car.diagnostics.CrashReporterServiceImpl", "a", 314, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        b.mo68420a("Reporting crash for package: %s", stringExtra);
                                        Map map = nzo.f37014a;
                                        stringExtra4 = intent2.getStringExtra("feedback_category_tag");
                                        wwv = new wwv();
                                        wwv.f51512j = stringExtra;
                                        wwv.mo29500b(crashInfo.stackTrace);
                                        wwv.mo29499a(crashInfo.exceptionClassName);
                                        wwv.f51504i.crashInfo.exceptionMessage = crashInfo.exceptionMessage;
                                        wwv.mo29501c(crashInfo.throwClassName);
                                        wwv.mo29502d(crashInfo.throwFileName);
                                        wwv.mo29503e(crashInfo.throwMethodName);
                                        wwv.mo29498a(crashInfo.throwLineNumber);
                                        wwv.mo29495a(true);
                                        while (r0.hasNext()) {
                                        }
                                        wwv.f51498c = str;
                                        wwv.mo29496b();
                                        if (stringExtra4 == null) {
                                        }
                                        this.f29479d.mo29488b(wwv.mo29490a());
                                    }
                                }
                            } catch (InterruptedException | ExecutionException | TimeoutException e4) {
                                e = e4;
                                str7 = str4;
                                bnsi c32 = f29477b.mo68388c();
                                c32.mo68437a(e);
                                c32.mo68432a("com.google.android.gms.car.diagnostics.CrashReporterServiceImpl", "a", 268, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                c32.mo68405a("Timer exception while waiting for Zwieback and/or Experiment Ids");
                                this.f29482g = true;
                                stringExtra = intent2.getStringExtra("package_name");
                                crashInfoParcel = (CrashInfoParcel) intent2.getParcelableExtra("exception");
                                if (crashInfoParcel.f29401a == null) {
                                }
                                nzo = new nzo();
                                if (!nqs.m27347a(stringExtra)) {
                                }
                                stringExtra2 = intent2.getStringExtra("command_history");
                                if (stringExtra2 != null) {
                                }
                                carInfo = (CarInfo) sef.m35067a(intent2, "car_info", CarInfo.CREATOR);
                                if (carInfo != null) {
                                }
                                stringExtra3 = intent2.getStringExtra("process_name");
                                if (stringExtra3 != null) {
                                }
                                if (num != null) {
                                }
                                nzo.f37014a.put("hashed_zwieback", str6);
                                nzo.f37014a.put("encryptedExperimentIdsProto", str7);
                                bnsi b2 = f29477b.mo68387b();
                                b2.mo68432a("com.google.android.gms.car.diagnostics.CrashReporterServiceImpl", "a", 314, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                b2.mo68420a("Reporting crash for package: %s", stringExtra);
                                Map map2 = nzo.f37014a;
                                stringExtra4 = intent2.getStringExtra("feedback_category_tag");
                                wwv = new wwv();
                                wwv.f51512j = stringExtra;
                                wwv.mo29500b(crashInfo.stackTrace);
                                wwv.mo29499a(crashInfo.exceptionClassName);
                                wwv.f51504i.crashInfo.exceptionMessage = crashInfo.exceptionMessage;
                                wwv.mo29501c(crashInfo.throwClassName);
                                wwv.mo29502d(crashInfo.throwFileName);
                                wwv.mo29503e(crashInfo.throwMethodName);
                                wwv.mo29498a(crashInfo.throwLineNumber);
                                wwv.mo29495a(true);
                                while (r0.hasNext()) {
                                }
                                wwv.f51498c = str;
                                wwv.mo29496b();
                                if (stringExtra4 == null) {
                                }
                                this.f29479d.mo29488b(wwv.mo29490a());
                            }
                        }
                        str7 = str4;
                    } catch (InterruptedException | ExecutionException | TimeoutException e5) {
                        e = e5;
                        str7 = str4;
                        bnsi c322 = f29477b.mo68388c();
                        c322.mo68437a(e);
                        c322.mo68432a("com.google.android.gms.car.diagnostics.CrashReporterServiceImpl", "a", 268, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c322.mo68405a("Timer exception while waiting for Zwieback and/or Experiment Ids");
                        this.f29482g = true;
                        stringExtra = intent2.getStringExtra("package_name");
                        crashInfoParcel = (CrashInfoParcel) intent2.getParcelableExtra("exception");
                        if (crashInfoParcel.f29401a == null) {
                        }
                        nzo = new nzo();
                        if (!nqs.m27347a(stringExtra)) {
                        }
                        stringExtra2 = intent2.getStringExtra("command_history");
                        if (stringExtra2 != null) {
                        }
                        carInfo = (CarInfo) sef.m35067a(intent2, "car_info", CarInfo.CREATOR);
                        if (carInfo != null) {
                        }
                        stringExtra3 = intent2.getStringExtra("process_name");
                        if (stringExtra3 != null) {
                        }
                        if (num != null) {
                        }
                        nzo.f37014a.put("hashed_zwieback", str6);
                        nzo.f37014a.put("encryptedExperimentIdsProto", str7);
                        bnsi b22 = f29477b.mo68387b();
                        b22.mo68432a("com.google.android.gms.car.diagnostics.CrashReporterServiceImpl", "a", 314, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        b22.mo68420a("Reporting crash for package: %s", stringExtra);
                        Map map22 = nzo.f37014a;
                        stringExtra4 = intent2.getStringExtra("feedback_category_tag");
                        wwv = new wwv();
                        wwv.f51512j = stringExtra;
                        wwv.mo29500b(crashInfo.stackTrace);
                        wwv.mo29499a(crashInfo.exceptionClassName);
                        wwv.f51504i.crashInfo.exceptionMessage = crashInfo.exceptionMessage;
                        wwv.mo29501c(crashInfo.throwClassName);
                        wwv.mo29502d(crashInfo.throwFileName);
                        wwv.mo29503e(crashInfo.throwMethodName);
                        wwv.mo29498a(crashInfo.throwLineNumber);
                        wwv.mo29495a(true);
                        while (r0.hasNext()) {
                        }
                        wwv.f51498c = str;
                        wwv.mo29496b();
                        if (stringExtra4 == null) {
                        }
                        this.f29479d.mo29488b(wwv.mo29490a());
                    }
                } catch (InterruptedException | ExecutionException | TimeoutException e6) {
                    e = e6;
                    str4 = str7;
                    str7 = str4;
                    bnsi c3222 = f29477b.mo68388c();
                    c3222.mo68437a(e);
                    c3222.mo68432a("com.google.android.gms.car.diagnostics.CrashReporterServiceImpl", "a", 268, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c3222.mo68405a("Timer exception while waiting for Zwieback and/or Experiment Ids");
                    this.f29482g = true;
                    stringExtra = intent2.getStringExtra("package_name");
                    crashInfoParcel = (CrashInfoParcel) intent2.getParcelableExtra("exception");
                    if (crashInfoParcel.f29401a == null) {
                    }
                    nzo = new nzo();
                    if (!nqs.m27347a(stringExtra)) {
                    }
                    stringExtra2 = intent2.getStringExtra("command_history");
                    if (stringExtra2 != null) {
                    }
                    carInfo = (CarInfo) sef.m35067a(intent2, "car_info", CarInfo.CREATOR);
                    if (carInfo != null) {
                    }
                    stringExtra3 = intent2.getStringExtra("process_name");
                    if (stringExtra3 != null) {
                    }
                    if (num != null) {
                    }
                    nzo.f37014a.put("hashed_zwieback", str6);
                    nzo.f37014a.put("encryptedExperimentIdsProto", str7);
                    bnsi b222 = f29477b.mo68387b();
                    b222.mo68432a("com.google.android.gms.car.diagnostics.CrashReporterServiceImpl", "a", 314, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b222.mo68420a("Reporting crash for package: %s", stringExtra);
                    Map map222 = nzo.f37014a;
                    stringExtra4 = intent2.getStringExtra("feedback_category_tag");
                    wwv = new wwv();
                    wwv.f51512j = stringExtra;
                    wwv.mo29500b(crashInfo.stackTrace);
                    wwv.mo29499a(crashInfo.exceptionClassName);
                    wwv.f51504i.crashInfo.exceptionMessage = crashInfo.exceptionMessage;
                    wwv.mo29501c(crashInfo.throwClassName);
                    wwv.mo29502d(crashInfo.throwFileName);
                    wwv.mo29503e(crashInfo.throwMethodName);
                    wwv.mo29498a(crashInfo.throwLineNumber);
                    wwv.mo29495a(true);
                    while (r0.hasNext()) {
                    }
                    wwv.f51498c = str;
                    wwv.mo29496b();
                    if (stringExtra4 == null) {
                    }
                    this.f29479d.mo29488b(wwv.mo29490a());
                }
            }
            this.f29482g = true;
            stringExtra = intent2.getStringExtra("package_name");
            crashInfoParcel = (CrashInfoParcel) intent2.getParcelableExtra("exception");
            if (crashInfoParcel.f29401a == null) {
                long nextLong = this.f29485j.nextLong();
                StringBuilder sb = new StringBuilder(46);
                sb.append("Crash with no stack trace ");
                sb.append(nextLong);
                String sb2 = sb.toString();
                crashInfo = f29476a;
                str = sb2;
            } else {
                long nextLong2 = this.f29485j.nextLong();
                StringBuilder sb3 = new StringBuilder(26);
                sb3.append("Crash ");
                sb3.append(nextLong2);
                str = sb3.toString();
                crashInfo = crashInfoParcel.f29401a;
            }
            nzo = new nzo();
            if (!nqs.m27347a(stringExtra)) {
                try {
                    str3 = "";
                    try {
                        PackageInfo packageInfo = getPackageManager().getPackageInfo(npe.m27161b(getApplicationContext()), 0);
                        i = packageInfo.versionCode;
                        try {
                            str2 = packageInfo.versionName;
                        } catch (PackageManager.NameNotFoundException | IllegalStateException | SecurityException e7) {
                            e = e7;
                        }
                    } catch (PackageManager.NameNotFoundException | IllegalStateException | SecurityException e8) {
                        e = e8;
                        i = 0;
                        bnsi c4 = f29477b.mo68388c();
                        c4.mo68437a(e);
                        c4.mo68432a("com.google.android.gms.car.diagnostics.CrashReporterServiceImpl", "a", 385, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c4.mo68405a("Cannot get package info for Gearhead package");
                        str2 = str3;
                        nzo.f37014a.put("gearhead_version", Integer.toString(i));
                        nzo.f37014a.put("gearhead_version_name", str2);
                        stringExtra2 = intent2.getStringExtra("command_history");
                        if (stringExtra2 != null) {
                        }
                        carInfo = (CarInfo) sef.m35067a(intent2, "car_info", CarInfo.CREATOR);
                        if (carInfo != null) {
                        }
                        stringExtra3 = intent2.getStringExtra("process_name");
                        if (stringExtra3 != null) {
                        }
                        if (num != null) {
                        }
                        nzo.f37014a.put("hashed_zwieback", str6);
                        nzo.f37014a.put("encryptedExperimentIdsProto", str7);
                        bnsi b2222 = f29477b.mo68387b();
                        b2222.mo68432a("com.google.android.gms.car.diagnostics.CrashReporterServiceImpl", "a", 314, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        b2222.mo68420a("Reporting crash for package: %s", stringExtra);
                        Map map2222 = nzo.f37014a;
                        stringExtra4 = intent2.getStringExtra("feedback_category_tag");
                        wwv = new wwv();
                        wwv.f51512j = stringExtra;
                        wwv.mo29500b(crashInfo.stackTrace);
                        wwv.mo29499a(crashInfo.exceptionClassName);
                        wwv.f51504i.crashInfo.exceptionMessage = crashInfo.exceptionMessage;
                        wwv.mo29501c(crashInfo.throwClassName);
                        wwv.mo29502d(crashInfo.throwFileName);
                        wwv.mo29503e(crashInfo.throwMethodName);
                        wwv.mo29498a(crashInfo.throwLineNumber);
                        wwv.mo29495a(true);
                        while (r0.hasNext()) {
                        }
                        wwv.f51498c = str;
                        wwv.mo29496b();
                        if (stringExtra4 == null) {
                        }
                        this.f29479d.mo29488b(wwv.mo29490a());
                    }
                } catch (PackageManager.NameNotFoundException | IllegalStateException | SecurityException e9) {
                    e = e9;
                    str3 = "";
                    i = 0;
                    bnsi c42 = f29477b.mo68388c();
                    c42.mo68437a(e);
                    c42.mo68432a("com.google.android.gms.car.diagnostics.CrashReporterServiceImpl", "a", 385, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c42.mo68405a("Cannot get package info for Gearhead package");
                    str2 = str3;
                    nzo.f37014a.put("gearhead_version", Integer.toString(i));
                    nzo.f37014a.put("gearhead_version_name", str2);
                    stringExtra2 = intent2.getStringExtra("command_history");
                    if (stringExtra2 != null) {
                    }
                    carInfo = (CarInfo) sef.m35067a(intent2, "car_info", CarInfo.CREATOR);
                    if (carInfo != null) {
                    }
                    stringExtra3 = intent2.getStringExtra("process_name");
                    if (stringExtra3 != null) {
                    }
                    if (num != null) {
                    }
                    nzo.f37014a.put("hashed_zwieback", str6);
                    nzo.f37014a.put("encryptedExperimentIdsProto", str7);
                    bnsi b22222 = f29477b.mo68387b();
                    b22222.mo68432a("com.google.android.gms.car.diagnostics.CrashReporterServiceImpl", "a", 314, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b22222.mo68420a("Reporting crash for package: %s", stringExtra);
                    Map map22222 = nzo.f37014a;
                    stringExtra4 = intent2.getStringExtra("feedback_category_tag");
                    wwv = new wwv();
                    wwv.f51512j = stringExtra;
                    wwv.mo29500b(crashInfo.stackTrace);
                    wwv.mo29499a(crashInfo.exceptionClassName);
                    wwv.f51504i.crashInfo.exceptionMessage = crashInfo.exceptionMessage;
                    wwv.mo29501c(crashInfo.throwClassName);
                    wwv.mo29502d(crashInfo.throwFileName);
                    wwv.mo29503e(crashInfo.throwMethodName);
                    wwv.mo29498a(crashInfo.throwLineNumber);
                    wwv.mo29495a(true);
                    while (r0.hasNext()) {
                    }
                    wwv.f51498c = str;
                    wwv.mo29496b();
                    if (stringExtra4 == null) {
                    }
                    this.f29479d.mo29488b(wwv.mo29490a());
                }
                nzo.f37014a.put("gearhead_version", Integer.toString(i));
                nzo.f37014a.put("gearhead_version_name", str2);
            }
            stringExtra2 = intent2.getStringExtra("command_history");
            if (stringExtra2 != null) {
                nzo.f37014a.put("car_service_command_log", stringExtra2);
            }
            carInfo = (CarInfo) sef.m35067a(intent2, "car_info", CarInfo.CREATOR);
            if (carInfo != null) {
                nzo.f37014a.put("car_manufacturer", carInfo.f29332a);
                nzo.f37014a.put("car_model", carInfo.f29333b);
                nzo.f37014a.put("car_model_year", carInfo.f29334c);
                nzo.f37014a.put("car_gal_major", Integer.toString(carInfo.f29336e));
                nzo.f37014a.put("car_gal_minor", Integer.toString(carInfo.f29337f));
                nzo.f37014a.put("car_hu_make", carInfo.f29340i);
                nzo.f37014a.put("car_hu_model", carInfo.f29341j);
                nzo.f37014a.put("car_hu_sw_build", carInfo.f29342k);
                nzo.f37014a.put("car_hu_sw_version", carInfo.f29343l);
            }
            stringExtra3 = intent2.getStringExtra("process_name");
            if (stringExtra3 != null) {
                nzo.f37014a.put("process_name", stringExtra3);
            }
            if (num != null) {
                nzo.f37014a.put("oom_adj", String.valueOf(num));
            }
            if (!(str6 == null || str6 == null)) {
                nzo.f37014a.put("hashed_zwieback", str6);
            }
            if (!bmxx.m108577a(str7) && str7 != null) {
                nzo.f37014a.put("encryptedExperimentIdsProto", str7);
            }
            try {
                bnsi b222222 = f29477b.mo68387b();
                b222222.mo68432a("com.google.android.gms.car.diagnostics.CrashReporterServiceImpl", "a", 314, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b222222.mo68420a("Reporting crash for package: %s", stringExtra);
                Map map222222 = nzo.f37014a;
                stringExtra4 = intent2.getStringExtra("feedback_category_tag");
                wwv = new wwv();
                wwv.f51512j = stringExtra;
                wwv.mo29500b(crashInfo.stackTrace);
                wwv.mo29499a(crashInfo.exceptionClassName);
                wwv.f51504i.crashInfo.exceptionMessage = crashInfo.exceptionMessage;
                wwv.mo29501c(crashInfo.throwClassName);
                wwv.mo29502d(crashInfo.throwFileName);
                wwv.mo29503e(crashInfo.throwMethodName);
                wwv.mo29498a(crashInfo.throwLineNumber);
                wwv.mo29495a(true);
                for (Map.Entry entry : map222222.entrySet()) {
                    wwv.f51497b.putString((String) entry.getKey(), (String) entry.getValue());
                }
                wwv.f51498c = str;
                wwv.mo29496b();
                if (stringExtra4 == null) {
                    wwv.f51499d = String.valueOf(stringExtra).concat(".SILENT_CRASH_REPORT");
                } else {
                    wwv.f51499d = stringExtra4;
                }
                try {
                    this.f29479d.mo29488b(wwv.mo29490a());
                } catch (NullPointerException e10) {
                    e = e10;
                    bnsi b3 = f29477b.mo68387b();
                    b3.mo68437a(e);
                    b3.mo68432a("com.google.android.gms.car.diagnostics.CrashReporterServiceImpl", "a", 322, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b3.mo68405a("Unable to create FeedbackOptions.");
                }
            } catch (NullPointerException e11) {
                e = e11;
                bnsi b32 = f29477b.mo68387b();
                b32.mo68437a(e);
                b32.mo68432a("com.google.android.gms.car.diagnostics.CrashReporterServiceImpl", "a", 322, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b32.mo68405a("Unable to create FeedbackOptions.");
            }
        }
    }
}
