package p000;

import android.accounts.OnAccountsUpdateListener;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Debug;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: abrm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abrm extends acpn {

    /* renamed from: a */
    final /* synthetic */ boolean f58044a;

    /* renamed from: b */
    final /* synthetic */ abrv f58045b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abrm(abrv abrv, bqbd bqbd, boolean z) {
        super(bqbd);
        this.f58045b = abrv;
        this.f58044a = z;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r3v40, types: [android.os.Handler, java.lang.String], assign insn: PHI: (r3v40 ?) = (r3v41 ?), (r3v47 ?) binds: [B:225:0x0606, B:222:0x05c0] */
    /* JADX WARN: Type inference failed for: r3v41, assign insn: 0x0608: CONST  (r3v41 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r3v47, assign insn: 0x05d2: CONST  (r3v47 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: absg.b(java.lang.String, java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.Integer, int]
     candidates:
      absg.b(java.lang.Throwable, java.lang.String, java.lang.Object[]):void
      absg.b(java.lang.String, java.lang.Object, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: absg.c(java.lang.String, java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.Integer, int]
     candidates:
      absg.c(java.lang.Throwable, java.lang.String, java.lang.Object[]):void
      absg.c(java.lang.String, java.lang.Object, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adyd.a(android.accounts.OnAccountsUpdateListener, android.os.Handler, boolean):void
     arg types: [abph, ?, int]
     candidates:
      adyd.a(android.accounts.Account, java.util.ArrayList, java.lang.String[]):android.content.Intent
      adyd.a(android.accounts.Account, java.lang.String[], android.accounts.AccountManagerCallback):android.accounts.AccountManagerFuture
      adyd.a(android.accounts.Account, java.lang.String, int):boolean
      adyd.a(android.accounts.Account, java.lang.String, android.os.Bundle):boolean
      adyd.a(android.accounts.OnAccountsUpdateListener, android.os.Handler, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0318 A[Catch:{ all -> 0x0820, all -> 0x081c, all -> 0x0535, all -> 0x0416, Exception -> 0x0988, Error -> 0x0980 }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0464 A[Catch:{ all -> 0x0820, all -> 0x081c, all -> 0x0535, all -> 0x0416, Exception -> 0x0988, Error -> 0x0980 }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0465 A[Catch:{ all -> 0x0820, all -> 0x081c, all -> 0x0535, all -> 0x0416, Exception -> 0x0988, Error -> 0x0980 }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0490 A[Catch:{ all -> 0x0820, all -> 0x081c, all -> 0x0535, all -> 0x0416, Exception -> 0x0988, Error -> 0x0980 }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x04b3 A[Catch:{ all -> 0x0820, all -> 0x081c, all -> 0x0535, all -> 0x0416, Exception -> 0x0988, Error -> 0x0980 }] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x04f8 A[SYNTHETIC, Splitter:B:190:0x04f8] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x06cf A[Catch:{ all -> 0x0820, all -> 0x081c, all -> 0x0535, all -> 0x0416, Exception -> 0x0988, Error -> 0x0980 }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x06db A[Catch:{ all -> 0x0820, all -> 0x081c, all -> 0x0535, all -> 0x0416, Exception -> 0x0988, Error -> 0x0980 }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0833 A[Catch:{ all -> 0x0820, all -> 0x081c, all -> 0x0535, all -> 0x0416, Exception -> 0x0988, Error -> 0x0980 }] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x083a A[Catch:{ all -> 0x0820, all -> 0x081c, all -> 0x0535, all -> 0x0416, Exception -> 0x0988, Error -> 0x0980 }] */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x096e A[Catch:{ all -> 0x0820, all -> 0x081c, all -> 0x0535, all -> 0x0416, Exception -> 0x0988, Error -> 0x0980 }] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0970 A[Catch:{ all -> 0x0820, all -> 0x081c, all -> 0x0535, all -> 0x0416, Exception -> 0x0988, Error -> 0x0980 }] */
    /* renamed from: c */
    public final Boolean mo11132a() {
        boolean z;
        abrv abrv;
        abrt abrt;
        bnic bnic;
        boolean z2;
        bnic bnic2;
        abvc abvc;
        NativeIndex nativeIndex;
        abyh abyh;
        long j;
        ? r3;
        boolean z3;
        HashMap hashMap;
        boolean i;
        Throwable th;
        boolean z4;
        boolean z5 = true;
        z5 = true;
        try {
            abru abru = new abru();
            abru.f58058a = this.f58044a;
            abrv abrv2 = this.f58045b;
            abrv2.f58067c.mo32992b(2);
            abrv.f58061a = SystemClock.elapsedRealtime();
            if (!((Boolean) abzt.f58955bq.mo58455c()).booleanValue()) {
                int i2 = Build.VERSION.SDK_INT;
                if (sre.m36084d(abrv2.f58066b)) {
                    abrv2.f58083s.mo32453b(6005);
                    abrt = abrt.FAILURE;
                    bnic = null;
                    if (abrt == abrt.SUCCESS) {
                        absg.m48192b("Unable to initialize index manager: %s", abrt);
                    } else {
                        abrv abrv3 = this.f58045b;
                        abrv3.f58067c.mo32995d(new abrj(abrv3, bqbd.RESTORE_INDEX, abru.f58058a, abru.f58060c, abru.f58059b ? abrv3.mo32314b().mo32537b() : bnic));
                        if (celu.m137200d() && !this.f58045b.f58089y.isEmpty()) {
                            abrv abrv4 = this.f58045b;
                            abrv4.mo32310a((String[]) abrv4.f58089y.toArray(new String[0]));
                            this.f58045b.f58089y.clear();
                        }
                        abrv abrv5 = this.f58045b;
                        if (abrv5.f58081q != null && (!abrv5.f58071g.f60620b.getBoolean("unified-indexing-request-queue-status", false) || !this.f58045b.f58071g.f60620b.getString("request-queue-whitelist", "").equals(cemz.m137438d()))) {
                            abrv abrv6 = this.f58045b;
                            if (!"*".equals(cemz.m137438d())) {
                                bnia bnia = new bnia();
                                for (String str : bmyx.m108640a(',').mo66918a((CharSequence) cemz.m137438d())) {
                                    abyv d = abrv6.f58077m.mo32506d(str);
                                    if (d != null) {
                                        bnia.mo67752b((Iterable) abrv6.mo32314b().mo32524a(d));
                                    }
                                }
                                bnic2 = bnia.mo67751a();
                            } else {
                                bnic2 = abrv6.mo32314b().mo32537b();
                            }
                            bnrd a = bnic2.iterator();
                            while (a.hasNext()) {
                                acak acak = (acak) a.next();
                                abss b = abrv6.mo32314b().mo32534b(acak);
                                if (b != null) {
                                    absy absy = b.f58158c;
                                    if (absy == null) {
                                        absy = absy.f58176h;
                                    }
                                    int a2 = absx.m48236a(absy.f58180c);
                                    if (a2 != 0) {
                                        if (a2 != 1) {
                                        }
                                    }
                                    absr absr = b.f58157b;
                                    if (absr == null) {
                                        absr = absr.f58134s;
                                    }
                                    if (abzm.m48657e(absr)) {
                                        abrv6.f58079o.mo32578a(acak);
                                    }
                                }
                            }
                            this.f58045b.f58071g.f60620b.edit().putBoolean("unified-indexing-request-queue-status", true).commit();
                            this.f58045b.f58071g.f60620b.edit().putString("request-queue-whitelist", cemz.m137438d()).commit();
                        }
                    }
                    if (abrt == abrt.FAILURE) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z = Boolean.valueOf(z2);
                    abrv = this.f58045b;
                    abrv.f58070f.release();
                    return z;
                }
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) abrv2.f58066b.getSystemService("activity")).getMemoryInfo(memoryInfo);
            if (memoryInfo.lowMemory) {
                abrv2.f58083s.mo32453b(6002);
                if (((Boolean) abzt.f58956br.mo58455c()).booleanValue()) {
                    abrt = abrt.FAILURE;
                    bnic = null;
                    if (abrt == abrt.SUCCESS) {
                    }
                    if (abrt == abrt.FAILURE) {
                    }
                    z = Boolean.valueOf(z2);
                    abrv = this.f58045b;
                    abrv.f58070f.release();
                    return z;
                }
            }
            if (abru.f58058a) {
                abrv2.mo32327j();
            } else if (abrv2.mo32319c()) {
                abrt = abrt.ALREADY_INITIALIZED;
                bnic = null;
                if (abrt == abrt.SUCCESS) {
                }
                if (abrt == abrt.FAILURE) {
                }
                z = Boolean.valueOf(z2);
                abrv = this.f58045b;
                abrv.f58070f.release();
                return z;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long threadCpuTimeNanos = Debug.threadCpuTimeNanos();
            String str2 = abrv2.f58068d;
            Context context = abrv2.f58066b;
            try {
                abvc = new abvc(context, context.getFilesDir(), str2);
            } catch (IOException e) {
                absg.m48189a(e, "Unable to create storage");
                abvc = null;
            }
            abrv2.f58073i = abvc;
            abvc abvc2 = abrv2.f58073i;
            if (abvc2 == null) {
                abrt = abrt.FAILURE;
                bnic = null;
            } else {
                absg.m48204d("Storage manager: low %s usage %s avail %s capacity %s", Boolean.valueOf(abvc2.mo32351a()), acky.m49361a(abvc2.mo32356f()), acky.m49361a(abvc2.mo32355e()), acky.m49361a(abvc2.f58512b));
                abrv2.f58090z = new acxk(abrv2.f58073i.f58511a, !rfx.m33537a(abrv2.f58066b));
                String valueOf = String.valueOf(abrv2.f58068d);
                abrv2.f58071g = new acrl(abrv2.f58066b, valueOf.length() == 0 ? new String("AppDataSearch-") : "AppDataSearch-".concat(valueOf));
                abrv2.f58072h = new absi(abrv2.f58066b, abrv2.f58083s);
                if (cemq.m137367d()) {
                    File file = new File(abrv2.f58066b.getFilesDir(), "unpacked/shared/cld3model/cld3-model-0001");
                    if (abrv2.f58063B == null) {
                        if (file.exists()) {
                            bxvd da = abpl.f57866d.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            abpl abpl = (abpl) da.f164949b;
                            "cld3-model".getClass();
                            abpl.f57868a |= 1;
                            abpl.f57869b = "cld3-model";
                            befh a3 = befi.m94962a(abrv2.f58066b);
                            a3.mo60659a(file);
                            String uri = a3.mo60657a().toString();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            abpl abpl2 = (abpl) da.f164949b;
                            uri.getClass();
                            abpl2.f57868a |= 2;
                            abpl2.f57870c = uri;
                            abpl abpl3 = (abpl) da.mo74062i();
                            bxvd da2 = abpm.f57871d.mo74144da();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            abpm abpm = (abpm) da2.f164949b;
                            "cld3-model".getClass();
                            abpm.f57873a |= 1;
                            abpm.f57874b = "cld3-model";
                            da2.mo73972a(abpl3);
                            abrv2.f58063B = (abpm) da2.mo74062i();
                        }
                    }
                }
                abtm i3 = abrv2.mo32326i();
                File file2 = abrv2.f58073i.f58511a;
                if (NativeIndex.f79070a) {
                    try {
                        nativeIndex = new NativeIndex(file2, i3);
                    } catch (IOException e2) {
                        absg.m48192b("Error creating native index: %s", e2.getMessage());
                        nativeIndex = null;
                    }
                } else {
                    nativeIndex = null;
                }
                abrv2.f58078n = nativeIndex;
                if (abrv2.f58078n != null) {
                    bnzc b2 = bnzi.m110900b();
                    abpr abpr = i3.f58268h;
                    if (abpr == null) {
                        abpr = abpr.f57891d;
                    }
                    abrv2.f58062A = b2.mo68722a(abpr.mo73642k()).toString();
                    acrl acrl = abrv2.f58071g;
                    Context context2 = abrv2.f58066b;
                    abrv2.f58077m = new abyx(new abyw(acrl, context2, context2.getPackageManager(), abrv2.f58065D, abrv2.f58085u));
                    abrv2.f58074j = new abze(new abzm(abrv2.f58078n, abrv2.f58077m, abrv2.f58066b, abrv2.f58068d, abrv2.f58073i.f58511a, abrv2.f58083s), new abqx(abrv2));
                    if (celu.m137201e()) {
                        abrv2.f58075k = new acxo(abrv2.f58066b, "useractions_usage");
                    }
                    abrv2.f58076l = new acxs(abrv2.f58066b, abrv2.f58075k, abrv2.mo32298a(), abrv2.f58077m, abrv2.f58083s);
                    abrv2.mo32307a(bpzm.INIT_PREFS, elapsedRealtime);
                    if (!abru.f58058a) {
                        if (abrv2.f58071g.f60620b.getBoolean("enabled-corpus-schema-store-as-ground-truth", false)) {
                            abru.f58058a = true;
                        }
                    }
                    if (!abru.f58058a) {
                        abrv2.f58067c.mo32992b(2);
                        int b3 = abrv2.f58071g.mo33022b();
                        if (b3 == -1) {
                            absg.m48196c("Version not set, assuming clear data.");
                        } else if (b3 > 63) {
                            absg.m48193b("Version going backward from %d to %d", (Object) Integer.valueOf(b3), (Object) 63);
                        } else if (b3 == 63) {
                            z5 = false;
                        } else if (b3 >= 58) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            Integer valueOf2 = Integer.valueOf(b3);
                            absg.m48198c("Upgrading from version %d to %d", (Object) valueOf2, (Object) 63);
                            NativeIndex nativeIndex2 = abrv2.f58078n;
                            if (nativeIndex2 == null || !NativeIndex.nativeUpgrade(nativeIndex2.f79071b, b3, 63)) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (z4) {
                                absg.m48198c("Successfully upgraded native from version %d to %d", (Object) valueOf2, (Object) 63);
                                abrv2.f58071g.mo33039j();
                            } else {
                                absg.m48193b("Couldn't upgrade native from version %d to %d", (Object) valueOf2, (Object) 63);
                            }
                            if (!z4) {
                                abrv2.f58083s.mo32447a("upgrade_failed");
                            }
                            abrv2.mo32307a(bpzm.INIT_UPGRADE, elapsedRealtime2);
                            z5 = !z4;
                        } else {
                            abrv2.f58083s.mo32447a("upgrade_unsupported_version");
                            absg.m48192b("Upgrade from version %d is not supported. Clearing data.", Integer.valueOf(b3));
                        }
                        abru.f58058a = z5;
                        if (z5) {
                            absg.m48196c("Clearing storage");
                            abvc abvc3 = abrv2.f58073i;
                            srj.m36120a(abvc3.f58511a);
                            if (abvc3.f58511a.mkdirs()) {
                                absg.m48196c("Clearing CorpusMap, ClientRegistry, Setting");
                                abzm a4 = abrv2.f58074j.mo32517a();
                                synchronized (a4.mo32525a()) {
                                    acam acam = a4.f58813b;
                                    ((acan) acam).f59109a.edit().clear().putLong("created", System.currentTimeMillis()).commit();
                                    ((acan) acam).mo32591b();
                                    if (((acan) acam).f59110b.mo33197b() && !((acan) acam).f59110b.mo33196a()) {
                                        absg.m48191b("Failed to delete stale scratch file.");
                                    }
                                    a4.f58818g = false;
                                    a4.f58817f.clear();
                                }
                                abyx abyx = abrv2.f58077m;
                                if (abyx != null) {
                                    synchronized (abyx.f58773b) {
                                        try {
                                            acrl acrl2 = abyx.f58772a.f58767a;
                                            synchronized (acrl2.f60625g) {
                                                SharedPreferences.Editor edit = acrl2.f60620b.edit();
                                                Iterator it = acrl2.f60621c.entrySet().iterator();
                                                while (it.hasNext()) {
                                                    Map.Entry entry = (Map.Entry) it.next();
                                                    abul abul = (abul) entry.getValue();
                                                    bxvd bxvd = (bxvd) abul.mo74142c(5);
                                                    bxvd.mo73625a((bxvk) abul);
                                                    bxvd.f164949b = (bxvk) bxvd.f164949b.mo74142c(4);
                                                    acrn.m49773a(edit, (String) entry.getKey(), (abul) bxvd.mo74062i());
                                                    it.remove();
                                                }
                                                edit.commit();
                                            }
                                            abyx.f58774c.clear();
                                        } catch (Throwable th2) {
                                            throw th2;
                                        } finally {
                                            while (true) {
                                            }
                                        }
                                    }
                                }
                                acrl acrl3 = abrv2.f58071g;
                                acrl3.f60620b.edit().clear().putInt("settings-version", 7).putLong("last-maintenance", System.currentTimeMillis()).commit();
                                acrl3.mo33017a();
                                abrv2.f58071g.mo33039j();
                            } else {
                                absg.m48191b("Unable to clear storage, can't init index");
                                abrv2.f58083s.mo32447a("clear_storage_failed");
                                abrv2.mo32327j();
                                abrt = abrt.FAILURE;
                                bnic = null;
                            }
                        }
                        long elapsedRealtime3 = SystemClock.elapsedRealtime();
                        if (((Boolean) abzt.f58972cg.mo58455c()).booleanValue() && abrv2.f58071g.f60620b.getBoolean("enable-patch-overlays", false) != (i = acaw.m48792i())) {
                            abrv2.f58071g.f60620b.edit().putBoolean("enable-patch-overlays", i).commit();
                            if (i) {
                                abrv2.f58083s.mo32453b(6008);
                                absg.m48191b("Ground truth invalid because of patch flag changing, resetting corpora");
                                if (!NativeIndex.nativeClear(abrv2.f58078n.f79071b)) {
                                    abru.f58059b = true;
                                    abru.f58060c = true;
                                    abtk a5 = abrv2.f58078n.mo43393a();
                                    if (a5 != null) {
                                        abrv2.mo32304a(a5);
                                        abrv2.mo32303a(abru, a5);
                                        abrv2.mo32307a(bpzm.INIT_NATIVE, elapsedRealtime3);
                                        abyh = new abyh(abrv2.f58066b);
                                        try {
                                            abqc abqc = (abqc) bqfy.m112768a(abyh.f58727a.f58734a.mo60776a(), IOException.class);
                                            absg.m48185a("Read %d client cache records", Integer.valueOf(abqc.f57942a.size()));
                                            bxwc<abqa> bxwc = abqc.f57942a;
                                            synchronized (abyh.f58728b) {
                                                for (abqa abqa : bxwc) {
                                                    abyh.f58729c.put(abyh.m48537a(abqa.f57933b, abqa.f57932a), abqa);
                                                    for (abqb abqb : abqa.f57934c) {
                                                        abyh.f58730d.mo67268a(abqb, abqa);
                                                    }
                                                    abyh.f58731e.add(abqa);
                                                }
                                            }
                                        } catch (IOException e3) {
                                        }
                                        abrv2.f58082r = abyh;
                                        if (cemz.f183035a.mo6606a().mo79395g()) {
                                            Context context3 = abrv2.f58066b;
                                            acpl acpl = abrv2.f58067c;
                                            abze abze = abrv2.f58074j;
                                            abyx abyx2 = abrv2.f58077m;
                                            abvc abvc4 = abrv2.f58073i;
                                            NativeIndex nativeIndex3 = abrv2.f58078n;
                                            abym abym = abrv2.f58083s;
                                            abyh abyh2 = abrv2.f58082r;
                                            File file3 = new File(abvc4.f58511a, "rq");
                                            bxxk bxxk = (bxxk) abqq.f58001c.mo74142c(7);
                                            long j2 = elapsedRealtime;
                                            abvt abvt = new abvt(cemz.f183035a.mo6606a().mo79396h());
                                            if (file3.isFile()) {
                                                if (!file3.delete()) {
                                                    String valueOf3 = String.valueOf(file3);
                                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 57);
                                                    sb.append("Request queue work dir \"");
                                                    sb.append(valueOf3);
                                                    sb.append("\" is a file and cannot be deleted");
                                                    throw new IOException(sb.toString());
                                                }
                                            }
                                            if (!file3.exists()) {
                                                if (!file3.mkdirs()) {
                                                    String valueOf4 = String.valueOf(file3);
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 46);
                                                    sb2.append("Request queue work dir \"");
                                                    sb2.append(valueOf4);
                                                    sb2.append("\" could not be created");
                                                    throw new IOException(sb2.toString());
                                                }
                                            }
                                            j = j2;
                                            r3 = 0;
                                            abrv2.f58081q = new abvx(context3, abrv2, acpl, new abvw(file3, bxxk, abvt), abze, abyx2, nativeIndex3, abym, abyh2);
                                        } else {
                                            j = elapsedRealtime;
                                            r3 = 0;
                                        }
                                        abrv2.f58079o = new acaf(abrv2.f58066b, abrv2, abrv2.f58067c, abrv2.f58074j, abrv2.f58077m, abrv2.f58083s, abrv2.f58082r, abrv2.f58085u, abrv2.f58078n, abrv2.f58073i);
                                        abrv2.f58080p = new abph(abrv2.f58066b, abrv2.f58067c, abrv2, abrv2.f58078n, abrv2.mo32298a(), abrv2.f58085u, abrv2.f58083s);
                                        abrv2.f58077m.mo32505c(abrv2.f58066b.getPackageName()).mo32475d();
                                        acrl acrl4 = abrv2.f58071g;
                                        synchronized (acrl4.f60625g) {
                                            String string = acrl4.f60620b.getString("current-os-build-id", r3);
                                            if (string != null) {
                                                z3 = Build.ID.equals(string);
                                            } else {
                                                acrl4.mo33032g();
                                                z3 = true;
                                            }
                                        }
                                        boolean z6 = !z3;
                                        long elapsedRealtime4 = SystemClock.elapsedRealtime();
                                        for (abyv abyv : abrv2.f58077m.mo32500a()) {
                                            String e4 = abyv.f58763d.mo33028e(abyv.f58761b);
                                            String j3 = abyv.mo32481j();
                                            if (j3 != null) {
                                                if (e4 != null) {
                                                    if (!TextUtils.equals(j3, e4)) {
                                                        absg.m48210f("Fail to authenticate package: %s, fingerprint mismatch (%s != %s)", abyv.f58761b, e4, j3);
                                                        abrv2.mo32312a(abyv);
                                                        if (celu.m137200d()) {
                                                            abrv2.mo32310a(abyv.f58761b);
                                                        } else {
                                                            abrv2.f58089y.add(abyv.f58761b);
                                                        }
                                                    } else if (z6) {
                                                        abrv2.f58077m.mo32510f(abyv.f58761b);
                                                    }
                                                }
                                            }
                                            absg.m48206e("Fail to authenticate package: %s, fingerprint is null.", abyv.f58761b);
                                            abrv2.mo32312a(abyv);
                                            if (celu.m137200d()) {
                                            }
                                        }
                                        if (z6) {
                                            absg.m48185a("Committed os upgrade: %s", Build.ID);
                                            abrv2.f58071g.mo33032g();
                                        }
                                        abrv2.mo32307a(bpzm.INIT_AUTHENTICATE, elapsedRealtime4);
                                        abzm b4 = abrv2.mo32314b();
                                        synchronized (b4.mo32525a()) {
                                            hashMap = new HashMap();
                                            for (Map.Entry entry2 : b4.f58817f.entrySet()) {
                                                absy absy2 = ((abss) entry2.getValue()).f58158c;
                                                if (absy2 == null) {
                                                    absy2 = absy.f58176h;
                                                }
                                                int a6 = absx.m48236a(absy2.f58180c);
                                                if (a6 != 0 && a6 == 2) {
                                                    absr absr2 = ((abss) entry2.getValue()).f58157b;
                                                    if (absr2 == null) {
                                                        absr2 = absr.f58134s;
                                                    }
                                                    hashMap.put((acak) entry2.getKey(), absr2);
                                                }
                                            }
                                            for (Map.Entry entry3 : hashMap.entrySet()) {
                                                hashMap.put((acak) entry3.getKey(), (absr) entry3.getValue());
                                            }
                                        }
                                        for (Map.Entry entry4 : hashMap.entrySet()) {
                                            long j4 = j;
                                            absg.m48185a("Found corpus [%s] in limbo", ((absr) entry4.getValue()).f58138c);
                                            abrv2.mo32313a((acak) entry4.getKey(), abrv2.f58077m.mo32505c(((absr) entry4.getValue()).f58140e));
                                            j = j4;
                                        }
                                        abrv2.f58071g.f60620b.edit().putBoolean("enabled-corpus-schema-store-as-ground-truth", false).commit();
                                        long elapsedRealtime5 = SystemClock.elapsedRealtime();
                                        abph abph = abrv2.f58080p;
                                        abph.f57849g.mo33912a((OnAccountsUpdateListener) abph, (Handler) r3, false);
                                        abrv2.mo32287a(abph.f57849g.mo33922b());
                                        abrv2.f58077m.mo32507d();
                                        abrv2.f58077m.mo32508e();
                                        aclp.m49388a(abrv2.f58066b);
                                        abrv2.mo32307a(bpzm.INIT_READ_RESOURCES, elapsedRealtime5);
                                        absg.m48197c("Internal init done: storage state %d", Integer.valueOf(bpzk.m112432a(abrv2.f58073i.mo32350a(abrv2.f58078n.mo43412g()))));
                                        abrv2.mo32307a(bpzm.INIT, j);
                                        abrv2.f58083s.mo32445a(bpzm.INIT_CPU, (int) ((Debug.threadCpuTimeNanos() - threadCpuTimeNanos) / 1000000));
                                        abrt = abrt.SUCCESS;
                                        bnic = r3;
                                    } else {
                                        abrv2.f58083s.mo32447a("second_init_failed");
                                        throw new IOException("Second try index init failed");
                                    }
                                } else {
                                    abrv2.f58083s.mo32447a("clear_failed");
                                    throw new IOException("Index clear failed");
                                }
                            }
                        }
                        abtk a7 = abrv2.f58078n.mo43393a();
                        if (a7 == null) {
                            abrv2.f58083s.mo32447a("init_failed");
                            absg.m48191b("Index init failed, resetting corpora");
                            if (!NativeIndex.nativeClear(abrv2.f58078n.f79071b)) {
                            }
                        } else {
                            abrv2.mo32304a(a7);
                            abrv2.mo32303a(abru, a7);
                            abrv2.mo32307a(bpzm.INIT_NATIVE, elapsedRealtime3);
                            abyh = new abyh(abrv2.f58066b);
                            abqc abqc2 = (abqc) bqfy.m112768a(abyh.f58727a.f58734a.mo60776a(), IOException.class);
                            absg.m48185a("Read %d client cache records", Integer.valueOf(abqc2.f57942a.size()));
                            bxwc<abqa> bxwc2 = abqc2.f57942a;
                            synchronized (abyh.f58728b) {
                            }
                        }
                    }
                    z5 = true;
                    abru.f58058a = z5;
                    if (z5) {
                    }
                    long elapsedRealtime32 = SystemClock.elapsedRealtime();
                    abrv2.f58071g.f60620b.edit().putBoolean("enable-patch-overlays", i).commit();
                    if (i) {
                    }
                } else {
                    bnic = null;
                    absg.m48191b("Unable to create native index.");
                    abrv2.mo32327j();
                    abrt = abrt.FAILURE;
                }
            }
            if (abrt == abrt.SUCCESS) {
            }
            if (abrt == abrt.FAILURE) {
            }
            z = Boolean.valueOf(z2);
            abrv = this.f58045b;
        } catch (Exception e5) {
            absg.m48195b(e5, "Unable to initialize index manager %s", e5.getMessage());
            this.f58045b.f58083s.mo32447a("init_index_manager_failed");
            this.f58045b.mo32327j();
            z = false;
            abrv = this.f58045b;
        } catch (Error e6) {
            Error error = e6;
            try {
                this.f58045b.mo32327j();
                throw error;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                this.f58045b.f58070f.release();
                throw th4;
            }
        } catch (Throwable th5) {
            while (true) {
                throw th5;
            }
        }
        abrv.f58070f.release();
        return z;
    }
}
