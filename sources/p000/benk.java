package p000;

/* renamed from: benk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class benk {

    /* renamed from: a */
    public final StringBuilder f111878a;

    public benk(String str) {
        StringBuilder sb = new StringBuilder();
        this.f111878a = sb;
        sb.append("CREATE TEMP TRIGGER ");
        sb.append(str);
        sb.append(" ");
    }

    /* renamed from: a */
    public final benl mo60820a() {
        return new benl(this.f111878a.toString());
    }

    /* renamed from: a */
    public final void mo60821a(String str) {
        this.f111878a.append(str);
    }
}
