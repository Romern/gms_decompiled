package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: aitj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aitj {

    /* renamed from: b */
    private static final int f69696b = ((int) cfnv.m140744F());

    /* renamed from: c */
    private static chtv f69697c;

    /* renamed from: a */
    protected final shl f69698a;

    public aitj(shl shl) {
        this.f69698a = shl;
    }

    /* renamed from: a */
    public final cbke mo37997a(ClientContext clientContext, cbkd cbkd) {
        if (f69697c == null) {
            f69697c = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.PeerToPeer/GetICEServer", ciie.m150370a(cbkd.f177393c), ciie.m150370a(cbke.f177397b));
        }
        return (cbke) this.f69698a.mo25553a(f69697c, clientContext, cbkd, (long) f69696b, TimeUnit.MILLISECONDS);
    }
}
