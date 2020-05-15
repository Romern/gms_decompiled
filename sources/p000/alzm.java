package p000;

import android.os.Bundle;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.internal.MatrixCursorParcelable;
import com.google.android.gms.people.internal.SyncStatus;
import com.google.android.gms.people.protomodel.PersonEntity;

/* renamed from: alzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface alzm extends IInterface {
    /* renamed from: a */
    void mo40528a(int i, Bundle bundle, Bundle bundle2);

    /* renamed from: a */
    void mo40529a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor);

    /* renamed from: a */
    void mo40530a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2);

    /* renamed from: a */
    void mo40531a(int i, Bundle bundle, DataHolder dataHolder);

    /* renamed from: a */
    void mo40532a(int i, Bundle bundle, DataHolder[] dataHolderArr);

    /* renamed from: a */
    void mo40533a(int i, MatrixCursorParcelable matrixCursorParcelable);

    /* renamed from: a */
    void mo40494a(int i, SyncStatus syncStatus);

    /* renamed from: a */
    void mo40534a(int i, PersonEntity personEntity);

    /* renamed from: a */
    void mo40535a(int i, String str);

    /* renamed from: b */
    void mo40537b(int i, SyncStatus syncStatus);
}
