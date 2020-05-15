package android.support.p001v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.FragmentManagerState */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1051hk();

    /* renamed from: a */
    public ArrayList f1003a;

    /* renamed from: b */
    public ArrayList f1004b;

    /* renamed from: c */
    public BackStackState[] f1005c;

    /* renamed from: d */
    public int f1006d;

    /* renamed from: e */
    public String f1007e = null;

    /* renamed from: f */
    public ArrayList f1008f = new ArrayList();

    /* renamed from: g */
    public ArrayList f1009g = new ArrayList();

    public FragmentManagerState() {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f1003a);
        parcel.writeStringList(this.f1004b);
        parcel.writeTypedArray(this.f1005c, i);
        parcel.writeInt(this.f1006d);
        parcel.writeString(this.f1007e);
        parcel.writeStringList(this.f1008f);
        parcel.writeTypedList(this.f1009g);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f1003a = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f1004b = parcel.createStringArrayList();
        this.f1005c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f1006d = parcel.readInt();
        this.f1007e = parcel.readString();
        this.f1008f = parcel.createStringArrayList();
        this.f1009g = parcel.createTypedArrayList(Bundle.CREATOR);
    }
}
