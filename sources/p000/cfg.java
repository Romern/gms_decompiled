package p000;

/* renamed from: cfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cfg {

    /* renamed from: a */
    private boolean f6672a;

    /* renamed from: b */
    private boolean f6673b;

    /* renamed from: c */
    private boolean f6674c;

    /* renamed from: e */
    private final boolean m4109e() {
        return (this.f6674c || this.f6673b) && this.f6672a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo3805a() {
        this.f6673b = true;
        return m4109e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized boolean mo3806b() {
        this.f6674c = true;
        return m4109e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo3807c() {
        this.f6673b = false;
        this.f6672a = false;
        this.f6674c = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized boolean mo3808d() {
        this.f6672a = true;
        return m4109e();
    }
}
