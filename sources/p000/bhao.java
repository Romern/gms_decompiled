package p000;

import android.app.AlertDialog;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.location.settings.LocationSettingsCheckerChimeraActivity;
import java.util.List;

/* renamed from: bhao */
public final /* synthetic */ class bhao implements Runnable {

    /* renamed from: a */
    private final LocationSettingsCheckerChimeraActivity f118201a;

    /* renamed from: b */
    private final List f118202b;

    public bhao(LocationSettingsCheckerChimeraActivity locationSettingsCheckerChimeraActivity, List list) {
        this.f118201a = locationSettingsCheckerChimeraActivity;
        this.f118202b = list;
    }

    public final void run() {
        LocationSettingsCheckerChimeraActivity locationSettingsCheckerChimeraActivity = this.f118201a;
        List list = this.f118202b;
        if (!locationSettingsCheckerChimeraActivity.isFinishing()) {
            locationSettingsCheckerChimeraActivity.f150937d.clear();
            locationSettingsCheckerChimeraActivity.f150937d.add(-1);
            locationSettingsCheckerChimeraActivity.f150937d.add(Integer.valueOf((int) C0126R.string.location_settings_dialog_positive_button));
            locationSettingsCheckerChimeraActivity.f150937d.add(Integer.valueOf((int) C0126R.string.common_no_thanks));
            AlertDialog.Builder builder = new AlertDialog.Builder(locationSettingsCheckerChimeraActivity);
            Resources resources = locationSettingsCheckerChimeraActivity.getResources();
            builder.setOnCancelListener(locationSettingsCheckerChimeraActivity);
            View inflate = locationSettingsCheckerChimeraActivity.getLayoutInflater().inflate((int) C0126R.C0128layout.location_settings_dialog, (ViewGroup) null);
            LocationSettingsCheckerChimeraActivity.m117378a(inflate);
            TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.message);
            int i = !locationSettingsCheckerChimeraActivity.f150935b ? C0126R.string.location_settings_dialog_message_title_for_better_experience : C0126R.string.location_settings_dialog_message_title_to_continue;
            locationSettingsCheckerChimeraActivity.f150937d.add(Integer.valueOf(i));
            SpannableString spannableString = new SpannableString(String.valueOf(locationSettingsCheckerChimeraActivity.getString(i)).concat(" "));
            Drawable drawable = resources.getDrawable(C0126R.C0127drawable.quantum_ic_keyboard_arrow_down_grey600_18);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            ImageSpan imageSpan = new ImageSpan(drawable, 0);
            C1173lt.m19599a(imageSpan.getDrawable(), C1133kh.m17843b(locationSettingsCheckerChimeraActivity, C0126R.color.location_settings_dialog_key_down_arrow));
            spannableString.setSpan(imageSpan, spannableString.length() - 1, spannableString.length(), 33);
            textView.setText(spannableString);
            sre.m36087g(locationSettingsCheckerChimeraActivity);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0126R.C0129id.messages);
            if (locationSettingsCheckerChimeraActivity.f150936c) {
                locationSettingsCheckerChimeraActivity.mo70948a(spannableString, imageSpan, textView, linearLayout, list);
                LocationSettingsCheckerChimeraActivity.m117378a(inflate);
            } else {
                textView.setOnClickListener(new bhaq(locationSettingsCheckerChimeraActivity, spannableString, imageSpan, textView, linearLayout, list, inflate));
            }
            builder.setPositiveButton((int) C0126R.string.location_settings_dialog_positive_button, locationSettingsCheckerChimeraActivity);
            builder.setNegativeButton((int) C0126R.string.common_no_thanks, locationSettingsCheckerChimeraActivity);
            AlertDialog create = builder.create();
            create.setView(inflate, 0, 0, 0, 0);
            create.setCanceledOnTouchOutside(false);
            locationSettingsCheckerChimeraActivity.f150934a = SystemClock.elapsedRealtime();
            create.show();
            locationSettingsCheckerChimeraActivity.mo70949a("show_dialog");
        }
    }
}
