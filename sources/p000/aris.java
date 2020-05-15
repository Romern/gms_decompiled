package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import java.util.List;

/* renamed from: aris */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aris extends dck implements arit {

    /* renamed from: a */
    protected final rlf f87784a;

    /* renamed from: a */
    public void mo48574a(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void mo48576b(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public void mo48577c(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public void mo48578d(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public void mo48579e(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public void mo48580f(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public void mo48581g(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    public final void mo48582h(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: i */
    public void mo48583i(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: j */
    public void mo48584j(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    public void mo48585k(Status status) {
        throw new UnsupportedOperationException();
    }

    protected aris(rlf rlf) {
        super("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
        this.f87784a = rlf;
    }

    /* renamed from: a */
    public void mo48575a(Status status, List list) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mo48574a((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 2:
                mo48576b((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 3:
                mo48577c((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 4:
                mo48578d((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 5:
                mo48579e((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 6:
                mo48580f((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 7:
                mo48581g((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 8:
                mo48582h((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 9:
                mo48575a((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.createTypedArrayList(BootstrapAccount.CREATOR));
                return true;
            case 10:
                mo48583i((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 11:
                mo48584j((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 12:
                mo48585k((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
