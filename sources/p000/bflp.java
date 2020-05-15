package p000;

import android.util.Log;

/* renamed from: bflp */
final /* synthetic */ class bflp implements bugt {

    /* renamed from: a */
    static final bugt f114358a = new bflp();

    private bflp() {
    }

    /* renamed from: a */
    public final void mo61879a(int i) {
        if (i != 0 && i != 1 && Log.isLoggable("WifiConnectionHelperNyc", 6)) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Error sending notification to nanoapp: ");
            sb.append(i);
            Log.e("WifiConnectionHelperNyc", sb.toString());
        }
    }
}
