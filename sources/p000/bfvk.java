package p000;

import android.content.IntentFilter;

/* renamed from: bfvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfvk extends bfvi {

    /* renamed from: a */
    final /* synthetic */ bfvn f115412a;

    public bfvk(bfvn bfvn) {
        this.f115412a = bfvn;
    }

    /* renamed from: a */
    public final void mo62314a() {
        bfvn bfvn = this.f115412a;
        bhci bhci = bfvn.f115419b;
        bhci.f118298c.mo61864a();
        bhci.f118300e = bfvn;
        bhci bhci2 = this.f115412a.f115419b;
        bhci2.f118298c.mo61864a();
        if (!bhci2.f118299d) {
            bhci2.f118299d = true;
            bhci2.f118296a.mo873a(bhci2.f118297b, new IntentFilter("com.google.android.location.internal.LOCATOR_ALARM_TRIGGERED"));
            bhci2.f118296a.mo873a(bhci2.f118297b, new IntentFilter("com.google.android.location.internal.WIFI_SCAN_STARTED"));
            bhci2.f118296a.mo873a(bhci2.f118297b, new IntentFilter("com.google.android.location.internal.WIFI_SCAN_RECEIVED"));
        }
    }

    /* renamed from: a */
    public final void mo62315a(int i) {
        bfvm bfvm;
        boolean z = true;
        if (i == 2) {
            bfvn bfvn = this.f115412a;
            bfvn.mo62318a(bfvn.f115422e);
            bfvm = this.f115412a.f115422e;
        } else if (i == 1) {
            bfvn bfvn2 = this.f115412a;
            bfvn2.mo62318a(bfvn2.f115422e);
            bfvm = this.f115412a.f115422e;
            z = false;
        } else {
            return;
        }
        bfvm.f115414a = z;
    }
}
