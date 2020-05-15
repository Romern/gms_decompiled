package com.google.android.gms.chimera.container;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TestSetupIntentOperation extends IntentOperation {
    /* renamed from: a */
    private static void m22408a(Context context, boolean z) {
        byte b;
        byte[] bArr = new byte[1];
        if (!z) {
            b = 48;
        } else {
            b = 49;
        }
        bArr[0] = b;
        File a = dft.m8317a(context);
        dft.m8316a(bArr, new File(a, ".tmp-.config_updated"), new File(a, ".config_updated"), true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: qmc.a(android.content.Context, java.util.Set, java.util.Set, java.util.Set, boolean, java.util.Collection):boolean
     arg types: [com.google.android.gms.chimera.container.TestSetupIntentOperation, java.util.Set, java.util.Set, java.util.Set, int, nr]
     candidates:
      qmc.a(android.content.Context, djz, java.util.Set, java.util.Set, java.util.List, boolean):boolean
      qmc.a(android.content.Context, java.util.Set, java.util.Set, java.util.Set, boolean, java.util.Collection):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dgv.a(java.util.Set, dks, boolean):boolean
     arg types: [nr, ?[OBJECT, ARRAY], int]
     candidates:
      dgv.a(dkw, boolean, dks):boolean
      dgv.a(java.io.File, dke, boolean):boolean
      dgv.a(java.util.Set, dks, boolean):boolean */
    public final void onHandleIntent(Intent intent) {
        bnic bnic;
        boolean z;
        long j;
        C1225nr nrVar;
        boolean z2;
        int i;
        String str;
        dgv dgv;
        String str2;
        Intent intent2 = intent;
        String action = intent.getAction();
        if (!"com.google.android.gms.chimera.container.UPDATE_CONFIG_FOR_TESTING".equals(action)) {
            String valueOf = String.valueOf(action);
            Log.e("TestIntentOp", valueOf.length() == 0 ? new String("Unknown action: ") : "Unknown action: ".concat(valueOf));
            return;
        }
        String stringExtra = intent2.getStringExtra("required_packages");
        if (stringExtra == null || stringExtra.isEmpty()) {
            bnic = bnon.f131923a;
        } else {
            bnic = bnic.m109496a((Object[]) stringExtra.split(","));
        }
        int intExtra = intent2.getIntExtra("max_scans", 22);
        long millis = TimeUnit.SECONDS.toMillis((long) intent2.getIntExtra("scan_interval_sec", 5));
        if (intent2.getBooleanExtra("optimization_required", true) || dfq.m8314a().mo8862a()) {
            z = true;
        } else {
            z = false;
        }
        boolean booleanExtra = intent2.getBooleanExtra("chimera_check", true);
        boolean booleanExtra2 = intent2.getBooleanExtra("ph_check", true);
        long elapsedRealtime = SystemClock.elapsedRealtime() + (((long) intExtra) * millis);
        C1225nr nrVar2 = new C1225nr(16);
        String str3 = "Failed to read Chimera config";
        if (booleanExtra) {
            C1225nr nrVar3 = new C1225nr(8);
            qmc.m32416a();
            dgv a = dgv.m8427a(this);
            int i2 = 0;
            boolean z3 = false;
            while (true) {
                if (i2 >= intExtra) {
                    nrVar = nrVar2;
                    j = millis;
                    z2 = false;
                    break;
                } else if (SystemClock.elapsedRealtime() >= elapsedRealtime) {
                    nrVar = nrVar2;
                    j = millis;
                    z2 = false;
                    break;
                } else {
                    if (i2 > 0) {
                        SystemClock.sleep(millis);
                    }
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime - SystemClock.elapsedRealtime());
                    StringBuilder sb = new StringBuilder(71);
                    sb.append("TEST SETUP (Chimera): ");
                    sb.append(i2);
                    sb.append(" of ");
                    sb.append(intExtra);
                    sb.append(" - ");
                    sb.append(seconds);
                    m22409a(sb.toString());
                    nrVar3.clear();
                    if (m22410a()) {
                        if (z3) {
                            nrVar = nrVar2;
                            j = millis;
                            m22409a("Modules are ready");
                            z2 = true;
                            break;
                        }
                        Set c = qmc.m32430c(this);
                        i = i2;
                        j = millis;
                        dgv = a;
                        str = str3;
                        nrVar = nrVar2;
                        if (qmc.m32427a((Context) this, c, qmc.m32428b(), c, true, (Collection) nrVar3)) {
                            String valueOf2 = String.valueOf(nrVar3);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 14);
                            sb2.append("installedApks=");
                            sb2.append(valueOf2);
                            sb2.toString();
                            dgv.mo8985a((Set) nrVar3, (dks) null, false);
                            if (z) {
                                dgv.mo8977a(false);
                            }
                            qmc.m32424a(true);
                            if (!z) {
                                int i3 = Build.VERSION.SDK_INT;
                                int i4 = Build.VERSION.SDK_INT;
                                int i5 = Build.VERSION.SDK_INT;
                            }
                            nrVar.clear();
                            try {
                                boolean a2 = m22412a(bnic, nrVar);
                                if (a2 && m22410a()) {
                                    m22409a("Modules are ready");
                                    z2 = true;
                                    break;
                                }
                                z3 = a2;
                            } catch (InvalidConfigException | IOException e) {
                                Log.e("TestIntentOp", str, e);
                                z2 = false;
                            }
                        }
                        if (!z3) {
                            str2 = "not ready";
                        } else {
                            str2 = "initializing";
                        }
                        m22409a(str2.length() == 0 ? new String("Modules ") : "Modules ".concat(str2));
                    } else {
                        m22409a("Modules initializing");
                        i = i2;
                        nrVar = nrVar2;
                        j = millis;
                        dgv = a;
                        str = str3;
                    }
                    i2 = i + 1;
                    a = dgv;
                    str3 = str;
                    nrVar2 = nrVar;
                    millis = j;
                }
            }
        } else {
            try {
                z2 = m22412a(bnic, nrVar2);
                nrVar = nrVar2;
                j = millis;
            } catch (InvalidConfigException | IOException e2) {
                Log.e("TestIntentOp", str3, e2);
                nrVar = nrVar2;
                j = millis;
                z2 = false;
            }
        }
        if (z2 && booleanExtra2 && !aytw.m84813a(this)) {
            z2 = m22411a(intExtra, j, elapsedRealtime, nrVar);
        }
        aytw.m84814b();
        m22408a(createDeviceProtectedStorageContext(), z2);
        if (aytw.m84815b(this)) {
            m22408a(this, z2);
        }
        StringBuilder sb3 = new StringBuilder(50);
        sb3.append("UPDATE_CONFIG_FOR_TESTING completed: success=");
        sb3.append(z2);
        m22409a(sb3.toString());
    }

    /* renamed from: a */
    private static void m22409a(String str) {
        Log.i("TestIntentOp", str);
    }

    /* renamed from: a */
    private final boolean m22410a() {
        boolean e = dfy.m8329a(this).mo8897e();
        StringBuilder sb = new StringBuilder(30);
        sb.append("modulesInit in progress: ");
        sb.append(e);
        sb.toString();
        return !e;
    }

    /* renamed from: a */
    private final boolean m22411a(int i, long j, long j2, Set set) {
        Intent startIntent;
        int i2 = 0;
        while (i2 < i && SystemClock.elapsedRealtime() < j2) {
            if (i2 > 0) {
                SystemClock.sleep(j);
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(j2 - SystemClock.elapsedRealtime());
            StringBuilder sb = new StringBuilder(73);
            sb.append("TEST SETUP (Phenotype): ");
            sb.append(i2);
            sb.append(" of ");
            sb.append(i);
            sb.append(" - ");
            sb.append(seconds);
            m22409a(sb.toString());
            ArrayList a = bnkn.m109662a(((C1225nr) set).f26758b);
            aney a2 = anef.m64089a(this);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                a.add(a2.mo41766p((String) it.next()));
            }
            try {
                aucu.m76783a(aucu.m76785b(a), 30, TimeUnit.SECONDS);
                return true;
            } catch (ExecutionException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("TestIntentOp", valueOf.length() == 0 ? new String("Failed to get P/H config from required packages: ") : "Failed to get P/H config from required packages: ".concat(valueOf));
                Throwable cause = e.getCause();
                if ((cause instanceof rjp) && ((rjp) cause).mo24655a() == 29503 && (startIntent = IntentOperation.getStartIntent(this, "com.google.android.gms.common.config.PhenotypeRegistrationOperation", "com.google.android.chimera.MODULE_CONFIGURATION_CHANGED")) != null) {
                    startService(startIntent);
                }
            } catch (InterruptedException | TimeoutException e2) {
                Log.e("TestIntentOp", "Something went wrong when getting P/H config", e2);
            }
        }
        return false;
        i2++;
    }

    /* renamed from: a */
    private final boolean m22412a(Set set, Set set2) {
        byte[] byteArray;
        set2.add("com.google.android.gms");
        if (set.isEmpty()) {
            return true;
        }
        try {
            Collection<ModuleManager.ModuleInfo> allModules = ModuleManager.get(this).getAllModules();
            Set b = adyi.m51413b();
            for (ModuleManager.ModuleInfo moduleInfo : allModules) {
                b.add(moduleInfo.moduleApk.apkPackageName);
                if (set.contains(moduleInfo.moduleApk.apkPackageName) && (byteArray = moduleInfo.getMetadata(this).getByteArray("com.google.android.gms.phenotype.registration.proto")) != null && byteArray.length > 0) {
                    bxwc bxwc = ((zzv) bxvk.m124016a(zzv.f56346b, byteArray, bxus.m123743b())).f56348a;
                    int size = bxwc.size();
                    for (int i = 0; i < size; i++) {
                        zzu zzu = (zzu) bxwc.get(i);
                        if (!zzu.f56343g) {
                            set2.add(zzu.f56338b);
                        }
                    }
                }
            }
            String valueOf = String.valueOf(set);
            String valueOf2 = String.valueOf(b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26 + String.valueOf(valueOf2).length());
            sb.append("requiredPackages=");
            sb.append(valueOf);
            sb.append(" allApks=");
            sb.append(valueOf2);
            sb.toString();
            String valueOf3 = String.valueOf(set2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 29);
            sb2.append("required P/H config packages=");
            sb2.append(valueOf3);
            sb2.toString();
            return b.containsAll(set);
        } catch (InvalidConfigException e) {
            Log.e("TestIntentOp", "Unable to get Chimera module info collection", e);
            return false;
        }
    }
}
