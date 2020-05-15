package p000;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.internal.OnEventResponse;
import java.util.ArrayList;
import java.util.List;

/* renamed from: utb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class utb extends utq {

    /* renamed from: a */
    public static final sbw f48626a = new sbw("EventCallback", "");

    /* renamed from: b */
    public final List f48627b = new ArrayList();

    /* renamed from: c */
    private final int f48628c = 3;

    /* renamed from: d */
    private final uqa f48629d;

    /* renamed from: e */
    private final uta f48630e;

    public utb(Looper looper, Context context, uqa uqa) {
        this.f48629d = uqa;
        this.f48630e = new uta(looper, context);
    }

    /* renamed from: a */
    public final void mo27248a(OnEventResponse onEventResponse) {
        boolean z;
        DriveEvent a = onEventResponse.mo18206a();
        if (this.f48628c == a.mo18144a()) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        sdo.m34970a(this.f48627b.contains(Integer.valueOf(a.mo18144a())));
        uta uta = this.f48630e;
        uta.sendMessage(uta.obtainMessage(1, new Pair(this.f48629d, a)));
    }
}
