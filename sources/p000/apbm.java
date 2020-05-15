package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.romanesco.protomodel.RawContactEntity;
import com.google.android.gms.romanesco.protomodel.RestoreInfoEntity;
import com.google.android.gms.romanesco.protomodel.SourceStatsEntity;
import java.util.List;

/* renamed from: apbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class apbm extends dck implements apbn {
    public apbm() {
        super("com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
    }

    /* renamed from: a */
    public void mo46970a(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void mo46968b(Status status, List list) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public void mo46969c(Status status, List list) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public void mo46971d(Status status, List list) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo46967a(Status status, List list) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo46967a((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.createTypedArrayList(RawContactEntity.CREATOR));
        } else if (i == 2) {
            mo46970a((Status) dcl.m8163a(parcel, Status.CREATOR));
        } else if (i == 3) {
            mo46968b((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.createTypedArrayList(BackedUpContactsPerDeviceEntity.CREATOR));
        } else if (i == 4) {
            mo46969c((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.createTypedArrayList(SourceStatsEntity.CREATOR));
        } else if (i != 5) {
            return false;
        } else {
            mo46971d((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.createTypedArrayList(RestoreInfoEntity.CREATOR));
        }
        return true;
    }
}
