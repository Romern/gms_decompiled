package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.settings.ConnectedApp;

/* renamed from: zpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zpg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConnectedApp[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ConnectedApp(parcel.readString(), parcel.readString(), parcel.createIntArray());
    }
}
