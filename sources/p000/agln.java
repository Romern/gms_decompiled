package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: agln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agln extends agcu {

    /* renamed from: b */
    public final aglm f65886b;

    /* renamed from: c */
    public aghq f65887c;

    /* renamed from: d */
    public volatile Boolean f65888d;

    /* renamed from: e */
    private final agdo f65889e;

    /* renamed from: f */
    private final agmc f65890f;

    /* renamed from: g */
    private final List f65891g = new ArrayList();

    /* renamed from: h */
    private final agdo f65892h;

    public agln(agje agje) {
        super(agje);
        this.f65890f = new agmc(agje.f65696l);
        this.f65886b = new aglm(this);
        this.f65889e = new aglb(this, agje);
        this.f65892h = new aglc(this, agje);
    }

    /* renamed from: D */
    public final void mo35614D() {
        mo35241h();
        mo35497E().f65572k.mo35436a("Processing queued up service tasks", Integer.valueOf(this.f65891g.size()));
        List list = this.f65891g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((Runnable) list.get(i)).run();
            } catch (Exception e) {
                mo35497E().f65564c.mo35436a("Task exception while flushing queue", e);
            }
        }
        this.f65891g.clear();
        this.f65892h.mo35370c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0214  */
    /* renamed from: a */
    public final AppMetadata mo35615a(boolean z) {
        String str;
        boolean z2;
        String str2;
        Long valueOf;
        String str3;
        long j;
        Boolean c;
        boolean z3;
        long j2;
        if (mo35537u().f65291a) {
            return null;
        }
        aghr e = mo35238e();
        String c2 = z ? mo35497E().mo35443c() : null;
        e.mo35241h();
        e.mo35242i();
        String o = e.mo35404o();
        String p = e.mo35405p();
        e.mo35245l();
        String str4 = e.f65530c;
        long r = (long) e.mo35407r();
        e.mo35245l();
        String str5 = e.f65532e;
        long s = e.mo35408s();
        e.mo35245l();
        e.mo35241h();
        long j3 = e.f65533f;
        if (j3 == 0) {
            agms f = e.f65756y.mo35502f();
            Context z4 = e.mo35542z();
            String packageName = e.mo35542z().getPackageName();
            f.mo35241h();
            sdo.m34959a(z4);
            sdo.m34977c(packageName);
            PackageManager packageManager = z4.getPackageManager();
            MessageDigest f2 = agms.m54595f();
            long j4 = -1;
            if (f2 == null) {
                f.mo35497E().f65564c.mo35435a("Could not get MD5 instance");
                j2 = -1;
            } else if (packageManager != null) {
                try {
                    if (!f.mo35734a(z4, packageName)) {
                        PackageInfo b = svr.m36484b(z4).mo26176b(f.mo35542z().getPackageName(), 64);
                        if (b.signatures == null || b.signatures.length <= 0) {
                            f.mo35497E().f65567f.mo35435a("Could not get signatures");
                        } else {
                            j4 = agms.m54588a(f2.digest(b.signatures[0].toByteArray()));
                        }
                    } else {
                        j4 = 0;
                    }
                    j2 = j4;
                } catch (PackageManager.NameNotFoundException e2) {
                    f.mo35497E().f65564c.mo35436a("Package name not found", e2);
                    j2 = 0;
                }
            } else {
                j2 = 0;
            }
            e.f65533f = j2;
            j3 = j2;
        }
        boolean q = e.f65756y.mo35513q();
        boolean z5 = !e.mo35539w().f65633r;
        e.mo35241h();
        e.mo35242i();
        if (e.f65756y.mo35513q()) {
            cflg.f184262a.mo6606a();
            try {
                Class<?> loadClass = e.mo35542z().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (loadClass != null) {
                    try {
                        Method declaredMethod = loadClass.getDeclaredMethod("getInstance", Context.class);
                        z2 = q;
                        try {
                            Object[] objArr = new Object[1];
                            str = c2;
                            try {
                                objArr[0] = e.mo35542z();
                                Object invoke = declaredMethod.invoke(null, objArr);
                                if (invoke != null) {
                                    try {
                                        str2 = (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                                    } catch (Exception e3) {
                                        e.mo35497E().f65569h.mo35435a("Failed to retrieve Firebase Instance Id");
                                        str2 = null;
                                    }
                                    agje agje = e.f65756y;
                                    valueOf = Long.valueOf(agje.mo35499a().f65624i.mo35458a());
                                    if (valueOf.longValue() == 0) {
                                        str3 = str2;
                                        j = Math.min(agje.f65708x, valueOf.longValue());
                                    } else {
                                        str3 = str2;
                                        j = agje.f65708x;
                                    }
                                    int t = e.mo35409t();
                                    boolean booleanValue = e.mo35538v().mo35325f().booleanValue();
                                    agdi v = e.mo35538v();
                                    v.mo35242i();
                                    c = v.mo35319c("google_analytics_ssaid_collection_enabled");
                                    if (c != null || c.booleanValue()) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    boolean booleanValue2 = Boolean.valueOf(z3).booleanValue();
                                    agiq w = e.mo35539w();
                                    w.mo35241h();
                                    boolean z6 = w.mo35468c().getBoolean("deferred_analytics_collection", false);
                                    String q2 = e.mo35406q();
                                    Boolean c3 = e.mo35538v().mo35319c("google_analytics_default_allow_ad_personalization_signals");
                                    Boolean valueOf2 = c3 == null ? Boolean.valueOf(!c3.booleanValue()) : null;
                                    long j5 = e.f65534g;
                                    List list = !e.mo35538v().mo35314a(aghn.f65468X) ? e.f65535h : null;
                                    cfjt.m139846c();
                                    return new AppMetadata(o, p, str4, r, str5, s, j3, str, z2, z5, str3, 0, j, t, booleanValue, booleanValue2, z6, q2, valueOf2, j5, list);
                                }
                                str2 = null;
                            } catch (Exception e4) {
                                e.mo35497E().f65568g.mo35435a("Failed to obtain Firebase Analytics instance");
                                str2 = null;
                                agje agje2 = e.f65756y;
                                valueOf = Long.valueOf(agje2.mo35499a().f65624i.mo35458a());
                                if (valueOf.longValue() == 0) {
                                }
                                int t2 = e.mo35409t();
                                boolean booleanValue3 = e.mo35538v().mo35325f().booleanValue();
                                agdi v2 = e.mo35538v();
                                v2.mo35242i();
                                c = v2.mo35319c("google_analytics_ssaid_collection_enabled");
                                if (c != null) {
                                }
                                z3 = true;
                                boolean booleanValue22 = Boolean.valueOf(z3).booleanValue();
                                agiq w2 = e.mo35539w();
                                w2.mo35241h();
                                boolean z62 = w2.mo35468c().getBoolean("deferred_analytics_collection", false);
                                String q22 = e.mo35406q();
                                Boolean c32 = e.mo35538v().mo35319c("google_analytics_default_allow_ad_personalization_signals");
                                if (c32 == null) {
                                }
                                long j52 = e.f65534g;
                                if (!e.mo35538v().mo35314a(aghn.f65468X)) {
                                }
                                cfjt.m139846c();
                                return new AppMetadata(o, p, str4, r, str5, s, j3, str, z2, z5, str3, 0, j, t2, booleanValue3, booleanValue22, z62, q22, valueOf2, j52, list);
                            }
                        } catch (Exception e5) {
                            str = c2;
                            e.mo35497E().f65568g.mo35435a("Failed to obtain Firebase Analytics instance");
                            str2 = null;
                            agje agje22 = e.f65756y;
                            valueOf = Long.valueOf(agje22.mo35499a().f65624i.mo35458a());
                            if (valueOf.longValue() == 0) {
                            }
                            int t22 = e.mo35409t();
                            boolean booleanValue32 = e.mo35538v().mo35325f().booleanValue();
                            agdi v22 = e.mo35538v();
                            v22.mo35242i();
                            c = v22.mo35319c("google_analytics_ssaid_collection_enabled");
                            if (c != null) {
                            }
                            z3 = true;
                            boolean booleanValue222 = Boolean.valueOf(z3).booleanValue();
                            agiq w22 = e.mo35539w();
                            w22.mo35241h();
                            boolean z622 = w22.mo35468c().getBoolean("deferred_analytics_collection", false);
                            String q222 = e.mo35406q();
                            Boolean c322 = e.mo35538v().mo35319c("google_analytics_default_allow_ad_personalization_signals");
                            if (c322 == null) {
                            }
                            long j522 = e.f65534g;
                            if (!e.mo35538v().mo35314a(aghn.f65468X)) {
                            }
                            cfjt.m139846c();
                            return new AppMetadata(o, p, str4, r, str5, s, j3, str, z2, z5, str3, 0, j, t22, booleanValue32, booleanValue222, z622, q222, valueOf2, j522, list);
                        }
                    } catch (Exception e6) {
                        str = c2;
                        z2 = q;
                        e.mo35497E().f65568g.mo35435a("Failed to obtain Firebase Analytics instance");
                        str2 = null;
                        agje agje222 = e.f65756y;
                        valueOf = Long.valueOf(agje222.mo35499a().f65624i.mo35458a());
                        if (valueOf.longValue() == 0) {
                        }
                        int t222 = e.mo35409t();
                        boolean booleanValue322 = e.mo35538v().mo35325f().booleanValue();
                        agdi v222 = e.mo35538v();
                        v222.mo35242i();
                        c = v222.mo35319c("google_analytics_ssaid_collection_enabled");
                        if (c != null) {
                        }
                        z3 = true;
                        boolean booleanValue2222 = Boolean.valueOf(z3).booleanValue();
                        agiq w222 = e.mo35539w();
                        w222.mo35241h();
                        boolean z6222 = w222.mo35468c().getBoolean("deferred_analytics_collection", false);
                        String q2222 = e.mo35406q();
                        Boolean c3222 = e.mo35538v().mo35319c("google_analytics_default_allow_ad_personalization_signals");
                        if (c3222 == null) {
                        }
                        long j5222 = e.f65534g;
                        if (!e.mo35538v().mo35314a(aghn.f65468X)) {
                        }
                        cfjt.m139846c();
                        return new AppMetadata(o, p, str4, r, str5, s, j3, str, z2, z5, str3, 0, j, t222, booleanValue322, booleanValue2222, z6222, q2222, valueOf2, j5222, list);
                    }
                    agje agje2222 = e.f65756y;
                    valueOf = Long.valueOf(agje2222.mo35499a().f65624i.mo35458a());
                    if (valueOf.longValue() == 0) {
                    }
                    int t2222 = e.mo35409t();
                    boolean booleanValue3222 = e.mo35538v().mo35325f().booleanValue();
                    agdi v2222 = e.mo35538v();
                    v2222.mo35242i();
                    c = v2222.mo35319c("google_analytics_ssaid_collection_enabled");
                    if (c != null) {
                    }
                    z3 = true;
                    boolean booleanValue22222 = Boolean.valueOf(z3).booleanValue();
                    agiq w2222 = e.mo35539w();
                    w2222.mo35241h();
                    boolean z62222 = w2222.mo35468c().getBoolean("deferred_analytics_collection", false);
                    String q22222 = e.mo35406q();
                    Boolean c32222 = e.mo35538v().mo35319c("google_analytics_default_allow_ad_personalization_signals");
                    if (c32222 == null) {
                    }
                    long j52222 = e.f65534g;
                    if (!e.mo35538v().mo35314a(aghn.f65468X)) {
                    }
                    cfjt.m139846c();
                    return new AppMetadata(o, p, str4, r, str5, s, j3, str, z2, z5, str3, 0, j, t2222, booleanValue3222, booleanValue22222, z62222, q22222, valueOf2, j52222, list);
                }
            } catch (ClassNotFoundException e7) {
                str = c2;
                z2 = q;
                str2 = null;
            }
        }
        str = c2;
        z2 = q;
        str2 = null;
        agje agje22222 = e.f65756y;
        valueOf = Long.valueOf(agje22222.mo35499a().f65624i.mo35458a());
        if (valueOf.longValue() == 0) {
        }
        int t22222 = e.mo35409t();
        boolean booleanValue32222 = e.mo35538v().mo35325f().booleanValue();
        agdi v22222 = e.mo35538v();
        v22222.mo35242i();
        c = v22222.mo35319c("google_analytics_ssaid_collection_enabled");
        if (c != null) {
        }
        z3 = true;
        boolean booleanValue222222 = Boolean.valueOf(z3).booleanValue();
        agiq w22222 = e.mo35539w();
        w22222.mo35241h();
        boolean z622222 = w22222.mo35468c().getBoolean("deferred_analytics_collection", false);
        String q222222 = e.mo35406q();
        Boolean c322222 = e.mo35538v().mo35319c("google_analytics_default_allow_ad_personalization_signals");
        if (c322222 == null) {
        }
        long j522222 = e.f65534g;
        if (!e.mo35538v().mo35314a(aghn.f65468X)) {
        }
        cfjt.m139846c();
        return new AppMetadata(o, p, str4, r, str5, s, j3, str, z2, z5, str3, 0, j, t22222, booleanValue32222, booleanValue222222, z622222, q222222, valueOf2, j522222, list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo35247n() {
        return false;
    }

    /* renamed from: o */
    public final boolean mo35622o() {
        mo35241h();
        mo35245l();
        return this.f65887c != null;
    }

    /* renamed from: p */
    public final boolean mo35623p() {
        int i = Build.VERSION.SDK_INT;
        return !mo35537u().f65291a;
    }

    /* renamed from: q */
    public final void mo35624q() {
        mo35241h();
        this.f65890f.mo35653a();
        agdo agdo = this.f65889e;
        mo35538v();
        agdo.mo35368a(((Long) aghn.f65453I.mo35389a()).longValue());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo35625r() {
        List<ResolveInfo> queryIntentServices;
        String str;
        mo35241h();
        mo35245l();
        if (mo35622o()) {
            return;
        }
        if (mo35626s()) {
            aglm aglm = this.f65886b;
            aglm.f65885c.mo35241h();
            Context z = aglm.f65885c.mo35542z();
            synchronized (aglm) {
                if (aglm.f65883a) {
                    aglm.f65885c.mo35497E().f65572k.mo35435a("Connection attempt already in progress");
                    return;
                }
                if (aglm.f65884b != null) {
                    if (!aglm.f65884b.mo25302q()) {
                        if (aglm.f65884b.mo25301p()) {
                        }
                    }
                    aglm.f65885c.mo35497E().f65572k.mo35435a("Already awaiting connection attempt");
                    return;
                }
                aglm.f65884b = new aghv(z, Looper.getMainLooper(), aglm, aglm);
                aglm.f65885c.mo35497E().f65572k.mo35435a("Connecting to remote service");
                aglm.f65883a = true;
                aglm.f65884b.mo25308x();
            }
        } else if (mo35538v().mo35328l()) {
        } else {
            if (mo35537u().f65291a || (queryIntentServices = mo35542z().getPackageManager().queryIntentServices(new Intent().setClassName(mo35542z(), "com.google.android.gms.measurement.AppMeasurementService"), AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE)) == null || queryIntentServices.size() <= 0) {
                mo35497E().f65564c.mo35435a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            }
            Intent intent = new Intent("com.google.android.gms.measurement.START");
            Context z2 = mo35542z();
            if (!mo35537u().f65291a) {
                str = "com.google.android.gms.measurement.AppMeasurementService";
            } else {
                str = "com.google.android.gms.measurement.PackageMeasurementService";
            }
            intent.setComponent(new ComponentName(z2, str));
            aglm aglm2 = this.f65886b;
            aglm2.f65885c.mo35241h();
            Context z3 = aglm2.f65885c.mo35542z();
            skh a = skh.m35531a();
            synchronized (aglm2) {
                if (!aglm2.f65883a) {
                    aglm2.f65885c.mo35497E().f65572k.mo35435a("Using local app measurement service");
                    aglm2.f65883a = true;
                    a.mo25690a(z3, intent, aglm2.f65885c.f65886b, 129);
                    return;
                }
                aglm2.f65885c.mo35497E().f65572k.mo35435a("Connection attempt already in progress");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0106  */
    /* renamed from: s */
    public final boolean mo35626s() {
        Boolean bool;
        mo35241h();
        mo35245l();
        if (this.f65888d == null) {
            mo35241h();
            mo35245l();
            agiq w = mo35539w();
            w.mo35241h();
            boolean z = false;
            if (w.mo35468c().contains("use_service")) {
                bool = Boolean.valueOf(w.mo35468c().getBoolean("use_service", false));
            } else {
                bool = null;
            }
            boolean z2 = true;
            if (bool == null || !bool.booleanValue()) {
                if (!mo35537u().f65291a && mo35238e().mo35409t() != 1) {
                    mo35497E().f65572k.mo35435a("Checking service availability");
                    int b = rfj.f42872d.mo24590b(mo35540x().mo35542z());
                    if (b != 0) {
                        if (b == 1) {
                            mo35497E().f65572k.mo35435a("Service missing");
                        } else if (b == 2) {
                            mo35497E().f65571j.mo35435a("Service container out of date");
                            if (mo35540x().mo35754n() >= 17443) {
                                if (bool != null) {
                                    z2 = false;
                                }
                                z = z2;
                                z2 = false;
                            }
                        } else if (b == 3) {
                            mo35497E().f65567f.mo35435a("Service disabled");
                            z2 = false;
                        } else if (b == 9) {
                            mo35497E().f65567f.mo35435a("Service invalid");
                            z2 = false;
                        } else if (b != 18) {
                            mo35497E().f65567f.mo35436a("Unexpected service status", Integer.valueOf(b));
                            z2 = false;
                        } else {
                            mo35497E().f65567f.mo35435a("Service updating");
                            z = true;
                        }
                        if (z && mo35538v().mo35328l()) {
                            mo35497E().f65564c.mo35435a("No way to upload. Consider using the full version of Analytics");
                        } else if (z2) {
                            agiq w2 = mo35539w();
                            w2.mo35241h();
                            SharedPreferences.Editor edit = w2.mo35468c().edit();
                            edit.putBoolean("use_service", z);
                            edit.apply();
                        }
                        z2 = z;
                    } else {
                        mo35497E().f65572k.mo35435a("Service available");
                    }
                }
                z = true;
                if (z) {
                }
                if (z2) {
                }
                z2 = z;
            }
            this.f65888d = Boolean.valueOf(z2);
        }
        return this.f65888d.booleanValue();
    }

    /* renamed from: t */
    public final void mo35627t() {
        mo35241h();
        mo35245l();
        aglm aglm = this.f65886b;
        if (aglm.f65884b != null && (aglm.f65884b.mo25301p() || aglm.f65884b.mo25302q())) {
            aglm.f65884b.mo14032j();
        }
        aglm.f65884b = null;
        try {
            skh.m35531a().mo25689a(mo35542z(), this.f65886b);
        } catch (IllegalArgumentException | IllegalStateException e) {
        }
        this.f65887c = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35616a(aghq aghq) {
        mo35241h();
        sdo.m34959a(aghq);
        this.f65887c = aghq;
        mo35624q();
        mo35614D();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35617a(aghq aghq, AbstractSafeParcelable abstractSafeParcelable, AppMetadata appMetadata) {
        int i;
        List r;
        mo35241h();
        mo35242i();
        mo35245l();
        boolean p = mo35623p();
        mo35538v();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            if (!p || (r = mo35235b().mo35419r()) == null) {
                i = 0;
            } else {
                arrayList.addAll(r);
                i = r.size();
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i4);
                if (abstractSafeParcelable2 instanceof EventParcel) {
                    try {
                        aghq.mo35399a((EventParcel) abstractSafeParcelable2, appMetadata);
                    } catch (RemoteException e) {
                        mo35497E().f65564c.mo35436a("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof UserAttributeParcel) {
                    try {
                        aghq.mo35401a((UserAttributeParcel) abstractSafeParcelable2, appMetadata);
                    } catch (RemoteException e2) {
                        mo35497E().f65564c.mo35436a("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof ConditionalUserPropertyParcel) {
                    try {
                        aghq.mo35398a((ConditionalUserPropertyParcel) abstractSafeParcelable2, appMetadata);
                    } catch (RemoteException e3) {
                        mo35497E().f65564c.mo35436a("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    mo35497E().f65564c.mo35435a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35618a(agkt agkt) {
        mo35241h();
        mo35245l();
        mo35621a(new agla(this, agkt));
    }

    /* renamed from: a */
    public final void mo35619a(ComponentName componentName) {
        mo35241h();
        if (this.f65887c != null) {
            this.f65887c = null;
            mo35497E().f65572k.mo35436a("Disconnected from device MeasurementService", componentName);
            mo35241h();
            mo35625r();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35620a(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        boolean z;
        sdo.m34959a(conditionalUserPropertyParcel);
        mo35241h();
        mo35245l();
        boolean z2 = !mo35537u().f65291a;
        if (z2) {
            aght b = mo35235b();
            byte[] a = b.mo35540x().mo35741a((Parcelable) conditionalUserPropertyParcel);
            if (a.length > 131072) {
                b.mo35497E().f65565d.mo35435a("Conditional user property too long for local database. Sending directly to service");
                z = false;
            } else if (b.mo35415a(2, a)) {
                z = true;
            }
            mo35621a(new agle(this, z2, z, new ConditionalUserPropertyParcel(conditionalUserPropertyParcel), mo35615a(true), conditionalUserPropertyParcel));
        }
        z = false;
        mo35621a(new agle(this, z2, z, new ConditionalUserPropertyParcel(conditionalUserPropertyParcel), mo35615a(true), conditionalUserPropertyParcel));
    }

    /* renamed from: a */
    public final void mo35621a(Runnable runnable) {
        mo35241h();
        if (mo35622o()) {
            runnable.run();
            return;
        }
        int size = this.f65891g.size();
        mo35538v();
        if (((long) size) >= 1000) {
            mo35497E().f65564c.mo35435a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f65891g.add(runnable);
        this.f65892h.mo35368a(60000);
        mo35625r();
    }
}
