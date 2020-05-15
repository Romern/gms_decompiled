package p000;

import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.constellation.p038ui.debug.ConstellationDebugChimeraActivity;
import java.util.Locale;

/* renamed from: tcb */
final /* synthetic */ class tcb implements aubt {

    /* renamed from: a */
    private final ConstellationDebugChimeraActivity f45630a;

    public tcb(ConstellationDebugChimeraActivity constellationDebugChimeraActivity) {
        this.f45630a = constellationDebugChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        ConstellationDebugChimeraActivity constellationDebugChimeraActivity = this.f45630a;
        constellationDebugChimeraActivity.mo17988a(true);
        ConstellationDebugChimeraActivity.f30575b.mo25417e("Failed to verify phone number via API", exc, new Object[0]);
        TextView textView = (TextView) constellationDebugChimeraActivity.findViewById(C0126R.C0129id.summary);
        Locale locale = Locale.US;
        String valueOf = String.valueOf(exc.getMessage());
        textView.setText(String.format(locale, valueOf.length() == 0 ? new String("Failed to verify phone number via API\n") : "Failed to verify phone number via API\n".concat(valueOf), new Object[0]));
    }
}
