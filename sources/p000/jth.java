package p000;

import android.accounts.Account;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.auth.proximity.multidevice.SettingsChimeraActivity;

/* renamed from: jth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jth implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ SettingsChimeraActivity f23176a;

    public jth(SettingsChimeraActivity settingsChimeraActivity) {
        this.f23176a = settingsChimeraActivity;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f23176a.mo7850a(new Account(this.f23176a.f11256f.mo26114a(), "com.google"));
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
