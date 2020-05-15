package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: autq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class autq {

    /* renamed from: a */
    public final /* synthetic */ aupn f92506a;

    /* renamed from: b */
    public final /* synthetic */ autr f92507b;

    public autq(autr autr, aupn aupn) {
        this.f92507b = autr;
        this.f92506a = aupn;
    }

    /* renamed from: a */
    public final BluetoothDevice mo50909a() {
        return this.f92507b.f92510c;
    }

    /* renamed from: b */
    public final bedt mo50910b() {
        autr autr = this.f92507b;
        aupn aupn = this.f92506a;
        String a = aupn.mo50725a(autr.f92515h, "");
        long a2 = aupn.mo50724a(autr.f92516i, 0);
        long a3 = aupn.mo50724a(autr.f92517j, 0);
        boolean c = aupn.mo50736c(autr.f92518k);
        boolean c2 = aupn.mo50736c(autr.f92519l);
        long a4 = aupn.mo50724a(autr.f92520m, 0);
        bedl bedl = new bedl(autr.mo50916c(), autr.mo50917d());
        BluetoothDevice bluetoothDevice = autr.f92510c;
        byte[] b = boan.f132472f.mo68796b(a);
        if (b.length == 16) {
            aurr aurr = new aurr(bluetoothDevice, new aurx(b), bedl);
            return new bedt(a4, new beds(aurr.f92376a, new bedn(a2, c, c2), a3));
        }
        throw new IllegalArgumentException("Incorrect EIK length");
    }
}
