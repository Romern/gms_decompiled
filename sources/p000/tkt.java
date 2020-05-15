package p000;

import android.os.Parcel;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceTriggerInfoImpl;

/* renamed from: tkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class tkt extends dck implements tku {
    public tkt() {
        super("com.google.android.gms.contextmanager.fence.internal.IContextFenceListener");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo9520a((FenceTriggerInfoImpl) dcl.m8163a(parcel, FenceTriggerInfoImpl.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo9519a((FenceStateImpl) dcl.m8163a(parcel, FenceStateImpl.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
