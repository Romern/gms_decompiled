package p000;

import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;

/* renamed from: aqfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqfx {
    /* renamed from: a */
    static long m71550a(LevelDb levelDb) {
        try {
            return bqcr.m112594a(levelDb.get(bqcn.m112583a(1)));
        } catch (LevelDbException | RuntimeException e) {
            return Long.MAX_VALUE;
        }
    }

    /* renamed from: a */
    static void m71551a(LevelDb levelDb, long j) {
        try {
            levelDb.put(bqcn.m112583a(1), bqcr.m112599b(j));
        } catch (LevelDbException | RuntimeException e) {
        }
    }
}
