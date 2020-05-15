package p000;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: ns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1226ns {

    /* renamed from: a */
    public final File f26761a;

    /* renamed from: b */
    public final File f26762b;

    public C1226ns(File file) {
        this.f26761a = file;
        this.f26762b = new File(file.getPath() + ".bak");
    }

    /* renamed from: a */
    public static void m19707a(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException e) {
        }
    }
}
