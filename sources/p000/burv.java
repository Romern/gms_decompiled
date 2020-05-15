package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks;
import java.util.ArrayList;
import java.util.List;

/* renamed from: burv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class burv extends dcj implements burx {
    public burv(IBinder iBinder) {
        super(iBinder, "com.google.location.nearby.common.fastpair.IDeviceStatusService");
    }

    /* renamed from: a */
    public final TrueWirelessHeadset mo73070a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        Parcel a = mo8526a(2, bj);
        TrueWirelessHeadset trueWirelessHeadset = (TrueWirelessHeadset) dcl.m8163a(a, TrueWirelessHeadset.CREATOR);
        a.recycle();
        return trueWirelessHeadset;
    }

    /* renamed from: b */
    public final DeviceDetailsLinks mo73073b(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        Parcel a = mo8526a(3, bj);
        DeviceDetailsLinks deviceDetailsLinks = (DeviceDetailsLinks) dcl.m8163a(a, DeviceDetailsLinks.CREATOR);
        a.recycle();
        return deviceDetailsLinks;
    }

    /* renamed from: a */
    public final String mo73071a(byte[] bArr) {
        Parcel bj = mo8529bj();
        bj.writeByteArray(bArr);
        Parcel a = mo8526a(4, bj);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final List mo73072a() {
        Parcel a = mo8526a(5, mo8529bj());
        ArrayList createTypedArrayList = a.createTypedArrayList(DiscoveryListItem.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }
}
