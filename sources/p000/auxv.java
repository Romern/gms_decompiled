package p000;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.google.android.gms.trustlet.place.p076ui.TrustedPlacesSettingsChimeraActivity;

/* renamed from: auxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class auxv extends Dialog {

    /* renamed from: a */
    protected final TrustedPlacesSettingsChimeraActivity f92753a;

    /* renamed from: b */
    protected final auyk f92754b;

    public auxv(Context context) {
        super(context);
        TrustedPlacesSettingsChimeraActivity trustedPlacesSettingsChimeraActivity = (TrustedPlacesSettingsChimeraActivity) context;
        this.f92753a = trustedPlacesSettingsChimeraActivity;
        this.f92754b = (auyk) trustedPlacesSettingsChimeraActivity.getSupportFragmentManager().findFragmentById(16908290);
    }

    public final void show() {
        Window window = getWindow();
        window.getAttributes().gravity = 80;
        window.getAttributes().width = -1;
        window.getAttributes().height = -2;
        window.getAttributes().dimAmount = 0.3f;
        window.setBackgroundDrawable(new ColorDrawable(0));
        setCanceledOnTouchOutside(true);
        super.show();
    }
}
