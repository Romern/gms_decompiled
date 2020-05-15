package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;

/* renamed from: ahbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ahbj extends dck implements ahbk {
    public ahbj() {
        super("com.google.android.gms.mobstore.IMobStoreFileCallbacks");
    }

    /* renamed from: a */
    public void mo36274a(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void mo36276b(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo36275a(Status status, OpenFileDescriptorResponse openFileDescriptorResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo36275a((Status) dcl.m8163a(parcel, Status.CREATOR), (OpenFileDescriptorResponse) dcl.m8163a(parcel, OpenFileDescriptorResponse.CREATOR));
        } else if (i == 2) {
            mo36274a((Status) dcl.m8163a(parcel, Status.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            mo36276b((Status) dcl.m8163a(parcel, Status.CREATOR));
        }
        return true;
    }
}
