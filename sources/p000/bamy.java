package p000;

import android.database.sqlite.SQLiteException;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.leveldb.environment.LevelDbPlatform;
import java.io.File;

/* renamed from: bamy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bamy implements cayy {

    /* renamed from: a */
    private final cijl f101327a;

    public bamy(cijl cijl) {
        this.f101327a = cijl;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        boolean z;
        boolean z2;
        boolean z3;
        bamx bamx;
        bare bare;
        bams bams = (bams) this.f101327a.mo6445a();
        boolean z4 = true;
        if (!bams.f101289c.mo32684f()) {
            bang bang = (bang) bams.f101287a.mo16713a();
            synchronized (bang.f101347a) {
                if (!bang.f101351e) {
                    bang.f101351e = true;
                    try {
                        bang.f101352f.getReadableDatabase();
                    } catch (SQLiteException e) {
                        throw new RuntimeException("Failed to open SQLite database", e);
                    }
                }
            }
        }
        synchronized (bams.f101291e) {
            if (bams.f101293g == null) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108600b(z);
            if (bams.f101292f) {
                bams.f101293g = bare.m87435a(new banv("LevelDb database in lame duck mode"));
                z2 = false;
            } else {
                File f = bams.mo55789f();
                if (f.mkdirs()) {
                    achw achw = (achw) bams.f101288b.mo16713a();
                    String valueOf = String.valueOf(f.getAbsolutePath());
                    achw.mo25412b(valueOf.length() == 0 ? new String("Created dirs for ") : "Created dirs for ".concat(valueOf), new Object[0]);
                }
                File g = bams.mo55790g();
                if (g.exists()) {
                    ((achw) bams.f101288b.mo16713a()).mo25414c("Corrupted LevelDb database detected", new Object[0]);
                    try {
                        if (!bams.f101289c.mo32684f()) {
                            bams.mo55785c();
                            if (!g.delete()) {
                                ((achw) bams.f101288b.mo16713a()).mo25418e("Failed to clear LevelDb database corruption marker", new Object[0]);
                            }
                        } else {
                            LevelDb.destroy(bams.mo55789f());
                        }
                    } catch (LevelDbException e2) {
                        ((achw) bams.f101288b.mo16713a()).mo25418e("Failed to clean corrupted LevelDB database", new Object[0]);
                        bare = bare.m87435a(new banv("Error cleaning corrupted LevelDB database", e2));
                    }
                }
                LevelDb.Options options = new LevelDb.Options();
                if (bams.f101289c.mo32684f()) {
                    options.mDeleteIfCorrupted = false;
                }
                try {
                    LevelDb open = LevelDb.open(f, options);
                    bmxy.m108581a(open);
                    bare = new bare(open, null);
                } catch (LevelDbException e3) {
                    ((achw) bams.f101288b.mo16713a()).mo25418e("Failed to open LevelDB", new Object[0]);
                    bare = bare.m87435a(new banv("Error opening LevelDB", e3));
                }
                bams.f101293g = bare;
                z2 = bams.f101289c.mo32684f() && !bams.f101293g.mo55902a() && (((banv) bams.f101293g.mo55904c()).getCause() instanceof LevelDbException) && (bams.m87144a(bams.f101293g.mo55904c()) || !LevelDbPlatform.restrictCorruptionMitigation());
            }
        }
        if (z2) {
            bams.f101295i.mo55758a();
        }
        synchronized (bams.f101291e) {
            if (bams.f101293g != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            bmxy.m108601b(z3, "open() must be called before createRootFactory()");
            if (bams.f101294h != null) {
                z4 = false;
            }
            bmxy.m108601b(z4, "only one root factory instance allowed");
            bams.f101294h = new bamx(null, bams.f101288b, bams, ByteString.f164797b, ByteString.f164797b, new bane(bams.f101288b, bams, bams.f101289c, bams.f101290d, bams.f101295i), bams.f101289c, bams.f101290d, bams.f101295i);
            bamx = bams.f101294h;
        }
        cazf.m127593a(bamx, "Cannot return null from a non-@Nullable @Provides method");
        return bamx;
    }
}
