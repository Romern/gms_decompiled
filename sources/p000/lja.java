package p000;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Window;

/* renamed from: lja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lja extends lim {

    /* renamed from: d */
    private final int f26180d;

    /* renamed from: e */
    private final int f26181e;

    /* renamed from: f */
    private final int f26182f;

    public lja(lir lir, Bundle bundle, bngx bngx) {
        super(lir, bundle, bngx);
        this.f26180d = bundle.getInt("com.google.android.gms.autofill.extra.ALERT_MESSAGE");
        this.f26181e = bundle.getInt("com.google.android.gms.autofill.extra.POSITIVE_BUTTON_TEXT");
        this.f26182f = bundle.getInt("com.google.android.gms.autofill.extra.NEGATIVE_BUTTON_TEXT");
    }

    /* renamed from: a */
    public final void mo15164a() {
        int i;
        lir lir = this.f26159a;
        if (!ccip.m129866f()) {
            i = 2132019641;
        } else {
            i = 2132019637;
        }
        lir.setTheme(i);
        AlertDialog create = new AlertDialog.Builder(this.f26159a).setMessage(this.f26180d).setPositiveButton(this.f26181e, new lix(this)).setNegativeButton(this.f26182f, new liy(this)).setOnDismissListener(new liz(this)).create();
        if (create != null) {
            Window window = create.getWindow();
            if (window != null) {
                window.setGravity(80);
            }
            create.show();
        }
    }
}
