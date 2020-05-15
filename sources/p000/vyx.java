package p000;

import java.io.File;

/* renamed from: vyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vyx {

    /* renamed from: a */
    public final File f50258a;

    /* renamed from: b */
    public final File f50259b;

    /* renamed from: c */
    public final File f50260c;

    public vyx(File file, File file2, File file3) {
        this.f50258a = file;
        this.f50259b = file2;
        this.f50260c = file3;
    }

    /* renamed from: a */
    public static vyx m41621a(File file) {
        return new vyx(file, null, null);
    }

    /* renamed from: b */
    public final boolean mo28984b() {
        File file;
        if (!this.f50258a.isFile() || (file = this.f50259b) == null || !file.isDirectory()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final File mo28983a() {
        return this.f50258a.getParentFile();
    }
}
