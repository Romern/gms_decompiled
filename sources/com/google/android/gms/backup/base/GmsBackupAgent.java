package com.google.android.gms.backup.base;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.chimera.BackupAgent;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.backup.ParcelableBackupDataInput;
import com.google.android.gms.backup.ParcelableBackupDataOutput;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GmsBackupAgent extends BackupAgent {

    /* renamed from: a */
    private static final lvn f29002a = new lvn("GmsBackupAgent");

    /* renamed from: b */
    private Map f29003b;

    /* renamed from: a */
    private static final ParcelFileDescriptor m21868a(File file) {
        return ParcelFileDescriptor.open(file, 402653184);
    }

    /* renamed from: b */
    private static final ParcelFileDescriptor m21872b(File file) {
        return ParcelFileDescriptor.open(file, 1006632960);
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x01b3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01d5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01e7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01aa A[SYNTHETIC, Splitter:B:64:0x01aa] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01cc A[SYNTHETIC, Splitter:B:87:0x01cc] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01de A[SYNTHETIC, Splitter:B:99:0x01de] */
    public final void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        lum lum;
        ParcelFileDescriptor parcelFileDescriptor3;
        BackupDataOutput backupDataOutput2 = backupDataOutput;
        char c = 0;
        f29002a.mo25409a("onBackup", new Object[0]);
        if (!m21874b()) {
            f29002a.mo25409a("Disabled, not running.", new Object[0]);
            return;
        }
        this.f29003b = m21869a();
        int i = 1;
        if (parcelFileDescriptor != null) {
            List a = lst.m24353a(parcelFileDescriptor);
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                lsu lsu = (lsu) a.get(i2);
                f29002a.mo25409a("Writing module old state module=%s, state length=%d", lsu.mo19580a(), Integer.valueOf(lsu.mo19581b()));
                Files.write(m21873b(lsu.mo19580a()).toPath(), bqce.m112561a(lsu.mo19582c()), new OpenOption[0]);
            }
        }
        for (String str : this.f29003b.keySet()) {
            rex rex = new rex();
            if (!skh.m35531a().mo25690a(this, new Intent().setAction((String) this.f29003b.get(str)).setPackage("com.google.android.gms"), rex, i)) {
                lvn lvn = f29002a;
                Object[] objArr = new Object[i];
                objArr[c] = str;
                lvn.mo25418e("Unable to connect to backup agent of module %s", objArr);
            } else {
                File b = m21873b(str);
                File file = new File(getCacheDir(), String.valueOf(str).concat(".backup.data"));
                File file2 = new File(getCacheDir(), String.valueOf(str).concat(".newState"));
                try {
                    ParcelFileDescriptor a2 = m21868a(b);
                    try {
                        ParcelFileDescriptor b2 = m21872b(file);
                        try {
                            ParcelableBackupDataOutput parcelableBackupDataOutput = new ParcelableBackupDataOutput(b2);
                            try {
                                ParcelFileDescriptor b3 = m21872b(file2);
                                try {
                                    IBinder a3 = rex.mo24567a();
                                    if (a3 != null) {
                                        IInterface queryLocalInterface = a3.queryLocalInterface("com.google.android.gms.backup.IChimeraModuleBackupAgent");
                                        lum = !(queryLocalInterface instanceof lum) ? new luk(a3) : (lum) queryLocalInterface;
                                    } else {
                                        lum = null;
                                    }
                                    if (parcelFileDescriptor == null || b.length() == 0) {
                                        parcelFileDescriptor3 = null;
                                    } else {
                                        parcelFileDescriptor3 = a2;
                                    }
                                    lum.mo19611a(parcelFileDescriptor3, parcelableBackupDataOutput, b3);
                                    ParcelFileDescriptor a4 = m21868a(file);
                                    List<lsu> a5 = lst.m24353a(a4);
                                    a4.close();
                                    for (lsu lsu2 : a5) {
                                        String a6 = lsu2.mo19580a();
                                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(a6).length());
                                        sb.append(str);
                                        sb.append(";");
                                        sb.append(a6);
                                        backupDataOutput2.writeEntityHeader(sb.toString(), lsu2.mo19581b());
                                        if (lsu2.mo19581b() > 0) {
                                            backupDataOutput2.writeEntityData(bqce.m112561a(lsu2.mo19582c()), lsu2.mo19581b());
                                        }
                                    }
                                    try {
                                        m21871a(str, file2, parcelFileDescriptor2);
                                        if (b3 != null) {
                                            try {
                                                b3.close();
                                            } catch (Throwable th4) {
                                                th = th4;
                                                th2 = th;
                                                parcelableBackupDataOutput.close();
                                                throw th2;
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        th3 = th;
                                        if (b3 == null) {
                                            b3.close();
                                        }
                                        throw th3;
                                    }
                                    try {
                                        parcelableBackupDataOutput.close();
                                        if (b2 != null) {
                                            try {
                                                b2.close();
                                            } catch (Throwable th6) {
                                                th = th6;
                                                Throwable th7 = th;
                                                if (a2 == null) {
                                                    try {
                                                        a2.close();
                                                    } catch (Throwable th8) {
                                                        bqye.m113761a(th7, th8);
                                                    }
                                                }
                                                throw th7;
                                            }
                                        }
                                        if (a2 != null) {
                                            try {
                                                a2.close();
                                            } catch (RemoteException | InterruptedException e) {
                                                e = e;
                                            } catch (IOException e2) {
                                                e = e2;
                                                f29002a.mo25417e("Error during module %s backup", e, str);
                                                b.delete();
                                                file.delete();
                                                file2.delete();
                                                c = 0;
                                                i = 1;
                                            }
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        th = th;
                                        if (b2 == null) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    th3 = th;
                                    if (b3 == null) {
                                    }
                                    throw th3;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                th2 = th;
                                parcelableBackupDataOutput.close();
                                throw th2;
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            th = th;
                            if (b2 == null) {
                                b2.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        Throwable th72 = th;
                        if (a2 == null) {
                        }
                        throw th72;
                    }
                } catch (InterruptedException e3) {
                    e = e3;
                    f29002a.mo25417e("Remote exception backing up module %s", e, str);
                    b.delete();
                    file.delete();
                    file2.delete();
                    c = 0;
                    i = 1;
                } catch (RemoteException e4) {
                    e = e4;
                    f29002a.mo25417e("Remote exception backing up module %s", e, str);
                    b.delete();
                    file.delete();
                    file2.delete();
                    c = 0;
                    i = 1;
                } catch (IOException e5) {
                    e = e5;
                    f29002a.mo25417e("Error during module %s backup", e, str);
                    b.delete();
                    file.delete();
                    file2.delete();
                    c = 0;
                    i = 1;
                } catch (Throwable th14) {
                    b.delete();
                    file.delete();
                    file2.delete();
                    throw th14;
                }
                b.delete();
                file.delete();
                file2.delete();
                c = 0;
                i = 1;
            }
        }
    }

    public final void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor a;
        lum lum;
        f29002a.mo25409a("onRestore", new Object[0]);
        if (m21874b()) {
            while (backupDataInput.readNextHeader()) {
                List c = bmyx.m108643a(";").mo66921b(2).mo66925c((CharSequence) backupDataInput.getKey());
                if (c.size() < 2) {
                    f29002a.mo25418e("Failed to parse a key, skipping", new Object[0]);
                    backupDataInput.skipEntityData();
                } else {
                    String str = (String) c.get(1);
                    int dataSize = backupDataInput.getDataSize();
                    byte[] bArr = new byte[dataSize];
                    backupDataInput.readEntityData(bArr, 0, dataSize);
                    ParcelFileDescriptor open = ParcelFileDescriptor.open(m21870a((String) c.get(0)), 973078528);
                    try {
                        lst.m24354a(lsu.m24355a(str, dataSize, bArr), open);
                        if (open != null) {
                            open.close();
                        }
                    } catch (Throwable th) {
                        bqye.m113761a(th, th);
                    }
                }
            }
            bnhe a2 = m21869a();
            this.f29003b = a2;
            for (String str2 : a2.keySet()) {
                File a3 = m21870a(str2);
                if (a3.length() <= 0) {
                    f29002a.mo25409a("No data for module %s, skipping restore.", str2);
                } else {
                    rex rex = new rex();
                    if (!skh.m35531a().mo25690a(this, new Intent().setAction((String) this.f29003b.get(str2)).setPackage("com.google.android.gms"), rex, 1)) {
                        f29002a.mo25418e("Unable to connect to backup agent of module %s", str2);
                    } else {
                        File file = new File(getCacheDir(), String.valueOf(str2).concat(".newState"));
                        try {
                            ParcelFileDescriptor b = m21872b(file);
                            try {
                                a = m21868a(a3);
                                IBinder a4 = rex.mo24567a();
                                if (a4 != null) {
                                    IInterface queryLocalInterface = a4.queryLocalInterface("com.google.android.gms.backup.IChimeraModuleBackupAgent");
                                    lum = !(queryLocalInterface instanceof lum) ? new luk(a4) : (lum) queryLocalInterface;
                                } else {
                                    lum = null;
                                }
                                lum.mo19612a(new ParcelableBackupDataInput(a), i, b);
                                m21871a(str2, file, parcelFileDescriptor);
                                if (a != null) {
                                    a.close();
                                }
                                if (b != null) {
                                    b.close();
                                }
                            } catch (Throwable th2) {
                                if (b != null) {
                                    b.close();
                                }
                                throw th2;
                            }
                        } catch (InterruptedException e) {
                            e = e;
                        } catch (RemoteException e2) {
                            e = e2;
                        } catch (IOException e3) {
                            try {
                                f29002a.mo25417e("Error during module %s restore", e3, str2);
                            } catch (Throwable th3) {
                                file.delete();
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            bqye.m113761a(th2, th4);
                        }
                        file.delete();
                    }
                }
                a3.delete();
            }
            return;
        }
        f29002a.mo25409a("Disabled, not running.", new Object[0]);
        return;
        f29002a.mo25417e("Remote exception restoring module %s", e, str2);
        file.delete();
        a3.delete();
        throw th;
        throw th;
    }

    /* renamed from: a */
    private final bnhe m21869a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            for (ModuleManager.ModuleInfo moduleInfo : ModuleManager.get(this).getAllModulesWithMetadata("ChimeraModuleBackupAgent")) {
                String str = moduleInfo.moduleId;
                if (!ccmh.f179446a.mo6606a().mo76373b().contains(str)) {
                    f29002a.mo25416d("Module %s wants to back up, but is not whitelisted, skipping.", str);
                } else {
                    String string = moduleInfo.getMetadata(this).getString("ChimeraModuleBackupAgent");
                    if (string != null) {
                        linkedHashMap.put(str, string);
                        f29002a.mo25409a("Found action %s in module %s", string, str);
                    } else {
                        f29002a.mo25418e("Empty backup agent metadata in module %s", str);
                    }
                }
            }
        } catch (InvalidConfigException e) {
            f29002a.mo25417e("Failed to load module configuration", e, new Object[0]);
        }
        return bnhe.m109413a(linkedHashMap);
    }

    /* renamed from: b */
    private final File m21873b(String str) {
        return new File(getFilesDir(), String.valueOf(str).concat(".oldState"));
    }

    /* renamed from: b */
    private static final boolean m21874b() {
        return ((long) Build.VERSION.SDK_INT) >= ccmh.f179446a.mo6606a().mo76376e();
    }

    /* renamed from: a */
    private final File m21870a(String str) {
        return new File(getCacheDir(), String.valueOf(str).concat(".restore.data"));
    }

    /* renamed from: a */
    private static final void m21871a(String str, File file, ParcelFileDescriptor parcelFileDescriptor) {
        if (file.length() != 0) {
            lst.m24354a(lsu.m24355a(str, (int) file.length(), Files.readAllBytes(file.toPath())), parcelFileDescriptor);
        }
    }
}
