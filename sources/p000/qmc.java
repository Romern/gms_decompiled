package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.gms.chimera.container.FileApkIntentOperation;
import com.google.android.gms.chimera.container.GmsModuleFinder$StageFileApksResultReceiver;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: qmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qmc {

    /* renamed from: a */
    private static final Object f41693a = new Object();

    /* renamed from: b */
    private static volatile qmc f41694b = null;

    /* renamed from: d */
    private static boolean f41695d = false;

    /* renamed from: e */
    private static boolean f41696e;

    /* renamed from: c */
    private int f41697c = 0;

    /* renamed from: a */
    public static qmc m32416a() {
        qmc qmc = f41694b;
        if (qmc == null) {
            synchronized (qmc.class) {
                qmc = f41694b;
                if (qmc == null) {
                    qmc = new qmc();
                    f41694b = qmc;
                }
            }
        }
        return qmc;
    }

    /* renamed from: b */
    public static final Set m32428b() {
        String str = (String) qlk.f41651g.mo25081c();
        if (str.isEmpty()) {
            return Collections.emptySet();
        }
        C1225nr nrVar = new C1225nr();
        m32423a(str, nrVar);
        return nrVar;
    }

    /* renamed from: c */
    public static final Set m32430c(Context context) {
        String[] strArr = {(String) qlk.f41650f.mo25081c(), (String) qlk.f41651g.mo25081c(), "com.google.android.gms.setup"};
        C1225nr nrVar = new C1225nr(8);
        for (int i = 0; i < 3; i++) {
            m32423a(strArr[i], nrVar);
        }
        PackageManager packageManager = context.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(new Intent("com.google.android.gms.chimera.module.QUERY"), 786432);
        if (queryBroadcastReceivers != null) {
            for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                if (resolveInfo.activityInfo != null) {
                    try {
                        if ((packageManager.getApplicationInfo(resolveInfo.activityInfo.packageName, 0).flags & 129) != 0) {
                            nrVar.add(resolveInfo.activityInfo.packageName);
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                    }
                }
            }
        }
        nrVar.remove("com.google.android.gms");
        return nrVar;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: qmc.a(android.content.Context, java.util.Set, java.util.Set, java.util.Set, boolean, java.util.Collection):boolean
     arg types: [android.content.Context, java.util.Set, java.util.Set, nr, int, nr]
     candidates:
      qmc.a(android.content.Context, djz, java.util.Set, java.util.Set, java.util.List, boolean):boolean
      qmc.a(android.content.Context, java.util.Set, java.util.Set, java.util.Set, boolean, java.util.Collection):boolean */
    /* renamed from: d */
    public static final Set m32431d(Context context) {
        Set c = m32430c(context);
        Set b = m32428b();
        C1225nr nrVar = new C1225nr(dgv.m8427a(context).mo8991i());
        C1225nr nrVar2 = new C1225nr(8);
        if (!m32427a(context, c, b, (Set) nrVar, true, (Collection) nrVar2)) {
            return null;
        }
        return nrVar2;
    }

    /* renamed from: e */
    private static boolean m32432e(Context context) {
        boolean z;
        synchronized (f41693a) {
            if (!f41695d) {
                f41696e = context.getApplicationInfo().processName.equals(spn.m35877d());
                f41695d = true;
            }
            z = f41696e;
        }
        return z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjr.a(java.util.Iterator, bmxz):boolean
     arg types: [java.util.Iterator, qmz]
     candidates:
      bnjr.a(java.util.Iterator, int):int
      bnjr.a(java.util.Iterator, bmxj):java.util.Iterator
      bnjr.a(java.util.Iterator, java.util.Iterator):java.util.Iterator
      bnjr.a(java.util.Collection, java.util.Iterator):boolean
      bnjr.a(java.util.Iterator, java.lang.Object):boolean
      bnjr.a(java.util.Iterator, java.util.Collection):boolean
      bnjr.a(java.util.Iterator, bmxz):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [bngx, bmxz]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* renamed from: a */
    static final qnb m32417a(Context context, Set set, Collection collection, djz djz, qmb qmb) {
        qnb qnb;
        qmo d;
        qnl qnl;
        int i;
        C1225nr nrVar;
        C1223np npVar;
        int i2;
        C1223np npVar2;
        qmo qmo;
        dky dky;
        bnic bnic;
        boolean z;
        bojy bojy;
        dih dih;
        Set set2 = set;
        Collection collection2 = collection;
        djz djz2 = djz;
        try {
            qnd a = qnd.m32471a(context);
            boolean e = m32432e(context);
            if (a.mo8638b()) {
                Log.e("ModuleSetMgr", "not migrated with user locked");
                qnb = null;
            } else {
                dky dky2 = dhz.f13199c;
                dky dky3 = dgk.f13061c;
                if (djz2 == null) {
                    e = false;
                } else {
                    try {
                        dfy a2 = dfy.m8329a(a.f12990a);
                        dky c = a2.mo8895c(djz2);
                        dky3 = a2.mo8894b(djz2);
                        dky2 = c;
                    } catch (InvalidConfigException e2) {
                        dky2 = dhz.f13199c;
                        dky3 = dgk.f13061c;
                        e = false;
                    }
                }
                synchronized (a.f41765e) {
                    d = a.mo24125d();
                }
                C1223np npVar3 = new C1223np();
                C1225nr nrVar2 = new C1225nr();
                if (collection2 != null) {
                    nrVar2.addAll(collection2);
                }
                qmk g = a.mo24127g();
                bnic a3 = qnm.m32491a(dgv.m8427a(a.f12990a).mo8990h());
                String valueOf = String.valueOf(a3);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                sb.append("Computing pending module set with APKs: ");
                sb.append(valueOf);
                Log.i("ModuleSetMgr", sb.toString());
                qnp qnp = new qnp(d, d.f41731f, a3, dgk.m8398b(dky3));
                C1225nr nrVar3 = new C1225nr();
                while (true) {
                    npVar3.clear();
                    qnd.m32472a(d.f41728c, new qmy(nrVar2, nrVar3), false, npVar3);
                    qnd.m32470a(g, npVar3);
                    qnl a4 = a.mo24120a(npVar3, qnp);
                    if (a4 == null) {
                        qnl = null;
                        break;
                    }
                    C1223np a5 = qnd.m32469a(a4, npVar3, a3);
                    if (!a5.isEmpty()) {
                        nrVar2.addAll(a5.values());
                        if (qnd.m32473a(g, nrVar2)) {
                            qnl = null;
                            break;
                        }
                    } else {
                        Set a6 = qnm.m32496a((Iterable) a4.f41777a);
                        if (!a6.isEmpty()) {
                            nrVar3.addAll(a6);
                        } else {
                            if (!e) {
                                bnjr.m109613a(nrVar3.iterator(), (bmxz) new qmz(dky2));
                            }
                            String valueOf2 = String.valueOf(a4.f41780d);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
                            sb2.append("Pending container module APKs: ");
                            sb2.append(valueOf2);
                            Log.i("ModuleSetMgr", sb2.toString());
                            String valueOf3 = String.valueOf(a4.f41781e);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 35);
                            sb3.append("Pending non-container module APKs: ");
                            sb3.append(valueOf3);
                            Log.i("ModuleSetMgr", sb3.toString());
                            qnl = a4.mo24136a(nrVar3);
                        }
                    }
                }
                try {
                    i = new dfz(a.f12990a).mo8914f().f13238h;
                } catch (PackageManager.NameNotFoundException e3) {
                    i = 0;
                }
                bngx e4 = bngx.m109376e();
                if (cdjl.f180997a.mo6606a().mo77708n()) {
                    Context context2 = a.f12990a;
                    dih dih2 = dih.f13220a;
                    if (dih2 == null) {
                        synchronized (dih.class) {
                            dih = dih.f13220a;
                            if (dih == null) {
                                dih = new dih(context2);
                                dih.f13220a = dih;
                            }
                        }
                        dih2 = dih;
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    ApplicationInfo applicationInfo = dih2.f13221b.getApplicationInfo();
                    String[] strArr = applicationInfo.splitNames;
                    String[] strArr2 = applicationInfo.splitSourceDirs;
                    if (strArr == null) {
                        String valueOf4 = String.valueOf(dih2.f13221b.getPackageName());
                        if (valueOf4.length() == 0) {
                            new String("No split info found for ");
                        } else {
                            "No split info found for ".concat(valueOf4);
                        }
                        e4 = bngx.m109376e();
                        nrVar = nrVar2;
                    } else {
                        bngs j = bngx.m109377j();
                        int i4 = 0;
                        while (i4 < strArr.length) {
                            Context context3 = dih2.f13221b;
                            String str = strArr[i4];
                            String str2 = strArr2[i4];
                            j.mo67668c(new dig(context3, 0, str, str2, dhs.m8523a(str2)));
                            i4++;
                            nrVar2 = nrVar2;
                        }
                        nrVar = nrVar2;
                        e4 = j.mo67664a();
                    }
                    String valueOf5 = String.valueOf(e4);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf5).length() + 18);
                    sb4.append("Found split apks: ");
                    sb4.append(valueOf5);
                    sb4.toString();
                } else {
                    nrVar = nrVar2;
                }
                if (qnl != null) {
                    Collection<dgl> a7 = dgv.m8427a(a.f12990a).mo8975a(i, false, false, set2);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    bnfi<dht> a8 = bnfi.m109236a(a7, e4);
                    C1225nr nrVar4 = new C1225nr(qnl.f41780d);
                    C1225nr nrVar5 = new C1225nr(qnl.f41781e);
                    for (dht dht : a8) {
                        dhs dhs = dht.f13189i;
                        if (dhs != null) {
                            if (nrVar4.contains(dhs)) {
                                nrVar4.remove(dhs);
                                arrayList.add(dht);
                            }
                            if (nrVar5.contains(dhs)) {
                                nrVar5.remove(dhs);
                                arrayList2.add(dht);
                            }
                        }
                        if (!dht.mo8963o()) {
                            arrayList3.add(dht);
                        }
                    }
                    if (!nrVar4.isEmpty() || !nrVar5.isEmpty()) {
                        qnb = qnb.m32466a(arrayList3);
                    } else {
                        Collection values = npVar3.values();
                        C1223np npVar4 = new C1223np();
                        Iterator it = values.iterator();
                        while (it.hasNext()) {
                            qmk qmk = (qmk) it.next();
                            bxwc bxwc = qmk.f41708b;
                            int size = bxwc.size();
                            int i5 = 0;
                            while (i5 < size) {
                                npVar4.put(qnm.m32494a((qmt) bxwc.get(i5)), (bojy) qmk.f41707a.get(0));
                                i5++;
                                it = it;
                                qmk = qmk;
                            }
                        }
                        C1223np npVar5 = new C1223np(npVar4.f26809h);
                        for (dgl dgl : a7) {
                            dhs dhs2 = dgl.f13189i;
                            if (!(dhs2 == null || (bojy = (bojy) npVar4.get(dhs2)) == null)) {
                                npVar5.put(dgl, bojy);
                            }
                        }
                        bnic bnic2 = bnon.f131923a;
                        if (e) {
                            bnia j2 = bnic.m109500j();
                            dky dky4 = qnl.f41777a;
                            int size2 = dky4.size();
                            int i6 = 0;
                            while (i6 < size2) {
                                bojy bojy2 = (bojy) dky4.get(i6);
                                if (qnm.m32503a(bojy2, 128)) {
                                    bmxy.m108588a(qnm.m32503a(bojy2, 128));
                                    if (!"container".equals(bojy2.f133370b)) {
                                        bxwc bxwc2 = d.f41728c;
                                        int a9 = qnd.m32467a(bojy2.f133370b, bxwc2);
                                        if (a9 >= 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        bmzs.m108698a(z);
                                        Set set3 = bnon.f131923a;
                                        bxwc bxwc3 = ((qmn) bxwc2.get(a9)).f41723a;
                                        int size3 = bxwc3.size();
                                        dky = dky4;
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= size3) {
                                                npVar2 = npVar5;
                                                i2 = size2;
                                                qmo = d;
                                                break;
                                            }
                                            i2 = size2;
                                            qmm qmm = (qmm) bxwc3.get(i7);
                                            qmo = d;
                                            qmk qmk2 = qmm.f41716b;
                                            if (qmk2 == null) {
                                                qmk2 = qmk.f41705d;
                                            }
                                            int i8 = i7 + 1;
                                            npVar2 = npVar5;
                                            bxwc bxwc4 = bxwc3;
                                            if (((bojy) qmk2.f41707a.get(0)).f133373e == bojy2.f133373e) {
                                                qmk qmk3 = qmm.f41716b;
                                                if (qmk3 == null) {
                                                    qmk3 = qmk.f41705d;
                                                }
                                                bnia c2 = bnic.m109499c(qmk3.f41708b.size());
                                                qmk qmk4 = qmm.f41716b;
                                                if (qmk4 == null) {
                                                    qmk4 = qmk.f41705d;
                                                }
                                                bxwc bxwc5 = qmk4.f41708b;
                                                int size4 = bxwc5.size();
                                                for (int i9 = 0; i9 < size4; i9++) {
                                                    c2.mo67629b(((qmt) bxwc5.get(i9)).f41737b);
                                                }
                                                set3 = c2.mo67751a();
                                            } else {
                                                size2 = i2;
                                                d = qmo;
                                                i7 = i8;
                                                npVar5 = npVar2;
                                                bxwc3 = bxwc4;
                                            }
                                        }
                                        if (!set3.isEmpty()) {
                                            bnia c3 = bnic.m109499c(set3.size());
                                            djy djy = new djy();
                                            for (int i10 = 0; i10 < djz.mo9175b(); i10++) {
                                                djz2.mo9170a(djy, i10);
                                                if (set3.contains(djy.mo9164o())) {
                                                    c3.mo67629b(djy.mo9151b());
                                                }
                                            }
                                            bnic = c3.mo67751a();
                                            if (set3.isEmpty() != bnic.isEmpty()) {
                                                String str3 = bojy2.f133370b;
                                                long j3 = bojy2.f133373e;
                                                int size5 = set3.size();
                                                int size6 = bnic.size();
                                                StringBuilder sb5 = new StringBuilder(String.valueOf(str3).length() + 142);
                                                sb5.append("Some placebo APKs for ");
                                                sb5.append(str3);
                                                sb5.append(":");
                                                sb5.append(j3);
                                                sb5.append(" didn't have a predecessor to touch - ");
                                                sb5.append(size5);
                                                sb5.append(" placebo APKs, ");
                                                sb5.append(size6);
                                                sb5.append(" predecessor APKs found.");
                                                sb5.toString();
                                            }
                                        } else {
                                            bnic = bnon.f131923a;
                                        }
                                    } else {
                                        dky = dky4;
                                        npVar2 = npVar5;
                                        i2 = size2;
                                        qmo = d;
                                        bnic = bnon.f131923a;
                                    }
                                    j2.mo67752b((Iterable) bnic);
                                } else {
                                    dky = dky4;
                                    npVar2 = npVar5;
                                    i2 = size2;
                                    qmo = d;
                                }
                                i6++;
                                size2 = i2;
                                dky4 = dky;
                                d = qmo;
                                npVar5 = npVar2;
                            }
                            npVar = npVar5;
                            bnic2 = j2.mo67751a();
                        } else {
                            npVar = npVar5;
                        }
                        qnb = new qnb(qnl.f41777a, qnl.f41778b, arrayList2, arrayList3, arrayList, npVar, nrVar, bnic2);
                    }
                } else {
                    qnb = qnb.m32466a(bnkn.m109663a(bnfi.m109236a(dgv.m8427a(a.f12990a).mo8975a(i, true, true, set2), bnjd.m109586b((Iterable) e4, qmu.f41742a))));
                }
            }
        } catch (Error | Exception e5) {
            Throwable th = e5;
            if (qmb.mo24105a(context, th)) {
                qnb = new qnb(dhz.f13199c, dgk.f13061c, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyMap(), Collections.emptySet(), bnon.f131923a);
            } else {
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        if (qnb != null) {
            for (String str4 : qnb.f41758h) {
                File file = new File(str4);
                file.setLastModified(Math.max(System.currentTimeMillis(), file.lastModified() + 1000));
            }
            return qnb;
        }
        throw new InvalidConfigException("not migrated with user locked");
    }

    /* renamed from: b */
    public static final Set m32429b(Context context) {
        djz djz;
        try {
            djz = dfy.m8329a(context).mo8898f();
        } catch (InvalidConfigException e) {
            djz = null;
        }
        C1225nr nrVar = new C1225nr(8);
        if (djz != null) {
            int c = djz.mo9177c();
            dka dka = new dka();
            djy djy = new djy();
            for (int i = 0; i < c; i++) {
                djz.mo9171a(dka, i);
                djz.mo9170a(djy, dka.mo9183R());
                if (djy.mo9149a() == 2) {
                    nrVar.add(djy.mo9151b());
                }
            }
        }
        nrVar.addAll(dgv.m8427a(context).mo8991i());
        return nrVar;
    }

    /* renamed from: a */
    public static void m32418a(Context context) {
        C1245ok okVar;
        qmk qmk;
        File parentFile;
        dgh a = dgh.m8389a(context);
        int i = Build.VERSION.SDK_INT;
        C1225nr nrVar = new C1225nr();
        dgv a2 = dgv.m8427a(context);
        ArrayList arrayList = new ArrayList();
        String f = a2.mo8988f();
        if (!(f == null || (parentFile = new File(f).getParentFile()) == null)) {
            File file = new File(parentFile, "m/optional");
            if (!file.isDirectory()) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                sb.append("System image module root not found at ");
                sb.append(valueOf);
                sb.append(". Ignoring.");
                sb.toString();
            } else {
                File[] listFiles = file.listFiles(dgn.f13071a);
                if (listFiles == null) {
                    String valueOf2 = String.valueOf(file);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 38);
                    sb2.append("Failed to list system image files in ");
                    sb2.append(valueOf2);
                    sb2.append(".");
                    sb2.toString();
                } else {
                    Collections.addAll(arrayList, listFiles);
                }
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            File file2 = (File) arrayList.get(i2);
            dhs a3 = dhs.m8523a(file2.getAbsolutePath());
            if (a3 == null) {
                String valueOf3 = String.valueOf(file2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 59);
                sb3.append("No module.yaml information found in ");
                sb3.append(valueOf3);
                sb3.append(", assuming not optional");
                sb3.toString();
            } else {
                nrVar.add(a3);
            }
        }
        String valueOf4 = String.valueOf(nrVar);
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 35);
        sb4.append("Found modules in the system image: ");
        sb4.append(valueOf4);
        sb4.toString();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 2097152);
            try {
                qmk = qnm.m32498a(qnd.m32471a(context).f12990a.getPackageManager().getResourcesForApplication(packageInfo.applicationInfo));
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("ModuleSetMgr", "Failed fetching resources for explicit container APK", e);
                qmk = null;
            }
            if (qmk != null) {
                C1245ok okVar2 = new C1245ok();
                bxwc bxwc = qmk.f41708b;
                int size2 = bxwc.size();
                int i3 = 0;
                loop1:
                while (true) {
                    if (i3 >= size2) {
                        okVar = okVar2;
                        break;
                    }
                    qmt qmt = (qmt) bxwc.get(i3);
                    if (nrVar.contains(qnm.m32494a(qmt))) {
                        bxwc bxwc2 = qmt.f41738c;
                        int size3 = bxwc2.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            djd djd = (djd) bxwc2.get(i4);
                            String str = djd.f13317b;
                            long j = djd.f13318c;
                            Long l = (Long) okVar2.get(str);
                            if (l == null) {
                                okVar2.put(str, Long.valueOf(j));
                            } else if (l.longValue() != j) {
                                StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 60);
                                sb5.append("Conflicting versions of feature ");
                                sb5.append(str);
                                sb5.append(" in the container module set");
                                Log.e("GmsModuleFndr", sb5.toString());
                                okVar = new C1245ok();
                                break loop1;
                            }
                        }
                        continue;
                    }
                    i3++;
                }
            } else {
                Log.e("GmsModuleFndr", "Could not read system container module set");
                okVar = new C1245ok();
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("GmsModuleFndr", "Could not find system container");
            okVar = new C1245ok();
        }
        ArrayList arrayList2 = new ArrayList();
        List a4 = a.mo8951a("system_image");
        int size4 = a4.size();
        for (int i5 = 0; i5 < size4; i5++) {
            djd djd2 = (djd) a4.get(i5);
            String str2 = djd2.f13317b;
            Long l2 = (Long) okVar.get(str2);
            if (l2 == null) {
                arrayList2.add(str2);
            } else if (l2.equals(Long.valueOf(djd2.f13318c))) {
                okVar.remove(str2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i6 = 0; i6 < okVar.f26809h; i6++) {
            String str3 = (String) okVar.mo15620b(i6);
            long longValue = ((Long) okVar.mo15621c(i6)).longValue();
            bxvd da = djd.f13314d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            djd djd3 = (djd) da.f164949b;
            str3.getClass();
            int i7 = djd3.f13316a | 1;
            djd3.f13316a = i7;
            djd3.f13317b = str3;
            djd3.f13316a = i7 | 2;
            djd3.f13318c = longValue;
            arrayList3.add((djd) da.mo74062i());
        }
        if ((!arrayList3.isEmpty() || !arrayList2.isEmpty()) && !a.mo8952a("system_image", arrayList3, arrayList2, false, false, null, null, null)) {
            Log.e("FeatureMgr", "Feature update failed while updating system features");
            Log.e("GmsModuleFndr", "Feature update failed while updating system features");
        }
    }

    /* renamed from: a */
    public static final void m32419a(Context context, int i, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
        sb.append("Staging ");
        sb.append(str);
        sb.append(" and updating chimera config...");
        sb.toString();
        HandlerThread handlerThread = new HandlerThread("StageFileApksResultReceiverHandlerThread");
        handlerThread.start();
        GmsModuleFinder$StageFileApksResultReceiver gmsModuleFinder$StageFileApksResultReceiver = new GmsModuleFinder$StageFileApksResultReceiver(new adzt(handlerThread.getLooper()));
        if (i - 1 != 0) {
            boolean z = false;
            if (!m32432e(context) || !(Looper.myLooper() == null || Looper.myLooper() == Looper.getMainLooper())) {
                z = true;
            }
            FileApkIntentOperation.m22398a(z, context, str, gmsModuleFinder$StageFileApksResultReceiver);
        } else {
            FileApkIntentOperation.m22394a(context, str, gmsModuleFinder$StageFileApksResultReceiver);
        }
        try {
            gmsModuleFinder$StageFileApksResultReceiver.f29976a.poll(120, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.w("GmsModuleFndr", "Interruped/timed-out while waiting for staging to complete");
        } catch (Throwable th) {
            handlerThread.quit();
            throw th;
        }
        handlerThread.quit();
    }

    /* renamed from: a */
    public static final void m32420a(Context context, String str) {
        m32419a(context, 2, str);
    }

    /* renamed from: a */
    static final void m32421a(Context context, Collection collection, int i) {
        qox qox = new qox();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            qox.mo24180a((bojy) it.next(), i);
        }
        qox.mo24179a(context);
    }

    /* renamed from: a */
    private static void m32422a(Context context, qnb qnb, List list, Collection collection, Collection collection2) {
        collection.clear();
        collection2.clear();
        for (dht dht : qnb.f41753c) {
            if (dht.mo8964p()) {
                collection.add(dht);
            } else {
                collection2.add(dht);
            }
        }
        collection.add(new dfz(context));
        collection2.addAll(list);
    }

    /* renamed from: a */
    private static void m32423a(String str, Set set) {
        if (!str.isEmpty()) {
            Collections.addAll(set, str.split(","));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: qmc.a(boolean, boolean):void
     arg types: [boolean, int]
     candidates:
      qmc.a(android.content.Context, java.lang.String):void
      qmc.a(java.lang.String, java.util.Set):void
      qmc.a(boolean, boolean):void */
    /* renamed from: a */
    public static void m32424a(boolean z) {
        m32425a(z, false);
    }

    /* renamed from: a */
    public static void m32425a(boolean z, boolean z2) {
        m32416a().mo24106a(z, z2, (Set) null, (Set) null, (Set) null);
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:216:0x051f */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:61:0x01bb */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:126:0x032a */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:250:0x01ce */
    /* JADX WARN: Type inference failed for: r9v5, types: [nr, java.util.Set], assign insn: 0x0499: CONSTRUCTOR  (r9v5 ? I:nr) = (r11v10 int) call: nr.<init>(int):void type: CONSTRUCTOR */
    /* JADX WARN: Type inference failed for: r25v8, assign insn: PHI: (r25v8 ?) = (r25v26 java.util.List), (r25v27 ?) binds: [B:31:0x0093, B:32:0x00bd] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.util.List], assign insn: 0x00d0: MOVE  (r14v10 ? I:?[OBJECT, ARRAY]) = (r5v7 java.util.ArrayList) */
    /* JADX WARN: Type inference failed for: r25v16, assign insn: PHI: (r25v16 ?) = (r25v8 ?), (r25v23 qnb), (r25v23 qnb), (r25v23 qnb), (r25v23 qnb), (r25v23 qnb) binds: [B:61:0x01bb, B:81:0x0263, B:93:0x0297, B:107:0x02c8, B:99:0x02ab, B:100:?] */
    /* JADX WARN: Type inference failed for: r14v17, assign insn: PHI: (r14v17 ?) = (r14v10 ?), (r14v26 ?), (r14v29 ?), (r14v37 ? I:?[int, float, short, byte, char]), (r14v38 ? I:?[int, float, short, byte, char]), (r14v40 ? I:?[int, float, short, byte, char]) binds: [B:61:0x01bb, B:81:0x0263, B:100:?, B:93:0x0297, B:107:0x02c8, B:99:0x02ab] */
    /* JADX WARN: Type inference failed for: r14v20, assign insn: PHI: (r14v20 ?) = (r14v10 ?), (r14v22 ?) binds: [B:62:?, B:250:0x01ce] */
    /* JADX WARN: Type inference failed for: r14v22, assign insn: PHI: (r14v22 ?) = (r14v23 ?), (r14v30 ?) binds: [B:253:0x01ce, B:252:0x01ce] */
    /* JADX WARN: Type inference failed for: r14v23, assign insn: 0x0306: MOVE  (r14v23 ? I:?[OBJECT, ARRAY]) = (r24v4 java.lang.Object) */
    /* JADX WARN: Type inference failed for: r14v26, assign insn: 0x025a: CONST  (r14v26 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r14v29, assign insn: 0x0295: CONST  (r14v29 ? I:?[int, float, short, byte, char]) = (2 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r14v30, assign insn: 0x02e6: MOVE  (r14v30 ? I:?[OBJECT, ARRAY]) = (r24v6 java.lang.Object) */
    /* JADX WARN: Type inference failed for: r14v37, assign insn: 0x0295: CONST  (r14v37 ? I:?[int, float, short, byte, char]) = (2 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r14v38, assign insn: 0x0295: CONST  (r14v38 ? I:?[int, float, short, byte, char]) = (2 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r14v40, assign insn: 0x0295: CONST  (r14v40 ? I:?[int, float, short, byte, char]) = (2 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r25v27, assign insn: ?: MOVE  (r25v27 ?) = (r25v13 qnb) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dky.a(java.lang.Iterable, java.util.Comparator):dky
     arg types: [bngx, java.util.Comparator]
     candidates:
      bnfo.a(java.lang.Object, java.lang.Object):void
      bmzu.a(java.lang.Object, java.lang.Object):void
      dky.a(java.lang.Iterable, java.util.Comparator):dky */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: qnm.a(bojy, boolean):boolean
     arg types: [bojy, int]
     candidates:
      qnm.a(long, long):boolean
      qnm.a(bojy, int):boolean
      qnm.a(qmk, int):boolean
      qnm.a(qmk, qmk):boolean
      qnm.a(qmk, qox):boolean
      qnm.a(bojy, boolean):boolean */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r9.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        r5 = (p000.qmn) r9.f164949b;
        r6 = p000.qmn.f41721b;
        r2.getClass();
        r5.mo24113a();
        r5.f41723a.set(r12, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02c0, code lost:
        if (r7.f164950c != false) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02c4, code lost:
        r7.mo74035c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        r7.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02ca, code lost:
        r2 = (p000.qmo) r7.f164949b;
        r6 = (p000.qmn) r9.mo74062i();
        r8 = p000.qmo.f41724g;
        r6.getClass();
        r2.mo24114a();
        r2.f41728c.set(r10, r6);
        r6 = r7;
        r2 = r21;
        r4 = r23;
        r14 = r24;
        r15 = r25;
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02ef, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x032b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x032c, code lost:
        r25 = r25;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0369, code lost:
        r8 = r2;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0376, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0276, code lost:
        if (r2.f41717c != false) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0278, code lost:
        r5 = (p000.bxvd) r2.mo74142c(5);
        r5.mo73625a((p000.GeneratedMessageLite) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0284, code lost:
        if (r5.f164950c != false) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0287, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x028d, code lost:
        r2 = (p000.qmm) r5.f164949b;
        r6 = p000.qmm.f41713g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0295, code lost:
        r14 = 2;
        r14 = 2;
        r14 = 2;
        r14 = 2;
        r14 = 2;
        r14 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r2.f41715a |= 2;
        r2.f41717c = true;
        r2 = (p000.qmm) r5.mo74062i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02a4, code lost:
        if (r9.f164950c != false) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02a7, code lost:
        r9.mo74035c();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0539  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x057d  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0585  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x057b A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    static final boolean m32426a(Context context, djz djz, Set set, Set set2, List list, boolean z) {
        List list2;
        int i;
        boolean z2;
        qmb qmb;
        dfw dfw;
        int size;
        int i2;
        int i3;
        ArrayList arrayList;
        ArrayList arrayList2;
        dky dky;
        boolean z3;
        ArrayList arrayList3;
        dky dky2;
        ArrayList arrayList4;
        boolean z4;
        int i4;
        int i5;
        qmo d;
        qnb qnb;
        qnb qnb2;
        int i6;
        dfw dfw2;
        boolean z5;
        qnb qnb3;
        int i7;
        qnb qnb4;
        ArrayList arrayList5;
        boolean z6;
        Object obj;
        Iterator it;
        boolean z7;
        bxvd bxvd;
        Context context2 = context;
        djz djz2 = djz;
        Set set3 = set;
        List list3 = list;
        qmb qmb2 = new qmb();
        qnb a = m32417a(context2, set3, (Collection) null, djz2, qmb2);
        try {
            C1225nr nrVar = new C1225nr();
            C1223np npVar = new C1223np();
            qnd a2 = qnd.m32471a(context);
            synchronized (a2.f41765e) {
                try {
                    d = a2.mo24125d();
                } catch (Error | Exception e) {
                    e = e;
                    i4 = i5;
                } catch (Throwable th) {
                    th = th;
                    list2 = a;
                    i5 = 2;
                    i5 = 2;
                    while (true) {
                        break;
                    }
                    throw th;
                }
            }
            ArrayList arrayList6 = new ArrayList();
            for (qmn qmn : d.f41728c) {
                for (int i8 = 0; i8 < qmn.f41723a.size(); i8++) {
                    qmm qmm = (qmm) qmn.f41723a.get(i8);
                    if (qmm.f41717c) {
                        qmk qmk = qmm.f41716b;
                        if (qmk == null) {
                            qmk = qmk.f41705d;
                        }
                        arrayList6.add((bojy) qmk.f41707a.get(0));
                    }
                }
            }
            int g = (int) cdjl.m133601g();
            dfy a3 = dfy.m8329a(context);
            qnb qnb5 = a;
            boolean z8 = false;
            boolean z9 = false;
            while (true) {
                if (z9) {
                    qnb2 = qnb;
                    i6 = 2;
                    break;
                }
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                if (qnb5 == null) {
                    qnb5 = m32417a(context2, set3, nrVar, djz2, qmb2);
                }
                if (!qnb5.f41751a.isEmpty()) {
                    nrVar.addAll(qnb5.f41757g);
                    m32422a(context2, qnb5, list3, arrayList7, arrayList8);
                    arrayList7.addAll(qnb5.f41754d);
                    dky dky3 = qnb5.f41751a;
                    dky dky4 = qnb5.f41755e;
                    list2 = qnb5.f41752b;
                    dfw2 = new dfw(dky3, dky4, arrayList7, list2, arrayList8, qnb5.f41756f);
                } else {
                    dfw2 = null;
                    list2 = qnb4;
                }
                if (dfw2 == null) {
                    qnb2 = qnb;
                    i6 = 2;
                    break;
                }
                m32421a(context2, dfw2.f13025a, 8);
                ? r14 = arrayList6;
                C1225nr nrVar2 = nrVar;
                int i9 = g;
                boolean a4 = a3.mo8893a(djz, dfw2, set2, "com.google.android.gms.chimera.permission.CONFIG_CHANGE", "com.google.android.gms.chimera", z, g, npVar);
                if (a4) {
                    z5 = a4;
                    qnb3 = qnb;
                    i7 = 2;
                    break;
                } else if (npVar.isEmpty()) {
                    Log.e("GmsModuleFndr", "Moduleset rejected without rejectedApks");
                    z5 = a4;
                    qnb3 = qnb;
                    i7 = 2;
                    break;
                } else {
                    Iterator it2 = npVar.entrySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it2.next();
                        dht dht = (dht) entry.getKey();
                        dfg dfg = (dfg) entry.getValue();
                        bojy bojy = (bojy) dfw2.f13030f.get(dht);
                        if (bojy != null) {
                            String a5 = dhz.m8547a(bojy);
                            String valueOf = String.valueOf(dfg);
                            StringBuilder sb = new StringBuilder(String.valueOf(a5).length() + 30 + String.valueOf(valueOf).length());
                            sb.append("excluding moduleset: ");
                            sb.append(a5);
                            sb.append(" reason: ");
                            sb.append(valueOf);
                            Log.w("GmsModuleFndr", sb.toString());
                            nrVar2.add(bojy);
                            if (dfg.f13006a == 1) {
                                r14.add(bojy);
                            }
                        } else {
                            String valueOf2 = String.valueOf(dht.mo8910b());
                            Log.e("GmsModuleFndr", valueOf2.length() == 0 ? new String("Module APK doesn't have a corresponding moduleset: ") : "Module APK doesn't have a corresponding moduleset: ".concat(valueOf2));
                            z9 = true;
                        }
                    }
                    npVar.clear();
                    qnd a6 = qnd.m32471a(context);
                    if (!cdjl.f180997a.mo6606a().mo77718x()) {
                        z6 = a4;
                        arrayList5 = r14;
                        qnb4 = qnb;
                    } else if (r14.isEmpty()) {
                        z6 = a4;
                        arrayList5 = r14;
                        qnb4 = qnb;
                    } else if (a6.mo8638b()) {
                        Log.e("ModuleSetMgr", "not migrated with user locked");
                        z6 = a4;
                        arrayList5 = r14;
                        qnb4 = qnb;
                    } else {
                        synchronized (a6.f41765e) {
                            try {
                                qmo d2 = a6.mo24125d();
                                bxvd bxvd2 = (bxvd) d2.mo74142c(5);
                                bxvd2.mo73625a((GeneratedMessageLite) d2);
                                Iterator it3 = r14.iterator();
                                boolean z10 = false;
                                while (it3.hasNext()) {
                                    bojy bojy2 = (bojy) it3.next();
                                    String str = bojy2.f133370b;
                                    int a7 = qnd.m32467a(str, Collections.unmodifiableList(((qmo) bxvd2.f164949b).f41728c));
                                    if (a7 != -1) {
                                        long j = bojy2.f133373e;
                                        bxvd = bxvd2;
                                        qmn qmn2 = (qmn) ((qmo) bxvd.f164949b).f41728c.get(a7);
                                        bxvd bxvd3 = (bxvd) qmn2.mo74142c(5);
                                        bxvd3.mo73625a((GeneratedMessageLite) qmn2);
                                        int i10 = 0;
                                        Object obj2 = r14;
                                        while (true) {
                                            z7 = a4;
                                            if (i10 >= ((qmn) bxvd3.f164949b).f41723a.size()) {
                                                it = it3;
                                                obj = obj2;
                                                list2 = qnb;
                                                break;
                                            }
                                            qmm qmm2 = (qmm) ((qmn) bxvd3.f164949b).f41723a.get(i10);
                                            it = it3;
                                            qmk qmk2 = qmm2.f41716b;
                                            if (qmk2 == null) {
                                                qmk2 = qmk.f41705d;
                                            }
                                            obj = obj2;
                                            r14 = 0;
                                            list2 = qnb;
                                            try {
                                                if (j == ((bojy) qmk2.f41707a.get(0)).f133373e) {
                                                    break;
                                                }
                                                i10++;
                                                a4 = z7;
                                                it3 = it;
                                                obj2 = obj;
                                                qnb = list2;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                i5 = 2;
                                                list2 = list2;
                                                throw th;
                                            }
                                        }
                                    } else {
                                        String valueOf3 = String.valueOf(str);
                                        Log.w("ModuleSetMgr", valueOf3.length() == 0 ? new String("Failed moduleset not in config: ") : "Failed moduleset not in config: ".concat(valueOf3));
                                        z7 = a4;
                                        it = it3;
                                        bxvd = bxvd2;
                                        obj = r14;
                                        list2 = qnb;
                                    }
                                    bxvd2 = bxvd;
                                    a4 = z7;
                                    it3 = it;
                                    r14 = obj;
                                    qnb = list2;
                                }
                                z6 = a4;
                                bxvd bxvd4 = bxvd2;
                                arrayList5 = r14;
                                qnb4 = qnb;
                                if (z10) {
                                    a6.mo24123a((qmo) bxvd4.mo74062i());
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                list2 = qnb;
                                i5 = 2;
                                list2 = list2;
                                throw th;
                            }
                        }
                    }
                    m32421a(context2, nrVar2, 10);
                    set3 = set;
                    list3 = list;
                    nrVar = nrVar2;
                    g = i9;
                    z8 = z6;
                    arrayList6 = arrayList5;
                    a = qnb4;
                    qnb5 = null;
                    djz2 = djz;
                }
            }
            z2 = z5;
            i = i7;
        } catch (Error | Exception e2) {
            e = e2;
            list2 = a;
            i4 = 2;
            if (qmb2.mo24105a(context2, e)) {
                z2 = false;
                i = i4;
                if (z2) {
                }
                if (qmb.f41692a) {
                }
                return z2;
            }
            throw e;
        }
        if (z2) {
            ArrayList arrayList9 = new ArrayList();
            ArrayList arrayList10 = new ArrayList();
            qnd a8 = qnd.m32471a(context);
            m32422a(context2, list2, list, arrayList9, arrayList10);
            ArrayList arrayList11 = new ArrayList(i);
            qmk g2 = a8.mo24127g();
            dfw dfw3 = new dfw(dky.m8762a((Iterable) bngx.m109356a(qnm.m32493a(String.valueOf(((bojy) g2.f41707a.get(0)).f133370b).concat("-only"))), dhz.f13197a), dgk.m8396a(g2.f41709c, Collections.emptyList()), arrayList9, null, arrayList10, null);
            djz djz3 = djz;
            if (djz3 != null) {
                dfy a9 = dfy.m8329a(context);
                try {
                    dky b = a9.mo8894b(djz3);
                    dky c = a9.mo8895c(djz3);
                    if (!dhz.m8550a(c, dfw3.f13025a)) {
                        bojy bojy3 = (bojy) dfw3.f13025a.get(0);
                        int size2 = c.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size2) {
                                arrayList2 = arrayList10;
                                qmb = qmb2;
                                dky = c;
                                z3 = false;
                                break;
                            }
                            bojy bojy4 = (bojy) c.get(i11);
                            i11++;
                            if (qnm.m32504a(bojy4, true)) {
                                if (qnm.m32503a(bojy4, 64)) {
                                    try {
                                        if (!new dfz(context2).mo8909a(djz3.mo9169a(0))) {
                                            arrayList2 = arrayList10;
                                            qmb = qmb2;
                                            z4 = true;
                                        } else {
                                            arrayList2 = arrayList10;
                                            qmb = qmb2;
                                            z4 = false;
                                        }
                                    } catch (PackageManager.NameNotFoundException e3) {
                                        arrayList2 = arrayList10;
                                        qmb = qmb2;
                                        z4 = false;
                                    }
                                } else {
                                    qmb = qmb2;
                                    arrayList2 = arrayList10;
                                    z4 = !qnm.m32502a(bojy3.f133373e, bojy4.f133373e);
                                }
                                if (!z4) {
                                    dky = c;
                                    z3 = z4;
                                } else if (c.size() != 1) {
                                    bmzs.m108696a(dfw3.f13025a);
                                    dky = c.mo9241a((Set) bnic.m109489a(bojy4)).mo9240a((Collection) bngx.m109356a(bojy3));
                                    z3 = z4;
                                } else {
                                    dfw = null;
                                }
                            }
                        }
                        int b2 = djz.mo9175b();
                        int i12 = b2 / 2;
                        ArrayList arrayList12 = new ArrayList(i12);
                        if (!z3) {
                            ? nrVar3 = new C1225nr(arrayList9.size() + i12);
                            nrVar3.addAll(arrayList9);
                            arrayList3 = nrVar3;
                        } else {
                            arrayList3 = null;
                        }
                        djy djy = new djy();
                        for (int i13 = 0; i13 < b2; i13++) {
                            djz3.mo9170a(djy, i13);
                            int k = djy.mo9160k();
                            if (k != 0) {
                                if (k != 1) {
                                } else {
                                    arrayList4 = arrayList12;
                                }
                            } else if (arrayList3 != null) {
                                arrayList4 = arrayList3;
                            }
                            dht a10 = dht.m8526a(context2, djy);
                            if (a10 != null) {
                                arrayList4.add(a10);
                            }
                        }
                        if (z3) {
                            ArrayList arrayList13 = new ArrayList(b.size());
                            int size3 = b.size();
                            for (int i14 = 0; i14 < size3; i14++) {
                                djc djc = (djc) b.get(i14);
                                if (!djc.f13313e) {
                                    arrayList13.add(djc);
                                }
                            }
                            try {
                                dky2 = dgk.m8400c(bngx.m109357a(arrayList13, dfw3.f13026b));
                            } catch (InvalidConfigException e4) {
                                String valueOf4 = String.valueOf(e4);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 43);
                                sb2.append("Failed merging updated container features: ");
                                sb2.append(valueOf4);
                                Log.e("GmsModuleFndr", sb2.toString());
                                dfw = null;
                            }
                        } else {
                            dky2 = b;
                        }
                        if (arrayList3 == null) {
                            arrayList3 = arrayList9;
                        }
                        dfw = new dfw(dky, dky2, arrayList3, arrayList12, arrayList2, null);
                        if (dfw != null) {
                            arrayList11.add(dfw);
                        }
                        arrayList11.add(dfw3);
                        int g3 = (int) cdjl.m133601g();
                        dfy a11 = dfy.m8329a(context);
                        size = arrayList11.size();
                        i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                z2 = false;
                                break;
                            }
                            dfw dfw4 = (dfw) arrayList11.get(i2);
                            m32421a(context2, dfw4.f13025a, 8);
                            i3 = i2 + 1;
                            arrayList = arrayList11;
                            if (a11.mo8893a(djz, dfw4, set2, "com.google.android.gms.chimera.permission.CONFIG_CHANGE", "com.google.android.gms.chimera", z, g3, null)) {
                                z2 = true;
                                break;
                            }
                            i2 = i3;
                            arrayList11 = arrayList;
                        }
                    }
                } catch (InvalidConfigException e5) {
                    qmb = qmb2;
                    dfw = null;
                }
            }
            qmb = qmb2;
            dfw = null;
            if (dfw != null) {
            }
            arrayList11.add(dfw3);
            int g32 = (int) cdjl.m133601g();
            dfy a112 = dfy.m8329a(context);
            size = arrayList11.size();
            i2 = 0;
            while (true) {
                if (i2 < size) {
                }
                i2 = i3;
                arrayList11 = arrayList;
            }
        } else {
            qmb = qmb2;
        }
        if (qmb.f41692a) {
            Process.killProcess(Process.myPid());
        }
        return z2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rfz.a(android.content.pm.PackageInfo, boolean):boolean
     arg types: [android.content.pm.PackageInfo, int]
     candidates:
      rfz.a(android.content.pm.PackageInfo, rfl[]):rfl
      rfz.a(android.content.pm.PackageInfo, boolean):boolean */
    /* renamed from: a */
    public static final boolean m32427a(Context context, Set set, Set set2, Set set3, boolean z, Collection collection) {
        PackageManager packageManager = context.getPackageManager();
        rfz a = rfz.m33557a(context);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC);
                if (a.mo24607a(packageInfo, true) || a.mo24611c(packageInfo)) {
                    collection.add(new dhc(context, set2.contains(str) ? 1 : 0, str));
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
                    sb.append("Module pkg ");
                    sb.append(str);
                    sb.append(" not signed by Google, skipping");
                    sb.toString();
                }
            } catch (PackageManager.NameNotFoundException e) {
                if (z && set3.contains(str)) {
                    rfi rfi = rfi.f42868a;
                    if (rfy.m33546a(context, str)) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 47);
                        sb2.append("Module pkg ");
                        sb2.append(str);
                        sb2.append(" is possibly updating, aborting scan");
                        sb2.toString();
                        return false;
                    }
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 35);
                sb3.append("Module pkg ");
                sb3.append(str);
                sb3.append(" not installed, skipping");
                sb3.toString();
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo24106a(boolean z, boolean z2, Set set, Set set2, Set set3) {
        Set set4;
        Set set5;
        Set set6;
        boolean z3;
        String str;
        djz djz;
        Context baseContext = rpr.m34216b().getBaseContext();
        Context baseContext2 = baseContext instanceof ModuleContext ? ((ModuleContext) baseContext).getBaseContext() : baseContext;
        qlp.m32393a();
        dfy.m8329a(baseContext2).mo8890a(cdjl.m133599e());
        if (set == null) {
            set4 = m32430c(baseContext2);
        } else {
            set4 = set;
        }
        Set b = m32428b();
        if (set2 == null) {
            set5 = m32429b(baseContext2);
        } else {
            set5 = set2;
        }
        if (set3 == null) {
            Set b2 = rue.m34468b();
            String str2 = (String) qlk.f41652h.mo25081c();
            if (!str2.isEmpty()) {
                Collections.addAll(b2, str2.split(","));
            }
            set6 = b2;
        } else {
            set6 = set3;
        }
        boolean z4 = z2 || m32432e(baseContext2);
        if (z4) {
            Context d = aytw.m84817d(baseContext2);
            srj.m36119a(d, dft.m8317a(d));
        }
        ArrayList arrayList = new ArrayList();
        int i = 4;
        while (true) {
            Log.i("GmsModuleFndr", "Beginning GMS chimera module scan");
            synchronized (f41693a) {
                arrayList.clear();
                if (i > 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i2 = i;
                if (m32427a(baseContext2, set4, b, set5, z3, arrayList)) {
                    try {
                        try {
                            djz = dfy.m8329a(baseContext2).mo8898f();
                        } catch (InvalidConfigException e) {
                            djz = null;
                        }
                        if (m32426a(baseContext2, djz, b, set6, arrayList, z4)) {
                            break;
                        } else if (djz != null) {
                            break;
                        } else {
                            throw new InvalidConfigException("No working module set config");
                        }
                    } catch (InvalidConfigException e2) {
                        FileApkIntentOperation.m22392a(baseContext2);
                        i = i2 - 1;
                        if (i == 0) {
                            str = "failed after max retries";
                            break;
                        } else if (!z) {
                            str = "aborted, can't block";
                            break;
                        } else {
                            try {
                                Thread.sleep(4000);
                            } catch (InterruptedException e3) {
                                Thread.currentThread().interrupt();
                                str = "interrupted";
                            }
                        }
                        Log.i("GmsModuleFndr", str.length() == 0 ? new String("GMS chimera configuration check ") : "GMS chimera configuration check ".concat(str));
                        int i3 = this.f41697c + 1;
                        this.f41697c = i3;
                        if (i3 == 10) {
                            qlp.m32393a().mo8861a(baseContext2, 29, str);
                            return;
                        }
                        return;
                    }
                }
            }
            Thread.sleep(4000);
        }
        this.f41697c = 0;
    }
}
