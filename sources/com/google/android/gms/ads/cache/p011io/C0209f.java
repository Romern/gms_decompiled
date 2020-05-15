package com.google.android.gms.ads.cache.p011io;

import java.io.File;

/* renamed from: com.google.android.gms.ads.cache.io.f */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0209f extends C0208e {

    /* renamed from: g */
    public int f7878g = 1;

    /* renamed from: h */
    public final File f7879h;

    /* renamed from: i */
    public final /* synthetic */ C0210g f7880i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0209f(C0210g gVar, File file) {
        super(file);
        this.f7880i = gVar;
        this.f7879h = file;
    }

    public final void close() {
        synchronized (this.f7880i.f7882b) {
            int i = this.f7878g - 1;
            this.f7878g = i;
            if (i == 0) {
                this.f7880i.f7883c.remove(this.f7879h);
                super.close();
            }
        }
    }

    /* renamed from: d */
    public final void mo6415d() {
        synchronized (this.f7880i.f7882b) {
            this.f7878g = 0;
            this.f7880i.f7883c.remove(this.f7879h);
            synchronized (this.f7872a) {
                mo6416e();
                super.mo6417f();
                this.f7873b.delete();
                this.f7875d.close();
                this.f7875d = null;
            }
        }
    }
}
