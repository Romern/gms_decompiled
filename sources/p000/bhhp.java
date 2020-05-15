package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;

/* renamed from: bhhp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhhp extends abh {

    /* renamed from: a */
    public final bhgu f118682a;

    /* renamed from: d */
    private final CalendarConstraints f118683d;

    /* renamed from: e */
    private final DateSelector f118684e;

    /* renamed from: f */
    private final int f118685f;

    public bhhp(Context context, DateSelector dateSelector, CalendarConstraints calendarConstraints, bhgu bhgu) {
        int i;
        Month month = calendarConstraints.f151164a;
        Month month2 = calendarConstraints.f151165b;
        Month month3 = calendarConstraints.f151166c;
        if (month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (month3.compareTo(month2) <= 0) {
            int a = bhhm.f118673a * bhhb.m100873a(context);
            if (bhhh.m100880a(context)) {
                i = bhhb.m100873a(context);
            } else {
                i = 0;
            }
            this.f118685f = a + i;
            this.f118683d = calendarConstraints;
            this.f118684e = dateSelector;
            this.f118682a = bhgu;
            mo170a(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* renamed from: L */
    public final long mo157L(int i) {
        return this.f118683d.f151164a.mo71156b(i).f151172a.getTimeInMillis();
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f118683d.f151169f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Month mo63774f(int i) {
        return this.f118683d.f151164a.mo71156b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo63773a(Month month) {
        return this.f118683d.f151164a.mo71155b(month);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!bhhh.m100880a(viewGroup.getContext())) {
            return new bhho(linearLayout, false);
        }
        linearLayout.setLayoutParams(new abv(-1, this.f118685f));
        return new bhho(linearLayout, true);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        bhho bhho = (bhho) acm;
        Month b = this.f118683d.f151164a.mo71156b(i);
        bhho.f118680s.setText(b.f151173b);
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bhho.f118681t.findViewById(C0126R.C0129id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !b.equals(materialCalendarGridView.getAdapter().f118674b)) {
            bhhm bhhm = new bhhm(b, this.f118684e, this.f118683d);
            materialCalendarGridView.setNumColumns(b.f151176e);
            materialCalendarGridView.setAdapter((ListAdapter) bhhm);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new bhhn(this, materialCalendarGridView));
    }
}
