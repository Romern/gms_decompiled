package p000;

import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.photos.autobackup.model.AutoBackupEngineStatus;
import com.google.android.gms.photos.autobackup.model.AutoBackupStatus;
import com.google.android.gms.photos.autobackup.model.LocalFolder;
import com.google.android.gms.photos.autobackup.model.MigrationStatus;
import java.util.List;

/* renamed from: anjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface anjs extends IInterface {
    /* renamed from: a */
    void mo41873a();

    /* renamed from: a */
    void mo41872a(int i, List list);

    /* renamed from: a */
    void mo41874a(PendingIntent pendingIntent);

    /* renamed from: a */
    void mo41875a(Status status, LocalFolder localFolder);

    /* renamed from: a */
    void mo41876a(AutoBackupEngineStatus autoBackupEngineStatus);

    /* renamed from: a */
    void mo41877a(AutoBackupStatus autoBackupStatus);

    /* renamed from: a */
    void mo41878a(MigrationStatus migrationStatus);

    /* renamed from: c */
    void mo41879c();

    /* renamed from: d */
    void mo41880d();

    /* renamed from: e */
    void mo41881e();

    /* renamed from: f */
    void mo41882f();

    /* renamed from: g */
    void mo41883g();

    /* renamed from: h */
    void mo41884h();

    /* renamed from: i */
    void mo41885i();

    /* renamed from: j */
    void mo41886j();
}
