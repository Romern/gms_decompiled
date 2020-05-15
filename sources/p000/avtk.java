package p000;

/* renamed from: avtk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avtk extends avti {

    /* renamed from: c */
    private static final sek f93890c = avpq.m79021h("LongKey");

    public avtk(String str, Long l) {
        super(str, l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51590a(String str) {
        try {
            return Long.valueOf(str);
        } catch (NumberFormatException e) {
            f93890c.mo25416d("Unable to parse value: %s.", str);
            return (Long) this.f93887b;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo51591a(Object obj) {
        return ((Long) obj).toString();
    }
}
