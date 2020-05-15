package p000;

/* renamed from: bkxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkxe extends bkxa {

    /* renamed from: a */
    private final String f125374a;

    public bkxe(String str) {
        this.f125374a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final char mo66404a(int i) {
        return this.f125374a.charAt(i);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bkxf mo66413a(int i, int i2) {
        return new bkxe(this.f125374a.substring(i, i2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo66405a() {
        return this.f125374a;
    }

    /* renamed from: b */
    public final int mo66415b() {
        return this.f125374a.length();
    }

    /* renamed from: a */
    public final void mo66414a(blha blha) {
        String valueOf = String.valueOf(blha.f126491c);
        String valueOf2 = String.valueOf(this.f125374a);
        blha.f126491c = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }
}
