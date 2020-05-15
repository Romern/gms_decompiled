package p000;

import android.content.Context;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: pvr */
final /* synthetic */ class pvr implements Runnable {

    /* renamed from: a */
    private final pvt f40392a;

    /* renamed from: b */
    private final String f40393b;

    public pvr(pvt pvt, String str) {
        this.f40392a = pvt;
        this.f40393b = str;
    }

    public final void run() {
        pvt pvt = this.f40392a;
        String str = this.f40393b;
        Context context = pvt.f40397a;
        Toast.makeText(context, context.getResources().getString(C0126R.string.cast_nearby_connect_toast, str), 1).show();
    }
}
