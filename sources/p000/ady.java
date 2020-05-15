package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p002v7.widget.Toolbar;

/* renamed from: ady */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ady implements Parcelable.ClassLoaderCreator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Toolbar.SavedState[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Toolbar.SavedState(parcel, null);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new Toolbar.SavedState(parcel, classLoader);
    }
}
