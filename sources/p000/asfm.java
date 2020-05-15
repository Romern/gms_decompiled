package p000;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Message;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

/* renamed from: asfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asfm extends snr {

    /* renamed from: a */
    final /* synthetic */ asfn f88842a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asfm(asfn asfn, sns sns) {
        super(sns);
        this.f88842a = asfn;
    }

    public final void handleMessage(Message message) {
        boolean z;
        boolean z2;
        Cursor query;
        int i = message.what;
        int i2 = asfq.f88851b;
        int i3 = -1;
        if (cguw.m147106b()) {
            try {
                query = asfo.m73974a(rpr.m34216b()).getReadableDatabase().query("eastworld_stats", new String[]{"mtv_day"}, null, null, null, null, null);
                if (query.moveToFirst()) {
                    int i4 = query.getInt(query.getColumnIndexOrThrow("mtv_day"));
                    if (query != null) {
                        query.close();
                    }
                    i3 = i4;
                } else if (query != null) {
                    query.close();
                }
            } catch (SQLiteException e) {
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            i3 = asfq.f88850a.getInt(":mtvDayOfYear", -1);
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        int i5 = instance.get(6);
        if (i5 == i3) {
            z = false;
        } else if (cguw.m147106b()) {
            asfo a = asfo.m73974a(rpr.m34216b());
            ContentValues contentValues = new ContentValues();
            contentValues.put("mtv_day", Integer.valueOf(i5));
            try {
                a.getWritableDatabase().update("eastworld_stats", contentValues, null, null);
                z = true;
            } catch (SQLiteException e2) {
                z = true;
            }
        } else {
            SharedPreferences.Editor edit = asfq.f88850a.edit();
            edit.putInt(":mtvDayOfYear", i5);
            edit.apply();
            z = true;
        }
        if (i == 1) {
            z2 = asfq.m73992a();
        } else {
            z2 = false;
        }
        asfn asfn = this.f88842a;
        int i6 = asfn.f88844e;
        bxvd a2 = asfq.m73986a(z, z2, i, asfn.f88848d);
        List list = this.f88842a.f88846a;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((asft) list.get(i7)).mo49140a(i, z, z2, a2);
        }
        asfq.m73989a((cala) a2.mo74062i());
        return;
        throw th;
    }
}
