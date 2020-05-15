package p000;

import android.net.Uri;

/* renamed from: bejq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bejq {

    /* renamed from: a */
    public bngs f111669a;

    /* renamed from: b */
    public bxus f111670b;

    /* renamed from: c */
    public belm f111671c;

    /* renamed from: d */
    private Uri f111672d;

    /* renamed from: e */
    private bxxc f111673e;

    /* renamed from: f */
    private bngx f111674f;

    /* renamed from: g */
    private beky f111675g;

    /* renamed from: a */
    public final bejr mo60761a() {
        bngs bngs = this.f111669a;
        if (bngs != null) {
            this.f111674f = bngs.mo67664a();
        } else if (this.f111674f == null) {
            this.f111674f = bngx.m109376e();
        }
        String str = this.f111672d == null ? " uri" : "";
        if (this.f111673e == null) {
            str = str.concat(" schema");
        }
        if (this.f111671c == null) {
            str = String.valueOf(str).concat(" handler");
        }
        if (this.f111675g == null) {
            str = String.valueOf(str).concat(" variantConfig");
        }
        if (this.f111670b == null) {
            str = String.valueOf(str).concat(" extensionRegistry");
        }
        if (str.isEmpty()) {
            return new beik(this.f111672d, this.f111673e, this.f111671c, this.f111674f, this.f111675g, this.f111670b);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo60762a(Uri uri) {
        if (uri != null) {
            this.f111672d = uri;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    /* renamed from: a */
    public final void mo60763a(beky beky) {
        if (beky != null) {
            this.f111675g = beky;
            return;
        }
        throw new NullPointerException("Null variantConfig");
    }

    /* renamed from: a */
    public final void mo60764a(bxxc bxxc) {
        if (bxxc != null) {
            this.f111673e = bxxc;
            return;
        }
        throw new NullPointerException("Null schema");
    }
}
