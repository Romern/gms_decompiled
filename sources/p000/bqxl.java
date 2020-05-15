package p000;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bqxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bqxl extends bqwv {

    /* renamed from: f */
    public bqxr f141883f;

    /* renamed from: g */
    public final Map f141884g = new HashMap();

    protected bqxl(ByteBuffer byteBuffer, bqwu bqwu) {
        super(byteBuffer, bqwu);
        bmxy.m108601b(byteBuffer.getInt() > 0, "ResourceTableChunk package count was < 1.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69397a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.f141884g.size());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final bqwt mo69400h() {
        return bqwt.TABLE;
    }
}
