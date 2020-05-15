package p000;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.DefaultDatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: acks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acks extends srp {

    /* renamed from: a */
    private final banp f60044a;

    /* JADX WARNING: Illegal instructions before constructor call */
    public acks(Context context, banp banp, babr babr, DatabaseErrorHandler databaseErrorHandler) {
        super(context, "icing-mdh.db", "icing-mdh.db", 2, r5);
        DefaultDatabaseErrorHandler defaultDatabaseErrorHandler;
        if (!babr.mo32684f()) {
            defaultDatabaseErrorHandler = new DefaultDatabaseErrorHandler();
        } else {
            defaultDatabaseErrorHandler = databaseErrorHandler;
        }
        this.f60044a = banp;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        this.f60044a.mo55813a(sQLiteDatabase);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10021b(SQLiteDatabase sQLiteDatabase) {
        for (bano bano : this.f60044a.f101361a) {
            bano.mo55812b();
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        banp banp = this.f60044a;
        ((achw) banp.f101362b.mo16713a()).mo25414c("Downgrading database from v%d to v%d", Integer.valueOf(i), Integer.valueOf(i2));
        banp.mo55813a(sQLiteDatabase);
        for (bano bano : banp.f101361a) {
            bano.mo55809a();
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        banp banp = this.f60044a;
        ((achw) banp.f101362b.mo16713a()).mo25414c("Upgrading database from v%d to v%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 != 2) {
            for (bano bano : banp.f101361a) {
                bano.mo55811a(sQLiteDatabase, i, i2);
            }
            return;
        }
        banp.mo55813a(sQLiteDatabase);
    }
}
