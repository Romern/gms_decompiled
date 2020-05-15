package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: azph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azph {

    /* renamed from: j */
    private static WeakReference f99814j = new WeakReference(null);

    /* renamed from: a */
    public final qws f99815a;

    /* renamed from: b */
    public final qxq f99816b;

    /* renamed from: c */
    public final azdl f99817c;

    /* renamed from: d */
    public final Context f99818d;

    /* renamed from: e */
    public final azcv f99819e;

    /* renamed from: f */
    private final TelephonyManager f99820f = ((TelephonyManager) this.f99818d.getSystemService("phone"));

    /* renamed from: g */
    private final ConnectivityManager f99821g = ((ConnectivityManager) this.f99818d.getSystemService("connectivity"));

    /* renamed from: h */
    private final boolean f99822h = azos.m85958a(this.f99818d, "android.permission.ACCESS_NETWORK_STATE");

    /* renamed from: i */
    private final Executor f99823i;

    public azph(Context context, Executor executor, qws qws, qxq qxq) {
        this.f99818d = context;
        this.f99817c = azdl.m85412a(context);
        this.f99815a = qws;
        this.f99816b = qxq;
        this.f99823i = executor;
        this.f99819e = azcv.m85357a(context);
    }

    /* renamed from: a */
    public static synchronized azph m85998a(Context context) {
        synchronized (azph.class) {
            azph azph = (azph) f99814j.get();
            if (azph != null) {
                return azph;
            }
            Context applicationContext = context.getApplicationContext();
            qws qws = new qws(applicationContext, "MATCHSTICK", null);
            azph azph2 = new azph(applicationContext, snp.m35704b(10), qws, new qxq(qws, "MATCHSTICK_COUNTERS", 1024));
            f99814j = new WeakReference(azph2);
            return azph2;
        }
    }

    /* renamed from: a */
    public static LocalEntityId m86001a(aznz aznz) {
        if (aznz != null) {
            return aznz.f99780g;
        }
        return null;
    }

    /* renamed from: b */
    private final void m86002b() {
        this.f99823i.execute(new azpg(this));
    }

    /* renamed from: c */
    private final boqn m86003c() {
        NetworkInfo activeNetworkInfo;
        int i;
        ConnectivityManager connectivityManager = this.f99821g;
        if (connectivityManager == null || !this.f99822h || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return null;
        }
        int type = activeNetworkInfo.getType();
        bxvd da = boqn.f134292d.mo74144da();
        int i2 = 1;
        if (type == 1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqn boqn = (boqn) da.f164949b;
            boqn.f134295b = 2;
            boqn.f134294a |= 1;
        } else if (type == 0) {
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    i = 7;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i = 8;
                    break;
                case 13:
                case 18:
                case 19:
                    i = 9;
                    break;
                default:
                    i = 6;
                    break;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqn boqn2 = (boqn) da.f164949b;
            boqn2.f134295b = i - 1;
            boqn2.f134294a |= 1;
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 3;
                    break;
                case 3:
                    i2 = 4;
                    break;
                case 4:
                    i2 = 5;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                    i2 = 7;
                    break;
                case 7:
                    i2 = 8;
                    break;
                case 8:
                    i2 = 9;
                    break;
                case 9:
                    i2 = 10;
                    break;
                case 10:
                    i2 = 11;
                    break;
                case 11:
                    i2 = 12;
                    break;
                case 12:
                    i2 = 13;
                    break;
                case 13:
                case 18:
                case 19:
                    i2 = 14;
                    break;
                case 14:
                    i2 = 15;
                    break;
                case 15:
                    i2 = 16;
                    break;
                case 16:
                    i2 = 17;
                    break;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqn boqn3 = (boqn) da.f164949b;
            boqn3.f134296c = i2 - 1;
            boqn3.f134294a |= 2;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqn boqn4 = (boqn) da.f164949b;
            boqn4.f134295b = 0;
            boqn4.f134294a |= 1;
        }
        return (boqn) da.mo74062i();
    }

    /* renamed from: d */
    public final void mo55173d(int i, int i2, String str) {
        azqf.m86130a(this.f99818d);
        bmxv b = azqf.m86144b(str, azpd.f99808a);
        if (b.mo66813a()) {
            mo55135a(i, i2, (String) null, (ConversationId) b.mo66814b());
        } else {
            mo55171c(i, i2, str);
        }
    }

    /* renamed from: b */
    public final bxvd mo55164b(int i, int i2, String str, String str2, String str3, ConversationId conversationId) {
        bxvd da = boqd.f134234x.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqd boqd = (boqd) da.f164949b;
        boqd.f134237b = bopu.m111431a(i);
        boqd.f134236a |= 1;
        bxvd da2 = boqh.f134264e.mo74144da();
        bxvd da3 = bzrp.f171179f.mo74144da();
        if (i2 != 0) {
            bxvd da4 = bops.f134177c.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            ((bops) da4.f164949b).f134179a = bopr.m111427a(i2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqd boqd2 = (boqd) da.f164949b;
            bops bops = (bops) da4.mo74062i();
            bops.getClass();
            boqd2.f134245j = bops;
            boqd2.f134236a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if (conversationId != null) {
            bxvd da5 = boqa.f134223d.mo74144da();
            bqhu a = m85999a(conversationId.mo60498a());
            bqhu a2 = m85999a(conversationId.mo60558e());
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            boqa boqa = (boqa) da5.f164949b;
            a.getClass();
            boqa.f134226b = a;
            int i3 = boqa.f134225a | 1;
            boqa.f134225a = i3;
            a2.getClass();
            boqa.f134227c = a2;
            boqa.f134225a = i3 | 2;
            boqa boqa2 = (boqa) da5.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqd boqd3 = (boqd) da.f164949b;
            boqa2.getClass();
            boqd3.f134241f = boqa2;
            boqd3.f134236a |= 16;
        }
        if (str2 != null) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            boqh boqh = (boqh) da2.f164949b;
            str2.getClass();
            boqh.f134266a |= 4;
            boqh.f134269d = str2;
        }
        String b = azpk.m86089a(this.f99818d).mo55179b();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        b.getClass();
        ((bzrp) da3.f164949b).f171181a = b;
        int e = azpk.m86089a(this.f99818d).mo55186e();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        boqh boqh2 = (boqh) da2.f164949b;
        int i4 = e - 1;
        if (e != 0) {
            boqh2.f134267b = i4;
            boqh2.f134266a |= 1;
            if (!azpk.m86089a(this.f99818d).mo55182c().isEmpty()) {
                String c = azpk.m86089a(this.f99818d).mo55182c();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                boqh boqh3 = (boqh) da2.f164949b;
                c.getClass();
                boqh3.f134266a |= 2;
                boqh3.f134268c = c;
            }
            if (str != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boqd boqd4 = (boqd) da.f164949b;
                str.getClass();
                boqd4.f134236a |= 2;
                boqd4.f134238c = str;
            }
            if (str3 != null) {
                bxvd da6 = bzro.f171175c.mo74144da();
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                str3.getClass();
                ((bzro) da6.f164949b).f171178b = str3;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bzro bzro = (bzro) da6.mo74062i();
                bzro.getClass();
                ((bzrp) da3.f164949b).f171185e = bzro;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqd boqd5 = (boqd) da.f164949b;
            boqh boqh4 = (boqh) da2.mo74062i();
            boqh4.getClass();
            boqd5.f134242g = boqh4;
            boqd5.f134236a |= 32;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqd boqd6 = (boqd) da.f164949b;
            bzrp bzrp = (bzrp) da3.mo74062i();
            bzrp.getClass();
            boqd6.f134244i = bzrp;
            boqd6.f134236a |= 128;
            return da;
        }
        throw null;
    }

    /* renamed from: a */
    private static bqhu m85999a(ContactId contactId) {
        bxvd da = bqhu.f140722e.mo74144da();
        int i = contactId.mo60494c().f111365f;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bqhu) da.f164949b).f140724a = i;
        String a = contactId.mo60492a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((bqhu) da.f164949b).f140725b = a;
        String b = contactId.mo60493b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        b.getClass();
        ((bqhu) da.f164949b).f140727d = b;
        if (contactId.mo60495d().mo66813a()) {
            String str = (String) contactId.mo60495d().mo66814b();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((bqhu) da.f164949b).f140726c = str;
        }
        return (bqhu) da.mo74062i();
    }

    /* renamed from: d */
    public final void mo55174d(int i, String str) {
        mo55127a(1404, i, 3, str, (aznz) null);
    }

    /* renamed from: c */
    public final void mo55169c(int i) {
        mo55152a(i, (String) null, (String) null, (ConversationId) null);
    }

    /* renamed from: c */
    public final void mo55170c(int i, int i2) {
        mo55127a(i, i2, 3, (String) null, (aznz) null);
    }

    /* renamed from: c */
    public final void mo55171c(int i, int i2, String str) {
        mo55136a(i, i2, str, null, null, null);
    }

    /* renamed from: c */
    public final void mo55172c(int i, String str) {
        mo55136a(i, 0, str, null, null, null);
    }

    /* renamed from: a */
    static final bzrn m86000a(LocalEntityId localEntityId) {
        cbma b = localEntityId.mo60371b();
        if (b == null) {
            return null;
        }
        bxvd da = bzrn.f171170d.mo74144da();
        String str = b.f177594b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str.getClass();
        ((bzrn) da.f164949b).f171173b = str;
        int b2 = cipg.m150691b(b.f177593a);
        if (b2 == 0) {
            b2 = 1;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bzrn) da.f164949b).f171172a = cipg.m150690a(b2);
        String str2 = b.f177595c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str2.getClass();
        ((bzrn) da.f164949b).f171174c = str2;
        return (bzrn) da.mo74062i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boqd mo55122a(int i, int i2, String str, LocalEntityId localEntityId, String str2, aznz aznz, int i3, String str3, Integer num) {
        int i4;
        bxvd da = boqd.f134234x.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqd boqd = (boqd) da.f164949b;
        boqd.f134237b = bopu.m111431a(i);
        boqd.f134236a |= 1;
        boqn c = m86003c();
        if (c != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqd boqd2 = (boqd) da.f164949b;
            c.getClass();
            boqd2.f134246k = c;
            boqd2.f134236a |= 512;
        }
        bxvd da2 = bzrp.f171179f.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((bzrp) da2.f164949b).f171184d = cipk.m150695a(20);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bzrp bzrp = (bzrp) da2.f164949b;
        if (i2 != 1) {
            bzrp.f171182b = i2 - 2;
            String b = bmxx.m108578b(str);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            b.getClass();
            ((bzrp) da2.f164949b).f171181a = b;
            if (str2 != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boqd boqd3 = (boqd) da.f164949b;
                str2.getClass();
                boqd3.f134236a |= 4096;
                boqd3.f134250o = str2;
            }
            mo55157a(aznz, da);
            if (i != 34) {
                i4 = i != 25 ? i != 86 ? i != 21 ? i != 33 ? i != 35 ? i != 36 ? i == 150 ? 22 : 2 : 9 : 10 : 4 : 8 : 3 : 11;
            } else {
                i4 = 12;
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((bzrp) da2.f164949b).f171183c = i4 - 2;
            if (!(str3 == null && num == null)) {
                bxvd da3 = bzro.f171175c.mo74144da();
                if (str3 != null) {
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    str3.getClass();
                    ((bzro) da3.f164949b).f171178b = str3;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    ((bzro) da3.f164949b).f171177a = intValue;
                }
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bzro bzro = (bzro) da3.mo74062i();
                bzro.getClass();
                ((bzrp) da2.f164949b).f171185e = bzro;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqd boqd4 = (boqd) da.f164949b;
            bzrp bzrp2 = (bzrp) da2.mo74062i();
            bzrp2.getClass();
            boqd4.f134244i = bzrp2;
            boqd4.f134236a |= 128;
            if (localEntityId != null) {
                bzrn a = m86000a(localEntityId);
                if (a != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    boqd boqd5 = (boqd) da.f164949b;
                    a.getClass();
                    boqd5.f134248m = a;
                    boqd5.f134236a |= 2048;
                } else {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    boqd boqd6 = (boqd) da.f164949b;
                    boqd6.f134248m = null;
                    boqd6.f134236a &= -2049;
                }
            }
            if (i3 != 0) {
                bxvd da4 = bops.f134177c.mo74144da();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                ((bops) da4.f164949b).f134179a = bopr.m111427a(i3);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boqd boqd7 = (boqd) da.f164949b;
                bops bops = (bops) da4.mo74062i();
                bops.getClass();
                boqd7.f134245j = bops;
                boqd7.f134236a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            return (boqd) da.mo74062i();
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: b */
    public final void mo55165b(int i) {
        mo55152a(i, (String) null, (String) null, (ConversationId) null);
    }

    /* renamed from: b */
    public final void mo55166b(int i, int i2) {
        mo55136a(i, i2, null, null, null, null);
    }

    /* renamed from: b */
    public final void mo55167b(int i, int i2, String str) {
        bxvd da = boqd.f134234x.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqd boqd = (boqd) da.f164949b;
        boqd.f134237b = bopu.m111431a(i);
        boqd.f134236a |= 1;
        boqn c = m86003c();
        if (c != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqd boqd2 = (boqd) da.f164949b;
            c.getClass();
            boqd2.f134246k = c;
            boqd2.f134236a |= 512;
        }
        bxvd da2 = bops.f134177c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((bops) da2.f164949b).f134179a = bopr.m111427a(i2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqd boqd3 = (boqd) da.f164949b;
        bops bops = (bops) da2.mo74062i();
        bops.getClass();
        boqd3.f134245j = bops;
        boqd3.f134236a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (str == null) {
            boqj boqj = boqj.f134271k;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqd boqd4 = (boqd) da.f164949b;
            boqj.getClass();
            boqd4.f134243h = boqj;
            boqd4.f134236a |= 64;
        } else {
            bxvd da3 = boqj.f134271k.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            boqj boqj2 = (boqj) da3.f164949b;
            str.getClass();
            boqj2.f134273a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            boqj2.f134279g = str;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqd boqd5 = (boqd) da.f164949b;
            boqj boqj3 = (boqj) da3.mo74062i();
            boqj3.getClass();
            boqd5.f134243h = boqj3;
            boqd5.f134236a |= 64;
        }
        mo55158a(da, (LocalEntityId) null);
    }

    /* renamed from: a */
    public final qxo mo55123a(String str) {
        return this.f99816b.mo24389f(str).mo24372a();
    }

    /* renamed from: a */
    public final void mo55124a() {
        if (System.currentTimeMillis() - this.f99817c.f99088a.getLong("clearcut_user_device_info_timestamp_ms", 0) > cfeo.f183719a.mo6606a().mo80955aO()) {
            bxvd da = boqd.f134234x.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqd boqd = (boqd) da.f164949b;
            boqd.f134237b = bopu.m111431a(3);
            boqd.f134236a |= 1;
            boqn c = m86003c();
            if (c != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boqd boqd2 = (boqd) da.f164949b;
                c.getClass();
                boqd2.f134246k = c;
                boqd2.f134236a |= 512;
            }
            bxvd da2 = boqj.f134271k.mo74144da();
            Context context = this.f99818d;
            int i = Build.VERSION.SDK_INT;
            int activeSubscriptionInfoCountMax = SubscriptionManager.from(context).getActiveSubscriptionInfoCountMax();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            boqj boqj = (boqj) da2.f164949b;
            boqj.f134273a |= 4;
            boqj.f134275c = activeSubscriptionInfoCountMax;
            String a = azot.m85961a(this.f99818d, this.f99820f);
            boolean z = !TextUtils.isEmpty(a);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            boqj boqj2 = (boqj) da2.f164949b;
            boqj2.f134273a |= 2;
            boqj2.f134274b = z;
            boolean e = this.f99817c.mo54770e();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            boqj boqj3 = (boqj) da2.f164949b;
            boqj3.f134273a |= 128;
            boqj3.f134278f = e;
            if (e) {
                boolean a2 = bmxi.m108538a(this.f99817c.mo54738a(), a);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                boqj boqj4 = (boqj) da2.f164949b;
                boqj4.f134273a |= 32;
                boqj4.f134277e = a2;
            }
            int length = adyd.m51363a(this.f99818d).mo33916a("com.google").length;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            boqj boqj5 = (boqj) da2.f164949b;
            boqj5.f134273a |= 16;
            boqj5.f134276d = length;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqd boqd3 = (boqd) da.f164949b;
            boqj boqj6 = (boqj) da2.mo74062i();
            boqj6.getClass();
            boqd3.f134243h = boqj6;
            boqd3.f134236a |= 64;
            azdl azdl = this.f99817c;
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences.Editor edit = azdl.f99088a.edit();
            edit.putLong("clearcut_user_device_info_timestamp_ms", currentTimeMillis);
            edit.apply();
            mo55158a(da, (LocalEntityId) null);
            this.f99823i.execute(new azpf(this));
        }
    }

    /* renamed from: b */
    public final void mo55168b(int i, String str) {
        mo55150a(i, str, (String) null);
    }

    /* renamed from: a */
    public final void mo55125a(int i) {
        mo55141a(i, (LocalEntityId) null);
    }

    /* renamed from: a */
    public final void mo55126a(int i, int i2) {
        mo55127a(i, i2, 3, (String) null, (aznz) null);
    }

    /* renamed from: a */
    public final void mo55127a(int i, int i2, int i3, String str, aznz aznz) {
        bxvd da = boqd.f134234x.mo74144da();
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqd boqd = (boqd) da.f164949b;
            str.getClass();
            boqd.f134236a |= 4096;
            boqd.f134250o = str;
        } else if (aznz != null) {
            String str2 = aznz.f99775b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqd boqd2 = (boqd) da.f164949b;
            str2.getClass();
            boqd2.f134236a |= 4096;
            boqd2.f134250o = str2;
        }
        mo55157a(aznz, da);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqd boqd3 = (boqd) da.f164949b;
        boqd3.f134237b = bopu.m111431a(i);
        boqd3.f134236a |= 1;
        boqn c = m86003c();
        if (c != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqd boqd4 = (boqd) da.f164949b;
            c.getClass();
            boqd4.f134246k = c;
            boqd4.f134236a |= 512;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqd boqd5 = (boqd) da.f164949b;
            boqd5.f134246k = null;
            boqd5.f134236a &= -513;
        }
        bxvd da2 = bops.f134177c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((bops) da2.f164949b).f134179a = bopr.m111427a(i2);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bops bops = (bops) da2.f164949b;
        if (i3 != 1) {
            bops.f134180b = i3 - 2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqd boqd6 = (boqd) da.f164949b;
            bops bops2 = (bops) da2.mo74062i();
            bops2.getClass();
            boqd6.f134245j = bops2;
            boqd6.f134236a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            mo55158a(da, m86001a(aznz));
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: a */
    public final void mo55128a(int i, int i2, aznz aznz) {
        mo55127a(i, i2, 3, (String) null, aznz);
    }

    /* renamed from: a */
    public final void mo55129a(int i, int i2, ConversationId conversationId) {
        mo55135a(i, i2, (String) null, conversationId);
    }

    /* renamed from: a */
    public final void mo55130a(int i, int i2, String str) {
        mo55127a(i, i2, 3, str, (aznz) null);
    }

    /* renamed from: a */
    public final void mo55131a(int i, int i2, String str, aznz aznz) {
        mo55134a(i, i2, str, null, aznz != null ? aznz.f99775b : null, aznz, 0, null, null, null);
    }

    /* renamed from: a */
    public final void mo55132a(int i, int i2, String str, LocalEntityId localEntityId, aznz aznz) {
        aznz aznz2 = aznz;
        mo55134a(i, i2, str, localEntityId, aznz2 != null ? aznz2.f99775b : null, aznz, 0, null, null, null);
    }

    /* renamed from: a */
    public final void mo55133a(int i, int i2, String str, LocalEntityId localEntityId, String str2, aznz aznz, int i3) {
        mo55134a(i, i2, str, localEntityId, str2, aznz, i3, null, null, null);
    }

    /* renamed from: a */
    public final void mo55134a(int i, int i2, String str, LocalEntityId localEntityId, String str2, aznz aznz, int i3, String str3, Integer num, LocalEntityId localEntityId2) {
        boqd a = mo55122a(i, i2, str, localEntityId, str2, aznz, i3, str3, num);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (localEntityId2 == null) {
            localEntityId2 = m86001a(aznz);
        }
        mo55158a(bxvd, localEntityId2);
    }

    /* renamed from: a */
    public final void mo55135a(int i, int i2, String str, ConversationId conversationId) {
        mo55136a(i, i2, str, null, null, conversationId);
    }

    /* renamed from: a */
    public final void mo55136a(int i, int i2, String str, String str2, String str3, ConversationId conversationId) {
        mo55158a(mo55164b(i, i2, str, str2, str3, conversationId), (LocalEntityId) null);
    }

    /* renamed from: a */
    public final void mo55137a(int i, aznz aznz) {
        mo55139a(i, aznz, (String) null, (Boolean) null, (String) null);
    }

    /* renamed from: a */
    public final void mo55138a(int i, aznz aznz, String str, Boolean bool) {
        mo55139a(i, aznz, str, bool, (String) null);
    }

    /* renamed from: a */
    public final void mo55139a(int i, aznz aznz, String str, Boolean bool, String str2) {
        bxvd bxvd;
        bxvd da = boqd.f134234x.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqd boqd = (boqd) da.f164949b;
        boqd.f134237b = bopu.m111431a(i);
        boqd.f134236a |= 1;
        if (aznz != null) {
            String str3 = aznz.f99775b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqd boqd2 = (boqd) da.f164949b;
            str3.getClass();
            boqd2.f134236a |= 4096;
            boqd2.f134250o = str3;
            mo55157a(aznz, da);
        }
        if (str != null) {
            boqd boqd3 = (boqd) da.f164949b;
            if ((boqd3.f134236a & 128) == 0) {
                bxvd = bzrp.f171179f.mo74144da();
            } else {
                bzrp bzrp = boqd3.f134244i;
                if (bzrp == null) {
                    bzrp = bzrp.f171179f;
                }
                bxvd bxvd2 = (bxvd) bzrp.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) bzrp);
                bxvd = bxvd2;
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            str.getClass();
            ((bzrp) bxvd.f164949b).f171181a = str;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqd boqd4 = (boqd) da.f164949b;
            bzrp bzrp2 = (bzrp) bxvd.mo74062i();
            bzrp2.getClass();
            boqd4.f134244i = bzrp2;
            boqd4.f134236a |= 128;
        }
        if (bool != null) {
            bxvd da2 = boqr.f134308c.mo74144da();
            int i2 = !bool.booleanValue() ? 3 : 2;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            boqr boqr = (boqr) da2.f164949b;
            boqr.f134311b = i2 - 1;
            boqr.f134310a |= 1;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqd boqd5 = (boqd) da.f164949b;
            boqr boqr2 = (boqr) da2.mo74062i();
            boqr2.getClass();
            boqd5.f134254s = boqr2;
            boqd5.f134236a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        }
        if (str2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqd boqd6 = (boqd) da.f164949b;
            str2.getClass();
            boqd6.f134236a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
            boqd6.f134255t = str2;
        }
        mo55158a(da, m86001a(aznz));
    }

    /* renamed from: a */
    public final void mo55140a(int i, bctr bctr) {
        mo55152a(i, bctr.mo57359a(), (String) null, bctr.mo57361c());
    }

    /* renamed from: a */
    public final void mo55141a(int i, LocalEntityId localEntityId) {
        mo55143a(i, localEntityId, (String) null);
    }

    /* renamed from: a */
    public final void mo55142a(int i, LocalEntityId localEntityId, int i2) {
        bxvd da = boqd.f134234x.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqd boqd = (boqd) da.f164949b;
        boqd.f134237b = bopu.m111431a(i);
        boqd.f134236a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqd boqd2 = (boqd) da.f164949b;
        boqd2.f134251p = i2 - 1;
        boqd2.f134236a |= 8192;
        mo55158a(da, localEntityId);
    }

    /* renamed from: a */
    public final void mo55143a(int i, LocalEntityId localEntityId, String str) {
        mo55144a(i, localEntityId, str, 2);
    }

    /* renamed from: a */
    public final void mo55144a(int i, LocalEntityId localEntityId, String str, int i2) {
        bxvd da = boqd.f134234x.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqd boqd = (boqd) da.f164949b;
        boqd.f134237b = bopu.m111431a(i);
        boqd.f134236a |= 1;
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqd boqd2 = (boqd) da.f164949b;
            str.getClass();
            boqd2.f134236a |= 4096;
            boqd2.f134250o = str;
        }
        int a = cbhs.m127866a(i2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqd boqd3 = (boqd) da.f164949b;
        boqd3.f134236a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        boqd3.f134252q = a;
        mo55158a(da, localEntityId);
    }

    /* renamed from: a */
    public final void mo55145a(int i, LocalEntityId localEntityId, String str, String[] strArr, String[] strArr2) {
        bxvd da = boqd.f134234x.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqd boqd = (boqd) da.f164949b;
        boqd.f134237b = bopu.m111431a(i);
        boqd.f134236a |= 1;
        ArrayList arrayList = new ArrayList();
        if (strArr != null) {
            for (String str2 : strArr) {
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (strArr2 != null) {
            for (String str3 : strArr2) {
                if (str3 != null) {
                    arrayList2.add(str3);
                }
            }
        }
        bxvd da2 = boqj.f134271k.mo74144da();
        if (str != null) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            boqj boqj = (boqj) da2.f164949b;
            str.getClass();
            boqj.f134273a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            boqj.f134279g = str;
        }
        if (!arrayList.isEmpty()) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            boqj boqj2 = (boqj) da2.f164949b;
            if (!boqj2.f134282j.mo73666a()) {
                boqj2.f134282j = GeneratedMessageLite.m124021a(boqj2.f134282j);
            }
            bxsy.m123078a(arrayList, boqj2.f134282j);
        }
        if (!arrayList2.isEmpty()) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            boqj boqj3 = (boqj) da2.f164949b;
            if (!boqj3.f134281i.mo73666a()) {
                boqj3.f134281i = GeneratedMessageLite.m124021a(boqj3.f134281i);
            }
            bxsy.m123078a(arrayList2, boqj3.f134281i);
        }
        boolean e = this.f99817c.mo54770e();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        boqj boqj4 = (boqj) da2.f164949b;
        boqj4.f134273a |= 128;
        boqj4.f134278f = e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqd boqd2 = (boqd) da.f164949b;
        boqj boqj5 = (boqj) da2.mo74062i();
        boqj5.getClass();
        boqd2.f134243h = boqj5;
        boqd2.f134236a |= 64;
        mo55158a(da, localEntityId);
    }

    /* renamed from: a */
    public final void mo55146a(int i, ConversationId conversationId) {
        mo55152a(i, (String) null, (String) null, conversationId);
    }

    /* renamed from: a */
    public final void mo55147a(int i, String str) {
        mo55143a(i, (LocalEntityId) null, str);
    }

    /* renamed from: a */
    public final void mo55148a(int i, String str, long j) {
        mo55134a(i, 3, null, null, null, null, 0, str, Integer.valueOf((int) j), null);
    }

    /* renamed from: a */
    public final void mo55149a(int i, String str, LocalEntityId localEntityId, aznz aznz, LocalEntityId localEntityId2) {
        aznz aznz2 = aznz;
        mo55134a(i, 3, str, localEntityId, aznz2 != null ? aznz2.f99775b : null, aznz, 0, null, null, localEntityId2);
    }

    /* renamed from: a */
    public final void mo55150a(int i, String str, String str2) {
        azqf.m86130a(this.f99818d);
        bmxv b = azqf.m86144b(str, azoz.f99804a);
        if (b.mo66813a()) {
            mo55152a(i, str2, (String) null, (ConversationId) b.mo66814b());
            return;
        }
        try {
            azqf.m86130a(this.f99818d);
            bmxv b2 = azqf.m86144b(str, azpa.f99805a);
            if (!b2.mo66813a()) {
                azoj.m85933c("UsageStatistics", "Could not map string to ConversationId or Message model", new Object[0]);
                mo55153a(i, str, (String) null, str2);
                return;
            }
            mo55140a(i, (bctr) b2.mo66814b());
        } catch (IllegalStateException e) {
            azoj.m85933c("UsageStatistics", "Could not map string to ConversationId or Message model", new Object[0]);
            mo55153a(i, str, (String) null, str2);
        }
    }

    /* renamed from: a */
    public final void mo55151a(int i, String str, String str2, aznz aznz) {
        int i2;
        if (!azoy.m85984a(str2)) {
            i2 = !azoy.m85988d(str2) ? !azoy.m85989e(str2) ? azoy.m85987c(str2) ? 4 : 2 : 5 : 6;
        } else {
            i2 = 3;
        }
        boqd a = mo55122a(i, 3, str, null, aznz.f99775b, aznz, 0, null, null);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (i2 != 2) {
            boqd boqd = (boqd) bxvd.f164949b;
            if ((boqd.f134236a & 4) == 0) {
                bxvd da = boqe.f134259c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boqe boqe = (boqe) da.f164949b;
                boqe.f134262b = bopy.m111438a(i2);
                boqe.f134261a |= 2;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boqd boqd2 = (boqd) bxvd.f164949b;
                boqe boqe2 = (boqe) da.mo74062i();
                boqd boqd3 = boqd.f134234x;
                boqe2.getClass();
                boqd2.f134239d = boqe2;
                boqd2.f134236a |= 4;
            } else {
                boqe boqe3 = boqd.f134239d;
                if (boqe3 == null) {
                    boqe3 = boqe.f134259c;
                }
                bxvd bxvd2 = (bxvd) boqe3.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) boqe3);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                boqe boqe4 = (boqe) bxvd2.f164949b;
                boqe4.f134262b = bopy.m111438a(i2);
                boqe4.f134261a |= 2;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boqd boqd4 = (boqd) bxvd.f164949b;
                boqe boqe5 = (boqe) bxvd2.mo74062i();
                boqd boqd5 = boqd.f134234x;
                boqe5.getClass();
                boqd4.f134239d = boqe5;
                boqd4.f134236a |= 4;
            }
        }
        mo55158a(bxvd, m86001a(aznz));
    }

    /* renamed from: a */
    public final void mo55152a(int i, String str, String str2, ConversationId conversationId) {
        mo55136a(i, 0, null, str, str2, conversationId);
    }

    /* renamed from: a */
    public final void mo55153a(int i, String str, String str2, String str3) {
        if (str2 != null) {
            azqf.m86130a(this.f99818d);
            bmxv b = azqf.m86144b(str2, azpc.f99807a);
            if (b.mo66813a()) {
                mo55136a(i, 0, str, str3, null, (ConversationId) b.mo66814b());
                return;
            }
        }
        mo55136a(i, 0, str, str3, null, null);
    }

    /* renamed from: a */
    public final void mo55154a(int i, Throwable th) {
        mo55127a(i, azfn.m85589d(th), azfn.m85590e(th), (String) null, (aznz) null);
    }

    /* renamed from: a */
    public final void mo55155a(int i, Throwable th, aznz aznz) {
        mo55127a(i, azfn.m85589d(th), azfn.m85590e(th), (String) null, aznz);
    }

    /* renamed from: a */
    public final void mo55156a(int i, Throwable th, String str) {
        mo55127a(i, azfn.m85589d(th), azfn.m85590e(th), str, (aznz) null);
    }

    /* renamed from: a */
    public final void mo55157a(aznz aznz, bxvd bxvd) {
        if (aznz != null) {
            bxvd da = boqb.f134228d.mo74144da();
            if (aznz.mo55108f()) {
                cbma a = aznz.mo55103a();
                bxvd da2 = bzrn.f171170d.mo74144da();
                String str = a.f177594b;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str.getClass();
                ((bzrn) da2.f164949b).f171173b = str;
                int b = cipg.m150691b(a.f177593a);
                if (b == 0) {
                    b = 1;
                }
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((bzrn) da2.f164949b).f171172a = cipg.m150690a(b);
                String str2 = a.f177595c;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str2.getClass();
                ((bzrn) da2.f164949b).f171174c = str2;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boqb boqb = (boqb) da.f164949b;
                bzrn bzrn = (bzrn) da2.mo74062i();
                bzrn.getClass();
                boqb.f134231b = bzrn;
                boqb.f134230a |= 4;
            }
            bxvd da3 = bopz.f134219c.mo74144da();
            if (aznz.mo55105c()) {
                String str3 = aznz.f99777d;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bopz bopz = (bopz) da3.f164949b;
                str3.getClass();
                bopz.f134221a = 2;
                bopz.f134222b = str3;
            } else {
                String str4 = aznz.f99777d;
                if (str4 != null) {
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bopz bopz2 = (bopz) da3.f164949b;
                    str4.getClass();
                    bopz2.f134221a = 1;
                    bopz2.f134222b = str4;
                }
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqb boqb2 = (boqb) da.f164949b;
            bopz bopz3 = (bopz) da3.mo74062i();
            bopz3.getClass();
            boqb2.f134232c = bopz3;
            boqb2.f134230a |= 8;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boqd boqd = (boqd) bxvd.f164949b;
            boqb boqb3 = (boqb) da.mo74062i();
            boqd boqd2 = boqd.f134234x;
            boqb3.getClass();
            boqd.f134240e = boqb3;
            boqd.f134236a |= 8;
        }
    }

    /* renamed from: a */
    public final void mo55158a(bxvd bxvd, LocalEntityId localEntityId) {
        bmxy.m108600b(true);
        this.f99823i.execute(new azpe(this, bxvd, localEntityId));
    }

    /* renamed from: a */
    public final void mo55159a(cbbl cbbl) {
        cbbl a = azqh.m86163a(this.f99818d).mo55218a(cbbl);
        azqh.m86163a(this.f99818d);
        mo55152a(1855, (String) null, boan.f132471e.mo68783a().mo68794a(a.serializeToBytes()), (ConversationId) null);
    }

    /* renamed from: a */
    public final void mo55160a(String str, int i) {
        this.f99816b.mo24385d(str).mo24367a(i);
        m86002b();
    }

    /* renamed from: a */
    public final void mo55161a(String str, long j) {
        this.f99816b.mo24387e(str).mo24368a(j);
        m86002b();
    }

    /* renamed from: a */
    public final void mo55162a(String str, LocalEntityId localEntityId, aznz aznz, String str2, int i, int i2, int i3) {
        if (str == null && aznz != null) {
            str = aznz.f99775b;
        }
        mo55133a(i2, i, str2, localEntityId, str, aznz, i3);
    }

    /* renamed from: a */
    public final void mo55163a(qxo qxo) {
        if (qxo != null) {
            qxo.mo24371b();
            m86002b();
        }
    }
}
