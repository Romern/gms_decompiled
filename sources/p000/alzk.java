package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.internal.MatrixCursorParcelable;
import com.google.android.gms.people.internal.SyncStatus;
import com.google.android.gms.people.protomodel.PersonEntity;

/* renamed from: alzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alzk extends dcj implements alzm {
    public alzk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.people.internal.IPeopleCallbacks");
    }

    /* renamed from: a */
    public final void mo40528a(int i, Bundle bundle, Bundle bundle2) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        dcl.m8165a(bj, bundle2);
        mo8530c(1, bj);
    }

    /* renamed from: b */
    public final void mo40537b(int i, SyncStatus syncStatus) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, syncStatus);
        mo8530c(18, bj);
    }

    /* renamed from: a */
    public final void mo40529a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        dcl.m8165a(bj, parcelFileDescriptor);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo40530a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        dcl.m8165a(bj, parcelFileDescriptor);
        dcl.m8165a(bj, bundle2);
        mo8530c(5, bj);
    }

    /* renamed from: a */
    public final void mo40531a(int i, Bundle bundle, DataHolder dataHolder) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        dcl.m8165a(bj, dataHolder);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo40532a(int i, Bundle bundle, DataHolder[] dataHolderArr) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        bj.writeTypedArray(dataHolderArr, 0);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo40533a(int i, MatrixCursorParcelable matrixCursorParcelable) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, matrixCursorParcelable);
        mo8530c(16, bj);
    }

    /* renamed from: a */
    public final void mo40494a(int i, SyncStatus syncStatus) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, syncStatus);
        mo8530c(12, bj);
    }

    /* renamed from: a */
    public final void mo40534a(int i, PersonEntity personEntity) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, personEntity);
        mo8530c(7, bj);
    }

    /* renamed from: a */
    public final void mo40535a(int i, String str) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        bj.writeString(str);
        mo8530c(15, bj);
    }
}
