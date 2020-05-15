package p000;

import android.os.SystemClock;
import java.util.UUID;

/* renamed from: bcif */
final /* synthetic */ class bcif implements bqeh {

    /* renamed from: a */
    private final UUID f104203a;

    /* renamed from: b */
    private final bqgy f104204b;

    /* renamed from: c */
    private final bcnl f104205c;

    /* renamed from: d */
    private final bqgg f104206d;

    public bcif(UUID uuid, bqgy bqgy, bcnl bcnl, bqgg bqgg) {
        this.f104203a = uuid;
        this.f104204b = bqgy;
        this.f104205c = bcnl;
        this.f104206d = bqgg;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        UUID uuid = this.f104203a;
        bqgy bqgy = this.f104204b;
        bcnl bcnl = this.f104205c;
        bqgg bqgg = this.f104206d;
        String valueOf = String.valueOf(uuid);
        String simpleName = obj.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(simpleName).length());
        sb.append("request(requestId=");
        sb.append(valueOf);
        sb.append("): ");
        sb.append(simpleName);
        bbos.m88291b("Backend", sb.toString());
        String valueOf2 = String.valueOf(uuid);
        String valueOf3 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21 + String.valueOf(valueOf3).length());
        sb2.append("request(requestId=");
        sb2.append(valueOf2);
        sb2.append("): ");
        sb2.append(valueOf3);
        bbos.m88289a("Backend", sb2.toString());
        bqgy.mo69138b(Long.valueOf(SystemClock.elapsedRealtime()));
        return bcnl.mo56978a(bqdx.m112673a(bqgg, bciy.f104265a, bqfb.INSTANCE), obj);
    }
}
