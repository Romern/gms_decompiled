package p000;

import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: axvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axvj extends axvn {

    /* renamed from: a */
    final /* synthetic */ axvk f96479a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axvj(axvk axvk) {
        super(axvk.f96480a);
        this.f96479a = axvk;
    }

    /* renamed from: a */
    public final void mo53610a() {
        if (Log.isLoggable("ChannelManager", 2)) {
            Log.v("ChannelManager", "Running onConnectedNodes");
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (ayac ayac : this.f96479a.f96480a.f96498e.mo53786b()) {
            if (ayac.f96885b < Integer.MAX_VALUE) {
                hashSet.add(ayac.f96884a.f96814a);
            }
            if (ayac.f96887d) {
                hashSet2.add(ayac.f96884a.f96814a);
            }
        }
        hashSet.add(this.f96479a.f96480a.f96498e.mo53784a().f96814a);
        Iterator it = this.f96479a.f96480a.f96497d.mo53630a().iterator();
        while (it.hasNext()) {
            axvx axvx = (axvx) it.next();
            boolean contains = hashSet.contains(axvx.f96513a.f96539a);
            boolean contains2 = hashSet2.contains(axvx.f96513a.f96539a);
            if (!contains || (contains2 && !axvx.f96514b)) {
                it.remove();
                this.f96486g = axvx;
                try {
                    axvx.mo53634a();
                } catch (axvv e) {
                }
                axvx.mo53650g();
            }
        }
    }
}
