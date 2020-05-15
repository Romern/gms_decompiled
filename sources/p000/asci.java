package p000;

import android.os.ParcelFileDescriptor;
import java.io.DataInputStream;

/* renamed from: asci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asci {

    /* renamed from: a */
    public static final sek f88694a = ascp.m73787a("D2D", "PipeReadManager");

    /* renamed from: b */
    private final DataInputStream f88695b;

    /* renamed from: c */
    private final bqgj f88696c = bqgs.m112811a(adzl.f62962b.mo25879b(2));

    /* renamed from: d */
    private bqgg f88697d;

    /* renamed from: e */
    private asch f88698e;

    public asci(ParcelFileDescriptor parcelFileDescriptor) {
        this.f88695b = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    /* renamed from: a */
    public final synchronized void mo49039a() {
        bqgg bqgg = this.f88697d;
        if (bqgg != null) {
            f88694a.mo25409a("Shutting down reading thread", new Object[0]);
            asch asch = this.f88698e;
            if (asch != null) {
                asch.f88691a = true;
            }
            bqgg.cancel(true);
            this.f88697d = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo49040a(ascg ascg) {
        mo49039a();
        asch asch = new asch(ascg, this.f88695b);
        this.f88698e = asch;
        this.f88697d = this.f88696c.mo25812a(asch);
        bqga.m112781a(this.f88697d, new ascf(ascg), this.f88696c);
    }
}
