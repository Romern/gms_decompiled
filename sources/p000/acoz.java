package p000;

import android.content.ContentUris;
import android.provider.CalendarContract;
import java.util.Date;

/* renamed from: acoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acoz {

    /* renamed from: a */
    public long f60384a;

    /* renamed from: b */
    public String f60385b;

    /* renamed from: c */
    public String f60386c;

    /* renamed from: d */
    public String f60387d;

    /* renamed from: e */
    public Boolean f60388e;

    /* renamed from: f */
    public acph[] f60389f;

    /* renamed from: g */
    public acow[] f60390g;

    /* renamed from: a */
    public static String m49644a(long j) {
        return ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, j).toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bric mo32973a() {
        bric bric = new bric("Event");
        bric.mo69557b(m49644a(this.f60384a));
        bric.mo69558c(this.f60385b);
        String str = this.f60386c;
        if (str != null) {
            sdo.m34959a((Object) str);
            bric.mo69553a("description", str);
        }
        String str2 = this.f60387d;
        if (str2 != null) {
            sdo.m34959a((Object) str2);
            bric.mo69553a("location", str2);
        }
        Boolean bool = this.f60388e;
        if (bool != null) {
            bric.mo69554a("allDay", bool.booleanValue());
        }
        int length = this.f60389f.length;
        if (length > 0) {
            Date[] dateArr = new Date[length];
            Date[] dateArr2 = new Date[length];
            int i = 0;
            while (true) {
                acph[] acphArr = this.f60389f;
                if (i >= acphArr.length) {
                    break;
                }
                dateArr[i] = new Date(acphArr[i].f60413a);
                dateArr2[i] = new Date(this.f60389f[i].f60414b);
                i++;
            }
            bric.mo69551a("startDate", bric.m114030a(dateArr));
            bric.mo69551a("endDate", bric.m114030a(dateArr2));
        }
        int length2 = this.f60390g.length;
        if (length2 > 0) {
            bric[] bricArr = new bric[length2];
            int i2 = 0;
            while (true) {
                acow[] acowArr = this.f60390g;
                if (i2 >= acowArr.length) {
                    break;
                }
                acow acow = acowArr[i2];
                bric bric2 = new bric("Attendee");
                bric2.mo69558c(acow.f60377a);
                String str3 = acow.f60378b;
                if (str3 != null) {
                    bric2.mo69553a("email", str3);
                }
                String str4 = acow.f60379c;
                if (str4 != null) {
                    bric2.mo69553a("attendeeStatus", str4);
                }
                bricArr[i2] = bric2;
                i2++;
            }
            sdo.m34959a(bricArr);
            bric.mo69552a("attendee", bricArr);
        }
        brhx brhx = new brhx();
        brhx.mo69542b();
        bric.mo69548a(brhx);
        return bric;
    }
}
