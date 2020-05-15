package p000;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.SetupWizardLayout;
import com.google.android.setupdesign.view.NavigationBar;

/* renamed from: jgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jgs extends Fragment implements LoaderManager.LoaderCallbacks, bjbh {

    /* renamed from: a */
    private biyn f22434a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final CharSequence mo13716a(int i, CharSequence... charSequenceArr) {
        return TextUtils.expandTemplate(getResources().getTextArray(i)[getArguments().getInt("variant_index")], charSequenceArr);
    }

    /* renamed from: bd */
    public final void mo7769bd() {
        jgr jgr = (jgr) getActivity();
        if (jgr != null) {
            jgr.mo7751a();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getLoaderManager().initLoader(0, null, this);
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new jgx(getActivity(), getArguments().getString("package_icon_url"));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bizb.a(android.view.Window, boolean):void
     arg types: [android.view.Window, int]
     candidates:
      bizb.a(android.view.Window, int):void
      bizb.a(android.view.Window, biyz):void
      bizb.a(android.view.Window, boolean):void */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CharSequence charSequence;
        String str;
        rrr a = rrr.m34310a(getActivity(), !rrp.m34306a(getArguments().getString("theme")) ? C0126R.C0128layout.auth_device_management_download : C0126R.C0128layout.auth_device_management_download_glif);
        rrp.m34302a(a.mo25046a());
        a.mo25051c(true);
        bizb.m103020a(getActivity().getWindow(), true);
        a.mo25050b(true);
        getActivity().setTitle(getArguments().getString("account_name"));
        a.mo25047a(getActivity().getTitle());
        if (a.mo25046a() instanceof SetupWizardLayout) {
            NavigationBar c = ((SetupWizardLayout) a.mo25046a()).mo71377c();
            c.mo71422a(this);
            c.f151534b.setCompoundDrawables(null, null, null, null);
        } else {
            this.f22434a = (biyn) ((GlifLayout) a.mo25046a().findViewById(C0126R.C0129id.setup_wizard_layout)).mo71342a(biyn.class);
            int i = getArguments().getInt("package_install_state");
            if (i == 1) {
                str = getString(C0126R.string.common_install);
            } else if (i != 2) {
                str = getString(C0126R.string.common_next);
            } else {
                str = getString(C0126R.string.common_update);
            }
            biyo biyo = new biyo(getActivity());
            biyo.f122327b = new jgp(this);
            biyo.f122328c = 5;
            biyo.f122329d = 2132018229;
            biyp a2 = biyo.mo64882a();
            this.f22434a.mo52733a(a2);
            a2.mo64887a((CharSequence) str);
            biyo biyo2 = new biyo(getActivity());
            biyo2.mo64883a(C0126R.string.common_skip);
            biyo2.f122327b = new jgq(this);
            biyo2.f122328c = 7;
            biyo2.f122329d = 2132018230;
            this.f22434a.mo52735b(biyo2.mo64882a());
        }
        ((TextView) a.mo25046a().findViewById(C0126R.C0129id.auth_device_management_download_app_name)).setText(getArguments().getString("package_display_name"));
        TextView textView = (TextView) a.mo25046a().findViewById(C0126R.C0129id.auth_device_management_download_description);
        int i2 = getArguments().getInt("package_install_state");
        if (i2 == 1) {
            charSequence = mo13716a(C0126R.array.auth_device_management_download_description, getArguments().getString("package_display_name"));
        } else if (i2 != 2) {
            charSequence = mo13716a(C0126R.array.auth_device_management_start_description, getArguments().getString("package_display_name"));
        } else {
            charSequence = mo13716a(C0126R.array.auth_device_management_update_description, getArguments().getString("package_display_name"));
        }
        textView.setText(charSequence);
        return a.mo25046a();
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ImageView imageView = (ImageView) getActivity().findViewById(C0126R.C0129id.auth_device_management_download_app_icon);
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public final void onLoaderReset(Loader loader) {
    }

    /* renamed from: a */
    public final void mo7768a() {
        jgr jgr = (jgr) getActivity();
        if (jgr != null) {
            jgr.mo7756b();
        }
    }
}
