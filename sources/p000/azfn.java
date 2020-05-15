package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.UUID;

/* renamed from: azfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azfn {

    /* renamed from: a */
    static final chtn f99234a = chtn.m149536a("google.internal.communications.instantmessaging.v1.tachyonerror-bin", new azfm());

    /* renamed from: a */
    public static bxvd m85571a(Context context, LocalEntityId localEntityId) {
        byte[] bArr;
        azcs a = azcv.m85357a(context).mo54689a(localEntityId);
        if (a != null) {
            bArr = a.f99002a;
        } else {
            bArr = null;
        }
        cbmo a2 = m85575a(bArr);
        bxvd bxvd = (bxvd) a2.mo74142c(5);
        bxvd.mo73625a((bxvk) a2);
        if (localEntityId != null) {
            cbma b = localEntityId.mo60371b();
            if (b != null) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                cbmo cbmo = cbmo.f177654h;
                b.getClass();
                ((cbmo) bxvd.f164949b).f177662g = b;
            } else {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                cbmo cbmo2 = cbmo.f177654h;
                ((cbmo) bxvd.f164949b).f177662g = null;
            }
        }
        return bxvd;
    }

    /* renamed from: b */
    private static int m85583b(chus chus) {
        chus chus2 = chus.OK;
        switch (chus.ordinal()) {
            case 1:
                return 4;
            case 2:
            default:
                return 5;
            case 3:
                return 6;
            case 4:
                return 7;
            case 5:
                return 8;
            case 6:
                return 9;
            case 7:
                return 10;
            case 8:
                return 11;
            case 9:
                return 12;
            case 10:
                return 13;
            case 11:
                return 14;
            case 12:
                return 15;
            case 13:
                return 16;
            case 14:
                return 17;
            case 15:
                return 18;
            case 16:
                return 19;
        }
    }

    /* renamed from: c */
    public static boolean m85588c(Throwable th) {
        return (th instanceof chux ? ((chux) th).f189238a.f189233s : th instanceof chuw ? ((chuw) th).f189236a.f189233s : null) == chus.UNAUTHENTICATED;
    }

    /* renamed from: d */
    public static int m85589d(Throwable th) {
        if (th instanceof chuw) {
            return m85583b(((chuw) th).f189236a.f189233s);
        }
        if (th instanceof chux) {
            return m85583b(((chux) th).f189238a.f189233s);
        }
        return th instanceof gid ? 19 : 3;
    }

    /* renamed from: e */
    public static int m85590e(Throwable th) {
        cbms cbms;
        int a;
        chtr b = chuv.m149610b(th);
        int i = 2;
        if (b == null || (cbms = (cbms) b.mo85652b(f99234a)) == null || (((a = cipm.m150697a(cbms.f177675a)) != 0 && a == 2) || (i = cipm.m150697a(cbms.f177675a)) != 0)) {
            return i;
        }
        return 1;
    }

    /* renamed from: b */
    public static cbma m85584b(String str, String str2) {
        bxvd da = cbma.f177591f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbma) da.f164949b).f177593a = cipg.m150690a(5);
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((cbma) da.f164949b).f177594b = str;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str2.getClass();
        ((cbma) da.f164949b).f177595c = str2;
        return (cbma) da.mo74062i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ab  */
    /* renamed from: a */
    public static cbij m85572a(List list, aznz aznz, cbhu cbhu) {
        cbie cbie;
        bxvd bxvd;
        cbii cbii = (cbii) cbij.f177251e.mo74144da();
        int i = aznz.f99776c;
        if (i == 5) {
            bxvd = cbie.f177232b.mo74144da();
            bxvd da = cbid.f177228c.mo74144da();
            String str = aznz.f99777d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbid cbid = (cbid) da.f164949b;
            str.getClass();
            cbid.f177230a = 2;
            cbid.f177231b = str;
            cbid cbid2 = (cbid) da.mo74062i();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cbid2.getClass();
            ((cbie) bxvd.f164949b).f177234a = cbid2;
        } else if (i == 6) {
            bxvd = cbie.f177232b.mo74144da();
            bxvd da2 = cbid.f177228c.mo74144da();
            String str2 = aznz.f99777d;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cbid cbid3 = (cbid) da2.f164949b;
            str2.getClass();
            cbid3.f177230a = 1;
            cbid3.f177231b = str2;
            cbid cbid4 = (cbid) da2.mo74062i();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cbid4.getClass();
            ((cbie) bxvd.f164949b).f177234a = cbid4;
        } else {
            cbie = null;
            if (cbie != null) {
                if (cbii.f164950c) {
                    cbii.mo74035c();
                    cbii.f164950c = false;
                }
                cbie.getClass();
                ((cbij) cbii.f164949b).f177254b = cbie;
            }
            if (cbhu != null) {
                bxvd da3 = cbip.f177281c.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                cbhu.getClass();
                ((cbip) da3.f164949b).f177283a = cbhu;
                if (cbii.f164950c) {
                    cbii.mo74035c();
                    cbii.f164950c = false;
                }
                cbip cbip = (cbip) da3.mo74062i();
                cbip.getClass();
                ((cbij) cbii.f164949b).f177255c = cbip;
            }
            cbii.mo75234a(list);
            return (cbij) cbii.mo74062i();
        }
        cbie = (cbie) bxvd.mo74062i();
        if (cbie != null) {
        }
        if (cbhu != null) {
        }
        cbii.mo75234a(list);
        return (cbij) cbii.mo74062i();
    }

    /* renamed from: b */
    public static boolean m85585b(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: b */
    public static boolean m85586b(Throwable th) {
        chus chus = th instanceof chux ? ((chux) th).f189238a.f189233s : th instanceof chuw ? ((chuw) th).f189236a.f189233s : null;
        return chus == chus.UNAUTHENTICATED || chus == chus.NOT_FOUND;
    }

    /* renamed from: b */
    public static boolean m85587b(byte[] bArr) {
        return cfcv.m138704b() && !azpi.m86080b(bArr);
    }

    /* renamed from: a */
    public static cbma m85573a(String str, int i, String str2) {
        bxvd da = cbma.f177591f.mo74144da();
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((cbma) da.f164949b).f177594b = str;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbma) da.f164949b).f177593a = cipg.m150690a(i);
        if (str2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str2.getClass();
            ((cbma) da.f164949b).f177595c = str2;
        }
        return (cbma) da.mo74062i();
    }

    /* renamed from: a */
    public static cbma m85574a(String str, String str2) {
        bxvd da = cbma.f177591f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbma) da.f164949b).f177593a = cipg.m150690a(3);
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((cbma) da.f164949b).f177594b = str;
        }
        if (str2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str2.getClass();
            ((cbma) da.f164949b).f177595c = str2;
        }
        return (cbma) da.mo74062i();
    }

    /* renamed from: a */
    public static cbmo m85575a(byte[] bArr) {
        bxvd da = cbmo.f177654h.mo74144da();
        bxtx a = bArr == null ? bxtx.f164797b : bxtx.m123261a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((cbmo) da.f164949b).f177659d = a;
        UUID randomUUID = UUID.randomUUID();
        bxtx a2 = bxtx.m123261a(ByteBuffer.allocate(16).putLong(randomUUID.getMostSignificantBits()).putLong(randomUUID.getLeastSignificantBits()).array());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a2.getClass();
        ((cbmo) da.f164949b).f177657b = a2;
        bxvd da2 = cbly.f177579g.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((cbly) da2.f164949b).f177584d = 4;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cbly cbly = (cbly) da2.f164949b;
        cbly.f177581a = 1;
        cbly.f177582b = 33;
        cbly.f177583c = 0;
        cbly.f177586f = 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbly cbly2 = (cbly) da2.mo74062i();
        cbly2.getClass();
        ((cbmo) da.f164949b).f177660e = cbly2;
        return (cbmo) da.mo74062i();
    }

    /* renamed from: a */
    public static String m85576a() {
        String uuid = UUID.randomUUID().toString();
        String l = Long.toString(System.currentTimeMillis());
        StringBuilder sb = new StringBuilder(String.valueOf(uuid).length() + 1 + String.valueOf(l).length());
        sb.append(uuid);
        sb.append("-");
        sb.append(l);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m85577a(Context context, Account account, boolean z) {
        try {
            return gie.m13187a(context, account, !z ? "oauth2:https://www.googleapis.com/auth/tachyon" : "oauth2:https://www.googleapis.com/auth/numberer");
        } catch (UserRecoverableAuthException | IOException e) {
            azoj.m85931a("NetworkUtils", e, "Exception getting authtoken", new Object[0]);
            return null;
        } catch (gid e2) {
            azoj.m85931a("NetworkUtils", e2, "GoogleAuthException getting authtoken", new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static shl m85578a(String str, int i, Context context, boolean z) {
        shl shl = new shl(context, str, i, context.getApplicationInfo().uid, 17408);
        shl.f44482d = z;
        if (cfeo.f183719a.mo6606a().mo81096y()) {
            shl.f44484f = cfeo.f183719a.mo6606a().mo80990ax();
        }
        String h = spn.m35895h(context, context.getPackageName());
        shl.mo25556a("X-Goog-Api-Key", "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
        shl.mo25556a("X-Android-Package", context.getPackageName());
        shl.mo25556a("X-Android-Cert", h);
        String i2 = cfeo.m138878i();
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 9);
        sb.append("grpc-");
        sb.append(i2);
        sb.append("/1/1");
        shl.mo25556a("User-Agent", sb.toString());
        String valueOf = String.valueOf(context.getPackageName());
        String str2 = valueOf.length() == 0 ? new String("android-app://") : "android-app://".concat(valueOf);
        shl.mo25556a("Sec-X-Google-Grpc", "1");
        shl.mo25556a("Origin", str2);
        return shl;
    }

    /* renamed from: a */
    public static boolean m85579a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* renamed from: a */
    private static boolean m85580a(chus chus) {
        return chus == chus.DEADLINE_EXCEEDED || chus == chus.CANCELLED || chus == chus.ABORTED || chus == chus.UNAVAILABLE || chus == chus.RESOURCE_EXHAUSTED;
    }

    /* renamed from: a */
    public static boolean m85581a(Throwable th) {
        if (th instanceof chux) {
            return m85580a(((chux) th).f189238a.f189233s);
        }
        if (th instanceof chuw) {
            return m85580a(((chuw) th).f189236a.f189233s);
        }
        return false;
    }

    /* renamed from: a */
    public static byte[] m85582a(UUID uuid) {
        return ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array();
    }
}
