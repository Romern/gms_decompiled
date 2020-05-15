package p000;

import android.database.sqlite.SQLiteDatabase;
import android.util.TimingLogger;
import java.util.LinkedHashMap;

/* renamed from: axxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class axxl extends bqdt {
    /* renamed from: a */
    public static final void m83478a(LinkedHashMap linkedHashMap, axxi axxi) {
        axxh axxh = new axxh(axxi);
        if (linkedHashMap.containsKey(axxh)) {
            linkedHashMap.remove(axxh);
        }
        linkedHashMap.put(axxh, axxi);
    }

    /* renamed from: a */
    public abstract void mo53717a(TimingLogger timingLogger, SQLiteDatabase sQLiteDatabase, LinkedHashMap linkedHashMap);

    /* renamed from: a */
    public abstract boolean mo53718a(TimingLogger timingLogger, SQLiteDatabase sQLiteDatabase);
}
