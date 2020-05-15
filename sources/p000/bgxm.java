package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.BuildConfig;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.ulr.ApiSettings;
import java.io.IOException;
import java.util.Formatter;
import java.util.concurrent.TimeUnit;

/* renamed from: bgxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgxm {

    /* renamed from: b */
    private static final Object f117922b = new Object();

    /* renamed from: a */
    public final Context f117923a;

    /* renamed from: c */
    private final bgye f117924c;

    /* renamed from: d */
    private final bgwx f117925d;

    /* renamed from: e */
    private final bgyc f117926e;

    /* renamed from: f */
    private final bgxk f117927f;

    private bgxm(Context context, bgye bgye, bgwx bgwx, bgyc bgyc, bgxk bgxk) {
        this.f117923a = context;
        this.f117924c = bgye;
        this.f117925d = bgwx;
        this.f117926e = bgyc;
        this.f117927f = bgxk;
    }

    /* renamed from: a */
    public static Intent m100243a(Context context, String str, Account account, Boolean bool, Boolean bool2, Boolean bool3, String str2) {
        Intent a = bgxx.m100271a(context, "com.google.android.location.reporting.ACTION_INSISTENT_SYNC");
        a.putExtra("label", str);
        a.putExtra("account", account);
        a.putExtra("ulrRelatedSettingChange", bool3);
        if (bool != null) {
            a.putExtra("reportingEnabled", bool);
        }
        if (bool2 != null) {
            a.putExtra("historyEnabled", bool2);
        }
        if (str2 != null) {
            a.putExtra("auditToken", str2);
        }
        return a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: bgwx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: bgwx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: bgwx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: bgwx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: bgwx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: bgwx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: bgwx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v2, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v5, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v6, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: bgwx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v7, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v8, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: bgwx} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgwd.a(java.lang.String, boolean):bxvd
     arg types: [java.lang.String, int]
     candidates:
      bgwd.a(android.content.Context, android.accounts.Account):com.google.android.gms.common.internal.ClientContext
      bgwd.a(java.lang.String, boolean):bxvd */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgwx.a(android.accounts.Account, boolean):void
     arg types: [android.accounts.Account, int]
     candidates:
      bgwx.a(bgwb, long):boolean
      bgwx.a(android.accounts.Account, java.lang.String):void
      bgwx.a(android.accounts.Account, boolean):void */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x079f, code lost:
        p000.bguv.m100049a(r7.f117924c.mo63354a().mo70930d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x07ad, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0320 A[Catch:{ gid -> 0x032e, VolleyError -> 0x0313, all -> 0x030e, all -> 0x0341 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0325 A[Catch:{ gid -> 0x032e, VolleyError -> 0x0313, all -> 0x030e, all -> 0x0341 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0338 A[Catch:{ gid -> 0x032e, VolleyError -> 0x0313, all -> 0x030e, all -> 0x0341 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x033d A[Catch:{ gid -> 0x032e, VolleyError -> 0x0313, all -> 0x030e, all -> 0x0341 }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0598 A[Catch:{ gid -> 0x05a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x059d A[Catch:{ gid -> 0x05a1 }] */
    /* renamed from: b */
    public final boolean mo63327b(Account account, Boolean bool, Boolean bool2, boolean z, String str) {
        bgxm bgxm;
        gid gid;
        bgwx bgwx;
        bgyr bgyr;
        AccountConfig accountConfig;
        bgwb bgwb;
        String str2;
        bgyr bgyr2;
        Throwable th;
        String str3;
        Account account2;
        AccountConfig a = this.f117924c.mo63353a(account);
        if (!a.mo70911f() && !z) {
            String valueOf = String.valueOf(a.mo70908d());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Ineligible, skipping sync: ");
            sb.append(valueOf);
            sb.toString();
            return false;
        }
        String valueOf2 = String.valueOf(aeqm.m52397a(account));
        if (valueOf2.length() == 0) {
            new String("GCore ULR sync started for account ");
        } else {
            "GCore ULR sync started for account ".concat(valueOf2);
        }
        synchronized (f117922b) {
            try {
                if (!a.f150891b) {
                    account2 = a.f150890a;
                    this.f117926e.mo63352a(account2, 2);
                    bgwa a2 = bgwb.m100149a();
                    a2.f117783a = null;
                    a2.f117784b = false;
                    a2.f117786d = null;
                    a2.f117787e = "com.google.android.gms+new-device-tag";
                    a2.f117785c = "com.google.android.gms+new-device-tag";
                    bgwb a3 = this.f117925d.mo63297a(account2, a2.mo63271a(), "syncNotDefinedYet", null);
                    bguv.m100046a("UlrSyncNewAccount", a3);
                    boolean equals = Boolean.TRUE.equals(a3.f117794b);
                    boolean equals2 = Boolean.TRUE.equals(a3.f117796d);
                    bgyr a4 = m100245a(a, "com.google.android.gms+new-account+sync");
                    a4.mo63435a(a3);
                    a4.f118099g = false;
                    a4.f118100h = Boolean.valueOf(equals2);
                    if (equals) {
                        a4.f118099g = false;
                        a4.mo63436a(true);
                    }
                    bgys a5 = a4.mo63432a();
                    String valueOf3 = String.valueOf(a3);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 20);
                    sb2.append("syncNotDefinedYet() ");
                    sb2.append(valueOf3);
                    this.f117924c.mo63357a(sb2.toString(), a5, "sync_new_account");
                    if (equals2) {
                        bgxk bgxk = this.f117927f;
                        if (bgxk.mo63322b(account2)) {
                            bgxk.f117919b.mo63365c(account2, true);
                            bgxk.mo63325e(account2);
                        }
                    } else {
                        this.f117927f.mo63321a(account2);
                        if (chcy.m148486b()) {
                            bguv.m100043a("UlrAutoEnableEvents", 3);
                        }
                    }
                    this.f117926e.mo63352a(account2, 1);
                    bgxm = this;
                } else if (!a.f150901l) {
                    Account account3 = a.f150890a;
                    bgyr a6 = m100245a(a, "com.google.android.gms+not-dirty");
                    bgwx bgwx2 = this.f117925d;
                    int b = bgwx2.f117871a.mo63359b(account3);
                    String a7 = bgwx2.mo63298a(account3);
                    try {
                        if (!chcp.m148196e()) {
                            try {
                                bgwl bgwl = bgwx2.f117872b;
                                bgwr a8 = bgwk.m100163a(bgwl.f117827i);
                                try {
                                    bjcx bjcx = new bjcx(a8);
                                    ClientContext a9 = bgwl.m100164a(bgwl.f117827i, account3);
                                    a8.f117860m = bgwe.f117818a;
                                    Integer valueOf4 = Integer.valueOf(b);
                                    String str4 = bgwl.f117809f;
                                    String str5 = bgwl.f117807d;
                                    String str6 = bgwl.f117806c;
                                    Integer valueOf5 = Integer.valueOf(bgwl.f117828j);
                                    Boolean bool3 = bgwl.f117832n;
                                    String str7 = bgwl.f117811h;
                                    String str8 = bgwl.f117810g;
                                    Integer valueOf6 = Integer.valueOf(bgwl.f117830l);
                                    Integer valueOf7 = Integer.valueOf(bgwl.f117804a);
                                    Integer valueOf8 = Integer.valueOf(bgwl.f117829k);
                                    String str9 = bgwl.f117805b;
                                    if (chcj.m148167e()) {
                                        str3 = "android";
                                    } else {
                                        str3 = null;
                                    }
                                    String str10 = bgwl.f117808e;
                                    StringBuilder sb3 = new StringBuilder();
                                    bgyr = a6;
                                    accountConfig = a;
                                    bool2 = bgwx2;
                                    try {
                                        new Formatter(sb3).format("settings/%1$s", String.valueOf(valueOf4));
                                        if (a7 != null) {
                                            shd.m35269a(sb3, "androidGcmRegistrationId", shd.m35267a(a7));
                                        }
                                        if (str4 != null) {
                                            shd.m35269a(sb3, "brand", shd.m35267a(str4));
                                        }
                                        if (str5 != null) {
                                            shd.m35269a(sb3, "device", shd.m35267a(str5));
                                        }
                                        if (str6 != null) {
                                            shd.m35269a(sb3, "devicePrettyName", shd.m35267a(str6));
                                        }
                                        shd.m35269a(sb3, "deviceRestriction", shd.m35267a("noRestriction"));
                                        shd.m35269a(sb3, "gmsVersion", String.valueOf(valueOf5));
                                        if (bool3 != null) {
                                            shd.m35269a(sb3, "isLowRam", String.valueOf(bool3));
                                        }
                                        if (str7 != null) {
                                            shd.m35269a(sb3, "manufacturer", shd.m35267a(str7));
                                        }
                                        if (str8 != null) {
                                            shd.m35269a(sb3, "model", shd.m35267a(str8));
                                        }
                                        shd.m35269a(sb3, "moduleVersion", String.valueOf(valueOf6));
                                        shd.m35269a(sb3, "nlpVersion", String.valueOf((Object) 2023));
                                        shd.m35269a(sb3, "osLevel", String.valueOf(valueOf7));
                                        shd.m35269a(sb3, "packageVersion", String.valueOf(valueOf8));
                                        if (str9 != null) {
                                            shd.m35269a(sb3, "platform", shd.m35267a(str9));
                                        }
                                        if (str3 != null) {
                                            shd.m35269a(sb3, "platformType", shd.m35267a(str3));
                                        }
                                        if (str10 != null) {
                                            shd.m35269a(sb3, BuildConfig.FLAVOR_mode, shd.m35267a(str10));
                                        }
                                        ApiSettings apiSettings = (ApiSettings) bjcx.f122527a.mo25536a(a9, 0, sb3.toString(), (Object) null, ApiSettings.class);
                                        if (apiSettings != null) {
                                            bgux.m100106c(true);
                                            bgwb = bgwb.m100151a(account3, apiSettings);
                                            bgwx = bool2;
                                        } else {
                                            if (!chcy.m148488d()) {
                                                bgux.m100106c(false);
                                            } else {
                                                bgux.m100100b((Throwable) null);
                                            }
                                            String valueOf9 = String.valueOf(aeqm.m52397a(account3));
                                            throw new IOException(valueOf9.length() == 0 ? new String("Received null settings from server for account ") : "Received null settings from server for account ".concat(valueOf9));
                                        }
                                    } catch (gid e) {
                                        e = e;
                                        gid gid2 = e;
                                        if (chcy.m148488d()) {
                                        }
                                        throw gid2;
                                    } catch (VolleyError e2) {
                                        e = e2;
                                        VolleyError volleyError = e;
                                        bgwl.m100165a(volleyError);
                                        if (chcy.m148488d()) {
                                        }
                                        throw new IOException(volleyError);
                                    }
                                } catch (gid e3) {
                                    e = e3;
                                    gid gid22 = e;
                                    if (chcy.m148488d()) {
                                        bgux.m100106c(false);
                                    } else {
                                        bgux.m100100b(gid22);
                                    }
                                    throw gid22;
                                } catch (VolleyError e4) {
                                    e = e4;
                                    bool2 = bgwx2;
                                    VolleyError volleyError2 = e;
                                    bgwl.m100165a(volleyError2);
                                    if (chcy.m148488d()) {
                                        bgux.m100106c(false);
                                    } else {
                                        bgux.m100100b(volleyError2);
                                    }
                                    throw new IOException(volleyError2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            } catch (gid e5) {
                                gid = e5;
                                bgwx = bgwx2;
                                bgwx.mo63300a(account3, false);
                                throw gid;
                            }
                        } else {
                            accountConfig = a;
                            bgyr = a6;
                            bgwx = bgwx2;
                            try {
                                bgwd bgwd = bgwx.f117873c;
                                bvwb bvwb = (bvwb) bgwd.mo63278a(a7, true).mo74062i();
                                bxvd da = bvyd.f158138d.mo74144da();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bvyd bvyd = (bvyd) da.f164949b;
                                int i = bvyd.f158140a | 1;
                                bvyd.f158140a = i;
                                bvyd.f158141b = b;
                                bvwb.getClass();
                                bvyd.f158142c = bvwb;
                                bvyd.f158140a = i | 2;
                                bvyd bvyd2 = (bvyd) da.mo74062i();
                                try {
                                    bgux.m100097b(0);
                                    bgwz bgwz = bgwd.f117812j;
                                    ClientContext a10 = bgwd.m100154a(bgwd.f117813i, account3);
                                    if (bgwz.f117876b == null) {
                                        bgwz.f117876b = chtv.m149566a(chtu.UNARY, "userlocation.UserLocationReportingService/GetApiSettings", ciie.m150370a(bvyd.f158138d), ciie.m150370a(bvyc.f158134c));
                                    }
                                    bvyc bvyc = (bvyc) bgwz.f117882a.mo25553a(bgwz.f117876b, a10, bvyd2, 10000, TimeUnit.MILLISECONDS);
                                    if ((bvyc.f158136a & 1) != 0) {
                                        bgux.m100106c(true);
                                        bvxn bvxn = bvyc.f158137b;
                                        if (bvxn == null) {
                                            bvxn = bvxn.f158064j;
                                        }
                                        bgwb = bgwb.m100150a(account3, bvxn);
                                    } else {
                                        try {
                                            if (!chcy.m148488d()) {
                                                bgux.m100106c(false);
                                            } else {
                                                bgux.m100100b((Throwable) null);
                                            }
                                            String valueOf10 = String.valueOf(aeqm.m52397a(account3));
                                            throw new IOException(valueOf10.length() == 0 ? new String("Received null settings from server for account ") : "Received null settings from server for account ".concat(valueOf10));
                                        } catch (chuw | gid e6) {
                                            e = e6;
                                            th = e;
                                            try {
                                                if (chcy.m148488d()) {
                                                    bgux.m100106c(false);
                                                } else {
                                                    bgux.m100100b(th);
                                                }
                                                throw th;
                                            } catch (gid e7) {
                                                e = e7;
                                                gid = e;
                                                bgwx.mo63300a(account3, false);
                                                throw gid;
                                            }
                                        }
                                    }
                                } catch (chuw | gid e8) {
                                    e = e8;
                                    th = e;
                                    if (chcy.m148488d()) {
                                    }
                                    throw th;
                                }
                            } catch (gid e9) {
                                e = e9;
                                gid = e;
                                bgwx.mo63300a(account3, false);
                                throw gid;
                            }
                        }
                        if (bgwx.m100191b(bgwb)) {
                            bgwx.mo63299a(account3, a7);
                            bgwx.mo63301a(bgwb);
                        }
                        bgwx.mo63300a(account3, true);
                    } catch (gid e10) {
                        e = e10;
                        bgwx = bgwx2;
                        gid = e;
                        bgwx.mo63300a(account3, false);
                        throw gid;
                    }
                    try {
                        bguv.m100046a("UlrSyncNotDirty", bgwb);
                        Long l = bgwb.f117793a;
                        if (l != null) {
                            long longValue = l.longValue();
                            AccountConfig accountConfig2 = accountConfig;
                            if (longValue < accountConfig2.f150898i) {
                                String a11 = aeqm.m52397a(account3);
                                String valueOf11 = String.valueOf(bgwb);
                                long j = accountConfig2.f150898i;
                                StringBuilder sb4 = new StringBuilder(String.valueOf(a11).length() + 80 + String.valueOf(valueOf11).length());
                                sb4.append("sync() rejecting stale server values for account ");
                                sb4.append(a11);
                                sb4.append(": ");
                                sb4.append(valueOf11);
                                sb4.append("; local: ");
                                sb4.append(j);
                                bgur.m100011a("GCoreUlr", sb4.toString());
                                bgxm = this;
                            }
                        }
                        int i2 = bgwb.f117799g;
                        if (i2 != 1) {
                            if (i2 != 3) {
                                bgxm = this;
                                bgyr2 = bgyr;
                            } else if (bgwb.f117800h != 2) {
                                bgxm = this;
                                bgyr2 = bgyr;
                            }
                            String a12 = aeqm.m52397a(account3);
                            String valueOf12 = String.valueOf(bgwb);
                            StringBuilder sb5 = new StringBuilder(String.valueOf(a12).length() + 38 + String.valueOf(valueOf12).length());
                            sb5.append("Accepting server values for account ");
                            sb5.append(a12);
                            sb5.append(": ");
                            sb5.append(valueOf12);
                            sb5.toString();
                            bgyr2.mo63435a(bgwb);
                            bgys a13 = bgyr2.mo63432a();
                            String valueOf13 = String.valueOf(bgwb);
                            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf13).length() + 19);
                            sb6.append("sync() server wins ");
                            sb6.append(valueOf13);
                            bgxm.f117924c.mo63357a(sb6.toString(), a13, "sync_server_wins");
                            bgxm.f117927f.mo63321a(account3);
                            if (chcy.m148486b()) {
                                bguv.m100043a("UlrAutoEnableEvents", 4);
                            }
                        }
                        bgyr.mo63436a(true);
                        bgys a14 = bgyr.mo63432a();
                        String valueOf14 = String.valueOf(bgwb);
                        StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf14).length() + 76);
                        sb7.append("sync() server returned empty or device tag unknown ");
                        sb7.append(valueOf14);
                        sb7.append(", will try uploading ours");
                        String sb8 = sb7.toString();
                        if (bgwb.f117799g != 1) {
                            str2 = "sync_unknown_device_tag";
                        } else {
                            str2 = "sync_source_no_data";
                        }
                        bgxm = this;
                        try {
                            bgxm.f117924c.mo63357a(sb8, a14, str2);
                            String valueOf15 = String.valueOf(bgwb);
                            String a15 = aeqm.m52397a(account3);
                            StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf15).length() + 72 + String.valueOf(a15).length());
                            sb9.append("sync() server returned empty or device tag unknown ");
                            sb9.append(valueOf15);
                            sb9.append(" for ");
                            sb9.append(a15);
                            sb9.append(", will send ours");
                            bgur.m100011a("GCoreUlr", sb9.toString());
                        } catch (Throwable th3) {
                            th = th3;
                            Throwable th4 = th;
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        Throwable th42 = th;
                        throw th42;
                    }
                } else {
                    bgxm = this;
                    AccountConfig accountConfig3 = a;
                    Account account4 = accountConfig3.f150890a;
                    bgxm.f117927f.mo63321a(account4);
                    if (chcy.m148486b()) {
                        bguv.m100043a("UlrAutoEnableEvents", 5);
                    }
                    bgwa a16 = bgwb.m100149a();
                    a16.f117783a = Long.valueOf(accountConfig3.f150898i);
                    a16.f117784b = Boolean.valueOf(accountConfig3.f150894e);
                    a16.f117785c = accountConfig3.f150895f;
                    a16.f117786d = Boolean.valueOf(accountConfig3.f150896g);
                    a16.f117787e = accountConfig3.f150897h;
                    bgwb a17 = a16.mo63271a();
                    bgwb a18 = bgxm.f117925d.mo63297a(account4, a17, "syncDirty", str);
                    bguv.m100046a("UlrSyncDirty", a18);
                    if (a18.f117799g != 3) {
                        String a19 = aeqm.m52397a(account4);
                        String valueOf16 = String.valueOf(a17);
                        String valueOf17 = String.valueOf(a18);
                        StringBuilder sb10 = new StringBuilder(String.valueOf(a19).length() + 48 + String.valueOf(valueOf16).length() + String.valueOf(valueOf17).length());
                        sb10.append("Successfully uploaded changes for account ");
                        sb10.append(a19);
                        sb10.append(": ");
                        sb10.append(valueOf16);
                        sb10.append(" -> ");
                        sb10.append(valueOf17);
                        sb10.toString();
                        bgyr a20 = m100245a(accountConfig3, (String) null);
                        a20.mo63435a(a18);
                        a20.f118102j = true;
                        a20.mo63436a(false);
                        bgys a21 = a20.mo63432a();
                        String valueOf18 = String.valueOf(a18);
                        StringBuilder sb11 = new StringBuilder(String.valueOf(valueOf18).length() + 18);
                        sb11.append("sync() local wins ");
                        sb11.append(valueOf18);
                        bgxm.f117924c.mo63357a(sb11.toString(), a21, "sync_local_wins");
                    }
                    String a22 = aeqm.m52397a(account4);
                    String valueOf19 = String.valueOf(a17);
                    String valueOf20 = String.valueOf(a18);
                    StringBuilder sb12 = new StringBuilder(String.valueOf(a22).length() + 35 + String.valueOf(valueOf19).length() + String.valueOf(valueOf20).length());
                    sb12.append("Concurrent updates for account ");
                    sb12.append(a22);
                    sb12.append(": ");
                    sb12.append(valueOf19);
                    sb12.append("; ");
                    sb12.append(valueOf20);
                    sb12.toString();
                    bgyr a23 = m100245a(accountConfig3, "com.google.android.gms+ambiguous");
                    if (m100248a("reporting", a18.f117794b, accountConfig3.f150894e, bool)) {
                        String valueOf21 = String.valueOf(a18);
                        String valueOf22 = String.valueOf(accountConfig3);
                        StringBuilder sb13 = new StringBuilder(String.valueOf(valueOf21).length() + 44 + String.valueOf(valueOf22).length());
                        sb13.append("Ambiguating LR due to conflict between ");
                        sb13.append(valueOf21);
                        sb13.append(" and ");
                        sb13.append(valueOf22);
                        bgur.m100025c("GCoreUlr", sb13.toString());
                        a23.f118099g = false;
                    }
                    if (m100248a("history", a18.f117796d, accountConfig3.f150896g, bool2)) {
                        String valueOf23 = String.valueOf(a18);
                        String valueOf24 = String.valueOf(accountConfig3);
                        StringBuilder sb14 = new StringBuilder(String.valueOf(valueOf23).length() + 44 + String.valueOf(valueOf24).length());
                        sb14.append("Ambiguating LH due to conflict between ");
                        sb14.append(valueOf23);
                        sb14.append(" and ");
                        sb14.append(valueOf24);
                        bgur.m100025c("GCoreUlr", sb14.toString());
                        a23.f118100h = false;
                    }
                    a23.f118103k = a18.f117793a;
                    a23.mo63433a(a18.f117798f);
                    a23.mo63436a(true);
                    String valueOf25 = String.valueOf(a18);
                    StringBuilder sb15 = new StringBuilder(String.valueOf(valueOf25).length() + 18);
                    sb15.append("sync() concurrent ");
                    sb15.append(valueOf25);
                    bgxm.f117924c.mo63357a(sb15.toString(), a23.mo63432a(), "sync_concurrent");
                }
            } catch (IOException e11) {
                IOException iOException = e11;
                String valueOf26 = String.valueOf(iOException);
                StringBuilder sb16 = new StringBuilder(String.valueOf(valueOf26).length() + 45);
                sb16.append("syncNotDefinedYet() can't get server values: ");
                sb16.append(valueOf26);
                bgur.m100025c("GCoreUlr", sb16.toString());
                this.f117926e.mo63352a(account2, !ssk.m36235a(this.f117923a) ? 3 : 4);
                throw iOException;
            } catch (gid e12) {
                gid gid3 = e12;
                String valueOf27 = String.valueOf(gid3);
                StringBuilder sb17 = new StringBuilder(String.valueOf(valueOf27).length() + 36);
                sb17.append("syncNotDefinedYet() auth exception: ");
                sb17.append(valueOf27);
                bgur.m100025c("GCoreUlr", sb17.toString());
                this.f117926e.mo63352a(account2, 5);
                throw gid3;
            } catch (Throwable th6) {
                th = th6;
                Throwable th422 = th;
                throw th422;
            }
        }
    }

    /* renamed from: a */
    public static bgxm m100244a(Context context) {
        bgzo.m100459a(context);
        bgye a = bgye.m100307a(context);
        return new bgxm(context, a, bgwx.m100189a(context), new bgyc(context), bgxk.m100235a(context, a));
    }

    /* renamed from: a */
    private static final bgyr m100245a(AccountConfig accountConfig, String str) {
        Account account = accountConfig.f150890a;
        long j = accountConfig.f150892c;
        bgyr a = bgys.m100417a(account, str);
        a.f118098f = true;
        a.mo63434a(j);
        return a;
    }

    /* renamed from: a */
    static Boolean m100246a(Intent intent, String str) {
        if (intent.hasExtra(str)) {
            return Boolean.valueOf(intent.getBooleanExtra(str, false));
        }
        return null;
    }

    /* renamed from: a */
    public static void m100247a(Context context, String str, Account account) {
        String a = aeqm.m52397a(account);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 22 + str.length());
        sb.append("Requesting sync for ");
        sb.append(a);
        sb.append(": ");
        sb.append(str);
        sb.toString();
        bgzo.m100465a(context, m100243a(context, str, account, null, null, null, null));
    }

    /* renamed from: a */
    static boolean m100248a(String str, Boolean bool, boolean z, Boolean bool2) {
        if (bool == null || bool.equals(Boolean.valueOf(z))) {
            return false;
        }
        if (bool2 == null) {
            return true;
        }
        if (bool2.booleanValue() == z) {
            String valueOf = String.valueOf(bool2);
            String valueOf2 = String.valueOf(bool);
            int length = str.length();
            StringBuilder sb = new StringBuilder(length + 50 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
            sb.append("sync() insistent ");
            sb.append(str);
            sb.append(" value ");
            sb.append(valueOf);
            sb.append(" overriding server value: ");
            sb.append(valueOf2);
            bgur.m100011a("GCoreUlr", sb.toString());
            return false;
        }
        String valueOf3 = String.valueOf(bool2);
        StringBuilder sb2 = new StringBuilder(str.length() + 71 + String.valueOf(valueOf3).length());
        sb2.append("sync() ignoring insistent ");
        sb2.append(str);
        sb2.append(" value ");
        sb2.append(valueOf3);
        sb2.append(", inconsistent with local value: ");
        sb2.append(z);
        bgur.m100011a("GCoreUlr", sb2.toString());
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo63326a(Account account, Boolean bool, Boolean bool2, boolean z, String str) {
        if (mo63327b(account, bool, bool2, z, str) && this.f117924c.mo63353a(account).f150901l) {
            boolean b = mo63327b(account, bool, bool2, z, str);
            boolean z2 = this.f117924c.mo63353a(account).f150901l;
            if (b && z2) {
                bgur.m100020b("GCoreUlr", "Preference values still dirty after two sync attempts");
            }
            bguv.m100048a("UlrSyncDirtyRetry", z2);
        }
    }
}
