package p000;

import android.content.Context;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;

/* renamed from: nlf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nlf implements Callable {

    /* renamed from: a */
    final /* synthetic */ nlg f35945a;

    public nlf(nlg nlg) {
        this.f35945a = nlg;
    }

    /* renamed from: a */
    public final File mo21031a() {
        nlg nlg = this.f35945a;
        bnsn bnsn = nlg.f35946a;
        Context context = (Context) nlg.f35947b.get();
        if (context == null) {
            bnsi c = nlg.f35946a.mo68388c();
            c.mo68432a("nlf", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Context is getting destroyed. Assuming client has unbound, not calling listeners");
            return null;
        }
        File createTempFile = File.createTempFile("dump", null, context.getCacheDir());
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        try {
            long a = nzm.m28228a(fileOutputStream, 0);
            fileOutputStream.close();
            if (a > 20000000) {
                int i = 100000;
                while (a > 20000000) {
                    createTempFile.delete();
                    createTempFile = File.createTempFile("dump", null, context.getCacheDir());
                    FileOutputStream fileOutputStream2 = new FileOutputStream(createTempFile);
                    try {
                        long a2 = nzm.m28228a(fileOutputStream2, i);
                        fileOutputStream2.close();
                        i /= 2;
                        a = a2;
                    } catch (Throwable th) {
                        bqye.m113761a(th, th);
                    }
                }
            }
            return createTempFile;
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
        throw th;
        throw th;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        nlg nlg = this.f35945a;
        bnsn bnsn = nlg.f35946a;
        Context context = (Context) nlg.f35947b.get();
        if (context == null) {
            bnsi c = nlg.f35946a.mo68388c();
            c.mo68432a("nlf", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Context is getting destroyed. Assuming client has unbound, not calling listeners");
            return null;
        }
        File createTempFile = File.createTempFile("dump", null, context.getCacheDir());
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        try {
            long a = nzm.m28228a(fileOutputStream, 0);
            fileOutputStream.close();
            if (a > 20000000) {
                int i = 100000;
                while (a > 20000000) {
                    createTempFile.delete();
                    createTempFile = File.createTempFile("dump", null, context.getCacheDir());
                    FileOutputStream fileOutputStream2 = new FileOutputStream(createTempFile);
                    try {
                        long a2 = nzm.m28228a(fileOutputStream2, i);
                        fileOutputStream2.close();
                        i /= 2;
                        a = a2;
                    } catch (Throwable th) {
                        bqye.m113761a(th, th);
                    }
                }
            }
            return createTempFile;
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
        throw th;
        throw th;
    }
}
