package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: igk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class igk {

    /* renamed from: a */
    private final Context f20924a;

    public igk(Context context, ifj ifj) {
        this.f20924a = context;
        sdo.m34959a(ifj);
    }

    /* renamed from: a */
    public static byte[] m15412a(byte[] bArr) {
        if (bArr != null) {
            byte[] k = bysw.m125309a((byti) bxvk.m124014a(byti.f167671d, bArr)).f167652d.mo73780k();
            if (k.length != 0) {
                return k;
            }
            throw new igj("Missing key handle", 7);
        }
        throw null;
    }

    /* renamed from: b */
    public static byte[] m15413b(String str) {
        if (!TextUtils.isEmpty(str)) {
            byte[] c = sqd.m35971c(str);
            if (c.length != 0) {
                return c;
            }
            throw new igj("Invalid base64 encoding", 6);
        }
        throw new igj("Received a server message with empty KEY_PAYLOAD", 5);
    }

    /* renamed from: a */
    public final byrz mo12995a(String str) {
        byte[] b = m15413b(str);
        try {
            return ifj.m15367a(this.f20924a, b, m15412a(b)).f20857a;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new igj("Unhandled exception", e);
        }
    }
}
