package p000;

import android.app.PendingIntent;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;

/* renamed from: ajcw */
final /* synthetic */ class ajcw implements ajdf {

    /* renamed from: a */
    private final PendingIntent f70366a;

    /* renamed from: b */
    private final ajdh f70367b;

    /* renamed from: c */
    private final aiym f70368c;

    public ajcw(PendingIntent pendingIntent, ajdh ajdh, aiym aiym) {
        this.f70366a = pendingIntent;
        this.f70367b = ajdh;
        this.f70368c = aiym;
    }

    /* renamed from: a */
    public final void mo38504a(ajct ajct, rod rod) {
        PendingIntent pendingIntent = this.f70366a;
        ajdh ajdh = this.f70367b;
        aiym aiym = this.f70368c;
        ((ajcj) ajct.mo25289B()).mo38486a(new SubscribeRequest(null, aiym.f70075a, new ajcf(rod), aiym.f70076b, pendingIntent, null, ajdh, aiym.f70078d, aiym.f70079e, ajct.f70359b.f80726e));
    }
}
