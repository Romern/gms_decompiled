package p000;

import android.os.Build;
import android.os.Handler;
import com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor;

/* renamed from: btvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btvi {

    /* renamed from: h */
    private static final String[] f152607h = {"x86", "x86_64"};

    /* renamed from: a */
    public btvy f152608a;

    /* renamed from: b */
    public Handler f152609b;

    /* renamed from: c */
    public String f152610c = "Inertial Anchor";

    /* renamed from: d */
    public boolean f152611d = false;

    /* renamed from: e */
    public btvx f152612e = btvx.f152648k;

    /* renamed from: f */
    public btvw f152613f = null;

    /* renamed from: g */
    public btvp f152614g = null;

    /* renamed from: i */
    private final bxvd f152615i = btwd.f152690c.mo74144da();

    /* renamed from: a */
    public final AndroidInertialAnchor mo72439a() {
        int i = Build.VERSION.SDK_INT;
        String[] strArr = Build.SUPPORTED_ABIS;
        for (String str : strArr) {
            for (String str2 : f152607h) {
                if (str.contains(str2)) {
                    return null;
                }
            }
        }
        btvy btvy = this.f152608a;
        if (btvy != null) {
            btwj btwj = btvy.f152665d;
            if (btwj == null) {
                btwj = btwj.f152707b;
            }
            if (btwj.f152709a == null) {
                btvy btvy2 = this.f152608a;
                bxvd bxvd = this.f152615i;
                btwj btwj2 = btvy2.f152665d;
                if (btwj2 == null) {
                    btwj2 = btwj.f152707b;
                }
                bxvd bxvd2 = (bxvd) btwj2.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) btwj2);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                btwd btwd = (btwd) bxvd.mo74062i();
                btwd.getClass();
                ((btwj) bxvd2.f164949b).f152709a = btwd;
                bxvd bxvd3 = (bxvd) btvy2.mo74142c(5);
                bxvd3.mo73625a((GeneratedMessageLite) btvy2);
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                btwj btwj3 = (btwj) bxvd2.mo74062i();
                btwj3.getClass();
                ((btvy) bxvd3.f164949b).f152665d = btwj3;
                this.f152608a = (btvy) bxvd3.mo74062i();
            }
            btvy btvy3 = this.f152608a;
            btvw btvw = this.f152613f;
            if (btvw != null) {
                bxvd bxvd4 = (bxvd) btvy3.mo74142c(5);
                bxvd4.mo73625a((GeneratedMessageLite) btvy3);
                btwb btwb = ((btvy) bxvd4.f164949b).f152662a;
                if (btwb == null) {
                    btwb = btwb.f152683c;
                }
                bxvd bxvd5 = (bxvd) btwb.mo74142c(5);
                bxvd5.mo73625a((GeneratedMessageLite) btwb);
                btwa btwa = ((btwb) bxvd5.f164949b).f152685a;
                if (btwa == null) {
                    btwa = btwa.f152669m;
                }
                bxvd bxvd6 = (bxvd) btwa.mo74142c(5);
                bxvd6.mo73625a((GeneratedMessageLite) btwa);
                if (bxvd6.f164950c) {
                    bxvd6.mo74035c();
                    bxvd6.f164950c = false;
                }
                btvw.getClass();
                ((btwa) bxvd6.f164949b).f152682l = btvw;
                if (bxvd5.f164950c) {
                    bxvd5.mo74035c();
                    bxvd5.f164950c = false;
                }
                btwa btwa2 = (btwa) bxvd6.mo74062i();
                btwa2.getClass();
                ((btwb) bxvd5.f164949b).f152685a = btwa2;
                if (bxvd4.f164950c) {
                    bxvd4.mo74035c();
                    bxvd4.f164950c = false;
                }
                btwb btwb2 = (btwb) bxvd5.mo74062i();
                btwb2.getClass();
                ((btvy) bxvd4.f164949b).f152662a = btwb2;
                btvy3 = (btvy) bxvd4.mo74062i();
            }
            this.f152608a = btvy3;
            bxvd bxvd7 = (bxvd) btvy3.mo74142c(5);
            bxvd7.mo73625a((GeneratedMessageLite) btvy3);
            btvr btvr = btvy3.f152664c;
            if (btvr != null) {
                if (bxvd7.f164950c) {
                    bxvd7.mo74035c();
                    bxvd7.f164950c = false;
                }
                btvr.getClass();
                ((btvy) bxvd7.f164949b).f152664c = btvr;
            }
            btwb btwb3 = btvy3.f152662a;
            if (btwb3 != null) {
                bxvd bxvd8 = (bxvd) btwb3.mo74142c(5);
                bxvd8.mo73625a((GeneratedMessageLite) btwb3);
                btwa btwa3 = btwb3.f152685a;
                if (btwa3 != null) {
                    bxvd bxvd9 = (bxvd) btwa3.mo74142c(5);
                    bxvd9.mo73625a((GeneratedMessageLite) btwa3);
                    btwm btwm = btwa3.f152671a;
                    if (btwm != null) {
                        if (bxvd9.f164950c) {
                            bxvd9.mo74035c();
                            bxvd9.f164950c = false;
                        }
                        btwm.getClass();
                        ((btwa) bxvd9.f164949b).f152671a = btwm;
                    }
                    btwm btwm2 = btwa3.f152672b;
                    if (btwm2 != null) {
                        if (bxvd9.f164950c) {
                            bxvd9.mo74035c();
                            bxvd9.f164950c = false;
                        }
                        btwm2.getClass();
                        ((btwa) bxvd9.f164949b).f152672b = btwm2;
                    }
                    btwi btwi = btwa3.f152673c;
                    if (btwi != null) {
                        if (bxvd9.f164950c) {
                            bxvd9.mo74035c();
                            bxvd9.f164950c = false;
                        }
                        btwi.getClass();
                        ((btwa) bxvd9.f164949b).f152673c = btwi;
                    }
                    btwe btwe = btwa3.f152674d;
                    if (btwe != null) {
                        if (bxvd9.f164950c) {
                            bxvd9.mo74035c();
                            bxvd9.f164950c = false;
                        }
                        btwe.getClass();
                        ((btwa) bxvd9.f164949b).f152674d = btwe;
                    }
                    btvq btvq = btwa3.f152675e;
                    if (btvq != null) {
                        if (bxvd9.f164950c) {
                            bxvd9.mo74035c();
                            bxvd9.f164950c = false;
                        }
                        btvq.getClass();
                        ((btwa) bxvd9.f164949b).f152675e = btvq;
                    }
                    btvu btvu = btwa3.f152676f;
                    if (btvu != null) {
                        if (bxvd9.f164950c) {
                            bxvd9.mo74035c();
                            bxvd9.f164950c = false;
                        }
                        btvu.getClass();
                        ((btwa) bxvd9.f164949b).f152676f = btvu;
                    }
                    btvv btvv = btwa3.f152677g;
                    if (btvv != null) {
                        if (bxvd9.f164950c) {
                            bxvd9.mo74035c();
                            bxvd9.f164950c = false;
                        }
                        btvv.getClass();
                        ((btwa) bxvd9.f164949b).f152677g = btvv;
                    }
                    btwh btwh = btwa3.f152678h;
                    if (btwh != null) {
                        if (bxvd9.f164950c) {
                            bxvd9.mo74035c();
                            bxvd9.f164950c = false;
                        }
                        btwh.getClass();
                        ((btwa) bxvd9.f164949b).f152678h = btwh;
                    }
                    btvs btvs = btwa3.f152679i;
                    if (btvs != null) {
                        if (bxvd9.f164950c) {
                            bxvd9.mo74035c();
                            bxvd9.f164950c = false;
                        }
                        btvs.getClass();
                        ((btwa) bxvd9.f164949b).f152679i = btvs;
                    }
                    btwk btwk = btwa3.f152680j;
                    if (btwk != null) {
                        if (bxvd9.f164950c) {
                            bxvd9.mo74035c();
                            bxvd9.f164950c = false;
                        }
                        btwk.getClass();
                        ((btwa) bxvd9.f164949b).f152680j = btwk;
                    }
                    btwi btwi2 = btwa3.f152681k;
                    if (btwi2 != null) {
                        if (bxvd9.f164950c) {
                            bxvd9.mo74035c();
                            bxvd9.f164950c = false;
                        }
                        btwi2.getClass();
                        ((btwa) bxvd9.f164949b).f152681k = btwi2;
                    }
                    btvw btvw2 = btwa3.f152682l;
                    if (btvw2 != null) {
                        if (bxvd9.f164950c) {
                            bxvd9.mo74035c();
                            bxvd9.f164950c = false;
                        }
                        btvw2.getClass();
                        ((btwa) bxvd9.f164949b).f152682l = btvw2;
                    }
                    btwa btwa4 = (btwa) bxvd9.mo74062i();
                    if (bxvd8.f164950c) {
                        bxvd8.mo74035c();
                        bxvd8.f164950c = false;
                    }
                    btwa4.getClass();
                    ((btwb) bxvd8.f164949b).f152685a = btwa4;
                }
                btvz btvz = btwb3.f152686b;
                if (btvz != null) {
                    if (bxvd8.f164950c) {
                        bxvd8.mo74035c();
                        bxvd8.f164950c = false;
                    }
                    btvz.getClass();
                    ((btwb) bxvd8.f164949b).f152686b = btvz;
                }
                btwb btwb4 = (btwb) bxvd8.mo74062i();
                if (bxvd7.f164950c) {
                    bxvd7.mo74035c();
                    bxvd7.f164950c = false;
                }
                btwb4.getClass();
                ((btvy) bxvd7.f164949b).f152662a = btwb4;
            }
            btwg btwg = btvy3.f152666e;
            if (btwg != null) {
                if (bxvd7.f164950c) {
                    bxvd7.mo74035c();
                    bxvd7.f164950c = false;
                }
                btwg.getClass();
                ((btvy) bxvd7.f164949b).f152666e = btwg;
            }
            btwn btwn = btvy3.f152663b;
            if (btwn != null) {
                if (bxvd7.f164950c) {
                    bxvd7.mo74035c();
                    bxvd7.f164950c = false;
                }
                btwn.getClass();
                ((btvy) bxvd7.f164949b).f152663b = btwn;
            }
            this.f152608a = (btvy) bxvd7.mo74062i();
        }
        try {
            return new AndroidInertialAnchor(this);
        } catch (UnsatisfiedLinkError e) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo72440a(int i) {
        bxvd bxvd = this.f152615i;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        btwd btwd = btwd.f152690c;
        ((btwd) bxvd.f164949b).f152692a = i;
    }

    /* renamed from: a */
    public final void mo72441a(boolean z) {
        bxvd bxvd = this.f152615i;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        btwd btwd = btwd.f152690c;
        ((btwd) bxvd.f164949b).f152693b = z;
        this.f152611d = z;
    }
}
