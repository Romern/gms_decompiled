package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.plus.internal.model.people.PersonEntity;

/* renamed from: anti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anti extends dcj implements antk {
    public anti(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.plus.internal.IPlusCallbacks");
    }

    /* renamed from: a */
    public final void mo42229a(int i, Bundle bundle) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        mo8528b(7, bj);
    }

    /* renamed from: a */
    public final void mo42230a(int i, Bundle bundle, Bundle bundle2) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        dcl.m8165a(bj, bundle2);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo42231a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, (Parcelable) null);
        dcl.m8165a(bj, parcelFileDescriptor);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo42232a(int i, Bundle bundle, SafeParcelResponse safeParcelResponse) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        dcl.m8165a(bj, safeParcelResponse);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo42233a(int i, PersonEntity personEntity) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, personEntity);
        mo8528b(9, bj);
    }

    /* renamed from: a */
    public final void mo42234a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8528b(10, bj);
    }

    /* renamed from: a */
    public final void mo42235a(DataHolder dataHolder, String str) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataHolder);
        bj.writeString(str);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo42236a(DataHolder dataHolder, String str, String str2) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataHolder);
        bj.writeString(str);
        bj.writeString(str2);
        mo8528b(6, bj);
    }
}
