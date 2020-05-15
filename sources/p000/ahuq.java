package p000;

import android.content.Context;

/* renamed from: ahuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahuq extends buqn {

    /* renamed from: a */
    final /* synthetic */ Context f68112a;

    /* renamed from: b */
    final /* synthetic */ String f68113b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahuq(String str, Context context, String str2) {
        super(str);
        this.f68112a = context;
        this.f68113b = str2;
    }

    public final void run() {
        aibm aibm = (aibm) ahgz.m55754a(this.f68112a, aibm.class);
        String str = this.f68113b;
        aibm.f68608c.mo72984b();
        ahst ahst = aibm.f68606a;
        boolean z = false;
        for (ahsu ahsu : ahst.mo37045b()) {
            if (str.equals(ahsu.mo37088m())) {
                srn srn = ahsd.f67925a;
                ahsu.mo37084i();
                ahsu.mo37067a(ahst.f67959a.mo20505a());
                z = true;
            }
        }
        if (z) {
            aibm.mo37368a(1, bzbk.NEARBY_DEVICE);
        }
    }
}
