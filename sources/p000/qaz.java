package p000;

import com.android.media.remotedisplay.RemoteDisplay;
import java.util.ArrayList;

/* renamed from: qaz */
final /* synthetic */ class qaz implements Runnable {

    /* renamed from: a */
    private final qbn f40850a;

    public qaz(qbn qbn) {
        this.f40850a = qbn;
    }

    public final void run() {
        qbn qbn = this.f40850a;
        qbn.f40876a.mo23673b("onDiscoveryModeChanged removing all remote displays", new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (RemoteDisplay remoteDisplay : qbn.getDisplays()) {
            if (!(remoteDisplay == null || remoteDisplay.getStatus() == 3 || remoteDisplay.getStatus() == 4)) {
                arrayList.add(remoteDisplay);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qbn.removeDisplay((RemoteDisplay) arrayList.get(i));
        }
    }
}
