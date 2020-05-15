package p000;

import android.content.Context;
import android.os.Message;
import com.felicanetworks.mfc.C0126R;
import com.google.android.location.settings.LocationHistorySettingsChimeraActivity;

/* renamed from: bhai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhai extends adzt {

    /* renamed from: a */
    final /* synthetic */ Context f118193a;

    /* renamed from: b */
    final /* synthetic */ LocationHistorySettingsChimeraActivity f118194b;

    public bhai(LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity, Context context) {
        this.f118194b = locationHistorySettingsChimeraActivity;
        this.f118193a = context;
    }

    public final void handleMessage(Message message) {
        LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity;
        int i;
        String str;
        this.f118194b.f150923f.setText((int) C0126R.string.location_settings_delete_location_history);
        this.f118194b.f150923f.setEnabled(true);
        int i2 = message.what;
        if (i2 != 1) {
            if (i2 == 2) {
                locationHistorySettingsChimeraActivity = this.f118194b;
                i = C0126R.string.location_settings_delete_auth_error;
                str = "DeleteAuthErrorDialog";
            } else if (ssk.m36235a(this.f118193a)) {
                locationHistorySettingsChimeraActivity = this.f118194b;
                i = C0126R.string.common_network_unavailable;
                str = "DeleteIOErrorDialog";
            } else {
                locationHistorySettingsChimeraActivity = this.f118194b;
                i = C0126R.string.common_no_network;
                str = "DeleteOfflineErrorDialog";
            }
            locationHistorySettingsChimeraActivity.mo70941a(i, str);
        }
    }
}
