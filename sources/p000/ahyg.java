package p000;

import android.content.Intent;

/* renamed from: ahyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahyg extends buqn {

    /* renamed from: a */
    final /* synthetic */ ahyh f68343a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahyg(ahyh ahyh, String str) {
        super(str);
        this.f68343a = ahyh;
    }

    public final void run() {
        srn srn = ahsd.f67925a;
        cfog.m141285m();
        ahhd.m55768a(this.f68343a.f68346c, new Intent("com.google.android.gms.discovery.fastpair.ACTION_HALF_SHEET_STATUS_CHANGE").putExtra("FINISHED_STATE", "DISMISS"));
    }
}
