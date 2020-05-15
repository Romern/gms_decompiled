package p000;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.contactssync.model.BackupAndSyncSuggestion;
import java.util.List;

/* renamed from: alss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface alss extends IInterface {
    /* renamed from: a */
    void mo40721a(Status status);

    /* renamed from: a */
    void mo40722a(Status status, BackupAndSyncOptInState backupAndSyncOptInState);

    /* renamed from: a */
    void mo40723a(Status status, BackupAndSyncSuggestion backupAndSyncSuggestion);

    /* renamed from: a */
    void mo40724a(Status status, List list);

    /* renamed from: b */
    void mo40725b(Status status);

    /* renamed from: c */
    void mo40726c(Status status);

    /* renamed from: d */
    void mo40727d(Status status);

    /* renamed from: e */
    void mo40728e(Status status);
}
