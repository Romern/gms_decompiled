package p000;

/* renamed from: nvy */
final /* synthetic */ class nvy implements bmzi {

    /* renamed from: a */
    private final nij f36708a;

    public nvy(nij nij) {
        this.f36708a = nij;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        String valueOf = String.valueOf(this.f36708a.f35707d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append(valueOf);
        sb.append(" crashed with no exn");
        return new RuntimeException(sb.toString());
    }
}
