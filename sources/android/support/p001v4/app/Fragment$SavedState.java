package android.support.p001v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.app.Fragment$SavedState */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Fragment$SavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1017gg();

    /* renamed from: a */
    public final Bundle f1002a;

    public Fragment$SavedState(Bundle bundle) {
        this.f1002a = bundle;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f1002a);
    }

    public Fragment$SavedState(Parcel parcel, ClassLoader classLoader) {
        Bundle readBundle = parcel.readBundle();
        this.f1002a = readBundle;
        if (classLoader != null && readBundle != null) {
            readBundle.setClassLoader(classLoader);
        }
    }
}
