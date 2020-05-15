package p000;

import android.os.Parcel;

/* renamed from: gfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gfe extends dck implements gff {

    /* renamed from: a */
    final /* synthetic */ rod f18078a;

    public gfe() {
        super("com.google.android.gms.audiomodem.internal.ISnoopCallback");
    }

    /* renamed from: a */
    public final void mo11762a() {
        this.f18078a.mo24968a(new gcp());
    }

    /* renamed from: c */
    public final void mo11763c() {
        this.f18078a.mo24968a(new gcq());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gfe(rod rod) {
        super("com.google.android.gms.audiomodem.internal.ISnoopCallback");
        this.f18078a = rod;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo11762a();
        } else if (i != 2) {
            return false;
        } else {
            mo11763c();
        }
        parcel2.writeNoException();
        return true;
    }
}
