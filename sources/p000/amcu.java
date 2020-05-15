package p000;

import android.os.RemoteException;

/* renamed from: amcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amcu extends amcx {

    /* renamed from: a */
    final /* synthetic */ String f74724a;

    /* renamed from: b */
    final /* synthetic */ int f74725b;

    /* renamed from: c */
    final /* synthetic */ int f74726c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amcu(rkb rkb, String str, int i, int i2) {
        super(rkb);
        this.f74724a = str;
        this.f74725b = i;
        this.f74726c = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        amaz amaz = (amaz) rjd;
        String str = this.f74724a;
        int i = this.f74725b;
        int i2 = this.f74726c;
        amap amap = new amap(this);
        sce sce = null;
        try {
            sce = amaz.mo41096n().mo40582b(amap, str, null, i, i2);
        } catch (RemoteException e) {
            amap.mo40530a(8, null, null, null);
        }
        mo17718a(sce);
    }
}
