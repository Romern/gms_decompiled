package p000;

/* renamed from: avth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avth extends avti {

    /* renamed from: c */
    private static final Logger f93885c = avpq.m79021h("IntegerListKey");

    public avth(String str) {
        super(str, bngx.m109376e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51590a(String str) {
        bngs j = bngx.m109377j();
        for (String str2 : bmyx.m108640a(',').mo66917a().mo66918a((CharSequence) str)) {
            try {
                j.mo67668c(Integer.valueOf(Integer.parseInt(str2)));
            } catch (NumberFormatException e) {
                f93885c.mo25416d("Unable to parse value: %s.", str);
                return (bngx) this.f93887b;
            }
        }
        return j.mo67664a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo51591a(Object obj) {
        return bmxr.m108543a(',').mo66874a((Iterable) ((bngx) obj));
    }
}
