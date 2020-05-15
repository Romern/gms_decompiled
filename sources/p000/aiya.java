package p000;

import android.content.Context;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.MessageType;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.List;

/* renamed from: aiya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiya extends buqb {
    public aiya(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final bywz mo38240a(Message message) {
        bxvd da = bywz.f168689d.mo74144da();
        bxvd da2 = byxb.f168698d.mo74144da();
        String str = message.f80678d;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byxb byxb = (byxb) da2.f164949b;
        str.getClass();
        int i = byxb.f168700a | 1;
        byxb.f168700a = i;
        byxb.f168701b = str;
        String str2 = message.f80677c;
        str2.getClass();
        byxb.f168700a = i | 2;
        byxb.f168702c = str2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bywz bywz = (bywz) da.f164949b;
        byxb byxb2 = (byxb) da2.mo74062i();
        byxb2.getClass();
        bywz.f168692b = byxb2;
        bywz.f168691a |= 1;
        if (message.mo44304c().f80713d != null) {
            long longValue = mo72977b(message.mo44304c().f80713d).longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bywz bywz2 = (bywz) da.f164949b;
            bywz2.f168691a |= 2;
            bywz2.f168693c = longValue;
        }
        return (bywz) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo38241a(int i, aixy aixy) {
        String str;
        String str2;
        bxvd da = bywm.f168613n.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bywm bywm = (bywm) da.f164949b;
        bywm.f168616b = 10;
        bywm.f168615a |= 1;
        bxvd da2 = byvz.f168541e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byvz byvz = (byvz) da2.f164949b;
        byvz.f168544b = 1;
        int i2 = byvz.f168543a | 1;
        byvz.f168543a = i2;
        byvz.f168543a = i2 | 2;
        byvz.f168545c = i;
        bxvd da3 = byvt.f168503i.mo74144da();
        byte a = aixy.mo38150a().mo73744a() == 3 ? ((aixy.mo38150a().mo73743a(0) & 255) << 16) | ((aixy.mo38150a().mo73743a(1) & 255) << 8) | (aixy.mo38150a().mo73743a(2) & 255) : 0;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        byvt byvt = (byvt) da3.f164949b;
        byvt.f168505a |= 1;
        byvt.f168506b = a;
        int b = aixy.mo38151b();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        byvt byvt2 = (byvt) da3.f164949b;
        byvt2.f168505a |= 2;
        byvt2.f168507c = b;
        int c = aixy.mo38152c();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        byvt byvt3 = (byvt) da3.f164949b;
        byvt3.f168505a |= 4;
        byvt3.f168508d = c;
        double d = aixy.mo38153d();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        byvt byvt4 = (byvt) da3.f164949b;
        byvt4.f168505a |= 8;
        byvt4.f168509e = d;
        long longValue = mo72977b(aixy.mo38154e()).longValue();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        byvt byvt5 = (byvt) da3.f164949b;
        byvt5.f168505a |= 16;
        byvt5.f168510f = longValue;
        int f = aixy.mo38156f();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        byvt byvt6 = (byvt) da3.f164949b;
        int i3 = f - 1;
        if (f != 0) {
            byvt6.f168511g = i3;
            byvt6.f168505a |= 32;
            int a2 = ahfz.m55679a();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            byvt byvt7 = (byvt) da3.f164949b;
            byvt7.f168512h = a2 - 1;
            byvt7.f168505a |= 64;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            byvz byvz2 = (byvz) da2.f164949b;
            byvt byvt8 = (byvt) da3.mo74062i();
            byvt8.getClass();
            byvz2.f168546d = byvt8;
            byvz2.f168543a |= 4;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bywm bywm2 = (bywm) da.f164949b;
            byvz byvz3 = (byvz) da2.mo74062i();
            byvz3.getClass();
            bywm2.f168627m = byvz3;
            bywm2.f168615a |= 2048;
            if (cfos.m141988b()) {
                bnsl bnsl = (bnsl) ahfq.f67120a.mo68390d();
                bnsl.mo68432a("aiya", "a", 277, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                byvz byvz4 = ((bywm) da.f164949b).f168627m;
                if (byvz4 == null) {
                    byvz4 = byvz.f168541e;
                }
                int a3 = bzbh.m125612a(byvz4.f168544b);
                if (a3 == 0) {
                    a3 = 1;
                }
                String str3 = a3 != 1 ? "CACHE_TYPE_FAST_PAIR" : "CACHE_TYPE_UNKNOWN";
                byvz byvz5 = ((bywm) da.f164949b).f168627m;
                if (byvz5 == null) {
                    byvz5 = byvz.f168541e;
                }
                byvt byvt9 = byvz5.f168546d;
                if (byvt9 == null) {
                    byvt9 = byvt.f168503i;
                }
                Integer valueOf = Integer.valueOf(byvt9.f168506b);
                byvz byvz6 = ((bywm) da.f164949b).f168627m;
                if (byvz6 == null) {
                    byvz6 = byvz.f168541e;
                }
                byvt byvt10 = byvz6.f168546d;
                if (byvt10 == null) {
                    byvt10 = byvt.f168503i;
                }
                Double valueOf2 = Double.valueOf(byvt10.f168509e);
                String e = aixy.mo38154e();
                byvz byvz7 = ((bywm) da.f164949b).f168627m;
                if (byvz7 == null) {
                    byvz7 = byvz.f168541e;
                }
                byvt byvt11 = byvz7.f168546d;
                if (byvt11 == null) {
                    byvt11 = byvt.f168503i;
                }
                Long valueOf3 = Long.valueOf(byvt11.f168510f);
                byvz byvz8 = ((bywm) da.f164949b).f168627m;
                if (byvz8 == null) {
                    byvz8 = byvz.f168541e;
                }
                byvt byvt12 = byvz8.f168546d;
                if (byvt12 == null) {
                    byvt12 = byvt.f168503i;
                }
                int b2 = bzal.m125583b(byvt12.f168511g);
                if (b2 == 0) {
                    b2 = 1;
                }
                String a4 = bzal.m125582a(b2);
                byvz byvz9 = ((bywm) da.f164949b).f168627m;
                if (byvz9 == null) {
                    byvz9 = byvz.f168541e;
                }
                byvt byvt13 = byvz9.f168546d;
                if (byvt13 == null) {
                    byvt13 = byvt.f168503i;
                }
                int a5 = bvjb.m121166a(byvt13.f168512h);
                if (a5 == 0) {
                    a5 = 1;
                }
                if (a5 == 1) {
                    str2 = "UNKNOWN_USER_TYPE";
                } else if (a5 == 2) {
                    str2 = "PRODUCTION";
                } else if (a5 == 3) {
                    str2 = "MODULEFOOD";
                } else if (a5 == 4) {
                    str2 = "TEST";
                } else if (a5 != 5) {
                    str = "AUTO_TEST";
                    bnsl.mo68429a("NearbyMessagesLogger UPDATE %s, model %s, distance .%2fm, address %s (salted %s), scan mode %s, user type %s", str3, valueOf, valueOf2, e, valueOf3, a4, str);
                } else {
                    str2 = "PRESTO_DOGFOOD";
                }
                str = str2;
                bnsl.mo68429a("NearbyMessagesLogger UPDATE %s, model %s, distance .%2fm, address %s (salted %s), scan mode %s, user type %s", str3, valueOf, valueOf2, e, valueOf3, a4, str);
            }
            mo72976a((String) null, (String) null, (bywm) da.mo74062i());
            return;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo38242a(aixz aixz) {
        bxvd da = bywm.f168613n.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bywm bywm = (bywm) da.f164949b;
        bywm.f168616b = 4;
        bywm.f168615a |= 1;
        bywi bywi = bywi.f168578a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bywm bywm2 = (bywm) da.f164949b;
        bywi.getClass();
        bywm2.f168624j = bywi;
        bywm2.f168615a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        mo38243a(aixz, (bywm) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo38243a(aixz aixz, bywm bywm) {
        int a;
        Long l;
        if (cfos.m141988b() && (a = bzbf.m125610a(bywm.f168616b)) != 0 && a == 6) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68390d();
            bnsl.mo68432a("aiya", "a", 297, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            Integer valueOf = Integer.valueOf(bywm.f168617c);
            bywd bywd = bywm.f168626l;
            if (bywd == null) {
                bywd = bywd.f168555d;
            }
            bxwc bxwc = bywd.f168559c;
            bywd bywd2 = bywm.f168626l;
            if (bywd2 == null) {
                bywd2 = bywd.f168555d;
            }
            bywz bywz = bywd2.f168558b;
            if (bywz == null) {
                bywz = bywz.f168689d;
            }
            if ((bywz.f168691a & 2) != 0) {
                bywd bywd3 = bywm.f168626l;
                if (bywd3 == null) {
                    bywd3 = bywd.f168555d;
                }
                bywz bywz2 = bywd3.f168558b;
                if (bywz2 == null) {
                    bywz2 = bywz.f168689d;
                }
                l = Long.valueOf(bywz2.f168693c);
            } else {
                l = null;
            }
            bnsl.mo68425a("NearbyMessagesLogger RECEIVED, delay=%sms, subscription IDs=%s, salted address=%s", valueOf, bxwc, l);
        }
        ClientAppContext clientAppContext = aixz.f70045a.f80668c;
        mo72976a(clientAppContext.f80723b, clientAppContext.f80724c, bywm);
    }

    /* renamed from: a */
    public final void mo38244a(aixz aixz, MessageFilter messageFilter, Strategy strategy, boolean z) {
        bxvd da = bywm.f168613n.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bywm bywm = (bywm) da.f164949b;
        bywm.f168616b = 3;
        bywm.f168615a |= 1;
        bxvd da2 = bywe.f168560e.mo74144da();
        List list = messageFilter.f80683c;
        for (int i = 0; i < list.size(); i++) {
            MessageType messageType = (MessageType) list.get(i);
            bxvd da3 = byxb.f168698d.mo74144da();
            String str = messageType.f80739b;
            if (str != null) {
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                byxb byxb = (byxb) da3.f164949b;
                str.getClass();
                byxb.f168700a |= 1;
                byxb.f168701b = str;
            }
            String str2 = messageType.f80740c;
            if (str2 != null) {
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                byxb byxb2 = (byxb) da3.f164949b;
                str2.getClass();
                byxb2.f168700a |= 2;
                byxb2.f168702c = str2;
            }
            byxb byxb3 = (byxb) da3.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bywe bywe = (bywe) da2.f164949b;
            byxb3.getClass();
            if (!bywe.f168563b.mo73666a()) {
                bywe.f168563b = GeneratedMessageLite.m124021a(bywe.f168563b);
            }
            bywe.f168563b.add(byxb3);
        }
        bxvd da4 = bywq.f168642f.mo74144da();
        int i2 = strategy.f80692e;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bywq bywq = (bywq) da4.f164949b;
        int i3 = bywq.f168644a | 1;
        bywq.f168644a = i3;
        bywq.f168645b = i2;
        int i4 = strategy.f80693f;
        int i5 = i3 | 2;
        bywq.f168644a = i5;
        bywq.f168646c = i4;
        int i6 = strategy.f80695h;
        int i7 = i5 | 4;
        bywq.f168644a = i7;
        bywq.f168647d = i6;
        int i8 = strategy.f80696i;
        bywq.f168644a = i7 | 8;
        bywq.f168648e = i8;
        bywq bywq2 = (bywq) da4.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bywe bywe2 = (bywe) da2.f164949b;
        bywq2.getClass();
        bywe2.f168564c = bywq2;
        int i9 = bywe2.f168562a | 1;
        bywe2.f168562a = i9;
        bywe2.f168562a = i9 | 2;
        bywe2.f168565d = z;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bywm bywm2 = (bywm) da.f164949b;
        bywe bywe3 = (bywe) da2.mo74062i();
        bywe3.getClass();
        bywm2.f168622h = bywe3;
        bywm2.f168615a |= 64;
        mo38243a(aixz, (bywm) da.mo74062i());
    }
}
