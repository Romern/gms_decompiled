package p000;

import android.bluetooth.BluetoothDevice;
import com.android.setupwizardlib.items.SwitchItem;
import java.util.Map;

/* renamed from: vsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vsp extends vsh {

    /* renamed from: a */
    final /* synthetic */ vsr f49916a;

    public vsp(vsr vsr) {
        this.f49916a = vsr;
    }

    /* renamed from: a */
    public final void mo28762a() {
        boolean a = ccrb.f179782a.mo6606a().mo76664a();
        vsi vsi = this.f49916a.f49923f;
        boolean z = false;
        if (vsi.mo28790f() && a) {
            z = true;
        }
        vsi.mo28780a(z);
        if (vsr.m41191g() && this.f49916a.f49923f.mo28790f()) {
            this.f49916a.f49918a.mo4101a(a);
            vsr vsr = this.f49916a;
            vsr.f49921d.add(vsr.f49919b);
            vsr vsr2 = this.f49916a;
            vsr2.f49921d.add(vsr2.f49918a);
        }
        if (!this.f49916a.f49922e.isEmpty()) {
            vsr vsr3 = this.f49916a;
            vsr3.f49921d.add(vsr3.f49920c);
            for (Map.Entry entry : this.f49916a.f49922e.entrySet()) {
                SwitchItem switchItem = (SwitchItem) entry.getKey();
                switchItem.mo4101a(this.f49916a.f49923f.mo28781a(vqw.m41076a((BluetoothDevice) entry.getValue())));
                this.f49916a.f49921d.add(switchItem);
            }
        }
        this.f49916a.f49959h.mo171aJ();
    }
}
