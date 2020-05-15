package p000;

import android.content.Context;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: pvs */
final /* synthetic */ class pvs implements Runnable {

    /* renamed from: a */
    private final Context f40394a;

    public pvs(Context context) {
        this.f40394a = context;
    }

    public final void run() {
        Context context = this.f40394a;
        int i = pvt.f40395d;
        Toast.makeText(context, context.getResources().getString(C0126R.string.cast_nearby_failed_connect_toast), 1).show();
    }
}
