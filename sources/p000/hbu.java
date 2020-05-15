package p000;

import android.graphics.Bitmap;
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
import com.google.android.gms.common.api.Status;

/* renamed from: hbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hbu extends adcf {

    /* renamed from: a */
    public static final sek f19435a = ght.m13172b("AuthorizationAccountChooserFragment");

    /* renamed from: f */
    private static final int f19436f = C0126R.style.CredentialsDialogTheme;

    /* renamed from: b */
    public hdi f19437b;

    /* renamed from: c */
    public TextView f19438c;

    /* renamed from: d */
    public hdr f19439d;

    /* renamed from: e */
    public CharSequence f19440e;

    /* renamed from: g */
    private aczc f19441g;

    /* renamed from: h */
    private ImageView f19442h;

    /* renamed from: i */
    private RecyclerView f19443i;

    /* renamed from: j */
    private ProgressBar f19444j;

    /* renamed from: k */
    private View f19445k;

    /* renamed from: l */
    private boolean f19446l;

    /* renamed from: m */
    private String f19447m;

    /* renamed from: n */
    private Bitmap f19448n;

    /* renamed from: a */
    public static hbu m14178a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("calling_package", str);
        hbu hbu = new hbu();
        hbu.setArguments(bundle);
        return hbu;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        this.f19437b = (hdi) adcj.m50161a(activity).mo3444a(hdi.class);
        this.f19441g = (aczc) adcj.m50161a(activity).mo3444a(aczc.class);
        bmxv a = aczr.m50057a(getContext().getApplicationContext(), this.f19447m);
        if (!a.mo66813a()) {
            this.f19437b.mo12408a(new hdh(new Status(10, "Calling package not found."), bmvz.f131120a));
            return;
        }
        this.f19440e = (CharSequence) ((C1240of) a.mo66814b()).f26798a;
        this.f19448n = (Bitmap) ((C1240of) a.mo66814b()).f26799b;
        View view = getView();
        this.f19442h = (ImageView) view.findViewById(C0126R.C0129id.app_icon);
        this.f19438c = (TextView) view.findViewById(C0126R.C0129id.subtitle);
        this.f19443i = (RecyclerView) view.findViewById(C0126R.C0129id.list);
        hdr hdr = new hdr(C0126R.C0128layout.credentials_account_chooser_header, this.f19441g, this.f19448n);
        this.f19439d = hdr;
        this.f19443i.setAdapter(hdr);
        this.f19443i.setHasFixedSize(true);
        RecyclerView recyclerView = this.f19443i;
        getContext();
        recyclerView.setLayoutManager(new aah());
        if (this.f19438c != null) {
            this.f19442h.setImageBitmap(this.f19448n);
            this.f19438c.setText(getString(C0126R.string.credentials_authorization_account_header_subtitle, this.f19440e));
        }
        this.f19444j = (ProgressBar) view.findViewById(C0126R.C0129id.loading_progress);
        View findViewById = view.findViewById(C0126R.C0129id.container_overlay);
        this.f19445k = findViewById;
        findViewById.setOnTouchListener(hbt.f19434a);
        mo12380a(this.f19446l);
        this.f19441g.f61123d.mo2445a(this, new hbq(this));
        this.f19441g.f61122a.mo2445a(this, new hbr(this));
        this.f19441g.f61125f.mo2445a(this, new hbs(this));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.cloneInContext(new C1416ut(getActivity(), f19436f)).inflate((int) C0126R.C0128layout.credentials_account_chooser_fragment, viewGroup, false);
        if (bundle != null) {
            this.f19446l = bundle.getBoolean("block_user_interaction", false);
        }
        this.f19447m = getArguments().getString("calling_package");
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("block_user_interaction", this.f19446l);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public final void mo12380a(boolean z) {
        this.f19446l = z;
        View view = this.f19445k;
        int i = !z ? 8 : 0;
        view.setVisibility(i);
        this.f19444j.setVisibility(i);
    }
}
