package p000;

/* renamed from: avtj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avtj extends avti {

    /* renamed from: c */
    private static final sek f93888c = avpq.m79021h("LiteProtoKey");

    /* renamed from: d */
    private final bxxc f93889d;

    public avtj(String str, bxxc bxxc) {
        super(str, bmvz.f131120a);
        this.f93889d = bxxc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51590a(String str) {
        try {
            return !str.isEmpty() ? bmxv.m108566b(this.f93889d.mo73646aR().mo73633b(sqd.m35966a(str)).mo74062i()) : bmvz.f131120a;
        } catch (bxwf e) {
            f93888c.mo25417e("Unable to parse the proto value.", e, new Object[0]);
            return bmvz.f131120a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo51591a(Object obj) {
        bmxv bmxv = (bmxv) obj;
        return bmxv.mo66813a() ? sqd.m35968b(((bxxc) bmxv.mo66814b()).mo73642k()) : "";
    }
}
