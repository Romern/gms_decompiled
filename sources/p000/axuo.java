package p000;

import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: axuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axuo implements axyu, ayjm {

    /* renamed from: a */
    public axxv f96404a;

    /* renamed from: b */
    public final Map f96405b = new ConcurrentHashMap();

    /* renamed from: c */
    private final ExecutorService f96406c;

    /* renamed from: d */
    private final Map f96407d = new ConcurrentHashMap();

    /* renamed from: e */
    private final axxd f96408e;

    public axuo(axxd axxd) {
        sdo.m34959a(axxd);
        this.f96408e = axxd;
        this.f96406c = adzl.f62962b.mo25876a(new ayfq("assets", "AssetTransport"));
    }

    /* renamed from: a */
    private final void m83251a(axue axue, String str, boolean z) {
        ayes ayes = (ayes) this.f96405b.get(str);
        if (ayes == null || (ayes.f97364e && !z)) {
            bxvd da = ayes.f97358f.mo74144da();
            String str2 = axue.f96377a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ayes ayes2 = (ayes) da.f164949b;
            str2.getClass();
            int i = ayes2.f97360a | 1;
            ayes2.f97360a = i;
            ayes2.f97361b = str2;
            String str3 = axue.f96379c;
            str3.getClass();
            int i2 = i | 2;
            ayes2.f97360a = i2;
            ayes2.f97362c = str3;
            str.getClass();
            int i3 = i2 | 4;
            ayes2.f97360a = i3;
            ayes2.f97363d = str;
            ayes2.f97360a = i3 | 8;
            ayes2.f97364e = z;
            ayes ayes3 = (ayes) da.mo74062i();
            this.f96405b.put(str, ayes3);
            bxvd da2 = ayev.f97376n.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ayev ayev = (ayev) da2.f164949b;
            ayes3.getClass();
            ayev.f97381d = ayes3;
            ayev.f97378a |= 4;
            ayev ayev2 = (ayev) da2.mo74062i();
            if (Log.isLoggable("assets", 3)) {
                String valueOf = String.valueOf(axue);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33 + String.valueOf(str).length());
                sb.append("Sending FetchAsset message for ");
                sb.append(valueOf);
                sb.append(", ");
                sb.append(str);
                Log.d("assets", sb.toString());
            }
            for (axuk axuk : this.f96407d.values()) {
                axuk.mo53582a(ayev2, null);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axuo.a(axue, java.lang.String, boolean):void
     arg types: [axue, java.lang.String, int]
     candidates:
      axuo.a(java.lang.String, ayev, axyt):void
      axuo.a(ssb, boolean, boolean):void
      axyu.a(java.lang.String, ayev, axyt):void
      ayjm.a(ssb, boolean, boolean):void
      axuo.a(axue, java.lang.String, boolean):void */
    /* renamed from: b */
    public final void mo53592b(axue axue, String str) {
        if (Log.isLoggable("assets", 3)) {
            String valueOf = String.valueOf(axue);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28 + String.valueOf(str).length());
            sb.append("onAssetPermissionMissing: ");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(str);
            Log.d("assets", sb.toString());
        }
        m83251a(axue, str, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axuo.a(axue, java.lang.String, boolean):void
     arg types: [axue, java.lang.String, int]
     candidates:
      axuo.a(java.lang.String, ayev, axyt):void
      axuo.a(ssb, boolean, boolean):void
      axyu.a(java.lang.String, ayev, axyt):void
      ayjm.a(ssb, boolean, boolean):void
      axuo.a(axue, java.lang.String, boolean):void */
    /* renamed from: a */
    public final void mo53587a(axue axue, String str) {
        if (Log.isLoggable("assets", 3)) {
            String valueOf = String.valueOf(axue);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18 + String.valueOf(str).length());
            sb.append("onAssetMissing: ");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(str);
            Log.d("assets", sb.toString());
        }
        m83251a(axue, str, false);
    }

    /* renamed from: a */
    public final void mo53588a(axyv axyv) {
        String str = ((ayan) axyv).f96942b.f96814a;
        axuk axuk = (axuk) this.f96407d.get(str);
        if (axuk == null) {
            axuk = new axuk(str, this.f96408e);
            this.f96407d.put(str, axuk);
        }
        Map map = this.f96405b;
        axuk.f96394d = axyv;
        for (ayes ayes : map.values()) {
            bxvd da = ayev.f97376n.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ayev ayev = (ayev) da.f164949b;
            ayes.getClass();
            ayev.f97381d = ayes;
            ayev.f97378a |= 4;
            axuk.mo53582a((ayev) da.mo74062i(), null);
        }
        for (axuj axuj : axuk.f96391a.values()) {
            bxvd da2 = ayev.f97376n.mo74144da();
            bxvd bxvd = axuj.f96390b;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ayev ayev2 = (ayev) da2.f164949b;
            ayfb ayfb = (ayfb) bxvd.mo74062i();
            ayfb.getClass();
            ayev2.f97379b = ayfb;
            ayev2.f97378a |= 1;
            axuk.mo53582a((ayev) da2.mo74062i(), axuj.f96389a);
        }
    }

    /* renamed from: a */
    public final void mo53589a(String str) {
        axuk axuk = (axuk) this.f96407d.get(str);
        if (axuk != null) {
            axuk.f96394d = null;
        }
    }

    /* renamed from: a */
    public final void mo53590a(String str, ayev ayev, axyt axyt) {
        axuk axuk = (axuk) this.f96407d.get(str);
        if (axuk != null) {
            int i = ayev.f97378a;
            if ((i & 1) != 0) {
                this.f96406c.execute(new axul(this, axuk, ayev, axyt));
            } else if ((i & 4) != 0) {
                this.f96406c.execute(new axum(this, axuk, ayev));
            } else if ((i & 2) != 0) {
                this.f96406c.execute(new axun(axuk, ayev));
            }
        } else {
            Log.e("assets", "Received message from a disconnected node. What?");
        }
    }

    /* renamed from: a */
    public final void mo53591a(String str, boolean z, axxf axxf, axue... axueArr) {
        File file;
        String str2;
        String str3 = str;
        axxf axxf2 = axxf;
        axue[] axueArr2 = axueArr;
        this.f96405b.remove(str3);
        if (z) {
            file = this.f96404a.mo53731a(str3);
            if (file == null) {
                String arrays = Arrays.toString(axueArr);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 62 + String.valueOf(arrays).length());
                sb.append("onAssetAdded: digest ");
                sb.append(str3);
                sb.append(", owners ");
                sb.append(arrays);
                sb.append(", unable to load asset, ignoring");
                Log.w("assets", sb.toString());
                return;
            }
        } else {
            file = null;
        }
        if (Log.isLoggable("assets", 3)) {
            String arrays2 = Arrays.toString(axueArr);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(arrays2).length());
            sb2.append("onAssetAdded: digest ");
            sb2.append(str3);
            sb2.append(", owners ");
            sb2.append(arrays2);
            sb2.append(", sending");
            Log.d("assets", sb2.toString());
        }
        for (axuk axuk : this.f96407d.values()) {
            axyv axyv = axuk.f96394d;
            if (axyv != null) {
                if (!((ayan) axuk.f96394d).f96943c) {
                    if (axxf2 != null) {
                        int length = axueArr2.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                axxi axxi = new axxi(axueArr2[i]);
                                axxi.f96647b = axxf2;
                                if (!axuk.f96393c.mo53708a(axxi, axyv.mo53701b(), false, axuk.f96392b)) {
                                    break;
                                }
                                i++;
                            } else if (length > 0) {
                                if (Log.isLoggable("assets", 2)) {
                                    String arrays3 = Arrays.toString(axueArr);
                                    String str4 = axxf2.f96640b;
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 50 + String.valueOf(arrays3).length() + String.valueOf(str4).length());
                                    sb3.append("filtering asset for peer:, digest=");
                                    sb3.append(str3);
                                    sb3.append(", owners=");
                                    sb3.append(arrays3);
                                    sb3.append(", path=");
                                    sb3.append(str4);
                                    Log.v("assets", sb3.toString());
                                }
                            }
                        }
                    }
                    axuk.mo53583a(str3, file, axueArr2);
                } else if (Log.isLoggable("assets", 2)) {
                    String arrays4 = Arrays.toString(axueArr);
                    if (axxf2 != null) {
                        String valueOf = String.valueOf(axxf2.f96640b);
                        str2 = valueOf.length() == 0 ? new String(" path=") : " path=".concat(valueOf);
                    } else {
                        str2 = "";
                    }
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 43 + String.valueOf(arrays4).length() + String.valueOf(str2).length());
                    sb4.append("filtering asset for btle:, digest=");
                    sb4.append(str3);
                    sb4.append(", owners=");
                    sb4.append(arrays4);
                    sb4.append(str2);
                    Log.v("assets", sb4.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        int size = this.f96405b.size();
        StringBuilder sb = new StringBuilder(32);
        sb.append("Outstanding Fetches: ");
        sb.append(size);
        ssb.println(sb.toString());
        for (Map.Entry entry : this.f96405b.entrySet()) {
            String str = (String) entry.getKey();
            ayes ayes = (ayes) entry.getValue();
            String format = String.format("FetchAsset{%s,%s,permissionCheck=%s}", ayes.f97361b, ayes.f97363d, Boolean.valueOf(ayes.f97364e));
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(format).length());
            sb2.append("  ");
            sb2.append(str);
            sb2.append(", ");
            sb2.append(format);
            ssb.println(sb2.toString());
        }
        for (axuk axuk : this.f96407d.values()) {
            axuk.mo53558a(ssb, z, z2);
        }
    }
}
