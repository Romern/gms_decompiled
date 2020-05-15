package p000;

import java.security.Provider;
import javax.crypto.Mac;

/* renamed from: bqvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqvt implements bqvw {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo69342a(String str, Provider provider) {
        if (provider != null) {
            return Mac.getInstance(str, provider);
        }
        return Mac.getInstance(str);
    }
}
