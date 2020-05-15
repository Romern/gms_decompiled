package p000;

import java.util.Map;

/* renamed from: eiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eiw {

    /* renamed from: a */
    public Integer f15104a;

    /* renamed from: b */
    public Map f15105b;

    /* renamed from: c */
    private String f15106c;

    /* renamed from: d */
    private eiv f15107d;

    /* renamed from: e */
    private Long f15108e;

    /* renamed from: f */
    private Long f15109f;

    /* renamed from: a */
    public final eix mo10179a() {
        String str = this.f15106c == null ? " transportName" : "";
        if (this.f15107d == null) {
            str = str.concat(" encodedPayload");
        }
        if (this.f15108e == null) {
            str = String.valueOf(str).concat(" eventMillis");
        }
        if (this.f15109f == null) {
            str = String.valueOf(str).concat(" uptimeMillis");
        }
        if (this.f15105b == null) {
            str = String.valueOf(str).concat(" autoMetadata");
        }
        if (str.isEmpty()) {
            return new eis(this.f15106c, this.f15104a, this.f15107d, this.f15108e.longValue(), this.f15109f.longValue(), this.f15105b);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo10183b(long j) {
        this.f15109f = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo10180a(long j) {
        this.f15108e = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo10181a(eiv eiv) {
        if (eiv != null) {
            this.f15107d = eiv;
            return;
        }
        throw new NullPointerException("Null encodedPayload");
    }

    /* renamed from: a */
    public final void mo10182a(String str) {
        if (str != null) {
            this.f15106c = str;
            return;
        }
        throw new NullPointerException("Null transportName");
    }
}
