package android.support.p002v7.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v7.widget.LinearLayoutManager$SavedState */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LinearLayoutManager$SavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aag();

    /* renamed from: a */
    public int f1224a;

    /* renamed from: b */
    public int f1225b;

    /* renamed from: c */
    public boolean f1226c;

    public LinearLayoutManager$SavedState() {
    }

    /* renamed from: a */
    public final boolean mo1417a() {
        return this.f1224a >= 0;
    }

    /* renamed from: b */
    public final void mo1418b() {
        this.f1224a = -1;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1224a);
        parcel.writeInt(this.f1225b);
        parcel.writeInt(this.f1226c ? 1 : 0);
    }

    public LinearLayoutManager$SavedState(Parcel parcel) {
        this.f1224a = parcel.readInt();
        this.f1225b = parcel.readInt();
        this.f1226c = parcel.readInt() != 1 ? false : true;
    }

    public LinearLayoutManager$SavedState(LinearLayoutManager$SavedState linearLayoutManager$SavedState) {
        this.f1224a = linearLayoutManager$SavedState.f1224a;
        this.f1225b = linearLayoutManager$SavedState.f1225b;
        this.f1226c = linearLayoutManager$SavedState.f1226c;
    }
}
