package p000;

import java.io.File;
import java.io.IOException;

/* renamed from: bbgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbgf implements bbgj {

    /* renamed from: a */
    private final bqgj f102584a;

    /* renamed from: b */
    private final bmzi f102585b;

    public bbgf(bqgj bqgj, File file, int i) {
        this.f102584a = bqgj;
        this.f102585b = bmzn.m108681a((bmzi) new bbgb(file, i));
    }

    /* renamed from: a */
    public static String m87983a(bxtx bxtx) {
        return !bxtx.mo73779j() ? boan.f132472f.mo68794a(bxtx.mo73780k()).toLowerCase() : "_";
    }

    /* renamed from: a */
    public static void m87984a(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                m87984a(file2);
            }
        }
        file.delete();
    }

    /* renamed from: a */
    public final beeq mo56132a() {
        try {
            return (beeq) this.f102585b.mo6606a();
        } catch (bbge e) {
            throw new IOException(e);
        }
    }

    /* renamed from: a */
    public final bqgg mo56101a(Iterable iterable, bbfu bbfu) {
        bmxy.m108581a(iterable);
        bmxy.m108581a(bbfu);
        return this.f102584a.mo25819b(new bbgc(this, iterable));
    }

    /* renamed from: a */
    public final bqgg mo56133a(Iterable iterable, bbfw bbfw) {
        bmxy.m108581a(iterable);
        bmxy.m108581a(bbfw);
        return this.f102584a.mo25819b(new bbgd(this, iterable, bbfw));
    }
}
