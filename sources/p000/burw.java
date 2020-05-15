package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: burw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class burw extends dck implements burx {

    /* renamed from: a */
    private final Context f154795a;

    /* renamed from: b */
    private final ahwk f154796b;

    /* renamed from: c */
    private final ahst f154797c;

    /* renamed from: d */
    private buru f154798d;

    /* renamed from: e */
    private ahxj f154799e;

    public burw() {
        super("com.google.location.nearby.common.fastpair.IDeviceStatusService");
    }

    /* renamed from: a */
    private final aiaa m120346a(ahyz ahyz) {
        ahza ahza;
        if ((ahyz.f68427a & 1024) != 0) {
            aiaa aiaa = ahyz.f68439n;
            return aiaa == null ? aiaa.f68501K : aiaa;
        }
        bxtx bxtx = ahyz.f68429c;
        try {
            List list = (List) this.f154798d.mo73054a().get();
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        ahza = null;
                        break;
                    }
                    ahza = (ahza) it.next();
                    if (ahza.f68444b.equals(bxtx)) {
                        break;
                    }
                }
                if (ahza == null) {
                    return null;
                }
                try {
                    return (aiaa) bxvk.m124016a(aiaa.f68501K, ahza.f68445c.mo73780k(), bxus.m123744c());
                } catch (bxwf e) {
                    bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68405a("getStoredDiscoveryItem: Failed to parse device.");
                    return null;
                }
            } else {
                srn srn = ahsd.f67925a;
                return null;
            }
        } catch (InterruptedException | ExecutionException e2) {
            srn srn2 = ahsd.f67925a;
            return null;
        }
    }

    /* renamed from: b */
    private static boolean m120347b(ahyz ahyz) {
        return !ahyz.f68433g.isEmpty() && !ahyz.f68433g.equals(ahyz.f68432f);
    }

    public burw(Context context) {
        super("com.google.location.nearby.common.fastpair.IDeviceStatusService");
        this.f154795a = context;
        this.f154796b = (ahwk) ahgz.m55754a(context, ahwk.class);
        this.f154797c = (ahst) ahgz.m55754a(context, ahst.class);
        this.f154798d = (buru) ahgz.m55754a(context, buru.class);
        this.f154799e = (ahxj) ahgz.m55754a(context, ahxj.class);
    }

    /* renamed from: b */
    public final DeviceDetailsLinks mo73073b(String str) {
        if (str == null) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("address is null in getDeviceDetailsLinks.");
            return null;
        }
        ahyz a = this.f154797c.mo37033a(str);
        if (a == null || (a.f68427a & 2) == 0) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("storedFastPairItem of DeviceStatusBinder is invalid. Address=%s", str);
            return null;
        }
        aiaa a2 = m120346a(a);
        if (a2 == null) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("storedDiscoveryItem of DeviceStatusBinder is null.");
            return null;
        }
        butd h = DeviceDetailsLinks.m151151h();
        h.mo73102a(a.f68429c.mo73780k());
        byzb byzb = a2.f68511I;
        if (byzb == null) {
            byzb = byzb.f169045j;
        }
        h.mo73101a(byzb.f169051e);
        h.mo73100a(a2.f68518f);
        h.mo73103b(str);
        h.mo73104b(m120347b(a));
        bvki bvki = a2.f68512J;
        if (bvki == null) {
            bvki = bvki.f156415c;
        }
        h.mo73105c(bvki.f156417a);
        bvki bvki2 = a2.f68512J;
        if (bvki2 == null) {
            bvki2 = bvki.f156415c;
        }
        h.mo73106d(bvki2.f156418b);
        return h.mo73099a();
    }

    /* renamed from: a */
    public final TrueWirelessHeadset mo73070a(String str) {
        BatteryAdvertisement a = this.f154796b.mo37231a(str);
        if (a != null) {
            return a.mo44195a();
        }
        return null;
    }

    /* renamed from: a */
    public final String mo73071a(byte[] bArr) {
        if (bArr == null) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: DetailPage: Account key is null");
            return null;
        }
        ahyz a = this.f154797c.mo37032a(bxtx.m123261a(bArr));
        if (a != null) {
            return a.f68428b;
        }
        return null;
    }

    /* renamed from: a */
    public final List mo73072a() {
        ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: getFirmwareUpdatableItems called");
        bngs bngs = new bngs();
        for (ahyz ahyz : this.f154797c.mo37050d()) {
            if (m120347b(ahyz)) {
                aiaa a = m120346a(ahyz);
                if (a == null) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: Can't find StoredDiscoveryItem for address : %s ", ahyz.f68428b);
                } else {
                    String b = busp.m120393b(a.f68518f);
                    if (TextUtils.isEmpty(b)) {
                        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: Can't find companionPackageName from device : %s", a.f68520h);
                    } else {
                        ahsu ahsu = new ahsu(this.f154795a, a);
                        bngs.mo67668c(new DiscoveryListItem(ahsu.mo37084i(), ahsu.mo37086k(), this.f154795a.getString(C0126R.string.common_firmware_update), null, b, -1.0f, null, null, false, ahsu.mo37085j(), null, ahsu.mo37054A(), true, ahsu.mo37102z(), ahyz.f68428b));
                        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: getFirmwareUpdatableItems add %s to list.", a.f68520h);
                    }
                }
            }
        }
        return bngs.mo67664a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String, int, int]
     candidates:
      bnsi.a(java.lang.String, java.lang.String, int, java.lang.String):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        int i2;
        boolean z = false;
        r1 = false;
        r1 = false;
        r1 = false;
        boolean z2 = false;
        int i3 = 0;
        switch (i) {
            case 2:
                TrueWirelessHeadset a = mo73070a(parcel.readString());
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a);
                break;
            case 3:
                DeviceDetailsLinks b = mo73073b(parcel.readString());
                parcel2.writeNoException();
                dcl.m8169b(parcel2, b);
                break;
            case 4:
                String a2 = mo73071a(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeString(a2);
                break;
            case 5:
                List a3 = mo73072a();
                parcel2.writeNoException();
                parcel2.writeTypedList(a3);
                break;
            case 6:
                String readString = parcel.readString();
                boolean a4 = dcl.m8167a(parcel);
                boolean a5 = dcl.m8167a(parcel);
                BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(readString);
                if (!a4) {
                    i2 = 0;
                } else {
                    i2 = 2;
                }
                if (a5) {
                    i2 |= 1;
                }
                byte b2 = (byte) i2;
                ((bnsl) ahsd.f67925a.mo68390d()).mo68406a("FastPair: sendRingEventStream data = %d", b2);
                byte[] bArr = {b2};
                ahxk ahxk = (ahxk) this.f154799e.f68288b.get(remoteDevice);
                if (ahxk == null || !ahxk.mo37265b()) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("EventStreamManager: Failed to send ring, not connected.");
                } else {
                    ahxk.mo37263a(4, 1, bArr);
                    z = true;
                }
                parcel2.writeNoException();
                dcl.m8166a(parcel2, z);
                break;
            case 7:
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                ahxj ahxj = this.f154799e;
                String a6 = ahxj.m56838a(readInt, readInt2);
                try {
                    if (ahxj.f68289c.containsKey(readString2)) {
                        if (((Map) ahxj.f68289c.get(readString2)).containsKey(a6)) {
                            ((bnsl) ahsd.f67925a.mo68390d()).mo68426a("FindDevice: Device response contains information for %s: %s (eventGroup: %s, eventCode: %s)", readString2, ((Map) ahxj.f68289c.get(readString2)).get(a6), Integer.valueOf(readInt), Integer.valueOf(readInt2));
                            i3 = ((Integer) ((Map) ahxj.f68289c.get(readString2)).get(a6)).intValue();
                            parcel2.writeNoException();
                            parcel2.writeInt(i3);
                            break;
                        }
                    }
                } catch (NullPointerException e) {
                    bnsl bnsl = (bnsl) ahsd.f67925a.mo68390d();
                    bnsl.mo68437a(e);
                    bnsl.mo68405a("FindDevice: check active component through RFcomm failed");
                }
                ((bnsl) ahsd.f67925a.mo68390d()).mo68425a("FindDevice: Device response did not contain information for %s and group %s code %s", readString2, Integer.valueOf(readInt), Integer.valueOf(readInt2));
                parcel2.writeNoException();
                parcel2.writeInt(i3);
            case 8:
                byte[] createByteArray = parcel.createByteArray();
                byte[] bArr2 = null;
                bArr2 = null;
                bArr2 = null;
                if (createByteArray == null) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: getStoredDiscoveryItem: Account key is null");
                } else {
                    ahyz a7 = this.f154797c.mo37032a(bxtx.m123261a(createByteArray));
                    if (a7 == null) {
                        ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: getStoredDiscoveryItem: can't find StoredFastPairItem.");
                    } else {
                        aiaa a8 = m120346a(a7);
                        if (a8 != null) {
                            bArr2 = a8.mo73642k();
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeByteArray(bArr2);
                break;
            case 9:
                String readString3 = parcel.readString();
                BluetoothDevice remoteDevice2 = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(readString3);
                ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: send check active component data %s", readString3);
                ahxj ahxj2 = this.f154799e;
                ahxk ahxk2 = (ahxk) ahxj2.f68288b.get(remoteDevice2);
                if (ahxk2 == null || !ahxk2.mo37265b()) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FindDevice: medium is null or is not connected");
                    if (cfoj.f184966a.mo6606a().mo82071V()) {
                        String address = remoteDevice2.getAddress();
                        Map map = (Map) ahxj2.f68289c.get(address);
                        if (map == null) {
                            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FindDevice: Response map for %s not found", address);
                        } else if (map.remove(ahxj.m56838a(3, 5)) == null) {
                            ((bnsl) ahsd.f67925a.mo68390d()).mo68425a("FindDevice: Response for device %s, eventGroup %s, eventCode %s not found", (Object) address, (Object) 3, (Object) 5);
                        }
                    }
                } else {
                    ahxk2.mo37263a(3, 5, new byte[0]);
                    z2 = true;
                }
                parcel2.writeNoException();
                dcl.m8166a(parcel2, z2);
                break;
            default:
                return false;
        }
        return true;
    }
}
