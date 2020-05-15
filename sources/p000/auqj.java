package p000;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: auqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class auqj extends dck implements auqk {
    public auqj() {
        super("com.google.android.gms.trustagent.internal.IStateCallbacks");
    }

    /* renamed from: a */
    public void mo50796a(Bundle bundle) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void mo50797b(Bundle bundle) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo50796a((Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo50797b((Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
