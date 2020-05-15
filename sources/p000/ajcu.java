package p000;

import android.os.IBinder;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import java.lang.ref.WeakReference;

/* renamed from: ajcu */
final /* synthetic */ class ajcu implements ajdf {

    /* renamed from: a */
    private final ajdi f70361a;

    /* renamed from: b */
    private final rod f70362b;

    /* renamed from: c */
    private final ajdh f70363c;

    /* renamed from: d */
    private final aiym f70364d;

    public ajcu(ajdi ajdi, rod rod, ajdh ajdh, aiym aiym) {
        this.f70361a = ajdi;
        this.f70362b = rod;
        this.f70363c = ajdh;
        this.f70364d = aiym;
    }

    /* renamed from: a */
    public final void mo38504a(ajct ajct, rod rod) {
        ajdi ajdi = this.f70361a;
        rod rod2 = this.f70362b;
        ajdh ajdh = this.f70363c;
        aiym aiym = this.f70364d;
        int i = ajdi.f70386a;
        rob rob = rod2.f43429b;
        if (rob != null) {
            if (!ajct.f70358a.mo38536a(rob)) {
                ajct.f70358a.f70409a.put(rob, new WeakReference(new ajcc(rod2)));
            }
            ((ajcj) ajct.mo25289B()).mo38486a(new SubscribeRequest((IBinder) ajct.f70358a.mo38537b(rob), aiym.f70075a, new ajcf(rod), aiym.f70076b, null, ajdh, aiym.f70078d, i));
        }
    }
}
