package p000;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.Month;

/* renamed from: bhgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhgm {

    /* renamed from: a */
    static final long f118599a = bhhv.m100901a(Month.m117563a(1900, 0).f151178g);

    /* renamed from: b */
    static final long f118600b = bhhv.m100901a(Month.m117563a(2100, 11).f151178g);

    /* renamed from: c */
    public long f118601c = f118599a;

    /* renamed from: d */
    public long f118602d = f118600b;

    /* renamed from: e */
    public Long f118603e;

    /* renamed from: f */
    public CalendarConstraints.DateValidator f118604f = DateValidatorPointForward.m117558a();

    public bhgm() {
    }

    public bhgm(CalendarConstraints calendarConstraints) {
        this.f118601c = calendarConstraints.f151164a.f151178g;
        this.f118602d = calendarConstraints.f151165b.f151178g;
        this.f118603e = Long.valueOf(calendarConstraints.f151166c.f151178g);
        this.f118604f = calendarConstraints.f151167d;
    }
}
