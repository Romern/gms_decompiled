package p000;

import android.os.Parcel;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;

/* renamed from: jah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jah extends dck implements jai {

    /* renamed from: a */
    final /* synthetic */ aucf f22020a;

    public jah() {
        super("com.google.android.gms.auth.folsom.internal.ISharedKeyCallback");
    }

    /* renamed from: a */
    public final void mo13556a(Status status, SharedKey[] sharedKeyArr) {
        if (status.mo17710c()) {
            this.f22020a.mo50391a(Arrays.asList(sharedKeyArr));
        } else {
            this.f22020a.mo50390a((Exception) rzy.m34725a(status));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jah(aucf aucf) {
        super("com.google.android.gms.auth.folsom.internal.ISharedKeyCallback");
        this.f22020a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo13556a((Status) dcl.m8163a(parcel, Status.CREATOR), (SharedKey[]) parcel.createTypedArray(SharedKey.CREATOR));
        return true;
    }
}
