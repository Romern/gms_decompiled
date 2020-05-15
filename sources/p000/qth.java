package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: qth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qth {

    /* renamed from: a */
    public static final sek f42096a = qqu.m32671b("DatabaseManager");

    /* renamed from: b */
    private static qth f42097b;

    /* renamed from: c */
    private final qtg f42098c;

    private qth(Context context) {
        this.f42098c = new qtg(context);
    }

    /* renamed from: a */
    static synchronized qth m32851a(Context context) {
        qth qth;
        synchronized (qth.class) {
            if (f42097b == null) {
                f42097b = new qth(context);
            }
            qth = f42097b;
        }
        return qth;
    }

    /* renamed from: a */
    public final SQLiteDatabase mo24263a() {
        try {
            return adbc.m50103a(this.f42098c, "chromesync.data_store", true);
        } catch (SQLiteException e) {
            throw new qrp(1025, "Failed to open the database.", e);
        }
    }
}
