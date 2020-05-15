package p000;

/* renamed from: ayqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayqm {

    /* renamed from: a */
    public final Object f98291a;

    private ayqm(Object obj) {
        this.f98291a = obj;
    }

    /* renamed from: a */
    public static ayqm m84613a(Object obj) {
        return new ayqm(obj);
    }

    /* renamed from: a */
    public final ayql mo54282a(String str, Class... clsArr) {
        try {
            return new ayql(this, this.f98291a.getClass().getMethod(str, clsArr));
        } catch (NoSuchMethodException e) {
            throw new ayqn(e);
        }
    }
}
