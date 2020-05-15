package p000;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.chimera.Activity;

/* renamed from: anon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class anon extends anpn implements anof {

    /* renamed from: a */
    public static final String f77297a;

    /* renamed from: b */
    protected boolean f77298b;

    /* renamed from: c */
    public String f77299c = "";

    /* renamed from: d */
    private boolean f77300d;

    /* renamed from: e */
    private boolean f77301e;

    /* renamed from: f */
    private boolean f77302f;

    /* renamed from: g */
    private boolean f77303g;

    /* renamed from: h */
    private boolean f77304h;

    /* renamed from: i */
    private anrm f77305i;

    /* renamed from: o */
    private anri f77306o;

    /* renamed from: p */
    private anrk f77307p;

    /* renamed from: q */
    private anro f77308q;

    /* renamed from: r */
    private anrj f77309r;

    /* renamed from: s */
    private anoi f77310s;

    static {
        String str = anot.f77328a;
        String str2 = anot.f77328a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 57 + String.valueOf(str2).length());
        sb.append("account_name = ? AND (data1 LIKE ? OR ");
        sb.append(str);
        sb.append(" LIKE ? OR ");
        sb.append(str2);
        sb.append(" LIKE ?)");
        f77297a = sb.toString();
    }

    /* renamed from: a */
    public static Bundle m64877a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str3, String str4) {
        Bundle b = anpn.m64963b(str, str2, str3, str4);
        b.putBoolean("searchGroups", z);
        b.putBoolean("searchCircles", z2);
        b.putBoolean("searchPeople", z3);
        b.putBoolean("searchWeb", z4);
        b.putBoolean("searchDevice", z5);
        b.putBoolean("searchEmail", z6);
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo42029a() {
        return null;
    }

    /* renamed from: b */
    public final void mo42037b() {
        anro anro = this.f77308q;
        if (anro.mo42156a()) {
            anro.mo42155a(anro.f77509a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public anog mo42050f() {
        anog anog = new anog(getActivity(), mo42048d().mo42085m(), this.f77413l, this.f77414m);
        anog.f77288b = this;
        return anog;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final anpf mo42048d() {
        return (anpf) getActivity();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo42049e() {
        if (this.f77300d) {
            this.f77307p = (anrk) getLoaderManager().initLoader(0, null, new anok(this));
        }
        if (this.f77301e) {
            this.f77306o = (anri) getLoaderManager().initLoader(1, null, new anoh(this));
        }
        if (this.f77302f) {
            this.f77305i = (anrm) getLoaderManager().initLoader(2, null, new anol(this));
        }
        if (this.f77303g) {
            this.f77308q = (anro) getLoaderManager().initLoader(3, null, new anom(this));
        }
        if (this.f77298b) {
            this.f77310s = new anoi(this);
            getLoaderManager().initLoader(5, null, this.f77310s);
        }
        if (this.f77304h) {
            this.f77309r = (anrj) getLoaderManager().initLoader(4, null, new anoj(this));
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof anpf)) {
            throw new IllegalStateException("Activity must implement AudienceSelectionFragmentHost");
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f77300d = arguments.getBoolean("searchGroups");
        this.f77301e = arguments.getBoolean("searchCircles");
        this.f77302f = arguments.getBoolean("searchPeople");
        this.f77303g = arguments.getBoolean("searchWeb");
        this.f77298b = arguments.getBoolean("searchDevice");
        this.f77304h = arguments.getBoolean("searchEmail");
    }

    public final void onStart() {
        super.onStart();
        ((anog) getListAdapter()).mo42066e();
    }

    public final void onStop() {
        ((anog) getListAdapter()).mo42067f();
        super.onStop();
    }

    /* renamed from: a */
    public final void mo42046a(String str) {
        this.f77299c = str;
        ((anog) getListAdapter()).f77287a = !TextUtils.isEmpty(str);
        anrk anrk = this.f77307p;
        if (anrk != null) {
            anrk.mo41661b(this.f77299c);
        }
        anri anri = this.f77306o;
        if (anri != null) {
            anri.mo41661b(this.f77299c);
        }
        anrm anrm = this.f77305i;
        if (anrm != null) {
            anrm.mo41661b(this.f77299c);
        }
        anro anro = this.f77308q;
        if (anro != null) {
            anro.mo42155a(this.f77299c);
        }
        if (this.f77310s != null) {
            getLoaderManager().restartLoader(5, null, this.f77310s);
        }
        anrj anrj = this.f77309r;
        if (anrj != null) {
            anrj.mo42154a(this.f77299c);
        }
    }
}
