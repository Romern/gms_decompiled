package p000;

import android.bluetooth.BluetoothProfile;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.List;

/* renamed from: busu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class busu implements BluetoothProfile.ServiceListener {

    /* renamed from: a */
    final /* synthetic */ busy f154823a;

    public busu(busy busy) {
        this.f154823a = busy;
    }

    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        bnsl bnsl = (bnsl) busr.f154819a.mo68390d();
        bnsl.mo68432a("busu", "onServiceConnected", 130, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68409a("BTConnStateMgr: onServiceConnected with profile %d.", i);
        synchronized (this.f154823a) {
            if (cfoj.m141536Q()) {
                busy busy = this.f154823a;
                int i2 = busy.f154828h;
                BluetoothProfile bluetoothProfile2 = (BluetoothProfile) busy.f154832d.get(i);
                if (bluetoothProfile2 != null) {
                    if (bluetoothProfile2 != bluetoothProfile) {
                        this.f154823a.f154830b.closeProfileProxy(i, bluetoothProfile2);
                        bnsl bnsl2 = (bnsl) busr.f154819a.mo68390d();
                        bnsl2.mo68432a("busu", "onServiceConnected", 136, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68409a("BTConnStateMgr: onServiceConnected with profile %d, but there is old profile connected.", i);
                    }
                }
            }
            busy busy2 = this.f154823a;
            int i3 = busy.f154828h;
            busy2.f154832d.put(i, bluetoothProfile);
        }
        List a = this.f154823a.mo73091a();
        if (a.isEmpty()) {
            bnsl bnsl3 = (bnsl) busr.f154819a.mo68390d();
            bnsl3.mo68432a("busu", "onServiceConnected", 147, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("BTConnStateMgr:connected with profile, but no listener registered.");
            return;
        }
        int size = a.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((busx) a.get(i4)).mo37230a(i, bluetoothProfile);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0056, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0057, code lost:
        r1 = r0.size();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
        if (r2 >= r1) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005e, code lost:
        ((p000.busx) r0.get(r2)).mo37228a();
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        r0 = r6.f154823a;
        r0.f154830b.getProfileProxy(r0.f154829a, r0.f154834g, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0075, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0038, code lost:
        r0 = r6.f154823a.mo73091a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        if (r0.isEmpty() == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        r7 = (p000.bnsl) p000.busr.f154819a.mo68390d();
        r7.mo68432a("busu", "onServiceDisconnected", 168, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r7.mo68405a("BTConnStateMgr:disconnected with profile, but no listener registered.");
     */
    public final void onServiceDisconnected(int i) {
        bnsl bnsl = (bnsl) busr.f154819a.mo68390d();
        bnsl.mo68432a("busu", "onServiceDisconnected", (int) MfiClientException.TYPE_CARD_NOT_CACHED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68409a("BTConnStateMgr: onServiceDisconnected with profile %d.", i);
        synchronized (this.f154823a) {
            busy busy = this.f154823a;
            int i2 = busy.f154828h;
            BluetoothProfile bluetoothProfile = (BluetoothProfile) busy.f154832d.get(i);
            if (bluetoothProfile != null) {
                this.f154823a.f154830b.closeProfileProxy(i, bluetoothProfile);
                this.f154823a.f154832d.delete(i);
            }
        }
    }
}
