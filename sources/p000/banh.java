package p000;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: banh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class banh implements DatabaseErrorHandler {

    /* renamed from: a */
    private final bamj f101353a;

    public banh(bamj bamj) {
        this.f101353a = bamj;
    }

    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        this.f101353a.mo55758a();
    }
}
