package p000;

import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: hhn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hhn extends adcf implements hem {

    /* renamed from: a */
    public hhe f19786a;

    /* renamed from: b */
    public hel f19787b;

    /* renamed from: c */
    public RecyclerView f19788c;

    /* renamed from: d */
    public hej f19789d;

    /* renamed from: e */
    private TextView f19790e;

    /* renamed from: f */
    private hix f19791f;

    /* renamed from: a */
    public final void mo12320a(hek hek, int i) {
        int i2;
        hhe hhe = this.f19786a;
        hhe.f19766u.mo2450b(hek);
        hhe.f19760o.mo12424b(adcu.ACCOUNT_CONFIRMATION);
        hix hix = this.f19791f;
        bxvd da = bomw.f133727d.mo74144da();
        if (hek.f19601a == 0) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bomw bomw = (bomw) da.f164949b;
        bomw.f133730b = i2 - 1;
        bomw.f133729a |= 1;
        hix.mo12514a(i, (bomw) da.mo74062i());
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f19786a.f19764s.mo2445a(this, new hhl(this));
        this.f19791f = new hix(this, this.f19786a.f19751f, null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.cloneInContext(new C1416ut(getContext(), (int) C0126R.style.AppBottomSheetDialogTheme)).inflate((int) C0126R.C0128layout.credentials_gis_password_saving_account_selection, viewGroup, false);
        Activity activity = getActivity();
        this.f19786a = (hhe) adcj.m50161a(activity).mo3444a(hhe.class);
        this.f19787b = (hel) adcj.m50161a(activity).mo3444a(hel.class);
        this.f19790e = (TextView) inflate.findViewById(C0126R.C0129id.save_informative_text);
        this.f19788c = (RecyclerView) inflate.findViewById(C0126R.C0129id.list);
        ((TextView) inflate.findViewById(C0126R.C0129id.title_text)).setText((int) C0126R.string.common_choose_account_label);
        this.f19790e.setText(getString(C0126R.string.credentials_gis_pw_saving_selection_text, this.f19786a.mo12467b()));
        hej hej = new hej(this, this.f19786a.f19750e);
        this.f19789d = hej;
        this.f19788c.setAdapter(hej);
        this.f19788c.setHasFixedSize(true);
        RecyclerView recyclerView = this.f19788c;
        getContext();
        recyclerView.setLayoutManager(new aah());
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0126R.dimen.credentials_assisted_dialog_side_padding);
        adcl.m50164a(getContext(), this.f19788c, 0, C0126R.C0127drawable.credentials_assisted_divider_drawable, dimensionPixelSize, dimensionPixelSize);
        return inflate;
    }
}
