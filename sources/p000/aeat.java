package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: aeat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeat {

    /* renamed from: e */
    private static aeat f63008e;

    /* renamed from: a */
    public final Context f63009a;

    /* renamed from: b */
    public final bqgj f63010b;

    /* renamed from: c */
    public final bmzi f63011c = bmzn.m108681a((bmzi) new aeaj(this));

    /* renamed from: d */
    public final Map f63012d = new C1223np();

    /* renamed from: f */
    private final bmzi f63013f = bmzn.m108681a((bmzi) new aeak(this));

    /* renamed from: g */
    private aebs f63014g;

    /* renamed from: h */
    private final aecm f63015h = new aecm(aeal.f62993a, "-*/com.google.android.gms.clearcut.uploader.QosUploaderService:*,-*/com.google.android.gms.gcm.HeartbeatAlarm$ConnectionInfoPersistService:*,-*/com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator:*,-*/com.google.android.gms.phenotype.service.sync.PackageUpdateTaskService:*,-*/com.google.android.gms.checkin.EventLogService:*,-*/com.google.android.gms.checkin.CheckinService:*,-*/com.google.android.gms.chimera.container.ConfigService:*");

    private aeat(Context context) {
        bqgj b = snp.m35704b(10);
        this.f63009a = context;
        this.f63010b = b;
    }

    /* renamed from: a */
    public static aeat m51532a(Context context) {
        aeat aeat;
        synchronized (aeat.class) {
            if (f63008e == null) {
                f63008e = new aeat(context.getApplicationContext());
            }
            aeat = f63008e;
        }
        return aeat;
    }

    /* renamed from: b */
    private static int m51534b(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return -1;
        } catch (PackageManager.NameNotFoundException e) {
            return -1;
        }
    }

    /* renamed from: c */
    private final synchronized bqgg m51536c() {
        int i;
        if (this.f63014g == null) {
            int b = m51534b(this.f63009a);
            if (b <= 0) {
                Log.e("GmsTaskScheduler", "Google Play services is not available, dropping all GcmNetworkManager requests");
                return bqga.m112775a(new aebt());
            }
            if (b < 15300000) {
                i = 4;
            } else {
                i = 16;
            }
            this.f63014g = new aebr(this.f63009a, i, b);
        }
        return bqga.m112775a(this.f63014g);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        return false;
     */
    /* renamed from: d */
    public final synchronized boolean mo33991d(String str, String str2) {
        Boolean bool;
        Map map = (Map) this.f63012d.get(str2);
        if (map != null && (bool = (Boolean) map.get(str)) != null) {
            return bool.booleanValue();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    private final void m51533a(String str, boolean z) {
        List<ResolveInfo> list;
        Intent intent;
        sdo.m34966a((Object) str, (Object) "GmsTaskChimeraService must not be null.");
        PackageManager packageManager = this.f63009a.getPackageManager();
        if (packageManager == null) {
            list = bngx.m109376e();
        } else {
            if (str == null) {
                intent = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setPackage(this.f63009a.getPackageName());
            } else {
                intent = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setClassName(this.f63009a, str);
            }
            list = packageManager.queryIntentServices(intent, 0);
        }
        if (!sqw.m36041a((Collection) list)) {
            for (ResolveInfo resolveInfo : list) {
                if (resolveInfo.serviceInfo != null && resolveInfo.serviceInfo.enabled) {
                    return;
                }
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 122);
            sb.append("The task service proxy class you provided ");
            sb.append(str);
            sb.append(" does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY");
            throw new IllegalArgumentException(sb.toString());
        }
        if (z) {
            if (aecj.m51628a(this.f63009a, String.valueOf(str).concat(".ACTION_TASK_READY")) != null) {
                return;
            }
        }
        Log.e("GmsTaskScheduler", String.valueOf(str).concat(" is not available. This may cause the task to be lost."));
    }

    /* renamed from: b */
    static void m51535b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must provide a valid tag.");
        } else if (str.length() > 100) {
            throw new IllegalArgumentException("Tag is larger than max permissible tag length (100)");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized aebs mo33987b() {
        int i;
        int b = m51534b(this.f63009a);
        if (b <= 0) {
            Log.e("GmsTaskScheduler", "Google Play services is not available, dropping all GcmNetworkManager requests");
            return new aebt();
        }
        if (b < 15300000) {
            i = 4;
        } else {
            i = 16;
        }
        return new aebr(this.f63009a, i, b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo33989c(String str, String str2) {
        Map map = (Map) this.f63012d.get(str2);
        if (!(map == null || map.remove(str) == null || !map.isEmpty())) {
            this.f63012d.remove(str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized boolean mo33988b(String str, String str2) {
        Map map = (Map) this.f63012d.get(str2);
        if (map == null) {
            map = new C1223np();
            this.f63012d.put(str2, map);
        }
        return map.put(str, false) == null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized boolean mo33990c(String str) {
        return this.f63012d.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized bqgg mo33982a() {
        int i;
        int b = m51534b(this.f63009a);
        if (b <= 0) {
            Log.e("GmsTaskScheduler", "Google Play services is not available, dropping all GcmNetworkManager requests");
            return bqga.m112775a(new aebt());
        }
        if (b < 15300000) {
            i = 4;
        } else {
            i = 16;
        }
        if (!cdnj.m134207c()) {
            if (!cdnj.m134208d()) {
                return bqga.m112775a(new aebr(this.f63009a, i, b));
            }
        }
        return aih.m807a(new aeam(this, i, b));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo33983a(aeas aeas, String str) {
        bqgg bqgg;
        if (!str.isEmpty() && cdnj.m134208d()) {
            aeck aeck = new aeck();
            aeck.f63141d = str;
            if (!this.f63015h.mo6527a(aeck.mo34036a())) {
                bqgg = m51536c();
                bqga.m112781a(bqgg, new aear(aeas), bqfb.INSTANCE);
            }
        }
        bqgg = (bqgg) this.f63013f.mo6606a();
        bqga.m112781a(bqgg, new aear(aeas), bqfb.INSTANCE);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aeat.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      aeat.a(aeas, java.lang.String):void
      aeat.a(java.lang.String, java.lang.String):void
      aeat.a(java.lang.String, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r1 == 2) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r1 == 2) goto L_0x0034;
     */
    /* renamed from: a */
    public final synchronized void mo33984a(aeca aeca) {
        String valueOf = String.valueOf(aeca.f63114g);
        aech aech = new aech(valueOf.length() == 0 ? new String("nts:client:schedule:") : "nts:client:schedule:".concat(valueOf));
        try {
            int i = aeca.f63113f;
            if (i == 0) {
            }
            m51533a(aeca.f63112e, false);
            int i2 = aeca.f63113f;
            if (i2 == 1) {
            }
            String str = aeca.f63112e;
            if (aecj.m51628a(this.f63009a, String.valueOf(str).concat(".ACTION_TASK_READY")) == null) {
                Log.e("GmsTaskScheduler", String.valueOf(str).concat(" is not available. This may cause the task to be lost."));
            }
            mo33983a(new aean(this, aeca), aeca.f63112e);
            aech.close();
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        return;
        throw th;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aeat.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      aeat.a(aeas, java.lang.String):void
      aeat.a(java.lang.String, java.lang.String):void
      aeat.a(java.lang.String, boolean):void */
    /* renamed from: a */
    public final void mo33985a(String str) {
        ComponentName componentName = new ComponentName(this.f63009a, str);
        aech aech = new aech("nts:client:cancelAll");
        try {
            m51533a(componentName.getClassName(), true);
            mo33983a(new aeap(componentName), componentName.getClassName());
            aech.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aeat.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      aeat.a(aeas, java.lang.String):void
      aeat.a(java.lang.String, java.lang.String):void
      aeat.a(java.lang.String, boolean):void */
    /* renamed from: a */
    public final void mo33986a(String str, String str2) {
        ComponentName componentName = new ComponentName(this.f63009a, str2);
        String valueOf = String.valueOf(str);
        aech aech = new aech(valueOf.length() == 0 ? new String("nts:client:cancel:") : "nts:client:cancel:".concat(valueOf));
        try {
            m51535b(str);
            m51533a(componentName.getClassName(), true);
            mo33983a(new aeao(componentName, str), componentName.getClassName());
            aech.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
