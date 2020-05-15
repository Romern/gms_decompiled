package p000;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* renamed from: aoma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoma extends Fragment implements TextView.OnEditorActionListener, TextWatcher, LoaderManager.LoaderCallbacks, anqf {

    /* renamed from: a */
    public aomt f78447a;

    /* renamed from: b */
    public anob f78448b;

    /* renamed from: c */
    public anon f78449c;

    /* renamed from: d */
    private anpf f78450d;

    /* renamed from: e */
    private EditText f78451e;

    /* renamed from: a */
    private final void m66014a(boolean z) {
        int i;
        if (getView() != null) {
            View findViewById = getView().findViewById(C0126R.C0129id.acl_fragment_container);
            Resources resources = getResources();
            if (!z) {
                i = C0126R.color.plus_solid_white;
            } else {
                i = C0126R.color.plus_sharebox_search_background;
            }
            findViewById.setBackgroundColor(resources.getColor(i));
        }
    }

    public final void afterTextChanged(Editable editable) {
        if (TextUtils.isEmpty(editable.toString())) {
            mo42990a();
            return;
        }
        getChildFragmentManager().beginTransaction().show(this.f78449c).hide(this.f78448b).commitAllowingStateLoss();
        this.f78447a.mo43001h().mo43062a(3);
        m66014a(true);
        this.f78449c.mo42046a(editable.toString());
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof aomt)) {
            String valueOf = String.valueOf(aomt.class.getSimpleName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf));
        }
        this.f78447a = (aomt) activity;
        if (activity instanceof anpf) {
            this.f78450d = (anpf) activity;
        }
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        if (i == 0) {
            return new anrl(getActivity(), this.f78447a.mo42999g().f78512j, this.f78447a.mo43003j().mo43050b(), this.f78447a.mo43003j().f78541m, this.f78447a.getCallingPackage());
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("Unknown loader ID: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate((int) C0126R.C0128layout.plus_sharebox_acl_selection_fragment, viewGroup, false);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f78451e.removeTextChangedListener(this);
        this.f78451e.setOnEditorActionListener(null);
    }

    public final void onDetach() {
        super.onDetach();
        this.f78447a = null;
        getLoaderManager().destroyLoader(0);
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        ssc.m36197a(getActivity(), this.f78451e);
        return true;
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            mo42990a();
            this.f78447a.mo43001h().mo43063a(true);
            anpf anpf = this.f78450d;
            if (anpf != null && anpf.mo42085m() != null) {
                this.f78450d.mo42085m().mo42123a(this);
                return;
            }
            return;
        }
        anpf anpf2 = this.f78450d;
        if (anpf2 != null && anpf2.mo42085m() != null) {
            this.f78450d.mo42085m().mo42125b(this);
        }
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        amey amey = (amey) obj;
        if (loader.getId() == 0) {
            Status status = ((anrl) loader).f76571f;
            if (status.mo17710c() && amey != null && amey.mo24660a() == 1) {
                this.f78448b.mo42030a(amey.mo24661a(0));
                return;
            }
            this.f78447a.mo43031a(new ConnectionResult(status.f30115i, status.f30117k));
        }
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        anob anob = this.f78448b;
        if (anob != null) {
            bundle.putBoolean("selection_hidden", anob.isHidden());
        }
        anon anon = this.f78449c;
        if (anon != null) {
            bundle.putBoolean("search_hidden", anon.isHidden());
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        EditText editText = (EditText) getView().findViewById(C0126R.C0129id.plus_sharebox_searchbox);
        this.f78451e = editText;
        editText.setOnEditorActionListener(this);
        this.f78451e.addTextChangedListener(this);
        this.f78451e.setHint((int) C0126R.string.plus_sharebox_search_hint);
        this.f78451e.setInputType(97);
        FragmentManager childFragmentManager = getChildFragmentManager();
        this.f78448b = (anob) childFragmentManager.findFragmentByTag("selection");
        this.f78449c = (anon) childFragmentManager.findFragmentByTag("search");
        if (bundle != null) {
            anpf anpf = this.f78450d;
            if (!(anpf == null || anpf.mo42085m() == null)) {
                this.f78450d.mo42085m().mo42123a(this);
            }
            FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
            if (this.f78448b != null) {
                if (bundle.getBoolean("selection_hidden")) {
                    beginTransaction.hide(this.f78448b);
                } else {
                    beginTransaction.show(this.f78448b);
                    m66014a(false);
                }
            }
            if (this.f78449c != null) {
                if (bundle.getBoolean("search_hidden")) {
                    beginTransaction.hide(this.f78449c);
                } else {
                    beginTransaction.show(this.f78449c);
                    m66014a(true);
                }
            }
            if (!beginTransaction.isEmpty()) {
                beginTransaction.commit();
            }
        }
    }

    /* renamed from: a */
    public final void mo42990a() {
        getChildFragmentManager().beginTransaction().show(this.f78448b).hide(this.f78449c).commitAllowingStateLoss();
        ssc.m36197a(getActivity(), this.f78451e);
        if (!TextUtils.isEmpty(this.f78451e.getText())) {
            this.f78451e.setText((CharSequence) null);
        }
        this.f78447a.mo43001h().mo43062a(2);
        m66014a(false);
    }

    /* renamed from: a */
    public final void mo42031a(Object obj) {
        if (!sfi.m35164a(this.f78450d.mo42085m().f77451a) && this.f78448b.isHidden()) {
            mo42990a();
        }
    }
}
