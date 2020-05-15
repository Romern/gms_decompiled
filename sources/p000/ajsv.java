package p000;

import com.google.android.gms.nearby.sharing.internal.RegisterReceiveSurfaceParams;

/* renamed from: ajsv */
final /* synthetic */ class ajsv implements roo {

    /* renamed from: a */
    private final akbh f71252a;

    /* renamed from: b */
    private final int f71253b;

    public ajsv(akbh akbh, int i) {
        this.f71252a = akbh;
        this.f71253b = i;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        akbh akbh = this.f71252a;
        int i = this.f71253b;
        int i2 = ajty.f71279a;
        akak akak = new akak();
        RegisterReceiveSurfaceParams registerReceiveSurfaceParams = akak.f71539a;
        registerReceiveSurfaceParams.f81108a = akbh;
        registerReceiveSurfaceParams.f81109b = i;
        rnt a = ajty.m59007a((aucf) obj2);
        RegisterReceiveSurfaceParams registerReceiveSurfaceParams2 = akak.f71539a;
        registerReceiveSurfaceParams2.f81110c = a;
        ((ajyq) ((akbf) obj).mo25289B()).mo38648a(registerReceiveSurfaceParams2);
    }
}
