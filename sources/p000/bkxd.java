package p000;

/* renamed from: bkxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkxd extends bkxa {

    /* renamed from: a */
    private final StringBuilder f125373a;

    public bkxd(StringBuilder sb) {
        this.f125373a = sb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final char mo66404a(int i) {
        return this.f125373a.charAt(i);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bkxf mo66413a(int i, int i2) {
        return new bkxe(this.f125373a.substring(i, i2));
    }

    /* renamed from: b */
    public final int mo66415b() {
        return this.f125373a.length();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo66405a() {
        return this.f125373a.toString();
    }

    /* renamed from: a */
    public final void mo66414a(blha blha) {
        String str = blha.f126491c;
        String valueOf = String.valueOf(this.f125373a);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(valueOf);
        blha.f126491c = sb.toString();
    }
}
