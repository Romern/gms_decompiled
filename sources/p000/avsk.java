package p000;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.Activity;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.items.Item;
import com.google.android.setupdesign.items.ItemGroup;

/* renamed from: avsk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avsk extends avsf implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    private GlifLayout f93838b;

    /* renamed from: c */
    private ListView f93839c;

    /* renamed from: d */
    private Item f93840d;

    /* renamed from: e */
    private Item f93841e;

    /* renamed from: a */
    private static final void m79192a(Item item, int i) {
        item.f151489c = i;
        m79195b(item, false);
    }

    /* renamed from: b */
    private final void m79194b(int i) {
        if (i == 4) {
            this.f93839c.jumpDrawablesToCurrentState();
        }
        this.f93839c.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo51556a(CharSequence charSequence) {
    }

    /* renamed from: b */
    public final void mo51558b(CharSequence charSequence) {
    }

    /* renamed from: b */
    public final void mo51559b(boolean z) {
    }

    /* renamed from: c */
    public final void mo51560c() {
        GlifLayout glifLayout = this.f93838b;
        Drawable g = glifLayout.mo71368g();
        g.setColorFilter(new PorterDuffColorFilter(getResources().getColor(C0126R.color.system_update_notification_color), PorterDuff.Mode.MULTIPLY));
        glifLayout.mo71362a(g);
        super.mo51560c();
    }

    /* renamed from: c */
    public final void mo51561c(CharSequence charSequence) {
    }

    /* renamed from: c */
    public final void mo51562c(boolean z) {
    }

    /* renamed from: d */
    public final int mo51563d() {
        return 1;
    }

    /* renamed from: d */
    public final void mo51564d(boolean z) {
    }

    /* renamed from: e */
    public final View mo51565e() {
        return this.f93838b;
    }

    /* renamed from: e */
    public final void mo51566e(boolean z) {
    }

    /* renamed from: f */
    public final TextView mo51567f() {
        return (TextView) this.f93838b.findViewById(C0126R.C0129id.description);
    }

    /* renamed from: g */
    public final TextView mo51568g() {
        return (TextView) this.f93838b.findViewById(C0126R.C0129id.size);
    }

    /* renamed from: h */
    public final TextView mo51569h() {
        return this.f93838b.mo71366e();
    }

    /* renamed from: i */
    public final TextView mo51570i() {
        return this.f93838b.mo71366e();
    }

    /* renamed from: j */
    public final TextView mo51571j() {
        return (TextView) this.f93838b.findViewById(C0126R.C0129id.button_qualifier);
    }

    /* renamed from: k */
    public final TextView mo51572k() {
        return (TextView) this.f93838b.findViewById(C0126R.C0129id.progress_bar_status);
    }

    /* renamed from: l */
    public final ProgressBar mo51573l() {
        this.f93838b.mo71364b(true);
        return this.f93838b.mo71370i();
    }

    /* renamed from: m */
    public final void mo51574m() {
        this.f93838b.findViewById(C0126R.C0129id.progress_bar_status).setVisibility(8);
        this.f93838b.mo71364b(false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avsk.a(com.google.android.setupdesign.items.Item, boolean):void
     arg types: [com.google.android.setupdesign.items.Item, int]
     candidates:
      avsk.a(com.google.android.setupdesign.items.Item, int):void
      avsk.a(com.google.android.setupdesign.items.Item, boolean):void */
    /* renamed from: n */
    public final void mo51575n() {
        m79193a(this.f93841e, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.system_update_activity_glif, viewGroup, false);
        GlifLayout glifLayout = (GlifLayout) inflate.findViewById(C0126R.C0129id.setup_wizard_layout);
        this.f93838b = glifLayout;
        glifLayout.mo71368g().setColorFilter(new PorterDuffColorFilter(getResources().getColor(C0126R.color.system_update_notification_color), PorterDuff.Mode.MULTIPLY));
        this.f93839c = (ListView) this.f93838b.findViewById(C0126R.C0129id.action_list);
        LinearLayout linearLayout = new LinearLayout(getActivity());
        linearLayout.setVisibility(8);
        this.f93839c.addHeaderView(linearLayout);
        float dimension = getResources().getDimension(C0126R.dimen.sud_glif_margin_sides);
        float dimension2 = getResources().getDimension(C0126R.dimen.sud_items_icon_container_width);
        Drawable divider = this.f93839c.getDivider();
        Activity activity = getActivity();
        int i = ((int) dimension) + ((int) dimension2);
        int i2 = Build.VERSION.SDK_INT;
        if (activity.getResources().getConfiguration().getLayoutDirection() != 1) {
            z = false;
        } else {
            z = true;
        }
        this.f93839c.setDivider(bjau.m103128a(divider, i, 0, z));
        this.f93839c.setHeaderDividersEnabled(false);
        ItemGroup itemGroup = (ItemGroup) new bizw(getActivity()).mo64929a((int) C0126R.xml.items_actions);
        this.f93839c.setAdapter((ListAdapter) new bizn(itemGroup));
        this.f93840d = (Item) itemGroup.mo64919a(0);
        this.f93841e = (Item) itemGroup.mo64919a(1);
        m79192a(this.f93840d, 1);
        m79192a(this.f93841e, 2);
        this.f93839c.setOnItemClickListener(this);
        m79194b(4);
        mo51573l().setIndeterminate(true);
        return inflate;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (i != 0) {
            int i2 = ((Item) this.f93839c.getAdapter().getItem(i)).f151489c;
            if (i2 == 1) {
                this.f93834a.mo51576a();
            } else if (i2 == 2) {
                this.f93834a.mo51577b();
            }
        }
    }

    /* renamed from: a */
    private final void m79193a(Item item, boolean z) {
        m79195b(item, z);
        if (this.f93840d.f151504f || this.f93841e.f151504f) {
            m79194b(0);
            this.f93839c.setHeaderDividersEnabled(true);
            ListView listView = this.f93839c;
            ListAdapter adapter = listView.getAdapter();
            int measuredWidth = listView.getMeasuredWidth();
            int i = 0;
            for (int i2 = 0; i2 < adapter.getCount(); i2++) {
                View view = adapter.getView(i2, null, this.f93839c);
                view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(0, 0));
                i += view.getMeasuredHeight();
            }
            ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
            layoutParams.height = i + (listView.getDividerHeight() * adapter.getCount());
            listView.setLayoutParams(layoutParams);
            return;
        }
        m79194b(4);
        this.f93839c.setHeaderDividersEnabled(false);
    }

    /* renamed from: b */
    private static final void m79195b(Item item, boolean z) {
        item.mo71396b(z);
        item.mo71399d(z);
        item.mo71388i();
    }

    /* renamed from: a */
    public final void mo51555a(int i) {
        this.f93840d.mo71395b(getString(i));
        Item item = this.f93840d;
        Activity activity = getActivity();
        bmxy.m108581a(activity);
        int i2 = C0126R.C0127drawable.ic_file_download;
        if (!(i == C0126R.string.common_download || i == C0126R.string.system_update_download_and_install_button_text)) {
            i2 = i != C0126R.string.system_update_restart_now ? i != C0126R.string.system_update_free_up_space_button_text ? i != C0126R.string.common_pause ? C0126R.C0127drawable.ic_forward : C0126R.C0127drawable.ic_pause : C0126R.C0127drawable.ic_storage : C0126R.C0127drawable.ic_restart;
        }
        item.mo71394a(activity.getDrawable(i2));
    }

    /* renamed from: a */
    public final void mo51557a(boolean z) {
        m79193a(this.f93840d, z);
    }
}
