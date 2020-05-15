package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import java.util.concurrent.Callable;

/* renamed from: bcai */
final /* synthetic */ class bcai implements Callable {

    /* renamed from: a */
    private final bcas f103873a;

    /* renamed from: b */
    private final ContentValues f103874b;

    /* renamed from: c */
    private final bcsj f103875c;

    public bcai(bcas bcas, ContentValues contentValues, bcsj bcsj) {
        this.f103873a = bcas;
        this.f103874b = contentValues;
        this.f103875c = bcsj;
    }

    public final Object call() {
        bcas bcas = this.f103873a;
        ContentValues contentValues = this.f103874b;
        bcsj bcsj = this.f103875c;
        long a = bcas.f103908c.mo54676a(bcas.mo56655d("contacts"), contentValues, 0);
        if (a >= 0) {
            bcas.mo56657d(bcsj.mo57302a());
            return Long.valueOf(a);
        }
        throw new SQLiteException("Failed to save contact.");
    }
}
