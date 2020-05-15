package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.content.Context;
import android.os.Build;
import android.os.ParcelUuid;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.UUID;

/* renamed from: ajxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajxb extends ajxe {

    /* renamed from: e */
    private final BluetoothAdapter f71490e = BluetoothAdapter.getDefaultAdapter();

    /* renamed from: f */
    private ahga f71491f;

    /* renamed from: g */
    private final int f71492g;

    /* renamed from: h */
    private final int f71493h;

    /* renamed from: i */
    private AdvertiseCallback f71494i;

    public ajxb(Context context, boolean z, int i, int i2) {
        super(context, z, new ajxg(context), new ajxc(context));
        this.f71492g = i;
        this.f71493h = i2;
    }

    /* renamed from: f */
    private final boolean m59166f() {
        BluetoothAdapter bluetoothAdapter;
        int i = Build.VERSION.SDK_INT;
        return this.f71497a.getPackageManager().hasSystemFeature("android.hardware.bluetooth") && this.f71497a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") && (bluetoothAdapter = this.f71490e) != null && this.f71491f != null && bluetoothAdapter.isEnabled() && this.f71490e.isMultipleAdvertisementSupported();
    }

    /* renamed from: b */
    public final void mo39061b() {
        if (m59166f()) {
            AdvertiseCallback advertiseCallback = this.f71494i;
            if (advertiseCallback == null) {
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68387b();
                bnsl.mo68432a("ajxb", "b", 138, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Failed to stop BLE advertising experiment %s. Never started", this);
                return;
            }
            ahga ahga = this.f71491f;
            if (ahga == null) {
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68387b();
                bnsl2.mo68432a("ajxb", "b", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("Failed to stop BLE advertising experiment %s. Unexpected state.", this);
                return;
            }
            ahga.mo36415a(advertiseCallback);
            this.f71494i = null;
            return;
        }
        srn srn = ajvp.f71371a;
    }

    /* renamed from: a */
    public final void mo39060a() {
        int i = Build.VERSION.SDK_INT;
        this.f71491f = ahga.m55680a();
        if (m59166f()) {
            ahga ahga = this.f71491f;
            if (ahga != null) {
                AdvertiseData build = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false).addServiceUuid(new ParcelUuid(UUID.randomUUID())).build();
                AdvertiseSettings build2 = new AdvertiseSettings.Builder().setAdvertiseMode(this.f71492g).setTxPowerLevel(this.f71493h).setConnectable(false).build();
                ajxa ajxa = new ajxa();
                if (!ahga.mo36416a(build2, build, ajxa)) {
                    bnsl bnsl = (bnsl) ajvp.f71371a.mo68387b();
                    bnsl.mo68432a("ajxb", "a", 115, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Failed to start BLE advertising experiment %s", this);
                    return;
                }
                this.f71494i = ajxa;
                srn srn = ajvp.f71371a;
                return;
            }
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68387b();
            bnsl2.mo68432a("ajxb", "a", 72, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Failed to start BLE advertising experiment %s. Unexpected state.", this);
            return;
        }
        srn srn2 = ajvp.f71371a;
    }
}
