package p000;

import android.database.sqlite.SQLiteException;

/* renamed from: bemy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bemy extends SQLiteException {
    public bemy(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
