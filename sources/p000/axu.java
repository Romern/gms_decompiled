package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.airbnb.lottie.LottieAnimationView;

/* renamed from: axu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new LottieAnimationView.SavedState(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LottieAnimationView.SavedState[i];
    }
}
