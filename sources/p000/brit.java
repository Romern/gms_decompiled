package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.ResultSet;
import com.google.firebase.appindexing.internal.GetIndexableResponse;
import java.util.List;

/* renamed from: brit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class brit extends dck implements briu {
    public brit() {
        super("com.google.firebase.appindexing.internal.IAppIndexingCallback");
    }

    /* renamed from: a */
    public final void mo69572a(Status status, List list) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo69573a(Status status, ResultSet[] resultSetArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo69567a(GetIndexableResponse getIndexableResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            mo69567a((GetIndexableResponse) dcl.m8163a(parcel, GetIndexableResponse.CREATOR));
            return true;
        } else if (i == 3) {
            mo69573a((Status) dcl.m8163a(parcel, Status.CREATOR), (ResultSet[]) parcel.createTypedArray(ResultSet.CREATOR));
            return true;
        } else if (i != 4) {
            return false;
        } else {
            mo69572a((Status) dcl.m8163a(parcel, Status.CREATOR), dcl.m8168b(parcel));
            return true;
        }
    }
}
