package p000;

/* renamed from: ahwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahwd {

    /* renamed from: a */
    private cakq f68215a;

    /* renamed from: b */
    private Boolean f68216b;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ahwe mo37220a() {
        String str = this.f68215a == null ? " response" : "";
        if (this.f68216b == null) {
            str = str.concat(" isRetriable");
        }
        if (str.isEmpty()) {
            return new ahtl(this.f68215a, this.f68216b.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37221a(cakq cakq) {
        if (cakq != null) {
            this.f68215a = cakq;
            return;
        }
        throw new NullPointerException("Null response");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37222a(boolean z) {
        this.f68216b = Boolean.valueOf(z);
    }
}
