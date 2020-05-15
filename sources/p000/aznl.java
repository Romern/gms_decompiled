package p000;

import android.view.View;

/* renamed from: aznl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aznl implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ aznn f99721a;

    /* renamed from: b */
    final /* synthetic */ azom f99722b;

    /* renamed from: c */
    final /* synthetic */ String f99723c;

    /* renamed from: d */
    final /* synthetic */ aznr f99724d;

    public aznl(aznr aznr, aznn aznn, azom azom, String str) {
        this.f99724d = aznr;
        this.f99721a = aznn;
        this.f99722b = azom;
        this.f99723c = str;
    }

    public void onClick(View view) {
        if (this.f99721a.f99732b.getVisibility() != 0) {
            azeb a = azeb.m85504a(this.f99724d.f99694a);
            azom azom = this.f99722b;
            String str = azom.f99794e;
            byte[] bArr = azom.f99792c;
            String str2 = this.f99723c;
            aznr aznr = this.f99724d;
            aznz aznz = aznr.f99700g;
            String a2 = aznr.f99696c.mo54588a();
            String str3 = this.f99722b.f99791b;
            aznn aznn = this.f99721a;
            int i = aznn.f99737g;
            aznr aznr2 = this.f99724d;
            aznm aznm = new aznm(i, aznn, aznr2.f99694a, this.f99723c, aznr2.f99752j, str3);
            new Object[1][0] = str;
            azph.m85998a(a.f99137b).mo55131a(1004, 3, str2, (aznz) null);
            new azds(a, str2, str, str3, aznm, bArr, a2, aznz).start();
            this.f99721a.f99732b.setVisibility(0);
            this.f99721a.f99733c.setVisibility(8);
            this.f99721a.f99734d.setVisibility(8);
        }
    }
}
