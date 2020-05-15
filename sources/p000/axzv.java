package p000;

import android.util.Log;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/* renamed from: axzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axzv implements axzu {

    /* renamed from: a */
    private final ayev f96862a;

    /* renamed from: b */
    private final List f96863b;

    public axzv(int i, ayev ayev, axyt axyt, int i2) {
        FileInputStream fileInputStream;
        sdo.m34959a(ayev);
        if (axyt != null) {
            if ((ayev.f97378a & 1) != 0) {
                try {
                    fileInputStream = new FileInputStream(axyt.f96802b);
                    bxtx a = bxtx.m123256a(fileInputStream);
                    srz.m36171a((Closeable) fileInputStream);
                    if (a != null) {
                        bxvd bxvd = (bxvd) ayev.mo74142c(5);
                        bxvd.mo73625a((bxvk) ayev);
                        ayfb ayfb = ayev.f97379b;
                        if (ayfb == null) {
                            ayfb = ayfb.f97441e;
                        }
                        bxvd bxvd2 = (bxvd) ayfb.mo74142c(5);
                        bxvd2.mo73625a((bxvk) ayfb);
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        ayfb ayfb2 = (ayfb) bxvd2.f164949b;
                        a.getClass();
                        ayfb2.f97443a |= 4;
                        ayfb2.f97446d = a;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        ayev ayev2 = (ayev) bxvd.f164949b;
                        ayfb ayfb3 = (ayfb) bxvd2.mo74062i();
                        ayev ayev3 = ayev.f97376n;
                        ayfb3.getClass();
                        ayev2.f97379b = ayfb3;
                        ayev2.f97378a |= 1;
                        ayev = (ayev) bxvd.mo74062i();
                    }
                } catch (IOException e) {
                    Log.w("wearable", "Dropped outgoing message: failed to read attachment file.", e);
                    ayev = null;
                } catch (Throwable th) {
                    srz.m36171a((Closeable) fileInputStream);
                    throw th;
                }
            } else {
                ayev = null;
            }
            if (ayev == null) {
                this.f96862a = null;
                this.f96863b = null;
                return;
            }
        }
        this.f96862a = ayev;
        this.f96863b = aybb.m83729a(ayev, i2, i);
    }

    /* renamed from: a */
    public final ayev mo53810a() {
        return this.f96862a;
    }

    /* renamed from: b */
    public final boolean mo53811b() {
        List list = this.f96863b;
        return list == null || list.isEmpty();
    }

    /* renamed from: c */
    public final ayew mo53812c() {
        if (!mo53811b()) {
            return (ayew) this.f96863b.remove(0);
        }
        throw new IllegalArgumentException("Called getNextMessagePieces on a done QueuedMessage");
    }

    /* renamed from: d */
    public final void mo53813d() {
    }
}
