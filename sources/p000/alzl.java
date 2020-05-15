package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.internal.MatrixCursorParcelable;
import com.google.android.gms.people.internal.SyncStatus;
import com.google.android.gms.people.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.people.protomodel.PersonEntity;

/* renamed from: alzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class alzl extends dck implements alzm {
    public alzl() {
        super("com.google.android.gms.people.internal.IPeopleCallbacks");
    }

    /* renamed from: a */
    public void mo40528a(int i, Bundle bundle, Bundle bundle2) {
    }

    /* renamed from: a */
    public void mo40530a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
    }

    /* renamed from: a */
    public void mo40531a(int i, Bundle bundle, DataHolder dataHolder) {
    }

    /* renamed from: a */
    public void mo40532a(int i, Bundle bundle, DataHolder[] dataHolderArr) {
    }

    /* renamed from: a */
    public final void mo40533a(int i, MatrixCursorParcelable matrixCursorParcelable) {
    }

    /* renamed from: a */
    public void mo40494a(int i, SyncStatus syncStatus) {
    }

    /* renamed from: a */
    public final void mo40534a(int i, PersonEntity personEntity) {
    }

    /* renamed from: a */
    public final void mo40535a(int i, String str) {
    }

    /* renamed from: b */
    public final void mo40537b(int i, SyncStatus syncStatus) {
    }

    /* renamed from: a */
    public final void mo40529a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) {
        throw new RuntimeException("Shouldn't be called");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 12) {
            mo40494a(parcel.readInt(), (SyncStatus) dcl.m8163a(parcel, SyncStatus.CREATOR));
            return true;
        } else if (i == 18) {
            parcel.readInt();
            SyncStatus syncStatus = (SyncStatus) dcl.m8163a(parcel, SyncStatus.CREATOR);
            return true;
        } else if (i == 15) {
            parcel.readInt();
            parcel.readString();
            return true;
        } else if (i != 16) {
            switch (i) {
                case 1:
                    mo40528a(parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                    return true;
                case 2:
                    mo40531a(parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR), (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR));
                    return true;
                case 3:
                    mo40529a(parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR), (ParcelFileDescriptor) dcl.m8163a(parcel, ParcelFileDescriptor.CREATOR));
                    return true;
                case 4:
                    mo40532a(parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR), (DataHolder[]) parcel.createTypedArray(DataHolder.CREATOR));
                    return true;
                case 5:
                    mo40530a(parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR), (ParcelFileDescriptor) dcl.m8163a(parcel, ParcelFileDescriptor.CREATOR), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                    return true;
                case 6:
                    parcel.readInt();
                    BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity = (BackedUpContactsPerDeviceEntity) dcl.m8163a(parcel, BackedUpContactsPerDeviceEntity.CREATOR);
                    return true;
                case 7:
                    parcel.readInt();
                    PersonEntity personEntity = (PersonEntity) dcl.m8163a(parcel, PersonEntity.CREATOR);
                    return true;
                case 8:
                    parcel.readInt();
                    return true;
                default:
                    return false;
            }
        } else {
            parcel.readInt();
            MatrixCursorParcelable matrixCursorParcelable = (MatrixCursorParcelable) dcl.m8163a(parcel, MatrixCursorParcelable.CREATOR);
            return true;
        }
    }
}
