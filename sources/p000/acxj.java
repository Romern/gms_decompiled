package p000;

import java.io.File;

/* renamed from: acxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acxj {

    /* renamed from: a */
    public final Class f61012a;

    /* renamed from: b */
    public final bxxk f61013b;

    /* renamed from: c */
    public final String f61014c;

    /* renamed from: d */
    public final File f61015d;

    public acxj(File file, Class cls, bxxk bxxk) {
        sdo.checkIfNull(cls, "Must specify non-null message type class");
        this.f61015d = file;
        this.f61014c = file.getName();
        this.f61012a = cls;
        this.f61013b = bxxk;
    }

    /* renamed from: a */
    public final boolean mo33196a() {
        if (mo33197b()) {
            absg.m48185a("Deleting file %s", this.f61014c);
            boolean delete = this.f61015d.delete();
            if (!delete) {
                absg.m48192b("Failed to delete file %s", this.f61014c);
            }
            return delete;
        }
        absg.m48185a("File %s already deleted", this.f61014c);
        return false;
    }

    /* renamed from: b */
    public final boolean mo33197b() {
        return this.f61015d.exists();
    }
}
