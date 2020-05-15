package p000;

import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.os.Build;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.concurrent.TimeUnit;

/* renamed from: ahcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahcm {

    /* renamed from: a */
    final /* synthetic */ ahcn f66995a;

    /* renamed from: b */
    private ahga f66996b;

    /* renamed from: c */
    private ahcl f66997c;

    /* renamed from: d */
    private boolean f66998d = false;

    public ahcm(ahcn ahcn) {
        this.f66995a = ahcn;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bd, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo36299a() {
        int i = Build.VERSION.SDK_INT;
        if (this.f66998d) {
            bnsl bnsl = (bnsl) ahcn.f66999a.mo68388c();
            bnsl.mo68432a("ahcm", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("BluetoothTargetDevice: already BLE advertising. skip");
            return;
        }
        ahga a = ahga.m55680a();
        this.f66996b = a;
        if (a == null) {
            bnsl bnsl2 = (bnsl) ahcn.f66999a.mo68388c();
            bnsl2.mo68432a("ahcm", "a", 160, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("BluetoothTargetDevice: Device failed to get advertiser");
            return;
        }
        boolean z = false;
        AdvertiseSettings build = new AdvertiseSettings.Builder().setAdvertiseMode(2).setTxPowerLevel(2).setConnectable(false).build();
        AdvertiseData.Builder builder = new AdvertiseData.Builder();
        ahcn ahcn = this.f66995a;
        byte[] a2 = ahce.m55451a(ahcn.f67030l, ahcn.f67031m, ahcn.f67032n);
        int length = a2.length;
        byte[] bArr = new byte[(length + 2)];
        bArr[0] = (byte) (length + 1);
        bArr[1] = 16;
        System.arraycopy(a2, 0, bArr, 2, length);
        AdvertiseData build2 = builder.addManufacturerData(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, bArr).build();
        ahcl ahcl = new ahcl();
        this.f66997c = ahcl;
        if (this.f66996b.mo36416a(build, build2, ahcl)) {
            ahcl ahcl2 = this.f66997c;
            try {
                if (ahcl2.f66993a.await(3000, TimeUnit.MILLISECONDS)) {
                    z = ahcl2.f66994b;
                }
            } catch (InterruptedException e) {
                bnsl bnsl3 = (bnsl) ahcn.f66999a.mo68388c();
                bnsl3.mo68432a("ahcl", "a", 223, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("BluetoothTargetDevice: Timed out waiting for BLE advertising to start");
            }
            this.f66998d = z;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized void mo36300b() {
        ahga ahga = this.f66996b;
        if (ahga != null && this.f66998d) {
            ahga.mo36415a(this.f66997c);
        }
    }
}
