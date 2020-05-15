package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.contactssync.model.BackupAndSyncSuggestion;
import java.util.List;

/* renamed from: alsq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alsq extends dcj implements alss {
    public alsq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
    }

    /* renamed from: a */
    public final void mo40721a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(3, bj);
    }

    /* renamed from: b */
    public final void mo40725b(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(4, bj);
    }

    /* renamed from: c */
    public final void mo40726c(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(5, bj);
    }

    /* renamed from: d */
    public final void mo40727d(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(6, bj);
    }

    /* renamed from: e */
    public final void mo40728e(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(9, bj);
    }

    /* renamed from: a */
    public final void mo40722a(Status status, BackupAndSyncOptInState backupAndSyncOptInState) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, backupAndSyncOptInState);
        mo8530c(7, bj);
    }

    /* renamed from: a */
    public final void mo40723a(Status status, BackupAndSyncSuggestion backupAndSyncSuggestion) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, backupAndSyncSuggestion);
        mo8530c(8, bj);
    }

    /* renamed from: a */
    public final void mo40724a(Status status, List list) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedList(list);
        mo8530c(10, bj);
    }
}
