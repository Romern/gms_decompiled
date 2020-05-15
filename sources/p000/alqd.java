package p000;

import android.content.ContentValues;

/* renamed from: alqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alqd implements alpz {
    /* renamed from: a */
    public static long m61509a(ContentValues contentValues) {
        Long asLong = contentValues.getAsLong("contact_id");
        if (asLong != null) {
            return asLong.longValue();
        }
        return 0;
    }
}
