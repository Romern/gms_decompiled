package p000;

import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.matchstick.settings.MatchstickSettingsChimeraActivity;

/* renamed from: azjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azjk implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ MatchstickSettingsChimeraActivity f99521a;

    public azjk(MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity) {
        this.f99521a = matchstickSettingsChimeraActivity;
    }

    public void onClick(View view) {
        this.f99521a.f111148m.show();
        TextView textView = (TextView) this.f99521a.f111148m.findViewById(16908299);
        if (textView != null) {
            textView.setOnClickListener(new azjj(this));
        }
        this.f99521a.f111153r.mo55125a(258);
    }
}
