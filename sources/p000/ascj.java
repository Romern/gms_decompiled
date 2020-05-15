package p000;

import java.io.DataOutput;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* renamed from: ascj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ascj implements Callable {

    /* renamed from: a */
    private final DataOutput f88699a;

    /* renamed from: b */
    private final byte[] f88700b;

    public ascj(DataOutput dataOutput, byte[] bArr) {
        this.f88699a = dataOutput;
        this.f88700b = bArr;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Logger Logger = asck.f88701a;
        byte[] bArr = this.f88700b;
        int length = bArr.length;
        int hashCode = Arrays.hashCode(bArr);
        StringBuilder sb = new StringBuilder(47);
        sb.append("Writing ");
        sb.append(length);
        sb.append(" bytes with hash ");
        sb.append(hashCode);
        Logger.logVerbose(sb.toString(), new Object[0]);
        this.f88699a.writeInt(this.f88700b.length);
        this.f88699a.write(this.f88700b);
        return null;
    }
}
