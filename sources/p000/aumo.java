package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;

/* renamed from: aumo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aumo {
    /* renamed from: a */
    public static final auml m77315a(aumm aumm, Cursor cursor) {
        String c = imu.m15739c(cursor, "__id__");
        ContentValues contentValues = new ContentValues();
        aumy[] b = aumm.mo50669b();
        for (aumy aumy : b) {
            aumw aumw = aumy.f92122c;
            String str = aumy.f92120a;
            aumw.mo50689b(contentValues, str, aumw.mo50686a(cursor, str));
        }
        return aumm.mo50666a(c, contentValues);
    }

    /* renamed from: a */
    public static final void m77316a(aumm aumm, MatrixCursor.RowBuilder rowBuilder, auml auml) {
        rowBuilder.add("__id__", auml.f92085d);
        aumy[] b = aumm.mo50669b();
        for (aumy aumy : b) {
            aumw aumw = aumy.f92122c;
            String str = aumy.f92120a;
            aumw.mo50688a(rowBuilder, str, aumw.mo50684a(auml.f92086e, str, (Object) null));
        }
    }
}
