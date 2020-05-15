package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.analytics.events.OrchestrationApiEvent;

/* renamed from: awde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awde implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new OrchestrationApiEvent(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OrchestrationApiEvent[i];
    }
}
