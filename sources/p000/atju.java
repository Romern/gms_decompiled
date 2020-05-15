package p000;

import android.content.Context;
import android.widget.Toast;

/* renamed from: atju */
final /* synthetic */ class atju implements Runnable {

    /* renamed from: a */
    private final Context f90401a;

    /* renamed from: b */
    private final btnf f90402b;

    public atju(Context context, btnf btnf) {
        this.f90401a = context;
        this.f90402b = btnf;
    }

    public final void run() {
        Context context = this.f90401a;
        btnf btnf = this.f90402b;
        int i = atjv.f90403a;
        Toast.makeText(context, btnf.f149604c, 0).show();
    }
}
