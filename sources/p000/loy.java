package p000;

import android.app.ProgressDialog;

/* renamed from: loy */
final /* synthetic */ class loy implements Runnable {

    /* renamed from: a */
    private final ProgressDialog f26520a;

    public loy(ProgressDialog progressDialog) {
        this.f26520a = progressDialog;
    }

    public final void run() {
        this.f26520a.dismiss();
    }
}
