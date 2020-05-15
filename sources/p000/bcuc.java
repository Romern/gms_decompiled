package p000;

/* renamed from: bcuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcuc {

    /* renamed from: a */
    private Integer f104909a;

    /* renamed from: b */
    private Integer f104910b;

    /* renamed from: c */
    private bngx f104911c;

    /* renamed from: a */
    public final bcud mo57564a() {
        String str = this.f104909a == null ? " startIndex" : "";
        if (this.f104910b == null) {
            str = str.concat(" endIndex");
        }
        if (this.f104911c == null) {
            str = String.valueOf(str).concat(" textStyles");
        }
        if (str.isEmpty()) {
            return new bcsc(this.f104909a.intValue(), this.f104910b.intValue(), this.f104911c);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo57567b(int i) {
        this.f104909a = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo57565a(int i) {
        this.f104910b = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo57566a(bngx bngx) {
        if (bngx != null) {
            this.f104911c = bngx;
            return;
        }
        throw new NullPointerException("Null textStyles");
    }
}
