package p000;

import android.content.Context;
import android.content.Intent;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ayqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayqb extends dck implements IInterface {

    /* renamed from: a */
    private final Context f98227a;

    public ayqb() {
        super("com.google.android.libraries.bluetooth.fastpair.IFastPairDeviceDetailService");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final TrueWirelessHeadset mo54218a(String str) {
        boolean z;
        ahzn ahzn = new ahzn(this.f98227a);
        ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: Device detail service try to bind DiscoveryService");
        bqgy c = bqgy.m112818c();
        if (ahzn.f68477b == null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Don't reuse the DiscoveryServiceBinder!");
        ahzn.f68477b = new ahzm("nearby", c);
        Intent b = butb.m120417b(ahzn.f68476a);
        b.setAction("com.google.android.gms.nearby.discovery:ACTION_DEVICE_DETAILS_SLICE");
        skh.m35531a().mo25690a(ahzn.f68476a, b, ahzn.f68477b, 1);
        try {
            TrueWirelessHeadset a = ((burx) c.get(15000, TimeUnit.MILLISECONDS)).mo73070a(str);
            ahzn.mo37318a();
            return a;
        } catch (RemoteException | InterruptedException | ExecutionException | TimeoutException e) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("FastPair: Exception when try to getTrueWirelessHeadset");
            ahzn.mo37318a();
            return null;
        } catch (Throwable th) {
            ahzn.mo37318a();
            throw th;
        }
    }

    public ayqb(Context context) {
        super("com.google.android.libraries.bluetooth.fastpair.IFastPairDeviceDetailService");
        this.f98227a = context;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        TrueWirelessHeadset a = mo54218a(parcel.readString());
        parcel2.writeNoException();
        dcl.m8169b(parcel2, a);
        return true;
    }
}
