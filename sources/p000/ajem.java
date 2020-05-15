package p000;

import android.content.Context;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;

/* renamed from: ajem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajem extends ajfd {

    /* renamed from: a */
    private final String f70436a;

    public ajem(Context context, buqh buqh, String str, ajeu ajeu) {
        super(context, ClientAppIdentifier.f80666a, buqh, bzci.f169330c, "RegisterDevice", ajeu);
        this.f70436a = str;
    }

    /* renamed from: a */
    static bzch m58604a(String str) {
        bxvf bxvf = (bxvf) bzch.f169323e.mo74144da();
        bxvf bxvf2 = (bxvf) byyw.f169032c.mo74144da();
        bxvf bxvf3 = (bxvf) bzby.f169278c.mo74144da();
        if (bxvf3.f164950c) {
            bxvf3.mo74035c();
            bxvf3.f164950c = false;
        }
        bzby bzby = (bzby) bxvf3.f164949b;
        bzby.f169281b = 3;
        bzby.f169280a |= 1;
        bzby bzby2 = (bzby) bxvf3.mo74062i();
        if (bxvf2.f164950c) {
            bxvf2.mo74035c();
            bxvf2.f164950c = false;
        }
        byyw byyw = (byyw) bxvf2.f164949b;
        bzby2.getClass();
        byyw.f169035b = bzby2;
        byyw.f169034a |= 2;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bzch bzch = (bzch) bxvf.f164949b;
        byyw byyw2 = (byyw) bxvf2.mo74062i();
        byyw2.getClass();
        bzch.f169328d = byyw2;
        bzch.f169325a |= 4;
        if (str != null) {
            bxvf bxvf4 = (bxvf) byzl.f169119d.mo74144da();
            if (bxvf4.f164950c) {
                bxvf4.mo74035c();
                bxvf4.f164950c = false;
            }
            byzl byzl = (byzl) bxvf4.f164949b;
            byzl.f169122b = 1;
            byzl.f169121a |= 1;
            bxvd da = byzc.f169055c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byzc byzc = (byzc) da.f164949b;
            str.getClass();
            byzc.f169057a |= 1;
            byzc.f169058b = str;
            byzc byzc2 = (byzc) da.mo74062i();
            if (bxvf4.f164950c) {
                bxvf4.mo74035c();
                bxvf4.f164950c = false;
            }
            byzl byzl2 = (byzl) bxvf4.f164949b;
            byzc2.getClass();
            byzl2.f169123c = byzc2;
            byzl2.f169121a |= 2;
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bzch bzch2 = (bzch) bxvf.f164949b;
            byzl byzl3 = (byzl) bxvf4.mo74062i();
            byzl3.getClass();
            bzch2.f169327c = byzl3;
            bzch2.f169325a |= 2;
        }
        return (bzch) bxvf.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ajec mo38550a(String str, int i) {
        return new ajel(this.f70501e, str, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo38551a() {
        bzch a = m58604a(this.f70436a);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((bxvk) a);
        bxvf bxvf = (bxvf) bxvd;
        bzcl b = mo38567b((String) null);
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bzch bzch = (bzch) bxvf.f164949b;
        bzch bzch2 = bzch.f169323e;
        b.getClass();
        bzch.f169326b = b;
        bzch.f169325a |= 1;
        return (bzch) bxvf.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bzcm mo38552a(bxxc bxxc) {
        bzci bzci = (bzci) bxxc;
        if (bzci == null) {
            return null;
        }
        bzcm bzcm = bzci.f169332a;
        return bzcm == null ? bzcm.f169369d : bzcm;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo38553a(bxxc bxxc, bxxc bxxc2) {
        bzch bzch = (bzch) bxxc;
        return ((bzci) bxxc2).f169333b;
    }
}
