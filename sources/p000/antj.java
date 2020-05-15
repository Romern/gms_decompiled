package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.plus.internal.model.people.PersonEntity;

/* renamed from: antj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class antj extends dck implements antk {
    public antj() {
        super("com.google.android.gms.plus.internal.IPlusCallbacks");
    }

    /* renamed from: a */
    public final void mo42229a(int i, Bundle bundle) {
    }

    /* renamed from: a */
    public void mo42230a(int i, Bundle bundle, Bundle bundle2) {
    }

    /* renamed from: a */
    public void mo42231a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) {
    }

    /* renamed from: a */
    public final void mo42232a(int i, Bundle bundle, SafeParcelResponse safeParcelResponse) {
    }

    /* renamed from: a */
    public final void mo42233a(int i, PersonEntity personEntity) {
    }

    /* renamed from: a */
    public final void mo42234a(Status status) {
    }

    /* renamed from: a */
    public final void mo42235a(DataHolder dataHolder, String str) {
    }

    /* renamed from: a */
    public final void mo42236a(DataHolder dataHolder, String str, String str2) {
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mo42230a(parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                break;
            case 2:
                mo42231a(parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR), (ParcelFileDescriptor) dcl.m8163a(parcel, ParcelFileDescriptor.CREATOR));
                break;
            case 3:
                parcel.readString();
                break;
            case 4:
                DataHolder dataHolder = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                parcel.readString();
                break;
            case 5:
                parcel.readInt();
                Bundle bundle = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                SafeParcelResponse safeParcelResponse = (SafeParcelResponse) dcl.m8163a(parcel, SafeParcelResponse.CREATOR);
                break;
            case 6:
                DataHolder dataHolder2 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                parcel.readString();
                parcel.readString();
                break;
            case 7:
                parcel.readInt();
                Bundle bundle2 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                break;
            case 8:
                parcel.readString();
                break;
            case 9:
                parcel.readInt();
                PersonEntity personEntity = (PersonEntity) dcl.m8163a(parcel, PersonEntity.CREATOR);
                break;
            case 10:
                Status status = (Status) dcl.m8163a(parcel, Status.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
