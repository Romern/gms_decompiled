package p000;

import android.database.sqlite.SQLiteQueryBuilder;

/* renamed from: eeq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eeq extends SQLiteQueryBuilder {

    /* renamed from: a */
    private static eeq f14791a = null;

    private eeq() {
    }

    /* renamed from: a */
    public static final eep m10250a() {
        return new eep();
    }

    /* renamed from: b */
    public static synchronized void m10251b() {
        synchronized (eeq.class) {
            if (f14791a == null) {
                f14791a = new eeq();
            }
        }
    }
}
