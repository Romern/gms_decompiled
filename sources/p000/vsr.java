package p000;

import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.util.Log;
import com.android.setupwizardlib.items.Item;
import com.android.setupwizardlib.items.SwitchItem;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: vsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vsr extends vtq {

    /* renamed from: a */
    public final SwitchItem f49918a = new SwitchItem();

    /* renamed from: b */
    public final Item f49919b = new Item();

    /* renamed from: c */
    public final Item f49920c = new Item();

    /* renamed from: d */
    public final List f49921d = new ArrayList();

    /* renamed from: e */
    public final Map f49922e = new HashMap();

    /* renamed from: f */
    public vsi f49923f;

    /* renamed from: i */
    private vqk f49924i;

    /* renamed from: g */
    public static boolean m41191g() {
        return ccra.m131311c() && ccra.m131313e() && cesk.m138180c();
    }

    /* renamed from: s */
    private final void m41192s() {
        if (mo28823n()) {
            mo28827r();
        } else {
            mo28822m().mo28866c(new vts());
        }
    }

    /* renamed from: a */
    public final bmd mo28804a() {
        return new vsq(this);
    }

    /* renamed from: b */
    public final bpeb mo28806b() {
        return bpeb.DRIVING_MODE_FRX_AUTOLAUNCH_TRIGGER;
    }

    /* renamed from: c */
    public final CharSequence mo28807c() {
        return getString(C0126R.string.car_driving_mode_frx_autolaunch_trigger_header);
    }

    /* renamed from: d */
    public final void mo28808d() {
        m41192s();
    }

    /* renamed from: e */
    public final CharSequence mo28809e() {
        return mo28823n() ? getString(C0126R.string.common_done) : getString(C0126R.string.common_continue);
    }

    /* renamed from: f */
    public final void mo28810f() {
        m41192s();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        vuk.m41322a();
        vsi f = vuk.m41327f(getContext());
        this.f49923f = f;
        f.mo28795k();
        this.f49919b.mo4100h();
        this.f49919b.mo4099d(C0126R.C0128layout.car_driving_mode_frx_section_header_item);
        this.f49919b.mo4098b(getString(C0126R.string.car_driving_mode_frx_autolaunch_ar_trigger_section_header));
        this.f49918a.mo4099d(C0126R.C0128layout.car_driving_mode_frx_summary_only_switch_item);
        this.f49918a.mo4097a(getString(C0126R.string.car_driving_mode_frx_autolaunch_ar_trigger_summary));
        this.f49918a.f7228f = new vsl(this);
        this.f49920c.mo4100h();
        this.f49920c.mo4099d(C0126R.C0128layout.car_driving_mode_frx_section_header_item);
        this.f49920c.mo4098b(getString(C0126R.string.car_driving_mode_frx_autolaunch_bluetooth_trigger_section_header));
        vuk.m41322a();
        vqk c = vuk.m41324c(getContext());
        this.f49924i = c;
        List c2 = c.mo28749c();
        int size = c2.size();
        for (int i = 0; i < size; i++) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) c2.get(i);
            SwitchItem switchItem = new SwitchItem();
            switchItem.mo4098b(this.f49924i.mo28746a(bluetoothDevice));
            switchItem.f7218c = C1133kh.m17836a(getContext(), (int) C0126R.C0127drawable.quantum_ic_bluetooth_grey600_24);
            switchItem.mo4089b();
            switchItem.f7228f = new vsm(this, bluetoothDevice);
            this.f49922e.put(switchItem, bluetoothDevice);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f49923f.mo28798n();
    }

    public final void onPause() {
        super.onPause();
        if (this.f49923f.mo28794j() == 2) {
            this.f49923f.mo28782b(this.f49923f.mo28775a().mo28740a());
        }
        this.f49923f.mo28778a((vsh) null);
        this.f49921d.clear();
    }

    public final void onResume() {
        super.onResume();
        Log.i("CAR.DRIVINGMODE", "DrivingModeFrxBluetoothAutoLaunchFragment#onResume");
        this.f49923f.mo28778a(new vsp(this));
    }

    /* renamed from: a */
    public final void mo28805a(bmb bmb) {
        SwitchItem switchItem = (SwitchItem) bmb;
        switchItem.mo4101a(!switchItem.f7227e);
        this.f49930g.mo28759a(bpeb.DRIVING_MODE_FRX_AUTOLAUNCH_TRIGGER, bpea.DRIVING_MODE_FRX_SWITCH_TOGGLED);
        this.f49959h.mo171aJ();
    }
}
