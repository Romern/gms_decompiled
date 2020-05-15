package p000;

import com.google.android.chimera.config.ModuleManager;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: qmf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qmf extends ModuleManager.FeatureRequestProgressListener {

    /* renamed from: a */
    public final ArrayBlockingQueue f41698a = new ArrayBlockingQueue(1);

    public final void onRequestComplete(int i) {
        this.f41698a.add(Integer.valueOf(i));
    }
}
