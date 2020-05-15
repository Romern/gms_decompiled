package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.view.AbsSavedState;

/* renamed from: oo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1249oo implements Parcelable.ClassLoaderCreator {
    /* renamed from: a */
    public static final AbsSavedState m19795a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return AbsSavedState.f1047a;
        }
        throw new IllegalStateException("superState must be null");
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AbsSavedState[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m19795a(parcel, null);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m19795a(parcel, classLoader);
    }
}
