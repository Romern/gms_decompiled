package p000;

import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: gyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gyt extends adcf {

    /* renamed from: a */
    public static final Logger f19252a = ght.m13172b("GoogleSignInAccountChooserFragment");

    /* renamed from: i */
    private static final int f19253i = C0126R.style.CredentialsDialogTheme;

    /* renamed from: b */
    public qws f19254b;

    /* renamed from: c */
    public hay f19255c;

    /* renamed from: d */
    public aczc f19256d;

    /* renamed from: e */
    public hdr f19257e;

    /* renamed from: f */
    public View f19258f;

    /* renamed from: g */
    public TextView f19259g;

    /* renamed from: h */
    public ProgressBar f19260h;

    /* renamed from: j */
    private ImageView f19261j;

    /* renamed from: k */
    private RecyclerView f19262k;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f19254b = new qws(getContext(), "IDENTITY_GMSCORE", null);
        Activity activity = getActivity();
        aczc aczc = (aczc) adcj.m50161a(activity).mo3444a(aczc.class);
        this.f19256d = aczc;
        aczc.f61123d.mo2445a(this, new gym(this));
        this.f19256d.f61122a.mo2445a(this, new gyn(this));
        this.f19256d.f61125f.mo2445a(this, new gyo(this));
        this.f19256d.f61126g.mo2445a(this, new gyp(this));
        hay hay = (hay) adcj.m50161a(activity).mo3444a(hay.class);
        this.f19255c = hay;
        hay.f19389m.mo2445a(this, new gyq(this));
        View view = getView();
        this.f19261j = (ImageView) view.findViewById(C0126R.C0129id.app_icon);
        this.f19259g = (TextView) view.findViewById(C0126R.C0129id.subtitle);
        this.f19262k = (RecyclerView) view.findViewById(C0126R.C0129id.list);
        hdr hdr = new hdr(C0126R.C0128layout.credentials_account_chooser_header, new gyr(this), this.f19255c.f19383g);
        this.f19257e = hdr;
        this.f19262k.setAdapter(hdr);
        this.f19262k.setHasFixedSize(true);
        RecyclerView recyclerView = this.f19262k;
        getContext();
        recyclerView.setLayoutManager(new aah());
        if (this.f19259g != null) {
            this.f19261j.setImageBitmap(this.f19255c.f19383g);
            this.f19259g.setText(getString(C0126R.string.credentials_assisted_choose_account_subtitle, this.f19255c.f19382f));
        }
        this.f19260h = (ProgressBar) view.findViewById(C0126R.C0129id.loading_progress);
        View findViewById = view.findViewById(C0126R.C0129id.container_overlay);
        this.f19258f = findViewById;
        findViewById.setOnTouchListener(gys.f19251a);
        acza a = acza.m50025a(this.f19255c.f19380d, bngx.m109356a("com.google"), this.f19255c.f19381e.f10225b);
        getChildFragmentManager().beginTransaction().add(a, "account_chooser_fragment").commitNow();
        a.mo33260a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.cloneInContext(new C1416ut(getActivity(), f19253i)).inflate((int) C0126R.C0128layout.credentials_account_chooser_fragment, viewGroup, false);
    }
}
