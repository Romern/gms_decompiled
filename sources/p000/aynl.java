package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothProfile;
import com.google.android.libraries.bluetooth.fastpair.ConnectException;
import java.util.concurrent.TimeUnit;

/* renamed from: aynl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aynl implements AutoCloseable {

    /* renamed from: a */
    public final BluetoothProfile f98068a;

    /* renamed from: b */
    final /* synthetic */ ayns f98069b;

    /* renamed from: c */
    private final BluetoothAdapter f98070c = BluetoothAdapter.getDefaultAdapter();

    /* renamed from: d */
    private final ayoe f98071d;

    public aynl(ayns ayns, ayoe ayoe) {
        this.f98069b = ayns;
        this.f98071d = ayoe;
        int i = ayoe.f98114a;
        bqgy c = bqgy.m112818c();
        if (this.f98070c.getProfileProxy(this.f98069b.f98083a, new aynk(c), ayoe.f98114a)) {
            this.f98068a = (BluetoothProfile) c.get((long) this.f98069b.f98084b.mo54095C(), TimeUnit.SECONDS);
            return;
        }
        throw new ConnectException(3, "getProfileProxy failed immediately", new Object[0]);
    }

    public final void close() {
        ayqt ayqt = this.f98069b.f98088f;
        String valueOf = String.valueOf(this.f98071d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("Close profile: ");
        sb.append(valueOf);
        ayqr ayqr = new ayqr(ayqt, sb.toString());
        try {
            this.f98070c.closeProfileProxy(this.f98071d.f98114a, this.f98068a);
            ayqr.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
