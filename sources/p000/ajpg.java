package p000;

import android.content.DialogInterface;
import android.widget.EditText;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: ajpg */
public final /* synthetic */ class ajpg implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final SettingsChimeraActivity f71088a;

    /* renamed from: b */
    private final EditText f71089b;

    public ajpg(SettingsChimeraActivity settingsChimeraActivity, EditText editText) {
        this.f71088a = settingsChimeraActivity;
        this.f71089b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f71088a.mo44471a(this.f71089b.getText());
    }
}
