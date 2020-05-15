package p000;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;

/* renamed from: xub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class xub {

    /* renamed from: m */
    public static final sek f53108m = new sek(new String[]{"CtapBleClientConnection"}, (short[]) null);

    /* renamed from: a */
    private final xtz f53109a = new xtz(this);

    /* renamed from: b */
    private boolean f53110b;

    /* renamed from: e */
    protected final xwn f53111e;

    /* renamed from: f */
    public final xuc f53112f;

    /* renamed from: g */
    public final BluetoothDevice f53113g;

    /* renamed from: h */
    public final int f53114h;

    /* renamed from: i */
    public final Handler f53115i = new adzt(Looper.getMainLooper());

    /* renamed from: j */
    public boolean f53116j;

    /* renamed from: k */
    public xjj f53117k;

    /* renamed from: l */
    public bqgg f53118l = bqga.m112775a((Object) true);

    /* renamed from: n */
    public xtg f53119n;

    public xub(xuc xuc, BluetoothDevice bluetoothDevice, int i, xwn xwn) {
        this.f53112f = xuc;
        this.f53113g = bluetoothDevice;
        this.f53114h = i;
        this.f53111e = xwn;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo30136a(byte b, byte[] bArr, boolean z) {
        if (!this.f53118l.isDone()) {
            f53108m.mo25414c("Another write operation is in progress.", new Object[0]);
            mo30142c();
            return bqga.m112775a((Object) false);
        } else if (z && (bArr = mo30126a(b, bArr)) == null) {
            f53108m.mo25418e("Unable to encrypt frame data.", new Object[0]);
            mo30142c();
            return bqga.m112775a((Object) false);
        } else {
            xua xua = new xua(this);
            f53108m.mo25414c("Sending frame with command %s, len=%s", Integer.valueOf(b), Integer.valueOf(bArr.length));
            xua.f53104b = new xjk(xua.f53106d.f53114h).mo29841a(b, bArr);
            xua.f53103a = 0;
            xua.f53105c = bqgy.m112818c();
            xua.mo30134a();
            bqgy bqgy = xua.f53105c;
            this.f53118l = bqgy;
            return bqgy;
        }
    }

    /* renamed from: a */
    public final boolean mo30139a() {
        return this.f53116j && !this.f53110b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public byte[] mo30126a(byte b, byte[] bArr) {
        return bArr;
    }

    /* renamed from: b */
    public final bqgg mo30140b(byte b, byte[] bArr) {
        return mo30136a(b, bArr, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo30142c() {
        xuc xuc = this.f53112f;
        if (xuc.mo30143a(this.f53113g)) {
            xuc.f53132l.mo30185a(xuc.f53131k, new xju("Disconnected on error"), 52);
            xuc.f53133m.mo30141b();
            xuc.f53133m = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo30141b() {
        this.f53110b = true;
        xtg xtg = this.f53119n;
        if (xtg != null) {
            xtk.f53046k.mo25414c("  Client disconnected, stopping session.", new Object[0]);
            xtg.f53037b.mo30122b();
            this.f53119n = null;
        }
    }

    /* renamed from: a */
    public final void mo30137a(int i) {
        this.f53115i.removeCallbacks(this.f53109a);
        this.f53115i.postDelayed(this.f53109a, (long) i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30138a(bqgg bqgg) {
        bqgg.mo741a(new xtw(this, bqgg), bqfb.INSTANCE);
    }
}
