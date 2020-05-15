package p000;

import android.util.Log;
import android.util.LruCache;
import java.io.File;
import java.io.IOException;

/* renamed from: rcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1589rcs extends LruCache {

    /* renamed from: a */
    final /* synthetic */ rde f42656a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1589rcs(rde rde, int i) {
        super(i);
        this.f42656a = rde;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        try {
            rde rde = this.f42656a;
            File file = new File(str);
            int i = rde.f42700a;
            byte[] b = rde.mo24494b(file);
            if (b == null) {
                Log.e("LogStoreUtil", "Tried to deserialize a null PLC.");
                return null;
            }
            try {
                return (caik) GeneratedMessageLite.m124016a(caik.f174711o, b, bxus.m123744c());
            } catch (bxwf e) {
                Log.e("LogStoreUtil", "Couldn't parse PlayLoggerContext proto.", e);
                return null;
            }
        } catch (IOException e2) {
            String valueOf = String.valueOf(str);
            Log.e("FlatFileLogStore", valueOf.length() == 0 ? new String("Failed to read and parse PlayLoggerContext file ") : "Failed to read and parse PlayLoggerContext file ".concat(valueOf), e2);
            return null;
        }
    }
}
