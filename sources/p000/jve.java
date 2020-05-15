package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentActivity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: jve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jve extends jxb implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    public static final imr f23316a = imr.m15727a("frp_dialog_shown");

    /* renamed from: d */
    private static final imr f23317d = imr.m15727a("show_frp_dialog");

    /* renamed from: e */
    private static final imr f23318e = imr.m15727a("resolve_frp_only");

    /* renamed from: f */
    private static final imr f23319f = imr.m15727a("account_type");

    /* renamed from: g */
    private static final imr f23320g = imr.m15727a("auth_code");

    /* renamed from: h */
    private static final imr f23321h = imr.m15727a("obfuscated_gaia_id");

    /* renamed from: i */
    private static final imr f23322i = imr.m15727a("account_name");

    /* renamed from: j */
    private static final imr f23323j = imr.m15727a("terms_of_service_accepted");

    /* renamed from: k */
    private static final imr f23324k = imr.m15727a("check_offers");

    /* renamed from: l */
    private static final imr f23325l = imr.m15727a("fixed_window_size");

    /* renamed from: m */
    private static final imr f23326m = imr.m15727a("was_frp_unlocked");

    /* renamed from: b */
    public jvf f23327b;

    /* renamed from: c */
    AlertDialog f23328c;

    /* renamed from: n */
    private jvd f23329n;

    /* renamed from: a */
    public static void m17392a(FragmentActivity fragmentActivity, boolean z, boolean z2, String str, String str2, String str3, String str4, boolean z3, boolean z4, boolean z5) {
        if (fragmentActivity.getSupportFragmentManager().findFragmentByTag("AddAccountFragment") == null) {
            ims ims = new ims();
            ims.mo13148b(f23317d, Boolean.valueOf(z));
            ims.mo13148b(f23318e, Boolean.valueOf(z2));
            ims.mo13148b(f23319f, str);
            ims.mo13148b(f23320g, str2);
            ims.mo13148b(f23321h, str3);
            ims.mo13148b(f23322i, str4);
            ims.mo13148b(f23323j, Boolean.valueOf(z3));
            ims.mo13148b(f23324k, Boolean.valueOf(z4));
            ims.mo13148b(f23325l, Boolean.valueOf(z5));
            jve jve = new jve();
            jve.setArguments(ims.f21367a);
            fragmentActivity.getSupportFragmentManager().beginTransaction().add(jve, "AddAccountFragment").commit();
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f23329n = (jvd) activity;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Context applicationContext = getActivity().getApplicationContext();
        return new jvf(applicationContext, new ixl(applicationContext), (String) mo14207b().mo13146a(f23319f), (String) mo14207b().mo13146a(f23320g), (String) mo14207b().mo13146a(f23321h), (String) mo14207b().mo13146a(f23322i), ((Boolean) mo14207b().mo13147a(f23323j, false)).booleanValue(), ((Boolean) mo14207b().mo13147a(f23324k, false)).booleanValue(), ((Boolean) mo14207b().mo13147a(f23325l, false)).booleanValue());
    }

    public final void onDestroyView() {
        AlertDialog alertDialog = this.f23328c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        super.onDestroyView();
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        jvh jvh = (jvh) obj;
        int i = jvh.f23344a;
        if (i == 0) {
            this.f23329n.mo7859a(jvh.f23345b, jvh.f23347d, jvh.f23348e, jvh.f23346c, ((Boolean) mo14207b().mo13147a(f23326m, false)).booleanValue(), jvh.f23349f);
        } else if (i == 2) {
            this.f23329n.mo7858a(jvh.f23350g);
        } else if (i == 3) {
            mo14207b().mo13148b(f23326m, true);
            if (((Boolean) mo14207b().mo13147a(f23318e, false)).booleanValue()) {
                mo14145a();
            } else if (!((Boolean) mo14207b().mo13147a(f23317d, false)).booleanValue()) {
                this.f23327b.mo14146a();
            } else if (this.f23328c == null && !((Boolean) mo14207b().mo13147a(f23316a, false)).booleanValue()) {
                AlertDialog create = new AlertDialog.Builder(getActivity()).setMessage(TextUtils.expandTemplate(getText(C0126R.string.auth_frp_add_account_prompt), (CharSequence) mo14207b().mo13146a(f23322i))).setPositiveButton((int) C0126R.string.auth_frp_add_account_yes, new jvc(this)).setNegativeButton((int) C0126R.string.auth_frp_add_account_no, new jvb(this)).create();
                this.f23328c = create;
                create.setCancelable(false);
                this.f23328c.setCanceledOnTouchOutside(false);
                this.f23328c.show();
            }
        } else {
            this.f23329n.mo7861e();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final void onResume() {
        super.onResume();
        this.f23327b = (jvf) getLoaderManager().initLoader(0, null, this);
    }

    /* renamed from: a */
    public final void mo14145a() {
        this.f23329n.mo7860c();
        mo14207b().mo13148b(f23316a, true);
    }
}
