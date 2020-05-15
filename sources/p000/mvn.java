package p000;

import android.content.Context;
import android.text.format.DateUtils;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: mvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mvn extends mvp {

    /* renamed from: g */
    private final Date f34811g;

    public mvn(Date date) {
        sdo.m34959a(date);
        this.f34811g = date;
    }

    /* renamed from: a */
    public final String mo20275a(Context context) {
        return DateUtils.getRelativeDateTimeString(context, this.f34811g.getTime(), 60000, TimeUnit.DAYS.toMillis(30), 0).toString();
    }
}
