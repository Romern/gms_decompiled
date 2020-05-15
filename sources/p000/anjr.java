package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.photos.autobackup.model.AutoBackupEngineStatus;
import com.google.android.gms.photos.autobackup.model.AutoBackupSettings;
import com.google.android.gms.photos.autobackup.model.AutoBackupStatus;
import com.google.android.gms.photos.autobackup.model.LocalFolder;
import com.google.android.gms.photos.autobackup.model.MediaState;
import com.google.android.gms.photos.autobackup.model.MigrationStatus;
import com.google.android.gms.photos.autobackup.model.SyncSettings;
import java.util.List;

/* renamed from: anjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class anjr extends dck implements anjs {
    public anjr() {
        super("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
    }

    /* renamed from: a */
    public final void mo41873a() {
    }

    /* renamed from: a */
    public void mo41872a(int i, List list) {
    }

    /* renamed from: a */
    public final void mo41874a(PendingIntent pendingIntent) {
    }

    /* renamed from: a */
    public final void mo41875a(Status status, LocalFolder localFolder) {
    }

    /* renamed from: a */
    public final void mo41876a(AutoBackupEngineStatus autoBackupEngineStatus) {
    }

    /* renamed from: a */
    public final void mo41877a(AutoBackupStatus autoBackupStatus) {
    }

    /* renamed from: a */
    public final void mo41878a(MigrationStatus migrationStatus) {
    }

    /* renamed from: c */
    public final void mo41879c() {
    }

    /* renamed from: d */
    public final void mo41880d() {
    }

    /* renamed from: e */
    public final void mo41881e() {
    }

    /* renamed from: f */
    public final void mo41882f() {
    }

    /* renamed from: g */
    public final void mo41883g() {
    }

    /* renamed from: h */
    public final void mo41884h() {
    }

    /* renamed from: i */
    public final void mo41885i() {
    }

    /* renamed from: j */
    public final void mo41886j() {
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel.readInt();
                dcl.m8167a(parcel);
                parcel.readString();
                break;
            case 2:
                parcel.readInt();
                PendingIntent pendingIntent = (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR);
                break;
            case 3:
                mo41872a(parcel.readInt(), parcel.createTypedArrayList(AutoBackupSettings.CREATOR));
                break;
            case 4:
                parcel.readInt();
                parcel.createTypedArrayList(LocalFolder.CREATOR);
                break;
            case 5:
                Status status = (Status) dcl.m8163a(parcel, Status.CREATOR);
                LocalFolder localFolder = (LocalFolder) dcl.m8163a(parcel, LocalFolder.CREATOR);
                break;
            case 6:
                parcel.readInt();
                AutoBackupStatus autoBackupStatus = (AutoBackupStatus) dcl.m8163a(parcel, AutoBackupStatus.CREATOR);
                break;
            case 7:
                parcel.readInt();
                break;
            case 8:
                parcel.readInt();
                break;
            case 9:
                parcel.readInt();
                break;
            case 10:
                parcel.readInt();
                SyncSettings syncSettings = (SyncSettings) dcl.m8163a(parcel, SyncSettings.CREATOR);
                break;
            case 11:
                parcel.readInt();
                break;
            case 12:
                parcel.readInt();
                MigrationStatus migrationStatus = (MigrationStatus) dcl.m8163a(parcel, MigrationStatus.CREATOR);
                break;
            case 13:
                parcel.readInt();
                MediaState mediaState = (MediaState) dcl.m8163a(parcel, MediaState.CREATOR);
                break;
            case 14:
                parcel.readInt();
                break;
            case 15:
                parcel.readInt();
                AutoBackupEngineStatus autoBackupEngineStatus = (AutoBackupEngineStatus) dcl.m8163a(parcel, AutoBackupEngineStatus.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
