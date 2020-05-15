package p000;

import android.content.Context;
import com.google.android.gms.mdd.FileGroupRequest;
import com.google.android.gms.mdd.OverrideFileGroupRequest;

/* renamed from: afow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afow extends afjo implements aaai {

    /* renamed from: a */
    private final Context f64473a;

    /* renamed from: b */
    private final bbch f64474b;

    /* renamed from: c */
    private final afon f64475c;

    /* renamed from: d */
    private final afoj f64476d;

    /* renamed from: e */
    private final bbep f64477e;

    /* renamed from: f */
    private final aaag f64478f;

    /* renamed from: g */
    private final String f64479g;

    /* renamed from: h */
    private final int f64480h;

    /* renamed from: i */
    private final afot f64481i;

    /* renamed from: j */
    private final ayte f64482j;

    public afow(Context context, bbch bbch, afon afon, afoj afoj, bbep bbep, aaag aaag, String str, int i, afot afot, ayte ayte) {
        this.f64473a = context;
        this.f64474b = bbch;
        this.f64475c = afon;
        this.f64476d = afoj;
        this.f64477e = bbep;
        this.f64478f = aaag;
        this.f64479g = str;
        this.f64480h = i;
        this.f64481i = afot;
        this.f64482j = ayte;
    }

    /* renamed from: a */
    public final void mo34905a(afjj afjj, FileGroupRequest fileGroupRequest) {
        this.f64478f.mo16658a(new afpq(this.f64474b, this.f64476d, fileGroupRequest, this.f64479g, this.f64480h, this.f64481i, this.f64477e, afjj));
    }

    /* renamed from: b */
    public final void mo34911b(rnt rnt) {
        if (this.f64481i.equals(afot.ZERO_PARTY) || rfy.m33550g(this.f64473a)) {
            this.f64478f.mo16658a(new afpl(this.f64474b, rnt));
            return;
        }
        throw new SecurityException("Access denied");
    }

    /* renamed from: c */
    public final void mo34913c(rnt rnt) {
        if (this.f64481i.equals(afot.ZERO_PARTY) || rfy.m33550g(this.f64473a)) {
            this.f64478f.mo16658a(new afps(this.f64474b, rnt));
            return;
        }
        throw new SecurityException("Access denied");
    }

    /* renamed from: d */
    public final void mo34914d(rnt rnt) {
        if (this.f64481i.equals(afot.ZERO_PARTY) || rfy.m33550g(this.f64473a)) {
            this.f64478f.mo16658a(new afpj(this.f64474b, this.f64476d, rnt));
            return;
        }
        throw new SecurityException("Access denied");
    }

    /* renamed from: e */
    public final void mo34915e(rnt rnt) {
        if (this.f64481i.equals(afot.ZERO_PARTY) || rfy.m33550g(this.f64473a)) {
            this.f64478f.mo16658a(new afph(this.f64474b, this.f64475c, rnt));
            return;
        }
        throw new SecurityException("Access denied");
    }

    /* renamed from: f */
    public final void mo34916f(rnt rnt) {
        if (rfy.m33550g(this.f64473a)) {
            this.f64478f.mo16658a(new afpj(this.f64474b, this.f64476d, rnt));
            return;
        }
        throw new SecurityException("Access denied");
    }

    /* renamed from: a */
    public final void mo34906a(afjm afjm) {
        if (this.f64481i.equals(afot.ZERO_PARTY) || rfy.m33550g(this.f64473a)) {
            this.f64478f.mo16658a(new afpd(this.f64474b, afjm));
            return;
        }
        throw new SecurityException("Access denied");
    }

    /* renamed from: b */
    public final void mo34912b(rnt rnt, FileGroupRequest fileGroupRequest) {
        this.f64478f.mo16658a(new afpu(this.f64474b, fileGroupRequest, this.f64479g, this.f64480h, this.f64481i, this.f64477e, rnt, false));
    }

    /* renamed from: a */
    public final void mo34907a(rnt rnt) {
        if (this.f64481i.equals(afot.ZERO_PARTY) || rfy.m33550g(this.f64473a)) {
            this.f64478f.mo16658a(new afov(this.f64475c, rnt));
            return;
        }
        throw new SecurityException("Access denied");
    }

    /* renamed from: a */
    public final void mo34908a(rnt rnt, FileGroupRequest fileGroupRequest) {
        this.f64478f.mo16658a(new afpu(this.f64474b, fileGroupRequest, this.f64479g, this.f64480h, this.f64481i, this.f64477e, rnt, true));
    }

    /* renamed from: a */
    public final void mo34909a(rnt rnt, OverrideFileGroupRequest overrideFileGroupRequest) {
        if (rfy.m33550g(this.f64473a)) {
            aaag aaag = this.f64478f;
            bbch bbch = this.f64474b;
            afoj afoj = this.f64476d;
            sdo.m34959a(afoj);
            aaag.mo16658a(new afoy(bbch, afoj, overrideFileGroupRequest, rnt));
            return;
        }
        bbev.m87905a("%s : Cannot call Diagnostics API on a non-debug build", "Service");
        throw new SecurityException("Access denied");
    }

    /* renamed from: a */
    public final void mo34910a(boolean z, rnt rnt) {
        if (this.f64481i.equals(afot.ZERO_PARTY) || rfy.m33550g(this.f64473a)) {
            this.f64478f.mo16658a(new afpa(this.f64474b, z, rnt));
            return;
        }
        throw new SecurityException("Access denied");
    }
}
