package p000;

import android.content.DialogInterface;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: ajpt */
final /* synthetic */ class ajpt implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    private final SettingsChimeraActivity f71127a;

    public ajpt(SettingsChimeraActivity settingsChimeraActivity) {
        this.f71127a = settingsChimeraActivity;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f71127a.f80970i = null;
    }
}
