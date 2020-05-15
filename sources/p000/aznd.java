package p000;

import android.content.Context;
import android.database.Cursor;

/* renamed from: aznd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aznd {

    /* renamed from: a */
    protected final Context f99706a;

    /* renamed from: b */
    protected final aznz f99707b;

    public aznd(Context context, aznz aznz) {
        this.f99706a = context;
        this.f99707b = aznz;
    }

    /* renamed from: a */
    public static final boolean m85862a(Cursor cursor) {
        return !azdd.m85390c(cursor.getInt(12));
    }
}
