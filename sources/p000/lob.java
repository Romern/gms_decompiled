package p000;

import android.content.Intent;

/* renamed from: lob */
final /* synthetic */ class lob implements Runnable {

    /* renamed from: a */
    private final loc f26489a;

    /* renamed from: b */
    private final int f26490b;

    public lob(loc loc, int i) {
        this.f26489a = loc;
        this.f26490b = i;
    }

    public final void run() {
        loc loc = this.f26489a;
        Intent a = lio.m19192a(this.f26490b);
        if (a != null) {
            loc.f26159a.startActivity(a);
        }
    }
}
