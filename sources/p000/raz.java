package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: raz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class raz extends dck implements rba {

    /* renamed from: a */
    final /* synthetic */ aucf f42573a;

    public raz() {
        super("com.google.android.gms.clearcut.internal.IBootCountCallbacks");
    }

    /* renamed from: a */
    public final void mo24426a(Status status, int i) {
        this.f42573a.mo50391a(Integer.valueOf(i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public raz(aucf aucf) {
        super("com.google.android.gms.clearcut.internal.IBootCountCallbacks");
        this.f42573a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo24426a((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.readInt());
        return true;
    }
}
