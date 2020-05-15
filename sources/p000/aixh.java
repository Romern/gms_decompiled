package p000;

/* renamed from: aixh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aixh {

    /* renamed from: a */
    public String f69976a;

    /* renamed from: b */
    public boolean f69977b;

    /* renamed from: c */
    public String f69978c;

    /* renamed from: d */
    public int f69979d = -1;

    /* renamed from: a */
    public final aixi mo38208a() {
        return new aixi(this);
    }

    /* renamed from: b */
    public final void mo38210b() {
        this.f69977b = true;
    }

    /* renamed from: a */
    public final void mo38209a(String str) {
        if (!str.startsWith("0p:")) {
            throw new IllegalArgumentException(str.length() == 0 ? new String("Invalid zero party package name: ") : "Invalid zero party package name: ".concat(str));
        }
        this.f69976a = str;
    }
}
