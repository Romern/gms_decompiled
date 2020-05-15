package p000;

import android.view.View;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.Month;

/* renamed from: bhhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhhw implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ int f118689a;

    /* renamed from: b */
    final /* synthetic */ bhhy f118690b;

    public bhhw(bhhy bhhy, int i) {
        this.f118690b = bhhy;
        this.f118689a = i;
    }

    public void onClick(View view) {
        Month a = Month.m117563a(this.f118689a, this.f118690b.f118692a.f118648c.f151174c);
        CalendarConstraints calendarConstraints = this.f118690b.f118692a.f118647b;
        if (a.compareTo(calendarConstraints.f151164a) < 0) {
            a = calendarConstraints.f151164a;
        } else if (a.compareTo(calendarConstraints.f151165b) > 0) {
            a = calendarConstraints.f151165b;
        }
        this.f118690b.f118692a.mo63751a(a);
        this.f118690b.f118692a.mo63752c(1);
    }
}
