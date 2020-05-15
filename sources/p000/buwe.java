package p000;

import android.bluetooth.BluetoothAdapter;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

/* renamed from: buwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buwe extends bvbj {

    /* renamed from: a */
    public static final UUID f155136a = UUID.fromString("87a0a8a8-a12b-4d0e-bd8c-97c9eba167cd");

    /* renamed from: b */
    private final BluetoothAdapter f155137b = BluetoothAdapter.getDefaultAdapter();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bvbw mo73150a(buzt buzt) {
        if ((buzt.f155425a & 4) == 0) {
            return null;
        }
        BluetoothAdapter bluetoothAdapter = this.f155137b;
        buzv buzv = buzt.f155428d;
        if (buzv == null) {
            buzv = buzv.f155434c;
        }
        return new buwd(new buwf(bluetoothAdapter, bvau.m120845a(buzv.f155437b.mo73780k()), f155136a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bvbw mo73151a(buzt buzt, Set set) {
        buzv buzv = buzt.f155428d;
        if (buzv == null) {
            buzv = buzv.f155434c;
        }
        if ((buzv.f155436a & 1) != 0) {
            buzv buzv2 = buzt.f155428d;
            if (buzv2 == null) {
                buzv2 = buzv.f155434c;
            }
            String a = bvau.m120845a(buzv2.f155437b.mo73780k());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                buwd buwd = (buwd) it.next();
                if (buwd.mo73169g().equals(a)) {
                    return buwd;
                }
            }
            return null;
        }
        buzx buzx = buzt.f155427c;
        if (buzx == null) {
            buzx = buzx.f155443c;
        }
        if ((buzx.f155445a & 1) == 0) {
            return null;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            buwd buwd2 = (buwd) it2.next();
            buzx buzx2 = buzt.f155427c;
            if (buzx2 == null) {
                buzx2 = buzx.f155443c;
            }
            if (buzx2.equals(buwd2.mo73170h())) {
                return buwd2;
            }
        }
        return null;
    }
}
