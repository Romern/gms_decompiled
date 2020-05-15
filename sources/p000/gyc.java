package p000;

import android.content.Context;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import java.util.List;

/* renamed from: gyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gyc extends adcf implements hem {

    /* renamed from: a */
    public hel f19210a;

    /* renamed from: b */
    public gzz f19211b;

    /* renamed from: c */
    public hej f19212c;

    /* renamed from: d */
    public RecyclerView f19213d;

    /* renamed from: e */
    public qws f19214e;

    /* renamed from: f */
    public hix f19215f;

    /* renamed from: g */
    private View f19216g;

    /* renamed from: h */
    private View f19217h;

    /* renamed from: i */
    private TextView f19218i;

    /* renamed from: j */
    private TextView f19219j;

    /* renamed from: k */
    private boolean f19220k;

    /* renamed from: a */
    private final void m14090a() {
        this.f19220k = true;
        this.f19216g.setVisibility(8);
        this.f19217h.setVisibility(0);
        this.f19218i.setAlpha(0.3f);
        this.f19219j.setAlpha(0.3f);
        this.f19213d.setAlpha(0.3f);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f19215f = new hix(this, this.f19211b.f19321j, this.f19214e);
        this.f19211b.f19332u.mo2445a(this, new gxx(this));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle != null) {
            this.f19220k = bundle.getBoolean("key_stop_user_interaction", false);
        }
        Context context = getContext();
        View inflate = layoutInflater.cloneInContext(new C1416ut(context, (int) C0126R.style.AppBottomSheetDialogTheme)).inflate((int) C0126R.C0128layout.credentials_assisted_signin_multiple_entries, viewGroup, false);
        Activity activity = getActivity();
        this.f19210a = (hel) adcj.m50161a(activity).mo3444a(hel.class);
        this.f19211b = (gzz) adcj.m50161a(activity).mo3444a(gzz.class);
        inflate.findViewById(C0126R.C0129id.cancel).setOnClickListener(new gxy(this));
        this.f19216g = inflate.findViewById(C0126R.C0129id.divider);
        this.f19217h = inflate.findViewById(C0126R.C0129id.progress);
        this.f19218i = (TextView) inflate.findViewById(C0126R.C0129id.title);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.subtitle);
        this.f19219j = textView;
        textView.setText(getString(C0126R.string.credentials_assisted_choose_account_subtitle, this.f19211b.f19318g));
        this.f19213d = (RecyclerView) inflate.findViewById(C0126R.C0129id.list);
        hej hej = new hej(this, this.f19211b.f19317f);
        this.f19212c = hej;
        this.f19213d.setAdapter(hej);
        this.f19213d.setHasFixedSize(true);
        Context context2 = getContext();
        this.f19213d.setLayoutManager(new aah());
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0126R.dimen.credentials_assisted_dialog_side_padding);
        adcl.m50164a(context2, this.f19213d, 0, C0126R.C0127drawable.credentials_assisted_divider_drawable, dimensionPixelSize, dimensionPixelSize);
        if (this.f19220k) {
            m14090a();
        }
        this.f19214e = new qws(context, "IDENTITY_GMSCORE", null);
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("key_stop_user_interaction", this.f19220k);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public final void mo12320a(hek hek, int i) {
        if (!this.f19220k) {
            m14090a();
            List list = (List) this.f19211b.f19332u.mo2448b();
            if (list != null) {
                this.f19215f.mo12514a(i, hit.m14429a((InternalSignInCredentialWrapper) list.get(i)));
            }
            this.f19211b.f19332u.mo2444a(this);
            gzz gzz = this.f19211b;
            gzz.f19327p = (InternalSignInCredentialWrapper) bnjd.m109599f(gzz.f19328q, new gzg(hek)).mo66814b();
            gzz.f19323l.mo12425c();
        }
    }
}
