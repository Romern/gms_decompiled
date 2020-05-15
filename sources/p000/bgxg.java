package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Base64;
import android.util.Pair;
import com.google.android.chimera.SettingInjectorService;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbCorruptionException;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.places.NearbyAlertFilter;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.location.reporting.collectors.HomeWorkNearbyAlertsHelper$NearbyAlertReceiver;
import com.google.android.location.reporting.collectors.PowerModeReceiver;
import com.google.android.location.reporting.service.LocationReportingController$WifiStatusReceiver;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.ReportingConfig;
import com.google.android.ulr.ApiActivationChange;
import com.google.android.ulr.ApiInternalState;
import com.google.android.ulr.ApiLocationStatus;
import com.google.android.ulr.ApiMetadata;
import com.google.android.ulr.ApiRate;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bgxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgxg {

    /* renamed from: a */
    public final sqv f117889a;

    /* renamed from: b */
    public final bguh f117890b;

    /* renamed from: c */
    public final bgye f117891c;

    /* renamed from: d */
    public final bgyf f117892d;

    /* renamed from: e */
    public final aesh f117893e;

    /* renamed from: f */
    public final bgto f117894f;

    /* renamed from: g */
    public final bgua f117895g;

    /* renamed from: h */
    public int f117896h = 2;

    /* renamed from: i */
    public final bgxf f117897i;

    /* renamed from: j */
    public final rjx f117898j;

    /* renamed from: k */
    private final Context f117899k;

    /* renamed from: l */
    private final bguc f117900l;

    /* renamed from: m */
    private final bgyg f117901m;

    /* renamed from: n */
    private final bgwp f117902n;

    /* renamed from: o */
    private final bgtv f117903o;

    /* renamed from: p */
    private final bgyc f117904p;

    /* renamed from: q */
    private final bgyv f117905q;

    /* renamed from: r */
    private final bgtz f117906r;

    /* renamed from: s */
    private final bhbr f117907s;

    /* renamed from: t */
    private PowerModeReceiver f117908t;

    /* renamed from: u */
    private LocationReportingController$WifiStatusReceiver f117909u;

    /* renamed from: v */
    private final bgyh f117910v;

    /* renamed from: w */
    private final rjx f117911w;

    public bgxg(Context context, sqv sqv, bguc bguc, bguh bguh, bgyg bgyg, bgye bgye, bgyf bgyf, aesh aesh, rjx rjx, bgtv bgtv, bgwp bgwp, bgyc bgyc, bgyv bgyv, bgto bgto, bgua bgua, rjx rjx2, bgtz bgtz) {
        this.f117899k = context;
        this.f117889a = sqv;
        this.f117900l = bguc;
        this.f117890b = bguh;
        this.f117901m = bgyg;
        this.f117891c = bgye;
        this.f117892d = bgyf;
        this.f117893e = aesh;
        this.f117898j = rjx;
        this.f117902n = bgwp;
        this.f117903o = bgtv;
        this.f117904p = bgyc;
        this.f117905q = bgyv;
        this.f117894f = bgto;
        bgxf bgxf = this.f117897i;
        this.f117897i = bgxf == null ? new bgxf(this) : bgxf;
        this.f117911w = rjx2;
        this.f117895g = bgua;
        this.f117906r = bgtz;
        this.f117907s = bhbr.m100591a(context);
        this.f117910v = bgyh.m100364a(context);
    }

    /* renamed from: a */
    public static PendingIntent m100217a(Context context, Intent intent) {
        return PendingIntent.getService(context, 0, intent, 134217728);
    }

    /* renamed from: d */
    private final boolean m100220d() {
        ReportingConfig m = this.f117892d.mo63395m();
        if (m == null) {
            String valueOf = String.valueOf(this.f117892d);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
            sb.append("Skipping FLP amnesia test: no oldConfig in ");
            sb.append(valueOf);
            sb.toString();
            return false;
        } else if (m.mo70930d()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: e */
    private final synchronized void m100221e() {
        LocationReportingController$WifiStatusReceiver locationReportingController$WifiStatusReceiver = this.f117909u;
        if (locationReportingController$WifiStatusReceiver != null) {
            try {
                this.f117899k.unregisterReceiver(locationReportingController$WifiStatusReceiver);
                this.f117909u = null;
            } catch (IllegalArgumentException e) {
                bgur.m100025c("GCoreUlr", "Try to unregister a  wifi status receiver before register it!");
            }
        }
    }

    /* renamed from: f */
    private final boolean m100222f() {
        return !chcs.f188354a.mo6606a().mo85114q() || this.f117891c.f118000b.f118032a.getInt("location_enabled_key", 3) != 0;
    }

    /* renamed from: a */
    public final boolean mo63315a() {
        LocationReportingController$WifiStatusReceiver locationReportingController$WifiStatusReceiver = this.f117909u;
        return locationReportingController$WifiStatusReceiver != null && locationReportingController$WifiStatusReceiver.f150881a;
    }

    /* renamed from: b */
    public final void mo63316b() {
        this.f117903o.mo63166a();
        PowerModeReceiver powerModeReceiver = this.f117908t;
        if (powerModeReceiver != null) {
            this.f117899k.unregisterReceiver(powerModeReceiver);
            this.f117908t = null;
        }
        PendingIntent a = m100218a("com.google.android.location.reporting.ACTION_LOCATION");
        aesh aesh = this.f117893e;
        if (aesh != null) {
            aesh.mo34504a(a);
        } else {
            this.f117898j.mo24739c(a);
        }
        a.cancel();
        PendingIntent a2 = m100218a("com.google.android.location.reporting.ACTION_IMMEDIATE_LOCATION");
        a2.cancel();
        this.f117911w.mo24679a(m100218a("com.google.android.location.reporting.ACTION_ACTIVITY"));
        a2.cancel();
        this.f117892d.mo63376a((bgya) null);
        m100221e();
        this.f117894f.mo63157a();
        this.f117895g.mo63171a();
        bgur.m100011a("GCoreUlr", "Unbound from all signal providers.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo63318c() {
        if (this.f117909u == null) {
            LocationReportingController$WifiStatusReceiver locationReportingController$WifiStatusReceiver = new LocationReportingController$WifiStatusReceiver(this);
            this.f117909u = locationReportingController$WifiStatusReceiver;
            Context context = this.f117899k;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            context.registerReceiver(locationReportingController$WifiStatusReceiver, intentFilter);
            bgur.m100011a("GCoreUlr", "Registered for wifi state change updates");
        }
    }

    /* renamed from: a */
    private final PendingIntent m100218a(String str) {
        return m100217a(this.f117899k, bgxx.m100271a(this.f117899k, str));
    }

    /* renamed from: a */
    private final void m100219a(ReportingConfig reportingConfig, ApiRate apiRate) {
        this.f117890b.mo63202a(reportingConfig.mo70928b(), new Pair(bgzr.m100488a(apiRate), null), "ApiRate");
    }

    /* renamed from: c */
    public final void mo63319c(int i) {
        ApiInternalState apiInternalState = new ApiInternalState(Integer.valueOf(i));
        bvwq bvwq = null;
        ApiMetadata apiMetadata = new ApiMetadata(null, null, apiInternalState, null, null, null, null, null, Long.valueOf(System.currentTimeMillis()), null, null);
        if (chcp.m148193b() && chcp.m148195d()) {
            bxvd da = bvwk.f157947c.mo74144da();
            if (apiInternalState.mo71521b() != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwk bvwk = (bvwk) da.f164949b;
                bvwk.f157949a |= 1;
                bvwk.f157950b = i;
            }
            bvwk bvwk2 = (bvwk) da.mo74062i();
            long currentTimeMillis = System.currentTimeMillis();
            bxvd da2 = bvwq.f157983r.mo74144da();
            if (bvwk2 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bvwq bvwq2 = (bvwq) da2.f164949b;
                bvwk2.getClass();
                bvwq2.f157999o = bvwk2;
                bvwq2.f157985a |= 4096;
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bvwq bvwq3 = (bvwq) da2.f164949b;
            bvwq3.f157985a |= 1;
            bvwq3.f157986b = currentTimeMillis;
            bvwq = (bvwq) da2.mo74062i();
        }
        if (this.f117890b.mo63202a(this.f117891c.mo63354a().mo70928b(), new Pair(apiMetadata, bvwq), "ApiInternalState")) {
            StringBuilder sb = new StringBuilder(87);
            sb.append("Successfully recorded ApInternalState change in datastore, internalStateId: ");
            sb.append(i);
            sb.toString();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ApiRate mo63310a(long j) {
        if (chcs.m148236h() || chcs.m148237i()) {
            int i = this.f117896h;
            switch (i) {
                case 3:
                    return bgzs.m100494b(j);
                case 4:
                    return bgzs.m100493a(chcs.f188354a.mo6606a().mo85070af(), "homeEnteredWifiConnected", j);
                case 5:
                    return bgzs.m100493a(chcs.f188354a.mo6606a().mo85069ae(), "homeEnteredWifiDisconnected", j);
                case 6:
                    return bgzs.m100493a(chcs.f188354a.mo6606a().mo85075ak(), "workEnteredWifiConnected", j);
                case 7:
                    return bgzs.m100493a(chcs.f188354a.mo6606a().mo85074aj(), "workEnteredWifiDisconnected", j);
                case 8:
                case 9:
                    return bgzs.m100493a(chcs.m148244p(), i == 8 ? "homeExit" : i != 9 ? "default" : "workExit", j);
                default:
                    return bgzs.m100492a(j);
            }
        } else if (this.f117892d.f118014f) {
            return bgzs.m100494b(j);
        } else {
            return bgzs.m100492a(j);
        }
    }

    /* renamed from: b */
    public final void mo63317b(int i) {
        String str;
        StringBuilder sb = new StringBuilder(52);
        sb.append("Triggering possible sampling update for: ");
        sb.append(i);
        sb.toString();
        switch (i) {
            case 1:
                str = "PowerModeReceiver";
                break;
            case 2:
                str = "Moving";
                break;
            case 3:
                str = "Still";
                break;
            case 4:
                str = "AtHomeWithWifi";
                break;
            case 5:
                str = "AtHomeWithoutWifi";
                break;
            case 6:
                str = "AtWorkWithWifi";
                break;
            case 7:
                str = "AtWorkWithoutWifi";
                break;
            case 8:
                str = "HomeDeparture";
                break;
            case 9:
                str = "WorkDeparture";
                break;
            default:
                StringBuilder sb2 = new StringBuilder(35);
                sb2.append("Unknown sampling state: ");
                sb2.append(i);
                bgur.m100024c("GCoreUlr", 21, sb2.toString());
                str = "Unknown";
                break;
        }
        bguv.m100043a("UlrSamplingRateUpdateRequest", i);
        bgxx.m100278b(this.f117899k, str);
    }

    /* renamed from: a */
    public final void mo63311a(int i) {
        bgxf bgxf = this.f117897i;
        if (bgxf != null) {
            bgxf.mo63309a(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo63312a(ReportingConfig reportingConfig, long j) {
        ArrayList arrayList;
        LocationAvailability locationAvailability;
        String str;
        ApiLocationStatus apiLocationStatus;
        bvwq bvwq;
        bvwp bvwp;
        bgyn bgyn;
        int a;
        ReportingConfig reportingConfig2 = reportingConfig;
        long j2 = j;
        bgye bgye = this.f117891c;
        bgye.mo63360b();
        synchronized (bgye.f117997f) {
            bgyh bgyh = bgye.f118000b;
            List list = reportingConfig2.f150914a;
            int size = list.size();
            bxvd da = bgvv.f117752d.mo74144da();
            boolean z = false;
            int i = 0;
            while (i < size) {
                AccountConfig accountConfig = (AccountConfig) list.get(i);
                bxvd da2 = bgvg.f117634x.mo74144da();
                boolean z2 = accountConfig.f150891b;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = z;
                }
                bgvg bgvg = (bgvg) da2.f164949b;
                int i2 = bgvg.f117636a | 4;
                bgvg.f117636a = i2;
                bgvg.f117639d = z2;
                int i3 = i;
                long j3 = accountConfig.f150892c;
                int i4 = i2 | 8;
                bgvg.f117636a = i4;
                bgvg.f117640e = j3;
                boolean z3 = accountConfig.f150893d;
                int i5 = i4 | 16;
                bgvg.f117636a = i5;
                bgvg.f117641f = z3;
                int i6 = i5 | 32;
                bgvg.f117636a = i6;
                bgvg.f117642g = false;
                boolean z4 = accountConfig.f150894e;
                int i7 = i6 | 64;
                bgvg.f117636a = i7;
                bgvg.f117643h = z4;
                boolean z5 = accountConfig.f150896g;
                int i8 = i7 | 128;
                bgvg.f117636a = i8;
                bgvg.f117644i = z5;
                List list2 = list;
                int i9 = size;
                long j4 = accountConfig.f150898i;
                int i10 = i8 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                bgvg.f117636a = i10;
                bgvg.f117645j = j4;
                int i11 = accountConfig.f150899j;
                int i12 = i10 | 512;
                bgvg.f117636a = i12;
                bgvg.f117646k = i11;
                boolean z6 = accountConfig.f150900k;
                int i13 = i12 | 1024;
                bgvg.f117636a = i13;
                bgvg.f117647l = z6;
                boolean z7 = accountConfig.f150901l;
                bgvg.f117636a = i13 | 2048;
                bgvg.f117648m = z7;
                bgvk a2 = accountConfig.f150902m.mo70919a();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bgvg bgvg2 = (bgvg) da2.f164949b;
                a2.getClass();
                bgvg2.f117649n = a2;
                int i14 = bgvg2.f117636a | 4096;
                bgvg2.f117636a = i14;
                int i15 = accountConfig.f150903n;
                int i16 = i14 | 8192;
                bgvg2.f117636a = i16;
                bgvg2.f117650o = i15;
                boolean z8 = accountConfig.f150891b;
                int i17 = i16 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                bgvg2.f117636a = i17;
                bgvg2.f117651p = z8;
                boolean z9 = accountConfig.f150907r;
                int i18 = i17 | 2097152;
                bgvg2.f117636a = i18;
                bgvg2.f117657v = z9;
                int i19 = accountConfig.f150908s;
                bgvg2.f117636a = i18 | 4194304;
                bgvg2.f117658w = i19;
                if (accountConfig.f150890a.name != null) {
                    String str2 = accountConfig.f150890a.name;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bgvg bgvg3 = (bgvg) da2.f164949b;
                    str2.getClass();
                    bgvg3.f117636a |= 1;
                    bgvg3.f117637b = str2;
                }
                if (accountConfig.f150890a.type != null) {
                    String str3 = accountConfig.f150890a.type;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bgvg bgvg4 = (bgvg) da2.f164949b;
                    str3.getClass();
                    bgvg4.f117636a |= 2;
                    bgvg4.f117638c = str3;
                }
                String str4 = accountConfig.f150895f;
                if (str4 != null) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bgvg bgvg5 = (bgvg) da2.f164949b;
                    str4.getClass();
                    bgvg5.f117636a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                    bgvg5.f117654s = str4;
                }
                String str5 = accountConfig.f150897h;
                if (str5 != null) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bgvg bgvg6 = (bgvg) da2.f164949b;
                    str5.getClass();
                    bgvg6.f117636a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                    bgvg6.f117655t = str5;
                }
                Long l = accountConfig.f150905p;
                if (l != null) {
                    long longValue = l.longValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bgvg bgvg7 = (bgvg) da2.f164949b;
                    bgvg7.f117636a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                    bgvg7.f117653r = longValue;
                }
                String str6 = accountConfig.f150904o;
                if (str6 != null) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bgvg bgvg8 = (bgvg) da2.f164949b;
                    str6.getClass();
                    bgvg8.f117636a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                    bgvg8.f117652q = str6;
                }
                Long l2 = accountConfig.f150906q;
                if (l2 != null) {
                    long longValue2 = l2.longValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bgvg bgvg9 = (bgvg) da2.f164949b;
                    bgvg9.f117636a |= 1048576;
                    bgvg9.f117656u = longValue2;
                }
                bgvg bgvg10 = (bgvg) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bgvv bgvv = (bgvv) da.f164949b;
                bgvg10.getClass();
                if (!bgvv.f117755b.mo73666a()) {
                    bgvv.f117755b = bxvk.m124021a(bgvv.f117755b);
                }
                bgvv.f117755b.add(bgvg10);
                size = i9;
                z = false;
                i = i3 + 1;
                list = list2;
            }
            bgvk a3 = reportingConfig2.f150915b.mo70919a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bgvv bgvv2 = (bgvv) da.f164949b;
            a3.getClass();
            bgvv2.f117756c = a3;
            bgvv2.f117754a |= 2;
            SharedPreferences.Editor putString = bgyh.f118032a.edit().putString("reportingConfig", Base64.encodeToString(((bgvv) da.mo74062i()).mo73642k(), 2));
            arrayList = new ArrayList();
            Iterator it = reportingConfig2.f150914a.iterator();
            while (true) {
                Long l3 = null;
                if (!it.hasNext()) {
                    break;
                }
                AccountConfig accountConfig2 = (AccountConfig) it.next();
                Account account = accountConfig2.f150890a;
                String b = bgyh.m100365b(account);
                String b2 = bgyh.m100365b(account);
                if (bgyh.f118032a.contains(b2)) {
                    l3 = Long.valueOf(bgyh.f118032a.getLong(b2, 0));
                }
                if (accountConfig2.mo70916j()) {
                    if (l3 != null) {
                        arrayList.add(new bgyo(accountConfig2, bgyn.INACTIVATED, l3.longValue()));
                        arrayList.add(new bgyo(accountConfig2, bgyn.ACTIVATED, j2));
                    }
                    putString.remove(b);
                } else if (l3 == null) {
                    putString.putLong(b, j2);
                }
            }
            putString.apply();
        }
        int size2 = arrayList.size();
        for (int i20 = 0; i20 < size2; i20++) {
            bgyo bgyo = (bgyo) arrayList.get(i20);
            AccountConfig accountConfig3 = bgyo.f118089a;
            if (accountConfig3.mo70916j()) {
                if (bgyo.f118090b == bgyn.ACTIVATED) {
                    aesh aesh = this.f117893e;
                    if (aesh == null) {
                        try {
                            locationAvailability = (LocationAvailability) aucu.m76783a(this.f117898j.mo24758m(), chcv.m148481b(), TimeUnit.MILLISECONDS);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            String valueOf = String.valueOf(e);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 75);
                            sb.append("InterruptException on FusedLocationProviderClient#getLocationAvailability: ");
                            sb.append(valueOf);
                            bgur.m100025c("GCoreUlr", sb.toString());
                            locationAvailability = null;
                        } catch (ExecutionException | TimeoutException e2) {
                            String valueOf2 = String.valueOf(e2);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 66);
                            sb2.append("Exception on FusedLocationProviderClient#getLocationAvailability: ");
                            sb2.append(valueOf2);
                            bgur.m100025c("GCoreUlr", sb2.toString());
                            locationAvailability = null;
                        }
                    } else {
                        locationAvailability = aesh.mo34509d();
                    }
                } else {
                    locationAvailability = null;
                }
                String valueOf3 = String.valueOf(locationAvailability);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 16);
                sb3.append("Storing status: ");
                sb3.append(valueOf3);
                sb3.toString();
                int ordinal = bgyo.f118090b.ordinal();
                if (ordinal == 0) {
                    str = "inactivated";
                } else if (ordinal != 1) {
                    str = null;
                } else {
                    str = "activated";
                }
                ApiActivationChange apiActivationChange = new ApiActivationChange(str);
                if (locationAvailability != null) {
                    apiLocationStatus = bgzr.m100487a(locationAvailability);
                } else {
                    apiLocationStatus = null;
                }
                ApiMetadata apiMetadata = new ApiMetadata(apiActivationChange, null, null, null, apiLocationStatus, null, null, null, Long.valueOf(bgyo.f118091c), null, null);
                if (!chcp.m148193b() || !chcp.m148195d()) {
                    bvwq = null;
                } else {
                    bvvg bvvg = (bvvg) bvvl.f157808e.mo74144da();
                    if (!(bgyo == null || (bgyn = bgyo.f118090b) == null || (a = bvvi.m121503a(bgyn.ordinal())) == 0)) {
                        if (bvvg.f164950c) {
                            bvvg.mo74035c();
                            bvvg.f164950c = false;
                        }
                        bvvl bvvl = (bvvl) bvvg.f164949b;
                        bvvl.f157813d = a - 1;
                        bvvl.f157810a |= 1;
                    }
                    bvvl bvvl2 = (bvvl) bvvg.mo74062i();
                    if (locationAvailability != null) {
                        bvwp = bgzq.m100484a(locationAvailability);
                    } else {
                        bvwp = null;
                    }
                    bxvd da3 = bvwq.f157983r.mo74144da();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bvwq bvwq2 = (bvwq) da3.f164949b;
                    bvvl2.getClass();
                    bvwq2.f157991g = bvvl2;
                    int i21 = bvwq2.f157985a | 32;
                    bvwq2.f157985a = i21;
                    long j5 = bgyo.f118091c;
                    int i22 = i21 | 1;
                    bvwq2.f157985a = i22;
                    bvwq2.f157986b = j5;
                    if (bvwp != null) {
                        bvwp.getClass();
                        bvwq2.f157990f = bvwp;
                        bvwq2.f157985a = i22 | 16;
                    }
                    bvwq = (bvwq) da3.mo74062i();
                }
                this.f117890b.mo63201a(accountConfig3.f150890a, new Pair(apiMetadata, bvwq), "ApiActivationChange");
            }
        }
    }

    /* renamed from: a */
    public final void mo63313a(ReportingConfig reportingConfig, String str) {
        mo63314a(reportingConfig, str, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0148, code lost:
        if (r7 == false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0155, code lost:
        if (m100222f() != false) goto L_0x0157;
     */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x06fe  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0724  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x087c  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x08d5 A[SYNTHETIC] */
    /* renamed from: a */
    public final void mo63314a(ReportingConfig reportingConfig, String str, boolean z) {
        ReportingConfig a;
        bgue bgue;
        bgug bgug;
        boolean z2;
        bgto bgto;
        String e;
        String f;
        bgxf bgxf;
        int aD;
        Account account;
        int length;
        long j;
        boolean z3;
        boolean z4;
        bgya bgya;
        bgya bgya2;
        ReportingConfig reportingConfig2 = reportingConfig;
        String str2 = str;
        sdo.m34973b((String) null);
        long currentTimeMillis = System.currentTimeMillis();
        bgye bgye = this.f117891c;
        synchronized (bgye.f117997f) {
            a = bgye.f118000b.mo63408a();
        }
        int i = Build.VERSION.SDK_INT;
        this.f117907s.mo63537a(reportingConfig.mo70930d());
        if (bgzo.m100467a(a, reportingConfig2, this.f117905q)) {
            bgyc bgyc = this.f117904p;
            bgyc.f117992a.sendBroadcast(new Intent("com.google.android.gms.location.reporting.SETTINGS_CHANGED"));
            int i2 = Build.VERSION.SDK_INT;
            bgyc.f117992a.sendBroadcast(new Intent("com.google.android.gms.location.reporting.SETTINGS_CHANGED").setPackage("com.google.android.googlequicksearchbox"));
            bgyc.f117992a.sendBroadcast(new Intent(SettingInjectorService.ACTION_INJECTED_SETTING_CHANGED));
        }
        if (bguv.m100053c() && a != null) {
            C1225nr<Account> nrVar = new C1225nr();
            nrVar.addAll(a.mo70928b());
            nrVar.addAll(reportingConfig.mo70928b());
            for (Account account2 : nrVar) {
                AccountConfig a2 = a.mo70926a(account2);
                AccountConfig a3 = reportingConfig2.mo70926a(account2);
                if (a2 == null) {
                    bguv.m100042a("UlrActivationOnAccountAdded");
                } else if (a3 == null) {
                    bguv.m100042a("UlrActivationOffAccountRemoved");
                } else if (!a2.mo70916j() && a3.mo70916j()) {
                    bguv.m100043a("UlrActivationOn", bguv.m100037a(bguv.m100038a(a2)));
                } else if (a2.mo70916j() && !a3.mo70916j()) {
                    bguv.m100043a("UlrActivationOff", bguv.m100037a(bguv.m100038a(a3)));
                }
            }
        }
        bgwp bgwp = this.f117902n;
        bgyf bgyf = bgwp.f117852a;
        boolean z5 = !bgwp.f117853b.mo63404c().isEmpty();
        boolean z6 = bgyf.f118016h;
        bgyf.f118016h = z5;
        if (z6 != z5) {
            boolean z7 = bgwp.f117852a.f118016h;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
            sb.append("Has Active Burst Requests set to ");
            sb.append(z7);
            sb.append(" for ");
            sb.append(str2);
            sb.toString();
        }
        List b = reportingConfig.mo70928b();
        if (chdb.m148501b()) {
            boolean b2 = this.f117910v.mo63411b();
            if (!b.isEmpty() && m100222f() && b2) {
                bgur.m100011a("GCoreUlr", "Disable ULR due to private mode!");
            }
            if (!b.isEmpty()) {
                if (m100222f()) {
                }
            }
            String e2 = reportingConfig.mo70931e();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 57 + String.valueOf(e2).length());
            sb2.append(str2);
            sb2.append(": Ensuring that reporting is stopped because of reasons: ");
            sb2.append(e2);
            bgur.m100011a("GCoreUlr", sb2.toString());
            mo63316b();
            SharedPreferences.Editor edit = this.f117901m.f118030c.edit();
            edit.clear();
            edit.putInt("apiLevel", 3);
            edit.apply();
            bguc bguc = this.f117900l;
            if (chcp.m148197f()) {
                bgug = bguc.f117547a;
                synchronized (bgug.f117559c) {
                    LevelDb levelDb = bgug.f117560d;
                    if (levelDb != null) {
                        try {
                            int deleteRange = levelDb.deleteRange(null, null);
                            StringBuilder sb3 = new StringBuilder(60);
                            sb3.append("Deleted ");
                            sb3.append(deleteRange);
                            sb3.append(" entries from datastore for all accounts.");
                            sb3.toString();
                        } catch (LevelDbCorruptionException e3) {
                            e = e3;
                        } catch (IllegalStateException e4) {
                            e = e4;
                        } catch (LevelDbException e5) {
                            bgur.m100012a("GCoreUlr", "Error removing all entries", e5);
                            bguz.m100120a(e5);
                        }
                        bgug.f117557a.mo63203a(bgyg.m100351a(bgug.f117558b).mo63402b());
                    }
                }
            }
            if (chcp.m148195d() && (bgue = bguc.f117548b) != null) {
                synchronized (bgue.f117553c) {
                    LevelDb levelDb2 = bgue.f117554d;
                    if (levelDb2 != null) {
                        try {
                            int deleteRange2 = levelDb2.deleteRange(null, null);
                            StringBuilder sb4 = new StringBuilder(60);
                            sb4.append("Deleted ");
                            sb4.append(deleteRange2);
                            sb4.append(" entries from datastore for all accounts.");
                            sb4.toString();
                        } catch (LevelDbCorruptionException e6) {
                            e = e6;
                        } catch (IllegalStateException e7) {
                            e = e7;
                        } catch (LevelDbException e8) {
                            bgur.m100012a("GCoreUlr", "Error removing all entries", e8);
                            bguz.m100120a(e8);
                        }
                        bgue.f117551a.mo63203a(bgyg.m100351a(bgue.f117552b).mo63402b());
                    }
                }
            }
            this.f117892d.mo63372a();
            bguv.m100051b();
            this.f117892d.mo63379a(reportingConfig2);
            mo63312a(reportingConfig2, currentTimeMillis);
            return;
        }
        if (!b.isEmpty()) {
        }
        String e22 = reportingConfig.mo70931e();
        StringBuilder sb22 = new StringBuilder(String.valueOf(str).length() + 57 + String.valueOf(e22).length());
        sb22.append(str2);
        sb22.append(": Ensuring that reporting is stopped because of reasons: ");
        sb22.append(e22);
        bgur.m100011a("GCoreUlr", sb22.toString());
        mo63316b();
        SharedPreferences.Editor edit2 = this.f117901m.f118030c.edit();
        edit2.clear();
        edit2.putInt("apiLevel", 3);
        edit2.apply();
        bguc bguc2 = this.f117900l;
        if (chcp.m148197f()) {
        }
        synchronized (bgue.f117553c) {
        }
        this.f117900l.mo63174a(reportingConfig2);
        bgyu b3 = this.f117902n.mo63294b();
        String a4 = aeqm.m52399a(b);
        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(a4).length());
        sb5.append(str2);
        sb5.append(": Ensuring that reporting is active for ");
        sb5.append(a4);
        bgur.m100011a("GCoreUlr", sb5.toString());
        if (z) {
            aesh aesh = this.f117893e;
            if (aesh == null) {
                rjx rjx = this.f117898j;
                PendingIntent a5 = m100218a("com.google.android.location.reporting.ACTION_IMMEDIATE_LOCATION");
                Context context = this.f117899k;
                LocationRequestInternal a6 = LocationRequestInternal.m66889a("ulr", bgya.m100287b());
                a6.f79426h = "com.google.android.gms.location.reporting";
                a6.mo43611a();
                a6.mo43613a(Collections.singletonList(bhby.m100614a(context)));
                rjx.mo24726a(a6, a5);
            } else {
                PendingIntent a7 = m100218a("com.google.android.location.reporting.ACTION_IMMEDIATE_LOCATION");
                Context context2 = this.f117899k;
                LocationRequestInternal a8 = LocationRequestInternal.m66889a("ulr", bgya.m100287b());
                a8.f79426h = "com.google.android.gms.location.reporting";
                a8.mo43611a();
                a8.mo43613a(Collections.singletonList(bhby.m100614a(context2)));
                aesh.mo34506a(a8, a7);
            }
        } else {
            if (this.f117908t == null) {
                PowerModeReceiver powerModeReceiver = new PowerModeReceiver(this.f117901m, this.f117892d);
                this.f117908t = powerModeReceiver;
                Context context3 = this.f117899k;
                powerModeReceiver.f150864a = this;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.location.activity.DEEP_STILL_MODE_ENABLED");
                intentFilter.addAction("com.google.android.location.activity.DEEP_STILL_MODE_DISABLED");
                intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
                context3.registerReceiver(powerModeReceiver, intentFilter);
            }
            mo63318c();
            ApiRate a9 = mo63310a(currentTimeMillis);
            String valueOf = String.valueOf(this.f117892d.mo63393k());
            String valueOf2 = String.valueOf(a9);
            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf).length() + 37 + String.valueOf(valueOf2).length());
            sb6.append("Current ApiRate: ");
            sb6.append(valueOf);
            sb6.append(" candidate ApiRate: ");
            sb6.append(valueOf2);
            sb6.toString();
            long b4 = b3.mo63287b(true);
            long a10 = bgtu.m99929a(this.f117892d);
            long longValue = a9.mo71577d().longValue();
            bgyf bgyf2 = this.f117892d;
            if (!chcs.f188354a.mo6606a().mo85046aH() || (!bgyf2.f118017i && !bgyf2.f118018j)) {
                j = chcs.f188354a.mo6606a().mo85091b();
            } else {
                j = chcs.f188354a.mo6606a().mo85036Y();
            }
            bgya bgya3 = new bgya(longValue, a10, j, Math.max(longValue, b4), bgzo.m100455a(this.f117899k, b3.mo63289c()));
            if (!m100220d() || (bgya2 = this.f117892d.f118011c) == null) {
                z3 = false;
            } else {
                z3 = bgya3.mo63338a(bgya2);
                if (z3) {
                    String valueOf3 = String.valueOf(bgya3);
                    StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf3).length() + 58);
                    sb7.append("Current FLP request matches ");
                    sb7.append(valueOf3);
                    sb7.append(", no need to request a new one");
                    sb7.toString();
                } else {
                    String valueOf4 = String.valueOf(bgya2);
                    String valueOf5 = String.valueOf(bgya3);
                    StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf4).length() + 52 + String.valueOf(valueOf5).length());
                    sb8.append("Need to re-register FLP request, current: ");
                    sb8.append(valueOf4);
                    sb8.append(" desired: ");
                    sb8.append(valueOf5);
                    sb8.toString();
                }
            }
            if (!m100220d() || (bgya = this.f117892d.f118011c) == null) {
                z4 = false;
            } else {
                z4 = bgya3.mo63339b(bgya);
                if (z4) {
                    String valueOf6 = String.valueOf(bgya3);
                    StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf6).length() + 61);
                    sb9.append("Current NLP AR request matches ");
                    sb9.append(valueOf6);
                    sb9.append(", no need to request a new one");
                    sb9.toString();
                } else {
                    String valueOf7 = String.valueOf(bgya);
                    String valueOf8 = String.valueOf(bgya3);
                    StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf7).length() + 60 + String.valueOf(valueOf8).length());
                    sb10.append("Need to re-register AR request with NLP, current: ");
                    sb10.append(valueOf7);
                    sb10.append(" desired: ");
                    sb10.append(valueOf8);
                    sb10.toString();
                }
            }
            if (!z3 || !z4) {
                if (!z3) {
                    aesh aesh2 = this.f117893e;
                    if (aesh2 == null) {
                        rjx rjx2 = this.f117898j;
                        PendingIntent a11 = m100218a("com.google.android.location.reporting.ACTION_LOCATION");
                        LocationRequestInternal a12 = LocationRequestInternal.m66889a("ulr", bgya3.mo63337a());
                        a12.f79426h = "com.google.android.gms.location.reporting";
                        a12.mo43611a();
                        a12.mo43613a(Collections.singletonList(bgya3.f117977b));
                        rjx2.mo24726a(a12, a11);
                        String valueOf9 = String.valueOf(bgya3);
                        StringBuilder sb11 = new StringBuilder(String.valueOf(valueOf9).length() + 52);
                        sb11.append("GMS FLP location updates requested from public API: ");
                        sb11.append(valueOf9);
                        sb11.toString();
                    } else {
                        PendingIntent a13 = m100218a("com.google.android.location.reporting.ACTION_LOCATION");
                        LocationRequestInternal a14 = LocationRequestInternal.m66889a("ulr", bgya3.mo63337a());
                        a14.f79426h = "com.google.android.gms.location.reporting";
                        a14.mo43611a();
                        a14.mo43613a(Collections.singletonList(bgya3.f117977b));
                        aesh2.mo34506a(a14, a13);
                        String valueOf10 = String.valueOf(bgya3.toString());
                        if (valueOf10.length() == 0) {
                            new String("GMS FLP location updates requested: ");
                        } else {
                            "GMS FLP location updates requested: ".concat(valueOf10);
                        }
                    }
                    this.f117892d.mo63381a(a9, bgya3, SystemClock.elapsedRealtime());
                    m100219a(reportingConfig2, a9);
                    String valueOf11 = String.valueOf(a9);
                    StringBuilder sb12 = new StringBuilder(String.valueOf(valueOf11).length() + 36);
                    sb12.append("GMS FLP location updates requested: ");
                    sb12.append(valueOf11);
                    bgur.m100011a("GCoreUlr", sb12.toString());
                }
                if (!z4) {
                    Context context4 = this.f117899k;
                    rjx rjx3 = this.f117911w;
                    PendingIntent a15 = m100218a("com.google.android.location.reporting.ACTION_ACTIVITY");
                    WorkSource a16 = stx.m36335a(context4, bgya3.f117977b.f30222b);
                    aefy aefy = new aefy();
                    aefy.mo34115a(bgya3.f117976a);
                    aefy.f63346c = false;
                    aefy.f63348e = "UlrSampleSpec";
                    aefy.f63347d = a16;
                    aucb a17 = rjx3.mo24682a(aefy.mo34113a(), a15);
                    if (a17 != null) {
                        a17.mo50373a(new bgxy(bgya3));
                        a17.mo50372a(new bgxz());
                    }
                    this.f117892d.mo63376a(bgya3);
                    String valueOf12 = String.valueOf(bgya3);
                    StringBuilder sb13 = new StringBuilder(String.valueOf(valueOf12).length() + 26);
                    sb13.append("GMS AR updates requested: ");
                    sb13.append(valueOf12);
                    bgur.m100011a("GCoreUlr", sb13.toString());
                }
                Context context5 = this.f117899k;
                PendingIntent service = PendingIntent.getService(context5, 0, bgyb.m100291a(context5), 0);
                skc skc = new skc(context5);
                skc.mo25668a(service);
                skc.mo25671a("GCoreUlrWorldUpdater", 2, SystemClock.elapsedRealtime() + 3600000, 3600000, service, "com.google.android.gms");
            } else if (!(a9.mo71578e() == null || this.f117892d.mo63393k() == null || a9.mo71578e().equals(this.f117892d.mo63393k().mo71578e()))) {
                this.f117892d.mo63380a(a9);
                m100219a(reportingConfig2, a9);
            }
        }
        if (bgto.m99923b()) {
            bgto bgto2 = this.f117894f;
            bgyg bgyg = this.f117901m;
            sqv sqv = this.f117889a;
            if (bgyg != null && sqv != null && !b.isEmpty()) {
                String aP = chcs.f188354a.mo6606a().mo85054aP();
                if (aP == null || aP.isEmpty()) {
                    z2 = false;
                } else {
                    if (aP.length() == 0) {
                        new String("Setting test home place Id: ");
                    } else {
                        "Setting test home place Id: ".concat(aP);
                    }
                    bgyg.mo63400a(aP);
                    z2 = true;
                }
                String aQ = chcs.f188354a.mo6606a().mo85055aQ();
                int i3 = 2;
                if (aQ != null && !aQ.isEmpty()) {
                    if (aQ.length() == 0) {
                        new String("Setting test work place Id: ");
                    } else {
                        "Setting test work place Id: ".concat(aQ);
                    }
                    bgyg.mo63403b(aQ);
                } else if (!z2) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long j2 = bgyg.f118030c.getLong("lastInferredPlacesRefreshTime", -1);
                    if (j2 == -1 || j2 + chcs.f188354a.mo6606a().mo85044aF() <= currentTimeMillis2) {
                        if (bgzo.m100478d(bgto2.f117502c)) {
                            bgyg.mo63399a(currentTimeMillis2);
                            int size = b.size();
                            String str3 = null;
                            String str4 = null;
                            int i4 = 0;
                            while (true) {
                                if (i4 < size) {
                                    account = (Account) b.get(i4);
                                    String[] a18 = new bgub(bgto2.f117507h.f117499a).mo63173a(account);
                                    if (!(a18 == null || (length = a18.length) == 0)) {
                                        if (length != 2) {
                                            String str5 = account.name;
                                            StringBuilder sb14 = new StringBuilder(String.valueOf(str5).length() + 99);
                                            sb14.append("Bad length for inferred places in account ");
                                            sb14.append(str5);
                                            sb14.append(". Expected 2, got ");
                                            sb14.append(length);
                                            sb14.append(". Not enabling placefencing.");
                                            sb14.toString();
                                            break;
                                        }
                                        String str6 = a18[0];
                                        if (str6 != null) {
                                            if (str3 != null) {
                                                if (!str3.equals(str6)) {
                                                    break;
                                                }
                                            } else {
                                                str3 = str6;
                                            }
                                        }
                                        String str7 = a18[1];
                                        if (str7 != null) {
                                            if (str4 == null) {
                                                str4 = str7;
                                            } else if (!str4.equals(str7)) {
                                                break;
                                            }
                                        }
                                        i4++;
                                    }
                                } else if (str3 != null || str4 != null) {
                                    bgyg.mo63400a(str3);
                                    bgyg.mo63403b(str4);
                                }
                            }
                            String valueOf13 = String.valueOf(account.name);
                            if (valueOf13.length() == 0) {
                                new String("Not enabling placefences, no inferred places for account ");
                            } else {
                                "Not enabling placefences, no inferred places for account ".concat(valueOf13);
                            }
                        }
                    }
                    String e9 = bgyg.mo63406e();
                    String f2 = bgyg.mo63407f();
                    StringBuilder sb15 = new StringBuilder(String.valueOf(e9).length() + 23 + String.valueOf(f2).length());
                    sb15.append("Cached home = ");
                    sb15.append(e9);
                    sb15.append(", work = ");
                    sb15.append(f2);
                    sb15.toString();
                    if (bgyg.mo63406e() == null || bgyg.mo63407f() == null) {
                        if (bgyg.mo63406e() != null) {
                            bgur.m100011a("GCoreUlr", "can enable home placefence");
                        } else if (bgyg.mo63407f() != null) {
                            bgur.m100011a("GCoreUlr", "can enable work placefence");
                        }
                        bgto = this.f117894f;
                        e = this.f117901m.mo63406e();
                        f = this.f117901m.mo63407f();
                        bgxf = this.f117897i;
                        if (bgxf != null && ((chcs.m148236h() && e != null && !e.isEmpty()) || (chcs.m148237i() && f != null && !f.isEmpty()))) {
                            HashSet hashSet = new HashSet(2);
                            if (e != null && chcs.m148236h()) {
                                bgto.f117503d = e;
                                hashSet.add(bgto.f117503d);
                            }
                            if (f != null && chcs.m148237i()) {
                                bgto.f117504e = f;
                                hashSet.add(bgto.f117504e);
                            }
                            bgto.f117508i = bgxf;
                            if (bgto.f117505f == null) {
                                bgto.f117505f = new HomeWorkNearbyAlertsHelper$NearbyAlertReceiver(bgto);
                                bgto.f117502c.registerReceiver(bgto.f117505f, new IntentFilter("com.google.android.location.reporting.ALIASED_PLACE_ALERT_AVAILABLE"));
                            }
                            NearbyAlertFilter b5 = NearbyAlertFilter.m66906b(hashSet);
                            if (((int) chcs.f188354a.mo6606a().mo85043aE()) == 0) {
                                i3 = 0;
                            }
                            aD = (int) chcs.f188354a.mo6606a().mo85042aD();
                            if (!(aD == 110 || aD == 100)) {
                                aD = -1;
                            }
                            NearbyAlertRequest a19 = NearbyAlertRequest.m66911a(b5, i3, aD);
                            bgvf bgvf = bgto.f117501b;
                            bgvf.f117630a.execute(new bgvb(bgvf, bgzo.m100471b(bgto.f117502c, "com.google.android.location.reporting.ALIASED_PLACE_ALERT_AVAILABLE"), a19));
                            bgto.f117506g = true;
                        }
                    } else {
                        bgur.m100011a("GCoreUlr", "can enable home and work placefences");
                        bgto = this.f117894f;
                        e = this.f117901m.mo63406e();
                        f = this.f117901m.mo63407f();
                        bgxf = this.f117897i;
                        HashSet hashSet2 = new HashSet(2);
                        bgto.f117503d = e;
                        hashSet2.add(bgto.f117503d);
                        bgto.f117504e = f;
                        hashSet2.add(bgto.f117504e);
                        bgto.f117508i = bgxf;
                        if (bgto.f117505f == null) {
                        }
                        NearbyAlertFilter b52 = NearbyAlertFilter.m66906b(hashSet2);
                        if (((int) chcs.f188354a.mo6606a().mo85043aE()) == 0) {
                        }
                        aD = (int) chcs.f188354a.mo6606a().mo85042aD();
                        aD = -1;
                        NearbyAlertRequest a192 = NearbyAlertRequest.m66911a(b52, i3, aD);
                        bgvf bgvf2 = bgto.f117501b;
                        bgvf2.f117630a.execute(new bgvb(bgvf2, bgzo.m100471b(bgto.f117502c, "com.google.android.location.reporting.ALIASED_PLACE_ALERT_AVAILABLE"), a192));
                        bgto.f117506g = true;
                    }
                }
                bgyg.mo63399a(-1);
                bgto = this.f117894f;
                e = this.f117901m.mo63406e();
                f = this.f117901m.mo63407f();
                bgxf = this.f117897i;
                HashSet hashSet22 = new HashSet(2);
                bgto.f117503d = e;
                hashSet22.add(bgto.f117503d);
                bgto.f117504e = f;
                hashSet22.add(bgto.f117504e);
                bgto.f117508i = bgxf;
                if (bgto.f117505f == null) {
                }
                NearbyAlertFilter b522 = NearbyAlertFilter.m66906b(hashSet22);
                if (((int) chcs.f188354a.mo6606a().mo85043aE()) == 0) {
                }
                aD = (int) chcs.f188354a.mo6606a().mo85042aD();
                aD = -1;
                NearbyAlertRequest a1922 = NearbyAlertRequest.m66911a(b522, i3, aD);
                bgvf bgvf22 = bgto.f117501b;
                bgvf22.f117630a.execute(new bgvb(bgvf22, bgzo.m100471b(bgto.f117502c, "com.google.android.location.reporting.ALIASED_PLACE_ALERT_AVAILABLE"), a1922));
                bgto.f117506g = true;
            }
        } else {
            this.f117894f.mo63157a();
        }
        bgyf bgyf3 = this.f117892d;
        if (!chcs.f188354a.mo6606a().mo85026O() || (chcs.f188354a.mo6606a().mo85116s() && (bgyf3.f118017i || bgyf3.f118018j))) {
            this.f117895g.mo63171a();
        } else {
            this.f117895g.mo63172a(this.f117906r);
        }
        if (chbu.m148134c() || chbu.m148133b()) {
            bgtv bgtv = this.f117903o;
            if (!chbu.m148134c()) {
                bgtv.mo63167b();
            } else if (bgtv.f117531b == null) {
                bgtv.f117531b = bgty.m99940a(bgtv.f117530a, null);
                bgtv.f117531b.mo63169a();
            }
            if (!chbu.m148133b()) {
                bgtv.mo63168c();
            } else {
                ArrayList arrayList = new ArrayList();
                int i5 = 0;
                while (true) {
                    C1245ok okVar = bgtv.f117532c;
                    if (i5 >= okVar.f26809h) {
                        break;
                    }
                    Account account3 = (Account) okVar.mo15620b(i5);
                    if (!b.contains(account3)) {
                        ((bgty) bgtv.f117532c.mo15621c(i5)).mo63170b();
                    }
                    arrayList.add(account3);
                    i5++;
                }
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    bgtv.f117532c.remove(arrayList.get(i6));
                }
                for (int i7 = 0; i7 < b.size(); i7++) {
                    Account account4 = (Account) b.get(i7);
                    if (!bgtv.f117532c.containsKey(account4)) {
                        bgty a20 = bgty.m99940a(bgtv.f117530a, account4);
                        bgtv.f117532c.put(account4, a20);
                        a20.mo63169a();
                    }
                }
            }
            this.f117892d.mo63379a(reportingConfig2);
            mo63312a(reportingConfig2, currentTimeMillis);
            return;
        }
        this.f117903o.mo63166a();
        this.f117892d.mo63379a(reportingConfig2);
        mo63312a(reportingConfig2, currentTimeMillis);
        return;
        bgue.mo63181a(e);
        bgue.f117551a.mo63203a(bgyg.m100351a(bgue.f117552b).mo63402b());
        this.f117892d.mo63372a();
        bguv.m100051b();
        this.f117892d.mo63379a(reportingConfig2);
        mo63312a(reportingConfig2, currentTimeMillis);
        return;
        bgug.mo63194a(e);
        bgug.f117557a.mo63203a(bgyg.m100351a(bgug.f117558b).mo63402b());
        synchronized (bgue.f117553c) {
        }
    }
}
