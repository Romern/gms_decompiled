package com.google.android.gms.chimera.container;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.io.File;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GmsModuleFinder$ConfigUpdateIntentOperation extends IntentOperation {
    /* renamed from: a */
    private final void m22404a() {
        if (cdjh.f180979a.mo6606a().mo77733M()) {
            aytw.m84814b();
            if (aytw.m84815b(this)) {
                SharedPreferences.Editor edit = rtc.m34374a(this).edit();
                rtc[] a = qlk.m32361a();
                for (int i = 0; i < 3; i++) {
                    rtc rtc = a[i];
                    String str = rtc.f43644b;
                    Object c = rtc.mo25081c();
                    if (c != null) {
                        edit.putString(str, c.toString());
                    } else {
                        edit.remove(str);
                    }
                }
                if (!edit.commit()) {
                    Log.w("GmsModuleFndr", "Failed to commit chimera values to direct boot cache");
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: qmc.a(boolean, boolean, java.util.Set, java.util.Set, java.util.Set):void
     arg types: [int, int, java.util.Set, java.util.Set, ?[OBJECT, ARRAY]]
     candidates:
      qmc.a(android.content.Context, java.util.Set, java.util.Collection, djz, qmb):qnb
      qmc.a(android.content.Context, qnb, java.util.List, java.util.Collection, java.util.Collection):void
      qmc.a(boolean, boolean, java.util.Set, java.util.Set, java.util.Set):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.chimera.container.FileApkIntentOperation.a(android.content.Context, boolean):void
     arg types: [com.google.android.gms.chimera.container.GmsModuleFinder$ConfigUpdateIntentOperation, int]
     candidates:
      com.google.android.gms.chimera.container.FileApkIntentOperation.a(java.lang.String, int):void
      com.google.android.gms.chimera.container.FileApkIntentOperation.a(android.content.Context, android.content.Intent):boolean
      com.google.android.gms.chimera.container.FileApkIntentOperation.a(android.content.Context, boolean):void */
    public final void onHandleIntent(Intent intent) {
        char c;
        String str;
        Set set;
        String action = intent.getAction();
        bmzs.m108696a(action);
        boolean z = false;
        switch (action.hashCode()) {
            case -905063602:
                if (action.equals("android.intent.action.LOCKED_BOOT_COMPLETED")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -810471698:
                if (action.equals("android.intent.action.PACKAGE_REPLACED")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -678435495:
                if (action.equals("com.google.android.chimera.container.MODULE_SCAN")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 211362435:
                if (action.equals("com.google.gservices.intent.action.GSERVICES_CHANGED")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 267468725:
                if (action.equals("android.intent.action.PACKAGE_DATA_CLEARED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 525384130:
                if (action.equals("android.intent.action.PACKAGE_REMOVED")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 798292259:
                if (action.equals("android.intent.action.BOOT_COMPLETED")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1544582882:
                if (action.equals("android.intent.action.PACKAGE_ADDED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2069809336:
                if (action.equals(IntentOperation.ACTION_NEW_MODULE)) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                if (cdjl.m133599e()) {
                    dfy.m8329a(this).mo8890a(true);
                    dgv a = dgv.m8427a(this);
                    if (a.mo8637a()) {
                        File file = new File(a.f12991b, "m");
                        dha.m8470b(file);
                        dgv.f13086e.readLock().lock();
                        try {
                            dke dke = a.mo8992j().f13074c;
                            dgv.f13086e.readLock().unlock();
                            bxwc bxwc = dke.f13395d;
                            int size = bxwc.size();
                            for (int i = 0; i < size; i++) {
                                dha.m8471c(dha.m8469b(file, ((dkf) bxwc.get(i)).f13402d));
                            }
                        } catch (Throwable th) {
                            dgv.f13086e.readLock().unlock();
                            throw th;
                        }
                    }
                }
                qmc.m32424a(false);
                if (cdjh.m133557g()) {
                    qmc.m32418a(this);
                }
                FileApkIntentOperation.m22396a((Context) this, true);
                return;
            case 1:
                aytw.m84814b();
                m22404a();
                return;
            case 2:
            case 3:
                if (intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
                    return;
                }
                break;
            case 4:
            case 5:
                break;
            case 6:
                m22404a();
                qmc.m32424a(true);
                FileApkIntentOperation.m22392a(this);
                return;
            case 7:
                qmc.m32424a(true);
                return;
            case 8:
                m22404a();
                FileApkIntentOperation.m22396a(this, cdjl.f180997a.mo6606a().mo77713s());
                if (cdjh.m133557g()) {
                    qmc.m32418a(this);
                    return;
                }
                return;
            default:
                return;
        }
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if (str != null) {
            qmc a2 = qmc.m32416a();
            Set c2 = qmc.m32430c(this);
            String action2 = intent.getAction();
            if (c2.contains(str)) {
                set = null;
                z = true;
            } else if ("android.intent.action.PACKAGE_REPLACED".equals(action2) || "android.intent.action.PACKAGE_REMOVED".equals(action2)) {
                Set b = qmc.m32429b(this);
                z = b.contains(str);
                set = b;
            } else {
                set = null;
            }
            if (z) {
                a2.mo24106a(false, false, c2, set, (Set) null);
                FileApkIntentOperation.m22392a(this);
            }
        }
    }
}
