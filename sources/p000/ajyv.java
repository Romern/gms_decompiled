package p000;

import android.os.Parcel;

/* renamed from: ajyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajyv extends dck implements ajyw {

    /* renamed from: a */
    final /* synthetic */ aucf f71520a;

    public ajyv() {
        super("com.google.android.gms.nearby.sharing.internal.IStringResultListener");
    }

    /* renamed from: a */
    public final void mo39085a(String str) {
        this.f71520a.mo50391a(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajyv(aucf aucf) {
        super("com.google.android.gms.nearby.sharing.internal.IStringResultListener");
        this.f71520a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo39085a(parcel.readString());
        return true;
    }
}
