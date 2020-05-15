package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.view.BleEnableViewOptions;
import com.google.android.gms.fido.fido2.api.view.ViewOptions;

/* renamed from: xgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xgl implements xgj {

    /* renamed from: a */
    public boolean f52205a = false;

    /* renamed from: b */
    public boolean f52206b = false;

    /* renamed from: c */
    private final xoo f52207c;

    /* renamed from: d */
    private final xhi f52208d;

    /* renamed from: e */
    private final xih f52209e;

    /* renamed from: f */
    private final BluetoothAdapter f52210f;

    /* renamed from: g */
    private final bqgy f52211g = bqgy.m112818c();

    public xgl(xoo xoo, xhi xhi, BluetoothAdapter bluetoothAdapter, xih xih) {
        this.f52207c = xoo;
        this.f52208d = xhi;
        this.f52210f = bluetoothAdapter;
        this.f52209e = xih;
    }

    /* renamed from: a */
    public static xgl m42884a(Context context, xoo xoo, xhi xhi) {
        return new xgl(xoo, xhi, BluetoothAdapter.getDefaultAdapter(), new xih(context));
    }

    /* renamed from: b */
    public final void mo29717b() {
        if (!this.f52211g.isDone()) {
            this.f52211g.cancel(true);
        }
    }

    /* renamed from: c */
    public final Integer mo29718c() {
        return 1;
    }

    /* renamed from: d */
    public final void mo29719d() {
    }

    /* renamed from: e */
    public final void mo29735e() {
        boolean isEnabled = this.f52210f.isEnabled();
        if (!this.f52209e.mo29801a()) {
            this.f52209e.mo29802b();
            this.f52205a = true;
        }
        if (isEnabled) {
            this.f52211g.mo69138b((Object) 2);
            return;
        }
        this.f52210f.enable();
        this.f52206b = true;
    }

    /* renamed from: a */
    public final bqgg mo29715a() {
        boolean a = this.f52209e.mo29801a();
        boolean isEnabled = this.f52210f.isEnabled();
        if (a && isEnabled) {
            return bqga.m112775a((Object) 2);
        }
        bmxv a2 = this.f52208d.mo29745a(1, new BleEnableViewOptions(isEnabled, a));
        if (a2.mo66813a()) {
            this.f52207c.mo14261a(((ViewOptions) a2.mo66814b()).toString());
        }
        return this.f52211g;
    }

    /* renamed from: a */
    public final void mo29716a(ViewOptions viewOptions) {
        bmxy.m108600b(Transport.BLUETOOTH_LOW_ENERGY.equals(viewOptions.mo18758b()));
        xrv xrv = xrv.MULTI_TRANSPORT;
        if (viewOptions.mo18759c().ordinal() != 3) {
            bmxv a = this.f52208d.mo29745a(3, viewOptions);
            if (a.mo66813a()) {
                this.f52207c.mo14261a(((ViewOptions) a.mo66814b()).toString());
            }
        } else if (this.f52208d.mo29746a().mo18759c().equals(xrv.BLE_ENABLE)) {
            mo29735e();
        }
    }
}
