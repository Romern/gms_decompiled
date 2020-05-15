package p000;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.Month;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: bhhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhhm extends BaseAdapter {

    /* renamed from: a */
    static final int f118673a = bhhv.m100907c().getMaximum(4);

    /* renamed from: b */
    public final Month f118674b;

    /* renamed from: c */
    public final DateSelector f118675c;

    /* renamed from: d */
    public bhgo f118676d;

    /* renamed from: e */
    final CalendarConstraints f118677e;

    public bhhm(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints) {
        this.f118674b = month;
        this.f118675c = dateSelector;
        this.f118677e = calendarConstraints;
    }

    /* renamed from: a */
    public final int mo63763a() {
        return this.f118674b.mo71154b();
    }

    /* renamed from: b */
    public final int mo63765b() {
        return (this.f118674b.mo71154b() + this.f118674b.f151177f) - 1;
    }

    public final int getCount() {
        return this.f118674b.f151177f + mo63763a();
    }

    public final long getItemId(int i) {
        return (long) (i / this.f118674b.f151176e);
    }

    public final boolean hasStableIds() {
        return true;
    }

    /* renamed from: a */
    public final Long getItem(int i) {
        if (i < this.f118674b.mo71154b() || i > mo63765b()) {
            return null;
        }
        Month month = this.f118674b;
        return Long.valueOf(month.mo71153a((i - month.mo71154b()) + 1));
    }

    /* renamed from: b */
    public final int mo63766b(int i) {
        return mo63763a() + (i - 1);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x009d  */
    public final /* bridge */ /* synthetic */ View getView(int i, View view, ViewGroup viewGroup) {
        Long a;
        Context context = viewGroup.getContext();
        if (this.f118676d == null) {
            this.f118676d = new bhgo(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.mtrl_calendar_day, viewGroup, false);
        }
        int a2 = i - mo63763a();
        if (a2 >= 0) {
            Month month = this.f118674b;
            if (a2 < month.f151177f) {
                int i2 = a2 + 1;
                textView.setTag(month);
                textView.setText(String.valueOf(i2));
                long a3 = this.f118674b.mo71153a(i2);
                if (this.f118674b.f151175d != Month.m117562a().f151175d) {
                    Locale locale = Locale.getDefault();
                    int i3 = Build.VERSION.SDK_INT;
                    textView.setContentDescription(bhhv.m100902a("yMMMEd", locale).format(new Date(a3)));
                } else {
                    Locale locale2 = Locale.getDefault();
                    int i4 = Build.VERSION.SDK_INT;
                    textView.setContentDescription(bhhv.m100902a("MMMEd", locale2).format(new Date(a3)));
                }
                textView.setVisibility(0);
                textView.setEnabled(true);
                a = getItem(i);
                if (a != null) {
                    if (this.f118677e.f151167d.mo71130a(a.longValue())) {
                        textView.setEnabled(true);
                        Iterator it = this.f118675c.mo71133c().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (bhhv.m100901a(a.longValue()) == bhhv.m100901a(((Long) it.next()).longValue())) {
                                    this.f118676d.f118612b.mo63739a(textView);
                                    break;
                                }
                            } else if (bhhv.m100905b().getTimeInMillis() == a.longValue()) {
                                this.f118676d.f118613c.mo63739a(textView);
                            } else {
                                this.f118676d.f118611a.mo63739a(textView);
                            }
                        }
                    } else {
                        textView.setEnabled(false);
                        this.f118676d.f118617g.mo63739a(textView);
                    }
                }
                return textView;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        a = getItem(i);
        if (a != null) {
        }
        return textView;
    }
}
