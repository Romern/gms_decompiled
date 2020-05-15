package p000;

import android.database.Cursor;
import android.os.Bundle;

/* renamed from: fta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fta {
    /* renamed from: a */
    public static final Cursor m12292a(Cursor cursor, String str) {
        Bundle bundle = new Bundle(cursor.getExtras());
        bundle.putString("com.google.android.gms.appdatasearch.CONTENT_INCARNATION_KEY", str);
        return new fsx(cursor, bundle);
    }

    /* renamed from: a */
    public static final String m12293a(Cursor cursor) {
        return cursor.getExtras().getString("com.google.android.gms.appdatasearch.CONTENT_INCARNATION_KEY");
    }
}
