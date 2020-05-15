package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* renamed from: aypc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aypc extends ayqp {

    /* renamed from: a */
    final /* synthetic */ int f98154a;

    /* renamed from: b */
    final /* synthetic */ aypk f98155b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aypc(aypk aypk, Context context, ayqk ayqk, String[] strArr, int i) {
        super(context, ayqk, strArr);
        this.f98155b = aypk;
        this.f98154a = i;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
        if (((java.lang.Boolean) p000.ayqm.m84613a(r0).mo54282a("isLeEnabled", new java.lang.Class[0]).mo54281b(new java.lang.Object[0])).booleanValue() == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0053, code lost:
        if (r0.getState() != 12) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0056, code lost:
        r2 = r0.getState();
     */
    /* renamed from: a */
    public final void mo54158a(Intent intent) {
        int i = this.f98154a;
        aypk aypk = this.f98155b;
        int i2 = aypk.f98171h;
        BluetoothAdapter bluetoothAdapter = aypk.f98175a.f98418a;
        int i3 = 15;
        if (!bluetoothAdapter.isEnabled()) {
            int i4 = Build.VERSION.SDK_INT;
            try {
            } catch (ayqn e) {
                bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
                bnsl.mo68437a(e);
                bnsl.mo68432a("aypk", "d", 1613, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Can't call isLeEnabled");
            }
        } else {
            i3 = 12;
        }
        if (i == i3) {
            close();
        }
    }
}
