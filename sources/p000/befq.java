package p000;

import android.net.Uri;
import java.io.File;

/* renamed from: befq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class befq {

    /* renamed from: a */
    private final Uri.Builder f111512a = new Uri.Builder().scheme("file").authority("").path("/");

    /* renamed from: b */
    private final bngs f111513b = bngx.m109377j();

    /* renamed from: a */
    public final Uri mo60670a() {
        return this.f111512a.encodedFragment(behf.m95043a(this.f111513b.mo67664a())).build();
    }

    /* renamed from: b */
    public final void mo60673b(String str) {
        this.f111512a.path(str);
    }

    /* renamed from: a */
    public final void mo60671a(File file) {
        this.f111512a.path(file.getAbsolutePath());
    }

    /* renamed from: a */
    public final void mo60672a(String str) {
        this.f111512a.appendPath(str);
    }
}
