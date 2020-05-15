package p000;

import android.os.Parcel;
import com.google.android.gms.clearcut.CollectForDebugParcelable;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: rbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class rbf extends dck implements rbg {
    public rbf() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mo24340a((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 2:
                mo24345b((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 3:
                mo24341a((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 4:
                mo24348c((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 5:
                mo24346b((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 6:
                mo24343a((Status) dcl.m8163a(parcel, Status.CREATOR), (LogEventParcelable[]) parcel.createTypedArray(LogEventParcelable.CREATOR));
                return true;
            case 7:
                mo24344a((DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR));
                return true;
            case 8:
                mo24342a((Status) dcl.m8163a(parcel, Status.CREATOR), (CollectForDebugParcelable) dcl.m8163a(parcel, CollectForDebugParcelable.CREATOR));
                return true;
            case 9:
                mo24347b((Status) dcl.m8163a(parcel, Status.CREATOR), (CollectForDebugParcelable) dcl.m8163a(parcel, CollectForDebugParcelable.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
