package p000;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: arq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SwipeRefreshLayout.SavedState(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SwipeRefreshLayout.SavedState[i];
    }
}
