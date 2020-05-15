package p000;

import android.app.Application;

/* renamed from: awgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awgf extends C1261p {

    /* renamed from: d */
    public ByteString f94293d;

    /* renamed from: e */
    public awge f94294e;

    /* renamed from: f */
    public boolean f94295f;

    /* renamed from: g */
    public boolean f94296g;

    /* renamed from: h */
    public int f94297h = 0;

    public awgf(Application application) {
        super(application);
    }

    /* renamed from: a */
    public final void mo52120a(awge awge) {
        this.f94294e = awge;
        if (awge != null && this.f94295f) {
            awge.mo52119a(this.f94297h, this.f94293d);
            this.f94295f = false;
            this.f94294e = null;
            this.f94297h = 0;
        }
    }
}
