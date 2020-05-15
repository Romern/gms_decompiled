package p000;

/* renamed from: aqfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqfk {

    /* renamed from: a */
    public String f85966a;

    /* renamed from: b */
    private Boolean f85967b;

    /* renamed from: c */
    private Boolean f85968c;

    /* renamed from: d */
    private Long f85969d;

    /* renamed from: e */
    private Integer f85970e;

    /* renamed from: f */
    private Boolean f85971f;

    /* renamed from: g */
    private Long f85972g;

    /* renamed from: a */
    public final aqfl mo47823a() {
        String str = this.f85967b == null ? " jpegMissing" : "";
        if (this.f85968c == null) {
            str = str.concat(" jpegTampered");
        }
        if (this.f85969d == null) {
            str = String.valueOf(str).concat(" jpegWrongLength");
        }
        if (this.f85970e == null) {
            str = String.valueOf(str).concat(" jpegTamperedBytes");
        }
        if (this.f85971f == null) {
            str = String.valueOf(str).concat(" jpegNewlyTampered");
        }
        if (this.f85972g == null) {
            str = String.valueOf(str).concat(" jpegModificationTime");
        }
        if (str.isEmpty()) {
            return new aqeh(this.f85967b.booleanValue(), this.f85968c.booleanValue(), this.f85969d.longValue(), this.f85970e.intValue(), this.f85971f.booleanValue(), this.f85966a, this.f85972g.longValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo47827b(long j) {
        this.f85969d = Long.valueOf(j);
    }

    /* renamed from: c */
    public final void mo47829c(boolean z) {
        this.f85968c = Boolean.valueOf(z);
    }

    /* renamed from: b */
    public final void mo47828b(boolean z) {
        this.f85971f = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final void mo47824a(int i) {
        this.f85970e = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo47825a(long j) {
        this.f85972g = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo47826a(boolean z) {
        this.f85967b = Boolean.valueOf(z);
    }
}
