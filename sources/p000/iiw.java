package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: iiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iiw {

    /* renamed from: a */
    public static final Logger f21076a = new Logger(iiw.class.getSimpleName());

    /* renamed from: b */
    private static iiw f21077b;

    /* renamed from: c */
    private final iiv f21078c;

    private iiw(Context context) {
        this.f21078c = new iiv(context, "auth.proximity.permit_store");
    }

    /* renamed from: a */
    public static synchronized iiw m15495a(Context context) {
        iiw iiw;
        synchronized (iiw.class) {
            if (f21077b == null) {
                f21077b = new iiw(context.getApplicationContext());
            }
            iiw = f21077b;
        }
        return iiw;
    }

    /* renamed from: a */
    public final synchronized SQLiteDatabase mo13052a() {
        try {
        } catch (SQLiteException e) {
            throw new iiy(e);
        }
        return adbc.m50103a(this.f21078c, "auth.proximity.permit_store", ccel.f178835a.mo6606a().mo75833a());
    }
}
