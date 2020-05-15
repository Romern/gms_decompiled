package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p002v7.widget.SearchView;

/* renamed from: add */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class add implements Parcelable.ClassLoaderCreator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SearchView.SavedState[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SearchView.SavedState(parcel, null);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SearchView.SavedState(parcel, classLoader);
    }
}
