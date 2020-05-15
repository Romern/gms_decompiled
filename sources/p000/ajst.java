package p000;

import com.google.android.gms.nearby.sharing.internal.RegisterSendSurfaceParams;

/* renamed from: ajst */
final /* synthetic */ class ajst implements roo {

    /* renamed from: a */
    private final akbh f71247a;

    /* renamed from: b */
    private final ajxo f71248b;

    /* renamed from: c */
    private final int f71249c;

    public ajst(akbh akbh, ajxo ajxo, int i) {
        this.f71247a = akbh;
        this.f71248b = ajxo;
        this.f71249c = i;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        akbh akbh = this.f71247a;
        ajxo ajxo = this.f71248b;
        int i = this.f71249c;
        int i2 = ajty.f71279a;
        akam akam = new akam();
        RegisterSendSurfaceParams registerSendSurfaceParams = akam.f71540a;
        registerSendSurfaceParams.f81111a = akbh;
        registerSendSurfaceParams.f81112b = ajxo;
        registerSendSurfaceParams.f81113c = i;
        rnt a = ajty.m59007a((aucf) obj2);
        RegisterSendSurfaceParams registerSendSurfaceParams2 = akam.f71540a;
        registerSendSurfaceParams2.f81114d = a;
        ((ajyq) ((akbf) obj).mo25289B()).mo38649a(registerSendSurfaceParams2);
    }
}
