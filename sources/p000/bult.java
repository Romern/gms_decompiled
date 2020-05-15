package p000;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bult */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bult extends bfki {

    /* renamed from: a */
    public static final bult f154184a = new bult();

    /* renamed from: b */
    public bulp f154185b;

    /* renamed from: c */
    public final AtomicBoolean f154186c = new AtomicBoolean();

    /* renamed from: d */
    public bsax f154187d;

    /* renamed from: e */
    public boolean f154188e;

    private bult() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61401a(byte[] bArr) {
        if (this.f154187d == null) {
            try {
                bsax bsax = new bsax(bgox.f117104br);
                bsax.mo70111a(bArr);
                if (bgox.f117104br.equals(bsax.f143914b)) {
                    bulp bulp = this.f154185b;
                    if (bgox.f117104br.equals(bsax.f143914b)) {
                        bulp.mo72821a(bsax);
                    }
                }
            } catch (ClassCastException | NoSuchFieldError e) {
                throw new IOException(e);
            }
        }
    }
}
