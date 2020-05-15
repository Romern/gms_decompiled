package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattServerCallback;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import com.felicanetworks.mfc.Felica;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: xuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xuc extends BluetoothGattServerCallback {

    /* renamed from: a */
    public static final byte[] f53120a = {32};

    /* renamed from: o */
    public static final sek f53121o = new sek(new String[]{"CtapBleGattServer"}, (short[]) null);

    /* renamed from: b */
    BluetoothGattCharacteristic f53122b;

    /* renamed from: c */
    BluetoothGattCharacteristic f53123c;

    /* renamed from: d */
    BluetoothGattCharacteristic f53124d;

    /* renamed from: e */
    BluetoothGattCharacteristic f53125e;

    /* renamed from: f */
    BluetoothGattCharacteristic f53126f;

    /* renamed from: g */
    BluetoothGattDescriptor f53127g;

    /* renamed from: h */
    public BluetoothGattServer f53128h;

    /* renamed from: i */
    public BluetoothGattService f53129i;

    /* renamed from: j */
    public final Context f53130j;

    /* renamed from: k */
    public final xwj f53131k;

    /* renamed from: l */
    public final xwn f53132l;

    /* renamed from: m */
    public xub f53133m;

    /* renamed from: n */
    public bqgy f53134n;

    /* renamed from: p */
    private final xtx f53135p;

    /* renamed from: q */
    private final Map f53136q = new HashMap();

    /* renamed from: r */
    private final xtd f53137r;

    public xuc(Context context, xwj xwj, xtd xtd, xtx xtx, xwn xwn) {
        this.f53130j = context;
        this.f53131k = xwj;
        this.f53137r = xtd;
        this.f53135p = xtx;
        bmxy.m108581a(xwn);
        this.f53132l = xwn;
    }

    /* renamed from: b */
    private final int m43409b(BluetoothDevice bluetoothDevice) {
        int i = 20;
        if (this.f53136q.containsKey(bluetoothDevice.getAddress())) {
            i = bqcn.m112577a(((Integer) this.f53136q.get(bluetoothDevice.getAddress())).intValue(), 20, 512);
        }
        return i - 3;
    }

    /* renamed from: a */
    public final boolean mo30143a(BluetoothDevice bluetoothDevice) {
        xub xub = this.f53133m;
        return xub != null && xub.f53113g.getAddress().equals(bluetoothDevice.getAddress());
    }

    public final void onCharacteristicReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super.onCharacteristicReadRequest(bluetoothDevice, i, i2, bluetoothGattCharacteristic);
        bmxy.m108581a(this.f53128h);
        UUID uuid = bluetoothGattCharacteristic.getUuid();
        if (uuid.equals(xiv.f52381b)) {
            int b = m43409b(bluetoothDevice);
            this.f53124d.setValue(new byte[]{(byte) ((b >> 8) & 255), (byte) (b & 255)});
        }
        if (uuid.equals(xiv.f52381b) || uuid.equals(xiv.f52384e) || uuid.equals(xiv.f52385f)) {
            f53121o.mo25414c("Read request for characteristic: %s", bluetoothGattCharacteristic.getUuid());
            this.f53128h.sendResponse(bluetoothDevice, i, 0, i2, bluetoothGattCharacteristic.getValue());
            return;
        }
        f53121o.mo25418e("Read request for invalid characteristic: %s", bluetoothGattCharacteristic.getUuid());
        this.f53128h.sendResponse(bluetoothDevice, i, 257, i2, null);
    }

    public final void onCharacteristicWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2, int i2, byte[] bArr) {
        int i3;
        super.onCharacteristicWriteRequest(bluetoothDevice, i, bluetoothGattCharacteristic, z, z2, i2, bArr);
        bmxy.m108581a(this.f53128h);
        boolean z3 = true;
        if (z) {
            f53121o.mo25418e("Prepared write not supported.", new Object[0]);
            z3 = false;
        } else {
            xub xub = this.f53133m;
            if (xub != null) {
                bmxy.m108581a(xub);
                if (!bluetoothGattCharacteristic.getUuid().equals(xiv.f52380a)) {
                    f53121o.mo25418e("Write request received to unknown characteristic: %s", bluetoothGattCharacteristic);
                    z3 = false;
                } else if (!mo30143a(bluetoothDevice)) {
                    f53121o.mo25418e("Only one concurrent active Client is supported.", new Object[0]);
                    z3 = false;
                } else if (!this.f53133m.f53116j) {
                    f53121o.mo25418e("Client must first register notifications on FIDO status characteristic.", new Object[0]);
                    z3 = false;
                } else {
                    f53121o.mo25414c("Received fragment of %s bytes.", Integer.valueOf(bArr.length));
                    xub xub2 = this.f53133m;
                    xub2.f53115i.post(new xtv(xub2, bArr));
                }
            } else {
                bmxy.m108600b(true);
                if (!bluetoothGattCharacteristic.getUuid().equals(xiv.f52384e)) {
                    f53121o.mo25418e("Expected write to fidoServiceRevisionBitfield, but got %s", bluetoothGattCharacteristic);
                    z3 = false;
                } else if (!Arrays.equals(f53120a, bArr)) {
                    f53121o.mo25418e("Invalid fidoServiceRevisionBitfield value: 0x%s", srv.m36160a(bArr));
                    z3 = false;
                }
            }
        }
        if (z2) {
            if (!z3) {
                i3 = 257;
            } else {
                i3 = 0;
            }
            this.f53128h.sendResponse(bluetoothDevice, i, i3, i2, null);
        }
    }

    public final void onConnectionStateChange(BluetoothDevice bluetoothDevice, int i, int i2) {
        super.onConnectionStateChange(bluetoothDevice, i, i2);
        if (i2 == 2) {
            f53121o.mo25414c("New device connected: %s", bluetoothDevice);
        } else if (i2 == 0) {
            this.f53136q.remove(bluetoothDevice.getAddress());
            if (mo30143a(bluetoothDevice)) {
                this.f53132l.mo30194a(this.f53131k, xaj.TYPE_CABLE_CLIENT_CONNECTION_TERMINATED_CLIENT_DISCONNECTED);
                f53121o.mo25414c("Client disconnected: %s", bluetoothDevice);
                this.f53133m.mo30141b();
                this.f53133m = null;
            }
        }
    }

    public final void onDescriptorWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattDescriptor bluetoothGattDescriptor, boolean z, boolean z2, int i2, byte[] bArr) {
        boolean z3;
        boolean z4;
        super.onDescriptorWriteRequest(bluetoothDevice, i, bluetoothGattDescriptor, z, z2, i2, bArr);
        bmxy.m108581a(this.f53128h);
        boolean z5 = true;
        if (z) {
            f53121o.mo25418e("Prepared write not supported.", new Object[0]);
            z5 = false;
        } else if (!bluetoothGattDescriptor.getUuid().equals(xiv.f52386g)) {
            f53121o.mo25418e("Unexpected write request to descriptor %s.", bluetoothGattDescriptor.getUuid());
            z5 = false;
        } else if (this.f53133m == null || mo30143a(bluetoothDevice)) {
            boolean z6 = bArr[0] == 1;
            f53121o.mo25414c("Set notification enabled: %s", Boolean.valueOf(z6));
            if (!z6) {
                this.f53132l.mo30194a(this.f53131k, xaj.TYPE_CABLE_CLIENT_CONNECTION_TERMINATED_NOTIFICATION_UNREGISTERED);
                xub xub = this.f53133m;
                if (xub != null) {
                    xub.mo30141b();
                    this.f53133m = null;
                }
            } else {
                if (this.f53133m == null) {
                    this.f53132l.mo30194a(this.f53131k, xaj.TYPE_CABLE_CLIENT_CONNECTED);
                    f53121o.mo25414c("Active Client connection created for %s", bluetoothDevice);
                    xtx xtx = this.f53135p;
                    this.f53133m = new xtn(this.f53131k, this, bluetoothDevice, m43409b(bluetoothDevice), new xjv(xtx.f53100b, xtx.f53099a), this.f53132l);
                }
                xub xub2 = this.f53133m;
                xub2.f53116j = true;
                xtd xtd = this.f53137r;
                if (xtd.f53032b.f53052f == xtj.ADVERTISING_TO_CLIENT) {
                    xtk.f53046k.mo25414c("  Client connected!", new Object[0]);
                    xtk xtk = xtd.f53032b;
                    bmxv bmxv = xtd.f53031a;
                    if (xtk.f53052f == xtj.ADVERTISING_TO_CLIENT) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    sdo.m34970a(z3);
                    xtk.f53052f = xtj.CLIENT_CONNECTED;
                    xtk.f53046k.mo25414c("State: CLIENT_CONNECTED", new Object[0]);
                    xtk.f53055i = new xtu(xtk.f53047a, xtk.f53048b, xtk.f53050d, xhu.f52320a, xtk.f53051e);
                    xtk.f53054h = xub2;
                    xub xub3 = xtk.f53054h;
                    xtg xtg = new xtg(xtk, bmxv);
                    if (xub3.f53119n == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    sdo.m34970a(z4);
                    xub3.f53119n = xtg;
                    xtk.mo30120a(Felica.MAX_TIMEOUT, xaj.TYPE_TIMEOUT_CLIENT_CONNECTION_DURATION_EXCEEDED);
                }
            }
        } else {
            f53121o.mo25418e("CCD written but another Client is already connected.", bluetoothDevice);
            z5 = false;
        }
        if (z2) {
            this.f53128h.sendResponse(bluetoothDevice, i, !z5 ? 257 : 0, i2, null);
        }
    }

    public final void onMtuChanged(BluetoothDevice bluetoothDevice, int i) {
        sek sek = f53121o;
        Integer valueOf = Integer.valueOf(i);
        sek.mo25414c("MTU size for %s changed to %s", bluetoothDevice, valueOf);
        this.f53136q.put(bluetoothDevice.getAddress(), valueOf);
    }

    public final void onNotificationSent(BluetoothDevice bluetoothDevice, int i) {
        bqgy bqgy;
        if (mo30143a(bluetoothDevice) && (bqgy = this.f53134n) != null) {
            this.f53134n = null;
            if (i != 257) {
                sek sek = f53121o;
                String valueOf = String.valueOf(bluetoothDevice);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb.append("Successfully sent notification to: ");
                sb.append(valueOf);
                sek.mo25414c(sb.toString(), new Object[0]);
                bqgy.mo69138b((Object) true);
                return;
            }
            f53121o.mo25418e("Sending notification failed.", new Object[0]);
            bqgy.mo69138b((Object) false);
        }
    }
}
