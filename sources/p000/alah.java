package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.octarine.widget.OctarineToolbar;

/* renamed from: alah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alah implements Parcelable.ClassLoaderCreator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new OctarineToolbar.SavedState(parcel, null);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OctarineToolbar.SavedState[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new OctarineToolbar.SavedState(parcel, classLoader);
    }
}
