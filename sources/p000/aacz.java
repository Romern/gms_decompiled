package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Binder;
import android.os.Build;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: aacz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aacz {
    /* renamed from: a */
    private static int m21110a(Context context, String str) {
        try {
            return svr.m36484b(context).mo26176b(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("LogUtils", str.length() == 0 ? new String("Could not find package info for package: ") : "Could not find package info for package: ".concat(str));
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01be A[Catch:{ all -> 0x01d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c1 A[Catch:{ all -> 0x01d4 }] */
    /* renamed from: a */
    static void m21111a(Context context, int i, Account account, String str) {
        bxvd da;
        bxvd da2;
        String str2;
        if (cear.f182181a.mo6606a().mo78700c()) {
            bxvd da3 = aafk.f28015f.mo74144da();
            bxvd da4 = aafq.f28042c.mo74144da();
            int i2 = 11;
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    i2 = 2;
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    aafq aafq = (aafq) da4.f164949b;
                    aafq.f28045b = i2 - 1;
                    aafq.f28044a |= 1;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    aafk aafk = (aafk) da3.f164949b;
                    aafq aafq2 = (aafq) da4.mo74062i();
                    aafq2.getClass();
                    aafk.f28020d = aafq2;
                    aafk.f28017a |= 67108864;
                    da = aafn.f28027i.mo74144da();
                    String valueOf = String.valueOf(rfi.f42869b);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    aafn aafn = (aafn) da.f164949b;
                    valueOf.getClass();
                    aafn.f28029a |= 16;
                    aafn.f28033e = valueOf;
                    long a = (long) m21110a(context, "com.google.android.play.games");
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    aafn aafn2 = (aafn) da.f164949b;
                    aafn2.f28029a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    aafn2.f28036h = a;
                    long j = (long) ModuleManager.get(context).getCurrentModule().moduleVersion;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    aafn aafn3 = (aafn) da.f164949b;
                    int i3 = aafn3.f28029a | 64;
                    aafn3.f28029a = i3;
                    aafn3.f28035g = j;
                    if (str != null) {
                        str.getClass();
                        aafn3.f28029a = i3 | 8;
                        aafn3.f28032d = str;
                        String a2 = spn.m35849a(context, str, "com.google.android.gms.games.APP_ID");
                        if (a2 != null) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            aafn aafn4 = (aafn) da.f164949b;
                            a2.getClass();
                            aafn4.f28029a |= 2;
                            aafn4.f28031c = a2;
                        }
                        int a3 = m21110a(context, str);
                        if (a3 > 0) {
                            long j2 = (long) a3;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            aafn aafn5 = (aafn) da.f164949b;
                            aafn5.f28029a |= 32;
                            aafn5.f28034f = j2;
                        }
                    }
                    aafn aafn6 = (aafn) da.mo74062i();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    aafk aafk2 = (aafk) da3.f164949b;
                    aafn6.getClass();
                    aafk2.f28018b = aafn6;
                    aafk2.f28017a |= 1;
                    da2 = aafp.f28038c.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    aafp aafp = (aafp) da2.f164949b;
                    aafp.f28041b = i - 1;
                    aafp.f28040a |= 1;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    aafk aafk3 = (aafk) da3.f164949b;
                    aafp aafp2 = (aafp) da2.mo74062i();
                    aafp2.getClass();
                    aafk3.f28021e = aafp2;
                    aafk3.f28017a |= 134217728;
                    aafk aafk4 = (aafk) da3.mo74062i();
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        if (account == null) {
                            str2 = account.name;
                        } else {
                            str2 = null;
                        }
                        new qws(context, "GAMES", str2).mo24335a(aafk4.mo73642k()).mo24327b();
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                } else {
                    int type = activeNetworkInfo.getType();
                    if (type == 0) {
                        int subtype = activeNetworkInfo.getSubtype();
                        int i4 = Build.VERSION.SDK_INT;
                        switch (subtype) {
                            case 16:
                                i2 = 9;
                                break;
                            case 17:
                                i2 = 10;
                                break;
                            case 18:
                                break;
                            default:
                                switch (subtype) {
                                    case 1:
                                    case 2:
                                    case 4:
                                    case 7:
                                    case 11:
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
                                        break;
                                    case 13:
                                        break;
                                    default:
                                        i2 = 12;
                                        break;
                                }
                        }
                    } else {
                        i2 = type != 1 ? type != 6 ? type != 7 ? type != 9 ? type != 17 ? 3 : 8 : 6 : 7 : 5 : 4;
                    }
                    if (da4.f164950c) {
                    }
                    aafq aafq3 = (aafq) da4.f164949b;
                    aafq3.f28045b = i2 - 1;
                    aafq3.f28044a |= 1;
                    if (da3.f164950c) {
                    }
                    aafk aafk5 = (aafk) da3.f164949b;
                    aafq aafq22 = (aafq) da4.mo74062i();
                    aafq22.getClass();
                    aafk5.f28020d = aafq22;
                    aafk5.f28017a |= 67108864;
                    da = aafn.f28027i.mo74144da();
                    String valueOf2 = String.valueOf(rfi.f42869b);
                    if (da.f164950c) {
                    }
                    aafn aafn7 = (aafn) da.f164949b;
                    valueOf2.getClass();
                    aafn7.f28029a |= 16;
                    aafn7.f28033e = valueOf2;
                    long a4 = (long) m21110a(context, "com.google.android.play.games");
                    if (da.f164950c) {
                    }
                    aafn aafn22 = (aafn) da.f164949b;
                    aafn22.f28029a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    aafn22.f28036h = a4;
                    long j3 = (long) ModuleManager.get(context).getCurrentModule().moduleVersion;
                    if (da.f164950c) {
                    }
                    aafn aafn32 = (aafn) da.f164949b;
                    int i32 = aafn32.f28029a | 64;
                    aafn32.f28029a = i32;
                    aafn32.f28035g = j3;
                    if (str != null) {
                    }
                    aafn aafn62 = (aafn) da.mo74062i();
                    if (da3.f164950c) {
                    }
                    aafk aafk22 = (aafk) da3.f164949b;
                    aafn62.getClass();
                    aafk22.f28018b = aafn62;
                    aafk22.f28017a |= 1;
                    da2 = aafp.f28038c.mo74144da();
                    if (da2.f164950c) {
                    }
                    aafp aafp3 = (aafp) da2.f164949b;
                    aafp3.f28041b = i - 1;
                    aafp3.f28040a |= 1;
                    if (da3.f164950c) {
                    }
                    aafk aafk32 = (aafk) da3.f164949b;
                    aafp aafp22 = (aafp) da2.mo74062i();
                    aafp22.getClass();
                    aafk32.f28021e = aafp22;
                    aafk32.f28017a |= 134217728;
                    aafk aafk42 = (aafk) da3.mo74062i();
                    long clearCallingIdentity2 = Binder.clearCallingIdentity();
                    if (account == null) {
                    }
                    new qws(context, "GAMES", str2).mo24335a(aafk42.mo73642k()).mo24327b();
                }
            } catch (SecurityException e) {
                i2 = 1;
            }
        }
    }
}
