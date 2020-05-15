package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: grg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class grg extends dck implements grh {

    /* renamed from: a */
    private final aucf f18883a;

    public grg() {
        super("com.google.android.gms.auth.account.internal.IBooleanResultCallback");
    }

    /* renamed from: a */
    public final void mo12132a(int i, boolean z) {
        rpc.m34202a(new Status(i), Boolean.valueOf(z), this.f18883a);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        mo12132a(parcel.readInt(), dcl.m8167a(parcel));
        return true;
    }

    public grg(aucf aucf) {
        super("com.google.android.gms.auth.account.internal.IBooleanResultCallback");
        this.f18883a = aucf;
    }
}
