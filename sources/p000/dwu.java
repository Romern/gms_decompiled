package p000;

/* renamed from: dwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class dwu extends dpu {

    /* renamed from: a */
    private final String f14316a;

    /* renamed from: b */
    private final String f14317b;

    /* renamed from: c */
    private final Object[] f14318c;

    public dwu(String str, String str2, Object... objArr) {
        dwq.m9665i().mo20506b();
        this.f14316a = str;
        this.f14317b = str2;
        this.f14318c = objArr;
    }

    /* renamed from: a */
    public void mo9477a(int i) {
        dss.m9249a(this.f14316a, "Failed %s: network status=%s", String.format(this.f14317b, this.f14318c), Integer.toString(i));
    }

    /* renamed from: a */
    public abstract void mo9478a(Object obj);
}
