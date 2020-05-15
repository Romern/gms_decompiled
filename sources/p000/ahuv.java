package p000;

import android.accounts.Account;
import android.content.Context;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: ahuv */
public final /* synthetic */ class ahuv implements Runnable {

    /* renamed from: a */
    private final Context f68119a;

    /* renamed from: b */
    private final String f68120b;

    /* renamed from: c */
    private final String f68121c;

    /* renamed from: d */
    private final buru f68122d;

    public ahuv(Context context, String str, String str2, buru buru) {
        this.f68119a = context;
        this.f68120b = str;
        this.f68121c = str2;
        this.f68122d = buru;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d5 A[ExcHandler: InterruptedException | ExecutionException (e java.lang.Throwable), Splitter:B:4:0x002f] */
    public final void run() {
        bxvd da;
        Context context = this.f68119a;
        String str = this.f68120b;
        String str2 = this.f68121c;
        buru buru = this.f68122d;
        ahyz a = ((ahst) ahgz.m55754a(context, ahst.class)).mo37033a(str2);
        for (Account account : soz.m35801d(context, context.getPackageName())) {
            try {
                ahza a2 = ahur.m56666a((List) buru.mo73055a(account).get(), a);
                if (a2 != null) {
                    da = aiaa.f68501K.mo74144da();
                    ByteString bxtx = a2.f68445c;
                    bxus c = bxus.m123744c();
                    bxuc h = bxtx.mo73764h();
                    da.mo73627a(h, c);
                    h.mo73787a(0);
                    if (!((aiaa) da.f164949b).f68520h.equals(str)) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        aiaa aiaa = (aiaa) da.f164949b;
                        str.getClass();
                        aiaa.f68513a |= 32;
                        aiaa.f68520h = str;
                        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: update title to alias name = %s", str);
                        ahti ahti = new ahti(((aiaa) da.f164949b).f68537y, str2, context);
                        ahtg f = ahth.m56604f();
                        f.mo37114a(bvjc.DEVICE_ALIAS_CHANGED);
                        ahti.mo37121a(f.mo37111a());
                        ((buqh) ahgz.m55754a(context, buqh.class)).mo72987c(new ahuw("updateDiscoveryItemTitle", da, buru, account, a2, str2, context, a));
                        return;
                    }
                }
            } catch (bxwf e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(da.mo73636c("ByteString"), e2);
            } catch (InterruptedException | ExecutionException e3) {
            } catch (bxwf e4) {
                e = e4;
                bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68405a("FastPair: Failed to read device from Footprints.");
            }
        }
    }
}
