package p000;

import android.content.Context;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: pxp */
final /* synthetic */ class pxp implements Runnable {

    /* renamed from: a */
    private final pyf f40577a;

    /* renamed from: b */
    private final String f40578b;

    public pxp(pyf pyf, String str) {
        this.f40577a = pyf;
        this.f40578b = str;
    }

    public final void run() {
        pyf pyf = this.f40577a;
        String str = this.f40578b;
        Context context = pyf.f40620b;
        Toast.makeText(context, context.getResources().getString(C0126R.string.volume_change_not_supported_toast_message, str), 1).show();
    }
}
