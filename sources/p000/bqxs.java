package p000;

import java.util.Map;

/* renamed from: bqxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqxs {

    /* renamed from: a */
    public bqxo f141912a;

    /* renamed from: b */
    public Map f141913b;

    /* renamed from: c */
    public bqxu f141914c;

    /* renamed from: d */
    private Integer f141915d;

    /* renamed from: e */
    private Integer f141916e;

    /* renamed from: f */
    private Integer f141917f;

    /* renamed from: g */
    private Integer f141918g;

    /* renamed from: h */
    private Integer f141919h;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bqxt mo69445a() {
        String str = this.f141915d == null ? " headerSize" : "";
        if (this.f141916e == null) {
            str = str.concat(" flags");
        }
        if (this.f141917f == null) {
            str = String.valueOf(str).concat(" keyIndex");
        }
        if (this.f141913b == null) {
            str = String.valueOf(str).concat(" values");
        }
        if (this.f141918g == null) {
            str = String.valueOf(str).concat(" parentEntry");
        }
        if (this.f141914c == null) {
            str = String.valueOf(str).concat(" parent");
        }
        if (this.f141919h == null) {
            str = String.valueOf(str).concat(" typeChunkIndex");
        }
        if (str.isEmpty()) {
            return new bqws(this.f141915d.intValue(), this.f141916e.intValue(), this.f141917f.intValue(), this.f141912a, this.f141913b, this.f141918g.intValue(), this.f141914c, this.f141919h.intValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo69447b(int i) {
        this.f141915d = Integer.valueOf(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo69448c(int i) {
        this.f141917f = Integer.valueOf(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo69449d(int i) {
        this.f141918g = Integer.valueOf(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo69450e(int i) {
        this.f141919h = Integer.valueOf(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo69446a(int i) {
        this.f141916e = Integer.valueOf(i);
    }
}
