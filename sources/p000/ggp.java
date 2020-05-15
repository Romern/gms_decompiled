package p000;

import com.google.android.gms.audit.LogAuditRecordsRequest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ggp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ggp {

    /* renamed from: a */
    public int f18142a;

    /* renamed from: b */
    public int f18143b;

    /* renamed from: c */
    public String f18144c;

    /* renamed from: d */
    public byte[] f18145d;

    /* renamed from: e */
    private final List f18146e = new ArrayList();

    /* renamed from: a */
    public final LogAuditRecordsRequest mo11799a() {
        int i = this.f18142a;
        if (i != 1 && i != 2) {
            throw new IllegalStateException("Invalid WriteMode.");
        } else if (!this.f18146e.isEmpty()) {
            int i2 = this.f18143b;
            if (i2 != 0) {
                return new LogAuditRecordsRequest(this.f18142a, i2, this.f18144c, (byte[][]) this.f18146e.toArray(new byte[0][]), null, this.f18145d);
            }
            throw new IllegalStateException("Invalid componentId.");
        } else {
            throw new IllegalStateException("Must specify at least one audit record.");
        }
    }

    /* renamed from: a */
    public final void mo11800a(byte[] bArr) {
        this.f18146e.add(bArr);
    }
}
