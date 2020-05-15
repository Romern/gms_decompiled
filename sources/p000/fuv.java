package p000;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fuv implements rka, rjz {

    /* renamed from: a */
    public static final boolean f17307a = cbvz.m128694b();

    /* renamed from: e */
    private static final int f17308e = 2;

    /* renamed from: f */
    private static final int f17309f = 3;

    /* renamed from: b */
    public final String f17310b;

    /* renamed from: c */
    public final rkb f17311c;

    /* renamed from: d */
    private final qws f17312d;

    /* renamed from: a */
    public static int m12431a(boolean z, boolean z2) {
        if (!z2) {
            return z ? 4 : 2;
        }
        return 3;
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
    }

    public fuv(Context context, String str) {
        this.f17312d = new qws(context, "SOCIAL_APPINVITE", null);
        rjy rjy = new rjy(context);
        rjy.mo24779a(qws.f42331a);
        rjy.mo24782a((rka) this);
        rjy.mo24781a((rjz) this);
        this.f17311c = rjy.mo24784b();
        this.f17310b = str;
    }

    /* renamed from: a */
    public static boiz m12432a(String str, String str2, String str3, int i, String str4) {
        bxvd da = boiz.f133248g.mo74144da();
        int i2 = 1;
        if (!TextUtils.isEmpty(str)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boiz boiz = (boiz) da.f164949b;
            str.getClass();
            boiz.f133250a |= 1;
            boiz.f133251b = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boiz boiz2 = (boiz) da.f164949b;
            str2.getClass();
            boiz2.f133250a |= 64;
            boiz2.f133255f = str2;
        }
        if (str3 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boiz boiz3 = (boiz) da.f164949b;
            str3.getClass();
            boiz3.f133250a |= 2;
            boiz3.f133252c = str3;
        }
        if (i != 0) {
            int i3 = i - 1;
            if (i3 == 1) {
                i2 = 4;
            } else if (i3 == 2) {
                i2 = 3;
            } else if (i3 == 3 || i3 == 4) {
                i2 = 2;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boiz boiz4 = (boiz) da.f164949b;
            boiz4.f133253d = i2 - 1;
            boiz4.f133250a |= 4;
        }
        if (!TextUtils.isEmpty(str4)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boiz boiz5 = (boiz) da.f164949b;
            str4.getClass();
            boiz5.f133250a |= 16;
            boiz5.f133254e = str4;
        }
        return (boiz) da.mo74062i();
    }

    /* renamed from: a */
    public static bojn m12433a(int i, long j) {
        bxvd da = bojn.f133305d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bojn bojn = (bojn) da.f164949b;
        bojn.f133308b = i - 1;
        int i2 = bojn.f133307a | 1;
        bojn.f133307a = i2;
        bojn.f133307a = i2 | 2;
        bojn.f133309c = j;
        return (bojn) da.mo74062i();
    }

    /* renamed from: a */
    private static void m12434a(List list, int i, int i2, int i3) {
        bxvd da = boit.f133228c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boit boit = (boit) da.f164949b;
        boit.f133231b = 1;
        boit.f133230a |= 1;
        boit boit2 = (boit) da.mo74062i();
        bxvd da2 = boit.f133228c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        boit boit3 = (boit) da2.f164949b;
        boit3.f133231b = 2;
        boit3.f133230a |= 1;
        boit boit4 = (boit) da2.mo74062i();
        bxvd da3 = boit.f133228c.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        boit boit5 = (boit) da3.f164949b;
        boit5.f133231b = 3;
        boit5.f133230a = 1 | boit5.f133230a;
        boit boit6 = (boit) da3.mo74062i();
        for (int i4 = 0; i4 < i; i4++) {
            list.add(boit2);
        }
        for (int i5 = 0; i5 < i2; i5++) {
            list.add(boit4);
        }
        for (int i6 = 0; i6 < i3; i6++) {
            list.add(boit6);
        }
    }

    /* renamed from: a */
    public static void m12435a(List list, int[] iArr) {
        if (list != null && iArr.length >= 4) {
            iArr[0] = iArr[0] + list.size();
            for (int i = 0; i < list.size(); i++) {
                ContactPerson.ContactMethod a = ((ContactPerson) list.get(i)).mo7263a();
                if (a != null) {
                    int i2 = a.f9755a;
                    if (i2 == 0) {
                        iArr[1] = iArr[1] + 1;
                    } else if (i2 == 1) {
                        iArr[2] = iArr[2] + 1;
                    } else if (i2 == 2) {
                        iArr[3] = iArr[3] + 1;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11371a() {
        if (f17307a && !this.f17311c.mo24805i() && !this.f17311c.mo24806j()) {
            this.f17311c.mo24801e();
        }
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        this.f17311c.mo24804h();
    }

    /* renamed from: a */
    public final void mo11372a(Object obj, int i, String str) {
        if (f17307a && obj != null) {
            bxvd da = boir.f133211o.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boir boir = (boir) da.f164949b;
            int i2 = i - 1;
            boir.f133215c = i2;
            int i3 = boir.f133213a | 2;
            boir.f133213a = i3;
            if (str != null) {
                str.getClass();
                i3 |= 1;
                boir.f133213a = i3;
                boir.f133214b = str;
            }
            switch (i2) {
                case 1:
                    bojk bojk = (bojk) obj;
                    bojk.getClass();
                    boir.f133216d = bojk;
                    boir.f133213a = i3 | 4;
                    break;
                case 2:
                    bojo bojo = (bojo) obj;
                    bojo.getClass();
                    boir.f133217e = bojo;
                    boir.f133213a = i3 | 8;
                    break;
                case 3:
                    boja boja = (boja) obj;
                    boja.getClass();
                    boir.f133218f = boja;
                    boir.f133213a = i3 | 16;
                    break;
                case 4:
                    boix boix = (boix) obj;
                    boix.getClass();
                    boir.f133219g = boix;
                    boir.f133213a = i3 | 32;
                    break;
                case 5:
                    bojf bojf = (bojf) obj;
                    bojf.getClass();
                    boir.f133220h = bojf;
                    boir.f133213a = i3 | 64;
                    break;
                case 6:
                    bojh bojh = (bojh) obj;
                    bojh.getClass();
                    boir.f133221i = bojh;
                    boir.f133213a = i3 | 128;
                    break;
                case 7:
                    boji boji = (boji) obj;
                    boji.getClass();
                    boir.f133222j = boji;
                    boir.f133213a = i3 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    break;
                case 8:
                    boin boin = (boin) obj;
                    boin.getClass();
                    boir.f133223k = boin;
                    boir.f133213a = i3 | 512;
                    break;
                case 9:
                    boim boim = (boim) obj;
                    boim.getClass();
                    boir.f133224l = boim;
                    boir.f133213a = i3 | 1024;
                    break;
                case 10:
                    boip boip = (boip) obj;
                    boip.getClass();
                    boir.f133225m = boip;
                    boir.f133213a = i3 | 2048;
                    break;
                default:
                    boiu boiu = (boiu) obj;
                    boiu.getClass();
                    boir.f133226n = boiu;
                    boir.f133213a = i3 | 4096;
                    break;
            }
            qwo a = this.f17312d.mo24335a(((boir) da.mo74062i()).serializeToBytes());
            a.mo24328b(i2);
            a.mo24327b();
        }
    }

    /* renamed from: a */
    public final void mo11373a(boolean z, List list, List list2, List list3, List list4, List list5, String str, String str2, int i, String str3) {
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = new int[4];
        m12435a(list, iArr);
        m12435a(list2, iArr);
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        if (list3 != null) {
            i2 = list3.size();
        } else {
            i2 = 0;
        }
        if (list4 != null) {
            i3 = list4.size();
        } else {
            i3 = 0;
        }
        if (list5 != null) {
            i4 = list5.size();
        } else {
            i4 = 0;
        }
        ArrayList arrayList = new ArrayList();
        m12434a(arrayList, i6, i7, i8);
        ArrayList arrayList2 = new ArrayList();
        m12434a(arrayList2, i2, i3, i4);
        if (!z) {
            i5 = f17309f;
        } else {
            i5 = f17308e;
        }
        bxvd da = bojl.f133295h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bojl bojl = (bojl) da.f164949b;
        int i9 = bojl.f133297a | 16;
        bojl.f133297a = i9;
        bojl.f133300d = i;
        if (str != null) {
            str.getClass();
            i9 |= 4;
            bojl.f133297a = i9;
            bojl.f133298b = str;
        }
        if (str2 != null) {
            str2.getClass();
            i9 |= 8;
            bojl.f133297a = i9;
            bojl.f133299c = str2;
        }
        if (str3 != null) {
            str3.getClass();
            bojl.f133297a = i9 | 32;
            bojl.f133301e = str3;
        }
        if (!arrayList.isEmpty()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bojl bojl2 = (bojl) da.f164949b;
            if (!bojl2.f133302f.mo73666a()) {
                bojl2.f133302f = GeneratedMessageLite.m124021a(bojl2.f133302f);
            }
            bxsy.m123078a(arrayList, bojl2.f133302f);
        }
        if (!arrayList2.isEmpty()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bojl bojl3 = (bojl) da.f164949b;
            if (!bojl3.f133303g.mo73666a()) {
                bojl3.f133303g = GeneratedMessageLite.m124021a(bojl3.f133303g);
            }
            bxsy.m123078a(arrayList2, bojl3.f133303g);
        }
        bojl bojl4 = (bojl) da.mo74062i();
        bxvd da2 = bojk.f133290d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bojk bojk = (bojk) da2.f164949b;
        int i10 = i5 - 1;
        if (i5 != 0) {
            bojk.f133293b = i10;
            int i11 = bojk.f133292a | 1;
            bojk.f133292a = i11;
            bojl4.getClass();
            bojk.f133294c = bojl4;
            bojk.f133292a = i11 | 2;
            mo11372a((bojk) da2.mo74062i(), 2, this.f17310b);
            return;
        }
        throw null;
    }
}
