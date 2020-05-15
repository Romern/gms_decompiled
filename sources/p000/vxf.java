package p000;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.droidguard.internal.DroidGuardInitReply;

/* renamed from: vxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vxf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) parcel.readParcelable(ParcelFileDescriptor.class.getClassLoader());
        Parcelable readParcelable = parcel.readParcelable(getClass().getClassLoader());
        boolean z2 = false;
        if (parcelFileDescriptor != null) {
            z = false;
        } else {
            z = true;
        }
        if (readParcelable == null) {
            z2 = true;
        }
        if (z == z2) {
            return new DroidGuardInitReply(parcelFileDescriptor, readParcelable);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DroidGuardInitReply[i];
    }
}
