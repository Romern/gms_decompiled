package p000;

import android.os.ParcelFileDescriptor;
import java.io.DataOutput;
import java.io.DataOutputStream;

/* renamed from: asck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asck {

    /* renamed from: a */
    public static final sek f88701a = ascp.m73787a("D2D", "PipeWriteManager");

    /* renamed from: b */
    private final DataOutput f88702b;

    /* renamed from: c */
    private final bqgj f88703c = bqgs.m112811a(adzl.f62962b.mo25879b(1));

    public asck(ParcelFileDescriptor parcelFileDescriptor) {
        this.f88702b = new DataOutputStream(new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor));
    }

    /* renamed from: a */
    public final bqgg mo49042a(byte[] bArr) {
        return this.f88703c.mo25819b(new ascj(this.f88702b, bArr));
    }
}
