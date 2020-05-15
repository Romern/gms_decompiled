package p000;

import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.plus.audience.FaclSelectionChimeraActivity;
import java.util.HashSet;

/* renamed from: anqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anqw extends anpm implements CompoundButton.OnCheckedChangeListener, View.OnClickListener, anqf {

    /* renamed from: c */
    public static final /* synthetic */ int f77477c = 0;

    /* renamed from: a */
    public CheckBox f77478a;

    /* renamed from: b */
    public HashSet f77479b = new HashSet();

    /* renamed from: d */
    private CheckBox f77480d;

    /* renamed from: o */
    private View f77481o;

    /* renamed from: p */
    private TextView f77482p;

    /* renamed from: k */
    private final void m65023k() {
        CheckBox checkBox = this.f77478a;
        if (checkBox != null && !checkBox.isChecked()) {
            mo42093g().mo42124a(new sfd().mo25465a(), this);
        }
        m65024l();
    }

    /* renamed from: l */
    private final void m65024l() {
        mo42090b().f82306D = false;
        ListView listView = getListView();
        this.f77482p.setText((int) C0126R.string.plus_auth_hide_circles_label);
        for (int i = 0; i < listView.getChildCount(); i++) {
            View childAt = listView.getChildAt(i);
            if (!(childAt == null || childAt == this.f77481o)) {
                childAt.setVisibility(0);
            }
        }
    }

    /* renamed from: m */
    private final void m65025m() {
        mo42090b().f82306D = true;
        ListView listView = getListView();
        this.f77482p.setText((int) C0126R.string.plus_auth_see_circles_label);
        for (int i = 0; i < listView.getChildCount(); i++) {
            View childAt = listView.getChildAt(i);
            if (!(childAt == null || childAt == this.f77481o)) {
                childAt.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo42029a() {
        View view = this.f77481o;
        if (view != null) {
            return view;
        }
        this.f77481o = LayoutInflater.from(getActivity()).inflate((int) C0126R.C0128layout.plus_audience_selection_facl_header, (ViewGroup) null);
        FaclSelectionChimeraActivity i = mo42090b();
        TextView textView = (TextView) this.f77481o.findViewById(C0126R.C0129id.description);
        textView.setText(Html.fromHtml(i.f82307E));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setClickable(true);
        this.f77482p = (TextView) this.f77481o.findViewById(C0126R.C0129id.see_circles_label);
        this.f77478a = (CheckBox) this.f77481o.findViewById(C0126R.C0129id.circles_select_all_checkbox);
        if (i.f82309z) {
            CheckBox checkBox = (CheckBox) this.f77481o.findViewById(C0126R.C0129id.contacts_select_all_checkbox);
            this.f77480d = checkBox;
            checkBox.setOnCheckedChangeListener(this);
            this.f77480d.setChecked(i.f82304B);
            this.f77481o.findViewById(C0126R.C0129id.contacts_select_all).setOnClickListener(this);
        } else {
            this.f77481o.findViewById(C0126R.C0129id.contacts_select_all).setVisibility(8);
            this.f77481o.findViewById(C0126R.C0129id.divider_contacts_circles).setVisibility(8);
        }
        if (!i.f82308y || i.f82303A) {
            this.f77478a.setOnCheckedChangeListener(this);
            this.f77478a.setOnClickListener(this);
            this.f77478a.setChecked(i.f82305C);
            this.f77482p.setOnClickListener(this);
            this.f77482p.setClickable(true);
            if (i.f82306D) {
                m65025m();
            } else {
                m65024l();
            }
            this.f77481o.findViewById(C0126R.C0129id.circles_select_all).setOnClickListener(this);
        } else {
            m65025m();
            this.f77481o.findViewById(C0126R.C0129id.divider_contacts_circles).setVisibility(8);
            this.f77481o.findViewById(C0126R.C0129id.circles_select_all).setVisibility(8);
            this.f77481o.findViewById(C0126R.C0129id.divider_circles).setVisibility(8);
            this.f77481o.findViewById(C0126R.C0129id.see_circles_label).setVisibility(8);
        }
        return this.f77481o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final anpb mo42092d() {
        return new anqv(this, getActivity(), mo42093g(), this.f77413l, this.f77414m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ BaseAdapter mo42050f() {
        return mo42050f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final FaclSelectionChimeraActivity mo42090b() {
        return (FaclSelectionChimeraActivity) super.mo42090b();
    }

    /* renamed from: j */
    public final void mo42148j() {
        CheckBox checkBox = this.f77478a;
        if (checkBox != null && checkBox.isChecked()) {
            anqg g = mo42093g();
            sfd sfd = new sfd(mo42093g().f77451a);
            sfd.mo25467a(this.f77479b);
            g.mo42124a(sfd.mo25465a(), this);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof FaclSelectionChimeraActivity)) {
            throw new IllegalStateException("FaclSelectionFragment may only be used by FaclSelectionChimeraActivity");
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        FaclSelectionChimeraActivity i = mo42090b();
        int id = compoundButton.getId();
        if (id == C0126R.C0129id.contacts_select_all_checkbox) {
            i.f82304B = z;
        } else if (id == C0126R.C0129id.circles_select_all_checkbox) {
            i.f82305C = z;
            mo42148j();
            if (!this.f77478a.isChecked()) {
                m65024l();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.contacts_select_all) {
            this.f77480d.toggle();
        } else if (view.getId() == C0126R.C0129id.circles_select_all) {
            this.f77478a.toggle();
            m65023k();
        } else if (view.getId() == C0126R.C0129id.circles_select_all_checkbox) {
            m65023k();
        } else if (view.getId() == C0126R.C0129id.see_circles_label) {
            if (mo42090b().f82306D) {
                m65024l();
            } else {
                m65025m();
            }
            this.f77482p.sendAccessibilityEvent(8);
        }
    }

    public final void onStart() {
        super.onStart();
        mo42093g().mo42123a(this);
    }

    public final void onStop() {
        mo42093g().mo42125b(this);
        super.onStop();
    }

    /* renamed from: a */
    public final void mo42031a(Object obj) {
        if (obj == this) {
            return;
        }
        if (mo42093g().f77451a.f30287b.size() < this.f77479b.size()) {
            this.f77478a.setChecked(false);
        } else {
            this.f77478a.setChecked(true);
        }
    }
}
