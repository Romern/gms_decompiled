package p000;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.enterprise.internal.ZeroTouchFlowResult;

/* renamed from: wds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class wds extends dck implements IInterface {
    public wds() {
        super("com.google.android.gms.enterprise.internal.IEnterpriseServiceCallbacks");
    }

    /* renamed from: a */
    public void mo29051a(Status status, ZeroTouchFlowResult zeroTouchFlowResult) {
        throw null;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo29051a((Status) dcl.m8163a(parcel, Status.CREATOR), (ZeroTouchFlowResult) dcl.m8163a(parcel, ZeroTouchFlowResult.CREATOR));
        return true;
    }
}
