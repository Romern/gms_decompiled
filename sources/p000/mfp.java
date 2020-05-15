package p000;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.BackupTransport;
import android.app.backup.RestoreDescription;
import android.app.backup.RestoreSet;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import com.felicanetworks.mfc.C0126R;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: mfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mfp extends BackupTransport {

    /* renamed from: a */
    public static final lvn f33586a = new lvn("D2dTransport");

    /* renamed from: b */
    public final Context f33587b;

    /* renamed from: c */
    public final mcb f33588c;

    /* renamed from: d */
    private ParcelFileDescriptor f33589d;

    /* renamed from: e */
    private BufferedInputStream f33590e;

    /* renamed from: f */
    private BufferedOutputStream f33591f;

    /* renamed from: g */
    private byte[] f33592g;

    /* renamed from: h */
    private long f33593h;

    /* renamed from: i */
    private long f33594i;

    /* renamed from: j */
    private final mfo f33595j = new mfo(this);

    public mfp(Context context) {
        this.f33587b = context;
        this.f33588c = new mcb(context);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private final int m24966a() {
        if (this.f33589d != null) {
            try {
                BufferedOutputStream bufferedOutputStream = this.f33591f;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                this.f33590e.close();
                this.f33589d.close();
                srz.m36171a((Closeable) this.f33590e);
                srz.m36170a(this.f33589d);
                this.f33589d = null;
                this.f33590e = null;
                this.f33591f = null;
            } catch (IOException e) {
                f33586a.mo25415d("Exception caught in tearDownFullBackup()", e, new Object[0]);
                srz.m36171a((Closeable) this.f33590e);
                srz.m36170a(this.f33589d);
                this.f33589d = null;
                this.f33590e = null;
                this.f33591f = null;
                return -1000;
            } catch (Throwable th) {
                srz.m36171a((Closeable) this.f33590e);
                srz.m36170a(this.f33589d);
                this.f33589d = null;
                this.f33590e = null;
                this.f33591f = null;
                throw th;
            }
        }
        return 0;
    }

    public final int abortFullRestore() {
        return 0;
    }

    /* renamed from: b */
    public final File mo19922b(String str) {
        return this.f33588c.mo19845a(str);
    }

    public final void cancelFullBackup() {
        lvn lvn = f33586a;
        String valueOf = String.valueOf(this.f33595j.f33583b);
        lvn.mo25414c(valueOf.length() == 0 ? new String("Canceling full backup of ") : "Canceling full backup of ".concat(valueOf), new Object[0]);
        File b = mo19922b(this.f33595j.f33583b);
        m24966a();
        b.delete();
        mfo mfo = this.f33595j;
        mfo.f33584c = 5;
        mfo.mo19917a();
    }

    public final int checkFullBackupSize(long j) {
        int i = -1002;
        if (j <= 0) {
            this.f33595j.f33584c = 6;
        } else if (j > 157286400) {
            this.f33595j.f33584c = 7;
        } else {
            i = 0;
        }
        if (i != 0) {
            lvn lvn = f33586a;
            StringBuilder sb = new StringBuilder(45);
            sb.append("Declining backup of size ");
            sb.append(j);
            lvn.mo25412b(sb.toString(), new Object[0]);
        }
        return i;
    }

    public final int clearBackupData(PackageInfo packageInfo) {
        lvn lvn = f33586a;
        String valueOf = String.valueOf(packageInfo.packageName);
        lvn.mo25412b(valueOf.length() == 0 ? new String("clearBackupData() pkg=") : "clearBackupData() pkg=".concat(valueOf), new Object[0]);
        mfo mfo = this.f33595j;
        String str = packageInfo.packageName;
        if (mfo.f33582a != 0) {
            f33586a.mo25418e("Movement to illegal state clearData.", new Object[0]);
        }
        mfo.mo19918a(2);
        mfo.f33583b = str;
        mo19922b(packageInfo.packageName).delete();
        return 0;
    }

    public final String currentDestinationString() {
        return cckw.f179263a.mo6606a().mo76233W() ? this.f33587b.getString(C0126R.string.backup_destination_d2d) : "Moving data to new device";
    }

    public final String dataManagementLabel() {
        return "";
    }

    public final int finishBackup() {
        f33586a.mo25412b("backup finished", new Object[0]);
        int a = m24966a();
        if (a == -1000) {
            mfo mfo = this.f33595j;
            if (mfo.f33584c == 0) {
                mfo.f33584c = 4;
            }
        }
        this.f33595j.mo19917a();
        return a;
    }

    public final RestoreSet[] getAvailableRestoreSets() {
        f33586a.mo25416d("List of available restore sets requested. Unsupported operation.", new Object[0]);
        return new RestoreSet[]{new RestoreSet("D2D Restore Set", "D2dTransport", spn.getAndroidId(this.f33587b))};
    }

    public final long getCurrentRestoreSet() {
        f33586a.mo25416d("Current restore set requested.", new Object[0]);
        return spn.getAndroidId(this.f33587b);
    }

    public final int getNextFullRestoreDataChunk(ParcelFileDescriptor parcelFileDescriptor) {
        f33586a.mo25416d("Can't restore from D2d Transport.", new Object[0]);
        return -1000;
    }

    public final int getRestoreData(ParcelFileDescriptor parcelFileDescriptor) {
        f33586a.mo25416d("Can't restore from D2d Transport.", new Object[0]);
        return -1000;
    }

    public final int getTransportFlags() {
        return 2;
    }

    public final int initializeDevice() {
        f33586a.mo25412b("wiping all data", new Object[0]);
        srj.m36120a(this.f33588c.f33396a);
        this.f33588c.mo19846a();
        mfo mfo = this.f33595j;
        if (mfo.f33582a != 0) {
            f33586a.mo25418e("Movement to illegal state initializeDevice.", new Object[0]);
        }
        mfo.mo19918a(3);
        this.f33595j.mo19917a();
        return 0;
    }

    public final String name() {
        return "com.google.android.gms/.backup.migrate.service.D2dTransport";
    }

    public final RestoreDescription nextRestorePackage() {
        f33586a.mo25416d("Can't restore from D2d Transport.", new Object[0]);
        return RestoreDescription.NO_MORE_PACKAGES;
    }

    public final int performBackup(PackageInfo packageInfo, ParcelFileDescriptor parcelFileDescriptor) {
        this.f33595j.mo19919a(packageInfo.packageName);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(mo19922b(packageInfo.packageName));
            try {
                BackupDataInput backupDataInput = new BackupDataInput(parcelFileDescriptor.getFileDescriptor());
                BackupDataOutput backupDataOutput = new BackupDataOutput(fileOutputStream2.getFD());
                byte[] bArr = new byte[1048576];
                while (backupDataInput.readNextHeader()) {
                    String key = backupDataInput.getKey();
                    int dataSize = backupDataInput.getDataSize();
                    if (dataSize < 0) {
                        f33586a.logVerbose("Skipping negative data size key: %s", key);
                        backupDataInput.skipEntityData();
                    } else if (!packageInfo.packageName.equals("com.android.providers.settings") || !"network_policies".equals(key) || cckw.f179263a.mo6606a().mo76260y()) {
                        backupDataOutput.writeEntityHeader(key, dataSize);
                        do {
                            int readEntityData = backupDataInput.readEntityData(bArr, 0, 1048576);
                            dataSize -= readEntityData;
                            backupDataOutput.writeEntityData(bArr, readEntityData);
                        } while (dataSize > 0);
                    } else {
                        f33586a.mo25414c("Skipping %s key for %s", "network_policies", "com.android.providers.settings");
                        backupDataInput.skipEntityData();
                    }
                }
                srz.m36171a(fileOutputStream2);
                return 0;
            } catch (IOException e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                try {
                    f33586a.mo25417e("Error storing backup data.", e, new Object[0]);
                    mfo mfo = this.f33595j;
                    mfo.f33584c = 2;
                    mfo.mo19917a();
                    srz.m36171a(fileOutputStream);
                    return -1000;
                } catch (Throwable th) {
                    th = th;
                    srz.m36171a(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                srz.m36171a(fileOutputStream);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            f33586a.mo25417e("Error storing backup data.", e, new Object[0]);
            mfo mfo2 = this.f33595j;
            mfo2.f33584c = 2;
            mfo2.mo19917a();
            srz.m36171a(fileOutputStream);
            return -1000;
        } catch (Throwable th3) {
            th = th3;
            srz.m36171a(fileOutputStream);
            throw th;
        }
    }

    public final int performFullBackup(PackageInfo packageInfo, ParcelFileDescriptor parcelFileDescriptor) {
        if (this.f33589d != null) {
            if (SystemClock.elapsedRealtime() - this.f33594i > 300000) {
                f33586a.mo25416d("Clearing old full backup state after timeout.", new Object[0]);
                m24966a();
            } else {
                f33586a.mo25416d("Attempt to initiate full backup while one is in progress", new Object[0]);
                return -1000;
            }
        }
        this.f33594i = SystemClock.elapsedRealtime();
        this.f33595j.mo19919a(packageInfo.packageName);
        lvn lvn = f33586a;
        String valueOf = String.valueOf(packageInfo);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("performFullBackup : ");
        sb.append(valueOf);
        lvn.mo25414c(sb.toString(), new Object[0]);
        this.f33589d = parcelFileDescriptor;
        this.f33590e = new BufferedInputStream(new FileInputStream(this.f33589d.getFileDescriptor()));
        this.f33592g = new byte[8192];
        this.f33593h = 0;
        return 0;
    }

    public final long requestBackupTime() {
        return 0;
    }

    public final long requestFullBackupTime() {
        return 0;
    }

    public final int sendBackupData(int i) {
        if (this.f33589d != null) {
            long j = this.f33593h + ((long) i);
            this.f33593h = j;
            if (j > 157286400) {
                lvn lvn = f33586a;
                String valueOf = String.valueOf(this.f33595j.f33583b);
                lvn.mo25416d(valueOf.length() == 0 ? new String("Full backup size limit exceeded, pkg: ") : "Full backup size limit exceeded, pkg: ".concat(valueOf), new Object[0]);
                this.f33595j.f33584c = 7;
                return -1000;
            }
            if (i > this.f33592g.length) {
                this.f33592g = new byte[i];
            }
            if (this.f33591f == null) {
                try {
                    this.f33591f = new BufferedOutputStream(new FileOutputStream(mo19922b(this.f33595j.f33583b)));
                } catch (FileNotFoundException e) {
                    lvn lvn2 = f33586a;
                    String valueOf2 = String.valueOf(e.getMessage());
                    lvn2.mo25418e(valueOf2.length() == 0 ? new String("sendBackupData: ") : "sendBackupData: ".concat(valueOf2), new Object[0]);
                    this.f33595j.f33584c = 2;
                    return -1000;
                }
            }
            while (i > 0) {
                try {
                    int read = this.f33590e.read(this.f33592g, 0, i);
                    if (read < 0) {
                        f33586a.mo25416d("Unexpected EOD; failing backup", new Object[0]);
                        this.f33595j.f33584c = 3;
                        return -1000;
                    }
                    this.f33591f.write(this.f33592g, 0, read);
                    i -= read;
                } catch (IOException e2) {
                    lvn lvn3 = f33586a;
                    String valueOf3 = String.valueOf(this.f33595j.f33583b);
                    lvn3.mo25418e(valueOf3.length() == 0 ? new String("Error handling backup data for ") : "Error handling backup data for ".concat(valueOf3), new Object[0]);
                    f33586a.mo25418e(e2.getMessage(), new Object[0]);
                    this.f33595j.f33584c = 2;
                    return -1000;
                }
            }
            return 0;
        }
        f33586a.mo25416d("Attempted sendBackupData before performFullBackup", new Object[0]);
        return -1000;
    }

    public final int startRestore(long j, PackageInfo[] packageInfoArr) {
        f33586a.mo25416d("Can't restore from D2d Transport.", new Object[0]);
        return -1000;
    }

    public final String transportDirName() {
        return "d2dMigrateTransport";
    }

    /* renamed from: a */
    public final File mo19920a(String str) {
        return new File(this.f33588c.f33396a, str);
    }
}
