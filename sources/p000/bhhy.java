package p000;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: bhhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhhy extends abh {

    /* renamed from: a */
    public final bhhb f118692a;

    public bhhy(bhhb bhhb) {
        this.f118692a = bhhb;
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f118692a.f118647b.f151168e;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        return new bhhx((TextView) LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.mtrl_calendar_year, viewGroup, false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo63776f(int i) {
        return i - this.f118692a.f118647b.f151164a.f151175d;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        bhhx bhhx = (bhhx) acm;
        int i2 = this.f118692a.f118647b.f151164a.f151175d + i;
        String string = bhhx.f118691s.getContext().getString(C0126R.string.mtrl_picker_navigate_to_year_description);
        TextView textView = bhhx.f118691s;
        Locale locale = Locale.getDefault();
        Integer valueOf = Integer.valueOf(i2);
        textView.setText(String.format(locale, "%d", valueOf));
        bhhx.f118691s.setContentDescription(String.format(string, valueOf));
        bhgo bhgo = this.f118692a.f118639Y;
        Calendar b = bhhv.m100905b();
        bhgn bhgn = b.get(1) != i2 ? bhgo.f118614d : bhgo.f118616f;
        for (Long l : this.f118692a.f118641a.mo71133c()) {
            b.setTimeInMillis(l.longValue());
            if (b.get(1) == i2) {
                bhgn = bhgo.f118615e;
            }
        }
        bhgn.mo63739a(bhhx.f118691s);
        bhhx.f118691s.setOnClickListener(new bhhw(this, i2));
    }
}
