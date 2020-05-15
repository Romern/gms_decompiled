package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: aicd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aicd extends buqn {

    /* renamed from: a */
    final /* synthetic */ BluetoothDevice f68667a;

    /* renamed from: b */
    final /* synthetic */ String f68668b;

    /* renamed from: c */
    final /* synthetic */ aics f68669c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aicd(aics aics, String str, BluetoothDevice bluetoothDevice, String str2) {
        super(str);
        this.f68669c = aics;
        this.f68667a = bluetoothDevice;
        this.f68668b = str2;
    }

    public final void run() {
        ahyz a = this.f68669c.f68705b.mo37033a(this.f68667a.getAddress());
        if (a == null) {
            ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("FastPair: no cached fast pair item when alias name changed.");
            return;
        }
        if (cfoj.m141571u()) {
            srn srn = ahsd.f67925a;
            this.f68669c.f68705b.mo37038a(a, true, 0);
        }
        if (cfoj.m141569s()) {
            snp.m35704b(10).execute(new ahuv(this.f68669c.f68708e, this.f68668b, this.f68667a.getAddress(), this.f68669c.f68710g));
        }
        if (cfoj.m141526G()) {
            this.f68669c.f68714k.mo37233a(a.f68429c, this.f68668b);
        }
    }
}
