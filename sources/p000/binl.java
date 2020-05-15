package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.places.p095ui.placepicker.views.expandingscrollview.ExpandingScrollView;

/* renamed from: binl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class binl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ExpandingScrollView.SavedState(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ExpandingScrollView.SavedState[i];
    }
}
