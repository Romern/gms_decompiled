package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.SharedPreferences;
import android.content.SyncRequest;
import android.content.SyncResult;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: amve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amve extends amva {

    /* renamed from: b */
    private static amve f75988b = null;

    /* renamed from: c */
    private final Context f75989c;

    /* renamed from: d */
    private final ContentResolver f75990d;

    /* renamed from: e */
    private final ampm f75991e;

    /* renamed from: f */
    private final amwp f75992f;

    /* renamed from: g */
    private final alsj f75993g;

    /* renamed from: h */
    private final anbv f75994h;

    /* renamed from: i */
    private amvm f75995i;

    /* renamed from: j */
    private final andd f75996j;

    /* renamed from: k */
    private Account f75997k;

    /* renamed from: l */
    private final int f75998l;

    private amve(Context context, ContentResolver contentResolver, ampm ampm, alsj alsj, amwp amwp, andd andd, int i, anbv anbv) {
        this.f75989c = context;
        this.f75990d = contentResolver;
        this.f75991e = ampm;
        this.f75993g = alsj;
        this.f75992f = amwp;
        this.f75996j = andd;
        this.f75998l = i;
        this.f75994h = anbv;
    }

    /* renamed from: a */
    public static synchronized amve m63345a(Context context, ContentResolver contentResolver, ampm ampm, alsj alsj, andd andd) {
        amve amve;
        synchronized (amve.class) {
            amve = new amve(context, contentResolver, ampm, alsj, null, andd, 3, anbv.f76601a);
        }
        return amve;
    }

    /* renamed from: b */
    private static void m63352b(Context context, String str, String str2) {
        Log.e("FSA2_ContactsSyncAdapter", str2);
        aluj.m61900a(context, "FSA2_ContactsSyncAdapter", str, (String) null, str2);
    }

    /* renamed from: a */
    private final Exception m63346a(Exception exc, SyncResult syncResult, anaz anaz, Bundle bundle, Account account) {
        amvm amvm;
        Exception exc2;
        if (!(!(exc instanceof InterruptedException) || (amvm = this.f75995i) == null || (exc2 = amvm.f76023a) == null)) {
            exc = exc2;
        }
        Log.e("FSA2_ContactsSyncAdapter", "Sync has been terminated.", exc);
        aluj.m61903a(this.f75989c, "FSA2_ContactsSyncAdapter", "Sync has been terminated.", exc);
        if ((exc instanceof RemoteException) || (exc instanceof OperationApplicationException)) {
            syncResult.stats.numParseExceptions++;
            ((anbh) anaz).f76553m = 5;
        } else if (exc instanceof amxz) {
            syncResult.stats.numIoExceptions++;
            ((anbh) anaz).f76553m = 5;
        } else if (exc instanceof gid) {
            syncResult.stats.numAuthExceptions++;
            ((anbh) anaz).f76553m = 3;
        } else if (exc instanceof chuw) {
            syncResult.stats.numIoExceptions++;
            ((anbh) anaz).f76553m = 7;
        } else if (exc instanceof amxw) {
            syncResult.stats.numIoExceptions++;
            ((anbh) anaz).f76553m = 7;
        } else if (exc instanceof amyb) {
            int i = ((amyb) exc).f76365a;
            int i2 = i - 1;
            if (i != 0) {
                switch (i2) {
                    case 0:
                        syncResult.stats.numIoExceptions++;
                        if (cfws.f185853a.mo6606a().mo82842d() && this.f75998l == 3) {
                            amwp.m63560a(bundle, account);
                        }
                        ((anbh) anaz).f76553m = 2;
                        break;
                    case 1:
                    case 2:
                    case 3:
                        ((anbh) anaz).f76553m = 7;
                        syncResult.stats.numIoExceptions++;
                        break;
                    case 4:
                        ((anbh) anaz).f76553m = 2;
                        break;
                    case 5:
                        anbh anbh = (anbh) anaz;
                        anbh.f76553m = 7;
                        anbh.f76541a.fullSyncRequested = true;
                        syncResult.stats.numIoExceptions++;
                        break;
                    case 6:
                        ((anbh) anaz).f76553m = 4;
                        syncResult.stats.numIoExceptions++;
                        break;
                    default:
                        ((anbh) anaz).f76553m = 100;
                        syncResult.stats.numIoExceptions++;
                        break;
                }
            } else {
                throw null;
            }
        } else {
            if (cfxb.f185869a.mo6606a().mo82855d() && m63351a(exc)) {
                syncResult.stats.numAuthExceptions++;
                amwp.m63560a(bundle, account);
            } else if (!cfxb.f185869a.mo6606a().mo82853b() || !m63351a(exc)) {
                syncResult.stats.numIoExceptions++;
            } else {
                syncResult.stats.numAuthExceptions++;
            }
            ((anbh) anaz).f76553m = 100;
        }
        return exc;
    }

    /* renamed from: a */
    public static synchronized void m63347a(Context context, amwp amwp, ampm ampm) {
        synchronized (amve.class) {
            if (f75988b == null) {
                ContentResolver contentResolver = context.getContentResolver();
                alsj a = alsj.m61651a(context);
                andd andd = new andd(context);
                amvd.m63344a();
                amve amve = new amve(context, contentResolver, ampm, a, amwp, andd, 2, anbv.f76601a);
                f75988b = amve;
                amwp.f76205c = amve;
            }
        }
    }

    /* renamed from: a */
    private static void m63348a(Context context, String str, String str2) {
        Log.w("FSA2_ContactsSyncAdapter", str2);
        aluj.m61900a(context, "FSA2_ContactsSyncAdapter", str, (String) null, str2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03e2, code lost:
        if (r5 == 7) goto L_0x03e4;
     */
    /* renamed from: a */
    private final void m63349a(SyncResult syncResult, anaz anaz, Account account, Bundle bundle, Exception exc) {
        String str;
        anaz anaz2 = anaz;
        Account account2 = account;
        Bundle bundle2 = bundle;
        Exception exc2 = exc;
        String str2 = account2.name;
        anbh anbh = (anbh) anaz2;
        int a = amnt.m63103a(anbh.f76553m);
        if (a != 0) {
            switch (a) {
                case 2:
                    this.f75993g.mo40682a(str2, "com.android.contacts", 2, "Sync canceled.");
                    break;
                case 3:
                    this.f75993g.mo40682a(str2, "com.android.contacts", 2, "Sync failed. Auth error.");
                    break;
                case 4:
                    this.f75993g.mo40682a(str2, "com.android.contacts", 2, "Sync failed. Network error.");
                    break;
                case 5:
                    this.f75993g.mo40682a(str2, "com.android.contacts", 2, "Sync failed. Contacts error.");
                    break;
                case 6:
                default:
                    this.f75993g.mo40682a(str2, "com.android.contacts", 2, "Sync failed. Reason unknown");
                    break;
                case 7:
                    this.f75993g.mo40682a(str2, "com.android.contacts", 2, "Sync failed. Grpc error.");
                    break;
                case 8:
                    this.f75993g.mo40682a(str2, "com.android.contacts", 2, "Sync completed with error.");
                    break;
                case 9:
                    this.f75993g.mo40682a(str2, "com.android.contacts", 1, "Sync succeeded.");
                    break;
                case 10:
                    alsj alsj = this.f75993g;
                    if (!m63350a(bundle)) {
                        str = "Sync skipped.";
                    } else {
                        str = "Sync initialized.";
                    }
                    alsj.mo40682a(str2, "com.android.contacts", 1, str);
                    break;
            }
            amwp amwp = this.f75992f;
            if (amwp != null) {
                synchronized (amwp.f76203a) {
                    String str3 = amwp.f76204b;
                    if (str3 != null) {
                        amwp.mo41501a(str3, "done", syncResult);
                        amwp.f76206d = null;
                        amwp.f76204b = null;
                    }
                }
            }
            amvm amvm = this.f75995i;
            if (amvm != null) {
                amvm.mo41392b(Thread.currentThread());
            }
            String str4 = account2.name;
            int g = this.f75993g.mo40703g(str4);
            SharedPreferences sharedPreferences = this.f75993g.f74200a;
            String valueOf = String.valueOf(str4);
            int i = sharedPreferences.getInt(valueOf.length() == 0 ? new String("focus_sync_same_failures_") : "focus_sync_same_failures_".concat(valueOf), 0);
            int i2 = anbh.f76553m;
            if (i2 == 9) {
                g = 0;
                i = 0;
            } else if (i2 != 10) {
                if (g < Integer.MAX_VALUE) {
                    g++;
                }
                SharedPreferences sharedPreferences2 = this.f75993g.f74200a;
                String valueOf2 = String.valueOf(str4);
                if (sharedPreferences2.getInt(valueOf2.length() == 0 ? new String("focus_sync_failure_reason_") : "focus_sync_failure_reason_".concat(valueOf2), 0) != anbh.f76553m) {
                    i = 0;
                }
                if (i < Integer.MAX_VALUE) {
                    i++;
                }
            }
            alsj alsj2 = this.f75993g;
            int i3 = anbh.f76553m;
            sdo.m34973b((String) null);
            SharedPreferences.Editor edit = alsj2.f74200a.edit();
            String valueOf3 = String.valueOf(str4);
            edit.putInt(valueOf3.length() == 0 ? new String("focus_sync_failure_reason_") : "focus_sync_failure_reason_".concat(valueOf3), i3).commit();
            alsj alsj3 = this.f75993g;
            sdo.m34973b((String) null);
            SharedPreferences.Editor edit2 = alsj3.f74200a.edit();
            String valueOf4 = String.valueOf(str4);
            edit2.putInt(valueOf4.length() == 0 ? new String("focus_sync_failures_") : "focus_sync_failures_".concat(valueOf4), g).commit();
            alsj alsj4 = this.f75993g;
            sdo.m34973b((String) null);
            SharedPreferences.Editor edit3 = alsj4.f74200a.edit();
            String valueOf5 = String.valueOf(str4);
            edit3.putInt(valueOf5.length() == 0 ? new String("focus_sync_same_failures_") : "focus_sync_same_failures_".concat(valueOf5), i).commit();
            anbh.f76550j = g;
            anbh.f76551k = i;
            anap anap = new anap(this.f75993g, account2.name);
            int b = anbj.m63921b(bundle);
            int i4 = anbh.f76553m;
            boolean z = anbh.f76560t;
            amig.m62939a();
            if (b != 4) {
                if (anap.f76498a.mo40685a(anap.f76499b)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    alsj alsj5 = anap.f76498a;
                    String str5 = anap.f76499b;
                    SharedPreferences sharedPreferences3 = alsj5.f74200a;
                    String valueOf6 = String.valueOf(str5);
                    if (currentTimeMillis - sharedPreferences3.getLong(valueOf6.length() == 0 ? new String("focus_timestamp_of_page_size_change_") : "focus_timestamp_of_page_size_change_".concat(valueOf6), 0) > Long.valueOf(cfvk.f185780a.mo6606a().mo83007bh()).longValue() * 1000) {
                        anap.mo41602a(false, currentTimeMillis);
                    }
                }
                boolean b2 = cfvl.m143183b();
                if (i4 != 2) {
                    anap.f76498a.mo40690b(anap.f76499b);
                    if (b2 && (i4 == 9 || i4 == 8)) {
                        anap.f76498a.mo40698d(anap.f76499b);
                    }
                } else {
                    alsj alsj6 = anap.f76498a;
                    String str6 = anap.f76499b;
                    sdo.m34973b((String) null);
                    String valueOf7 = String.valueOf(str6);
                    String str7 = valueOf7.length() == 0 ? new String("focus_continuous_cancel_count_since_page_size_change_") : "focus_continuous_cancel_count_since_page_size_change_".concat(valueOf7);
                    alsj6.f74200a.edit().putInt(str7, alsj6.f74200a.getInt(str7, 0) + 1).commit();
                    if (b2) {
                        alsj alsj7 = anap.f76498a;
                        String str8 = anap.f76499b;
                        sdo.m34973b((String) null);
                        String valueOf8 = String.valueOf(str8);
                        String str9 = valueOf8.length() == 0 ? new String("focus_total_cancel_count_since_page_size_change_or_success_") : "focus_total_cancel_count_since_page_size_change_or_success_".concat(valueOf8);
                        alsj7.f74200a.edit().putInt(str9, alsj7.f74200a.getInt(str9, 0) + 1).commit();
                    }
                    boolean a2 = anap.f76498a.mo40685a(anap.f76499b);
                    alsj alsj8 = anap.f76498a;
                    String str10 = anap.f76499b;
                    SharedPreferences sharedPreferences4 = alsj8.f74200a;
                    String valueOf9 = String.valueOf(str10);
                    int i5 = sharedPreferences4.getInt(valueOf9.length() == 0 ? new String("focus_continuous_cancel_count_since_page_size_change_") : "focus_continuous_cancel_count_since_page_size_change_".concat(valueOf9), 0);
                    if (a2) {
                        if (b2 && cfvl.m143184c()) {
                            long c = (long) anap.f76498a.mo40694c(anap.f76499b);
                            if (c >= cfvl.f185782a.mo6606a().mo82784f()) {
                                anap.mo41602a(false, System.currentTimeMillis());
                            }
                            if (c >= cfvl.f185782a.mo6606a().mo82785g() && z) {
                                anap.mo41602a(false, System.currentTimeMillis());
                            }
                        } else {
                            if (i5 >= Integer.valueOf((int) cfvk.f185780a.mo6606a().mo83034k()).intValue()) {
                                anap.mo41602a(false, System.currentTimeMillis());
                            }
                            if (((long) i5) >= cfvl.f185782a.mo6606a().mo82781c() && z) {
                                anap.mo41602a(false, System.currentTimeMillis());
                            }
                        }
                    } else if (b2 && cfvl.m143184c()) {
                        long c2 = (long) anap.f76498a.mo40694c(anap.f76499b);
                        if (c2 >= cfvl.f185782a.mo6606a().mo82782d()) {
                            anap.mo41602a(true, System.currentTimeMillis());
                        }
                        if (c2 >= cfvl.f185782a.mo6606a().mo82783e() && z) {
                            anap.mo41602a(true, System.currentTimeMillis());
                        }
                    } else {
                        if (i5 >= Integer.valueOf((int) cfvk.f185780a.mo6606a().mo83033j()).intValue()) {
                            anap.mo41602a(true, System.currentTimeMillis());
                        }
                        if (((long) i5) >= cfvl.f185782a.mo6606a().mo82780b() && z) {
                            anap.mo41602a(true, System.currentTimeMillis());
                        }
                    }
                }
            }
            if (exc2 != null) {
                int a3 = amnt.m63103a(anbh.f76553m);
                long j = (long) anbh.f76551k;
                amig.m62939a();
                if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo82963aa()).booleanValue()) {
                    if (!(a3 == 100 || a3 == 5)) {
                        amig.m62939a();
                        if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo83009bj()).booleanValue()) {
                        }
                    }
                    long longValue = Long.valueOf(cfvk.f185780a.mo6606a().mo82949aM()).longValue();
                    long max = Math.max(Long.valueOf(cfvk.f185780a.mo6606a().mo82951aO()).longValue(), 1L);
                    if (j >= longValue && (j - longValue) % max == 0) {
                        this.f75996j.mo41718a(exc2, ((Double) amhz.f74928a.mo41191a()).doubleValue());
                    }
                }
                mo41371a(account2, bundle2, anaz2, exc2);
                return;
            }
            anbg anbg = anbh.f76558r;
            mo41371a(account2, bundle2, anaz2, anbg != null ? anbg.f76537b : null);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    private static boolean m63350a(Bundle bundle) {
        return bundle != null && bundle.getBoolean("initialize", false);
    }

    /* renamed from: a */
    private static boolean m63351a(Exception exc) {
        return (exc instanceof SecurityException) && exc.getMessage() != null && exc.getMessage().contains(cfxb.f185869a.mo6606a().mo82856e());
    }

    /* renamed from: a */
    public final void mo41364a() {
        if (this.f75995i != null) {
            Account account = this.f75997k;
            if (cfyk.f186101a.mo6606a().mo83081K() && account != null && !ContentResolver.getSyncAutomatically(account, "com.android.contacts")) {
                ((anbh) this.f75995i.f76024b).f76562v = true;
            }
            this.f75995i.mo41390a(new amyb(1));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.Collection, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0240  */
    /* renamed from: a */
    public final void mo41371a(Account account, Bundle bundle, anaz anaz, Exception exc) {
        long j;
        int i;
        String str;
        almk a = almk.m61263a();
        Context context = this.f75989c;
        String str2 = account.name;
        int b = anbj.m63921b(bundle);
        int a2 = anbi.m63919a(exc);
        anbh anbh = (anbh) anaz;
        long elapsedRealtime = SystemClock.elapsedRealtime() - anbh.f76552l;
        ammr ammr = (ammr) amnu.f75540w.mo74144da();
        bmxv c = bmxv.m108567c(anbh.f76557q);
        int i2 = anbh.f76554n;
        int a3 = amnt.m63103a(anbh.f76553m);
        bxvd da = amnm.f75511h.mo74144da();
        ammx ammx = (ammx) amnk.f75488o.mo74144da();
        HashMap hashMap = new HashMap();
        amig.m62939a();
        almk almk = a;
        if (!((Boolean) amfu.f74871a.mo41191a()).booleanValue()) {
            amig.m62939a();
            if (!((Boolean) amfv.f74872a.mo41191a()).booleanValue()) {
                j = elapsedRealtime;
                ammx.mo41219a(Arrays.asList((amnc[]) anbh.f76542b.values().toArray(new amnc[anbh.f76542b.size()])));
                if (!anbh.f76543c.isEmpty()) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ((amnm) da.f164949b).f75519g = GeneratedMessageLite.m124030de();
                    List asList = Arrays.asList((amnl[]) anbh.f76543c.values().toArray(new amnl[anbh.f76543c.size()]));
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amnm amnm = (amnm) da.f164949b;
                    if (!amnm.f75519g.mo73666a()) {
                        amnm.f75519g = GeneratedMessageLite.m124021a(amnm.f75519g);
                    }
                    bxsy.m123078a(asList, amnm.f75519g);
                }
                if (anbh.f76547g) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amnm amnm2 = (amnm) da.f164949b;
                    amnm2.f75513a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                    amnm2.f75516d = 1;
                }
                boolean z = anbh.f76549i;
                if (ammx.f164950c) {
                    ammx.mo74035c();
                    ammx.f164950c = false;
                }
                amnk amnk = (amnk) ammx.f164949b;
                int i3 = amnk.f75490a | 1;
                amnk.f75490a = i3;
                amnk.f75492c = z;
                boolean z2 = anbh.f76548h;
                int i4 = i3 | 2;
                amnk.f75490a = i4;
                amnk.f75493d = z2;
                i = anbh.f76539A;
                int i5 = i - 1;
                if (i != 0) {
                    amnk.f75497h = i5;
                    amnk.f75490a = i4 | 8;
                    boolean z3 = anbh.f76559s;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amnm amnm3 = (amnm) da.f164949b;
                    amnm3.f75513a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                    amnm3.f75517e = z3 ? 1 : 0;
                    if (!anbh.f76545e.isEmpty()) {
                        List list = anbh.f76545e;
                        if (ammx.f164950c) {
                            ammx.mo74035c();
                            ammx.f164950c = false;
                        }
                        amnk amnk2 = (amnk) ammx.f164949b;
                        if (!amnk2.f75495f.mo73666a()) {
                            amnk2.f75495f = GeneratedMessageLite.m124021a(amnk2.f75495f);
                        }
                        bxsy.m123078a(list, amnk2.f75495f);
                    }
                    if (!anbh.f76546f.isEmpty()) {
                        List list2 = anbh.f76546f;
                        if (ammx.f164950c) {
                            ammx.mo74035c();
                            ammx.f164950c = false;
                        }
                        amnk amnk3 = (amnk) ammx.f164949b;
                        if (!amnk3.f75496g.mo73666a()) {
                            amnk3.f75496g = GeneratedMessageLite.m124021a(amnk3.f75496g);
                        }
                        bxsy.m123078a(list2, amnk3.f75496g);
                    }
                    int i6 = anbh.f76555o;
                    if (i6 > 0) {
                        if (ammx.f164950c) {
                            ammx.mo74035c();
                            ammx.f164950c = false;
                        }
                        amnk amnk4 = (amnk) ammx.f164949b;
                        amnk4.f75490a |= 4;
                        amnk4.f75494e = i6;
                    }
                    if (cfyk.f186101a.mo6606a().mo83110n()) {
                        boolean z4 = anbh.f76560t;
                        if (ammx.f164950c) {
                            ammx.mo74035c();
                            ammx.f164950c = false;
                        }
                        amnk amnk5 = (amnk) ammx.f164949b;
                        int i7 = amnk5.f75490a | 16;
                        amnk5.f75490a = i7;
                        amnk5.f75498i = z4;
                        amnd amnd = anbh.f76561u;
                        if (amnd != null) {
                            amnd.getClass();
                            amnk5.f75499j = amnd;
                            amnk5.f75490a = i7 | 32;
                        }
                    }
                    if (anbh.f76563w.mo66813a()) {
                        ammw ammw = (ammw) anbh.f76563w.mo66814b();
                        if (ammx.f164950c) {
                            ammx.mo74035c();
                            ammx.f164950c = false;
                        }
                        amnk amnk6 = (amnk) ammx.f164949b;
                        ammw.getClass();
                        amnk6.f75500k = ammw;
                        amnk6.f75490a |= 64;
                    }
                    if (anbh.f76564x.mo66813a()) {
                        ammv ammv = (ammv) anbh.f76564x.mo66814b();
                        if (ammx.f164950c) {
                            ammx.mo74035c();
                            ammx.f164950c = false;
                        }
                        amnk amnk7 = (amnk) ammx.f164949b;
                        ammv.getClass();
                        amnk7.f75501l = ammv;
                        amnk7.f75490a |= 128;
                    }
                    if (anbh.f76565y.mo66813a()) {
                        amjt amjt = (amjt) anbh.f76565y.mo66814b();
                        if (ammx.f164950c) {
                            ammx.mo74035c();
                            ammx.f164950c = false;
                        }
                        amnk amnk8 = (amnk) ammx.f164949b;
                        amnk8.f75503n = amjt.f75014j;
                        amnk8.f75490a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    }
                    if (cfyk.m143815g()) {
                        for (anbf anbf : anbh.f76566z.keySet()) {
                            bxvd da2 = amnf.f75449e.mo74144da();
                            int i8 = anbf.f76534a;
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            amnf amnf = (amnf) da2.f164949b;
                            int i9 = amnf.f75451a | 1;
                            amnf.f75451a = i9;
                            amnf.f75452b = i8;
                            String str3 = anbf.f76535b;
                            str3.getClass();
                            amnf.f75451a = i9 | 2;
                            amnf.f75453c = str3;
                            Iterable iterable = (Iterable) anbh.f76566z.get(anbf);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            amnf amnf2 = (amnf) da2.f164949b;
                            amnf2.mo41221a();
                            bxsy.m123078a(iterable, amnf2.f75454d);
                            if (ammx.f164950c) {
                                ammx.mo74035c();
                                ammx.f164950c = false;
                            }
                            amnk amnk9 = (amnk) ammx.f164949b;
                            amnf amnf3 = (amnf) da2.mo74062i();
                            amnf3.getClass();
                            amnk9.mo41222a();
                            amnk9.f75502m.add(amnf3);
                        }
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amnm amnm4 = (amnm) da.f164949b;
                    amnk amnk10 = (amnk) ammx.mo74062i();
                    amnk10.getClass();
                    amnm4.f75518f = amnk10;
                    amnm4.f75514b |= 2;
                    almk.m61267a(ammr, context, str2, c, i2, "80", b, 3, a3, j, false, false, (amnm) da.mo74062i(), null);
                    int a4 = amnt.m63103a(anbh.f76553m);
                    int i10 = anbh.f76550j;
                    int i11 = anbh.f76551k;
                    long j2 = anbh.f76556p;
                    anbg anbg = anbh.f76558r;
                    if (anbg != null) {
                        str = anbg.f76536a;
                    } else {
                        str = null;
                    }
                    almk.m61266a(ammr, a4, a2, exc, i10, i11, j2, str);
                    amnu amnu = (amnu) ammr.mo74062i();
                    amig.m62939a();
                    if (((Boolean) amfy.f74875a.mo41191a()).booleanValue()) {
                        almk.mo40521a(this.f75989c, account.name, amnu, anaz.mo41641d(), bundle.getString("REQUESTER", "UNKNOWN"));
                        return;
                    }
                    almk.mo40521a(this.f75989c, account.name, amnu, anaz.mo41641d(), null);
                    return;
                }
                throw null;
            }
        }
        if (!anbh.f76544d.isEmpty()) {
            bnrd a5 = ((bnov) bnpf.m110046a(anbh.f76544d.keySet(), anbh.f76542b.keySet())).iterator();
            while (a5.hasNext()) {
                anbd anbd = (anbd) a5.next();
                bnrd bnrd = a5;
                bxvd da3 = amnc.f75422l.mo74144da();
                ammz ammz = anbd.f76528a;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                amnc amnc = (amnc) da3.f164949b;
                amnc.f75425b = ammz.f75412e;
                int i12 = amnc.f75424a | 1;
                amnc.f75424a = i12;
                long j3 = elapsedRealtime;
                amnc.f75426c = anbd.f76529b.f74994h;
                int i13 = i12 | 2;
                amnc.f75424a = i13;
                boolean z5 = anbd.f76530c;
                amnc.f75424a = i13 | 4;
                amnc.f75427d = z5;
                if (anbh.f76542b.containsKey(anbd)) {
                    amnc amnc2 = (amnc) anbh.f76542b.get(anbd);
                    int i14 = amnc2.f75428e;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    amnc amnc3 = (amnc) da3.f164949b;
                    int i15 = amnc3.f75424a | 8;
                    amnc3.f75424a = i15;
                    amnc3.f75428e = i14;
                    int i16 = amnc2.f75429f;
                    int i17 = i15 | 16;
                    amnc3.f75424a = i17;
                    amnc3.f75429f = i16;
                    int i18 = amnc2.f75430g;
                    int i19 = i17 | 32;
                    amnc3.f75424a = i19;
                    amnc3.f75430g = i18;
                    int i20 = amnc2.f75431h;
                    amnc3.f75424a = i19 | 64;
                    amnc3.f75431h = i20;
                }
                if (anbh.f76544d.containsKey(anbd)) {
                    Iterable a6 = bnjd.m109575a((Iterable) ((Map) anbh.f76544d.get(anbd)).values(), anbc.f76527a);
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    amnc amnc4 = (amnc) da3.f164949b;
                    if (!amnc4.f75432i.mo73666a()) {
                        amnc4.f75432i = GeneratedMessageLite.m124021a(amnc4.f75432i);
                    }
                    bxsy.m123078a(a6, amnc4.f75432i);
                }
                hashMap.put(anbd, (amnc) da3.mo74062i());
                a5 = bnrd;
                elapsedRealtime = j3;
            }
            j = elapsedRealtime;
            ammx.mo41219a(Arrays.asList((amnc[]) hashMap.values().toArray(new amnc[hashMap.size()])));
            if (!anbh.f76543c.isEmpty()) {
            }
            if (anbh.f76547g) {
            }
            boolean z6 = anbh.f76549i;
            if (ammx.f164950c) {
            }
            amnk amnk11 = (amnk) ammx.f164949b;
            int i32 = amnk11.f75490a | 1;
            amnk11.f75490a = i32;
            amnk11.f75492c = z6;
            boolean z22 = anbh.f76548h;
            int i42 = i32 | 2;
            amnk11.f75490a = i42;
            amnk11.f75493d = z22;
            i = anbh.f76539A;
            int i52 = i - 1;
            if (i != 0) {
            }
        } else {
            j = elapsedRealtime;
            ammx.mo41219a(Arrays.asList((amnc[]) anbh.f76542b.values().toArray(new amnc[anbh.f76542b.size()])));
            if (!anbh.f76543c.isEmpty()) {
            }
            if (anbh.f76547g) {
            }
            boolean z62 = anbh.f76549i;
            if (ammx.f164950c) {
            }
            amnk amnk112 = (amnk) ammx.f164949b;
            int i322 = amnk112.f75490a | 1;
            amnk112.f75490a = i322;
            amnk112.f75492c = z62;
            boolean z222 = anbh.f76548h;
            int i422 = i322 | 2;
            amnk112.f75490a = i422;
            amnk112.f75493d = z222;
            i = anbh.f76539A;
            int i522 = i - 1;
            if (i != 0) {
            }
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:113:0x02c6 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:535:0x0bc7 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:547:0x0be6 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:382:0x0980 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:448:0x0a92 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:385:0x099c */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:454:0x0aa1 */
    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:218:0x0539 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:221:0x054c */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:254:0x068a */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:266:0x06c2 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:289:0x0743 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:319:0x0809 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:323:0x0833 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:343:0x089c */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:624:0x08b8 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:506:0x0b5e */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:352:0x08b8 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:488:0x0b2c */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:261:0x06a7 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:227:0x058c */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:82:0x0252 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:66:0x01c7 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:59:0x01af */
    /* JADX WARN: Type inference failed for: r23v9, assign insn: PHI: (r23v9 ?) = (r23v13 ?), (r23v21 ?), (r23v21 ?), (r23v21 ?) binds: [B:113:0x02c6, B:82:0x0252, B:105:0x02ac, B:99:0x0294] */
    /* JADX WARN: Type inference failed for: r23v11, assign insn: PHI: (r23v11 ?) = (r23v13 ?), (r23v21 ?), (r23v21 ?), (r23v21 ?) binds: [B:113:0x02c6, B:82:0x0252, B:105:0x02ac, B:99:0x0294] */
    /* JADX WARN: Type inference failed for: r23v12, assign insn: PHI: (r23v12 ?) = (r23v13 ?), (r23v21 ?), (r23v21 ?), (r23v21 ?) binds: [B:113:0x02c6, B:82:0x0252, B:105:0x02ac, B:99:0x0294] */
    /* JADX WARN: Type inference failed for: r23v13, assign insn: PHI: (r23v13 ?) = (r23v21 ?), (r23v21 ?), (r23v31 ?) binds: [B:106:?, B:104:?, B:80:0x0224] */
    /* JADX WARN: Type inference failed for: r4v23, types: [boolean], assign insn: PHI: (r4v23 ?) = (r4v72 ?), (r4v74 ?) binds: [B:181:0x0470, B:197:0x0497] */
    /* JADX WARN: Type inference failed for: r11v34, assign insn: PHI: (r11v34 ?) = (r11v38 ?), (r11v38 ?), (r11v38 ?), (r11v38 ?), (r11v38 ?), (r11v42 ?), (r11v42 ?), (r11v48 ?) binds: [B:535:0x0bc7, B:551:0x0bf4, B:547:0x0be6, B:531:0x0bbc, B:532:?, B:448:0x0a92, B:451:0x0a96, B:454:0x0aa1] */
    /* JADX WARN: Type inference failed for: r11v35, assign insn: PHI: (r11v35 ?) = (r11v38 ?), (r11v38 ?), (r11v38 ?), (r11v38 ?), (r11v38 ?), (r11v42 ?), (r11v42 ?), (r11v48 ?) binds: [B:535:0x0bc7, B:551:0x0bf4, B:547:0x0be6, B:531:0x0bbc, B:532:?, B:448:0x0a92, B:451:0x0a96, B:454:0x0aa1] */
    /* JADX WARN: Type inference failed for: r11v37, assign insn: PHI: (r11v37 ?) = (r11v38 ?), (r11v38 ?), (r11v42 ?), (r11v42 ?), (r11v48 ?) binds: [B:531:0x0bbc, B:532:?, B:448:0x0a92, B:451:0x0a96, B:454:0x0aa1] */
    /* JADX WARN: Type inference failed for: r11v38, assign insn: PHI: (r11v38 ?) = (r11v43 ?), (r11v102 ?), (r11v134 ?) binds: [B:418:0x0a1c, B:217:0x0533, B:529:0x0bb9] */
    /* JADX WARN: Type inference failed for: r9v24, assign insn: PHI: (r9v24 ?) = (r9v34 ?), (r9v122 ?), (r9v144 ?) binds: [B:418:0x0a1c, B:529:0x0bb9, B:217:0x0533] */
    /* JADX WARN: Type inference failed for: r9v28, assign insn: PHI: (r9v28 ?) = (r9v34 ?), (r9v123 ?), (r9v128 ?) binds: [B:482:0x0b0f, B:528:0x0bb6, B:526:0x0bb3] */
    /* JADX WARN: Type inference failed for: r9v31, types: [android.os.Bundle], assign insn: 0x04ff: IGET  (r9v31 ? I:android.os.Bundle) = (r5v13 amxt) amxt.f android.os.Bundle */
    /* JADX WARN: Type inference failed for: r9v32, assign insn: PHI: (r9v32 ?) = (r9v34 ?), (r9v34 ?), (r9v48 ?) binds: [B:382:0x0980, B:407:0x0a02, B:377:0x096c] */
    /* JADX WARN: Type inference failed for: r9v33, assign insn: PHI: (r9v33 ?) = (r9v34 ?), (r9v34 ?), (r9v34 ?), (r9v48 ?), (r9v48 ?) binds: [B:396:0x09e5, B:403:0x09fa, B:404:?, B:380:0x097b, B:381:?] */
    /* JADX WARN: Type inference failed for: r9v34, assign insn: PHI: (r9v34 ?) = (r9v48 ?), (r9v48 ?), (r9v148 ?) binds: [B:379:0x0979, B:381:?, B:215:0x0522] */
    /* JADX WARN: Type inference failed for: r11v41, assign insn: 0x099b: CONST  (r11v41 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r11v42, types: [int], assign insn: PHI: (r11v42 ?) = (r11v41 ?), (r11v135 ?) binds: [B:384:0x099b, B:392:0x09d6] */
    /* JADX WARN: Type inference failed for: r11v43, assign insn: 0x0a21: MOVE  (r11v43 ? I:?[OBJECT, ARRAY]) = (r29v7 anbh) */
    /* JADX WARN: Type inference failed for: r11v48, types: [anbh], assign insn: 0x0a9f: MOVE  (r11v48 ? I:?[OBJECT, ARRAY]) = (r29v7 anbh) */
    /* JADX WARN: Type inference failed for: r9v41, assign insn: PHI: (r9v41 ?) = (r9v40 boolean), (r9v139 ?), (r9v140 ?), (r9v143 ?) binds: [B:220:0x054a, B:223:0x0570, B:253:0x0675, B:232:0x05ac] */
    /* JADX WARN: Type inference failed for: r9v43, assign insn: PHI: (r9v43 ?) = (r9v41 ?), (r9v58 ?), (r9v136 ?), (r9v138 ?) binds: [B:256:0x068c, B:260:0x06a5, B:263:0x06b9, B:262:?] */
    /* JADX WARN: Type inference failed for: r9v44, assign insn: PHI: (r9v44 ?) = (r9v48 ?), (r9v130 ?) binds: [B:518:0x0ba7, B:520:0x0baa] */
    /* JADX WARN: Type inference failed for: r9v45, assign insn: PHI: (r9v45 ?) = (r9v48 ?), (r9v131 ?) binds: [B:486:0x0b1f, B:519:0x0ba9] */
    /* JADX WARN: Type inference failed for: r9v46, assign insn: PHI: (r9v46 ?) = (r9v43 ?), (r9v47 ?), (r9v47 ?), (r9v48 ?), (r9v48 ?), (r9v48 ?), (r9v48 ?), (r9v43 ?), (r9v43 ?) binds: [B:266:0x06c2, B:289:0x0743, B:297:0x0760, B:319:0x0809, B:325:0x0836, B:343:0x089c, B:333:0x085d, B:283:0x06f9, B:277:0x06e9] */
    /* JADX WARN: Type inference failed for: r9v47, assign insn: PHI: (r9v47 ?) = (r9v43 ?), (r9v132 ?) binds: [B:286:0x071a, B:288:?] */
    /* JADX WARN: Type inference failed for: r9v48, types: [java.lang.String], assign insn: 0x0792: CONST_STR  (r9v48 ? I:java.lang.String) =  "mimetype='vnd.android.cursor.item/photo' AND data15 IS NOT NULL" */
    /* JADX WARN: Type inference failed for: r11v57, types: [amvm], assign insn: 0x0811: IGET  (r11v57 ? I:amvm) = (r2v70 amxp) amxs.k amvm */
    /* JADX WARN: Type inference failed for: r11v59, assign insn: PHI: (r11v59 ?) = (r11v57 ?), (r11v68 ?), (r11v71 ?), (r11v71 ?) binds: [B:323:0x0833, B:506:0x0b5e, B:488:0x0b2c, B:489:?] */
    /* JADX WARN: Type inference failed for: r11v68, assign insn: PHI: (r11v68 ?) = (r11v73 ?), (r11v139 ?) binds: [B:363:0x092c, B:500:0x0b55] */
    /* JADX WARN: Type inference failed for: r11v71, assign insn: 0x0b29: MOVE  (r11v71 ? I:?[OBJECT, ARRAY]) = (r29v10 anbh) */
    /* JADX WARN: Type inference failed for: r11v73, assign insn: 0x0931: MOVE  (r11v73 ? I:?[OBJECT, ARRAY]) = (r29v10 anbh) */
    /* JADX WARN: Type inference failed for: r9v56, assign insn: PHI: (r9v56 ?) = (r9v48 ?), (r9v135 ?) binds: [B:375:0x0964, B:264:0x06bb] */
    /* JADX WARN: Type inference failed for: r9v57, assign insn: PHI: (r9v57 ?) = (r9v48 ?), (r9v48 ?), (r9v48 ?), (r9v48 ?), (r9v47 ?), (r9v47 ?), (r9v47 ?), (r9v43 ?), (r9v43 ?), (r9v43 ?), (r9v41 ?), (r9v133 ?) binds: [B:350:0x08b3, B:351:?, B:340:0x087f, B:311:0x0799, B:300:0x0777, B:292:0x0757, B:293:?, B:287:0x071c, B:280:0x06f1, B:270:0x06cb, B:257:0x068e, B:288:?] */
    /* JADX WARN: Type inference failed for: r9v58, types: [long], assign insn: 0x069f: INVOKE  (r9v58 ? I:long) = (r8v86 java.lang.Long) type: VIRTUAL call: java.lang.Long.longValue():long */
    /* JADX WARN: Type inference failed for: r9v59, assign insn: PHI: (r9v59 ?) = (r9v58 ?), (r9v137 ?) binds: [B:261:0x06a7, B:262:?] */
    /* JADX WARN: Type inference failed for: r11v102, assign insn: 0x0534: MOVE  (r11v102 ? I:?[OBJECT, ARRAY]) = (r29v14 anbh) */
    /* JADX WARN: Type inference failed for: r9v81, assign insn: PHI: (r9v81 ?) = (r9v40 boolean), (r9v73 int) binds: [B:221:0x054c, B:227:0x058c] */
    /* JADX WARN: Type inference failed for: r9v82, types: [boolean], assign insn: 0x0505: INVOKE  (r9v82 ? I:boolean) = (r9v31 ? I:android.os.Bundle), ("upload"), (r4v23 ? I:boolean) type: VIRTUAL call: android.os.Bundle.getBoolean(java.lang.String, boolean):boolean */
    /* JADX WARN: Type inference failed for: r11v104, assign insn: 0x0c1c: MOVE  (r11v104 ? I:?[OBJECT, ARRAY]) = (r14v9 anbh) */
    /* JADX WARN: Type inference failed for: r4v72, assign insn: 0x0470: CONST  (r4v72 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r23v17, assign insn: PHI: (r23v17 ?) = (r23v13 ?), (r23v13 ?), (r23v13 ?), (r23v21 ?), (r23v21 ?), (r23v21 ?), (r23v21 ?), (r23v25 android.content.ContentResolver), (r23v29 ?), (r23v30 ?), (r23v30 ?), (r23v30 ?) binds: [B:116:0x02cc, B:110:0x02bf, B:111:?, B:103:0x02a6, B:104:?, B:89:0x0275, B:90:?, B:54:0x0197, B:66:0x01c7, B:59:0x01af, B:61:0x01bc, B:62:?] */
    /* JADX WARN: Type inference failed for: r23v19, assign insn: PHI: (r23v19 ?) = (r23v13 ?), (r23v13 ?), (r23v13 ?), (r23v21 ?), (r23v21 ?), (r23v21 ?), (r23v21 ?), (r23v25 android.content.ContentResolver), (r23v29 ?), (r23v30 ?), (r23v30 ?), (r23v30 ?) binds: [B:116:0x02cc, B:110:0x02bf, B:111:?, B:103:0x02a6, B:104:?, B:89:0x0275, B:90:?, B:54:0x0197, B:66:0x01c7, B:59:0x01af, B:61:0x01bc, B:62:?] */
    /* JADX WARN: Type inference failed for: r23v20, assign insn: PHI: (r23v20 ?) = (r23v13 ?), (r23v13 ?), (r23v13 ?), (r23v21 ?), (r23v21 ?), (r23v21 ?), (r23v21 ?), (r23v25 android.content.ContentResolver), (r23v29 ?), (r23v30 ?), (r23v30 ?), (r23v30 ?) binds: [B:116:0x02cc, B:110:0x02bf, B:111:?, B:103:0x02a6, B:104:?, B:89:0x0275, B:90:?, B:54:0x0197, B:66:0x01c7, B:59:0x01af, B:61:0x01bc, B:62:?] */
    /* JADX WARN: Type inference failed for: r11v111, assign insn: 0x027f: MOVE  (r11v111 ? I:?[OBJECT, ARRAY]) = (r23v20 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r23v21, assign insn: 0x024f: MOVE  (r23v21 ? I:?[OBJECT, ARRAY]) = (r14v0 anbh) */
    /* JADX WARN: Type inference failed for: r23v28, assign insn: PHI: (r23v28 ?) = (r23v29 ?), (r23v30 ?) binds: [B:67:?, B:62:?] */
    /* JADX WARN: Type inference failed for: r23v29, assign insn: 0x01c0: MOVE  (r23v29 ? I:?[OBJECT, ARRAY]) = (r14v0 anbh) */
    /* JADX WARN: Type inference failed for: r23v30, assign insn: 0x01ad: MOVE  (r23v30 ? I:?[OBJECT, ARRAY]) = (r14v0 anbh) */
    /* JADX WARN: Type inference failed for: r11v134, assign insn: ?: MOVE  (r11v134 ?) = (r11v39 anbh) */
    /* JADX WARN: Type inference failed for: r9v122, assign insn: ?: MOVE  (r9v122 ?) = (r9v28 ?) */
    /* JADX WARN: Type inference failed for: r9v123, assign insn: ?: MOVE  (r9v123 ?) = (r9v29 android.accounts.Account) */
    /* JADX WARN: Type inference failed for: r11v135, assign insn: ?: MOVE  (r11v135 ?) = (r11v53 int) */
    /* JADX WARN: Type inference failed for: r9v128, assign insn: ?: MOVE  (r9v128 ?) = (r9v42 boolean) */
    /* JADX WARN: Type inference failed for: r9v130, assign insn: ?: MOVE  (r9v130 ?) = (r9v45 ?) */
    /* JADX WARN: Type inference failed for: r9v131, assign insn: ?: MOVE  (r9v131 ?) = (r9v46 ?) */
    /* JADX WARN: Type inference failed for: r11v139, assign insn: ?: MOVE  (r11v139 ?) = (r11v69 anbh) */
    /* JADX WARN: Type inference failed for: r9v132, assign insn: ?: MOVE  (r9v132 ?) = (r9v55 int) */
    /* JADX WARN: Type inference failed for: r9v133, assign insn: ?: MOVE  (r9v133 ?) = (r9v55 int) */
    /* JADX WARN: Type inference failed for: r9v135, assign insn: ?: MOVE  (r9v135 ?) = (r9v57 ?) */
    /* JADX WARN: Type inference failed for: r9v136, assign insn: ?: MOVE  (r9v136 ?) = (r9v59 ?) */
    /* JADX WARN: Type inference failed for: r9v137, assign insn: ?: MOVE  (r9v137 ?) = (r9v60 amvm) */
    /* JADX WARN: Type inference failed for: r9v138, assign insn: ?: MOVE  (r9v138 ?) = (r9v60 amvm) */
    /* JADX WARN: Type inference failed for: r9v139, assign insn: ?: MOVE  (r9v139 ?) = (r9v68 long) */
    /* JADX WARN: Type inference failed for: r9v140, assign insn: ?: MOVE  (r9v140 ?) = (r9v74 int) */
    /* JADX WARN: Type inference failed for: r9v141, assign insn: ?: MOVE  (r9v141 ?) = (r9v75 anbu) */
    /* JADX WARN: Type inference failed for: r9v143, assign insn: ?: MOVE  (r9v143 ?) = (r9v79 android.content.SyncRequest$Builder) */
    /* JADX WARN: Type inference failed for: r9v144, assign insn: ?: MOVE  (r9v144 ?) = (r9v80 boolean) */
    /* JADX WARN: Type inference failed for: r9v148, assign insn: ?: MOVE  (r9v148 ?) = (r9v86 java.lang.String) */
    /* JADX WARN: Type inference failed for: r4v74, assign insn: ?: MOVE  (r4v74 ?) = (r4v68 boolean) */
    /* JADX WARN: Type inference failed for: r23v31, assign insn: ?: MOVE  (r23v31 ?) = (r23v22 anbh) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amxp.a(amvx, boolean):void
     arg types: [amwa, int]
     candidates:
      amxp.a(java.lang.String, amjf):void
      amxp.a(amvx, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x06d9, code lost:
        if (r5.f76355m.startsWith(r2) == false) goto L_0x0703;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x06f7, code lost:
        if (r2.startsWith(r5.f76355m) != false) goto L_0x06f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x011e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x011f, code lost:
        r9 = r0;
        r11 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0124, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0125, code lost:
        r2 = r0;
        r11 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0c02, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0c07, code lost:
        r0 = e;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0c09, code lost:
        r0 = th;
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0c0b, code lost:
        r0 = e;
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0c0d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0c0f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0c10, code lost:
        r11 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x0c13, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0c17, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0c18, code lost:
        r11 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0c1b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0c1c, code lost:
        r11 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0c1e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0c39, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x0c3a, code lost:
        r11 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0c3f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x0c40, code lost:
        r11 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x0c5b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x0c5c, code lost:
        r23 = "FSA2_ContactsSyncAdapter";
        r8 = r6;
        r11 = r14;
        r9 = 1;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:598:0x0c7c, code lost:
        if (r1 == 4) goto L_0x0c7e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:601:0x0c98, code lost:
        r2 = new java.lang.String("focus_sync_backoff_sec_");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:602:0x0c9e, code lost:
        r2 = "focus_sync_backoff_sec_".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:0x0ce0, code lost:
        if (r4 > 0) goto L_0x0ce2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x0ce2, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:0x0ce4, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x0ce6, code lost:
        if (r2 == false) goto L_0x0ce8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:0x0ce9, code lost:
        r1 = java.lang.Math.min(r3, r1 + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:613:0x0d04, code lost:
        r2 = java.lang.System.currentTimeMillis();
        r4 = new java.lang.Object[r9];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:614:0x0d0a, code lost:
        r13 = (double) r1;
        java.lang.Double.isNaN(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:616:?, code lost:
        r4[0] = java.lang.Double.valueOf(r13 / 60.0d);
        p000.amdk.m62658a(r10, " Delaying %f minutes.", r4);
        r4 = r11.f76541a;
        r12 = (long) r1;
        r4.delayUntil = java.lang.Math.max(r4.delayUntil, (r2 / 1000) + r12);
        r11.f76556p = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:617:0x0d2e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0201, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0202, code lost:
        r1 = r0;
        r23 = "FSA2_ContactsSyncAdapter";
        r8 = r6;
        r11 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0291, code lost:
        r9 = r9;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:12:0x0080, B:49:0x0164] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:454:0x0aa1, B:535:0x0bc7] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:454:0x0aa1, B:547:0x0be6] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:454:0x0aa1, B:551:0x0bf4] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0777 A[SYNTHETIC, Splitter:B:300:0x0777] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x011e A[ExcHandler: all (r0v14 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r14 10  PHI: (r14v7 anbh) = (r14v9 anbh), (r14v9 anbh), (r14v9 anbh), (r14v22 anbh), (r14v0 anbh), (r14v0 anbh), (r14v0 anbh), (r14v0 anbh), (r14v0 anbh), (r14v0 anbh), (r14v0 anbh), (r14v0 anbh) binds: [B:164:0x040e, B:155:0x03a3, B:143:0x0375, B:129:0x0312, B:41:0x013c, B:46:0x015e, B:47:?, B:49:0x0164, B:50:?, B:51:0x0166, B:12:0x0080, B:16:0x00ab] A[DONT_GENERATE, DONT_INLINE], Splitter:B:12:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x07b5 A[Catch:{ all -> 0x06bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x07b6 A[Catch:{ all -> 0x06bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0825 A[Catch:{ all -> 0x0ba9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0124 A[ExcHandler: Exception (r0v13 'e' java.lang.Exception A[CUSTOM_DECLARE]), PHI: r14 10  PHI: (r14v6 anbh) = (r14v9 anbh), (r14v9 anbh), (r14v9 anbh), (r14v22 anbh), (r14v0 anbh), (r14v0 anbh), (r14v0 anbh), (r14v0 anbh), (r14v0 anbh), (r14v0 anbh), (r14v0 anbh), (r14v0 anbh) binds: [B:164:0x040e, B:155:0x03a3, B:143:0x0375, B:129:0x0312, B:41:0x013c, B:46:0x015e, B:47:?, B:49:0x0164, B:50:?, B:51:0x0166, B:12:0x0080, B:16:0x00ab] A[DONT_GENERATE, DONT_INLINE], Splitter:B:12:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0956 A[SYNTHETIC, Splitter:B:372:0x0956] */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x097b A[SYNTHETIC, Splitter:B:380:0x097b] */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x099e A[SYNTHETIC, Splitter:B:386:0x099e] */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x0a0a A[SYNTHETIC, Splitter:B:410:0x0a0a] */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x0a25  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0a28 A[SYNTHETIC, Splitter:B:421:0x0a28] */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x0a4c A[SYNTHETIC, Splitter:B:429:0x0a4c] */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x0a57 A[SYNTHETIC, Splitter:B:434:0x0a57] */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x0a90  */
    /* JADX WARNING: Removed duplicated region for block: B:464:0x0aba A[Catch:{ amyc -> 0x0bc2, Exception -> 0x0c0b, all -> 0x0c09 }] */
    /* JADX WARNING: Removed duplicated region for block: B:502:0x0b58 A[SYNTHETIC, Splitter:B:502:0x0b58] */
    /* JADX WARNING: Removed duplicated region for block: B:516:0x0b90 A[Catch:{ all -> 0x0b79, all -> 0x0b5c, all -> 0x0ba7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:531:0x0bbc A[SYNTHETIC, Splitter:B:531:0x0bbc] */
    /* JADX WARNING: Removed duplicated region for block: B:538:0x0bcd A[Catch:{ amyc -> 0x0c0d, Exception -> 0x0c0b, all -> 0x0c09 }] */
    /* JADX WARNING: Removed duplicated region for block: B:555:0x0c04 A[Catch:{ amyc -> 0x0c07, Exception -> 0x0c0b, all -> 0x0c09 }] */
    /* JADX WARNING: Removed duplicated region for block: B:558:0x0c09 A[ExcHandler: all (th java.lang.Throwable), PHI: r6 r11 10  PHI: (r6v19 android.accounts.Account) = (r6v22 android.accounts.Account), (r6v22 android.accounts.Account), (r6v22 android.accounts.Account), (r6v22 android.accounts.Account), (r6v22 android.accounts.Account), (r6v30 android.accounts.Account), (r6v33 android.accounts.Account), (r6v33 android.accounts.Account) binds: [B:535:0x0bc7, B:551:0x0bf4, B:547:0x0be6, B:531:0x0bbc, B:532:?, B:448:0x0a92, B:451:0x0a96, B:454:0x0aa1] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r11v35 ?) = (r11v38 ?), (r11v38 ?), (r11v38 ?), (r11v38 ?), (r11v38 ?), (r11v42 ?), (r11v42 ?), (r11v48 ?) binds: [B:535:0x0bc7, B:551:0x0bf4, B:547:0x0be6, B:531:0x0bbc, B:532:?, B:448:0x0a92, B:451:0x0a96, B:454:0x0aa1] A[DONT_GENERATE, DONT_INLINE], Splitter:B:454:0x0aa1] */
    /* JADX WARNING: Removed duplicated region for block: B:559:0x0c0b A[ExcHandler: Exception (e java.lang.Exception), PHI: r6 r11 10  PHI: (r6v18 android.accounts.Account) = (r6v22 android.accounts.Account), (r6v22 android.accounts.Account), (r6v22 android.accounts.Account), (r6v22 android.accounts.Account), (r6v22 android.accounts.Account), (r6v30 android.accounts.Account), (r6v33 android.accounts.Account), (r6v33 android.accounts.Account) binds: [B:535:0x0bc7, B:551:0x0bf4, B:547:0x0be6, B:531:0x0bbc, B:532:?, B:448:0x0a92, B:451:0x0a96, B:454:0x0aa1] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r11v34 ?) = (r11v38 ?), (r11v38 ?), (r11v38 ?), (r11v38 ?), (r11v38 ?), (r11v42 ?), (r11v42 ?), (r11v48 ?) binds: [B:535:0x0bc7, B:551:0x0bf4, B:547:0x0be6, B:531:0x0bbc, B:532:?, B:448:0x0a92, B:451:0x0a96, B:454:0x0aa1] A[DONT_GENERATE, DONT_INLINE], Splitter:B:454:0x0aa1] */
    /* JADX WARNING: Removed duplicated region for block: B:561:0x0c0f A[ExcHandler: all (th java.lang.Throwable), PHI: r6 r29 10  PHI: (r6v17 android.accounts.Account) = (r6v0 android.accounts.Account), (r6v33 android.accounts.Account), (r6v33 android.accounts.Account) binds: [B:200:0x04e0, B:451:0x0a96, B:452:?] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r29v3 anbh) = (r29v0 anbh), (r29v7 anbh), (r29v7 anbh) binds: [B:200:0x04e0, B:451:0x0a96, B:452:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:200:0x04e0] */
    /* JADX WARNING: Removed duplicated region for block: B:563:0x0c13 A[ExcHandler: Exception (e java.lang.Exception), PHI: r6 r29 10  PHI: (r6v16 android.accounts.Account) = (r6v0 android.accounts.Account), (r6v33 android.accounts.Account), (r6v33 android.accounts.Account) binds: [B:200:0x04e0, B:451:0x0a96, B:452:?] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r29v2 anbh) = (r29v0 anbh), (r29v7 anbh), (r29v7 anbh) binds: [B:200:0x04e0, B:451:0x0a96, B:452:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:200:0x04e0] */
    /* JADX WARNING: Removed duplicated region for block: B:582:0x0c39 A[ExcHandler: all (th java.lang.Throwable), PHI: r14 10  PHI: (r14v2 anbh) = (r14v0 anbh), (r14v0 anbh), (r14v0 anbh), (r14v0 anbh), (r14v9 anbh), (r14v9 anbh), (r14v9 anbh), (r14v9 anbh), (r14v9 anbh), (r14v9 anbh), (r14v9 anbh), (r14v9 anbh), (r14v9 anbh) binds: [B:5:0x0059, B:6:?, B:7:0x005b, B:37:0x0133, B:137:0x0365, B:151:0x0394, B:161:0x03c9, B:167:0x0419, B:170:0x0429, B:189:0x0484, B:195:0x0495, B:187:0x0482, B:188:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:37:0x0133] */
    /* JADX WARNING: Removed duplicated region for block: B:585:0x0c3f A[ExcHandler: Exception (e java.lang.Exception), PHI: r14 10  PHI: (r14v1 anbh) = (r14v0 anbh), (r14v0 anbh), (r14v0 anbh), (r14v0 anbh), (r14v9 anbh), (r14v9 anbh), (r14v9 anbh), (r14v9 anbh), (r14v9 anbh), (r14v9 anbh), (r14v9 anbh), (r14v9 anbh), (r14v9 anbh) binds: [B:5:0x0059, B:6:?, B:7:0x005b, B:37:0x0133, B:137:0x0365, B:151:0x0394, B:161:0x03c9, B:167:0x0419, B:170:0x0429, B:189:0x0484, B:195:0x0495, B:187:0x0482, B:188:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:596:0x0c7a A[Catch:{ amyc -> 0x0c5b, Exception -> 0x0c3f, all -> 0x0c39, all -> 0x0d2e }] */
    /* JADX WARNING: Removed duplicated region for block: B:597:0x0c7b A[Catch:{ amyc -> 0x0c5b, Exception -> 0x0c3f, all -> 0x0c39, all -> 0x0d2e }] */
    /* JADX WARNING: Removed duplicated region for block: B:601:0x0c98 A[Catch:{ amyc -> 0x0c5b, Exception -> 0x0c3f, all -> 0x0c39, all -> 0x0d2e }] */
    /* JADX WARNING: Removed duplicated region for block: B:602:0x0c9e A[Catch:{ amyc -> 0x0c5b, Exception -> 0x0c3f, all -> 0x0c39, all -> 0x0d2e }] */
    /* JADX WARNING: Removed duplicated region for block: B:605:0x0ce0 A[Catch:{ amyc -> 0x0c5b, Exception -> 0x0c3f, all -> 0x0c39, all -> 0x0d2e }] */
    /* JADX WARNING: Removed duplicated region for block: B:608:0x0ce6 A[Catch:{ amyc -> 0x0c5b, Exception -> 0x0c3f, all -> 0x0c39, all -> 0x0d2e }] */
    /* JADX WARNING: Removed duplicated region for block: B:613:0x0d04 A[Catch:{ amyc -> 0x0c5b, Exception -> 0x0c3f, all -> 0x0c39, all -> 0x0d2e }] */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    public final void mo41365a(Account account, Bundle bundle, String str, SyncResult syncResult) {
        anbh anbh;
        Throwable th;
        String str2;
        int i;
        Account account2;
        amyc amyc;
        Exception a;
        int i2;
        String valueOf;
        String str3;
        int i3;
        amve amve;
        SyncResult syncResult2;
        anbh anbh2;
        Account account3;
        Bundle bundle2;
        Exception exc;
        anbh anbh3;
        int i4;
        String str4;
        anbh anbh4;
        amyc amyc2;
        Account account4;
        anbh anbh5;
        ContentResolver contentResolver;
        String str5;
        String str6;
        String str7;
        ? r4;
        amxt amxt;
        int i5;
        amxt amxt2;
        anbh anbh6;
        anbh anbh7;
        Throwable th2;
        anbh anbh8;
        Account account5;
        Account account6;
        int max;
        int i6;
        boolean booleanValue;
        anbh anbh9;
        boolean z;
        Account account7;
        Throwable th3;
        anbh anbh10;
        Account account8;
        Account account9;
        boolean z2;
        boolean z3;
        Cursor query;
        String str8;
        anbh anbh11;
        Throwable th4;
        Account account10;
        Account account11;
        String str9;
        Account account12;
        int a2;
        boolean z4;
        boolean z5;
        String concat;
        anbh anbh12;
        int i7;
        amve amve2 = this;
        Account account13 = account;
        Bundle bundle3 = bundle;
        m63348a(amve2.f75989c, account13.name, "@onPerformSync Sync started");
        sdo.m34974b("com.android.contacts".equals(str));
        if (account13 == null) {
            m63352b(amve2.f75989c, null, "@onPerformSync Unspecified account, bailing out");
            return;
        }
        amve2.f75997k = account13;
        Bundle bundle4 = new Bundle();
        bundle4.putBoolean("periodic_sync", true);
        new rtg(amve2.f75989c);
        rtg.m34396a(account13, "com.android.contacts", bundle4, cfvk.f185780a.mo6606a().mo82958aV());
        anbh anbh13 = new anbh(syncResult);
        anbh13.f76539A = amve2.f75998l;
        srb srb = srb.f45012a;
        try {
            Context context = amve2.f75989c;
            alsj alsj = amve2.f75993g;
            amig.m62939a();
            boolean booleanValue2 = Boolean.valueOf(cfvk.f185780a.mo6606a().mo83049z()).booleanValue();
            if (!amwz.m63595a(context)) {
                if (booleanValue2) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        long j = currentTimeMillis - alsj.f74200a.getLong("focus_sync_permission_denied_notify_time", 0);
                        amig.m62939a();
                        if (j >= Long.valueOf(cfvk.f185780a.mo6606a().mo82957aU()).longValue() * 1000) {
                            sey a3 = sey.m35126a(context);
                            amig.m62939a();
                            if (((Boolean) amgh.f74884a.mo41191a()).booleanValue()) {
                                a3.mo25458a("FSA2_CONTACTS_PERMISSION_NOTIFICATION", 1);
                                a3.mo25459a("com.google.android.gms.people.sync.focus.notification.permission_denied.tag", 1, amxd.m63598a(context));
                            } else {
                                a3.mo25459a("FSA2_CONTACTS_PERMISSION_NOTIFICATION", 1, amxd.m63598a(context));
                            }
                            Log.e("FSA2_ContactsPermissionReminder", "Sent contacts permission denied notification.");
                            anbh13.f76559s = true;
                            alsj.mo40689b(currentTimeMillis);
                        } else {
                            amdk.m62659b("FSA2_ContactsPermissionReminder", "Contacts permission denied. Notification was lastly sent %d seconds ago.", Long.valueOf(j / 1000));
                        }
                    } catch (amyc e) {
                        amyc2 = e;
                        str4 = "FSA2_ContactsSyncAdapter";
                        account4 = account13;
                        anbh5 = anbh13;
                        i = 1;
                        String str10 = str2;
                        a = m63346a(amyc.f76366a, syncResult, anbh, bundle, account);
                        i2 = anbh.f76553m;
                        if (i2 != 7) {
                        }
                        sdo.m34959a((Object) account2.name);
                        amig.m62939a();
                        alsj alsj2 = amve2.f75993g;
                        String str11 = account2.name;
                        SharedPreferences sharedPreferences = alsj2.f74200a;
                        valueOf = String.valueOf(str11);
                        if (valueOf.length() != 0) {
                        }
                        i3 = sharedPreferences.getInt(str3, 0);
                        boolean booleanValue3 = Boolean.valueOf(cfvk.f185780a.mo6606a().mo82912C()).booleanValue();
                        int intValue = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82947aK()).intValue();
                        int intValue2 = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo83026c()).intValue();
                        if (i3 > 0) {
                        }
                        Object[] objArr = new Object[i];
                        objArr[0] = Integer.valueOf(i3);
                        amdk.m62658a(str10, "backoff=%d", objArr);
                        amve2.f75993g.mo40696c(account2.name, i3);
                        if (i3 > 0) {
                        }
                        amve = this;
                        syncResult2 = syncResult;
                        anbh2 = anbh;
                        account3 = account;
                        bundle2 = bundle;
                        amve.m63349a(syncResult2, anbh2, account3, bundle2, a);
                        return;
                    } catch (Exception e2) {
                    } catch (Throwable th5) {
                    }
                }
                throw new RemoteException("Gms does not have contacts permission.");
            }
            if (booleanValue2) {
                sey a4 = sey.m35126a(context);
                a4.mo25458a("FSA2_CONTACTS_PERMISSION_NOTIFICATION", 1);
                amig.m62939a();
                if (((Boolean) amgh.f74884a.mo41191a()).booleanValue()) {
                    a4.mo25458a("com.google.android.gms.people.sync.focus.notification.permission_denied.tag", 1);
                }
                alsj.mo40689b(0);
            }
            if (!cfxy.m143781c()) {
                ContentResolver contentResolver2 = amve2.f75990d;
                amig.m62939a();
                if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo83021bv()).booleanValue()) {
                    String[] strArr = new String[4];
                    strArr[0] = "https://www.google.com/m8/feeds";
                    int i8 = 1;
                    strArr[1] = "contacts";
                    strArr[2] = account13.name;
                    strArr[3] = "base2_property-android_linksto-gprofiles_highresphotos";
                    String valueOf2 = String.valueOf(TextUtils.join("/", Arrays.asList(strArr)));
                    contentResolver = contentResolver2;
                    Cursor query2 = contentResolver.query(ContactsContract.DisplayPhoto.CONTENT_MAX_DIMENSIONS_URI, new String[]{"display_max_dim"}, null, null, null);
                    if (query2 != null) {
                        try {
                            if (!query2.moveToNext()) {
                                Log.e("FSA2_FeedUtil", "CP2 returns empty cursor when querying photo max dimensions.");
                                amig.m62939a();
                                contentResolver = anbh13;
                                try {
                                    i7 = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo83037n()).intValue();
                                    try {
                                        query2.close();
                                    } catch (amyc e3) {
                                        amyc = e3;
                                        account2 = account13;
                                        anbh = contentResolver;
                                        i8 = 1;
                                        str2 = "FSA2_ContactsSyncAdapter";
                                    } catch (Exception e4) {
                                        exc = e4;
                                        anbh3 = contentResolver;
                                        a = m63346a(exc, syncResult, anbh, bundle, account);
                                        amve = this;
                                        syncResult2 = syncResult;
                                        anbh2 = anbh;
                                        account3 = account;
                                        bundle2 = bundle;
                                        amve.m63349a(syncResult2, anbh2, account3, bundle2, a);
                                        return;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        anbh = contentResolver;
                                        m63349a(syncResult, anbh, account, bundle, (Exception) null);
                                        throw th;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    Throwable th8 = th;
                                    query2.close();
                                    throw th8;
                                }
                            } else {
                                contentResolver = anbh13;
                                int i9 = query2.getInt(0);
                                query2.close();
                                i7 = i9;
                            }
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 15);
                            sb.append(valueOf2);
                            sb.append("?sz=");
                            sb.append(i7);
                            str6 = sb.toString();
                            anbh12 = contentResolver;
                        } catch (Throwable th9) {
                            th = th9;
                            Throwable th82 = th;
                            query2.close();
                            throw th82;
                        }
                    } else {
                        throw new amyc(new amxz());
                    }
                } else {
                    anbh12 = anbh13;
                    str6 = TextUtils.join("/", Arrays.asList("https://www.google.com/m8/feeds", "contacts", account13.name, "base2_property-android"));
                }
                str5 = TextUtils.join("/", Arrays.asList("https://www.google.com/m8/feeds", "groups", account13.name, "base2_property-android"));
                ashr.m74143a(amve2.f75990d, account13, "com.android.contacts", "cp", str6, str5);
                contentResolver = anbh12;
            } else {
                contentResolver = anbh13;
                try {
                    if (cfxy.f186083a.mo6606a().mo83060d()) {
                        ashr.m74143a(amve2.f75990d, account13, "com.android.contacts", "cp", new String[0]);
                    }
                    String valueOf3 = String.valueOf(account13.name);
                    if (valueOf3.length() == 0) {
                        concat = new String("contacts/");
                    } else {
                        concat = "contacts/".concat(valueOf3);
                    }
                    String valueOf4 = String.valueOf(account13.name);
                    str5 = valueOf4.length() == 0 ? new String("groups/") : "groups/".concat(valueOf4);
                } catch (amyc e5) {
                    e = e5;
                    anbh4 = contentResolver;
                    i4 = 1;
                    str4 = "FSA2_ContactsSyncAdapter";
                    amyc = e;
                    account2 = account13;
                    i = i4;
                    String str102 = str2;
                    a = m63346a(amyc.f76366a, syncResult, anbh, bundle, account);
                    i2 = anbh.f76553m;
                    if (i2 != 7) {
                    }
                    sdo.m34959a((Object) account2.name);
                    amig.m62939a();
                    alsj alsj22 = amve2.f75993g;
                    String str112 = account2.name;
                    SharedPreferences sharedPreferences2 = alsj22.f74200a;
                    valueOf = String.valueOf(str112);
                    if (valueOf.length() != 0) {
                    }
                    i3 = sharedPreferences2.getInt(str3, 0);
                    boolean booleanValue32 = Boolean.valueOf(cfvk.f185780a.mo6606a().mo82912C()).booleanValue();
                    int intValue3 = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82947aK()).intValue();
                    int intValue22 = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo83026c()).intValue();
                    if (i3 > 0) {
                    }
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = Integer.valueOf(i3);
                    amdk.m62658a(str102, "backoff=%d", objArr2);
                    amve2.f75993g.mo40696c(account2.name, i3);
                    if (i3 > 0) {
                    }
                    amve = this;
                    syncResult2 = syncResult;
                    anbh2 = anbh;
                    account3 = account;
                    bundle2 = bundle;
                    amve.m63349a(syncResult2, anbh2, account3, bundle2, a);
                    return;
                } catch (Exception e6) {
                    e = e6;
                    anbh3 = contentResolver;
                    exc = e;
                    a = m63346a(exc, syncResult, anbh, bundle, account);
                    amve = this;
                    syncResult2 = syncResult;
                    anbh2 = anbh;
                    account3 = account;
                    bundle2 = bundle;
                    amve.m63349a(syncResult2, anbh2, account3, bundle2, a);
                    return;
                } catch (Throwable th10) {
                    th = th10;
                    anbh anbh14 = contentResolver;
                    th = th;
                    anbh = anbh14;
                    m63349a(syncResult, anbh, account, bundle, (Exception) null);
                    throw th;
                }
            }
            amvb amvb = new amvb(str6, str5);
            if (soz.m35807f(amve2.f75989c)) {
                Log.w("FSA2_ContactsSyncAdapter", "Restricted user profile, bailing out");
                anbh13 = contentResolver;
            } else if (m63350a(bundle)) {
                String str12 = account13.name;
                if (str12 != null) {
                    if (!str12.endsWith("@youtube.com")) {
                        ContentResolver.setIsSyncable(account13, "com.android.contacts", 1);
                        ContentResolver.setSyncAutomatically(account13, "com.android.contacts", true);
                        if (!cfxb.f185869a.mo6606a().mo82854c()) {
                            Bundle bundle5 = new Bundle();
                            bundle5.putBoolean("force", true);
                            bundle5.putBoolean("expedited", true);
                            ContentResolver.requestSync(account13, "com.android.contacts", bundle5);
                        }
                    }
                }
                Log.w("FSA2_ContactsSyncAdapter", "Done initializing new account, sync neither attempted nor performed");
                if (cfyk.m143810b()) {
                    anbh13 = contentResolver;
                    amwj amwj = new amwj(amve2.f75993g, anbh13, account13.name);
                    amwj.f76181a.mo40699d(amwj.f76183c, 2);
                    alsj alsj3 = amwj.f76181a;
                    String str13 = amwj.f76183c;
                    long currentTimeMillis2 = System.currentTimeMillis();
                    sdo.m34973b((String) null);
                    SharedPreferences.Editor edit = alsj3.f74200a.edit();
                    String valueOf5 = String.valueOf(str13);
                    edit.putLong(valueOf5.length() == 0 ? new String("focus_first_full_sync_initial_timestamp_") : "focus_first_full_sync_initial_timestamp_".concat(valueOf5), currentTimeMillis2).commit();
                    amwj.f76181a.mo40705i(amwj.f76183c);
                    amwj.f76181a.mo40706j(amwj.f76183c);
                    amwj.mo41483a(1);
                } else {
                    anbh13 = contentResolver;
                }
            } else {
                anbh13 = contentResolver;
                if (cfvu.m143235d()) {
                    if (bundle3.getBoolean("TRIGGERED_BY_CHARGING", false)) {
                        anbu a5 = amve2.f75994h.mo41674a(amve2.f75989c);
                        if (a5 != null && a5.f76599b) {
                        }
                    }
                }
                if (cfxe.f185877a.mo6606a().mo82884g() && bundle3 != null) {
                    if (bundle3.containsKey("REQUESTER") && "SYNC_CORE_SHEEPDOG_UI".equals(bundle3.get("REQUESTER"))) {
                        amdk.m62656a("FSA2_ContactsSyncAdapter", "Sync requested by contacts sync settings. Sleep %d milliseconds", Long.valueOf(cfxe.m143370i()));
                        Thread.sleep(cfxe.m143370i());
                    }
                }
                byte[] bArr = new byte[4];
                new SecureRandom().nextBytes(bArr);
                anbh13.f76557q = Base64.encodeToString(bArr, 0);
                amwk.INSTANCE.mo41485a(amve2.f75989c, account13, anbh13);
                amvm amvm = new amvm(amve2.f75992f, anbh13);
                amve2.f75995i = amvm;
                Context context2 = amve2.f75989c;
                ContentResolver contentResolver3 = amve2.f75990d;
                ampm ampm = amve2.f75991e;
                alsj alsj4 = amve2.f75993g;
                String f = spn.m35885f(rpr.m34216b());
                amig.m62939a();
                String bb = cfvk.f185780a.mo6606a().mo83001bb();
                if (!TextUtils.isEmpty(f)) {
                    str7 = ancm.m64011b(bb).concat(f);
                } else {
                    str7 = "";
                }
                bxvd da = btea.f148482d.mo74144da();
                bxvd da2 = btcb.f148246c.mo74144da();
                str4 = "FSA2_ContactsSyncAdapter";
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                btcb btcb = (btcb) da2.f164949b;
                "GMS FSA2".getClass();
                btcb.f148248a = "GMS FSA2";
                str7.getClass();
                btcb.f148249b = str7;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btcb btcb2 = (btcb) da2.mo74062i();
                btcb2.getClass();
                ((btea) da.f164949b).f148484a = btcb2;
                if (!Boolean.valueOf(cfvk.f185780a.mo6606a().mo82998bI()).booleanValue()) {
                    r4 = 0;
                } else {
                    bxvd da3 = btdz.f148478b.mo74144da();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    ((btdz) da3.f164949b).f148480a = true;
                    if (!da.f164950c) {
                        z5 = false;
                    } else {
                        da.mo74035c();
                        z5 = false;
                        da.f164950c = false;
                    }
                    btdz btdz = (btdz) da3.mo74062i();
                    btdz.getClass();
                    ((btea) da.f164949b).f148485b = btdz;
                    r4 = z5;
                }
                Boolean.valueOf(cfvk.f185780a.mo6606a().mo82927R()).booleanValue();
                alsj alsj5 = alsj4;
                i5 = account;
                amxt2 = amxt;
                anbh6 = anbh13;
                try {
                    amxt = new amxt(i5, bundle, context2, contentResolver3, anbh13, amvm, srb, ampm, alsj5, (btea) da.mo74062i(), amvb.f75985a, amvb.f75986b);
                    amxt.m63696a(amkb.BEFORE_SYNC);
                    amig.m62939a();
                    boolean booleanValue4 = Boolean.valueOf(cfvk.f185780a.mo6606a().mo82937aA()).booleanValue();
                    amxr amxr = amxt2.f76351i;
                    ? r9 = amxt2.f76348f;
                    i5 = r9;
                    if (r9 != 0) {
                        try {
                            ? r92 = r9.getBoolean("upload", r4);
                            i5 = r92;
                            if (r92 != 0) {
                                amvh a6 = amxr.f76336b.f76191a.mo41492a();
                                int i10 = a6.f76006a & 1;
                                String str14 = i10 != 0 ? a6.f76007b : null;
                                i5 = i10;
                                if (!TextUtils.isEmpty(str14)) {
                                    Context context3 = amxt2.f76349g;
                                    String str15 = amxt2.f76347e.name;
                                    aluj.m61900a(context3, "FSA2_Syncers", str15, (String) null, "@sync: Upload-only sync, skipping download");
                                    i5 = str15;
                                    try {
                                        amig.m62939a();
                                        max = Math.max(1, Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82948aL()).intValue());
                                        ? r11 = 0;
                                        account13 = account13;
                                        while (anbh4 < max) {
                                            long j2 = amxt2.f76353k.stats.numInserts + amxt2.f76353k.stats.numUpdates + amxt2.f76353k.stats.numDeletes;
                                            for (amxs amxs : amxt.f76343a) {
                                                amxs.mo41550b();
                                            }
                                            int i11 = ((amxt2.f76353k.stats.numInserts + amxt2.f76353k.stats.numUpdates + amxt2.f76353k.stats.numDeletes) > j2 ? 1 : ((amxt2.f76353k.stats.numInserts + amxt2.f76353k.stats.numUpdates + amxt2.f76353k.stats.numDeletes) == j2 ? 0 : -1));
                                            account13 = j2;
                                            if (i11 != 0) {
                                                account13 = j2;
                                                r11 = anbh4 + 1;
                                            }
                                        }
                                        if (amxt2.f76357o.mo66813a()) {
                                            try {
                                                ((amxh) amxt2.f76357o.mo66814b()).mo41519b(3, true);
                                            } catch (Throwable th11) {
                                                th = th11;
                                                amve2 = this;
                                                account13 = account;
                                                th2 = th;
                                                anbh4 = anbh6;
                                                if (booleanValue4) {
                                                }
                                                if (!cfvu.m143234c()) {
                                                }
                                                throw th2;
                                            }
                                        }
                                        if (booleanValue4) {
                                            try {
                                                amxt.m63696a(amkb.AFTER_SYNC);
                                            } catch (amyc e7) {
                                                amve2 = this;
                                                account4 = account;
                                                amyc2 = e7;
                                                anbh5 = anbh6;
                                            } catch (Exception e8) {
                                                account13 = account;
                                                exc = e8;
                                                anbh3 = anbh6;
                                                a = m63346a(exc, syncResult, anbh, bundle, account);
                                                amve = this;
                                                syncResult2 = syncResult;
                                                anbh2 = anbh;
                                                account3 = account;
                                                bundle2 = bundle;
                                                amve.m63349a(syncResult2, anbh2, account3, bundle2, a);
                                                return;
                                            } catch (Throwable th12) {
                                                th = th12;
                                                anbh = anbh6;
                                                m63349a(syncResult, anbh, account, bundle, (Exception) null);
                                                throw th;
                                            }
                                        } else {
                                            try {
                                                amxt.m63696a(amkb.AFTER_SYNC);
                                            } catch (Throwable th13) {
                                                th = th13;
                                                amve2 = this;
                                                account5 = account;
                                                anbh8 = anbh6;
                                                th2 = th;
                                                anbh4 = anbh8;
                                                i5 = i5;
                                                account13 = account5;
                                                if (booleanValue4) {
                                                }
                                                if (!cfvu.m143234c()) {
                                                }
                                                throw th2;
                                            }
                                        }
                                        try {
                                            if (cfvu.m143234c()) {
                                                bxvd da4 = ammw.f75402c.mo74144da();
                                                if (!amxt2.f76358p.f76599b) {
                                                    i6 = 3;
                                                } else {
                                                    i6 = 2;
                                                }
                                                if (da4.f164950c) {
                                                    da4.mo74035c();
                                                    da4.f164950c = false;
                                                }
                                                ammw ammw = (ammw) da4.f164949b;
                                                ammw.f75405b = i6 - 1;
                                                ammw.f75404a |= 1;
                                                amxt2.f76352j.mo41634a((ammw) da4.mo74062i());
                                            }
                                            if (!syncResult.hasError()) {
                                                amve2 = this;
                                                try {
                                                    account13 = account;
                                                    m63348a(amve2.f75989c, account13.name, "@onPerformSync Sync finished successfully");
                                                    anbh4 = anbh6;
                                                    try {
                                                        anbh4.f76553m = 9;
                                                        String str16 = account13.name;
                                                        sdo.m34959a((Object) str16);
                                                        amve2.f75993g.mo40696c(str16, 0);
                                                    } catch (amyc e9) {
                                                        e = e9;
                                                        anbh7 = anbh4;
                                                    } catch (Exception e10) {
                                                    } catch (Throwable th14) {
                                                    }
                                                } catch (amyc e11) {
                                                    e = e11;
                                                    anbh5 = anbh6;
                                                    account4 = account;
                                                    amyc2 = e;
                                                    i = 1;
                                                    String str1022 = str2;
                                                    a = m63346a(amyc.f76366a, syncResult, anbh, bundle, account);
                                                    i2 = anbh.f76553m;
                                                    if (i2 != 7) {
                                                    }
                                                    sdo.m34959a((Object) account2.name);
                                                    amig.m62939a();
                                                    alsj alsj222 = amve2.f75993g;
                                                    String str1122 = account2.name;
                                                    SharedPreferences sharedPreferences22 = alsj222.f74200a;
                                                    valueOf = String.valueOf(str1122);
                                                    if (valueOf.length() != 0) {
                                                    }
                                                    i3 = sharedPreferences22.getInt(str3, 0);
                                                    boolean booleanValue322 = Boolean.valueOf(cfvk.f185780a.mo6606a().mo82912C()).booleanValue();
                                                    int intValue32 = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82947aK()).intValue();
                                                    int intValue222 = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo83026c()).intValue();
                                                    if (i3 > 0) {
                                                    }
                                                    Object[] objArr22 = new Object[i];
                                                    objArr22[0] = Integer.valueOf(i3);
                                                    amdk.m62658a(str1022, "backoff=%d", objArr22);
                                                    amve2.f75993g.mo40696c(account2.name, i3);
                                                    if (i3 > 0) {
                                                    }
                                                    amve = this;
                                                    syncResult2 = syncResult;
                                                    anbh2 = anbh;
                                                    account3 = account;
                                                    bundle2 = bundle;
                                                    amve.m63349a(syncResult2, anbh2, account3, bundle2, a);
                                                    return;
                                                } catch (Exception e12) {
                                                    e = e12;
                                                    account13 = account;
                                                    anbh3 = anbh6;
                                                    exc = e;
                                                    a = m63346a(exc, syncResult, anbh, bundle, account);
                                                    amve = this;
                                                    syncResult2 = syncResult;
                                                    anbh2 = anbh;
                                                    account3 = account;
                                                    bundle2 = bundle;
                                                    amve.m63349a(syncResult2, anbh2, account3, bundle2, a);
                                                    return;
                                                } catch (Throwable th15) {
                                                    th = th15;
                                                    anbh = anbh6;
                                                    th = th;
                                                    m63349a(syncResult, anbh, account, bundle, (Exception) null);
                                                    throw th;
                                                }
                                            } else {
                                                anbh4 = anbh6;
                                                Context context4 = this.f75989c;
                                                String str17 = account.name;
                                                String valueOf6 = String.valueOf(syncResult.toDebugString());
                                                m63352b(context4, str17, valueOf6.length() == 0 ? new String("@onPerformSync Sync finished with errors. sync result: ") : "@onPerformSync Sync finished with errors. sync result: ".concat(valueOf6));
                                                anbh4.f76553m = 8;
                                            }
                                            amve = this;
                                            syncResult2 = syncResult;
                                            anbh2 = anbh4;
                                            account3 = account;
                                            bundle2 = bundle;
                                            a = null;
                                        } catch (amyc e13) {
                                            e = e13;
                                            amve2 = this;
                                            anbh5 = anbh6;
                                            account4 = account;
                                            amyc2 = e;
                                            i = 1;
                                            String str10222 = str2;
                                            a = m63346a(amyc.f76366a, syncResult, anbh, bundle, account);
                                            i2 = anbh.f76553m;
                                            if (i2 != 7) {
                                            }
                                            sdo.m34959a((Object) account2.name);
                                            amig.m62939a();
                                            alsj alsj2222 = amve2.f75993g;
                                            String str11222 = account2.name;
                                            SharedPreferences sharedPreferences222 = alsj2222.f74200a;
                                            valueOf = String.valueOf(str11222);
                                            if (valueOf.length() != 0) {
                                            }
                                            i3 = sharedPreferences222.getInt(str3, 0);
                                            boolean booleanValue3222 = Boolean.valueOf(cfvk.f185780a.mo6606a().mo82912C()).booleanValue();
                                            int intValue322 = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82947aK()).intValue();
                                            int intValue2222 = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo83026c()).intValue();
                                            if (i3 > 0) {
                                            }
                                            Object[] objArr222 = new Object[i];
                                            objArr222[0] = Integer.valueOf(i3);
                                            amdk.m62658a(str10222, "backoff=%d", objArr222);
                                            amve2.f75993g.mo40696c(account2.name, i3);
                                            if (i3 > 0) {
                                            }
                                            amve = this;
                                            syncResult2 = syncResult;
                                            anbh2 = anbh;
                                            account3 = account;
                                            bundle2 = bundle;
                                            amve.m63349a(syncResult2, anbh2, account3, bundle2, a);
                                            return;
                                        } catch (Exception e14) {
                                            e = e14;
                                            account13 = account;
                                            anbh3 = anbh6;
                                            exc = e;
                                            a = m63346a(exc, syncResult, anbh, bundle, account);
                                            amve = this;
                                            syncResult2 = syncResult;
                                            anbh2 = anbh;
                                            account3 = account;
                                            bundle2 = bundle;
                                            amve.m63349a(syncResult2, anbh2, account3, bundle2, a);
                                            return;
                                        } catch (Throwable th16) {
                                            th = th16;
                                            anbh = anbh6;
                                            th = th;
                                            m63349a(syncResult, anbh, account, bundle, (Exception) null);
                                            throw th;
                                        }
                                        amve.m63349a(syncResult2, anbh2, account3, bundle2, a);
                                        return;
                                    } catch (Throwable th17) {
                                        th = th17;
                                        amve2 = this;
                                        account13 = account;
                                        account6 = i5;
                                        anbh8 = anbh6;
                                        i5 = account6;
                                        account5 = account13;
                                        th2 = th;
                                        anbh4 = anbh8;
                                        i5 = i5;
                                        account13 = account5;
                                        if (booleanValue4) {
                                        }
                                        if (!cfvu.m143234c()) {
                                        }
                                        throw th2;
                                    }
                                }
                            }
                        } catch (Throwable th18) {
                            th = th18;
                            z4 = booleanValue;
                            th2 = th;
                            anbh4 = anbh6;
                            i5 = z4;
                            if (booleanValue4) {
                                amxt.m63696a(amkb.AFTER_SYNC);
                            }
                            if (!cfvu.m143234c()) {
                                bxvd da5 = ammw.f75402c.mo74144da();
                                int i12 = !amxt2.f76358p.f76599b ? 3 : 2;
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                ammw ammw2 = (ammw) da5.f164949b;
                                ammw2.f75405b = i12 - 1;
                                i5 = 1;
                                ammw2.f75404a |= 1;
                                amxt2.f76352j.mo41634a((ammw) da5.mo74062i());
                            }
                            throw th2;
                        }
                    }
                    try {
                        amxr amxr2 = amxt2.f76351i;
                        amig.m62939a();
                        booleanValue = ((Boolean) amhy.f74927a.mo41191a()).booleanValue();
                        if (booleanValue) {
                            long currentTimeMillis3 = System.currentTimeMillis() - amxr2.f76336b.mo41486a();
                            amig.m62939a();
                            long longValue = Long.valueOf(cfvk.f185780a.mo6606a().mo82956aT()).longValue() * 1000;
                            int i13 = (currentTimeMillis3 > longValue ? 1 : (currentTimeMillis3 == longValue ? 0 : -1));
                            booleanValue = longValue;
                            if (i13 > 0) {
                                amig.m62939a();
                                booleanValue = Boolean.valueOf(cfvk.f185780a.mo6606a().mo83006bg()).booleanValue();
                                if (booleanValue != 0) {
                                    anbu anbu = amxr2.f76337c;
                                    boolean z6 = anbu.f76599b;
                                    booleanValue = anbu;
                                    if (!z6) {
                                        int i14 = anbu.f76600c;
                                        amig.m62939a();
                                        booleanValue = i14;
                                        if (i14 < Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82994bE()).intValue()) {
                                            int i15 = Build.VERSION.SDK_INT;
                                            Log.w("FSA2_SyncAssistant", "Delay periodic full sync until charging.");
                                            Account account14 = amxr2.f76335a;
                                            SyncRequest.Builder builder = new SyncRequest.Builder();
                                            builder.setSyncAdapter(account14, "com.android.contacts");
                                            builder.setRequiresCharging(true);
                                            builder.setIgnoreBackoff(true);
                                            builder.setExtras(new Bundle());
                                            builder.syncOnce();
                                            ContentResolver.requestSync(builder.build());
                                            booleanValue = builder;
                                        }
                                    }
                                }
                                Log.w("FSA2_SyncAssistant", "Trigger periodic full sync.");
                                amwl amwl = amxr2.f76336b;
                                long currentTimeMillis4 = System.currentTimeMillis();
                                Object[] objArr3 = new Object[1];
                                objArr3[r4] = Long.valueOf(currentTimeMillis4);
                                amdk.m62658a("FSA2_PeopleSyncState", "@resetToFullSync = %d", objArr3);
                                amvh a7 = amwl.f76191a.mo41492a();
                                bxvd bxvd = (bxvd) a7.mo74142c(5);
                                bxvd.mo73625a((GeneratedMessageLite) a7);
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = r4;
                                }
                                amvh amvh = (amvh) bxvd.f164949b;
                                amvh amvh2 = amvh.f76004g;
                                amvh.f76006a &= -5;
                                amvh.f76009d = amvh.f76004g.f76009d;
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = r4;
                                }
                                amvh amvh3 = (amvh) bxvd.f164949b;
                                amvh3.f76006a &= -9;
                                amvh3.f76010e = amvh.f76004g.f76010e;
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = r4;
                                }
                                amvh amvh4 = (amvh) bxvd.f164949b;
                                amvh4.f76006a &= -2;
                                amvh4.f76007b = amvh.f76004g.f76007b;
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = r4;
                                }
                                amvh amvh5 = (amvh) bxvd.f164949b;
                                amvh5.f76006a &= -3;
                                amvh5.f76008c = amvh.f76004g.f76008c;
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = r4;
                                }
                                amvh amvh6 = (amvh) bxvd.f164949b;
                                amvh6.f76006a |= 32;
                                amvh6.f76011f = currentTimeMillis4;
                                amwl.mo41488a((amvh) bxvd.mo74062i());
                                booleanValue = booleanValue;
                            }
                        }
                        String str18 = amxt2.f76350h;
                        if (str18 != null) {
                            try {
                                amig.m62939a();
                                Long valueOf7 = Long.valueOf(cfvk.f185780a.mo6606a().mo82991bB());
                                i5 = valueOf7.longValue();
                                if (i5 > 0) {
                                    try {
                                        amvm amvm2 = amxt2.f76354l;
                                        amvm2.mo41389a();
                                        Thread.sleep(valueOf7.longValue());
                                        amxt2.f76354l.mo41389a();
                                        i5 = amvm2;
                                        i5 = amvm2;
                                    } catch (InterruptedException e15) {
                                        i5 = i5;
                                    }
                                }
                            } catch (Throwable th19) {
                                th = th19;
                                i5 = i5;
                                account12 = account13;
                            }
                        }
                        try {
                            if (!cfxy.m143781c()) {
                                if (str18 != null) {
                                    if (!str18.equals(amxt2.f76356n)) {
                                    }
                                }
                                amxt.f76344b.mo41548a();
                                amxt.f76345c.mo41554a();
                            } else {
                                if (str18 != null) {
                                    if (!str18.startsWith(amxt2.f76356n)) {
                                    }
                                }
                                amxt.f76344b.mo41548a();
                                amxt.f76345c.mo41554a();
                            }
                            amxp amxp = amxt.f76346d;
                            amig.m62939a();
                            if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo82942aF()).booleanValue()) {
                                Account account15 = amxp.f76339i;
                                ContentResolver contentResolver4 = amxp.f76338h;
                                amvt amvt = amxp.f76314b;
                                amvm amvm3 = amxp.f76341k;
                                Cursor a8 = amyu.m63741a(account15, contentResolver4, "mimetype='vnd.android.cursor.item/photo' AND data_sync2 IS NOT NULL AND starred=1");
                                amig.m62939a();
                                int intValue4 = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo83018bs()).intValue();
                                amyu.m63742a(a8, amvt, amvm3, intValue4);
                                i5 = intValue4;
                                i5 = intValue4;
                            }
                            if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo83023bx()).booleanValue()) {
                                if (amxp.f76313a.f76599b) {
                                    z2 = true;
                                    amig.m62939a();
                                    if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo82965ac()).booleanValue()) {
                                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) amxp.f76317e.getSystemService("connectivity")).getActiveNetworkInfo();
                                        if (activeNetworkInfo != null) {
                                            z3 = activeNetworkInfo.getType() == 1;
                                            i5 = "mimetype='vnd.android.cursor.item/photo' AND data15 IS NOT NULL";
                                            if (z2 || z3) {
                                                amig.m62939a();
                                                int intValue5 = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo83000ba()).intValue();
                                                a2 = amxp.mo41551a((String) i5);
                                                if (a2 >= 0) {
                                                    if (a2 <= intValue5) {
                                                        if (!z2) {
                                                            Account account16 = amxp.f76339i;
                                                            ContentResolver contentResolver5 = amxp.f76338h;
                                                            amvt amvt2 = amxp.f76314b;
                                                            amvm amvm4 = amxp.f76341k;
                                                            Cursor a9 = amyu.m63741a(account16, contentResolver5, "mimetype='vnd.android.cursor.item/photo' AND data_sync2 IS NOT NULL AND (data_sync3 IS NULL OR data_sync3!=data_sync2)");
                                                            amig.m62939a();
                                                            amyu.m63742a(a9, amvt2, amvm4, Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82943aG()).intValue());
                                                        } else {
                                                            Account account17 = amxp.f76339i;
                                                            ContentResolver contentResolver6 = amxp.f76338h;
                                                            amvt amvt3 = amxp.f76314b;
                                                            amvm amvm5 = amxp.f76341k;
                                                            Cursor a10 = amyu.m63741a(account17, contentResolver6, "mimetype='vnd.android.cursor.item/photo' AND data_sync2 IS NOT NULL");
                                                            amig.m62939a();
                                                            amyu.m63742a(a10, amvt3, amvm5, Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82941aE()).intValue());
                                                        }
                                                    }
                                                }
                                            }
                                            ContentResolver contentResolver7 = amxp.f76338h;
                                            Uri uri = amxp.f76316d;
                                            amwr amwr = amxp.f76319g;
                                            anaz anaz = amxp.f76340j;
                                            ? r112 = amxp.f76341k;
                                            bmxv bmxv = amxp.f76318f;
                                            String[] strArr2 = amwa.f76155b;
                                            String[] strArr3 = amvt.f76137a;
                                            query = contentResolver7.query(uri, strArr2, "mimetype='vnd.android.cursor.item/photo' AND data_sync2 IS NOT NULL AND (data_sync3 IS NULL OR data_sync3!=data_sync2)", null, null);
                                            if (query != null) {
                                                amwa amwa = new amwa(query, amwr, anaz, r112, bmxv);
                                                try {
                                                    amxp.mo41552a((amvx) amwa, true);
                                                    if (((Boolean) amfp.f74866a.mo41191a()).booleanValue()) {
                                                        amwa.mo41472f();
                                                    }
                                                    amyw amyw = amxp.f76315c;
                                                    boolean b = cfws.m143321b();
                                                    if (!cfws.f185853a.mo6606a().mo82839a()) {
                                                        str8 = "mimetype='vnd.android.cursor.item/photo' AND data_sync1 LIKE '%REGENERATE_HASH_KEY%'";
                                                    } else {
                                                        str8 = amyv.f76413a;
                                                    }
                                                    int i16 = 0;
                                                    int i17 = r4;
                                                    while (((long) i16) < cfws.f185853a.mo6606a().mo82841c()) {
                                                        ContentResolver contentResolver8 = amyw.f76416b;
                                                        Uri a11 = amvt.m63471a(ContactsContract.Data.CONTENT_URI, amyw.f76415a);
                                                        if (cfws.m143321b()) {
                                                            a11 = a11.buildUpon().appendQueryParameter("limit", Long.toString(cfws.f185853a.mo6606a().mo82840b())).build();
                                                        }
                                                        int i18 = i16;
                                                        Cursor query3 = contentResolver8.query(a11, amyv.f76414b, str8, null, null);
                                                        if (query3 != null) {
                                                            if (b) {
                                                                try {
                                                                    if (query3.getCount() == 0) {
                                                                        query3.close();
                                                                        if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo82924O()).booleanValue()) {
                                                                            try {
                                                                                amxp.mo41553a((String) i5, amjf.PHOTO);
                                                                                amxp.mo41553a("mimetype='vnd.android.cursor.item/photo' AND data15 IS NOT NULL AND data14 IS NOT NULL", amjf.PHOTO_HIGH_RES);
                                                                            } catch (Throwable th20) {
                                                                                th = th20;
                                                                                amve2 = this;
                                                                                account12 = account;
                                                                            }
                                                                        }
                                                                        amxt2.mo41555a(true);
                                                                        account13 = account13;
                                                                        if (cfwp.f185848a.mo6606a().mo82836b()) {
                                                                            try {
                                                                                amxt.m63696a(amkb.BETWEEN_SYNC_DOWN_AND_SYNC_UP);
                                                                                account13 = account13;
                                                                            } catch (Throwable th21) {
                                                                                th = th21;
                                                                            }
                                                                        }
                                                                        amig.m62939a();
                                                                        max = Math.max(1, Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82948aL()).intValue());
                                                                        ? r113 = 0;
                                                                        account13 = account13;
                                                                        while (anbh4 < max) {
                                                                        }
                                                                        if (amxt2.f76357o.mo66813a()) {
                                                                        }
                                                                        if (booleanValue4) {
                                                                        }
                                                                        if (cfvu.m143234c()) {
                                                                        }
                                                                        if (!syncResult.hasError()) {
                                                                        }
                                                                        amve = this;
                                                                        syncResult2 = syncResult;
                                                                        anbh2 = anbh4;
                                                                        account3 = account;
                                                                        bundle2 = bundle;
                                                                        a = null;
                                                                        amve.m63349a(syncResult2, anbh2, account3, bundle2, a);
                                                                        return;
                                                                    }
                                                                } catch (Throwable th22) {
                                                                    th = th22;
                                                                    account10 = account13;
                                                                    anbh11 = anbh6;
                                                                    account13 = account10;
                                                                    th4 = th;
                                                                    r112 = anbh11;
                                                                    account11 = account13;
                                                                    if (query3 != null) {
                                                                    }
                                                                    throw th4;
                                                                }
                                                            }
                                                            while (query3.moveToNext()) {
                                                                try {
                                                                    amyw.f76418d.mo41389a();
                                                                    long j3 = query3.getLong(i17);
                                                                    String string = query3.getString(1);
                                                                    byte[] blob = query3.getBlob(2);
                                                                    long j4 = query3.getLong(3);
                                                                    Long valueOf8 = Long.valueOf(query3.getLong(4));
                                                                    String str19 = str8;
                                                                    if (anau.m63868a(Long.valueOf(j4), valueOf8)) {
                                                                        str9 = amwx.m63589a(string, Long.toString(amyw.m63743a(blob)));
                                                                    } else {
                                                                        str9 = amwx.m63589a(string, "*");
                                                                    }
                                                                    amyw.f76417c.mo41450a(amvz.m63510a(j3, j4).withValue("data_sync1", str9).withValue("data_sync4", Long.valueOf(valueOf8.longValue() + 1)));
                                                                    amyw.f76417c.mo41449a();
                                                                    amve2 = this;
                                                                    account13 = account;
                                                                    str8 = str19;
                                                                    i17 = 0;
                                                                } catch (Throwable th23) {
                                                                    amve2 = this;
                                                                    account11 = account;
                                                                    th4 = th23;
                                                                    r112 = anbh6;
                                                                    if (query3 != null) {
                                                                        query3.close();
                                                                    }
                                                                    throw th4;
                                                                }
                                                            }
                                                            String str20 = str8;
                                                            try {
                                                                amyw.f76417c.mo41451b();
                                                                if (!b) {
                                                                    try {
                                                                        query3.close();
                                                                        if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo82924O()).booleanValue()) {
                                                                        }
                                                                        amxt2.mo41555a(true);
                                                                        account13 = account13;
                                                                        if (cfwp.f185848a.mo6606a().mo82836b()) {
                                                                        }
                                                                        amig.m62939a();
                                                                        max = Math.max(1, Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82948aL()).intValue());
                                                                        ? r1132 = 0;
                                                                        account13 = account13;
                                                                        while (anbh4 < max) {
                                                                        }
                                                                        if (amxt2.f76357o.mo66813a()) {
                                                                        }
                                                                        if (booleanValue4) {
                                                                        }
                                                                        if (cfvu.m143234c()) {
                                                                        }
                                                                        if (!syncResult.hasError()) {
                                                                        }
                                                                        amve = this;
                                                                        syncResult2 = syncResult;
                                                                        anbh2 = anbh4;
                                                                        account3 = account;
                                                                        bundle2 = bundle;
                                                                        a = null;
                                                                        amve.m63349a(syncResult2, anbh2, account3, bundle2, a);
                                                                        return;
                                                                    } catch (Throwable th24) {
                                                                        th = th24;
                                                                        amve2 = this;
                                                                        account9 = account;
                                                                        anbh10 = anbh6;
                                                                        i5 = i5;
                                                                        account8 = account9;
                                                                        th3 = th;
                                                                        anbh9 = anbh10;
                                                                        z = i5;
                                                                        account7 = account8;
                                                                        try {
                                                                            amxt2.mo41555a(false);
                                                                            throw th3;
                                                                        } catch (Throwable th25) {
                                                                            th = th25;
                                                                            anbh8 = anbh9;
                                                                            i5 = z;
                                                                            account5 = account7;
                                                                            th2 = th;
                                                                            anbh4 = anbh8;
                                                                            i5 = i5;
                                                                            account13 = account5;
                                                                            if (booleanValue4) {
                                                                            }
                                                                            if (!cfvu.m143234c()) {
                                                                            }
                                                                            throw th2;
                                                                        }
                                                                    }
                                                                } else {
                                                                    amve2 = this;
                                                                    account13 = account;
                                                                    r112 = anbh6;
                                                                    query3.close();
                                                                    i16 = i18 + 1;
                                                                    anbh6 = r112;
                                                                    i17 = 0;
                                                                    str8 = str20;
                                                                }
                                                            } catch (Throwable th26) {
                                                                th = th26;
                                                                amve2 = this;
                                                                account10 = account;
                                                                anbh11 = anbh6;
                                                                account13 = account10;
                                                                th4 = th;
                                                                r112 = anbh11;
                                                                account11 = account13;
                                                                if (query3 != null) {
                                                                }
                                                                throw th4;
                                                            }
                                                        } else {
                                                            anbh11 = anbh6;
                                                            try {
                                                                throw new amyc(new RemoteException("Cannot query CP2."));
                                                            } catch (Throwable th27) {
                                                                th = th27;
                                                                th4 = th;
                                                                r112 = anbh11;
                                                                account11 = account13;
                                                                if (query3 != null) {
                                                                }
                                                                throw th4;
                                                            }
                                                        }
                                                    }
                                                    Log.e("FSA2_PhotoHashKeyWriter", "There might still photos need to regenerate hash key. Will do in next sync.");
                                                    throw new amyc(new RemoteException("Too many photos when generating hash key."));
                                                } catch (Throwable th28) {
                                                    th = th28;
                                                    anbh10 = r112;
                                                    account8 = account13;
                                                    th3 = th;
                                                    anbh9 = anbh10;
                                                    z = i5;
                                                    account7 = account8;
                                                    amxt2.mo41555a(false);
                                                    throw th3;
                                                }
                                            } else {
                                                Log.e("FSA2_SyncDownPhotoCursor", "Failed to query photos need to sync down in CP2");
                                                throw new amyc(new RemoteException("Unable to query CP2."));
                                            }
                                        }
                                    }
                                    z3 = false;
                                    i5 = "mimetype='vnd.android.cursor.item/photo' AND data15 IS NOT NULL";
                                    amig.m62939a();
                                    int intValue52 = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo83000ba()).intValue();
                                    a2 = amxp.mo41551a((String) i5);
                                    if (a2 >= 0) {
                                    }
                                    ContentResolver contentResolver72 = amxp.f76338h;
                                    Uri uri2 = amxp.f76316d;
                                    amwr amwr2 = amxp.f76319g;
                                    anaz anaz2 = amxp.f76340j;
                                    ? r1122 = amxp.f76341k;
                                    bmxv bmxv2 = amxp.f76318f;
                                    String[] strArr22 = amwa.f76155b;
                                    String[] strArr32 = amvt.f76137a;
                                    query = contentResolver72.query(uri2, strArr22, "mimetype='vnd.android.cursor.item/photo' AND data_sync2 IS NOT NULL AND (data_sync3 IS NULL OR data_sync3!=data_sync2)", null, null);
                                    if (query != null) {
                                    }
                                }
                            }
                            z2 = false;
                            amig.m62939a();
                            if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo82965ac()).booleanValue()) {
                            }
                            z3 = false;
                            i5 = "mimetype='vnd.android.cursor.item/photo' AND data15 IS NOT NULL";
                            amig.m62939a();
                            int intValue522 = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo83000ba()).intValue();
                            a2 = amxp.mo41551a((String) i5);
                            if (a2 >= 0) {
                            }
                            ContentResolver contentResolver722 = amxp.f76338h;
                            Uri uri22 = amxp.f76316d;
                            amwr amwr22 = amxp.f76319g;
                            anaz anaz22 = amxp.f76340j;
                            ? r11222 = amxp.f76341k;
                            bmxv bmxv22 = amxp.f76318f;
                            String[] strArr222 = amwa.f76155b;
                            String[] strArr322 = amvt.f76137a;
                            query = contentResolver722.query(uri22, strArr222, "mimetype='vnd.android.cursor.item/photo' AND data_sync2 IS NOT NULL AND (data_sync3 IS NULL OR data_sync3!=data_sync2)", null, null);
                            if (query != null) {
                            }
                        } catch (Throwable th29) {
                            th = th29;
                            i5 = i5;
                            account9 = account13;
                            anbh10 = anbh6;
                            i5 = i5;
                            account8 = account9;
                            th3 = th;
                            anbh9 = anbh10;
                            z = i5;
                            account7 = account8;
                            amxt2.mo41555a(false);
                            throw th3;
                        }
                    } catch (Throwable th30) {
                        th = th30;
                        account6 = i5;
                        anbh8 = anbh6;
                        i5 = account6;
                        account5 = account13;
                        th2 = th;
                        anbh4 = anbh8;
                        i5 = i5;
                        account13 = account5;
                        if (booleanValue4) {
                        }
                        if (!cfvu.m143234c()) {
                        }
                        throw th2;
                    }
                } catch (amyc e16) {
                    e = e16;
                    anbh7 = anbh6;
                    amyc2 = e;
                    account4 = account13;
                    anbh5 = anbh7;
                    i = 1;
                    String str102222 = str2;
                    a = m63346a(amyc.f76366a, syncResult, anbh, bundle, account);
                    i2 = anbh.f76553m;
                    if (i2 != 7) {
                    }
                    sdo.m34959a((Object) account2.name);
                    amig.m62939a();
                    alsj alsj22222 = amve2.f75993g;
                    String str112222 = account2.name;
                    SharedPreferences sharedPreferences2222 = alsj22222.f74200a;
                    valueOf = String.valueOf(str112222);
                    if (valueOf.length() != 0) {
                    }
                    i3 = sharedPreferences2222.getInt(str3, 0);
                    boolean booleanValue32222 = Boolean.valueOf(cfvk.f185780a.mo6606a().mo82912C()).booleanValue();
                    int intValue3222 = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82947aK()).intValue();
                    int intValue22222 = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo83026c()).intValue();
                    if (i3 > 0) {
                    }
                    Object[] objArr2222 = new Object[i];
                    objArr2222[0] = Integer.valueOf(i3);
                    amdk.m62658a(str102222, "backoff=%d", objArr2222);
                    amve2.f75993g.mo40696c(account2.name, i3);
                    if (i3 > 0) {
                    }
                    amve = this;
                    syncResult2 = syncResult;
                    anbh2 = anbh;
                    account3 = account;
                    bundle2 = bundle;
                    amve.m63349a(syncResult2, anbh2, account3, bundle2, a);
                    return;
                } catch (Exception e17) {
                } catch (Throwable th31) {
                }
            }
            m63348a(amve2.f75989c, account13.name, "@onPerformSync Sync is not required and hence skipped.");
            anbh13.f76553m = 10;
            anbh4 = anbh13;
            amve = this;
            syncResult2 = syncResult;
            anbh2 = anbh4;
            account3 = account;
            bundle2 = bundle;
            a = null;
            amve.m63349a(syncResult2, anbh2, account3, bundle2, a);
            return;
        } catch (amyc e18) {
            e = e18;
            str4 = "FSA2_ContactsSyncAdapter";
            anbh4 = anbh13;
            i4 = 1;
            amyc = e;
            account2 = account13;
            i = i4;
            String str1022222 = str2;
            a = m63346a(amyc.f76366a, syncResult, anbh, bundle, account);
            i2 = anbh.f76553m;
            if (i2 != 7) {
            }
            sdo.m34959a((Object) account2.name);
            amig.m62939a();
            alsj alsj222222 = amve2.f75993g;
            String str1122222 = account2.name;
            SharedPreferences sharedPreferences22222 = alsj222222.f74200a;
            valueOf = String.valueOf(str1122222);
            if (valueOf.length() != 0) {
            }
            i3 = sharedPreferences22222.getInt(str3, 0);
            boolean booleanValue322222 = Boolean.valueOf(cfvk.f185780a.mo6606a().mo82912C()).booleanValue();
            int intValue32222 = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82947aK()).intValue();
            int intValue222222 = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo83026c()).intValue();
            if (i3 > 0) {
            }
            Object[] objArr22222 = new Object[i];
            objArr22222[0] = Integer.valueOf(i3);
            amdk.m62658a(str1022222, "backoff=%d", objArr22222);
            amve2.f75993g.mo40696c(account2.name, i3);
            if (i3 > 0) {
            }
            amve = this;
            syncResult2 = syncResult;
            anbh2 = anbh;
            account3 = account;
            bundle2 = bundle;
            amve.m63349a(syncResult2, anbh2, account3, bundle2, a);
            return;
        } catch (Exception e19) {
        } catch (Throwable th32) {
        }
        th3 = th;
        anbh9 = anbh6;
        z = i5;
        account7 = account12;
        amxt2.mo41555a(false);
        throw th3;
    }
}
