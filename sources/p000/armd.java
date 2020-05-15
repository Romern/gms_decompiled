package p000;

import android.content.Context;

/* renamed from: armd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class armd {

    /* renamed from: c */
    private static final Logger f87883c = ascp.m73787a("D2D", "Metrics", "PostSetupLogManager");

    /* renamed from: a */
    public final armp f87884a;

    /* renamed from: b */
    private final qws f87885b;

    /* renamed from: d */
    private final bxvd f87886d;

    /* renamed from: e */
    private final bxvd f87887e = bouy.f134970d.mo74144da();

    /* renamed from: f */
    private final bxvd f87888f = bova.f134976e.mo74144da();

    /* renamed from: g */
    private final bxvd f87889g = boul.f134940e.mo74144da();

    public armd(Context context) {
        qws qws = new qws(context, "SMART_SETUP", null);
        this.f87885b = qws;
        this.f87886d = bovc.f134986j.mo74144da();
        this.f87884a = new armp(this.f87889g);
    }

    /* renamed from: a */
    public final void mo48633a() {
        f87883c.logVerbose("Sending logs with Clearcut.", new Object[0]);
        bxvd bxvd = this.f87888f;
        bxvd bxvd2 = this.f87889g;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bova bova = (bova) bxvd.f164949b;
        boul boul = (boul) bxvd2.mo74062i();
        bova bova2 = bova.f134976e;
        boul.getClass();
        bova.f134980c = boul;
        bova.f134978a |= 2;
        bxvd bxvd3 = this.f87888f;
        bxvd bxvd4 = this.f87887e;
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bova bova3 = (bova) bxvd3.f164949b;
        bouy bouy = (bouy) bxvd4.mo74062i();
        bouy.getClass();
        bova3.f134981d = bouy;
        bova3.f134978a |= 4;
        bxvd bxvd5 = this.f87886d;
        bxvd bxvd6 = this.f87888f;
        if (bxvd5.f164950c) {
            bxvd5.mo74035c();
            bxvd5.f164950c = false;
        }
        bovc bovc = (bovc) bxvd5.f164949b;
        bova bova4 = (bova) bxvd6.mo74062i();
        bovc bovc2 = bovc.f134986j;
        bova4.getClass();
        bovc.f134995h = bova4;
        bovc.f134988a |= 64;
        f87883c.logVerbose(this.f87886d.toString(), new Object[0]);
        this.f87885b.mo24335a(((bovc) this.f87886d.mo74062i()).serializeToBytes()).mo24327b();
    }

    /* renamed from: a */
    public final void mo48634a(int i) {
        bxvd bxvd = this.f87888f;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bova bova = (bova) bxvd.f164949b;
        bova bova2 = bova.f134976e;
        bova.f134979b = i - 1;
        bova.f134978a |= 1;
    }

    /* renamed from: a */
    public final void mo48635a(long j) {
        bxvd bxvd = this.f87886d;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bovc bovc = (bovc) bxvd.f164949b;
        bovc bovc2 = bovc.f134986j;
        bovc.f134988a |= 1;
        bovc.f134989b = j;
    }

    /* renamed from: a */
    public final void mo48636a(String str, boolean z) {
        bxvd bxvd = this.f87887e;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bouy bouy = (bouy) bxvd.f164949b;
        bouy bouy2 = bouy.f134970d;
        str.getClass();
        bouy.f134972a |= 1;
        bouy.f134973b = str;
        if ("com.google.android.gms".equals(str)) {
            bxvd bxvd2 = this.f87887e;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bouy bouy3 = (bouy) bxvd2.f164949b;
            bouy3.f134974c = 1;
            bouy3.f134972a |= 2;
        } else if (!z) {
            bxvd bxvd3 = this.f87887e;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bouy bouy4 = (bouy) bxvd3.f164949b;
            bouy4.f134974c = 4;
            bouy4.f134972a |= 2;
        } else {
            bxvd bxvd4 = this.f87887e;
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            bouy bouy5 = (bouy) bxvd4.f164949b;
            bouy5.f134974c = 2;
            bouy5.f134972a |= 2;
        }
    }
}
