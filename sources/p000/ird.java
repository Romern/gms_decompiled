package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: ird */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ird extends dck implements ire {

    /* renamed from: a */
    final /* synthetic */ iny f21597a;

    public ird() {
        super("com.google.android.gms.auth.cryptauth.internal.IHaveKeyCallback");
    }

    /* renamed from: a */
    public final void mo13293a(Status status) {
        this.f21597a.mo13164a(status);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ird(iny iny) {
        super("com.google.android.gms.auth.cryptauth.internal.IHaveKeyCallback");
        this.f21597a = iny;
    }

    /* renamed from: a */
    public final void mo13294a(boolean z) {
        this.f21597a.mo13165a(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo13294a(dcl.m8167a(parcel));
        } else if (i != 2) {
            return false;
        } else {
            mo13293a((Status) dcl.m8163a(parcel, Status.CREATOR));
        }
        return true;
    }
}
