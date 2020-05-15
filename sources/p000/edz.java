package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: edz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class edz extends srp {
    protected edz(Context context, String str) {
        super(context, str, "context", 1);
    }

    /* renamed from: c */
    private static void m10200c(SQLiteDatabase sQLiteDatabase) {
        eed.m10216a(sQLiteDatabase, "context", eer.f14794c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10021b(SQLiteDatabase sQLiteDatabase) {
        m10200c(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new UnsupportedOperationException("This method is not currently supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        eed.m10215a(sQLiteDatabase, "context", eer.f14792a, eer.f14793b);
        m10200c(sQLiteDatabase);
    }
}
