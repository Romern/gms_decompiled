package p000;

import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: ayta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ayta extends aysz {
    public ayta(Object... objArr) {
        super(objArr);
    }

    /* renamed from: a */
    public final void mo54405a(aytb aytb) {
        try {
            Object b = mo54308b();
            if (b == null) {
                b = aytb.f98439a;
            }
            aytb.mo54413a(this, b);
        } catch (BluetoothException e) {
            aytb.mo54413a(this, e);
        }
    }

    /* renamed from: b */
    public Object mo54308b() {
        throw new RuntimeException("Not implemented");
    }
}
