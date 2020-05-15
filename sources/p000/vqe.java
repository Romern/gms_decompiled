package p000;

import android.util.Log;

/* renamed from: vqe */
final /* synthetic */ class vqe implements aubt {

    /* renamed from: a */
    static final aubt f49788a = new vqe();

    private vqe() {
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        String valueOf = String.valueOf(exc.getMessage());
        Log.i("CAR.DRIVINGMODE", valueOf.length() == 0 ? new String("Failed to unregister transition listener: ") : "Failed to unregister transition listener: ".concat(valueOf));
    }
}
