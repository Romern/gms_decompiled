package android.support.p002v7.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v7.widget.ActionMenuPresenter$SavedState */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ActionMenuPresenter$SavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1484xg();

    /* renamed from: a */
    public int f1162a;

    public ActionMenuPresenter$SavedState() {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1162a);
    }

    public ActionMenuPresenter$SavedState(Parcel parcel) {
        this.f1162a = parcel.readInt();
    }
}
