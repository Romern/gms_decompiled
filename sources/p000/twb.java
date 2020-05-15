package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: twb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class twb extends srp {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE " + "device_features (_id INTEGER PRIMARY KEY AUTOINCREMENT,last_connection_timestamp INTEGER NOT NULL,feature_name TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX " + "device_feature_index ON device_features (feature_name)");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sdo.m34971a(false, (Object) "Currently running V1, no upgrades should take place.");
    }

    public twb(Context context) {
        super(context, "device_connections.db", "device_connections.db", 1);
    }
}
