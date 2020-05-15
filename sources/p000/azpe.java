package p000;

import android.text.TextUtils;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.Collections;
import java.util.List;

/* renamed from: azpe */
final /* synthetic */ class azpe implements Runnable {

    /* renamed from: a */
    private final azph f99809a;

    /* renamed from: b */
    private final LocalEntityId f99810b;

    /* renamed from: c */
    private final bxvd f99811c;

    public azpe(azph azph, bxvd bxvd, LocalEntityId localEntityId) {
        this.f99809a = azph;
        this.f99811c = bxvd;
        this.f99810b = localEntityId;
    }

    public final void run() {
        int i;
        azph azph = this.f99809a;
        bxvd bxvd = this.f99811c;
        LocalEntityId localEntityId = this.f99810b;
        bmxy.m108600b(true);
        if (!TextUtils.isEmpty(cfeo.m138845B())) {
            if (((boqd) bxvd.f164949b).f134249n.size() != 0) {
                List unmodifiableList = Collections.unmodifiableList(((boqd) bxvd.f164949b).f134249n);
                unmodifiableList.add(cfeo.m138845B());
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boqd boqd = boqd.f134234x;
                ((boqd) bxvd.f164949b).f134249n = bxvk.m124030de();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boqd boqd2 = (boqd) bxvd.f164949b;
                boqd2.mo68928a();
                bxsy.m123078a(unmodifiableList, boqd2.f134249n);
            } else {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boqd boqd3 = boqd.f134234x;
                ((boqd) bxvd.f164949b).f134249n = bxvk.m124030de();
                String B = cfeo.m138845B();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boqd boqd4 = (boqd) bxvd.f164949b;
                B.getClass();
                boqd4.mo68928a();
                boqd4.f134249n.add(B);
            }
        }
        if (localEntityId == null) {
            if (azph.f99817c.mo54802x()) {
                localEntityId = azcv.f99014b;
            } else if (azph.f99817c.mo54775f() && !TextUtils.isEmpty(azph.f99817c.mo54738a())) {
                localEntityId = new LocalEntityId(azph.f99817c.mo54738a(), 1, cfeo.m138878i());
            }
        }
        if (localEntityId != null) {
            bzrn a = azph.m86000a(localEntityId);
            if (a != null) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boqd boqd5 = (boqd) bxvd.f164949b;
                boqd boqd6 = boqd.f134234x;
                a.getClass();
                boqd5.f134247l = a;
                boqd5.f134236a |= 1024;
            } else {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boqd boqd7 = (boqd) bxvd.f164949b;
                boqd boqd8 = boqd.f134234x;
                boqd7.f134247l = null;
                boqd7.f134236a &= -1025;
            }
        }
        azct c = azph.f99819e.mo54699c(localEntityId);
        if (!cfec.m138765b()) {
            i = 9;
        } else {
            i = 8;
        }
        int i2 = 2;
        if (c != null) {
            int i3 = c.f99011h;
            if (i3 == 3) {
                i = c.f99010g.size() != 1 ? 3 : 2;
            } else if (i3 == 2) {
                i = !cfec.m138765b() ? 5 : 4;
            } else if (i3 == 1) {
                i = !cfec.m138765b() ? 7 : 6;
            }
        }
        boqd boqd9 = (boqd) bxvd.f164949b;
        if ((boqd9.f134236a & 64) == 0) {
            bxvd da = boqj.f134271k.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqj boqj = (boqj) da.f164949b;
            boqj.f134280h = i - 1;
            boqj.f134273a |= 512;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boqd boqd10 = (boqd) bxvd.f164949b;
            boqj boqj2 = (boqj) da.mo74062i();
            boqd boqd11 = boqd.f134234x;
            boqj2.getClass();
            boqd10.f134243h = boqj2;
            boqd10.f134236a |= 64;
        } else {
            boqj boqj3 = boqd9.f134243h;
            if (boqj3 == null) {
                boqj3 = boqj.f134271k;
            }
            bxvd bxvd2 = (bxvd) boqj3.mo74142c(5);
            bxvd2.mo73625a((bxvk) boqj3);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            boqj boqj4 = (boqj) bxvd2.f164949b;
            boqj4.f134280h = i - 1;
            boqj4.f134273a |= 512;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boqd boqd12 = (boqd) bxvd.f164949b;
            boqj boqj5 = (boqj) bxvd2.mo74062i();
            boqd boqd13 = boqd.f134234x;
            boqj5.getClass();
            boqd12.f134243h = boqj5;
            boqd12.f134236a |= 64;
        }
        if ((((boqd) bxvd.f164949b).f134236a & 1) == 0) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boqd boqd14 = (boqd) bxvd.f164949b;
            boqd14.f134237b = bopu.m111431a(2);
            boqd14.f134236a = 1 | boqd14.f134236a;
        }
        qwo a2 = azph.f99815a.mo24333a(bxvd.mo74062i());
        int b = bopu.m111432b(((boqd) bxvd.f164949b).f134237b);
        if (b != 0) {
            i2 = b;
        }
        a2.mo24328b(bopu.m111431a(i2));
        a2.mo24327b();
    }
}
