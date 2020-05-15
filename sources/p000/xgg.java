package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.view.BleViewOptions;
import com.google.android.gms.fido.fido2.api.view.ViewOptions;
import com.google.android.gms.fido.u2f.api.view.BleSelectViewOptions;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xgg implements xgj, xiq, xim {

    /* renamed from: a */
    public final xoo f52175a;

    /* renamed from: b */
    public final xhi f52176b;

    /* renamed from: c */
    public final xin f52177c;

    /* renamed from: d */
    public final xiz f52178d;

    /* renamed from: e */
    public boolean f52179e;

    /* renamed from: f */
    public bmxv f52180f;

    /* renamed from: g */
    public bmxv f52181g;

    /* renamed from: h */
    private final bqgy f52182h = bqgy.m112818c();

    /* renamed from: i */
    private final BluetoothAdapter f52183i;

    /* renamed from: j */
    private final xgo f52184j;

    /* renamed from: k */
    private final xgn f52185k;

    /* renamed from: l */
    private boolean f52186l;

    public xgg(Context context, xoo xoo, xhi xhi, BluetoothAdapter bluetoothAdapter, xgn xgn, xiz xiz) {
        this.f52175a = xoo;
        this.f52176b = xhi;
        this.f52183i = bluetoothAdapter;
        this.f52184j = new xgo(bluetoothAdapter, this);
        this.f52185k = xgn;
        this.f52177c = new xin(context);
        this.f52178d = xiz;
        this.f52179e = false;
        this.f52186l = false;
        this.f52181g = bmvz.f131120a;
    }

    /* renamed from: a */
    public final bqgg mo29715a() {
        boolean a = this.f52185k.mo29737a();
        this.f52179e = !a;
        bmxv a2 = this.f52176b.mo29745a(2, new BleViewOptions(a));
        if (a2.mo66813a()) {
            this.f52175a.mo14261a(((ViewOptions) a2.mo66814b()).toString());
        }
        this.f52183i.startDiscovery();
        xgo xgo = this.f52184j;
        if (xgo.f52217a.isEnabled()) {
            if (xgo.f52219c == null) {
                xgo.f52219c = new xis(xgo.f52217a);
            }
            xgo.f52219c.mo29815a(xgo.f52218b);
        }
        return this.f52182h;
    }

    /* renamed from: b */
    public final void mo29717b() {
        if (!this.f52182h.isDone()) {
            this.f52182h.cancel(true);
        }
    }

    /* renamed from: c */
    public final Integer mo29718c() {
        return 2;
    }

    /* renamed from: d */
    public final void mo29719d() {
        this.f52178d.mo29824b();
    }

    /* renamed from: a */
    public final void mo29722a(int i) {
        try {
            bmxv a = this.f52176b.mo29745a(i, ViewOptions.m23543a(new JSONObject(new BleSelectViewOptions(this.f52186l, this.f52178d.mo29822a()).mo18664a().toString().replace("anyU2fDevicesPaired", "anyFido2DevicesPaired"))));
            if (a.mo66813a()) {
                this.f52175a.mo14261a(((ViewOptions) a.mo66814b()).toString());
            }
        } catch (JSONException e) {
        }
    }

    /* renamed from: a */
    public final void mo29723a(int i, BluetoothDevice bluetoothDevice) {
        if (this.f52180f.mo66813a() && ((BluetoothDevice) this.f52180f.mo66814b()).getAddress().equals(bluetoothDevice.getAddress())) {
            xrv xrv = xrv.MULTI_TRANSPORT;
            if (i - 1 != 0) {
                this.f52186l = true;
                this.f52180f = bmvz.f131120a;
                this.f52178d.mo29824b();
                mo29722a(3);
                return;
            }
            this.f52178d.mo29824b();
            this.f52186l = false;
            this.f52181g = bmxv.m108566b(bluetoothDevice);
            mo29725a((Integer) 3);
        }
    }

    /* renamed from: a */
    public final void mo29724a(ScanResult scanResult) {
        if (xit.m43017c(scanResult) && xit.m43015a(scanResult)) {
            BluetoothDevice device = scanResult.getDevice();
            if (device.getBondState() == 12) {
                this.f52181g = bmxv.m108566b(device);
                mo29725a((Integer) 3);
            } else if (this.f52179e) {
                boolean a = this.f52178d.mo29823a(scanResult);
                if (!this.f52180f.mo66813a() && a) {
                    this.f52186l = false;
                    mo29722a(2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo29716a(ViewOptions viewOptions) {
        bmxy.m108600b(Transport.BLUETOOTH_LOW_ENERGY.equals(viewOptions.mo18758b()));
        xrv xrv = xrv.MULTI_TRANSPORT;
        int ordinal = viewOptions.mo18759c().ordinal();
        if (ordinal == 3) {
            ViewOptions a = this.f52176b.mo29746a();
            if (a.mo18759c().equals(xrv.BLE) && ((BleViewOptions) a).f31826a) {
                this.f52179e = true;
                bmxv a2 = this.f52176b.mo29745a(3, new BleViewOptions(false));
                if (a2.mo66813a()) {
                    this.f52175a.mo14261a(((ViewOptions) a2.mo66814b()).toString());
                }
            }
        } else if (ordinal != 7) {
            bmxv a3 = this.f52176b.mo29745a(3, viewOptions);
            if (a3.mo66813a()) {
                this.f52175a.mo14261a(((ViewOptions) a3.mo66814b()).toString());
            }
        } else {
            this.f52186l = false;
            this.f52179e = true;
            mo29722a(3);
        }
    }

    /* renamed from: a */
    public final void mo29725a(Integer num) {
        xis xis = this.f52184j.f52219c;
        if (xis != null) {
            xis.mo29814a();
        }
        this.f52182h.mo69138b(num);
    }
}
