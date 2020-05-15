package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.backup.ParcelableBackupDataInput;
import com.google.android.gms.backup.ParcelableBackupDataOutput;

/* renamed from: luk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class luk extends dcj implements lum {
    public luk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.backup.IChimeraModuleBackupAgent");
    }

    /* renamed from: a */
    public final void mo19611a(ParcelFileDescriptor parcelFileDescriptor, ParcelableBackupDataOutput parcelableBackupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, parcelFileDescriptor);
        dcl.m8165a(bj, parcelableBackupDataOutput);
        dcl.m8165a(bj, parcelFileDescriptor2);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo19612a(ParcelableBackupDataInput parcelableBackupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, parcelableBackupDataInput);
        bj.writeInt(i);
        dcl.m8165a(bj, parcelFileDescriptor);
        mo8528b(2, bj);
    }
}
