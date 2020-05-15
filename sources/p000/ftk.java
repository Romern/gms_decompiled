package p000;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.common.api.Status;

/* renamed from: ftk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ftk extends dck implements ftl {
    public ftk() {
        super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo11304a((Status) dcl.m8163a(parcel, Status.CREATOR));
        } else if (i == 2) {
            mo11305a((Status) dcl.m8163a(parcel, Status.CREATOR), (ParcelFileDescriptor) dcl.m8163a(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 4) {
            return false;
        } else {
            mo11185a((GetRecentContextCall$Response) dcl.m8163a(parcel, GetRecentContextCall$Response.CREATOR));
        }
        return true;
    }
}
