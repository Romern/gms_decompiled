package p000;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: tds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tds {

    /* renamed from: a */
    private static WeakReference f45704a = new WeakReference(null);

    /* renamed from: b */
    private final tdr f45705b;

    private tds(Context context) {
        this.f45705b = new tdr(new qws(context.getApplicationContext(), "CONSTELLATION", null));
    }

    /* renamed from: a */
    private static bqjc m36768a(String str, int i, bqjd bqjd) {
        bqjb bqjb = (bqjb) bqjc.f140926e.mo74144da();
        if (bqjb.f164950c) {
            bqjb.mo74035c();
            bqjb.f164950c = false;
        }
        bqjc bqjc = (bqjc) bqjb.f164949b;
        str.getClass();
        bqjc.f140928a |= 1;
        bqjc.f140929b = str;
        bqjc.f140930c = 1;
        bqjc.f140928a |= 2;
        bxvd da = bqiw.f140909f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqiw bqiw = (bqiw) da.f164949b;
        bqiw.f140912b = bqjm.m112924a(i);
        bqiw.f140911a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqiw bqiw2 = (bqiw) da.f164949b;
        bqje bqje = (bqje) bqjd.mo74062i();
        bqje.getClass();
        bqiw2.f140914d = bqje;
        bqiw2.f140911a |= 8;
        bqjb.mo69270a(da);
        return (bqjc) bqjb.mo74062i();
    }

    /* renamed from: b */
    private static bqjc m36778b(String str, int i, bxvd bxvd) {
        bqjb bqjb = (bqjb) bqjc.f140926e.mo74144da();
        if (bqjb.f164950c) {
            bqjb.mo74035c();
            bqjb.f164950c = false;
        }
        bqjc bqjc = (bqjc) bqjb.f164949b;
        str.getClass();
        bqjc.f140928a |= 1;
        bqjc.f140929b = str;
        bqjc.f140930c = 1;
        bqjc.f140928a |= 2;
        bxvd da = bqiw.f140909f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqiw bqiw = (bqiw) da.f164949b;
        bqiw.f140912b = bqjm.m112924a(i);
        bqiw.f140911a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqiw bqiw2 = (bqiw) da.f164949b;
        bqiv bqiv = (bqiv) bxvd.mo74062i();
        bqiv.getClass();
        bqiw2.f140915e = bqiv;
        bqiw2.f140911a |= 16;
        bqjb.mo69270a(da);
        return (bqjc) bqjb.mo74062i();
    }

    /* renamed from: a */
    private static bqjc m36769a(String str, int i, bqjd bqjd, bxvd bxvd) {
        bqjb bqjb = (bqjb) bqjc.f140926e.mo74144da();
        if (bqjb.f164950c) {
            bqjb.mo74035c();
            bqjb.f164950c = false;
        }
        bqjc bqjc = (bqjc) bqjb.f164949b;
        str.getClass();
        bqjc.f140928a |= 1;
        bqjc.f140929b = str;
        bqjc.f140930c = 1;
        bqjc.f140928a |= 2;
        bxvd da = bqiw.f140909f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqiw bqiw = (bqiw) da.f164949b;
        bqiw.f140912b = bqjm.m112924a(i);
        bqiw.f140911a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqiw bqiw2 = (bqiw) da.f164949b;
        bqje bqje = (bqje) bqjd.mo74062i();
        bqje.getClass();
        bqiw2.f140914d = bqje;
        bqiw2.f140911a |= 8;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqiw bqiw3 = (bqiw) da.f164949b;
        bqiv bqiv = (bqiv) bxvd.mo74062i();
        bqiv.getClass();
        bqiw3.f140915e = bqiv;
        bqiw3.f140911a |= 16;
        bqjb.mo69270a(da);
        return (bqjc) bqjb.mo74062i();
    }

    /* renamed from: b */
    public final void mo26414b(UUID uuid, int i, int i2) {
        m36777a(uuid.toString(), i, (cbqy) null, i2, (String) null);
    }

    /* renamed from: b */
    public final void mo26415b(tdx tdx, cbqy cbqy, int i) {
        mo26412a(tdx, cbqy, 26, i, (String) null);
    }

    /* renamed from: a */
    public static bqjc m36770a(String str, int i, bxvd bxvd) {
        bqjb bqjb = (bqjb) bqjc.f140926e.mo74144da();
        if (bqjb.f164950c) {
            bqjb.mo74035c();
            bqjb.f164950c = false;
        }
        bqjc bqjc = (bqjc) bqjb.f164949b;
        str.getClass();
        bqjc.f140928a |= 1;
        bqjc.f140929b = str;
        bqjc.f140930c = 1;
        bqjc.f140928a |= 2;
        bxvd da = bqiw.f140909f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqiw bqiw = (bqiw) da.f164949b;
        bqiw.f140912b = bqjm.m112924a(i);
        bqiw.f140911a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqiw bqiw2 = (bqiw) da.f164949b;
        bqiu bqiu = (bqiu) bxvd.mo74062i();
        bqiu.getClass();
        bqiw2.f140913c = bqiu;
        bqiw2.f140911a |= 4;
        bqjb.mo69270a(da);
        return (bqjc) bqjb.mo74062i();
    }

    /* renamed from: a */
    public static final bqji m36771a(cbqy cbqy) {
        cbok cbok;
        cbok cbok2;
        String str;
        cbqn cbqn;
        String str2;
        cbqn cbqn2;
        bqjh bqjh;
        int i;
        int i2;
        int i3;
        int i4;
        cbqn cbqn3;
        cbqy cbqy2 = cbqy;
        bxvd da = bqji.f140954j.mo74144da();
        if (cbqy2 != null) {
            cbqz cbqz = cbqy2.f178085c;
            if (cbqz == null) {
                cbqz = cbqz.f178091c;
            }
            int i5 = 1;
            if (cbqz.f178093a != 1) {
                cbqz cbqz2 = cbqy2.f178085c;
                if (cbqz2 == null) {
                    cbqz2 = cbqz.f178091c;
                }
                if (cbqz2.f178093a == 2) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bqji bqji = (bqji) da.f164949b;
                    bqji.f140958c = bqke.m112944a(4);
                    bqji.f140956a |= 2;
                }
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bqji bqji2 = (bqji) da.f164949b;
                bqji2.f140958c = bqke.m112944a(3);
                bqji2.f140956a |= 2;
                cbqz cbqz3 = cbqy2.f178085c;
                if (cbqz3 == null) {
                    cbqz3 = cbqz.f178091c;
                }
                if (cbqz3.f178093a == 1) {
                    cbqn = (cbqn) cbqz3.f178094b;
                } else {
                    cbqn = cbqn.f178043d;
                }
                cbqp cbqp = cbqn.f178045a;
                if (cbqp == null) {
                    cbqp = cbqp.f178048c;
                }
                if (cbqp.f178050a.size() > 0) {
                    cbqz cbqz4 = cbqy2.f178085c;
                    if (cbqz4 == null) {
                        cbqz4 = cbqz.f178091c;
                    }
                    if (cbqz4.f178093a == 1) {
                        cbqn3 = (cbqn) cbqz4.f178094b;
                    } else {
                        cbqn3 = cbqn.f178043d;
                    }
                    cbqp cbqp2 = cbqn3.f178045a;
                    if (cbqp2 == null) {
                        cbqp2 = cbqp.f178048c;
                    }
                    str2 = (String) cbqp2.f178050a.get(0);
                } else {
                    str2 = null;
                }
                if (cbqy2.f178087e != null) {
                    cbqz cbqz5 = cbqy2.f178085c;
                    if (cbqz5 == null) {
                        cbqz5 = cbqz.f178091c;
                    }
                    if (cbqz5.f178093a == 1) {
                        cbqn2 = (cbqn) cbqz5.f178094b;
                    } else {
                        cbqn2 = cbqn.f178043d;
                    }
                    cbqp cbqp3 = cbqn2.f178045a;
                    if (cbqp3 == null) {
                        cbqp3 = cbqp.f178048c;
                    }
                    String str3 = cbqp3.f178051b;
                    cbrh cbrh = cbqy2.f178087e;
                    if (cbrh == null) {
                        cbrh = cbrh.f178114t;
                    }
                    if (cbrh != null) {
                        bqjg bqjg = (bqjg) bqjh.f140947f.mo74144da();
                        if (!TextUtils.isEmpty(str3)) {
                            if (bqjg.f164950c) {
                                bqjg.mo74035c();
                                bqjg.f164950c = false;
                            }
                            bqjh bqjh2 = (bqjh) bqjg.f164949b;
                            str3.getClass();
                            bqjh2.f140949a |= 1;
                            bqjh2.f140950b = str3;
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            String a = m36773a(str2);
                            if (bqjg.f164950c) {
                                bqjg.mo74035c();
                                bqjg.f164950c = false;
                            }
                            bqjh bqjh3 = (bqjh) bqjg.f164949b;
                            a.getClass();
                            bqjh3.f140949a |= 2;
                            bqjh3.f140951c = a;
                            str2.getClass();
                            if (!bqjh3.f140953e.mo73666a()) {
                                bqjh3.f140953e = GeneratedMessageLite.m124021a(bqjh3.f140953e);
                            }
                            bqjh3.f140953e.add(str2);
                        }
                        bxvd da2 = bqjf.f140941e.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bqjf bqjf = (bqjf) da2.f164949b;
                        bqjf.f140944b = bqjy.m112938a(5);
                        bqjf.f140943a |= 1;
                        cbob cbob = cbob.UNKNOWN;
                        int i6 = cbrh.f178117b;
                        if (i6 != 0) {
                            i = i6 != 1 ? i6 != 2 ? i6 != 3 ? 0 : 5 : 4 : 3;
                        } else {
                            i = 2;
                        }
                        if (i == 0) {
                            i = 1;
                        }
                        int i7 = i - 2;
                        if (i7 == 1) {
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bqjf bqjf2 = (bqjf) da2.f164949b;
                            bqjf2.f140945c = bqka.m112940a(3);
                            bqjf2.f140943a |= 2;
                        } else if (i7 == 2) {
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bqjf bqjf3 = (bqjf) da2.f164949b;
                            bqjf3.f140945c = bqka.m112940a(4);
                            bqjf3.f140943a |= 2;
                        } else if (i7 != 3) {
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bqjf bqjf4 = (bqjf) da2.f164949b;
                            bqjf4.f140945c = bqka.m112940a(2);
                            bqjf4.f140943a |= 2;
                        } else {
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bqjf bqjf5 = (bqjf) da2.f164949b;
                            bqjf5.f140945c = bqka.m112940a(5);
                            bqjf5.f140943a |= 2;
                        }
                        bqjg.mo69272a(da2);
                        m36776a(bqjg, 6, cbrh.f178118c);
                        cbrd cbrd = cbrh.f178119d;
                        if (cbrd != null) {
                            m36776a(bqjg, 7, cbrd.f178110a);
                            cbrd cbrd2 = cbrh.f178119d;
                            if (cbrd2 == null) {
                                cbrd2 = cbrd.f178108e;
                            }
                            m36776a(bqjg, 8, cbrd2.f178111b);
                            cbrd cbrd3 = cbrh.f178119d;
                            if (cbrd3 == null) {
                                cbrd3 = cbrd.f178108e;
                            }
                            m36776a(bqjg, 9, cbrd3.f178112c);
                        }
                        cbrd cbrd4 = cbrh.f178120e;
                        if (cbrd4 != null) {
                            m36776a(bqjg, 10, cbrd4.f178110a);
                            cbrd cbrd5 = cbrh.f178120e;
                            if (cbrd5 == null) {
                                cbrd5 = cbrd.f178108e;
                            }
                            m36776a(bqjg, 11, cbrd5.f178111b);
                            cbrd cbrd6 = cbrh.f178120e;
                            if (cbrd6 == null) {
                                cbrd6 = cbrd.f178108e;
                            }
                            m36776a(bqjg, 12, cbrd6.f178112c);
                        }
                        int b = cbrf.m128129b(cbrh.f178121f);
                        if (b == 0) {
                            b = 1;
                        }
                        m36775a(bqjg, 13, b);
                        int b2 = cbrf.m128129b(cbrh.f178122g);
                        if (b2 == 0) {
                            b2 = 1;
                        }
                        m36775a(bqjg, 15, b2);
                        m36776a(bqjg, 17, String.valueOf(cbrh.f178127l));
                        m36776a(bqjg, 16, String.valueOf(cbrh.f178126k));
                        bxvd da3 = bqjf.f140941e.mo74144da();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bqjf bqjf6 = (bqjf) da3.f164949b;
                        bqjf6.f140944b = bqjy.m112938a(14);
                        bqjf6.f140943a |= 1;
                        int i8 = cbrh.f178123h;
                        if (i8 != 0) {
                            i2 = i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? 0 : 6 : 5 : 4 : 3;
                        } else {
                            i2 = 2;
                        }
                        if (i2 == 0) {
                            i2 = 1;
                        }
                        int i9 = i2 - 2;
                        if (i9 == 1) {
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bqjf bqjf7 = (bqjf) da3.f164949b;
                            bqjf7.f140945c = bqka.m112940a(7);
                            bqjf7.f140943a |= 2;
                        } else if (i9 == 2) {
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bqjf bqjf8 = (bqjf) da3.f164949b;
                            bqjf8.f140945c = bqka.m112940a(6);
                            bqjf8.f140943a |= 2;
                        } else if (i9 == 3) {
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bqjf bqjf9 = (bqjf) da3.f164949b;
                            bqjf9.f140945c = bqka.m112940a(8);
                            bqjf9.f140943a |= 2;
                        } else if (i9 != 4) {
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bqjf bqjf10 = (bqjf) da3.f164949b;
                            bqjf10.f140945c = bqka.m112940a(9);
                            bqjf10.f140943a |= 2;
                        } else {
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bqjf bqjf11 = (bqjf) da3.f164949b;
                            bqjf11.f140945c = bqka.m112940a(15);
                            bqjf11.f140943a |= 2;
                        }
                        bqjg.mo69272a(da3);
                        bxvd da4 = bqjf.f140941e.mo74144da();
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bqjf bqjf12 = (bqjf) da4.f164949b;
                        bqjf12.f140944b = bqjy.m112938a(19);
                        bqjf12.f140943a |= 1;
                        int i10 = cbrh.f178125j;
                        if (i10 != 0) {
                            i3 = i10 != 1 ? i10 != 2 ? 0 : 4 : 3;
                        } else {
                            i3 = 2;
                        }
                        if (i3 == 0) {
                            i3 = 1;
                        }
                        int i11 = i3 - 2;
                        if (i11 == 1) {
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            bqjf bqjf13 = (bqjf) da4.f164949b;
                            bqjf13.f140945c = bqka.m112940a(18);
                            bqjf13.f140943a |= 2;
                        } else if (i11 != 2) {
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            bqjf bqjf14 = (bqjf) da4.f164949b;
                            bqjf14.f140945c = bqka.m112940a(16);
                            bqjf14.f140943a |= 2;
                        } else {
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            bqjf bqjf15 = (bqjf) da4.f164949b;
                            bqjf15.f140945c = bqka.m112940a(17);
                            bqjf15.f140943a |= 2;
                        }
                        bqjg.mo69272a(da4);
                        bxvd da5 = bqjf.f140941e.mo74144da();
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        bqjf bqjf16 = (bqjf) da5.f164949b;
                        bqjf16.f140944b = bqjy.m112938a(20);
                        bqjf16.f140943a |= 1;
                        int i12 = cbrh.f178116a;
                        if (i12 != 0) {
                            i4 = i12 != 1 ? i12 != 2 ? 0 : 4 : 3;
                        } else {
                            i4 = 2;
                        }
                        if (i4 == 0) {
                            i4 = 1;
                        }
                        int i13 = i4 - 2;
                        if (i13 == 1) {
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            bqjf bqjf17 = (bqjf) da5.f164949b;
                            bqjf17.f140945c = bqka.m112940a(21);
                            bqjf17.f140943a |= 2;
                        } else if (i13 != 2) {
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            bqjf bqjf18 = (bqjf) da5.f164949b;
                            bqjf18.f140945c = bqka.m112940a(19);
                            bqjf18.f140943a |= 2;
                        } else {
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            bqjf bqjf19 = (bqjf) da5.f164949b;
                            bqjf19.f140945c = bqka.m112940a(20);
                            bqjf19.f140943a |= 2;
                        }
                        if (cbrh.f178120e != null) {
                            da5 = bqjf.f140941e.mo74144da();
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            bqjf bqjf20 = (bqjf) da5.f164949b;
                            bqjf20.f140944b = bqjy.m112938a(21);
                            bqjf20.f140943a |= 1;
                            cbrd cbrd7 = cbrh.f178120e;
                            if (cbrd7 == null) {
                                cbrd7 = cbrd.f178108e;
                            }
                            String valueOf = String.valueOf(cbrd7.f178113d);
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            bqjf bqjf21 = (bqjf) da5.f164949b;
                            valueOf.getClass();
                            bqjf21.f140943a |= 4;
                            bqjf21.f140946d = valueOf;
                        }
                        bqjg.mo69272a(da5);
                        bqjh = (bqjh) bqjg.mo74062i();
                    } else {
                        bqjh = null;
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bqji bqji3 = (bqji) da.f164949b;
                    bqjh.getClass();
                    bqji3.f140957b = bqjh;
                    bqji3.f140956a |= 1;
                }
            }
            cbob cbob2 = cbob.UNKNOWN;
            int b3 = cbqx.m128116b(cbqy2.f178086d);
            if (b3 == 0) {
                b3 = 1;
            }
            int i14 = b3 - 2;
            if (i14 == 1) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bqji bqji4 = (bqji) da.f164949b;
                bqji4.f140959d = bqkc.m112942a(3);
                bqji4.f140956a |= 4;
            } else if (i14 == 2) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bqji bqji5 = (bqji) da.f164949b;
                bqji5.f140959d = bqkc.m112942a(4);
                bqji5.f140956a |= 4;
            } else if (i14 == 3) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bqji bqji6 = (bqji) da.f164949b;
                bqji6.f140959d = bqkc.m112942a(5);
                bqji6.f140956a |= 4;
            }
            int i15 = cbqy2.f178083a;
            if (i15 == 4) {
                cbnz cbnz = ((cbqg) cbqy2.f178084b).f178020a;
                if (cbnz != null) {
                    cboa cboa = cbnz.f177785c;
                    if (cboa != null && !cboa.f177790a.isEmpty()) {
                        cboa cboa2 = cbnz.f177785c;
                        if (cboa2 == null) {
                            cboa2 = cboa.f177788b;
                        }
                        String str4 = cboa2.f177790a;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bqji bqji7 = (bqji) da.f164949b;
                        str4.getClass();
                        bqji7.f140956a |= 128;
                        bqji7.f140963h = str4;
                    }
                    cbob a2 = cbob.m128036a(cbnz.f177786d);
                    if (a2 == null) {
                        a2 = cbob.UNRECOGNIZED;
                    }
                    int ordinal = a2.ordinal();
                    if (ordinal == 1) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bqji bqji8 = (bqji) da.f164949b;
                        bqji8.f140960e = bqjt.m112933a(3);
                        bqji8.f140956a |= 8;
                        if (cbnz.f177783a == 3) {
                            String str5 = ((cbok) cbnz.f177784b).f177828a;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bqji bqji9 = (bqji) da.f164949b;
                            str5.getClass();
                            bqji9.f140956a |= 16;
                            bqji9.f140961f = str5;
                            if (cbnz.f177783a != 3) {
                                cbok = cbok.f177826d;
                            } else {
                                cbok = (cbok) cbnz.f177784b;
                            }
                            if (cbok.f177830c != null) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bqji bqji10 = (bqji) da.f164949b;
                                bqji10.f140960e = bqjt.m112933a(4);
                                bqji10.f140956a |= 8;
                            }
                            if (cbnz.f177783a == 3) {
                                cbok2 = (cbok) cbnz.f177784b;
                            } else {
                                cbok2 = cbok.f177826d;
                            }
                            String str6 = cbok2.f177829b;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bqji bqji11 = (bqji) da.f164949b;
                            str6.getClass();
                            bqji11.f140956a |= 512;
                            bqji11.f140964i = str6;
                        }
                    } else if (ordinal == 2) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bqji bqji12 = (bqji) da.f164949b;
                        bqji12.f140960e = bqjt.m112933a(5);
                        bqji12.f140956a |= 8;
                        if (cbnz.f177783a == 6) {
                            String str7 = ((cbom) cbnz.f177784b).f177838a;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bqji bqji13 = (bqji) da.f164949b;
                            str7.getClass();
                            bqji13.f140956a |= 512;
                            bqji13.f140964i = str7;
                        }
                    } else if (ordinal == 3) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bqji bqji14 = (bqji) da.f164949b;
                        bqji14.f140960e = bqjt.m112933a(6);
                        bqji14.f140956a |= 8;
                        if (cbnz.f177783a == 4) {
                            cbnx cbnx = (cbnx) cbnz.f177784b;
                            int i16 = cbnx.f177775b;
                            String str8 = cbnx.f177774a;
                            StringBuilder sb = new StringBuilder(String.valueOf(str8).length() + 13);
                            sb.append(i16);
                            sb.append("::");
                            sb.append(str8);
                            String sb2 = sb.toString();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bqji bqji15 = (bqji) da.f164949b;
                            sb2.getClass();
                            bqji15.f140956a |= 512;
                            bqji15.f140964i = sb2;
                        }
                    } else if (ordinal != 6) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bqji bqji16 = (bqji) da.f164949b;
                        bqji16.f140960e = bqjt.m112933a(2);
                        bqji16.f140956a |= 8;
                    } else {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bqji bqji17 = (bqji) da.f164949b;
                        bqji17.f140960e = bqjt.m112933a(7);
                        bqji17.f140956a |= 8;
                        if (cbnz.f177783a == 8) {
                            cboh cboh = (cboh) cbnz.f177784b;
                            int b4 = cbog.m128044b(cboh.f177816b);
                            if (b4 != 0) {
                                i5 = b4;
                            }
                            String concat = (i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? i5 != 6 ? "UNRECOGNIZED" : "FAILED" : "VERIFIED" : "VERIFYING" : "PREPARING" : "UNKNOWN").concat("::");
                            bxwc bxwc = cboh.f177817c;
                            int i17 = 0;
                            while (true) {
                                str = ",";
                                if (i17 >= bxwc.size()) {
                                    break;
                                }
                                String valueOf2 = String.valueOf(concat);
                                String str9 = ((cboa) bxwc.get(i17)).f177790a;
                                if (i17 >= bxwc.size() - 1) {
                                    str = "::";
                                }
                                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + String.valueOf(str9).length() + str.length());
                                sb3.append(valueOf2);
                                sb3.append(str9);
                                sb3.append(str);
                                concat = sb3.toString();
                                i17++;
                            }
                            bxwc bxwc2 = cboh.f177815a;
                            int i18 = 0;
                            while (i18 < bxwc2.size()) {
                                cbos cbos = (cbos) bxwc2.get(i18);
                                String valueOf3 = String.valueOf(concat);
                                String str10 = cbos.f177857a;
                                String str11 = cbos.f177858b;
                                String str12 = cbos.f177860d;
                                String str13 = cbos.f177859c;
                                String str14 = i18 >= bxwc2.size() + -1 ? "" : str;
                                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 3 + String.valueOf(str10).length() + String.valueOf(str11).length() + String.valueOf(str12).length() + String.valueOf(str13).length() + str14.length());
                                sb4.append(valueOf3);
                                sb4.append(str10);
                                sb4.append(str11);
                                sb4.append("[");
                                sb4.append(str12);
                                sb4.append("-");
                                sb4.append(str13);
                                sb4.append("]");
                                sb4.append(str14);
                                concat = sb4.toString();
                                i18++;
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bqji bqji18 = (bqji) da.f164949b;
                            concat.getClass();
                            bqji18.f140956a |= 512;
                            bqji18.f140964i = concat;
                        }
                    }
                }
            } else if (i15 == 3) {
                String str15 = ((cbra) cbqy2.f178084b).f178097a;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bqji bqji19 = (bqji) da.f164949b;
                str15.getClass();
                bqji19.f140956a |= 32;
                bqji19.f140962g = str15;
            }
        }
        return (bqji) da.mo74062i();
    }

    /* renamed from: a */
    static bxvd m36772a(Throwable th) {
        int i;
        if (th instanceof chuw) {
            i = bqjk.m112922b(((chuw) th).f189236a.f189233s.f189211r);
        } else if (!(th instanceof gid)) {
            i = !(th instanceof IOException) ? !(th instanceof rfw) ? !(th instanceof rfv) ? !(th instanceof RemoteException) ? !(th instanceof InvocationTargetException) ? !(th instanceof NoSuchMethodException) ? !(th instanceof IllegalAccessException) ? !(th instanceof bean) ? !(th instanceof InvalidKeyException) ? !(th instanceof SignatureException) ? !(th instanceof NoSuchAlgorithmException) ? !(th instanceof NoSuchProviderException) ? !(th instanceof SecurityException) ? !(th instanceof InvalidKeySpecException) ? !(th instanceof tdv) ? !(th instanceof tdt) ? th instanceof tdw ? ((tdw) th).f45707b : !(th instanceof InterruptedException) ? !(th instanceof ExecutionException) ? th instanceof TimeoutException ? 60 : 39 : 59 : 58 : 40 : 20 : 35 : 56 : 32 : 31 : 34 : 33 : 24 : 23 : 22 : 21 : 29 : 28 : 27 : 26;
        } else {
            i = 30;
        }
        bxvd da = bqiv.f140904d.mo74144da();
        String str = (String) bmxu.m108565a(th.getMessage(), "");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqiv bqiv = (bqiv) da.f164949b;
        str.getClass();
        bqiv.f140906a |= 2;
        bqiv.f140908c = str;
        bqiv.f140907b = bqjk.m112921a(i);
        bqiv.f140906a |= 1;
        return da;
    }

    /* renamed from: a */
    private static final String m36773a(String str) {
        byte[] bArr = new byte[0];
        try {
            bArr = MessageDigest.getInstance("SHA-1").digest(str.getBytes());
        } catch (NoSuchAlgorithmException e) {
        }
        int length = bArr.length;
        if (length == 0) {
            return "";
        }
        int i = bArr[length - 1] & 255;
        if (length >= 2) {
            i += (bArr[length - 2] & 255) * 256;
        }
        return Integer.toString(i % 10000);
    }

    /* renamed from: a */
    public static synchronized tds m36774a(Context context) {
        tds tds;
        synchronized (tds.class) {
            tds = (tds) f45704a.get();
            if (tds == null) {
                tds = new tds(context);
                f45704a = new WeakReference(tds);
            }
        }
        return tds;
    }

    /* renamed from: a */
    private static final void m36775a(bqjg bqjg, int i, int i2) {
        bxvd da = bqjf.f140941e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqjf bqjf = (bqjf) da.f164949b;
        bqjf.f140944b = bqjy.m112938a(i);
        bqjf.f140943a |= 1;
        cbob cbob = cbob.UNKNOWN;
        int i3 = i2 - 2;
        if (i3 == 1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bqjf bqjf2 = (bqjf) da.f164949b;
            bqjf2.f140945c = bqka.m112940a(12);
            bqjf2.f140943a = 2 | bqjf2.f140943a;
        } else if (i3 != 2) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bqjf bqjf3 = (bqjf) da.f164949b;
            bqjf3.f140945c = bqka.m112940a(10);
            bqjf3.f140943a = 2 | bqjf3.f140943a;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bqjf bqjf4 = (bqjf) da.f164949b;
            bqjf4.f140945c = bqka.m112940a(11);
            bqjf4.f140943a = 2 | bqjf4.f140943a;
        }
        bqjg.mo69272a(da);
    }

    /* renamed from: a */
    private static final void m36776a(bqjg bqjg, int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            bxvd da = bqjf.f140941e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bqjf bqjf = (bqjf) da.f164949b;
            bqjf.f140944b = bqjy.m112938a(i);
            bqjf.f140943a |= 1;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bqjf bqjf2 = (bqjf) da.f164949b;
            str.getClass();
            bqjf2.f140943a |= 4;
            bqjf2.f140946d = str;
            bqjg.mo69272a(da);
        }
    }

    /* renamed from: a */
    private final void m36777a(String str, int i, cbqy cbqy, int i2, String str2) {
        bxvd da = bqiv.f140904d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqiv bqiv = (bqiv) da.f164949b;
        bqiv.f140907b = bqjk.m112921a(i2);
        bqiv.f140906a |= 1;
        if (!TextUtils.isEmpty(str2)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bqiv bqiv2 = (bqiv) da.f164949b;
            str2.getClass();
            bqiv2.f140906a |= 2;
            bqiv2.f140908c = str2;
        }
        if (cbqy != null) {
            bqjd bqjd = (bqjd) bqje.f140932h.mo74144da();
            bqjd.mo69271a(m36771a(cbqy));
            mo26400a(m36769a(str, i, bqjd, da));
            return;
        }
        mo26400a(m36778b(str, i, da));
    }

    /* renamed from: a */
    public final void mo26400a(bqjc bqjc) {
        tdr tdr = this.f45705b;
        sdo.m34970a(true);
        qwo a = tdr.f45703a.mo24333a(bqjc);
        int b = bqjm.m112925b(((bqiw) bqjc.f140931d.get(0)).f140912b);
        if (b == 0) {
            b = 2;
        }
        a.mo24328b(bqjm.m112924a(b));
        a.mo24327b();
    }

    /* renamed from: a */
    public final void mo26401a(UUID uuid, int i) {
        bxvd da = bqiu.f140898e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqiu bqiu = (bqiu) da.f164949b;
        bqiu.f140901b = bqjr.m112930a(i);
        bqiu.f140900a |= 1;
        mo26400a(m36770a(uuid.toString(), 3, da));
    }

    /* renamed from: a */
    public final void mo26402a(UUID uuid, int i, int i2) {
        String uuid2 = uuid.toString();
        bxvd da = bqiu.f140898e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqiu bqiu = (bqiu) da.f164949b;
        bqiu.f140902c = bqjo.m112927a(i2);
        bqiu.f140900a |= 2;
        mo26400a(m36770a(uuid2, i, da));
    }

    /* renamed from: a */
    public final void mo26403a(UUID uuid, int i, int i2, String str) {
        m36777a(uuid.toString(), i, (cbqy) null, i2, str);
    }

    /* renamed from: a */
    public final void mo26404a(UUID uuid, int i, Throwable th) {
        bxvd da = bqiv.f140904d.mo74144da();
        if (th instanceof tdw) {
            int i2 = ((tdw) th).f45707b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bqiv bqiv = (bqiv) da.f164949b;
            bqiv.f140907b = bqjk.m112921a(i2);
            bqiv.f140906a |= 1;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bqiv bqiv2 = (bqiv) da.f164949b;
            bqiv2.f140907b = bqjk.m112921a(37);
            bqiv2.f140906a |= 1;
        }
        if (!TextUtils.isEmpty(th.getMessage())) {
            String message = th.getMessage();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bqiv bqiv3 = (bqiv) da.f164949b;
            message.getClass();
            bqiv3.f140906a |= 2;
            bqiv3.f140908c = message;
        }
        String uuid2 = uuid.toString();
        bxvd da2 = bqiu.f140898e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bqiu bqiu = (bqiu) da2.f164949b;
        bqiu.f140901b = bqjr.m112930a(i);
        bqiu.f140900a |= 1;
        bqjb bqjb = (bqjb) bqjc.f140926e.mo74144da();
        if (bqjb.f164950c) {
            bqjb.mo74035c();
            bqjb.f164950c = false;
        }
        bqjc bqjc = (bqjc) bqjb.f164949b;
        uuid2.getClass();
        bqjc.f140928a |= 1;
        bqjc.f140929b = uuid2;
        bqjc.f140930c = 1;
        bqjc.f140928a |= 2;
        bxvd da3 = bqiw.f140909f.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bqiw bqiw = (bqiw) da3.f164949b;
        bqiw.f140912b = bqjm.m112924a(5);
        bqiw.f140911a = 1 | bqiw.f140911a;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bqiw bqiw2 = (bqiw) da3.f164949b;
        bqiu bqiu2 = (bqiu) da2.mo74062i();
        bqiu2.getClass();
        bqiw2.f140913c = bqiu2;
        bqiw2.f140911a |= 4;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bqiw bqiw3 = (bqiw) da3.f164949b;
        bqiv bqiv4 = (bqiv) da.mo74062i();
        bqiv4.getClass();
        bqiw3.f140915e = bqiv4;
        bqiw3.f140911a |= 16;
        bqjb.mo69270a(da3);
        mo26400a((bqjc) bqjb.mo74062i());
    }

    /* renamed from: a */
    public final void mo26405a(UUID uuid, int i, boolean z) {
        int i2;
        String uuid2 = uuid.toString();
        bxvd da = bqiu.f140898e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqiu bqiu = (bqiu) da.f164949b;
        bqiu.f140901b = bqjr.m112930a(i);
        bqiu.f140900a |= 1;
        if (!z) {
            i2 = 3;
        } else {
            i2 = 4;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqiu bqiu2 = (bqiu) da.f164949b;
        bqiu2.f140902c = bqjo.m112927a(i2);
        bqiu2.f140900a |= 2;
        mo26400a(m36770a(uuid2, 4, da));
    }

    /* renamed from: a */
    public final void mo26406a(tdx tdx, int i) {
        mo26411a(tdx, (cbqy) null, i);
    }

    /* renamed from: a */
    public final void mo26407a(tdx tdx, int i, int i2) {
        mo26412a(tdx, (cbqy) null, i, i2, (String) null);
    }

    /* renamed from: a */
    public final void mo26408a(tdx tdx, int i, int i2, String str) {
        mo26412a(tdx, (cbqy) null, i, i2, str);
    }

    /* renamed from: a */
    public final void mo26409a(tdx tdx, int i, bqje bqje) {
        String str = tdx.f45708a;
        bxvd bxvd = (bxvd) bqje.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bqje);
        mo26400a(m36768a(str, i, (bqjd) bxvd));
    }

    /* renamed from: a */
    public final void mo26410a(tdx tdx, int i, Throwable th) {
        mo26400a(m36778b(tdx.f45708a, i, m36772a(th)));
    }

    /* renamed from: a */
    public final void mo26411a(tdx tdx, cbqy cbqy, int i) {
        if (cbqy == null) {
            String str = tdx.f45708a;
            bqjb bqjb = (bqjb) bqjc.f140926e.mo74144da();
            if (bqjb.f164950c) {
                bqjb.mo74035c();
                bqjb.f164950c = false;
            }
            bqjc bqjc = (bqjc) bqjb.f164949b;
            str.getClass();
            bqjc.f140928a |= 1;
            bqjc.f140929b = str;
            bqjc.f140930c = 1;
            bqjc.f140928a |= 2;
            bxvd da = bqiw.f140909f.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bqiw bqiw = (bqiw) da.f164949b;
            bqiw.f140912b = bqjm.m112924a(i);
            bqiw.f140911a |= 1;
            bqjb.mo69270a(da);
            mo26400a((bqjc) bqjb.mo74062i());
            return;
        }
        String str2 = tdx.f45708a;
        bqjd bqjd = (bqjd) bqje.f140932h.mo74144da();
        bqjd.mo69271a(m36771a(cbqy));
        mo26400a(m36768a(str2, i, bqjd));
    }

    /* renamed from: a */
    public final void mo26412a(tdx tdx, cbqy cbqy, int i, int i2, String str) {
        m36777a(tdx.f45708a, i, cbqy, i2, str);
    }

    /* renamed from: a */
    public final void mo26413a(tdx tdx, Throwable th, bqje bqje, cbqy cbqy) {
        bxvd bxvd = (bxvd) bqje.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bqje);
        bqjd bqjd = (bqjd) bxvd;
        if (cbqy != null) {
            if (bqjd.f164950c) {
                bqjd.mo74035c();
                bqjd.f164950c = false;
            }
            bqje bqje2 = bqje.f140932h;
            ((bqje) bqjd.f164949b).f140937d = GeneratedMessageLite.m124030de();
            bqjd.mo69271a(m36771a(cbqy));
        }
        mo26400a(m36769a(tdx.f45708a, 9, bqjd, m36772a(th)));
    }
}
