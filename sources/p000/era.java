package p000;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: era */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class era extends C0961ek {
    public era() {
        super(5, 6);
    }

    /* renamed from: a */
    public final void mo10221a(C0933dj djVar) {
        djVar.mo9115b("CREATE TABLE IF NOT EXISTS `per_device_dismissed_onboarding_flow` (`dismissalId` INTEGER NOT NULL, PRIMARY KEY(`dismissalId`))");
        Cursor a = djVar.mo9112a("SELECT * FROM `dismissed_onboarding_flow`");
        while (a.moveToNext()) {
            Long valueOf = Long.valueOf(a.getLong(a.getColumnIndex("dismissalId")));
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissalId", valueOf);
            djVar.f13300a.insertWithOnConflict("per_device_dismissed_onboarding_flow", null, contentValues, 4);
        }
        a.close();
    }
}
