package p000;

import android.os.Parcel;
import com.google.android.gms.appinvite.model.ContactPerson;

/* renamed from: fwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fwt extends dck implements fwu {

    /* renamed from: a */
    final /* synthetic */ fxb f17489a;

    public fwt() {
        super("com.google.android.gms.appinvite.ui.context.ISelectionChangeListener");
    }

    /* renamed from: a */
    public final void mo11449a(ContactPerson contactPerson, boolean z) {
        this.f17489a.mo7248a(contactPerson, z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fwt(fxb fxb) {
        super("com.google.android.gms.appinvite.ui.context.ISelectionChangeListener");
        this.f17489a = fxb;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo11449a((ContactPerson) dcl.m8163a(parcel, ContactPerson.CREATOR), dcl.m8167a(parcel));
        return true;
    }
}
