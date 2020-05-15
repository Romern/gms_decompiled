package p000;

import android.content.ContentValues;

/* renamed from: apae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apae implements apaa {

    /* renamed from: b */
    public static final /* synthetic */ int f83989b = 0;

    /* renamed from: a */
    public static long m69937a(ContentValues contentValues) {
        Long asLong = contentValues.getAsLong("contact_id");
        if (asLong != null) {
            return asLong.longValue();
        }
        return 0;
    }
}
