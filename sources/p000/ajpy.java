package p000;

import android.view.View;
import com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: ajpy */
public final /* synthetic */ class ajpy implements View.OnClickListener {

    /* renamed from: a */
    private final SettingsChimeraActivity f71134a;

    public ajpy(SettingsChimeraActivity settingsChimeraActivity) {
        this.f71134a = settingsChimeraActivity;
    }

    public void onClick(View view) {
        SettingsChimeraActivity settingsChimeraActivity = this.f71134a;
        settingsChimeraActivity.startActivityForResult(ContactSelectChimeraActivity.m67446a(settingsChimeraActivity), 1002);
    }
}
