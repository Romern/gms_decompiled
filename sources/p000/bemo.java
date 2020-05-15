package p000;

import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import java.util.concurrent.Executor;

/* renamed from: bemo */
final /* synthetic */ class bemo implements bqer {

    /* renamed from: a */
    private final bend f111836a;

    public bemo(bend bend) {
        this.f111836a = bend;
    }

    /* renamed from: a */
    public final bqeu mo60793a(bqes bqes, Object obj) {
        bemk bemk;
        bend bend = this.f111836a;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        Executor executor = bend.f111858l;
        int i = Build.VERSION.SDK_INT;
        if (sQLiteDatabase.isWriteAheadLoggingEnabled()) {
            bemk = new bemk(sQLiteDatabase, bend.f111849c, executor, bend.f111863q);
        } else {
            bemk = new bemk(sQLiteDatabase, executor, executor, bend.f111863q);
        }
        bqgg a = bqga.m112775a(bemk);
        bemk.getClass();
        return bend.m95302a(a, new bemu(bemk));
    }
}
