package p000;

import android.widget.CompoundButton;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: ajpc */
public final /* synthetic */ class ajpc implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private final SettingsChimeraActivity f71083a;

    public ajpc(SettingsChimeraActivity settingsChimeraActivity) {
        this.f71083a = settingsChimeraActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f71083a.f80963b.mo38905b(z);
    }
}
