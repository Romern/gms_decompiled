package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: byew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byew extends bxvd implements bxxd {
    public byew() {
        super(byex.f165964y);
    }

    /* renamed from: G */
    public final void mo74349G(int i) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byex byex = (byex) this.f164949b;
        byex byex2 = byex.f165964y;
        byex.f165982q = i - 2;
        byex.f165966a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
    }

    /* renamed from: H */
    public final void mo74350H(int i) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byex byex = (byex) this.f164949b;
        byex byex2 = byex.f165964y;
        byex.f165981p = i - 2;
        byex.f165966a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
    }

    /* renamed from: I */
    public final void mo74351I(int i) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byex byex = (byex) this.f164949b;
        byex byex2 = byex.f165964y;
        byex.f165968c = i - 2;
        byex.f165966a |= 2;
    }

    /* renamed from: J */
    public final void mo74352J(int i) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byex byex = (byex) this.f164949b;
        byex byex2 = byex.f165964y;
        byex.f165980o = i - 1;
        byex.f165966a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
    }

    /* renamed from: K */
    public final void mo74353K(int i) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byex byex = (byex) this.f164949b;
        byex byex2 = byex.f165964y;
        byex.f165967b = i - 2;
        byex.f165966a |= 1;
    }

    /* renamed from: a */
    public final void mo74354a(float f) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byex byex = (byex) this.f164949b;
        byex byex2 = byex.f165964y;
        byex.f165966a |= 4096;
        byex.f165978m = f;
    }

    /* renamed from: b */
    public final void mo74365b(float f) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byex byex = (byex) this.f164949b;
        byex byex2 = byex.f165964y;
        byex.f165966a |= 128;
        byex.f165974i = f;
    }

    /* renamed from: s */
    public final void mo74370s(String str) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byex byex = (byex) this.f164949b;
        byex byex2 = byex.f165964y;
        str.getClass();
        byex.f165966a |= 8;
        byex.f165970e = str;
    }

    /* renamed from: a */
    public final void mo74355a(int i) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byex byex = (byex) this.f164949b;
        byex byex2 = byex.f165964y;
        byex.f165966a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        byex.f165975j = i;
    }

    @Deprecated
    /* renamed from: b */
    public final void mo74366b(int i) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byex byex = (byex) this.f164949b;
        byex byex2 = byex.f165964y;
        byex.f165966a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        byex.f165983r = i;
    }

    /* renamed from: a */
    public final void mo74356a(byel byel) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byex byex = (byex) this.f164949b;
        byex byex2 = byex.f165964y;
        byel.getClass();
        byex.f165976k = byel;
        byex.f165966a |= 512;
    }

    /* renamed from: b */
    public final void mo74367b(byel byel) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byex byex = (byex) this.f164949b;
        byex byex2 = byex.f165964y;
        byel.getClass();
        byex.f165977l = byel;
        byex.f165966a |= 2048;
    }

    /* renamed from: a */
    public final void mo74357a(byen byen) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byex byex = (byex) this.f164949b;
        byex byex2 = byex.f165964y;
        byen.getClass();
        byex.f165971f = byen;
        byex.f165966a |= 16;
    }

    @Deprecated
    /* renamed from: b */
    public final void mo74368b(byen byen) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byex byex = (byex) this.f164949b;
        byex byex2 = byex.f165964y;
        byen.getClass();
        byex.f165972g = byen;
        byex.f165966a |= 32;
    }

    /* renamed from: a */
    public final void mo74358a(byeo byeo) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byex byex = (byex) this.f164949b;
        byex byex2 = byex.f165964y;
        byeo.getClass();
        byex.f165973h = byeo;
        byex.f165966a |= 64;
    }

    @Deprecated
    /* renamed from: b */
    public final void mo74369b(String str) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byex byex = (byex) this.f164949b;
        byex byex2 = byex.f165964y;
        str.getClass();
        byex.f165966a |= 8192;
        byex.f165979n = str;
    }

    /* renamed from: a */
    public final void mo74359a(byev byev) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byex byex = (byex) this.f164949b;
        byex byex2 = byex.f165964y;
        byev.getClass();
        byex.f165984s = byev;
        byex.f165966a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
    }

    /* renamed from: a */
    public final void mo74360a(byfc byfc) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byex byex = (byex) this.f164949b;
        byex byex2 = byex.f165964y;
        byfc.getClass();
        if (!byex.f165986u.mo73666a()) {
            byex.f165986u = GeneratedMessageLite.m124019a(byex.f165986u);
        }
        byex.f165986u.mo74153d(byfc.f166005k);
    }

    /* renamed from: a */
    public final void mo74361a(byfd byfd) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byex byex = (byex) this.f164949b;
        byex byex2 = byex.f165964y;
        byfd.getClass();
        if (!byex.f165989x.mo73666a()) {
            byex.f165989x = GeneratedMessageLite.m124021a(byex.f165989x);
        }
        byex.f165989x.add(byfd);
    }

    /* renamed from: a */
    public final void mo74362a(byfi byfi) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byex byex = (byex) this.f164949b;
        byex byex2 = byex.f165964y;
        byfi.getClass();
        byex.mo74371c();
        byex.f165987v.add(byfi);
    }

    /* renamed from: a */
    public final void mo74363a(byfm byfm) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byex byex = (byex) this.f164949b;
        byex byex2 = byex.f165964y;
        byfm.getClass();
        byex.mo74372e();
        byex.f165988w.add(byfm);
    }

    /* renamed from: a */
    public final void mo74364a(String str) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byex byex = (byex) this.f164949b;
        byex byex2 = byex.f165964y;
        str.getClass();
        byex.f165966a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        byex.f165985t = str;
    }
}
