package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import com.felicanetworks.mfc.C0126R;

/* renamed from: hhs */
final /* synthetic */ class hhs implements C0038ax {

    /* renamed from: a */
    private final hhv f19796a;

    /* renamed from: b */
    private final Context f19797b;

    /* renamed from: c */
    private final SpannableStringBuilder f19798c;

    /* renamed from: d */
    private final String f19799d;

    /* renamed from: e */
    private final SpannableStringBuilder f19800e;

    public hhs(hhv hhv, Context context, SpannableStringBuilder spannableStringBuilder, String str, SpannableStringBuilder spannableStringBuilder2) {
        this.f19796a = hhv;
        this.f19797b = context;
        this.f19798c = spannableStringBuilder;
        this.f19799d = str;
        this.f19800e = spannableStringBuilder2;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        hhv hhv = this.f19796a;
        Context context = this.f19797b;
        SpannableStringBuilder spannableStringBuilder = this.f19798c;
        String str = this.f19799d;
        SpannableStringBuilder spannableStringBuilder2 = this.f19800e;
        hek hek = (hek) obj;
        adcm.m50165a(context, spannableStringBuilder, str, new Intent("com.google.android.gms.accountsettings.VIEW_SETTINGS_0P").setPackage(hhv.getContext().getPackageName()).putExtra("extra.screenId", hhv.getResources().getInteger(C0126R.integer.screen_id_saved_passwords)).putExtra("extra.accountName", ((Account) hhv.f19803a.f19758m.get(hek)).name).toUri(1), context.getTheme(), C0126R.style.AppBottomSheetDialogTheme, C0126R.attr.credential_assisted_link_color, new hht(hhv));
        spannableStringBuilder2.append(TextUtils.expandTemplate(hhv.getString(C0126R.string.credentials_gis_pw_saving_consent_text), hhv.f19803a.mo12467b(), spannableStringBuilder));
        hhv.f19810h.setMovementMethod(new LinkMovementMethod());
        hhv.f19810h.setText(spannableStringBuilder2);
        hhv.f19808f.mo60577a(hek);
        hhv.f19809g.setText(hek.f19602b);
        hhv.f19811i.setImageBitmap((Bitmap) hhv.f19803a.f19754i.f26799b);
    }
}
