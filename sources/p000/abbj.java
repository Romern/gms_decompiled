package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.Calendar;

/* renamed from: abbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abbj extends DialogFragment {

    /* renamed from: a */
    private final long f56988a = 1587020400000L;

    /* renamed from: b */
    private View f56989b;

    public final Dialog onCreateDialog(Bundle bundle) {
        String str;
        HelpChimeraActivity helpChimeraActivity = (HelpChimeraActivity) getActivity();
        View inflate = helpChimeraActivity.getLayoutInflater().inflate((int) C0126R.C0128layout.gh_version_dialog, (ViewGroup) null);
        this.f56989b = inflate;
        ImageView imageView = (ImageView) inflate.findViewById(C0126R.C0129id.gh_application_logo);
        TextView textView = (TextView) this.f56989b.findViewById(C0126R.C0129id.gh_application_title);
        TextView textView2 = (TextView) this.f56989b.findViewById(C0126R.C0129id.gh_application_version);
        String str2 = helpChimeraActivity.f56986y.f78827b;
        PackageManager packageManager = helpChimeraActivity.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str2, 0);
            imageView.setImageDrawable(packageManager.getApplicationIcon(applicationInfo));
            textView.setText(packageManager.getApplicationLabel(applicationInfo));
            PackageInfo packageInfo = packageManager.getPackageInfo(str2, 0);
            if (TextUtils.isEmpty(packageInfo.versionName) || !Character.isDigit(packageInfo.versionName.charAt(0))) {
                str = packageInfo.versionName;
            } else {
                str = helpChimeraActivity.getString(C0126R.string.gh_subtitle_format_for_version_number, new Object[]{packageInfo.versionName});
            }
            textView2.setText(str);
        } catch (PackageManager.NameNotFoundException e) {
        }
        View view = this.f56989b;
        Calendar a = sqn.m35983a();
        int i = a.get(1);
        a.setTimeInMillis(this.f56988a);
        ((TextView) view.findViewById(C0126R.C0129id.gh_application_copyright)).setText(getString(C0126R.string.gh_copyright, Integer.valueOf(Math.max(a.get(1), i))));
        return new AlertDialog.Builder(helpChimeraActivity).setView(this.f56989b).create();
    }
}
