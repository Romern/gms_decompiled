package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: xtn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xtn extends xub {

    /* renamed from: d */
    public static final Logger f53074d = new Logger(new String[]{"CableClientConnection"}, (short[]) null);

    /* renamed from: a */
    public final xwj f53075a;

    /* renamed from: b */
    public final xjv f53076b;

    /* renamed from: c */
    public xjw f53077c;

    public xtn(xwj xwj, xuc xuc, BluetoothDevice bluetoothDevice, int i, xjv xjv, xwn xwn) {
        super(xuc, bluetoothDevice, i, xwn);
        this.f53075a = xwj;
        this.f53076b = xjv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final byte[] mo30126a(byte b, byte[] bArr) {
        xjw xjw = this.f53077c;
        if (xjw != null) {
            try {
                return xjw.mo29845a(bArr, b);
            } catch (xju e) {
                f53074d.mo25417e("Unable to encrypt frame data.", e, new Object[0]);
                return null;
            }
        } else {
            f53074d.mo25418e("Could not encrypt frame data. Handshake was not completed.", new Object[0]);
            return null;
        }
    }
}
