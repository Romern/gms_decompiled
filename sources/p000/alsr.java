package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.account.categories.ClassifyAccountTypeResult;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.contactssync.model.BackupAndSyncSuggestion;
import java.util.List;

/* renamed from: alsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class alsr extends dck implements alss {
    public alsr() {
        super("com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
    }

    /* renamed from: a */
    public void mo40721a(Status status) {
    }

    /* renamed from: a */
    public void mo40722a(Status status, BackupAndSyncOptInState backupAndSyncOptInState) {
    }

    /* renamed from: a */
    public void mo40723a(Status status, BackupAndSyncSuggestion backupAndSyncSuggestion) {
    }

    /* renamed from: a */
    public final void mo40724a(Status status, List list) {
    }

    /* renamed from: b */
    public final void mo40725b(Status status) {
    }

    /* renamed from: c */
    public final void mo40726c(Status status) {
    }

    /* renamed from: d */
    public void mo40727d(Status status) {
    }

    /* renamed from: e */
    public final void mo40728e(Status status) {
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) dcl.m8163a(parcel, Status.CREATOR);
                return true;
            case 2:
                Status status2 = (Status) dcl.m8163a(parcel, Status.CREATOR);
                BackupAndSyncOptInState backupAndSyncOptInState = (BackupAndSyncOptInState) dcl.m8163a(parcel, BackupAndSyncOptInState.CREATOR);
                return true;
            case 3:
                mo40721a((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 4:
                Status status3 = (Status) dcl.m8163a(parcel, Status.CREATOR);
                return true;
            case 5:
                Status status4 = (Status) dcl.m8163a(parcel, Status.CREATOR);
                return true;
            case 6:
                mo40727d((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 7:
                mo40722a((Status) dcl.m8163a(parcel, Status.CREATOR), (BackupAndSyncOptInState) dcl.m8163a(parcel, BackupAndSyncOptInState.CREATOR));
                return true;
            case 8:
                mo40723a((Status) dcl.m8163a(parcel, Status.CREATOR), (BackupAndSyncSuggestion) dcl.m8163a(parcel, BackupAndSyncSuggestion.CREATOR));
                return true;
            case 9:
                Status status5 = (Status) dcl.m8163a(parcel, Status.CREATOR);
                return true;
            case 10:
                Status status6 = (Status) dcl.m8163a(parcel, Status.CREATOR);
                parcel.createTypedArrayList(ClassifyAccountTypeResult.CREATOR);
                return true;
            default:
                return false;
        }
    }
}
