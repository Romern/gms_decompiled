package p000;

import android.content.Context;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: pyg */
final /* synthetic */ class pyg implements Runnable {

    /* renamed from: a */
    private final pyx f40632a;

    /* renamed from: b */
    private final String f40633b;

    public pyg(pyx pyx, String str) {
        this.f40632a = pyx;
        this.f40633b = str;
    }

    public final void run() {
        pyx pyx = this.f40632a;
        String str = this.f40633b;
        Context context = pyx.f40682b;
        Toast.makeText(context, context.getResources().getString(C0126R.string.volume_change_not_supported_toast_message, str), 1).show();
    }
}
