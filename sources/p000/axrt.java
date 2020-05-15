package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;

/* renamed from: axrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axrt extends dcj implements axrv {
    public axrt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IWearableListener");
    }

    /* renamed from: a */
    public final void mo53366a(DataHolder dataHolder) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataHolder);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo53367a(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
        throw null;
    }

    /* renamed from: b */
    public final void mo53374b(NodeParcelable nodeParcelable) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, nodeParcelable);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo53368a(AncsNotificationParcelable ancsNotificationParcelable) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, ancsNotificationParcelable);
        mo8530c(6, bj);
    }

    /* renamed from: a */
    public final void mo53369a(CapabilityInfoParcelable capabilityInfoParcelable) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, capabilityInfoParcelable);
        mo8530c(8, bj);
    }

    /* renamed from: a */
    public final void mo53370a(ChannelEventParcelable channelEventParcelable) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, channelEventParcelable);
        mo8530c(7, bj);
    }

    /* renamed from: a */
    public final void mo53371a(MessageEventParcelable messageEventParcelable) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, messageEventParcelable);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo53372a(NodeParcelable nodeParcelable) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, nodeParcelable);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo53373a(List list) {
        Parcel bj = mo8529bj();
        bj.writeTypedList(list);
        mo8530c(5, bj);
    }
}
