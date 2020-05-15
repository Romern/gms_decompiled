package p000;

import android.accounts.AccountManagerCallback;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.google.android.location.settings.LocationHistorySettingsChimeraActivity;

/* renamed from: bhak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhak implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ LocationHistorySettingsChimeraActivity f118196a;

    public bhak(LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity) {
        this.f118196a = locationHistorySettingsChimeraActivity;
    }

    public void onClick(View view) {
        adyd a = adyd.m51363a(this.f118196a);
        LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity = this.f118196a;
        a.mo33909a(locationHistorySettingsChimeraActivity.f118186d, (Bundle) null, locationHistorySettingsChimeraActivity.getContainerActivity(), (AccountManagerCallback) null, (Handler) null);
    }
}
