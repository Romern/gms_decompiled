package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.gms.plus.audience.AudienceSelectionListView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: anpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class anpm extends anpn {

    /* renamed from: a */
    private boolean f77398a;

    /* renamed from: b */
    private boolean f77399b;

    /* renamed from: c */
    private boolean f77400c;

    /* renamed from: d */
    private boolean f77401d;

    /* renamed from: e */
    public boolean f77402e;

    /* renamed from: f */
    public String f77403f;

    /* renamed from: g */
    public int f77404g;

    /* renamed from: h */
    public int f77405h;

    /* renamed from: i */
    public int f77406i;

    /* renamed from: o */
    private Integer f77407o;

    /* renamed from: p */
    private boolean f77408p;

    /* renamed from: q */
    private boolean f77409q = true;

    /* renamed from: r */
    private List f77410r;

    /* renamed from: a */
    public static Bundle m64955a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Integer num, boolean z5, String str3, String str4, String str5, boolean z6, boolean z7, int i, int i2, int i3, List list) {
        List list2 = list;
        Bundle b = anpn.m64963b(str, str2, str4, str5);
        b.putBoolean("loadSuggested", z);
        b.putBoolean("loadGroups", z2);
        b.putBoolean("loadCircles", z3);
        b.putBoolean("loadPeople", z4);
        if (num != null) {
            b.putInt("loadPeopleType", num.intValue());
        }
        b.putBoolean("requestCircleVisibility", z5);
        b.putString("description", str3);
        b.putBoolean("headerVisible", z6);
        b.putBoolean("includeSuggestions", z7);
        b.putInt("maxSuggestedImages", i);
        b.putInt("maxSuggestedListItems", i2);
        b.putInt("maxSuggestedDevice", i3);
        if (list2 != null) {
            b.putParcelableArrayList("excludedSuggestions", new ArrayList(list2));
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public anpf mo42090b() {
        return (anpf) getActivity();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final anpe mo42091c() {
        return (anpe) getActivity();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public anpb mo42050f() {
        anpb anpb = new anpb(getActivity(), mo42093g(), this.f77413l, this.f77414m, this.f77408p, this.f77404g, this.f77405h, this.f77410r, mo42090b().mo42089a(), anuy.f77749a);
        if (this.f77415n) {
            anpb.mo42066e();
        }
        return anpb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo42049e() {
        if (this.f77398a && (this.f77404g > 0 || this.f77405h > 0)) {
            if (this.f77406i > 0) {
                getLoaderManager().initLoader(4, null, new anph(this));
            }
            getLoaderManager().initLoader(5, null, new anpl(this));
        }
        if (this.f77399b) {
            getLoaderManager().initLoader(0, null, new anpi(this));
        }
        if (this.f77400c) {
            getLoaderManager().initLoader(1, null, new anpg(this));
        }
        if (!this.f77401d) {
            return;
        }
        if (this.f77407o.intValue() == 1) {
            getLoaderManager().initLoader(6, null, new anpd(this));
        } else if (this.f77409q) {
            getLoaderManager().restartLoader(3, null, new anpk(this));
        } else {
            getLoaderManager().initLoader(2, null, new anpj(this));
        }
    }

    /* renamed from: g */
    public final anqg mo42093g() {
        return mo42090b().mo42085m();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (mo42090b().mo42089a()) {
            anqe anqe = (anqe) mo42091c();
            AudienceSelectionListView audienceSelectionListView = (AudienceSelectionListView) getListView();
            audienceSelectionListView.setOnScrollListener(anqe);
            audienceSelectionListView.f82290a = anqe;
            audienceSelectionListView.f82291b = anqe;
            ((anpb) getListAdapter()).f77360e = anqe;
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof anpf)) {
            throw new IllegalStateException("Activity must implement AudienceSelectionFragmentHost");
        } else if (mo42090b().mo42089a() && !(activity instanceof anqe)) {
            throw new IllegalStateException("Activity must extend AudienceSelectionScrollViewChimeraActivity");
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f77398a = arguments.getBoolean("loadSuggested");
        this.f77399b = arguments.getBoolean("loadGroups");
        this.f77400c = arguments.getBoolean("loadCircles");
        this.f77401d = arguments.getBoolean("loadPeople");
        this.f77407o = Integer.valueOf(arguments.getInt("loadPeopleType"));
        this.f77402e = arguments.getBoolean("requestCircleVisibility");
        this.f77403f = arguments.getString("description");
        this.f77408p = arguments.getBoolean("headerVisible");
        this.f77409q = arguments.getBoolean("includeSuggestions");
        this.f77404g = arguments.getInt("maxSuggestedImages");
        this.f77405h = arguments.getInt("maxSuggestedListItems");
        this.f77406i = arguments.getInt("maxSuggestedDevice");
        if (arguments.containsKey("excludedSuggestions")) {
            this.f77410r = arguments.getParcelableArrayList("excludedSuggestions");
        }
    }

    public void onStart() {
        super.onStart();
        ((anpb) getListAdapter()).mo42066e();
    }

    public void onStop() {
        ((anpb) getListAdapter()).mo42067f();
        super.onStop();
    }

    /* renamed from: a */
    public static anpm m64956a(String str, String str2, String str3, String str4) {
        anpm anpm = new anpm();
        anpm.setArguments(m64955a(str, str2, false, false, true, false, null, false, null, str3, str4, false, false, 0, 0, 0, null));
        return anpm;
    }
}
