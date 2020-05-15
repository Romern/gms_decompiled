package p000;

import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: qbf */
final /* synthetic */ class qbf implements Runnable {

    /* renamed from: a */
    private final qbn f40862a;

    public qbf(qbn qbn) {
        this.f40862a = qbn;
    }

    public final void run() {
        qbn qbn = this.f40862a;
        if (!ccxs.f180178a.mo6606a().mo77001i() && qay.m31785b(qbn.getContext()).getBoolean("CAST_SCREEN_SHOW_WARNING_DIALOG", true)) {
            Toast.makeText(qbn.getContext(), qbn.getContext().getResources().getString(C0126R.string.cast_screen_unapproved_device_warning), 1).show();
            qay.m31785b(qbn.getContext()).edit().putBoolean("CAST_SCREEN_SHOW_WARNING_DIALOG", false).apply();
        }
    }
}
