package p000;

import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.content.Context;
import android.os.ParcelUuid;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: buwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buwq {

    /* renamed from: a */
    public final bvbu f155177a;

    /* renamed from: b */
    public final buwt f155178b;

    /* renamed from: c */
    public boolean f155179c = false;

    /* renamed from: d */
    public buwp f155180d;

    public buwq(Context context, buwt buwt) {
        this.f155178b = buwt;
        this.f155177a = (bvbu) ahgz.m55754a(context, bvbu.class);
    }

    /* renamed from: a */
    public final ahga mo73192a() {
        ahga a = ahga.m55680a();
        if (a == null) {
            if (this.f155178b.mo73212k()) {
                srn srn = bvcm.f155598a;
                this.f155178b.mo73215n().edit().putBoolean("IS_BLE_ADVERTISING_SUPPORTED", false).commit();
            } else {
                bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
                bnsl.mo68432a("buwq", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("BleAdvertiseImplL: Failed to get advertiser. Bluetooth is off (must be enabled).");
            }
        }
        return a;
    }

    /* renamed from: b */
    public final void mo73194b() {
        buwp buwp;
        srn srn = bvcm.f155598a;
        ahga a = mo73192a();
        if (!(a == null || (buwp = this.f155180d) == null)) {
            a.mo36415a(buwp);
            this.f155180d = null;
        }
        this.f155179c = false;
    }

    /* renamed from: a */
    public final boolean mo73193a(int i, UUID uuid, byte[] bArr, boolean z, buyv buyv) {
        if (this.f155179c) {
            mo73194b();
        }
        srn srn = bvcm.f155598a;
        ahga a = mo73192a();
        if (a != null) {
            AdvertiseSettings build = new AdvertiseSettings.Builder().setAdvertiseMode(2).setTxPowerLevel(i).setConnectable(z).build();
            AdvertiseData.Builder builder = new AdvertiseData.Builder();
            boolean z2 = true;
            if (buyv == buyv.BLE_ADVERTISE_MANUFACTURER_DATA) {
                int length = bArr.length;
                byte[] bArr2 = new byte[(length + 2)];
                bArr2[0] = (byte) (length + 1);
                bArr2[1] = 16;
                System.arraycopy(bArr, 0, bArr2, 2, length);
                builder.addManufacturerData(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, bArr2);
            } else if (uuid != null) {
                ParcelUuid parcelUuid = new ParcelUuid(uuid);
                builder.addServiceUuid(parcelUuid).addServiceData(parcelUuid, bArr);
            } else {
                bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
                bnsl.mo68432a("buwq", "a", 74, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("BleAdvertise: does not support advertise service data without uuid.");
                return false;
            }
            this.f155180d = new buwp();
            if (!a.mo36416a(build, builder.build(), this.f155180d)) {
                bnsl bnsl2 = (bnsl) bvcm.f155598a.mo68387b();
                bnsl2.mo68432a("buwq", "a", 82, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("BleAdvertise: failed to start advertising.");
                return false;
            }
            buwp buwp = this.f155180d;
            byya byya = this.f155177a.f155567b.f168925h;
            if (byya == null) {
                byya = byya.f168860j;
            }
            try {
                if (!buwp.f155175a.await(byya.f168865d, TimeUnit.MILLISECONDS)) {
                    z2 = false;
                } else if (!buwp.f155176b) {
                    z2 = false;
                }
            } catch (InterruptedException e) {
                bnsl bnsl3 = (bnsl) bvcm.f155598a.mo68388c();
                bnsl3.mo68432a("buwp", "a", 143, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("BleAdvertiseImplL: timed out waiting for advertising to start");
                z2 = false;
            }
            this.f155179c = z2;
        }
        if (!this.f155179c) {
            mo73194b();
        }
        return this.f155179c;
    }
}
