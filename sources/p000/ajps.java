package p000;

import android.content.DialogInterface;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: ajps */
final /* synthetic */ class ajps implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    private final SettingsChimeraActivity f71126a;

    public ajps(SettingsChimeraActivity settingsChimeraActivity) {
        this.f71126a = settingsChimeraActivity;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f71126a.f80974m = null;
    }
}
