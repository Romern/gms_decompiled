package p000;

import android.content.Context;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.setupdesign.items.ItemGroup;

/* renamed from: aryh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aryh implements ardt {

    /* renamed from: a */
    final /* synthetic */ aryp f88452a;

    public aryh(aryp aryp) {
        this.f88452a = aryp;
    }

    /* renamed from: a */
    public final void mo48217a() {
    }

    /* renamed from: a */
    public final void mo48218a(int i) {
    }

    /* renamed from: b */
    public final void mo48220b(D2DDevice d2DDevice) {
        aryo aryo = (aryo) this.f88452a.f88466h.get(d2DDevice.f107875d);
        if (aryo != null) {
            this.f88452a.f88466h.remove(d2DDevice.f107875d);
            ItemGroup itemGroup = this.f88452a.f88465g;
            int a = ItemGroup.m117889a(itemGroup.f151508a, aryo);
            int d = itemGroup.mo71400d(a);
            itemGroup.f151509b = true;
            if (a != -1) {
                int g = aryo.mo64923g();
                itemGroup.f151508a.remove(a);
                aryo.mo64922b(itemGroup);
                if (g > 0) {
                    itemGroup.mo71386b(d, g);
                }
            }
            aryp.f88459a.mo25412b("onDeviceLost, remove %s from the list.", d2DDevice.f107875d);
            if (this.f88452a.f88465g.mo64923g() == 0) {
                this.f88452a.mo48940a();
            }
        }
    }

    /* renamed from: a */
    public final void mo48219a(D2DDevice d2DDevice) {
        aryp.f88459a.mo25412b("onDeviceFound.", new Object[0]);
        if (!this.f88452a.f88466h.containsKey(d2DDevice.f107875d)) {
            Context context = this.f88452a.getContext();
            if (context == null) {
                aryp.f88459a.mo25416d("no context", new Object[0]);
                return;
            }
            aryo aryo = new aryo(context, d2DDevice);
            this.f88452a.f88465g.mo58966a(aryo);
            this.f88452a.f88466h.put(d2DDevice.f107875d, aryo);
            this.f88452a.mo48942b();
            aryp.f88459a.mo25412b("onDeviceFound, add %s to the list.", d2DDevice.f107875d);
        }
    }
}
