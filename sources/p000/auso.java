package p000;

import android.bluetooth.BluetoothDevice;
import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: auso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auso extends ausl {

    /* renamed from: a */
    final /* synthetic */ BluetoothDevice f92431a;

    /* renamed from: b */
    final /* synthetic */ aust f92432b;

    /* renamed from: c */
    final /* synthetic */ ausp f92433c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public auso(ausp ausp, Object[] objArr, BluetoothDevice bluetoothDevice, aust aust) {
        super(3, objArr);
        this.f92433c = ausp;
        this.f92431a = bluetoothDevice;
        this.f92432b = aust;
    }

    /* renamed from: a */
    public final void mo50864a() {
        ausp ausp = this.f92433c;
        try {
            if (ausp.mo50884a(ausp.f92440g.mo58573a(aysl.m84704a(this.f92431a)))) {
                ((ausn) this.f92432b).mo50881a(this.f92431a, true);
                return;
            }
        } catch (BluetoothException e) {
            aunx aunx = ausp.f92434a;
            String valueOf = String.valueOf(e.getMessage());
            aunx.mo50710a(valueOf.length() == 0 ? new String("Check fails:") : "Check fails:".concat(valueOf), e, new Object[0]).mo50706a();
        }
        ((ausn) this.f92432b).mo50881a(this.f92431a, false);
    }
}
