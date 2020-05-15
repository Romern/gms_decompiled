package p000;

import android.bluetooth.BluetoothGatt;
import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: bedf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bedf extends aysz {

    /* renamed from: a */
    final /* synthetic */ aysl f106945a;

    /* renamed from: b */
    final /* synthetic */ bedj f106946b;

    /* renamed from: c */
    private final Object f106947c = new Object();

    /* renamed from: d */
    private boolean f106948d = false;

    /* renamed from: e */
    private aysm f106949e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bedf(bedj bedj, Object[] objArr, aysl aysl) {
        super(objArr);
        this.f106946b = bedj;
        this.f106945a = aysl;
    }

    /* renamed from: a */
    public final void mo54307a() {
        aysm aysm;
        synchronized (this.f106947c) {
            if (!this.f106948d) {
                aysl aysl = this.f106945a;
                bedj bedj = this.f106946b;
                BluetoothGatt connectGatt = aysl.f98419a.connectGatt(bedj.f106971e, false, bedj.f106969c.f98422b);
                if (connectGatt != null) {
                    aysm = aysm.m84710a(connectGatt);
                } else {
                    aysm = null;
                }
                if (aysm != null) {
                    this.f106949e = aysm;
                    return;
                }
                throw new BluetoothException("connectGatt() returned null.");
            }
        }
    }

    /* renamed from: c */
    public final void mo54319c() {
        synchronized (this.f106947c) {
            if (!this.f106948d) {
                this.f106948d = true;
                aysm aysm = this.f106949e;
                if (aysm != null) {
                    aysm.mo54368e();
                    aysm.mo54370f();
                }
            }
        }
    }
}
