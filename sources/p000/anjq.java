package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.photos.autobackup.model.AutoBackupEngineStatus;
import com.google.android.gms.photos.autobackup.model.AutoBackupStatus;
import com.google.android.gms.photos.autobackup.model.LocalFolder;
import com.google.android.gms.photos.autobackup.model.MigrationStatus;
import java.util.List;

/* renamed from: anjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anjq extends dcj implements anjs {
    public anjq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcl.a(android.os.Parcel, boolean):void
     arg types: [android.os.Parcel, int]
     candidates:
      dcl.a(android.os.Parcel, android.os.Parcelable$Creator):android.os.Parcelable
      dcl.a(android.os.Parcel, android.os.IInterface):void
      dcl.a(android.os.Parcel, android.os.Parcelable):void
      dcl.a(android.os.Parcel, boolean):void */
    /* renamed from: a */
    public final void mo41873a() {
        Parcel bj = mo8529bj();
        bj.writeInt(8);
        dcl.m8166a(bj, false);
        bj.writeString(null);
        mo8528b(1, bj);
    }

    /* renamed from: c */
    public final void mo41879c() {
        Parcel bj = mo8529bj();
        bj.writeInt(8);
        mo8528b(9, bj);
    }

    /* renamed from: d */
    public final void mo41880d() {
        Parcel bj = mo8529bj();
        bj.writeInt(8);
        bj.writeTypedList(null);
        mo8528b(4, bj);
    }

    /* renamed from: e */
    public final void mo41881e() {
        Parcel bj = mo8529bj();
        bj.writeInt(8);
        dcl.m8165a(bj, (Parcelable) null);
        mo8528b(13, bj);
    }

    /* renamed from: f */
    public final void mo41882f() {
        Parcel bj = mo8529bj();
        bj.writeInt(8);
        mo8528b(7, bj);
    }

    /* renamed from: g */
    public final void mo41883g() {
        Parcel bj = mo8529bj();
        bj.writeInt(8);
        mo8528b(14, bj);
    }

    /* renamed from: h */
    public final void mo41884h() {
        Parcel bj = mo8529bj();
        bj.writeInt(8);
        mo8528b(8, bj);
    }

    /* renamed from: i */
    public final void mo41885i() {
        Parcel bj = mo8529bj();
        bj.writeInt(8);
        dcl.m8165a(bj, (Parcelable) null);
        mo8528b(10, bj);
    }

    /* renamed from: j */
    public final void mo41886j() {
        Parcel bj = mo8529bj();
        bj.writeInt(8);
        mo8528b(11, bj);
    }

    /* renamed from: a */
    public final void mo41872a(int i, List list) {
        Parcel bj = mo8529bj();
        bj.writeInt(0);
        bj.writeTypedList(list);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo41874a(PendingIntent pendingIntent) {
        Parcel bj = mo8529bj();
        bj.writeInt(8);
        dcl.m8165a(bj, pendingIntent);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo41875a(Status status, LocalFolder localFolder) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, localFolder);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo41876a(AutoBackupEngineStatus autoBackupEngineStatus) {
        Parcel bj = mo8529bj();
        bj.writeInt(0);
        dcl.m8165a(bj, autoBackupEngineStatus);
        mo8528b(15, bj);
    }

    /* renamed from: a */
    public final void mo41877a(AutoBackupStatus autoBackupStatus) {
        Parcel bj = mo8529bj();
        bj.writeInt(8);
        dcl.m8165a(bj, autoBackupStatus);
        mo8528b(6, bj);
    }

    /* renamed from: a */
    public final void mo41878a(MigrationStatus migrationStatus) {
        Parcel bj = mo8529bj();
        bj.writeInt(8);
        dcl.m8165a(bj, migrationStatus);
        mo8528b(12, bj);
    }
}
