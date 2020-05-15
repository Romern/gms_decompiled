package p000;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;

/* renamed from: agu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ActivityResult(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ActivityResult[i];
    }
}
