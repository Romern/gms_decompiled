package p000;

/* renamed from: eja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eja {

    /* renamed from: a */
    public byte[] f15114a;

    /* renamed from: b */
    private String f15115b;

    /* renamed from: c */
    private eie f15116c;

    /* renamed from: a */
    public final ejb mo10188a() {
        String str = this.f15115b == null ? " backendName" : "";
        if (this.f15116c == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new eit(this.f15115b, this.f15114a, this.f15116c);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo10189a(eie eie) {
        if (eie != null) {
            this.f15116c = eie;
            return;
        }
        throw new NullPointerException("Null priority");
    }

    /* renamed from: a */
    public final void mo10190a(String str) {
        if (str != null) {
            this.f15115b = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }
}
