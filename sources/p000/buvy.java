package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.location.nearby.direct.bluetooth.BluetoothNameScan$1;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: buvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buvy implements bvbk {

    /* renamed from: a */
    public final buxb f155106a;

    /* renamed from: b */
    public final AtomicBoolean f155107b;

    /* renamed from: c */
    public final buzj f155108c;

    /* renamed from: d */
    public bvat f155109d;

    /* renamed from: e */
    public final BroadcastReceiver f155110e = new BluetoothNameScan$1(this, "nearby");

    public buvy(Context context, buzj buzj) {
        this.f155106a = (buxb) ahgz.m55754a(context, buxb.class);
        this.f155108c = buzj;
        this.f155107b = new AtomicBoolean(false);
    }

    /* renamed from: a */
    public static void m120553a(Context context, bvad bvad) {
        buzj buzj = bvad.f155469c;
        if (buzj == null) {
            buzj = buzj.f155387c;
        }
        if (buzj != null) {
            buzi buzi = buzj.f155390b;
            if (buzi == null) {
                buzi = buzi.f155382d;
            }
            if (buzi.f155385b.length() > 0) {
                buxb buxb = (buxb) ahgz.m55755b(context, buxb.class);
                if (buxb == null || !buxb.mo73224a()) {
                    throw new bvdl(buxb.class, buvw.class);
                }
                return;
            }
        }
        throw new bvdj("Data to advertise on bluetooth name is not correctly set");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo73128a() {
        return bvai.f155480d;
    }

    /* renamed from: a */
    public final void mo73129a(bvat bvat, bvda bvda) {
        this.f155109d = bvat;
        this.f155106a.mo73220a(new buvx(this, bvda));
    }

    /* renamed from: a */
    public final void mo73130a(bvda bvda) {
        if (this.f155107b.compareAndSet(true, false)) {
            buxb buxb = this.f155106a;
            buxb.f155211i.unregisterReceiver(this.f155110e);
            this.f155106a.mo73233g();
        }
        this.f155106a.mo73225b(bvda);
    }
}
