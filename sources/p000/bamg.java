package p000;

import android.database.sqlite.SQLiteDatabase;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: bamg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bamg implements banu {

    /* renamed from: a */
    private final cayo f101259a;

    public bamg(cayo cayo) {
        this.f101259a = cayo;
    }

    /* renamed from: a */
    public final void mo55754a() {
        for (Integer num : new TreeSet(((Map) this.f101259a.mo16713a()).keySet())) {
            ((banu) ((Map) this.f101259a.mo16713a()).get(num)).mo55754a();
        }
    }

    /* renamed from: a */
    public final void mo55755a(SQLiteDatabase sQLiteDatabase) {
        for (Integer num : new TreeSet(((Map) this.f101259a.mo16713a()).keySet())) {
            ((banu) ((Map) this.f101259a.mo16713a()).get(num)).mo55755a(sQLiteDatabase);
        }
    }
}
