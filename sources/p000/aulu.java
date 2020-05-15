package p000;

import android.os.Parcel;

/* renamed from: aulu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aulu extends dck implements aulv {
    public aulu() {
        super("com.google.android.gms.trustagent.api.state.ITrustStateCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo50663a(dcl.m8167a(parcel));
        } else if (i != 2) {
            return false;
        } else {
            mo50664b(dcl.m8167a(parcel));
        }
        return true;
    }
}
