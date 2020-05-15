package p000;

import android.accounts.Account;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.CredentialsSettingsChimeraActivity;

/* renamed from: htt */
final /* synthetic */ class htt implements View.OnClickListener {

    /* renamed from: a */
    private final CredentialsSettingsChimeraActivity f20417a;

    /* renamed from: b */
    private final String f20418b;

    public htt(CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity, String str) {
        this.f20417a = credentialsSettingsChimeraActivity;
        this.f20418b = str;
    }

    public void onClick(View view) {
        CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity = this.f20417a;
        String str = this.f20418b;
        C1240of a = credentialsSettingsChimeraActivity.mo7440a(str);
        CharSequence charSequence = (CharSequence) a.f26798a;
        Drawable drawable = (Drawable) a.f26799b;
        Spanned fromHtml = Html.fromHtml(String.format(credentialsSettingsChimeraActivity.getResources().getString(C0126R.string.credentials_pref_never_save_remove_ask), charSequence));
        Account account = credentialsSettingsChimeraActivity.f10188i;
        sdo.m34959a(account);
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(credentialsSettingsChimeraActivity).setMessage(fromHtml).setPositiveButton(17039370, new htm(credentialsSettingsChimeraActivity, str, account)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        if (drawable != null) {
            negativeButton.setIcon(drawable);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            negativeButton.setTitle(charSequence);
        }
        negativeButton.show();
        his.m14426a().mo12510a(CredentialsSettingsChimeraActivity.m6382a(506));
    }
}
