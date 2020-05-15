package p000;

import android.content.Context;
import android.database.Cursor;
import com.google.android.gms.common.api.Status;

/* renamed from: aovs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aovs extends aove {

    /* renamed from: b */
    private final String f83695b;

    public aovs(aost aost, String str) {
        super(aost, "HasUpcomingReminders");
        this.f83695b = str;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        boolean z = false;
        new Object[1][0] = this;
        Cursor query = context.getContentResolver().query(aotd.f83574a, null, "account_id=? AND deleted=? AND archived=?", new String[]{String.valueOf(aosf.m69445a(context, this.f83695b).f83507a), "0", "0"}, null);
        Status status = new Status(0);
        if (query != null) {
            try {
                z = query.moveToFirst();
            } finally {
                query.close();
            }
        }
        this.f83667a.mo46832a(z, status);
    }
}
