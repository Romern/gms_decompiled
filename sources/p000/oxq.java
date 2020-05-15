package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.carsetup.fsm.impl.FsmController$StackEntry;

/* renamed from: oxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oxq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new FsmController$StackEntry(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FsmController$StackEntry[i];
    }
}
