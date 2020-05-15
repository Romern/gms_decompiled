package p000;

import android.content.Context;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.Month;

/* renamed from: bhhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhhb extends bhhr {

    /* renamed from: Y */
    public bhgo f118639Y;

    /* renamed from: Z */
    public RecyclerView f118640Z;

    /* renamed from: a */
    public DateSelector f118641a;

    /* renamed from: aa */
    public RecyclerView f118642aa;

    /* renamed from: ab */
    public View f118643ab;

    /* renamed from: ac */
    public int f118644ac;

    /* renamed from: ae */
    private int f118645ae;

    /* renamed from: af */
    private View f118646af;

    /* renamed from: b */
    public CalendarConstraints f118647b;

    /* renamed from: c */
    public Month f118648c;

    /* renamed from: a */
    static int m100873a(Context context) {
        return context.getResources().getDimensionPixelSize(C0126R.dimen.mtrl_calendar_day_height);
    }

    /* renamed from: d */
    private final void m100874d(int i) {
        this.f118642aa.post(new bhgr(this, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo63752c(int i) {
        this.f118644ac = i;
        if (i == 2) {
            this.f118640Z.getLayoutManager().mo71e(((bhhy) this.f118640Z.getAdapter()).mo63776f(this.f118648c.f151175d));
            this.f118646af.setVisibility(0);
            this.f118643ab.setVisibility(8);
            return;
        }
        this.f118646af.setVisibility(8);
        this.f118643ab.setVisibility(0);
        mo63751a(this.f118648c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final aah mo63753j() {
        return (aah) this.f118642aa.getLayoutManager();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f118645ae = bundle.getInt("THEME_RES_ID_KEY");
        this.f118641a = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f118647b = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f118648c = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        abx abx;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f118645ae);
        this.f118639Y = new bhgo(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.f118647b.f151164a;
        boolean a = bhhh.m100880a(contextThemeWrapper);
        View inflate = cloneInContext.inflate(!a ? C0126R.C0128layout.mtrl_calendar_horizontal : C0126R.C0128layout.mtrl_calendar_vertical, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(C0126R.C0129id.mtrl_calendar_days_of_week);
        C1280ps.m19894a(gridView, new bhgs());
        gridView.setAdapter((ListAdapter) new bhgq());
        gridView.setNumColumns(month.f151176e);
        gridView.setEnabled(false);
        this.f118642aa = (RecyclerView) inflate.findViewById(C0126R.C0129id.mtrl_calendar_months);
        this.f118642aa.setLayoutManager(new bhgt(this, a ? 1 : 0, a));
        this.f118642aa.setTag("MONTHS_VIEW_GROUP_TAG");
        bhhp bhhp = new bhhp(contextThemeWrapper, this.f118641a, this.f118647b, new bhgu(this));
        this.f118642aa.setAdapter(bhhp);
        int integer = contextThemeWrapper.getResources().getInteger(C0126R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(C0126R.C0129id.mtrl_calendar_year_selector_frame);
        this.f118640Z = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f118640Z.setLayoutManager(new aab(integer));
            this.f118640Z.setAdapter(new bhhy(this));
            this.f118640Z.addItemDecoration(new bhgv(this));
        }
        if (inflate.findViewById(C0126R.C0129id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(C0126R.C0129id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            C1280ps.m19894a(materialButton, new bhgw(this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C0126R.C0129id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(C0126R.C0129id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.f118646af = inflate.findViewById(C0126R.C0129id.mtrl_calendar_year_selector_frame);
            this.f118643ab = inflate.findViewById(C0126R.C0129id.mtrl_calendar_day_selector_frame);
            mo63752c(1);
            materialButton.setText(this.f118648c.f151173b);
            this.f118642aa.addOnScrollListener(new bhgx(this, bhhp, materialButton));
            materialButton.setOnClickListener(new bhgy(this));
            materialButton3.setOnClickListener(new bhgz(this, bhhp));
            materialButton2.setOnClickListener(new bhha(this, bhhp));
        }
        if (!bhhh.m100880a(contextThemeWrapper) && (recyclerView2 = (abx = new abx(null)).f133a) != (recyclerView = this.f118642aa)) {
            if (recyclerView2 != null) {
                recyclerView2.removeOnScrollListener(abx.f135c);
                abx.f133a.setOnFlingListener(null);
            }
            abx.f133a = recyclerView;
            RecyclerView recyclerView4 = abx.f133a;
            if (recyclerView4 != null) {
                if (recyclerView4.getOnFlingListener() == null) {
                    abx.f133a.addOnScrollListener(abx.f135c);
                    abx.f133a.setOnFlingListener(abx);
                    abx.f134b = new Scroller(abx.f133a.getContext(), new DecelerateInterpolator());
                    abx.mo263a();
                } else {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
            }
        }
        this.f118642aa.scrollToPosition(bhhp.mo63773a(this.f118648c));
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f118645ae);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f118641a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f118647b);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f118648c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo63751a(Month month) {
        bhhp bhhp = (bhhp) this.f118642aa.getAdapter();
        int a = bhhp.mo63773a(month);
        int a2 = a - bhhp.mo63773a(this.f118648c);
        int abs = Math.abs(a2);
        this.f118648c = month;
        if (abs <= 3) {
            m100874d(a);
        } else if (a2 > 0) {
            this.f118642aa.scrollToPosition(a - 3);
            m100874d(a);
        } else {
            this.f118642aa.scrollToPosition(a + 3);
            m100874d(a);
        }
    }
}
