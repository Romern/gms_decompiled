package p000;

import com.android.volley.Response;
import java.util.HashMap;

/* renamed from: bgwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgwv extends sha {

    /* renamed from: f */
    final /* synthetic */ byte[] f117869f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgwv(int i, String str, Class cls, Object obj, Response.Listener listener, Response.ErrorListener errorListener, String str2, String str3, boolean z, HashMap hashMap, int i2, int i3, byte[] bArr) {
        super(i, str, (String) null, cls, obj, listener, errorListener, str2, str3, z, hashMap, i2, i3);
        this.f117869f = bArr;
    }

    public final byte[] getBody() {
        return this.f117869f;
    }
}
