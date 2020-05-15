package p000;

import android.os.Parcel;

/* renamed from: fwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fwq extends dck implements fwr {

    /* renamed from: a */
    final /* synthetic */ fwz f17488a;

    public fwq() {
        super("com.google.android.gms.appinvite.ui.context.ILoadingListener");
    }

    /* renamed from: a */
    public final void mo11446a() {
        this.f17488a.mo7255e();
    }

    /* renamed from: b */
    public final void mo11448b(int i, int i2) {
        this.f17488a.mo7252b(i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fwq(fwz fwz) {
        super("com.google.android.gms.appinvite.ui.context.ILoadingListener");
        this.f17488a = fwz;
    }

    /* renamed from: a */
    public final void mo11447a(int i, int i2) {
        this.f17488a.mo7245a(i, i2);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo11447a(parcel.readInt(), parcel.readInt());
        } else if (i == 2) {
            mo11448b(parcel.readInt(), parcel.readInt());
        } else if (i != 3) {
            return false;
        } else {
            mo11446a();
        }
        return true;
    }
}
