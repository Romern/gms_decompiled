package p000;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.instantapps.LaunchData;
import com.google.android.gms.instantapps.internal.DiagnosticInfo;
import com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo;
import com.google.android.gms.instantapps.internal.OptInInfo;
import com.google.android.gms.instantapps.internal.Permissions;
import com.google.android.gms.instantapps.internal.RoutingOptions;
import com.google.android.gms.instantapps.service.InstantAppsChimeraService;
import com.google.android.gms.leveldb.WriteBatch;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* renamed from: adkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adkm extends adge implements sjr {

    /* renamed from: a */
    private static final adfs f62044a = new adfs("InstantAppsServiceImpl");

    /* renamed from: b */
    private static final String[] f62045b = new String[0];

    /* renamed from: c */
    private final InstantAppsChimeraService f62046c;

    /* renamed from: d */
    private final GetServiceRequest f62047d;

    /* renamed from: e */
    private final sqv f62048e;

    /* renamed from: f */
    private final adfd f62049f;

    /* renamed from: g */
    private final adkn f62050g;

    /* renamed from: h */
    private final adkr f62051h;

    /* renamed from: i */
    private final SharedPreferences f62052i;

    /* renamed from: j */
    private final SharedPreferences f62053j;

    /* renamed from: k */
    private final adjx f62054k;

    /* renamed from: l */
    private final adik f62055l;

    /* renamed from: m */
    private final adli f62056m;

    /* renamed from: n */
    private final adkd f62057n;

    /* renamed from: o */
    private final adil f62058o;

    /* renamed from: p */
    private final adje f62059p;

    /* renamed from: q */
    private final adhk f62060q;

    /* renamed from: r */
    private final sjn f62061r;

    /* renamed from: s */
    private final adfq f62062s;

    /* renamed from: t */
    private final adko f62063t;

    /* renamed from: u */
    private final int f62064u = adfk.m50305a();

    public adkm(InstantAppsChimeraService instantAppsChimeraService, GetServiceRequest getServiceRequest, sjn sjn) {
        this.f62046c = instantAppsChimeraService;
        this.f62047d = getServiceRequest;
        adfv a = adfv.m50332a(instantAppsChimeraService);
        this.f62048e = a.f61577b;
        this.f62049f = a.f61586k;
        this.f62050g = a.f61578c;
        this.f62051h = a.f61579d;
        this.f62052i = a.f61580e;
        this.f62053j = a.f61581f;
        this.f62054k = a.f61584i;
        this.f62055l = a.f61587l;
        this.f62056m = a.f61588m;
        this.f62057n = a.f61585j;
        this.f62058o = a.f61589n;
        this.f62059p = a.f61582g;
        this.f62060q = a.f61583h;
        this.f62061r = sjn;
        this.f62062s = a.f61590o;
        this.f62063t = a.f61593r;
    }

    /* renamed from: b */
    private final void m50699b() {
        if (!m50704f()) {
            throw new SecurityException("Access denied");
        }
    }

    /* renamed from: c */
    private final void m50701c() {
        if (!m50703e() && !m50704f()) {
            throw new SecurityException("Access denied");
        }
    }

    /* renamed from: e */
    private final boolean m50703e() {
        return this.f62062s.mo33421a(Binder.getCallingUid());
    }

    /* renamed from: f */
    private final boolean m50704f() {
        return this.f62062s.mo33422b(Binder.getCallingUid());
    }

    /* renamed from: a */
    private final void m50698a() {
        if (!spn.m35869b() && !m50703e() && !m50704f() && !rfz.m33557a(this.f62046c).mo24610b(this.f62047d.f30230d)) {
            throw new SecurityException("Access denied");
        }
    }

    /* renamed from: b */
    private final void m50700b(adgc adgc, Intent intent, RoutingOptions routingOptions) {
        m50701c();
        if (this.f62063t.mo33605a()) {
            if (intent.hasExtra("com.google.android.gms.instantapps.packageNameOverride")) {
                routingOptions.f79197b = intent.getStringExtra("com.google.android.gms.instantapps.packageNameOverride");
            }
            if (!cepl.f183185a.mo6606a().mo79540k()) {
                routingOptions.f79198c = intent.getBooleanExtra("com.google.android.gms.instantapps.disableOptInCheck", routingOptions.f79198c);
                routingOptions.f79199d = intent.getBooleanExtra("com.google.android.gms.instantapps.disableHoldbackCheck", routingOptions.f79199d);
                routingOptions.f79200e = intent.getBooleanExtra("com.google.android.gms.instantapps.disableBrowserPreferenceCheck", routingOptions.f79200e);
            }
            if (intent.hasExtra("com.google.android.gms.instantapps.disablePopulatingRoutes")) {
                routingOptions.f79202g = intent.getBooleanExtra("com.google.android.gms.instantapps.disablePopulatingRoutes", routingOptions.f79202g);
            }
            this.f62061r.mo25649a(new adkj(adgc, intent, this.f62054k, this.f62057n, this.f62050g, this.f62051h, this.f62052i, this.f62064u, routingOptions));
            return;
        }
        adgc.mo33446a(Status.f30109c, (InstantAppPreLaunchInfo) null);
    }

    /* renamed from: d */
    private final void m50702d() {
        if (!spn.m35869b() && !m50703e() && !m50704f()) {
            throw new SecurityException("Access denied");
        }
    }

    /* renamed from: g */
    private static final void m50705g() {
        int i = Build.VERSION.SDK_INT;
        throw new SecurityException("Not supposed to run on Android O.");
    }

    /* renamed from: c */
    public final void mo33476c(adgc adgc) {
        m50698a();
        int c = this.f62059p.mo33567c();
        long d = this.f62059p.mo33568d();
        Account[] d2 = this.f62050g.mo33604d();
        adgc.mo33445a(Status.f30107a, new DiagnosticInfo(c, d, this.f62051h.mo33606a(), this.f62050g.mo33600a(), d2));
    }

    /* renamed from: e */
    public final void mo33483e(adgc adgc) {
        if (ceot.m137680b()) {
            adgc.mo33451b(Status.f30112f, false);
            return;
        }
        adgc.mo33451b(Status.f30107a, this.f62053j.getBoolean("IS_AIA_ENABLED", false));
    }

    /* renamed from: c */
    public final void mo33477c(adgc adgc, String str) {
        if (!this.f62063t.mo33605a()) {
            adgc.mo33444a(Status.f30109c, (LaunchData) null);
        } else {
            this.f62061r.mo25649a(new adki(this.f62049f, adgc, this.f62057n, this.f62050g, str, this.f62054k, this.f62047d.f30230d, this.f62064u, this.f62055l));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adgc.a(com.google.android.gms.common.api.Status, boolean):void
     arg types: [com.google.android.gms.common.api.Status, int]
     candidates:
      adgc.a(com.google.android.gms.common.api.Status, android.content.pm.PackageInfo):void
      adgc.a(com.google.android.gms.common.api.Status, android.os.ParcelFileDescriptor):void
      adgc.a(com.google.android.gms.common.api.Status, com.google.android.gms.common.data.BitmapTeleporter):void
      adgc.a(com.google.android.gms.common.api.Status, com.google.android.gms.instantapps.LaunchData):void
      adgc.a(com.google.android.gms.common.api.Status, com.google.android.gms.instantapps.internal.DiagnosticInfo):void
      adgc.a(com.google.android.gms.common.api.Status, com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo):void
      adgc.a(com.google.android.gms.common.api.Status, com.google.android.gms.instantapps.internal.OptInInfo):void
      adgc.a(com.google.android.gms.common.api.Status, com.google.android.gms.instantapps.internal.Permissions):void
      adgc.a(com.google.android.gms.common.api.Status, java.util.List):void
      adgc.a(com.google.android.gms.common.api.Status, boolean):void */
    /* renamed from: d */
    public final void mo33480d(adgc adgc) {
        if (ceot.m137680b()) {
            adgc.mo33450a(Status.f30112f, false);
            return;
        }
        adgc.mo33450a(Status.f30107a, this.f62053j.contains("IS_AIA_ENABLED"));
    }

    /* renamed from: e */
    public final void mo33484e(rnt rnt) {
        rnt.mo11797a(new Status(17));
    }

    /* renamed from: a */
    public final void mo33452a(adgc adgc) {
        m50698a();
        Account a = this.f62050g.mo33600a();
        adgc.mo33447a(Status.f30107a, OptInInfo.m66759a(this.f62051h.mo33606a(), a != null ? a.name : null, this.f62050g.mo33604d()));
    }

    /* renamed from: d */
    public final void mo33481d(rnt rnt) {
        m50699b();
        rnt.mo11797a(Status.f30112f);
    }

    /* renamed from: c */
    public final void mo33478c(rnt rnt) {
        m50699b();
        rnt.mo11797a(Status.f30112f);
    }

    @Deprecated
    /* renamed from: a */
    public final void mo33453a(adgc adgc, Intent intent) {
        boolean z;
        RoutingOptions routingOptions = new RoutingOptions();
        if (this.f62064u == 0) {
            z = true;
        } else {
            z = false;
        }
        routingOptions.f79196a = z;
        m50700b(adgc, intent, routingOptions);
    }

    /* renamed from: d */
    public final void mo33482d(rnt rnt, String str) {
        WriteBatch create;
        m50701c();
        try {
            adhk adhk = this.f62060q;
            adik adik = ((adhl) adhk).f61714a;
            adik.mo33534b();
            new File(adik.f61809d, str).delete();
            create = WriteBatch.create();
            create.delete(adik.mo33542j(str));
            create.delete(adik.mo33541i(str));
            create.delete(adik.mo33536d(str));
            create.delete(adik.mo33543k(str));
            create.delete(adik.mo33540h(str));
            create.delete(adik.mo33544l(str));
            adik.f61808c.mo33510a(create);
            create.close();
            Integer a = ((adhl) adhk).f61715b.mo33546a(str);
            if (a != null) {
                ((adhl) adhk).f61715b.mo33548a(a.intValue());
            }
            rnt.mo11797a(Status.f30107a);
            return;
        } catch (IOException e) {
            f62044a.mo33425a(e, "deleteData", new Object[0]);
            rnt.mo11797a(new Status(8, e.getMessage()));
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    public final void mo33479c(rnt rnt, String str) {
        adfb a = this.f62049f.mo33411a();
        new Object[1][0] = str;
        m50698a();
        this.f62051h.mo33609a(str);
        try {
            this.f62059p.mo33565b();
            this.f62055l.mo33530a();
        } catch (IOException e) {
            f62044a.mo33425a(e, "Error wiping domain filter", new Object[0]);
        }
        this.f62058o.mo33547a();
        a.mo33409a("InstantAppsService.rejectOptIn");
        rnt.mo11797a(Status.f30107a);
    }

    /* renamed from: a */
    public final void mo33454a(adgc adgc, Intent intent, RoutingOptions routingOptions) {
        m50700b(adgc, intent, routingOptions);
    }

    /* renamed from: a */
    public final void mo33455a(adgc adgc, String str) {
        BitmapTeleporter bitmapTeleporter;
        m50701c();
        Bitmap e = this.f62055l.mo33537e(str);
        if (e != null) {
            bitmapTeleporter = new BitmapTeleporter(e);
            bitmapTeleporter.mo17760a(this.f62046c.getCacheDir());
        } else {
            bitmapTeleporter = null;
        }
        adgc.mo33443a(Status.f30107a, bitmapTeleporter);
    }

    /* renamed from: a */
    public final void mo33456a(adgc adgc, String str, String str2) {
        m50701c();
        try {
            adie a = ((adhl) this.f62060q).f61714a.mo33527a(str);
            if (a != null) {
                bxwc bxwc = a.f61782a;
                if (bxwc.contains(str2) || (str2.equals("android.permission.ACCESS_COARSE_LOCATION") && bxwc.contains("android.permission.ACCESS_FINE_LOCATION"))) {
                    adgc.mo33440a(0);
                    return;
                }
            }
        } catch (IOException e) {
            Log.e("IAMetadataManagerImpl", "Error reading permissions", e);
        }
        adgc.mo33440a(-1);
    }

    /* renamed from: b */
    public final void mo33470b(adgc adgc) {
        m50705g();
        this.f62061r.mo25649a(new adlk(this.f62056m, adgc, this.f62047d.f30230d));
    }

    /* renamed from: b */
    public final void mo33471b(adgc adgc, String str) {
        String[] strArr;
        m50701c();
        try {
            adie a = this.f62055l.mo33527a(str);
            try {
                adhd b = ((adhl) this.f62060q).f61714a.mo33533b(str);
                if (b != null) {
                    strArr = adlc.m50788b(b.f61666a);
                } else {
                    strArr = null;
                }
                if (strArr == null) {
                    strArr = f62045b;
                }
                if (a != null) {
                    adgc.mo33448a(Status.f30107a, new Permissions((String[]) a.f61782a.toArray(new String[0]), (String[]) a.f61783b.toArray(new String[0]), (String[]) a.f61784c.toArray(new String[0]), strArr));
                    return;
                }
                Status status = Status.f30107a;
                String[] strArr2 = f62045b;
                adgc.mo33448a(status, new Permissions(strArr2, strArr2, strArr2, strArr));
            } catch (IOException e) {
                f62044a.mo33425a(e, "getPermissionsForPackage", new Object[0]);
                adgc.mo33448a(new Status(8, e.getMessage()), (Permissions) null);
            }
        } catch (IOException e2) {
            f62044a.mo33425a(e2, "getPermissionsForPackage", new Object[0]);
            adgc.mo33448a(new Status(8, e2.getMessage()), (Permissions) null);
        }
    }

    /* renamed from: a */
    public final void mo33457a(adgc adgc, String str, byte[] bArr) {
        Status status;
        PackageInfo packageInfo;
        IOException e;
        m50701c();
        try {
            adik adik = this.f62055l;
            adik.mo33534b();
            adik.f61808c.mo33512a(adik.mo33542j(str), bArr);
            packageInfo = this.f62060q.mo33520a(str, 20685);
            try {
                status = Status.f30107a;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e = e3;
            packageInfo = null;
            f62044a.mo33425a(e, "setApplicationManifest", new Object[0]);
            status = Status.f30109c;
            adgc.mo33441a(status, packageInfo);
        }
        adgc.mo33441a(status, packageInfo);
    }

    /* renamed from: a */
    public final void mo33458a(adgc adgc, List list, boolean z) {
        if (cepl.f183185a.mo6606a().mo79549t()) {
            m50701c();
        }
        this.f62061r.mo25649a(new adkk(adgc, this.f62055l, list, z));
    }

    /* renamed from: b */
    public final void mo33472b(rnt rnt) {
        m50698a();
        this.f62061r.mo25649a(new adjj(this.f62059p, rnt, camh.ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_UPDATE_DOMAIN_FILTER));
    }

    /* renamed from: b */
    public final void mo33473b(rnt rnt, String str) {
        adfb a = this.f62049f.mo33411a();
        new Object[1][0] = str;
        m50698a();
        adkr adkr = this.f62051h;
        adkr.f62071a.mo33601a(str);
        int a2 = adkr.mo33606a();
        if (a2 != 1) {
            adkr.f62072b.edit().putInt("optInState", 1).putInt("optInLanguageVersion", 0).remove("optInNextPromptSecondsSinceEpoch").remove("optInOneMoreChance").remove("optInLastDeclineMillisSinceEpoch").remove("optInNumDeclines").apply();
        }
        adkr.mo33608a(adkr.f62071a.mo33600a(), a2, 1);
        this.f62059p.mo33564b(camh.ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_OPT_IN);
        a.mo33409a("InstantAppsService.optIn");
        rnt.mo11797a(Status.f30107a);
    }

    /* renamed from: a */
    public final void mo33459a(rnt rnt) {
        m50701c();
        this.f62058o.mo33547a();
        rnt.mo11797a(Status.f30107a);
    }

    /* renamed from: a */
    public final void mo33460a(rnt rnt, int i) {
        m50701c();
        this.f62058o.mo33548a(i);
        rnt.mo11797a(Status.f30107a);
    }

    /* renamed from: a */
    public final void mo33461a(rnt rnt, int i, String str) {
        m50701c();
        this.f62058o.mo33549a(i, str);
        try {
            adik adik = this.f62055l;
            adik.mo33534b();
            bxvd da = adid.f61775d.mo74144da();
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bytes = String.valueOf(str).concat("-ls").getBytes(adfh.f61554b);
            byte[] a = adik.f61808c.mo33514a(bytes);
            if (a != null) {
                if (a.length > 0) {
                    da.mo73635b(a, bxus.m123743b());
                }
            }
            if (((adid) da.f164949b).f61777a == 0) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((adid) da.f164949b).f61777a = currentTimeMillis;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            adid adid = (adid) da.f164949b;
            adid.f61778b = currentTimeMillis;
            adid.f61779c++;
            adik.f61808c.mo33512a(bytes, ((adid) da.mo74062i()).mo73642k());
        } catch (IOException e) {
            f62044a.mo33425a(e, "Unable to persist launch of app, continuing", new Object[0]);
        }
        rnt.mo11797a(Status.f30107a);
    }

    /* renamed from: b */
    public final void mo33474b(rnt rnt, String str, String str2, String str3) {
        m50701c();
        this.f62058o.mo33551b(str3, new ComponentName(str, str2));
        rnt.mo11797a(Status.f30107a);
    }

    /* renamed from: b */
    public final void mo33475b(rnt rnt, boolean z) {
        m50699b();
        if (ceot.m137680b()) {
            rnt.mo11797a(Status.f30112f);
            return;
        }
        this.f62053j.edit().putBoolean("IS_AIA_ENABLED", z).apply();
        rnt.mo11797a(Status.f30107a);
    }

    /* renamed from: a */
    public final void mo33462a(rnt rnt, PackageInfo packageInfo) {
        m50702d();
        m50705g();
        this.f62061r.mo25649a(new adlj(this.f62056m, rnt, packageInfo));
    }

    /* renamed from: a */
    public final void mo33463a(rnt rnt, PackageInfo packageInfo, ParcelFileDescriptor parcelFileDescriptor) {
        m50702d();
        m50705g();
        this.f62061r.mo25649a(new adll(this.f62056m, rnt, packageInfo, parcelFileDescriptor));
    }

    /* renamed from: a */
    public final void mo33464a(rnt rnt, String str) {
        adfb a = this.f62049f.mo33411a();
        new Object[1][0] = str;
        m50698a();
        adkr adkr = this.f62051h;
        new Object[1][0] = str;
        int i = adkr.f62072b.getInt("optInNumDeclines", 0) + 1;
        if (((long) i) >= cepl.m137724e()) {
            adkr.mo33609a(str);
        } else {
            adkr.f62072b.edit().putInt("optInNumDeclines", i).putLong("optInLastDeclineMillisSinceEpoch", System.currentTimeMillis()).apply();
        }
        a.mo33409a("InstantAppsService.declineOptIn");
        rnt.mo11797a(Status.f30107a);
    }

    /* renamed from: a */
    public final synchronized void mo33465a(rnt rnt, String str, String str2, int i) {
        m50701c();
        try {
            this.f62055l.mo33532a(str, str2, i);
            rnt.mo11797a(Status.f30107a);
        } catch (IOException e) {
            f62044a.mo33425a(e, "setPackagePermission", new Object[0]);
            rnt.mo11797a(new Status(8, e.getMessage()));
        }
    }

    /* renamed from: a */
    public final void mo33466a(rnt rnt, String str, String str2, String str3) {
        m50701c();
        this.f62058o.mo33550a(str3, new ComponentName(str, str2));
        rnt.mo11797a(Status.f30107a);
    }

    /* renamed from: a */
    public final void mo33467a(rnt rnt, String str, boolean z) {
        m50701c();
        try {
            if (str.contains(":")) {
                adik adik = this.f62055l;
                String str2 = str.split(":")[0];
                String[] split = str.split(":");
                bxvd da = adhx.f61745d.mo74144da();
                bxvd da2 = adhw.f61742b.mo74144da();
                bxvd da3 = adia.f61759b.mo74144da();
                long parseLong = Long.parseLong(split[1]);
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                ((adia) da3.f164949b).f61761a = parseLong;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                adia adia = (adia) da3.mo74062i();
                adia.getClass();
                ((adhw) da2.f164949b).f61744a = adia;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                adhw adhw = (adhw) da2.mo74062i();
                adhw.getClass();
                ((adhx) da.f164949b).f61748b = adhw;
                bxvd da4 = adhy.f61750b.mo74144da();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                ((adhy) da4.f164949b).f61752a = true;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                adhy adhy = (adhy) da4.mo74062i();
                adhy.getClass();
                ((adhx) da.f164949b).f61747a = adhy;
                adik.mo33531a(str2, (adhx) da.mo74062i());
            } else {
                adik adik2 = this.f62055l;
                bxvd da5 = adhy.f61750b.mo74144da();
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                ((adhy) da5.f164949b).f61752a = true;
                adhy adhy2 = (adhy) da5.mo74062i();
                bxvd da6 = adhw.f61742b.mo74144da();
                if (z) {
                    bxvd da7 = adia.f61759b.mo74144da();
                    if (da7.f164950c) {
                        da7.mo74035c();
                        da7.f164950c = false;
                    }
                    ((adia) da7.f164949b).f61761a = Long.MAX_VALUE;
                    adia adia2 = (adia) da7.mo74062i();
                    if (da6.f164950c) {
                        da6.mo74035c();
                        da6.f164950c = false;
                    }
                    adia2.getClass();
                    ((adhw) da6.f164949b).f61744a = adia2;
                }
                bxvd da8 = adhx.f61745d.mo74144da();
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                adhx adhx = (adhx) da8.f164949b;
                adhy2.getClass();
                adhx.f61747a = adhy2;
                adhw adhw2 = (adhw) da6.mo74062i();
                adhw2.getClass();
                adhx.f61748b = adhw2;
                adik2.mo33531a(str, (adhx) da8.mo74062i());
            }
            rnt.mo11797a(Status.f30107a);
        } catch (IOException e) {
            f62044a.mo33425a(e, "setUserPrefersBrowser", new Object[0]);
            rnt.mo11797a(new Status(8, e.getMessage()));
        }
    }

    /* renamed from: a */
    public final void mo33468a(rnt rnt, String str, byte[] bArr) {
        m50702d();
        if (bArr != null) {
            try {
                bxus b = bxus.m123743b();
                this.f62055l.mo33531a(str, (adhx) bxvk.m124016a(adhx.f61745d, bArr, b));
                rnt.mo11797a(Status.f30107a);
            } catch (IOException e) {
                f62044a.mo33425a(e, "setAppOverrides", new Object[0]);
                rnt.mo11797a(new Status(8, e.getMessage()));
            }
        } else {
            throw new IllegalArgumentException("appOverridesUpdateProtoBytes cannot be null.");
        }
    }

    /* renamed from: a */
    public final void mo33469a(rnt rnt, boolean z) {
        m50701c();
        try {
            this.f62059p.mo33565b();
            this.f62055l.mo33530a();
            this.f62051h.f62072b.edit().clear().apply();
            this.f62050g.f62066a.edit().clear().apply();
            if (z) {
                this.f62059p.mo33564b(camh.ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_DELETE_ALL_DATA);
            }
            this.f62058o.mo33547a();
            rnt.mo11797a(Status.f30107a);
        } catch (IOException e) {
            f62044a.mo33425a(e, "deleteAllData", new Object[0]);
            rnt.mo11797a(new Status(8, e.getMessage()));
        }
    }
}
