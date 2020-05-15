package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.places.p095ui.placepicker.views.expandingscrollview.ExpandingScrollView;

/* renamed from: bime */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bime extends FrameLayout implements bimu, bilu {

    /* renamed from: a */
    public final bimy f120885a;

    /* renamed from: b */
    public final bilz f120886b = new bilz(this.f120885a, bihb.m102385a(getContext()));

    /* renamed from: c */
    final ExpandingScrollView f120887c;

    /* renamed from: d */
    public final View f120888d;

    /* renamed from: e */
    public final ViewGroup f120889e;

    /* renamed from: f */
    private final Animation f120890f;

    /* renamed from: g */
    private final Animation f120891g;

    /* renamed from: h */
    private final Animation f120892h;

    /* renamed from: i */
    private final Animation f120893i;

    /* renamed from: j */
    private final Animation f120894j;

    /* renamed from: k */
    private final Animation f120895k;

    /* renamed from: l */
    private final RecyclerView f120896l;

    /* renamed from: m */
    private final View f120897m;

    /* renamed from: n */
    private int f120898n;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView.a(binq, boolean):void
     arg types: [binq, int]
     candidates:
      com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView.a(com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView, android.view.MotionEvent):void
      bino.a(int, int):void
      com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView.a(binq, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public bime(Context context, bimy bimy, boolean z) {
        super(context);
        this.f120885a = bimy;
        this.f120890f = AnimationUtils.loadAnimation(context, C0126R.anim.place_picker_show_action_bar_icons);
        this.f120891g = AnimationUtils.loadAnimation(context, C0126R.anim.place_picker_hide_action_bar_icons);
        this.f120892h = AnimationUtils.loadAnimation(context, C0126R.anim.place_picker_show_action_bar);
        this.f120893i = AnimationUtils.loadAnimation(context, C0126R.anim.place_picker_hide_action_bar);
        this.f120894j = AnimationUtils.loadAnimation(context, C0126R.anim.place_picker_show_action_bar_title);
        this.f120895k = AnimationUtils.loadAnimation(context, C0126R.anim.place_picker_hide_action_bar_title);
        LayoutInflater from = LayoutInflater.from(context);
        from.inflate((int) C0126R.C0128layout.place_picker_list, this);
        this.f120888d = findViewById(C0126R.C0129id.toolbar_background);
        this.f120889e = (ViewGroup) findViewById(C0126R.C0129id.toolbar_foreground);
        this.f120897m = findViewById(C0126R.C0129id.toolbar_shadow);
        this.f120889e.findViewById(C0126R.C0129id.back_button).setOnClickListener(new bima(this));
        this.f120889e.findViewById(C0126R.C0129id.search_button).setOnClickListener(new bimb(this));
        ExpandingScrollView expandingScrollView = (ExpandingScrollView) findViewById(C0126R.C0129id.expanding_scroll_view);
        this.f120887c = expandingScrollView;
        expandingScrollView.mo71326a(binq.f121027b, false);
        ExpandingScrollView expandingScrollView2 = this.f120887c;
        bimy bimy2 = this.f120885a;
        expandingScrollView2.f151444e.add(bimy2);
        if (expandingScrollView2.f151443d != null) {
            bimy2.mo64780c();
        }
        expandingScrollView2.mo71327a(bngx.m109356a(bimy2));
        if (!z) {
            this.f120887c.setVisibility(8);
        }
        Resources resources = getResources();
        ((FrameLayout.LayoutParams) this.f120887c.getLayoutParams()).topMargin = resources.getDimensionPixelSize(C0126R.dimen.place_picker_action_bar_size) - resources.getDimensionPixelSize(C0126R.dimen.place_picker_list_title_height);
        RecyclerView recyclerView = (RecyclerView) from.inflate((int) C0126R.C0128layout.place_picker_list_contents, (ViewGroup) this.f120887c, false);
        this.f120896l = recyclerView;
        recyclerView.setAdapter(this.f120886b);
        this.f120896l.setLayoutManager(new aah());
        RecyclerView recyclerView2 = this.f120896l;
        recyclerView2.setAccessibilityDelegateCompat(new bimd(this, recyclerView2));
        ExpandingScrollView expandingScrollView3 = this.f120887c;
        RecyclerView recyclerView3 = this.f120896l;
        expandingScrollView3.removeAllViews();
        expandingScrollView3.f151441b.f121004e.mo64798b();
        expandingScrollView3.f151446g = recyclerView3;
        if (recyclerView3 != null) {
            expandingScrollView3.addView(recyclerView3);
        }
        biix.m102464a(this.f120887c, new bimc(this));
        this.f120898n = 0;
        this.f120885a.mo64774a(this);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView.a(binq, boolean):void
     arg types: [binq, int]
     candidates:
      com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView.a(com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView, android.view.MotionEvent):void
      bino.a(int, int):void
      com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView.a(binq, boolean):void */
    /* renamed from: a */
    public final void mo64755a() {
        this.f120887c.mo71326a(binq.f121027b, true);
        this.f120896l.scrollToPosition(0);
    }

    /* renamed from: b */
    public final void mo64758b(boolean z) {
        if (!z) {
            binh.m102604a(this.f120893i, this.f120888d, 4);
        } else {
            binh.m102604a(this.f120892h, this.f120888d, 0);
        }
        View findViewById = this.f120889e.findViewById(C0126R.C0129id.toolbar_title);
        if (z) {
            binh.m102604a(this.f120894j, findViewById, 0);
        } else {
            binh.m102604a(this.f120895k, findViewById, 4);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean fitSystemWindows(Rect rect) {
        int i = rect.top - this.f120898n;
        this.f120898n = rect.top;
        ((FrameLayout.LayoutParams) this.f120889e.getLayoutParams()).topMargin += i;
        ((FrameLayout.LayoutParams) this.f120887c.getLayoutParams()).topMargin += i;
        this.f120888d.getLayoutParams().height += i;
        return false;
    }

    /* renamed from: a */
    public final void mo64756a(float f) {
        int i = Build.VERSION.SDK_INT;
        this.f120897m.setVisibility(0);
        this.f120897m.setAlpha(f);
    }

    /* renamed from: a */
    public final void mo64748a(Rect rect) {
        fitSystemWindows(rect);
    }

    /* renamed from: a */
    public final void mo64757a(boolean z) {
        if (!z) {
            binh.m102604a(this.f120891g, this.f120889e, 4);
        } else {
            binh.m102604a(this.f120890f, this.f120889e, 0);
        }
    }
}
