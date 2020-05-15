package com.google.android.chimera;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FullBackupDataOutput;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.ParcelFileDescriptor;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.io.File;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class BackupAgent extends ContextWrapper implements dix {

    /* renamed from: a */
    private android.app.backup.BackupAgent f7608a;

    /* renamed from: b */
    private ProxyCallbacks f7609b;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface ProxyCallbacks {
        void chimeraSuperOnCreate();

        void chimeraSuperOnDestroy();

        void chimeraSuperOnFullBackup(FullBackupDataOutput fullBackupDataOutput);

        void chimeraSuperOnRestore(BackupDataInput backupDataInput, long j, ParcelFileDescriptor parcelFileDescriptor);

        void chimeraSuperOnRestoreFile(ParcelFileDescriptor parcelFileDescriptor, long j, File file, int i, long j2, long j3);

        void chimeraSuperOnRestoreFinished();

        void superOnQuotaExceeded(long j, long j2);
    }

    public BackupAgent() {
        super(null);
    }

    public final void fullBackupFile(File file, FullBackupDataOutput fullBackupDataOutput) {
        this.f7608a.fullBackupFile(file, fullBackupDataOutput);
    }

    public Object getChimeraImpl() {
        return this;
    }

    public abstract void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2);

    public void onCreate() {
        this.f7609b.chimeraSuperOnCreate();
    }

    public void onDestroy() {
        this.f7609b.chimeraSuperOnDestroy();
    }

    public void onFullBackup(FullBackupDataOutput fullBackupDataOutput) {
        this.f7609b.chimeraSuperOnFullBackup(fullBackupDataOutput);
    }

    public void onQuotaExceeded(long j, long j2) {
        this.f7609b.superOnQuotaExceeded(j, j2);
    }

    public abstract void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor);

    public void onRestore(BackupDataInput backupDataInput, long j, ParcelFileDescriptor parcelFileDescriptor) {
        this.f7609b.chimeraSuperOnRestore(backupDataInput, j, parcelFileDescriptor);
    }

    public void onRestoreFile(ParcelFileDescriptor parcelFileDescriptor, long j, File file, int i, long j2, long j3) {
        this.f7609b.chimeraSuperOnRestoreFile(parcelFileDescriptor, j, file, i, j2, j3);
    }

    public void onRestoreFinished() {
        this.f7609b.chimeraSuperOnRestoreFinished();
    }

    public void setProxy(android.app.backup.BackupAgent backupAgent, Context context) {
        this.f7608a = backupAgent;
        this.f7609b = (ProxyCallbacks) backupAgent;
        attachBaseContext(context);
    }
}
