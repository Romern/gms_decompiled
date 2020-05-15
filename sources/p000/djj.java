package p000;

import android.os.Parcel;

/* renamed from: djj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class djj extends dck implements djk {
    public djj() {
        super("com.google.android.chimera.container.internal.IUpdateProgressListener");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo8635a(parcel.readInt());
        return true;
    }
}
