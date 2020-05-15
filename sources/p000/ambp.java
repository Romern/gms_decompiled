package p000;

import android.database.Cursor;
import android.database.CursorWrapper;

/* renamed from: ambp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ambp extends CursorWrapper {

    /* renamed from: a */
    private final int f74668a = 100;

    public ambp(Cursor cursor) {
        super(cursor);
    }

    public final int getCount() {
        return Math.min(super.getCount(), this.f74668a);
    }
}
