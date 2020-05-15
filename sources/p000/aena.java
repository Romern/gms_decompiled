package p000;

/* renamed from: aena */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aena extends aeoo {

    /* renamed from: a */
    final /* synthetic */ String f63532a;

    /* renamed from: b */
    final /* synthetic */ String f63533b;

    /* renamed from: c */
    final /* synthetic */ String f63534c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aena(rjo rjo, rkb rkb, String str, String str2, String str3) {
        super(rjo, rkb);
        this.f63532a = str;
        this.f63533b = str2;
        this.f63534c = str3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        aene aene = (aene) rjd;
        aeor aeor = new aeor(this);
        String str = this.f63532a;
        String str2 = this.f63533b;
        String str3 = this.f63534c;
        sdo.checkIfNull(aeor, "callback == null");
        ((aenl) aene.mo25289B()).mo34373a(str, str2, str3, aene.f63536a, aeor);
    }
}
