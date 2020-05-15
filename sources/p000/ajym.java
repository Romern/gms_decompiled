package p000;

import android.os.Parcel;

/* renamed from: ajym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ajym extends dck implements ajyn {
    public ajym() {
        super("com.google.android.gms.nearby.sharing.internal.IIntResultListener");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo38891a(parcel.readInt());
        return true;
    }
}
