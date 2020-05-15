package p000;

import android.util.Log;

/* renamed from: vqc */
final /* synthetic */ class vqc implements aubt {

    /* renamed from: a */
    static final aubt f49786a = new vqc();

    private vqc() {
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        String valueOf = String.valueOf(exc.getMessage());
        Log.i("CAR.DRIVINGMODE", valueOf.length() == 0 ? new String("Failed to register transition listener: ") : "Failed to register transition listener: ".concat(valueOf));
    }
}
