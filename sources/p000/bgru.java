package p000;

import android.content.Context;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* renamed from: bgru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgru extends bgtf implements bgrr {

    /* renamed from: a */
    public bgrz f117376a;

    /* renamed from: b */
    private final Context f117377b;

    /* renamed from: c */
    private final bgsd f117378c;

    /* renamed from: d */
    private final sqv f117379d;

    /* renamed from: e */
    private bgtk f117380e;

    public bgru(Context context, sqv sqv, bgsd bgsd) {
        super("SessionMgr");
        this.f117377b = context;
        this.f117379d = sqv;
        this.f117378c = bgsd;
    }

    /* renamed from: a */
    public final void mo63111a() {
        srn srn = bgrw.f117381a;
        if (this.f117380e == null) {
            if (cezu.m138504y()) {
                this.f117380e = bgta.m99876a("ea_q_h", this.f117379d, bngx.m109356a(new bgsv(TimeUnit.MILLISECONDS.toSeconds(cezu.m138497r() - cezu.m138496q()), 1)), new sty(this.f117482h.f117486b));
            } else {
                this.f117380e = new bgtj(cezu.m138497r() - cezu.m138496q());
            }
        }
        bgrz bgrz = new bgrz(this.f117378c.mo63082h().f117453c, this.f117378c.mo63082h().f117454d, bgpt.m99738a(this.f117377b), System.currentTimeMillis());
        this.f117376a = bgrz;
        bgph.m99703a(this.f117377b, "start", bgrz);
        mo63122a(0);
        this.f117482h.mo63156c();
    }

    /* renamed from: b */
    public final void mo63113b() {
        bgph.m99703a(this.f117377b, "finish", this.f117376a);
    }

    /* renamed from: a */
    public final void mo63122a(long j) {
        if (!this.f117482h.f117486b.hasMessages(5)) {
            this.f117482h.f117486b.mo63149a(5, null, j);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgph.a(android.content.Context, boolean):void
     arg types: [android.content.Context, int]
     candidates:
      bgph.a(android.content.Context, java.lang.String):void
      bgph.a(android.content.Context, boolean):void */
    /* renamed from: a */
    public final boolean mo63112a(Message message) {
        int i = message.what;
        if (i == 5) {
            srn srn = bgrw.f117381a;
            if (cezu.m138504y()) {
                long b = this.f117380e.mo63144b(new bgrs(this));
                if (b > 0) {
                    mo63122a(b * 1000);
                }
            } else {
                this.f117380e.mo63143a(new bgrt(this));
                mo63122a(cezu.m138497r());
            }
        } else if (i == 6) {
            srn srn2 = bgrw.f117381a;
            bgph.m99703a(this.f117377b, "heartbeat", this.f117376a);
        } else if (i == 8) {
            srn srn3 = bgrw.f117381a;
            this.f117376a.f117402g++;
            bgph.m99704a(this.f117377b, true);
        } else if (i == 9) {
            srn srn4 = bgrw.f117381a;
            this.f117376a.f117401f++;
            bgph.m99704a(this.f117377b, false);
        }
        return false;
    }
}
