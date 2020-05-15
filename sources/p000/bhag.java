package p000;

import android.app.AlertDialog;
import android.os.Build;
import android.text.Html;
import android.text.style.ClickableSpan;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.location.settings.LocationHistorySettingsChimeraActivity;

/* renamed from: bhag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhag extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ LocationHistorySettingsChimeraActivity f118191a;

    public bhag(LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity) {
        this.f118191a = locationHistorySettingsChimeraActivity;
    }

    public void onClick(View view) {
        LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity = this.f118191a;
        String i = locationHistorySettingsChimeraActivity.mo70943i();
        AlertDialog.Builder builder = new AlertDialog.Builder(locationHistorySettingsChimeraActivity.getContainerActivity(), C0126R.style.AlertThemeSelector);
        builder.setTitle(locationHistorySettingsChimeraActivity.getResources().getString(C0126R.string.common_learn_more)).setPositiveButton(locationHistorySettingsChimeraActivity.getString(17039370), new bham());
        int i2 = Build.VERSION.SDK_INT;
        builder.setMessage(Html.fromHtml(i, 0));
        builder.create().show();
    }
}
