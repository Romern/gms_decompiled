package p000;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;

/* renamed from: nle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nle implements Callable {

    /* renamed from: a */
    final /* synthetic */ nlg f35944a;

    public nle(nlg nlg) {
        this.f35944a = nlg;
    }

    /* renamed from: a */
    public final File mo21029a() {
        nlg nlg = this.f35944a;
        bnsn bnsn = nlg.f35946a;
        Context context = (Context) nlg.f35947b.get();
        if (context == null) {
            bnsi c = nlg.f35946a.mo68388c();
            c.mo68432a("nle", "a", 90, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Context is getting destroyed. Assuming client has unbound, not calling listeners");
            return null;
        }
        File createTempFile = File.createTempFile("dump", null, context.getCacheDir());
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        try {
            nzm.m28230a((Context) this.f35944a.f35947b.get(), fileOutputStream);
            fileOutputStream.close();
            return createTempFile;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        nlg nlg = this.f35944a;
        bnsn bnsn = nlg.f35946a;
        Context context = (Context) nlg.f35947b.get();
        File file = null;
        if (context == null) {
            bnsi c = nlg.f35946a.mo68388c();
            c.mo68432a("nle", "a", 90, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Context is getting destroyed. Assuming client has unbound, not calling listeners");
        } else {
            file = File.createTempFile("dump", null, context.getCacheDir());
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                nzm.m28230a((Context) this.f35944a.f35947b.get(), fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        return file;
        throw th;
    }
}
