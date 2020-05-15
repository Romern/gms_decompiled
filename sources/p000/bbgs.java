package p000;

import android.database.sqlite.SQLiteException;
import java.io.File;

/* renamed from: bbgs */
final /* synthetic */ class bbgs implements bqeh {

    /* renamed from: a */
    private final File f102606a;

    /* renamed from: b */
    private final bnsn f102607b;

    public bbgs(File file, bnsn bnsn) {
        this.f102606a = file;
        this.f102607b = bnsn;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        File file = this.f102606a;
        bnsn bnsn = this.f102607b;
        SQLiteException sQLiteException = (SQLiteException) obj;
        File file2 = new File(file, "infinite_data_cache");
        bnre i = bngx.m109359a(new File(String.valueOf(file2.getPath()).concat("-wal")), new File(String.valueOf(file2.getPath()).concat("-journal")), new File(String.valueOf(file2.getPath()).concat("-shm")), file2).listIterator();
        boolean z = false;
        while (i.hasNext()) {
            File file3 = (File) i.next();
            z |= file3.exists() && !file3.delete();
        }
        if (z) {
            bnsi c = bnsn.mo68388c();
            c.mo68432a("bbgt", "a", 331, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Failed to cleanup database files");
        }
        return bqga.m112777a((Throwable) sQLiteException);
    }
}
