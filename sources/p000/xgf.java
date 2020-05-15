package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import com.google.android.gms.fido.fido2.api.view.BleDeviceIdentifier;
import com.google.android.gms.fido.fido2.api.view.ViewOptions;

/* renamed from: xgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xgf implements xgj {

    /* renamed from: a */
    public final Context f52163a;

    /* renamed from: b */
    public final xwj f52164b;

    /* renamed from: c */
    public final RequestOptions f52165c;

    /* renamed from: d */
    public final String f52166d;

    /* renamed from: e */
    public final String f52167e;

    /* renamed from: f */
    public final xoo f52168f;

    /* renamed from: g */
    public final xhi f52169g;

    /* renamed from: h */
    public final BluetoothDevice f52170h;

    /* renamed from: i */
    public final xgm f52171i;

    /* renamed from: j */
    public bmxv f52172j;

    /* renamed from: k */
    private final bqgj f52173k = snp.m35704b(9);

    /* renamed from: l */
    private bmxv f52174l = bmvz.f131120a;

    public xgf(Context context, xwj xwj, RequestOptions requestOptions, String str, String str2, xoo xoo, xhi xhi, BluetoothDevice bluetoothDevice, xgm xgm) {
        this.f52163a = context;
        this.f52164b = xwj;
        this.f52165c = requestOptions;
        this.f52166d = str;
        this.f52167e = str2;
        this.f52168f = xoo;
        this.f52169g = xhi;
        this.f52170h = bluetoothDevice;
        this.f52171i = xgm;
    }

    /* renamed from: a */
    public static final BleDeviceIdentifier m42852a(BluetoothDevice bluetoothDevice) {
        return new BleDeviceIdentifier(bluetoothDevice.getName(), bluetoothDevice.getAddress());
    }

    /* renamed from: a */
    public final void mo29716a(ViewOptions viewOptions) {
    }

    /* renamed from: b */
    public final void mo29717b() {
        if (this.f52174l.mo66813a() && !((bqgg) this.f52174l.mo66814b()).isDone()) {
            ((bqgg) this.f52174l.mo66814b()).cancel(true);
        }
    }

    /* renamed from: c */
    public final Integer mo29718c() {
        return 3;
    }

    /* renamed from: d */
    public final void mo29719d() {
    }

    /* renamed from: a */
    public final bqgg mo29715a() {
        xjg xjg = new xjg(this.f52163a, this.f52173k, new xig(this.f52170h), new xgb(this));
        bqgg a = bqdx.m112673a(xjg.mo29833b(), new xgc(this, xjg), this.f52173k);
        xjg.getClass();
        a.mo741a(new xgd(xjg), this.f52173k);
        bmxv b = bmxv.m108566b(bqdx.m112673a(a, new xge(this), this.f52173k));
        this.f52174l = b;
        return (bqgg) b.mo66814b();
    }
}
