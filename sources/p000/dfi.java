package p000;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FullBackupDataOutput;
import android.os.ParcelFileDescriptor;
import com.google.android.chimera.BackupAgent;
import java.io.File;
import java.io.IOException;

/* renamed from: dfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dfi extends BackupAgent {
    public final void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        throw new IOException("BackupAgent missing implementation");
    }

    public final void onFullBackup(FullBackupDataOutput fullBackupDataOutput) {
        throw new IOException("BackupAgent missing implementation");
    }

    public final void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        throw new IOException("BackupAgent missing implementation");
    }

    public final void onRestoreFile(ParcelFileDescriptor parcelFileDescriptor, long j, File file, int i, long j2, long j3) {
        throw new IOException("BackupAgent missing implementation");
    }
}
