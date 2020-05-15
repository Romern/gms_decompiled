package p000;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;

/* renamed from: axru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class axru extends dck implements axrv {
    public axru() {
        super("com.google.android.gms.wearable.internal.IWearableListener");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mo53366a((DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR));
                return true;
            case 2:
                mo53371a((MessageEventParcelable) dcl.m8163a(parcel, MessageEventParcelable.CREATOR));
                return true;
            case 3:
                mo53372a((NodeParcelable) dcl.m8163a(parcel, NodeParcelable.CREATOR));
                return true;
            case 4:
                mo53374b((NodeParcelable) dcl.m8163a(parcel, NodeParcelable.CREATOR));
                return true;
            case 5:
                mo53373a(parcel.createTypedArrayList(NodeParcelable.CREATOR));
                return true;
            case 6:
                mo53368a((AncsNotificationParcelable) dcl.m8163a(parcel, AncsNotificationParcelable.CREATOR));
                return true;
            case 7:
                mo53370a((ChannelEventParcelable) dcl.m8163a(parcel, ChannelEventParcelable.CREATOR));
                return true;
            case 8:
                mo53369a((CapabilityInfoParcelable) dcl.m8163a(parcel, CapabilityInfoParcelable.CREATOR));
                return true;
            case 9:
                mo53367a((AmsEntityUpdateParcelable) dcl.m8163a(parcel, AmsEntityUpdateParcelable.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
