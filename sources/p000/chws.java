package p000;

import java.io.InputStream;

/* renamed from: chws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class chws implements cifa {
    /* renamed from: a */
    public final void mo85779a(chre chre) {
        chzy e = mo85766e();
        bmxy.m108582a(chre, "compressor");
        e.mo85855a(chre);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract chwr mo85739c();

    /* renamed from: d */
    public final void mo85781d(int i) {
        chwr c = mo85739c();
        synchronized (c.f189415k) {
            c.f189417m += i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract chzy mo85766e();

    /* renamed from: g */
    public final void mo85782g() {
        if (!mo85766e().mo85857b()) {
            mo85766e().mo85854a();
        }
    }

    /* renamed from: a */
    public final void mo85780a(InputStream inputStream) {
        bmxy.m108582a(inputStream, "message");
        try {
            if (!mo85766e().mo85857b()) {
                mo85766e().mo85856a(inputStream);
            }
        } finally {
            ciag.m149914a(inputStream);
        }
    }
}
