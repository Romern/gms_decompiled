package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;

/* renamed from: wsm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wsm {

    /* renamed from: a */
    public final buru f51252a;

    public wsm(Context context) {
        this.f51252a = new buru(context, buqh.m120234a("FastPair").mo72986c());
    }

    /* renamed from: a */
    private final aiaa m42215a(ahza ahza) {
        try {
            ByteString bxtx = ahza.f68445c;
            bxus c = bxus.m123744c();
            aiaa aiaa = aiaa.f68501K;
            try {
                bxuc h = bxtx.mo73764h();
                GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) aiaa.mo74142c(4);
                bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite);
                a.mo74220a(GeneratedMessageLite, bxud.m123454a(h), c);
                a.mo74225d(GeneratedMessageLite);
                h.mo73787a(0);
                GeneratedMessageLite.m124027b(GeneratedMessageLite);
                return (aiaa) GeneratedMessageLite;
            } catch (IOException e) {
                if (!(e.getCause() instanceof bxwf)) {
                    throw new bxwf(e.getMessage());
                }
                throw ((bxwf) e.getCause());
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof bxwf) {
                    throw ((bxwf) e2.getCause());
                }
                throw e2;
            } catch (bxwf e3) {
                throw e3;
            } catch (bxwf e4) {
                throw e4;
            }
        } catch (bxwf e5) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
            bnsl.mo68437a(e5);
            bnsl.mo68432a("wsm", "a", 52, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("FindDevice: Failed to read device from Footprints based on cached item.");
            return null;
        }
    }

    /* renamed from: a */
    public static Bitmap m42216a(aiaa aiaa) {
        if ((aiaa.f68513a & 8388608) == 0) {
            return null;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(aiaa.f68538z.getKey(), 0, aiaa.f68538z.mo73744a());
        if (!bush.m120379a(decodeByteArray)) {
            return null;
        }
        return decodeByteArray;
    }
}
