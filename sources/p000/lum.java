package p000;

import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.backup.ParcelableBackupDataInput;
import com.google.android.gms.backup.ParcelableBackupDataOutput;

/* renamed from: lum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface lum extends IInterface {
    /* renamed from: a */
    void mo19611a(ParcelFileDescriptor parcelFileDescriptor, ParcelableBackupDataOutput parcelableBackupDataOutput, ParcelFileDescriptor parcelFileDescriptor2);

    /* renamed from: a */
    void mo19612a(ParcelableBackupDataInput parcelableBackupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor);
}
