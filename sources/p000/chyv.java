package p000;

import java.io.InputStream;

/* renamed from: chyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chyv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InputStream f189547a;

    /* renamed from: b */
    final /* synthetic */ chzf f189548b;

    public chyv(chzf chzf, InputStream inputStream) {
        this.f189548b = chzf;
        this.f189547a = inputStream;
    }

    public final void run() {
        this.f189548b.f189571d.mo85780a(this.f189547a);
    }
}
