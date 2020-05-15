package p000;

/* renamed from: avtg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avtg extends avti {

    /* renamed from: c */
    private static final Logger f93884c = avpq.m79021h("IntegerKey");

    public avtg(String str, Integer num) {
        super(str, num);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51590a(String str) {
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e) {
            f93884c.mo25416d("Unable to parse value: %s.", str);
            return (Integer) this.f93887b;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo51591a(Object obj) {
        return ((Integer) obj).toString();
    }
}
