package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.UserPreferredSleepWindow;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bgaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgaq {

    /* renamed from: l */
    public static final int[] f115912l = {0, 1, 2, 3, 7, 8};

    /* renamed from: m */
    public static final int[] f115913m = {0, 1, 2, 3, 7, 8, 17, 16, 20, 22};

    /* renamed from: a */
    public final Context f115914a;

    /* renamed from: b */
    public final bfqm f115915b;

    /* renamed from: c */
    public final bfuh f115916c;

    /* renamed from: d */
    public final bfyw f115917d;

    /* renamed from: e */
    public final bern f115918e;

    /* renamed from: f */
    public final sns f115919f;

    /* renamed from: g */
    public final bfld f115920g;

    /* renamed from: h */
    public final bflh f115921h;

    /* renamed from: i */
    public final bflm f115922i;

    /* renamed from: j */
    public final spx f115923j;

    /* renamed from: k */
    public final ArrayList f115924k = new ArrayList();

    /* renamed from: n */
    private bgbc f115925n;

    /* renamed from: o */
    private final snr f115926o;

    public bgaq(Context context) {
        Context context2 = context;
        bfyw bfyw = new bfyw(context2);
        bfuh bfuh = new bfuh(context2);
        spx a = spx.m35925a(context);
        spx spx = a;
        bfqm bfqm = new bfqm(context, spx.m35925a(context), new bfrw(context2, new adzt(bfqt.m97589a())), rfz.m33557a(context), new bhbx(), sss.m36260a(context), sps.m35913a(context2, new adzt(bfqt.m97589a())), new bfoy(), rsk.m34337b(context2, "com.google.android.location.internal.GoogleLocationManagerService", 1, bfpr.f114809a), spf.m35821a(context), ssh.m36213a(context), bfqt.m97589a(), bfuh.f115330f);
        this.f115914a = context2;
        this.f115917d = bfyw;
        this.f115916c = bfuh;
        this.f115915b = bfqm;
        this.f115925n = new bgbc(context2);
        this.f115918e = new bern(context2);
        this.f115919f = new sns("GLMSImpl", 9);
        snr snr = new snr(this.f115919f);
        this.f115926o = snr;
        int i = Build.VERSION.SDK_INT;
        bflg bflg = new bflg(context2, snr);
        this.f115920g = bflg;
        bflg bflg2 = bflg;
        bflg2.f114334a.registerReceiver(bflg2.f114339f, new IntentFilter("com.google.android.gms.phenotype.COMMITTED"));
        if (ceyy.m138450c()) {
            bflg2.f114336c.mo61899a(bflg, bflg.m97175b());
        }
        bflg2.f114340g = true;
        snr snr2 = this.f115926o;
        int i2 = Build.VERSION.SDK_INT;
        bfll bfll = new bfll(context2, snr2);
        this.f115921h = bfll;
        bfll bfll2 = bfll;
        bfll2.f114343a.mo72629a(5147455389092024324L, bfll, bfll2.f114345c);
        bfll2.f114343a.mo72632a(bfll2.f114347e, bfll2.f114345c);
        bfll2.mo61885c();
        bfll2.mo61882a(bfll2.f114348f);
        bfll2.mo61881a(2, bfll2.f114348f);
        snr snr3 = this.f115926o;
        int i3 = Build.VERSION.SDK_INT;
        bflq bflq = new bflq(context2, snr3);
        this.f115922i = bflq;
        bflq.mo61891a();
        int i4 = Build.VERSION.SDK_INT;
        int i5 = Build.VERSION.SDK_INT;
        this.f115923j = spx;
        context2.sendBroadcast(new Intent("android.location.HIGH_POWER_REQUEST_CHANGE"));
    }

    /* renamed from: a */
    public final synchronized bgbc mo62555a() {
        if (this.f115925n == null) {
            this.f115925n = new bgbc(this.f115914a);
        }
        return this.f115925n;
    }

    /* renamed from: b */
    public final int mo62566b(Intent intent) {
        int size = this.f115924k.size();
        for (int i = 0; i < size; i++) {
            if (((Intent) this.f115924k.get(i)).filterEquals(intent)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo62568c() {
        if (mo62570e()) {
            SharedPreferences sharedPreferences = this.f115914a.getSharedPreferences("activityRecognitionAccuracyModeName", 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getInt("arAccuracyModePref", 0);
            }
            Log.e("GLMSImpl", "null pref for activity recognition accuracy mode was found ");
            return 0;
        }
        throw new SecurityException("Activity recognition  setActivityRecognitionMode is only available to zero party");
    }

    /* renamed from: d */
    public final boolean mo62569d() {
        return rfz.m33557a(this.f115914a).mo24608b(Binder.getCallingUid());
    }

    /* renamed from: e */
    public final boolean mo62570e() {
        return rfy.m33544a(this.f115914a, Binder.getCallingUid());
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ba A[Catch:{ all -> 0x019b }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0126  */
    /* renamed from: a */
    public final Status mo62556a(PendingIntent pendingIntent, String str, SleepSegmentRequest sleepSegmentRequest) {
        List list;
        int i;
        if (!cfam.m138532b()) {
            bero.m95591a(this.f115914a, str);
        }
        boolean d = mo62569d();
        if (cfam.f183546a.mo6606a().sleepDetectionFirstPartyOnly() && !d) {
            throw new SecurityException("This API is not supported yet.");
        }
        mo62560a(pendingIntent, str);
        WorkSource a = stx.m36334a(Binder.getCallingUid(), pendingIntent.getTargetPackage());
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            int i2 = Build.VERSION.SDK_INT;
            String creatorPackage = pendingIntent.getCreatorPackage();
            Context context = this.f115914a;
            boolean z = true;
            if (cfam.m138540j()) {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer") && packageManager.hasSystemFeature("android.hardware.sensor.light")) {
                    long minBedtimeSupportedGmscoreVersion = cfam.f183546a.mo6606a().minBedtimeSupportedGmscoreVersion();
                    try {
                        i = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
                    } catch (PackageManager.NameNotFoundException e) {
                        i = 0;
                    }
                    if (((long) i) >= minBedtimeSupportedGmscoreVersion) {
                        String sleepApiWhitelist = cfam.f183546a.mo6606a().sleepApiWhitelist();
                        if (TextUtils.isEmpty(sleepApiWhitelist) || TextUtils.isEmpty(creatorPackage)) {
                            if (z) {
                                Context context2 = this.f115914a;
                                String preferredSleepTimeWhitelist = cfam.f183546a.mo6606a().preferredSleepTimeWhitelist();
                                if (TextUtils.isEmpty(preferredSleepTimeWhitelist) || TextUtils.isEmpty(creatorPackage) || bmyx.m108640a(',').mo66925c((CharSequence) preferredSleepTimeWhitelist).contains(creatorPackage)) {
                                    if (!(sleepSegmentRequest == null || (list = sleepSegmentRequest.f79393a) == null || list.isEmpty())) {
                                        UserPreferredSleepWindow userPreferredSleepWindow = (UserPreferredSleepWindow) sleepSegmentRequest.f79393a.get(0);
                                        SharedPreferences.Editor edit = context2.getSharedPreferences("SLEEP_PREF_NAME", 0).edit();
                                        edit.putInt("userPreferredSleepStartHour", userPreferredSleepWindow.f79394a);
                                        edit.putInt("userPreferredSleepStartMinute", userPreferredSleepWindow.f79395b);
                                        edit.putInt("userPreferredSleepEndHour", userPreferredSleepWindow.f79396c);
                                        edit.putInt("userPreferredSleepEndMinute", userPreferredSleepWindow.f79397d);
                                        edit.commit();
                                    }
                                }
                            }
                            if (!z) {
                                return Status.f30111e;
                            }
                            bxbi bxbi = new bxbi(this.f115914a.getPackageName());
                            if (bxbi.f161815a.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_REMOVE")) {
                                bxbi.m122522b();
                            }
                            bxbi.f161815a.putExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_PENDING_INTENT", pendingIntent);
                            bxbi.f161815a.putExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_TAG", "GLMSImplProxy");
                            if (sleepSegmentRequest != null) {
                                List list2 = sleepSegmentRequest.f79393a;
                                if (list2 != null && !list2.isEmpty()) {
                                    UserPreferredSleepWindow userPreferredSleepWindow2 = (UserPreferredSleepWindow) list2.get(0);
                                    bxbi.f161815a.putExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_START_HOUR", userPreferredSleepWindow2.f79394a);
                                    bxbi.f161815a.putExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_START_MINUTE", userPreferredSleepWindow2.f79395b);
                                    bxbi.f161815a.putExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_END_HOUR", userPreferredSleepWindow2.f79396c);
                                    bxbi.f161815a.putExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_END_MINUTE", userPreferredSleepWindow2.f79397d);
                                }
                                sef.m35071a(sleepSegmentRequest, bxbi.f161815a, "com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_REQUEST");
                            }
                            bxbi.mo73554a(d);
                            bxbi.mo73552a(a);
                            bxbi.mo73549a(this.f115914a);
                            return Status.f30107a;
                        } else if (!bmyx.m108640a(',').mo66925c((CharSequence) sleepApiWhitelist).contains(creatorPackage)) {
                            String valueOf = String.valueOf(creatorPackage);
                            throw new SecurityException(valueOf.length() == 0 ? new String("App should be whitelisted for Sleep Segment API - ") : "App should be whitelisted for Sleep Segment API - ".concat(valueOf));
                        } else {
                            if (z) {
                            }
                            if (!z) {
                            }
                        }
                    }
                }
            }
            z = false;
            if (z) {
            }
            if (!z) {
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: b */
    public final boolean mo62567b() {
        return bhcd.m100623a(this.f115914a) == 2;
    }

    /* renamed from: a */
    public final void mo62557a(int i) {
        if (bhcd.m100623a(this.f115914a) >= i) {
            return;
        }
        if (i != 2) {
            throw new SecurityException("Client must have ACCESS_COARSE_LOCATION or ACCESS_FINE_LOCATION permission to perform any location operations.");
        }
        throw new SecurityException("Client must have ACCESS_FINE_LOCATION permission to request PRIORITY_HIGH_ACCURACY locations.");
    }

    /* renamed from: a */
    public final void mo62558a(aehw aehw) {
        this.f115915b.mo62131a(aehw);
    }

    /* renamed from: a */
    public final void mo62559a(PendingIntent pendingIntent) {
        this.f115915b.mo62133a(pendingIntent);
    }

    /* renamed from: a */
    public final void mo62560a(PendingIntent pendingIntent, String str) {
        if (pendingIntent == null) {
            throw new IllegalArgumentException("invalid null pending intent");
        } else if (!str.equals(pendingIntent.getTargetPackage())) {
            throw new SecurityException("PendingIntent's target package can't be different to the request package.");
        }
    }

    /* renamed from: a */
    public final void mo62561a(Intent intent) {
        beyc.m96082a(this.f115914a);
        synchronized (this.f115924k) {
            this.f115924k.isEmpty();
            if (mo62566b(intent) < 0) {
                this.f115924k.add(intent);
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo62562a(LocationRequest locationRequest, aehw aehw, String str) {
        mo62564a(LocationRequestInternal.m66889a(null, locationRequest), aehw, null, str);
    }

    /* renamed from: a */
    public final void mo62563a(LocationRequestInternal locationRequestInternal) {
        int i;
        if (locationRequestInternal.f79420b.f79349a == 100) {
            i = 2;
        } else {
            i = 1;
        }
        mo62557a(i);
        boolean d = mo62569d();
        if ((locationRequestInternal.f79423e || !locationRequestInternal.f79421c.isEmpty() || locationRequestInternal.f79427i) && !d) {
            Log.e("GLMSImpl", String.format("Uid %s must be signed by Google to use internal features: %s", Integer.valueOf(Binder.getCallingUid()), locationRequestInternal));
            locationRequestInternal.f79423e = false;
            locationRequestInternal.f79421c = LocationRequestInternal.f79419a;
            locationRequestInternal.f79427i = false;
        }
    }

    /* renamed from: a */
    public final void mo62564a(LocationRequestInternal locationRequestInternal, aehw aehw, aejv aejv, String str) {
        mo62563a(locationRequestInternal);
        bfqm bfqm = this.f115915b;
        boolean b = mo62567b();
        if (aehw == null) {
            bftx.m97877a("Received null listener to add uid:%s packages:%s request: %s", Integer.valueOf(Binder.getCallingUid()), Arrays.toString(svr.m36484b(bfqm.f114879f).mo26175a(Binder.getCallingUid())), locationRequestInternal);
            return;
        }
        bfqm.m97529b(locationRequestInternal, str);
        LocationRequestInternal b2 = LocationRequestInternal.m66890b(locationRequestInternal);
        boolean a = bfqm.mo62142a(b2, str);
        bfqm.f114889p.mo62099a(21, new bfqe(bfqm, Binder.getCallingUid(), str, b2, b, a, aehw, aejv));
    }

    /* renamed from: a */
    public final void mo62565a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent) {
        mo62563a(locationRequestInternal);
        this.f115915b.mo62134a(locationRequestInternal, pendingIntent, mo62567b());
    }
}
