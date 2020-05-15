package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.libraries.matchstick.settings.MatchstickSettingsChimeraActivity;

/* renamed from: azit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azit extends Fragment {

    /* renamed from: a */
    public MatchstickSettingsChimeraActivity f99492a;

    /* renamed from: b */
    public Context f99493b;

    /* renamed from: c */
    public AlertDialog f99494c;

    /* renamed from: d */
    public azdl f99495d;

    /* renamed from: e */
    public azph f99496e;

    /* renamed from: f */
    public Boolean f99497f;

    /* renamed from: g */
    public Boolean f99498g;

    /* renamed from: h */
    private sug f99499h;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity = (MatchstickSettingsChimeraActivity) getActivity();
        this.f99492a = matchstickSettingsChimeraActivity;
        Context applicationContext = matchstickSettingsChimeraActivity.getApplicationContext();
        this.f99493b = applicationContext;
        this.f99495d = azdl.m85412a(applicationContext);
        this.f99496e = azph.m85998a(this.f99493b);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.ms_settings_storage_manage, viewGroup, false);
        TypedArray obtainStyledAttributes = this.f99492a.getTheme().obtainStyledAttributes(new int[]{16842801});
        int color = obtainStyledAttributes.getColor(0, 16777215);
        obtainStyledAttributes.recycle();
        inflate.setBackgroundColor(color);
        svi svi = new svi(this.f99492a);
        this.f99499h = svi;
        svf svf = svi.f45221a;
        sui a = this.f99492a.mo60394a((int) C0126R.string.ms_manage_storage_learn_more_desc);
        a.mo26086b(0);
        svf.mo26149a(a);
        svm svm = new svm(this.f99492a);
        svm.mo26106c(C0126R.string.ms_removing_after_7_days);
        new azio(this, svm).start();
        svm.mo26086b(1);
        svf.mo26149a((sui) svm);
        svk svk = new svk(this.f99492a);
        svk.mo26106c(C0126R.string.ms_erase_all_messages_option);
        svk.mo26102a(new azip(this));
        svm.mo26086b(2);
        svf.mo26149a((sui) svk);
        ((svi) this.f99499h).mo26095a((RecyclerView) inflate.findViewById(16908298));
        this.f99496e.mo55125a(276);
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        this.f99492a.setTitle((int) C0126R.string.ms_manage_storage);
        C1341rz aW = this.f99492a.mo8628aW();
        if (aW != null) {
            aW.mo15853b(false);
        }
    }

    public final void onStop() {
        super.onStop();
        this.f99492a.setTitle((int) C0126R.string.phone_number_settings_label);
        C1341rz aW = this.f99492a.mo8628aW();
        if (aW != null) {
            aW.mo15853b(true);
        }
        new azil(this).start();
    }
}
