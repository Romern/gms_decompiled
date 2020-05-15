package p000;

import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.firstparty.SecureChannelSubscription;
import java.util.Iterator;
import java.util.List;

/* renamed from: jpi */
public final /* synthetic */ class jpi implements Runnable {

    /* renamed from: a */
    private final jpo f22971a;

    public jpi(jpo jpo) {
        this.f22971a = jpo;
    }

    public final void run() {
        jpo jpo = this.f22971a;
        Iterator it = jpo.mo13981a().iterator();
        while (true) {
            if (it.hasNext()) {
                SecureChannelSubscription secureChannelSubscription = (SecureChannelSubscription) it.next();
                Role role = new Role(secureChannelSubscription.f11179b, secureChannelSubscription.f11180c);
                List b = secureChannelSubscription.mo7802b();
                int size = b.size();
                for (int i = 0; i < size; i++) {
                    jpo.f22991b.mo13905a(((RemoteDevice) b.get(i)).f11138b, role);
                }
            } else {
                jpo.f22994e.set(0);
                return;
            }
        }
    }
}
