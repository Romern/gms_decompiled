package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: gvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gvg {

    /* renamed from: a */
    public static final sbw f19067a = new sbw("AccountTransfer", "ATDatabaseManager");

    /* renamed from: b */
    public static final Object f19068b = new Object();

    /* renamed from: c */
    public static gvg f19069c;

    /* renamed from: d */
    private final gvf f19070d;

    private gvg(Context context) {
        this.f19070d = new gvf(context);
    }

    /* renamed from: a */
    public static gvg m13994a(Context context) {
        gvg gvg;
        synchronized (f19068b) {
            if (f19069c == null) {
                f19069c = new gvg(context);
            }
            gvg = f19069c;
        }
        return gvg;
    }

    /* renamed from: a */
    public final synchronized SQLiteDatabase mo12265a() {
        return this.f19070d.getWritableDatabase();
    }
}
