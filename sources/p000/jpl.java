package p000;

import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.firstparty.SecureChannelSubscription;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: jpl */
public final /* synthetic */ class jpl implements Callable {

    /* renamed from: a */
    private final jpo f22980a;

    public jpl(jpo jpo) {
        this.f22980a = jpo;
    }

    public final Object call() {
        jpo jpo = this.f22980a;
        new ArrayList();
        try {
            List<SecureChannelSubscription> list = (List) jpo.f22992c.mo14004b().get();
            jpo.f22993d.set(true);
            for (SecureChannelSubscription secureChannelSubscription : list) {
                Role role = new Role(secureChannelSubscription.f11179b, secureChannelSubscription.f11180c);
                List b = secureChannelSubscription.mo7802b();
                int size = b.size();
                for (int i = 0; i < size; i++) {
                    jpo.f22991b.mo13904a((RemoteDevice) b.get(i), role);
                }
                jpo.f22994e.incrementAndGet();
            }
            return Status.f30107a;
        } catch (InterruptedException | ExecutionException e) {
            jpo.f22993d.set(true);
            return Status.f30108b;
        }
    }
}
