package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.WeakHashMap;

/* renamed from: aovl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aovl extends aaab {

    /* renamed from: a */
    private final aosv f83684a;

    /* renamed from: b */
    private final String f83685b;

    public aovl(aosv aosv, String str) {
        super(18, "ClearListeners");
        this.f83684a = aosv;
        this.f83685b = str;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        new Object[1][0] = this;
        aovd a = aovd.m69610a();
        aosv aosv = this.f83684a;
        String str = this.f83685b;
        synchronized (a.f83664a) {
            if (a.f83665b.containsKey(str)) {
                ((WeakHashMap) a.f83665b.get(str)).remove(aosv);
            }
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
    }
}
