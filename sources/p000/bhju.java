package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ParcelableSparseArray;

/* renamed from: bhju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhju implements Parcelable.ClassLoaderCreator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ParcelableSparseArray(parcel, null);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ParcelableSparseArray[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ParcelableSparseArray(parcel, classLoader);
    }
}
