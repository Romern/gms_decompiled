package p000;

import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: axuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axuk implements ayjm {

    /* renamed from: a */
    public final Map f96391a = new ConcurrentHashMap();

    /* renamed from: b */
    public final String f96392b;

    /* renamed from: c */
    public final axxd f96393c;

    /* renamed from: d */
    public volatile axyv f96394d;

    public axuk(String str, axxd axxd) {
        this.f96392b = str;
        this.f96393c = axxd;
    }

    /* renamed from: a */
    public final void mo53582a(ayev ayev, axyt axyt) {
        int i;
        axyv axyv = this.f96394d;
        if (axyv != null) {
            if ((ayev.f97378a & 1) == 0) {
                i = 7;
            } else if (axyt != null) {
                long length = axyt.f96802b.length();
                i = length <= 524288 ? length > 32768 ? 6 : 5 : 2;
            } else {
                i = 7;
            }
            try {
                axyv.mo53700a(i, 0, ayev, axyt);
            } catch (InterruptedException e) {
                Log.w("assets", "interrupted while writing message, will try again later", e);
                Thread.currentThread().interrupt();
            } catch (IOException e2) {
                Log.w("assets", "error while writing message, will try again later", e2);
            }
        }
    }

    /* renamed from: a */
    public final void mo53583a(String str, File file, axue... axueArr) {
        axyt axyt;
        if (this.f96394d != null) {
            axuj axuj = (axuj) this.f96391a.get(str);
            if (axuj == null) {
                if (file != null) {
                    axyt = new axyt(str, file);
                } else {
                    axyt = null;
                }
                bxvd da = ayfb.f97441e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ayfb ayfb = (ayfb) da.f164949b;
                str.getClass();
                ayfb.f97443a |= 1;
                ayfb.f97444b = str;
                axuj = new axuj(da, axyt);
            }
            bxvd da2 = ayeb.f97275b.mo74144da();
            int length = axueArr.length;
            for (int i = 0; i < length; i++) {
                bxvd da3 = ayec.f97279d.mo74144da();
                String str2 = axueArr[i].f96377a;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                ayec ayec = (ayec) da3.f164949b;
                str2.getClass();
                int i2 = ayec.f97281a | 1;
                ayec.f97281a = i2;
                ayec.f97282b = str2;
                String str3 = axueArr[i].f96379c;
                str3.getClass();
                ayec.f97281a = i2 | 2;
                ayec.f97283c = str3;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ayeb ayeb = (ayeb) da2.f164949b;
                ayec ayec2 = (ayec) da3.mo74062i();
                ayec2.getClass();
                if (!ayeb.f97277a.mo73666a()) {
                    ayeb.f97277a = bxvk.m124021a(ayeb.f97277a);
                }
                ayeb.f97277a.add(ayec2);
            }
            bxvd bxvd = axuj.f96390b;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ayfb ayfb2 = (ayfb) bxvd.f164949b;
            ayeb ayeb2 = (ayeb) da2.mo74062i();
            ayfb ayfb3 = ayfb.f97441e;
            ayeb2.getClass();
            ayfb2.f97445c = ayeb2;
            ayfb2.f97443a |= 2;
            this.f96391a.put(str, axuj);
            bxvd da4 = ayev.f97376n.mo74144da();
            bxvd bxvd2 = axuj.f96390b;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            ayev ayev = (ayev) da4.f164949b;
            ayfb ayfb4 = (ayfb) bxvd2.mo74062i();
            ayfb4.getClass();
            ayev.f97379b = ayfb4;
            ayev.f97378a |= 1;
            ayev ayev2 = (ayev) da4.mo74062i();
            if (Log.isLoggable("assets", 3)) {
                String valueOf = String.valueOf(str);
                Log.d("assets", valueOf.length() == 0 ? new String("Sending SetAsset message for ") : "Sending SetAsset message for ".concat(valueOf));
            }
            mo53582a(ayev2, axuj.f96389a);
        }
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        String str;
        String valueOf = String.valueOf(this.f96392b);
        ssb.println(valueOf.length() == 0 ? new String("Peer: ") : "Peer: ".concat(valueOf));
        int size = this.f96391a.size();
        StringBuilder sb = new StringBuilder(30);
        sb.append("Outstanding Sends: ");
        sb.append(size);
        ssb.println(sb.toString());
        for (Map.Entry entry : this.f96391a.entrySet()) {
            String str2 = (String) entry.getKey();
            bxvd bxvd = ((axuj) entry.getValue()).f96390b;
            Locale locale = Locale.US;
            Object[] objArr = new Object[3];
            ayfb ayfb = (ayfb) bxvd.f164949b;
            objArr[0] = ayfb.f97444b;
            objArr[1] = Integer.valueOf(ayfb.f97446d.mo73744a());
            ayeb ayeb = ((ayfb) bxvd.f164949b).f97445c;
            if (ayeb == null) {
                ayeb = ayeb.f97275b;
            }
            if (ayeb == null || ayeb.f97277a.size() == 0) {
                str = "";
            } else {
                str = TextUtils.join(",", ayeb.f97277a);
            }
            objArr[2] = str;
            String format = String.format(locale, "SetAsset{%s,%d,%s}", objArr);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(format).length());
            sb2.append("  ");
            sb2.append(str2);
            sb2.append(", ");
            sb2.append(format);
            ssb.println(sb2.toString());
        }
    }
}
