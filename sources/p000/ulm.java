package p000;

import android.database.Cursor;

/* renamed from: ulm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ulm implements uhx {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo27496a(uno uno, Cursor cursor) {
        ukk ukk;
        Cursor cursor2 = cursor;
        int i = uln.f48131h;
        long c = ulp.ACCOUNT_ID.f48147h.mo27710c(cursor2);
        String a = ulp.PAYLOAD.f48147h.mo27702a(cursor2);
        int c2 = (int) ulp.ATTEMPT_COUNT.f48147h.mo27710c(cursor2);
        Long b = ulp.REQUIRED_ENTRY_ID.f48147h.mo27705b(cursor2);
        if (b != null) {
            ukk = ukk.m38862a(b.longValue());
        } else {
            ukk = null;
        }
        return new uln(uno, ulq.f48148a.f48341a.mo27705b(cursor2).longValue(), c, a, ukk, c2, ulp.APPLY_LOCALLY_TIMESTAMP.f48147h.mo27710c(cursor2), ulp.IS_PAUSED.f48147h.mo27718e(cursor2), ulp.TRANSFER_PREFERENCES_OVERRIDE.f48147h.mo27702a(cursor2));
    }
}
