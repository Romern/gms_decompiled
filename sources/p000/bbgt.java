package p000;

import java.io.File;

/* renamed from: bbgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbgt implements bbgj {

    /* renamed from: a */
    public final ayte f102608a;

    /* renamed from: b */
    public final bmzi f102609b;

    /* renamed from: c */
    private final bmzi f102610c;

    public bbgt(bmzi bmzi, ayte ayte, bmzi bmzi2) {
        this.f102610c = bmzi;
        this.f102608a = ayte;
        this.f102609b = bmzi2;
    }

    /* renamed from: a */
    public static void m88000a(benk benk, int i) {
        benk.mo60821a(" WHEN (");
        benk.mo60821a("(SELECT SUM(LENGTH(key_data) + LENGTH(value_data)) > ");
        benk.f111878a.append(i);
        benk.mo60821a(" AND COUNT(*) > 1 FROM infinite_data_cache) ");
        benk.mo60821a(") BEGIN DELETE FROM infinite_data_cache WHERE rowid=(SELECT rowid FROM infinite_data_cache ORDER BY access_ms ASC LIMIT 1); END");
    }

    /* renamed from: a */
    private static void m88001a(File file, bnsn bnsn) {
        bnre i = bngx.m109359a(new File(String.valueOf(file.getPath()).concat("-wal")), new File(String.valueOf(file.getPath()).concat("-journal")), new File(String.valueOf(file.getPath()).concat("-shm")), file).listIterator();
        boolean z = false;
        while (i.hasNext()) {
            File file2 = (File) i.next();
            z |= file2.exists() && !file2.delete();
        }
        if (z) {
            bnsi c = bnsn.mo68388c();
            c.mo68432a("bbgt", "a", 331, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Failed to cleanup database files");
        }
    }

    /* renamed from: a */
    public final bqgg mo56101a(Iterable iterable, bbfu bbfu) {
        return bqdx.m112674a((bqgg) this.f102610c.mo6606a(), new bbgn(this, iterable), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56133a(Iterable iterable, bbfw bbfw) {
        return bqdx.m112674a((bqgg) this.f102610c.mo6606a(), new bbgm(this, iterable, bbfw), bqfb.INSTANCE);
    }
}
