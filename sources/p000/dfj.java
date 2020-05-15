package p000;

import android.app.backup.BackupAgent;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FullBackupDataOutput;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.chimera.BackupAgent;
import com.google.android.chimera.config.InvalidConfigException;
import java.io.File;

/* renamed from: dfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class dfj extends BackupAgent implements BackupAgent.ProxyCallbacks, dju, dfx {

    /* renamed from: b */
    public static final dfh f13008b = new dfh();

    /* renamed from: a */
    public com.google.android.chimera.BackupAgent f13009a;

    /* renamed from: a */
    public void mo8840a(com.google.android.chimera.BackupAgent backupAgent, Context context) {
        throw null;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo8648a(Object obj, Context context) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo8841a() {
        throw null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dfj.a(com.google.android.chimera.BackupAgent, android.content.Context):void
     arg types: [dfi, android.content.Context]
     candidates:
      dfj.a(java.lang.Object, android.content.Context):void
      dju.a(java.lang.Object, android.content.Context):void
      dfj.a(com.google.android.chimera.BackupAgent, android.content.Context):void */
    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        if (!mo8841a()) {
            try {
                mo8840a((com.google.android.chimera.BackupAgent) new dfi(), djp.m8662a().mo9139a(this, dfq.m8314a()));
            } catch (PackageManager.NameNotFoundException | InvalidConfigException | djq e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("Failed to load fallback:");
                sb.append(valueOf);
                Log.e("BackupAgentProxy", sb.toString());
            }
            dfy.m8329a((Context) this).mo8886a((dfx) this);
        }
    }

    public final void chimeraSuperOnCreate() {
        super.onCreate();
    }

    public final void chimeraSuperOnDestroy() {
        super.onDestroy();
    }

    public final void chimeraSuperOnFullBackup(FullBackupDataOutput fullBackupDataOutput) {
        super.onFullBackup(fullBackupDataOutput);
    }

    public final void chimeraSuperOnRestore(BackupDataInput backupDataInput, long j, ParcelFileDescriptor parcelFileDescriptor) {
        super.onRestore(backupDataInput, j, parcelFileDescriptor);
    }

    public final void chimeraSuperOnRestoreFile(ParcelFileDescriptor parcelFileDescriptor, long j, File file, int i, long j2, long j3) {
        super.onRestoreFile(parcelFileDescriptor, j, file, i, j2, j3);
    }

    public final void chimeraSuperOnRestoreFinished() {
        super.onRestoreFinished();
    }

    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        this.f13009a.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
    }

    public void onCreate() {
        this.f13009a.onCreate();
    }

    public void onDestroy() {
        this.f13009a.onDestroy();
    }

    public void onFullBackup(FullBackupDataOutput fullBackupDataOutput) {
        this.f13009a.onFullBackup(fullBackupDataOutput);
    }

    public void onQuotaExceeded(long j, long j2) {
        this.f13009a.onQuotaExceeded(j, j2);
    }

    public void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.f13009a.onRestore(backupDataInput, i, parcelFileDescriptor);
    }

    public void onRestoreFile(ParcelFileDescriptor parcelFileDescriptor, long j, File file, int i, long j2, long j3) {
        this.f13009a.onRestoreFile(parcelFileDescriptor, j, file, i, j2, j3);
    }

    public void onRestoreFinished() {
        this.f13009a.onRestoreFinished();
    }

    public final void superOnQuotaExceeded(long j, long j2) {
        super.onQuotaExceeded(j, j2);
    }

    public void onRestore(BackupDataInput backupDataInput, long j, ParcelFileDescriptor parcelFileDescriptor) {
        this.f13009a.onRestore(backupDataInput, j, parcelFileDescriptor);
    }

    /* renamed from: a */
    public final boolean mo8842a(djz djz) {
        return djz.mo9181f().mo69905N() != null;
    }
}
