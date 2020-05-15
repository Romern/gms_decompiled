package p000;

import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: bqwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bqwv extends bqwu {

    /* renamed from: e */
    protected final Map f141790e = new LinkedHashMap();

    protected bqwv(ByteBuffer byteBuffer, bqwu bqwu) {
        super(byteBuffer, bqwu);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo69396a(DataOutput dataOutput, ByteBuffer byteBuffer) {
        for (bqwu bqwu : this.f141790e.values()) {
            byte[] c = bqwu.mo69399c();
            dataOutput.write(c);
            bqwu.m113573a(dataOutput, c.length);
        }
    }
}
