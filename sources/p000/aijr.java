package p000;

import com.google.android.gms.beacon.BleSighting;
import java.util.List;

/* renamed from: aijr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aijr extends nej {

    /* renamed from: a */
    final /* synthetic */ aikx f68986a;

    public aijr(aikx aikx) {
        this.f68986a = aikx;
    }

    /* renamed from: a */
    public final void mo13773a(int i) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
        bnsl.mo68432a("aijr", "a", 1176, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Beacon module failed with error %s for Legacy only scanning", ailb.m57408a(i));
    }

    /* renamed from: a */
    public final void mo20523a(String str) {
    }

    /* renamed from: a */
    public final void mo20524a(List list) {
    }

    /* renamed from: a */
    public final void mo13774a(int i, BleSighting bleSighting) {
        aikx aikx = this.f68986a;
        aijq aijq = new aijq(this, bleSighting);
        int i2 = aikx.f69072i;
        aikx.mo37614a(aijq);
    }
}
