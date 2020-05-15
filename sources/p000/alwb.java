package p000;

import android.os.Bundle;
import java.util.HashMap;

/* renamed from: alwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alwb {

    /* renamed from: c */
    private static final alwb f74438c = new alwb(0, null);

    /* renamed from: a */
    public final byte[] f74439a;

    /* renamed from: b */
    public final int f74440b;

    public alwb(int i, byte[] bArr) {
        this.f74440b = i;
        this.f74439a = bArr;
    }

    /* renamed from: a */
    public static alwb m61992a(Bundle bundle) {
        if (bundle == null) {
            return f74438c;
        }
        if (bundle.getInt("get.server_blob.code", -1) == -1) {
            return f74438c;
        }
        byte[] byteArray = bundle.getByteArray("get.server_blob.body");
        int i = bundle.getInt("get.server_blob.format");
        HashMap hashMap = (HashMap) bundle.getSerializable("get.server_blob.headers");
        return new alwb(i, byteArray);
    }
}
