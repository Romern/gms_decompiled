package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.backup.settings.component.BackupOptInChimeraActivity;

/* renamed from: mum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mum extends DialogFragment {

    /* renamed from: a */
    public BackupOptInChimeraActivity f34776a;

    /* renamed from: a */
    public static bsqh m25646a() {
        boolean booleanValue = ((Boolean) BackupOptInChimeraActivity.f29065a.mo6606a()).booleanValue();
        Integer valueOf = Integer.valueOf((int) C0126R.string.backup_opt_in_backup_main_message_no_branding);
        Integer valueOf2 = Integer.valueOf((int) C0126R.string.backup_opt_in_backup_no_quota);
        Integer valueOf3 = Integer.valueOf((int) C0126R.string.backup_opt_in_backup_main_message);
        Integer valueOf4 = Integer.valueOf((int) C0126R.string.close_button_label);
        Integer valueOf5 = Integer.valueOf((int) C0126R.string.common_privacy_policy_composed_string);
        if (booleanValue) {
            if (((Boolean) BackupOptInChimeraActivity.f29066b.mo6606a()).booleanValue()) {
                return BackupOptInChimeraActivity.m21915a(bngx.m109358a(Integer.valueOf((int) C0126R.string.f7392x49d8e471), valueOf, valueOf5), valueOf4);
            }
            return BackupOptInChimeraActivity.m21915a(bngx.m109359a(Integer.valueOf((int) C0126R.string.f7391x9e2dd3ba), valueOf3, valueOf2, valueOf5), valueOf4);
        } else if (((Boolean) BackupOptInChimeraActivity.f29066b.mo6606a()).booleanValue()) {
            return BackupOptInChimeraActivity.m21915a(bngx.m109360a(Integer.valueOf((int) C0126R.string.f7394x7ffae8b8), valueOf, Integer.valueOf((int) C0126R.string.backup_opt_in_backup_photos_sync), Integer.valueOf((int) C0126R.string.backup_opt_in_backup_photos_no_quota), valueOf5), valueOf4);
        } else {
            return BackupOptInChimeraActivity.m21915a(bngx.m109361a(Integer.valueOf((int) C0126R.string.f7393xbf539393), valueOf3, Integer.valueOf((int) C0126R.string.backup_opt_in_backup_photos_sync), Integer.valueOf((int) C0126R.string.backup_opt_in_backup_photos_no_quota), valueOf2, valueOf5), valueOf4);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder a = mba.m24785a(getActivity());
        bsqh a2 = m25646a();
        bsqq bsqq = a2.f146639d;
        if (bsqq == null) {
            bsqq = bsqq.f146675b;
        }
        int size = bsqq.f146677a.size();
        Resources resources = getResources();
        bsqq bsqq2 = a2.f146639d;
        if (bsqq2 == null) {
            bsqq2 = bsqq.f146675b;
        }
        Spanned fromHtml = Html.fromHtml(String.format("<a href=\"https://www.google.com/policies/privacy/\">%s</a>", resources.getString(bsqq2.f146677a.mo74151b(size - 1))));
        bsqq bsqq3 = a2.f146639d;
        if (bsqq3 == null) {
            bsqq3 = bsqq.f146675b;
        }
        int size2 = bsqq3.f146677a.size() - 1;
        String[] strArr = new String[size2];
        int i = 0;
        while (i < size2) {
            Resources resources2 = getResources();
            bsqq bsqq4 = a2.f146639d;
            if (bsqq4 == null) {
                bsqq4 = bsqq.f146675b;
            }
            int i2 = i + 1;
            strArr[i] = resources2.getString(bsqq4.f146677a.mo74151b(i2));
            i = i2;
        }
        Resources resources3 = getResources();
        bsqq bsqq5 = a2.f146639d;
        if (bsqq5 == null) {
            bsqq5 = bsqq.f146675b;
        }
        AlertDialog.Builder message = a.setMessage(TextUtils.expandTemplate(resources3.getString(bsqq5.f146677a.mo74151b(0), (Object[]) strArr), fromHtml));
        bsqq bsqq6 = m25646a().f146641f;
        if (bsqq6 == null) {
            bsqq6 = bsqq.f146675b;
        }
        return message.setNegativeButton(bsqq6.f146677a.mo74151b(0), mul.f34775a).create();
    }

    public final void onStart() {
        super.onStart();
        ((TextView) getDialog().findViewById(16908299)).setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void show(FragmentManager fragmentManager, String str) {
        if (fragmentManager.findFragmentByTag(str) == null) {
            this.f34776a.f29067c = true;
            super.show(fragmentManager, str);
        }
    }
}
