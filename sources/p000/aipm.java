package p000;

import android.bluetooth.BluetoothSocket;
import java.io.IOException;

/* renamed from: aipm */
public final /* synthetic */ class aipm implements Runnable {

    /* renamed from: a */
    private final aipr f69441a;

    public aipm(aipr aipr) {
        this.f69441a = aipr;
    }

    public final void run() {
        aipr aipr = this.f69441a;
        while (true) {
            try {
                BluetoothSocket accept = aipr.f69451d.accept();
                if (accept == null) {
                    bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                    bnsl.mo68432a("aipr", "b", 108, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed! Got null incoming L2CAP socket.");
                } else {
                    aipr.mo37826a(accept);
                    aipr.f69449b.execute(new aipn(aipr, accept));
                }
            } catch (IOException e) {
                return;
            }
        }
    }
}
