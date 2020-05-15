package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.google.android.gms.beacon.BleSettings;
import com.google.android.gms.beacon.BleSighting;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ngg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ngg extends nga {

    /* renamed from: a */
    public final BluetoothAdapter f35483a;

    /* renamed from: b */
    public final ngu f35484b;

    /* renamed from: c */
    public final List f35485c = new ArrayList();

    /* renamed from: d */
    final BluetoothAdapter.LeScanCallback f35486d = new nge(this);

    /* renamed from: e */
    public final nhd f35487e;

    /* renamed from: f */
    private final ngo f35488f;

    /* renamed from: g */
    private final bqgj f35489g;

    /* renamed from: h */
    private final asfb f35490h;

    /* renamed from: i */
    private final AtomicBoolean f35491i = new AtomicBoolean(false);

    public ngg(Context context, BluetoothManager bluetoothManager, asfb asfb, ngn ngn, nhd nhd, ngu ngu) {
        super(ngn);
        this.f35483a = bluetoothManager.getAdapter();
        this.f35490h = asfb;
        this.f35487e = nhd;
        this.f35484b = ngu;
        this.f35489g = snp.m35704b(10);
        this.f35488f = new ngo(context, new ngc(this), "com.google.android.gms.beacon.scan.impl.KkBluetoothLeScannerCompat.ALARM");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: h */
    private final void m26163h() {
        int i;
        if (this.f35484b.mo20621b()) {
            int d = this.f35484b.mo20623d();
            if (d != 0) {
                i = d != 2 ? 13500 : 167;
            } else {
                i = 148500;
            }
            long j = (long) i;
            if (j <= 3000) {
                StringBuilder sb = new StringBuilder(23);
                sb.append("Sleeping ");
                sb.append(i);
                sb.append(" ms");
                sb.toString();
                Thread.sleep(j);
                mo20592d();
                return;
            }
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Setting alarm in (millis) ");
            sb2.append(i);
            sb2.toString();
            this.f35488f.mo20610a(j, this.f35484b.mo20624e());
            return;
        }
        nha.m26245b("Scan : No clients left, canceling alarm.");
        this.f35488f.mo20609a();
    }

    /* renamed from: a */
    public final synchronized void mo20583a(nej nej) {
        this.f35484b.mo20616a();
        this.f35484b.mo20620a(nej);
        m26163h();
    }

    /* renamed from: b */
    public final void mo20587b() {
        this.f35484b.mo20625f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo20588c() {
        mo20592d();
    }

    /* renamed from: d */
    public final void mo20592d() {
        this.f35484b.mo20616a();
        if (this.f35484b.mo20621b() && !this.f35491i.getAndSet(true)) {
            synchronized (this.f35485c) {
                if (!this.f35485c.isEmpty()) {
                    int size = this.f35485c.size();
                    StringBuilder sb = new StringBuilder(97);
                    sb.append("Found ");
                    sb.append(size);
                    sb.append(" results before scan started. The platform scanner may have not stopped in time.");
                    String sb2 = sb.toString();
                    if (this.f35485c.size() >= 100) {
                        nha.m26243a(String.valueOf(sb2).concat(" The results will be discarded."));
                        String a = ((ngf) this.f35485c.get(0)).mo20591a();
                        List list = this.f35485c;
                        String a2 = ((ngf) list.get(list.size() - 1)).mo20591a();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(a).length() + 32 + String.valueOf(a2).length());
                        sb3.append("First sighting: ");
                        sb3.append(a);
                        sb3.append("\nLast sighting: ");
                        sb3.append(a2);
                        sb3.toString();
                        this.f35485c.clear();
                    }
                }
            }
            this.f35490h.mo49121c(this.f35484b.mo20624e());
            this.f35490h.mo49117b();
            this.f35489g.execute(new ngd(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo20593e() {
        mo20595g();
        this.f35487e.f35563a.mo20639a(this.f35484b.mo20628i(), 0);
        this.f35491i.set(false);
        m26163h();
        this.f35490h.mo49120c();
        this.f35490h.mo49124e();
    }

    /* renamed from: f */
    public final void mo20594f() {
        try {
            this.f35483a.stopLeScan(this.f35486d);
            ngz.m26242b(25);
        } catch (Exception e) {
            ngz.m26242b(31);
            nha.m26244a("Exception in bluetoothAdapter.stopLeScan()", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo20595g() {
        ArrayList arrayList;
        synchronized (this.f35485c) {
            arrayList = new ArrayList(this.f35485c);
            int size = arrayList.size();
            StringBuilder sb = new StringBuilder(48);
            sb.append("processAvailableBleSightings() size: ");
            sb.append(size);
            sb.toString();
            this.f35485c.clear();
        }
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            ngf ngf = (ngf) arrayList.get(i);
            this.f35484b.mo20618a(new BleSighting(ngf.f35479a, ngf.f35481c, ngf.f35480b, ngf.f35482d));
        }
    }

    /* renamed from: a */
    public final void mo20584a(boolean z) {
        this.f35484b.mo20629j();
        m26163h();
    }

    /* renamed from: a */
    public final synchronized boolean mo20586a(BleSettings bleSettings, nej nej) {
        boolean z;
        if (this.f35484b.mo20615a(bleSettings, nej) != null) {
            mo20592d();
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
