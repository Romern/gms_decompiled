package p000;

import android.database.Cursor;

/* renamed from: umr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class umr implements uhx {

    /* renamed from: a */
    public static final umr f48250a = new umr();

    private umr() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo27496a(uno uno, Cursor cursor) {
        ukk ukk;
        int i = ums.f48251f;
        Long b = umu.ENTRY_ID.f48266i.mo27705b(cursor);
        int intValue = umu.EVENT_TYPE.f48266i.mo27705b(cursor).intValue();
        if (b != null) {
            ukk = ukk.m38862a(b.longValue());
        } else {
            ukk = null;
        }
        long longValue = umu.LAST_UPDATE_TIME.f48266i.mo27705b(cursor).longValue();
        return new ums(uno, umv.f48267a.f48341a.mo27705b(cursor).longValue(), ukk, umu.SERIALIZED_SUBSCRIPTION_DETAILS.f48266i.mo27702a(cursor), umu.ANDROID_APP_ID.f48266i.mo27705b(cursor).longValue(), intValue, longValue);
    }
}
