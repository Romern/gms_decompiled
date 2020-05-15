package com.google.android.gms.carsetup.frx;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Parcelable;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;
import com.google.android.gms.carsetup.fsm.impl.ActivityResult;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.zip.ZipFile;

@oxx(mo22769a = {@oxw(mo22764a = "EVENT_CAR_STARTED_MOVING", mo22765b = SetupFsm$CarMovingState.class), @oxw(mo22764a = "EVENT_ERROR", mo22765b = SetupFsm$ErrorState.class, mo22766c = SetupFsm$InstallingAppsState.class), @oxw(mo22764a = "EVENT_CAR_DISCONNECTED", mo22765b = SetupFsm$SetupFailedState.class, mo22766c = SetupFsm$InstallingAppsState.class), @oxw(mo22764a = "EVENT_APPLICATIONS_UP_TO_DATE", mo22765b = SetupFsm$StartCarService.class, mo22766c = SetupFsm$InstallingAppsState.class), @oxw(mo22764a = "EVENT_APPLICATION_INSTALLATION_FAILED", mo22765b = SetupFsm$ErrorState.class, mo22766c = SetupFsm$InstallingAppsState.class)})
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupFsm$InstallingAppsState extends oxv {

    /* renamed from: a */
    public int f29656a;

    /* renamed from: d */
    private boolean f29657d;

    /* renamed from: e */
    private boolean f29658e;

    /* renamed from: f */
    private BroadcastReceiver f29659f;

    /* renamed from: g */
    private BroadcastReceiver f29660g;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e4  */
    /* renamed from: a */
    private final int m22211a(Context context, String str) {
        File file;
        ZipFile zipFile;
        FileOutputStream fileOutputStream;
        InputStream inputStream = null;
        try {
            AssetManager assets = context.getAssets();
            String valueOf = String.valueOf(str);
            InputStream open = assets.open(valueOf.length() == 0 ? new String("chimera-modules/") : "chimera-modules/".concat(valueOf));
            try {
                file = File.createTempFile(str.replace('.', '_'), null, this.f38586b.getFilesDir());
            } catch (Throwable th) {
                fileOutputStream = null;
                zipFile = null;
                inputStream = open;
                th = th;
                file = null;
                m22212a(inputStream);
                m22212a(fileOutputStream);
                m22212a(zipFile);
                if (file != null) {
                }
                throw th;
            }
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    boav.m111013a(open, fileOutputStream);
                    zipFile = new ZipFile(file);
                } catch (Throwable th2) {
                    inputStream = open;
                    th = th2;
                    zipFile = null;
                    m22212a(inputStream);
                    m22212a(fileOutputStream);
                    m22212a(zipFile);
                    if (file != null) {
                        file.delete();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                zipFile = null;
                inputStream = open;
                th = th3;
                fileOutputStream = null;
                m22212a(inputStream);
                m22212a(fileOutputStream);
                m22212a(zipFile);
                if (file != null) {
                }
                throw th;
            }
            try {
                InputStream inputStream2 = zipFile.getInputStream(zipFile.getEntry("assets/ChimeraManifest.pb"));
                ByteBuffer allocate = ByteBuffer.allocate(4);
                m22213a(inputStream2, allocate.array());
                allocate.order(ByteOrder.BIG_ENDIAN);
                byte[] bArr = new byte[allocate.getInt()];
                m22213a(inputStream2, bArr);
                for (dmn dmn : ((dmj) bxvk.m124014a(dmj.f13537b, bArr)).f13539a) {
                    if ("com.google.android.gms.car".equals(dmn.f13552b)) {
                        int i = dmn.f13554d;
                        m22212a(open);
                        m22212a(fileOutputStream);
                        m22212a(zipFile);
                        if (file != null) {
                            file.delete();
                        }
                        return i;
                    }
                }
                m22212a(open);
                m22212a(fileOutputStream);
                m22212a(zipFile);
                if (file != null) {
                    file.delete();
                }
                bnsi d = oxj.f38565a.mo68390d();
                d.mo68432a("com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState", "a", 1021, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68405a("Did not find car module");
                return -1;
            } catch (Throwable th4) {
                inputStream = open;
                th = th4;
                m22212a(inputStream);
                m22212a(fileOutputStream);
                m22212a(zipFile);
                if (file != null) {
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            file = null;
            fileOutputStream = null;
            zipFile = null;
            m22212a(inputStream);
            m22212a(fileOutputStream);
            m22212a(zipFile);
            if (file != null) {
            }
            throw th;
        }
    }

    /* renamed from: e */
    private final boolean m22214e() {
        Intent j = ((oxk) this.f38587c.f38582k).mo22680j();
        if (j != null) {
            if (oyi.m29997a(j) && !this.f29658e) {
                this.f29658e = true;
                this.f29659f = new TracingBroadcastReceiver("car_setup") {
                    /* class com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState.C15621 */

                    /* renamed from: a */
                    public final void mo6253a(Context context, Intent intent) {
                        bnsn bnsn = oxj.f38565a;
                        int d = SetupFsm$InstallingAppsState.this.mo17462d();
                        SetupFsm$InstallingAppsState setupFsm$InstallingAppsState = SetupFsm$InstallingAppsState.this;
                        if (d >= setupFsm$InstallingAppsState.f29656a) {
                            setupFsm$InstallingAppsState.mo17460b();
                        }
                    }
                };
                this.f29660g = new TracingBroadcastReceiver("car_setup") {
                    /* class com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState.C15632 */

                    /* renamed from: a */
                    public final void mo6253a(Context context, Intent intent) {
                        bnsn bnsn = oxj.f38565a;
                        if ("com.google.android.projection.gearhead".equals(intent.getData().getSchemeSpecificPart())) {
                            ExecutorService a = nzh.m28223a();
                            a.execute(new oxi(this));
                            a.shutdown();
                        }
                    }
                };
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.chimera.MODULE_CONFIGURATION_CHANGED");
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter2.addDataScheme("package");
                this.f38586b.registerReceiver(this.f29659f, intentFilter);
                this.f38586b.registerReceiver(this.f29660g, intentFilter2);
            }
            if (j.resolveActivity(this.f38586b.getPackageManager()) != null) {
                this.f38587c.mo22749a(j);
            } else {
                this.f38587c.mo22754a("EVENT_ERROR");
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final int mo17457a() {
        return 7;
    }

    /* renamed from: b */
    public final void mo17460b() {
        if (this.f29658e) {
            this.f38586b.unregisterReceiver(this.f29659f);
            this.f38586b.unregisterReceiver(this.f29660g);
            this.f29658e = false;
            if (this.f29657d) {
                this.f38587c.mo22754a("EVENT_APPLICATIONS_UP_TO_DATE");
            }
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: java.util.zip.ZipFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cb, code lost:
        r0 = r5.f13554d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        m22212a(r6);
        m22212a(r14);
        m22212a(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d6, code lost:
        if (r11 == null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d8, code lost:
        r11.delete();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0128 A[Catch:{ IOException -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0157 A[Catch:{ NameNotFoundException -> 0x0171 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: c */
    public final boolean mo17461c() {
        int i;
        int i2;
        Context context;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        File file;
        FileOutputStream fileOutputStream3;
        ZipFile zipFile;
        int i3;
        try {
            Context createPackageContext = this.f38586b.createPackageContext("com.google.android.projection.gearhead", 0);
            try {
                String[] list = createPackageContext.getAssets().list("chimera-modules");
                int length = list.length;
                int i4 = 0;
                i = -1;
                while (i4 < length) {
                    try {
                        String str = list[i4];
                        if (!str.endsWith(".apk")) {
                            context = createPackageContext;
                        } else {
                            bnsi d = oxj.f38565a.mo68390d();
                            d.mo68432a("com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState", "c", 958, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            d.mo68420a("Checking apk asset %s", str);
                            InputStream inputStream = null;
                            try {
                                AssetManager assets = createPackageContext.getAssets();
                                String valueOf = String.valueOf(str);
                                InputStream open = assets.open(valueOf.length() == 0 ? new String("chimera-modules/") : "chimera-modules/".concat(valueOf));
                                try {
                                    file = File.createTempFile(str.replace('.', '_'), null, this.f38586b.getFilesDir());
                                } catch (Throwable th) {
                                    th = th;
                                    file = null;
                                    fileOutputStream2 = null;
                                    fileOutputStream3 = fileOutputStream2;
                                    inputStream = open;
                                    fileOutputStream = fileOutputStream3;
                                    m22212a(inputStream);
                                    m22212a(fileOutputStream2);
                                    m22212a(fileOutputStream);
                                    if (file != null) {
                                    }
                                    throw th;
                                }
                                try {
                                    fileOutputStream2 = new FileOutputStream(file);
                                    try {
                                        boav.m111013a(open, fileOutputStream2);
                                        zipFile = new ZipFile(file);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileOutputStream3 = null;
                                        inputStream = open;
                                        fileOutputStream = fileOutputStream3;
                                        m22212a(inputStream);
                                        m22212a(fileOutputStream2);
                                        m22212a(fileOutputStream);
                                        if (file != null) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    fileOutputStream2 = null;
                                    fileOutputStream3 = fileOutputStream2;
                                    inputStream = open;
                                    fileOutputStream = fileOutputStream3;
                                    m22212a(inputStream);
                                    m22212a(fileOutputStream2);
                                    m22212a(fileOutputStream);
                                    if (file != null) {
                                        file.delete();
                                    }
                                    throw th;
                                }
                                try {
                                    InputStream inputStream2 = zipFile.getInputStream(zipFile.getEntry("assets/ChimeraManifest.pb"));
                                    ByteBuffer allocate = ByteBuffer.allocate(4);
                                    context = createPackageContext;
                                    m22213a(inputStream2, allocate.array());
                                    allocate.order(ByteOrder.BIG_ENDIAN);
                                    byte[] bArr = new byte[allocate.getInt()];
                                    m22213a(inputStream2, bArr);
                                    Iterator it = ((dmj) bxvk.m124014a(dmj.f13537b, bArr)).f13539a.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            dmn dmn = (dmn) it.next();
                                            Iterator it2 = it;
                                            if ("com.google.android.gms.car".equals(dmn.f13552b)) {
                                                break;
                                            }
                                            it = it2;
                                        } else {
                                            m22212a(open);
                                            m22212a(fileOutputStream2);
                                            m22212a(zipFile);
                                            if (file != null) {
                                                file.delete();
                                            }
                                            bnsi d2 = oxj.f38565a.mo68390d();
                                            d2.mo68432a("com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState", "a", 1021, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            d2.mo68405a("Did not find car module");
                                            i3 = -1;
                                        }
                                    }
                                    i = Math.max(i, i3);
                                } catch (Throwable th4) {
                                    th = th4;
                                    fileOutputStream3 = zipFile;
                                    inputStream = open;
                                    fileOutputStream = fileOutputStream3;
                                    m22212a(inputStream);
                                    m22212a(fileOutputStream2);
                                    m22212a(fileOutputStream);
                                    if (file != null) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                file = null;
                                fileOutputStream2 = null;
                                fileOutputStream = null;
                                m22212a(inputStream);
                                m22212a(fileOutputStream2);
                                m22212a(fileOutputStream);
                                if (file != null) {
                                }
                                throw th;
                            }
                        }
                        i4++;
                        createPackageContext = context;
                    } catch (IOException e) {
                        e = e;
                        i2 = i;
                        bnsi c = oxj.f38565a.mo68388c();
                        c.mo68437a(e);
                        c.mo68432a("com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState", "c", 964, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c.mo68405a("Failed to search assets");
                        i = i2;
                        bnsi d3 = oxj.f38565a.mo68390d();
                        d3.mo68432a("com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState", "c", 966, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d3.mo68409a("Found module version %d", i);
                        return i > 0 ? false : false;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                i2 = -1;
                bnsi c2 = oxj.f38565a.mo68388c();
                c2.mo68437a(e);
                c2.mo68432a("com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState", "c", 964, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c2.mo68405a("Failed to search assets");
                i = i2;
                bnsi d32 = oxj.f38565a.mo68390d();
                d32.mo68432a("com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState", "c", 966, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d32.mo68409a("Found module version %d", i);
                if (i > 0) {
                }
            }
            bnsi d322 = oxj.f38565a.mo68390d();
            d322.mo68432a("com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState", "c", 966, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d322.mo68409a("Found module version %d", i);
            if (i > 0 && i >= mo17462d()) {
                bnsi d4 = oxj.f38565a.mo68390d();
                d4.mo68432a("com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState", "c", 968, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d4.mo68405a("APK does contain newer chimera");
                this.f29656a = i;
                return true;
            }
        } catch (PackageManager.NameNotFoundException e3) {
            bnsi b = oxj.f38565a.mo68387b();
            b.mo68437a(e3);
            b.mo68432a("com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState", "c", 973, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Error checking other package");
            return false;
        }
    }

    /* renamed from: d */
    public final int mo17462d() {
        return nyx.m28210a(this.f38586b, "com.google.android.gms.car");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: oxr.a(java.lang.String, android.os.Parcelable):void
     arg types: [java.lang.String, android.os.Bundle]
     candidates:
      oxr.a(java.lang.String, java.lang.Object):void
      oxr.a(java.lang.String, android.os.Parcelable):void */
    /* renamed from: b */
    public final boolean mo17459b(String str, Object obj) {
        Fragment fragment;
        if ("EVENT_APPLICATION_INSTALLATION_UPDATE".equals(str) || "EVENT_APPLICATION_INSTALLED".equals(str)) {
            oxt oxt = this.f38587c.f38580i;
            if (oxt != null) {
                fragment = oxt.mo17456i();
            } else {
                fragment = null;
            }
            if (fragment != null && (fragment instanceof owx)) {
                ((owx) fragment).mo22729a();
            }
        } else if ("EVENT_ACTIVITY_RESULT".equals(str)) {
            if (obj != null && ((ActivityResult) obj).f29663a == 0) {
                Bundle bundle = new Bundle();
                bundle.putString("errorTitle", this.f38586b.getString(C0126R.string.common_something_went_wrong));
                oye g = ((oxk) this.f38587c.f38582k).mo22677g();
                Context context = this.f38586b;
                bundle.putString("errorMessage", context.getString(C0126R.string.car_frx_apps_installation_aborted_message, oyi.m29996a(context, g)));
                this.f38587c.mo22755a("EVENT_APPLICATION_INSTALLATION_FAILED", (Parcelable) bundle);
                oxr oxr = this.f38587c;
                bxvd da = bped.f137237x.mo74144da();
                int i = bpeb.FRX_INSTALL_APPS.f137221cE;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bped bped = (bped) da.f164949b;
                bped.f137239a |= 1;
                bped.f137240b = i;
                int i2 = bpea.FRX_DOWNLOAD_FAILED_CANCEL.f137033jW;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bped bped2 = (bped) da.f164949b;
                bped2.f137239a |= 2;
                bped2.f137241c = i2;
                oxr.mo22750a((bped) da.mo74062i());
            }
            return true;
        }
        if ("EVENT_APPLICATION_INSTALLED".equals(str)) {
            m22214e();
            oxr oxr2 = this.f38587c;
            bxvd da2 = bped.f137237x.mo74144da();
            int i3 = bpeb.FRX_INSTALL_APPS.f137221cE;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bped bped3 = (bped) da2.f164949b;
            bped3.f137239a |= 1;
            bped3.f137240b = i3;
            int i4 = bpea.FRX_DOWNLOAD_MULTIPLE.f137033jW;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bped bped4 = (bped) da2.f164949b;
            bped4.f137239a |= 2;
            bped4.f137241c = i4;
            oxr2.mo22750a((bped) da2.mo74062i());
            return true;
        }
        if ("EVENT_APPLICATIONS_UP_TO_DATE".equals(str)) {
            if (!((oxk) this.f38587c.f38582k).mo22676f()) {
                bnsi c = oxj.f38565a.mo68388c();
                c.mo68432a("com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState", "b", 823, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Got event that applications are updated, but failed verification");
            }
            if (this.f29658e) {
                this.f29657d = true;
                return true;
            }
        }
        if (!"EVENT_CAR_STARTED_MOVING".equals(str)) {
            mo17460b();
        }
        return !"EVENT_CAR_STARTED_MOVING".equals(str) && !"EVENT_ERROR".equals(str) && !"EVENT_CAR_DISCONNECTED".equals(str) && !"EVENT_APPLICATIONS_UP_TO_DATE".equals(str) && !"EVENT_APPLICATION_INSTALLATION_FAILED".equals(str);
    }

    /* renamed from: a */
    public static void m22212a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public static void m22213a(InputStream inputStream, byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            int read = inputStream.read(bArr, i, length - i);
            if (read <= 0) {
                break;
            }
            i += read;
        }
        if (i < length) {
            throw new IOException("Manifest underflow");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: oxr.a(java.lang.Class, android.os.Bundle, boolean):void
     arg types: [java.lang.Class, android.os.Bundle, int]
     candidates:
      oxr.a(java.lang.Class, java.lang.String, android.os.Parcelable):void
      oxr.a(oxv, oxv, java.lang.String):void
      oxr.a(java.lang.Class, android.os.Bundle, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: oxr.a(java.lang.String, android.os.Parcelable):void
     arg types: [java.lang.String, android.os.Bundle]
     candidates:
      oxr.a(java.lang.String, java.lang.Object):void
      oxr.a(java.lang.String, android.os.Parcelable):void */
    /* renamed from: a */
    public final void mo17458a(String str, Object obj) {
        oxk oxk = (oxk) this.f38587c.f38582k;
        if ("EVENT_CAR_PARKED".equals(str)) {
            if (oxk.mo22676f()) {
                this.f38587c.mo22754a("EVENT_APPLICATIONS_UP_TO_DATE");
            } else if (m22214e()) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("installation_allowed", true);
                this.f38587c.mo22752a(owx.class, bundle, true);
            }
        } else if (oxk.mo22678h()) {
            oxk.mo22679i();
            if (m22214e()) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("installation_allowed", true);
                this.f38587c.mo22752a(owx.class, bundle2, true);
            }
        } else {
            Bundle bundle3 = new Bundle();
            bundle3.putString("errorTitle", this.f38586b.getString(C0126R.string.car_frx_no_connection_title));
            bundle3.putString("errorMessage", this.f38586b.getString(C0126R.string.car_frx_no_connection_message));
            this.f38587c.mo22755a("EVENT_APPLICATION_INSTALLATION_FAILED", (Parcelable) bundle3);
            oxr oxr = this.f38587c;
            bxvd da = bped.f137237x.mo74144da();
            int i = bpeb.FRX_INSTALL_APPS.f137221cE;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bped bped = (bped) da.f164949b;
            bped.f137239a = 1 | bped.f137239a;
            bped.f137240b = i;
            int i2 = bpea.FRX_DOWNLOAD_FAILED_NETWORK.f137033jW;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bped bped2 = (bped) da.f164949b;
            bped2.f137239a |= 2;
            bped2.f137241c = i2;
            oxr.mo22750a((bped) da.mo74062i());
        }
    }
}
