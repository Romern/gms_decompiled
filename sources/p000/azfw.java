package p000;

import com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: azfw */
final /* synthetic */ class azfw implements bdaq {

    /* renamed from: a */
    private final SilentRegisterIntentOperation f99251a;

    /* renamed from: b */
    private final List f99252b;

    public azfw(SilentRegisterIntentOperation silentRegisterIntentOperation, List list) {
        this.f99251a = silentRegisterIntentOperation;
        this.f99252b = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0054, code lost:
        r3 = r5;
     */
    /* renamed from: a */
    public final void mo54573a(Object obj) {
        SilentRegisterIntentOperation silentRegisterIntentOperation = this.f99251a;
        List list = this.f99252b;
        bdau bdau = (bdau) obj;
        int size = list.size();
        int i = 0;
        while (i < size) {
            bnre i2 = ((bngx) bdau.mo57835a((bdar) list.get(i))).listIterator();
            while (true) {
                int i3 = i + 1;
                if (!i2.hasNext()) {
                    break;
                } else if (System.currentTimeMillis() - TimeUnit.MICROSECONDS.toMillis(((bctr) i2.next()).mo57362d().longValue()) < cfgs.m139390J()) {
                    azph.m85998a(silentRegisterIntentOperation.f111106c).mo55126a(1967, 70);
                    return;
                }
            }
        }
        silentRegisterIntentOperation.mo60382a();
    }
}
