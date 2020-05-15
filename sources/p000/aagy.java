package p000;

import android.content.Context;
import android.util.Base64;
import com.google.ads.afma.proto2api.C0152c;
import com.google.android.gms.ads.identifier.C0271c;
import com.google.android.gms.ads.identifier.C0272d;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;

/* renamed from: aagy */
public final /* synthetic */ class aagy implements Callable {

    /* renamed from: a */
    private final aahd f28100a;

    public aagy(aahd aahd) {
        this.f28100a = aahd;
    }

    public final Object call() {
        Context context = this.f28100a.f28105a;
        bxvd da = C0152c.f7500Q.mo74144da();
        C0272d dVar = new C0272d(context);
        dVar.mo6487a();
        C0271c c = dVar.mo6490c();
        String str = c.f7985a;
        if (str != null && str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(str);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            str = Base64.encodeToString(bArr, 11);
        }
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            C0152c cVar = (C0152c) da.f164949b;
            str.getClass();
            int i = cVar.f7520c | 128;
            cVar.f7520c = i;
            cVar.f7513L = str;
            boolean z = c.f7986b;
            int i2 = i | 512;
            cVar.f7520c = i2;
            cVar.f7515N = z;
            cVar.f7514M = 5;
            cVar.f7520c = i2 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        return (C0152c) da.mo74062i();
    }
}
