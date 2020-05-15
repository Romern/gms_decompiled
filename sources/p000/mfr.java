package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.ConditionVariable;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: mfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class mfr {

    /* renamed from: c */
    private static final lvn f33596c = new lvn("D2dTransportDriver");

    /* renamed from: a */
    public final met f33597a;

    /* renamed from: b */
    public final Context f33598b;

    /* renamed from: d */
    private final ConditionVariable f33599d = new ConditionVariable(false);

    /* renamed from: e */
    private mfq f33600e;

    protected mfr(Context context, met met) {
        TimeUnit.SECONDS.toMillis(cckw.f179263a.mo6606a().mo76239d());
        TimeUnit.SECONDS.toMillis(cckw.f179263a.mo6606a().mo76240e());
        TimeUnit.SECONDS.toMillis(cckw.f179263a.mo6606a().mo76238c());
        cckw.f179263a.mo6606a().mo76235Y();
        this.f33598b = context;
        this.f33597a = met;
        m24970a(context);
    }

    /* renamed from: a */
    public static Set m24970a(Context context) {
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        HashSet hashSet = new HashSet();
        for (PackageInfo packageInfo : installedPackages) {
            if (maz.m24783a(packageInfo.applicationInfo) && !maz.m24784a(packageInfo) && mcg.m24865a(context, packageInfo) == mcf.ELIGIBLE) {
                hashSet.add(packageInfo.packageName);
            }
        }
        hashSet.add("@pm@");
        return hashSet;
    }

    /* renamed from: b */
    public static Set m24973b(Context context) {
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        HashSet hashSet = new HashSet();
        for (PackageInfo packageInfo : installedPackages) {
            if (maz.m24783a(packageInfo.applicationInfo) && maz.m24784a(packageInfo) && mcg.m24869b(context, packageInfo) == mcf.ELIGIBLE) {
                hashSet.add(packageInfo.packageName);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public synchronized void mo19945a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo19948c() {
        return this.f33600e != null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo19949d() {
        boolean z;
        if (this.f33600e != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "mShutdownCompleteListener was null even though a shutdown was requested.");
        meu meu = new meu(this.f33598b);
        meu.mo19898a();
        meu.mo19899b();
        File[] listFiles = new mfp(this.f33598b).f33588c.f33396a.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        this.f33600e.mo19944a();
        this.f33600e = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo19947b() {
        if (mo19948c()) {
            f33596c.mo25414c("Shutting down D2dDriver.", new Object[0]);
            this.f33599d.close();
            mo19949d();
        }
    }

    /* renamed from: a */
    public static mfr m24971a(Context context, met met) {
        mce.m24862c();
        return new mft(context, met);
    }

    /* renamed from: a */
    static void m24972a(Context context, int i, String str, int i2) {
        Intent intent = new Intent("com.google.android.gms.backup.ACTION_OPERATION_DONE");
        intent.putExtra("operation", i);
        intent.putExtra("package_name", str);
        intent.putExtra("error", i2);
        context.sendBroadcast(intent);
    }

    /* renamed from: a */
    public final synchronized void mo19946a(mfq mfq) {
        this.f33600e = mfq;
        mo19947b();
    }
}
