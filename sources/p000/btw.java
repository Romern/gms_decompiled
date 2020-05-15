package p000;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: btw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btw implements bwv {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo3421a(JSONObject jSONObject) {
        btx btx = new btx();
        byte[] a = bpu.m3478a(jSONObject, "key");
        byte[] bArr = btx.f5592b;
        if (bArr != a) {
            Arrays.fill(bArr, (byte) 0);
        }
        btx.f5592b = a;
        btx.f5591a = bpu.m3478a(jSONObject, "atc");
        return btx;
    }
}
