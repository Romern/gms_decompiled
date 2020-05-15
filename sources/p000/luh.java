package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.backup.ApplicationBackupStats;
import com.google.android.gms.backup.BackupStatsRequestConfig;

/* renamed from: luh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class luh extends dcj implements luj {
    public luh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.backup.IBackupStatsService");
    }

    /* renamed from: a */
    public final void mo19607a() {
        mo8528b(7, mo8529bj());
    }

    /* renamed from: a */
    public final void mo19608a(ApplicationBackupStats applicationBackupStats) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, applicationBackupStats);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo19609a(String str, long j) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeLong(j);
        mo8528b(6, bj);
    }

    /* renamed from: a */
    public final ApplicationBackupStats[] mo19610a(BackupStatsRequestConfig backupStatsRequestConfig) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, backupStatsRequestConfig);
        Parcel a = mo8526a(2, bj);
        ApplicationBackupStats[] applicationBackupStatsArr = (ApplicationBackupStats[]) a.createTypedArray(ApplicationBackupStats.CREATOR);
        a.recycle();
        return applicationBackupStatsArr;
    }
}
