package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.zip.ZipFile;

/* renamed from: oxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oxi implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SetupFsm$InstallingAppsState.C15632 f38564a;

    public oxi(SetupFsm$InstallingAppsState.C15632 r1) {
        this.f38564a = r1;
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
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d2, code lost:
        r0 = r8.f13554d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState.m22212a(r6);
        com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState.m22212a(r14);
        com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState.m22212a(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00dd, code lost:
        if (r11 == null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00df, code lost:
        r11.delete();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0130 A[Catch:{ IOException -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x015f A[Catch:{ NameNotFoundException -> 0x0179 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0160 A[Catch:{ NameNotFoundException -> 0x0179 }] */
    public final void run() {
        int i;
        int i2;
        Context context;
        String[] strArr;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        File file;
        FileOutputStream fileOutputStream3;
        ZipFile zipFile;
        int i3;
        SetupFsm$InstallingAppsState setupFsm$InstallingAppsState = SetupFsm$InstallingAppsState.this;
        try {
            int i4 = 0;
            Context createPackageContext = setupFsm$InstallingAppsState.f38586b.createPackageContext("com.google.android.projection.gearhead", 0);
            try {
                String[] list = createPackageContext.getAssets().list("chimera-modules");
                int length = list.length;
                i = -1;
                while (i4 < length) {
                    try {
                        String str = list[i4];
                        if (!str.endsWith(".apk")) {
                            context = createPackageContext;
                            strArr = list;
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
                                    file = File.createTempFile(str.replace('.', '_'), null, setupFsm$InstallingAppsState.f38586b.getFilesDir());
                                } catch (Throwable th) {
                                    th = th;
                                    file = null;
                                    fileOutputStream2 = null;
                                    fileOutputStream3 = fileOutputStream2;
                                    inputStream = open;
                                    fileOutputStream = fileOutputStream3;
                                    SetupFsm$InstallingAppsState.m22212a(inputStream);
                                    SetupFsm$InstallingAppsState.m22212a(fileOutputStream2);
                                    SetupFsm$InstallingAppsState.m22212a(fileOutputStream);
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
                                        SetupFsm$InstallingAppsState.m22212a(inputStream);
                                        SetupFsm$InstallingAppsState.m22212a(fileOutputStream2);
                                        SetupFsm$InstallingAppsState.m22212a(fileOutputStream);
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
                                    SetupFsm$InstallingAppsState.m22212a(inputStream);
                                    SetupFsm$InstallingAppsState.m22212a(fileOutputStream2);
                                    SetupFsm$InstallingAppsState.m22212a(fileOutputStream);
                                    if (file != null) {
                                    }
                                    throw th;
                                }
                                try {
                                    InputStream inputStream2 = zipFile.getInputStream(zipFile.getEntry("assets/ChimeraManifest.pb"));
                                    context = createPackageContext;
                                    ByteBuffer allocate = ByteBuffer.allocate(4);
                                    strArr = list;
                                    SetupFsm$InstallingAppsState.m22213a(inputStream2, allocate.array());
                                    allocate.order(ByteOrder.BIG_ENDIAN);
                                    byte[] bArr = new byte[allocate.getInt()];
                                    SetupFsm$InstallingAppsState.m22213a(inputStream2, bArr);
                                    Iterator it = ((dmj) GeneratedMessageLite.m124014a(dmj.f13537b, bArr)).f13539a.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            dmn dmn = (dmn) it.next();
                                            Iterator it2 = it;
                                            if ("com.google.android.gms.car".equals(dmn.f13552b)) {
                                                break;
                                            }
                                            it = it2;
                                        } else {
                                            SetupFsm$InstallingAppsState.m22212a(open);
                                            SetupFsm$InstallingAppsState.m22212a(fileOutputStream2);
                                            SetupFsm$InstallingAppsState.m22212a(zipFile);
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
                                    SetupFsm$InstallingAppsState.m22212a(inputStream);
                                    SetupFsm$InstallingAppsState.m22212a(fileOutputStream2);
                                    SetupFsm$InstallingAppsState.m22212a(fileOutputStream);
                                    if (file != null) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                file = null;
                                fileOutputStream2 = null;
                                fileOutputStream = null;
                                SetupFsm$InstallingAppsState.m22212a(inputStream);
                                SetupFsm$InstallingAppsState.m22212a(fileOutputStream2);
                                SetupFsm$InstallingAppsState.m22212a(fileOutputStream);
                                if (file != null) {
                                    file.delete();
                                }
                                throw th;
                            }
                        }
                        i4++;
                        list = strArr;
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
                        if (i > 0) {
                        }
                        nuu.m27792a(new oxh(this));
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
                nuu.m27792a(new oxh(this));
            }
            bnsi d322 = oxj.f38565a.mo68390d();
            d322.mo68432a("com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState", "c", 966, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d322.mo68409a("Found module version %d", i);
            if (i > 0) {
                if (i >= setupFsm$InstallingAppsState.mo17462d()) {
                    bnsi d4 = oxj.f38565a.mo68390d();
                    d4.mo68432a("com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState", "c", 968, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d4.mo68405a("APK does contain newer chimera");
                    setupFsm$InstallingAppsState.f29656a = i;
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException e3) {
            bnsi b = oxj.f38565a.mo68387b();
            b.mo68437a(e3);
            b.mo68432a("com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState", "c", 973, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Error checking other package");
        }
        nuu.m27792a(new oxh(this));
    }
}
