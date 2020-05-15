package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import java.util.concurrent.Callable;

/* renamed from: bbzj */
final /* synthetic */ class bbzj implements Callable {

    /* renamed from: a */
    private final bcas f103798a;

    /* renamed from: b */
    private final bcsj f103799b;

    public bbzj(bcas bcas, bcsj bcsj) {
        this.f103798a = bcas;
        this.f103799b = bcsj;
    }

    public final Object call() {
        bcas bcas = this.f103798a;
        bcsj bcsj = this.f103799b;
        long c = bcas.mo56649c(bcsj.mo57302a());
        if (c == -1) {
            return Long.valueOf(bcas.mo56637b(bcsj));
        }
        ContentValues a = bcbv.m88773a(bcsj);
        if (bcas.f103908c.mo54674a(bcas.mo56655d("contacts"), a, "id = ?", new String[]{String.valueOf(c)}) >= 0) {
            bcas.mo56657d(bcsj.mo57302a());
            return Long.valueOf(c);
        }
        throw new SQLiteException("Failed to update contact.");
    }
}
