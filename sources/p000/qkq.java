package p000;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FullBackupDataOutput;
import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.google.android.chimera.BackupAgent;
import com.google.android.chimera.ModuleContext;
import java.io.File;

/* renamed from: qkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class qkq extends dfj {

    /* renamed from: c */
    private aabl f41619c = null;

    protected qkq() {
        qlp.m32393a();
    }

    /* renamed from: a */
    public final void mo8840a(BackupAgent backupAgent, Context context) {
        aabl aabl;
        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
        if (moduleContext != null && (moduleContext.getModuleApk() instanceof dfz)) {
            context = new rpg(context);
        }
        if (cdoz.f181455a.mo6606a().mo78112e()) {
            aabl = new aabl(context, backupAgent.getClass(), 21);
        } else {
            aabl = null;
        }
        this.f41619c = aabl;
        Context a = aabj.m21054a(context);
        if (this.f13009a == null) {
            this.f13009a = backupAgent;
            backupAgent.setProxy(this, a);
            return;
        }
        throw new IllegalStateException("Implementation already set");
    }

    /* renamed from: c */
    public final void mo9145c() {
        qmc.m32424a(true);
    }

    /* renamed from: c */
    public final boolean mo9146c(Context context) {
        return true;
    }

    public final void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        blji a = aabl.m21058a(this.f41619c, "onBackup");
        try {
            this.f13009a.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onCreate() {
        blji a = aabl.m21058a(this.f41619c, "onCreate");
        try {
            this.f13009a.onCreate();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        blji a = aabl.m21058a(this.f41619c, "onDestroy");
        try {
            this.f13009a.onDestroy();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onFullBackup(FullBackupDataOutput fullBackupDataOutput) {
        blji a = aabl.m21058a(this.f41619c, "onFullBackup");
        try {
            this.f13009a.onFullBackup(fullBackupDataOutput);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onQuotaExceeded(long j, long j2) {
        blji a = aabl.m21058a(this.f41619c, "onQuotaExceeded");
        try {
            this.f13009a.onQuotaExceeded(j, j2);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        blji a = aabl.m21058a(this.f41619c, "onRestore");
        try {
            this.f13009a.onRestore(backupDataInput, i, parcelFileDescriptor);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onRestoreFile(ParcelFileDescriptor parcelFileDescriptor, long j, File file, int i, long j2, long j3) {
        Throwable th;
        blji a = aabl.m21058a(this.f41619c, "onRestoreFile");
        try {
            this.f13009a.onRestoreFile(parcelFileDescriptor, j, file, i, j2, j3);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
        throw th;
    }

    public final void onRestoreFinished() {
        blji a = aabl.m21058a(this.f41619c, "onRestoreFinished");
        try {
            this.f13009a.onRestoreFinished();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onRestore(BackupDataInput backupDataInput, long j, ParcelFileDescriptor parcelFileDescriptor) {
        blji a = aabl.m21058a(this.f41619c, "onRestore");
        try {
            this.f13009a.onRestore(backupDataInput, j, parcelFileDescriptor);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8648a(Object obj, Context context) {
        mo8840a((BackupAgent) obj, context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo8841a() {
        if (!rpr.m34216b().getInSafeBoot()) {
            return dfj.f13008b.mo9147a(this, this);
        }
        return false;
    }
}
