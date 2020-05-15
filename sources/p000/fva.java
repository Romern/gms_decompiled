package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.model.SourcedContactPerson;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: fva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fva {

    /* renamed from: c */
    private static fva f17324c;

    /* renamed from: a */
    public final fuz f17325a;

    /* renamed from: b */
    public final Context f17326b;

    private fva(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f17326b = applicationContext;
        this.f17325a = new fuz(this.f17326b, new fux(new sgv(applicationContext, cbvz.m128699g(), cbvz.m128698f(), cbvz.m128696d(), cbvz.m128700h(), cbvz.m128695c(), cbvz.m128697e(), "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk")));
    }

    /* renamed from: a */
    public static synchronized fva m12456a(Context context) {
        fva fva;
        synchronized (fva.class) {
            if (f17324c == null) {
                f17324c = new fva(context);
            }
            fva = f17324c;
        }
        return fva;
    }

    /* renamed from: a */
    public final bzfd mo11385a(ClientContext clientContext, String str, String str2, String str3, String str4, String str5, Map map, String str6, String str7, List list, String str8, String str9, String str10, String str11, byte[] bArr, int i, int i2, String str12, String str13, int i3, String str14) {
        int i4;
        int i5;
        int i6;
        ClientContext clientContext2 = clientContext;
        String str15 = str6;
        int i7 = i3;
        fuz fuz = this.f17325a;
        bzex a = fuz.mo11383a(clientContext2.f30215e);
        if (a == null) {
            Log.e("AppInviteAgent", "Error creating ClientIdInfo");
            return null;
        }
        bxvd da = bzfc.f169769n.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzfc bzfc = (bzfc) da.f164949b;
        a.getClass();
        bzfc.f169776e = a;
        bzfc.f169772a |= 4;
        bxvd da2 = bzfz.f169893c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bzfz bzfz = (bzfz) da2.f164949b;
        bzfz.f169896b = 1;
        bzfz.f169895a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzfc bzfc2 = (bzfc) da.f164949b;
        bzfz bzfz2 = (bzfz) da2.mo74062i();
        bzfz2.getClass();
        bzfc2.f169773b = bzfz2;
        bzfc2.f169772a |= 1;
        bzgm a2 = fuz.mo11384a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzfc bzfc3 = (bzfc) da.f164949b;
        a2.getClass();
        bzfc3.f169784m = a2;
        bzfc3.f169772a |= 512;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str9)) {
            bxvd da3 = bzex.f169737g.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bzex bzex = (bzex) da3.f164949b;
            str9.getClass();
            int i8 = bzex.f169739a | 2;
            bzex.f169739a = i8;
            bzex.f169741c = str9;
            bzex.f169740b = 2;
            bzex.f169739a = i8 | 1;
            arrayList.add((bzex) da3.mo74062i());
        }
        if (!TextUtils.isEmpty(str10)) {
            bxvd da4 = bzex.f169737g.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bzex bzex2 = (bzex) da4.f164949b;
            str10.getClass();
            int i9 = bzex2.f169739a | 2;
            bzex2.f169739a = i9;
            bzex2.f169741c = str10;
            bzex2.f169740b = 1;
            bzex2.f169739a = i9 | 1;
            arrayList.add((bzex) da4.mo74062i());
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzfc bzfc4 = (bzfc) da.f164949b;
        if (!bzfc4.f169777f.mo73666a()) {
            bzfc4.f169777f = bxvk.m124021a(bzfc4.f169777f);
        }
        bxsy.m123078a(arrayList, bzfc4.f169777f);
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            SourcedContactPerson sourcedContactPerson = (SourcedContactPerson) list.get(i10);
            ContactPerson contactPerson = sourcedContactPerson.f9758a;
            int a3 = bzgj.m125769a(sourcedContactPerson.f9759b);
            bxvd da5 = bzgf.f169924e.mo74144da();
            bxvd da6 = bzgh.f169931f.mo74144da();
            int i11 = contactPerson.mo7263a().f9755a;
            if (i11 == 0) {
                i4 = size;
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                bzgh bzgh = (bzgh) da6.f164949b;
                bzgh.f169934b = 1;
                int i12 = bzgh.f169933a | 1;
                bzgh.f169933a = i12;
                String str16 = contactPerson.f9750b;
                str16.getClass();
                bzgh.f169933a = i12 | 2;
                bzgh.f169935c = str16;
            } else if (i11 == 1) {
                i4 = size;
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                bzgh bzgh2 = (bzgh) da6.f164949b;
                bzgh2.f169934b = 2;
                bzgh2.f169933a |= 1;
                String str17 = contactPerson.mo7263a().f9756b;
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                bzgh bzgh3 = (bzgh) da6.f164949b;
                str17.getClass();
                bzgh3.f169933a |= 4;
                bzgh3.f169936d = str17;
            } else if (i11 != 2) {
                if (!da6.f164950c) {
                    i6 = 0;
                } else {
                    da6.mo74035c();
                    i6 = 0;
                    da6.f164950c = false;
                }
                bzgh bzgh4 = (bzgh) da6.f164949b;
                bzgh4.f169934b = i6;
                bzgh4.f169933a |= 1;
                i4 = size;
            } else {
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                bzgh bzgh5 = (bzgh) da6.f164949b;
                bzgh5.f169934b = 3;
                bzgh5.f169933a |= 1;
                String str18 = contactPerson.mo7263a().f9756b;
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                bzgh bzgh6 = (bzgh) da6.f164949b;
                str18.getClass();
                i4 = size;
                bzgh6.f169933a |= 8;
                bzgh6.f169937e = str18;
            }
            bzgh bzgh7 = (bzgh) da6.mo74062i();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bzgf bzgf = (bzgf) da5.f164949b;
            bzgh7.getClass();
            bzgf.f169927b = bzgh7;
            bzgf.f169926a |= 1;
            bxvd da7 = bzfg.f169792f.mo74144da();
            int i13 = contactPerson.mo7263a().f9755a;
            if (i13 == 0) {
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bzfg bzfg = (bzfg) da7.f164949b;
                bzfg.f169795b = 1;
                int i14 = bzfg.f169794a | 1;
                bzfg.f169794a = i14;
                String str19 = contactPerson.f9750b;
                str19.getClass();
                bzfg.f169794a = i14 | 2;
                bzfg.f169796c = str19;
            } else if (i13 == 1) {
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bzfg bzfg2 = (bzfg) da7.f164949b;
                bzfg2.f169795b = 2;
                bzfg2.f169794a |= 1;
                String str20 = contactPerson.mo7263a().f9756b;
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bzfg bzfg3 = (bzfg) da7.f164949b;
                str20.getClass();
                bzfg3.f169794a |= 4;
                bzfg3.f169797d = str20;
            } else if (i13 != 2) {
                if (!da7.f164950c) {
                    i5 = 0;
                } else {
                    da7.mo74035c();
                    i5 = 0;
                    da7.f164950c = false;
                }
                bzfg bzfg4 = (bzfg) da7.f164949b;
                bzfg4.f169795b = i5;
                bzfg4.f169794a |= 1;
            } else {
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bzfg bzfg5 = (bzfg) da7.f164949b;
                bzfg5.f169795b = 3;
                bzfg5.f169794a |= 1;
                String str21 = contactPerson.mo7263a().f9756b;
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bzfg bzfg6 = (bzfg) da7.f164949b;
                str21.getClass();
                bzfg6.f169794a |= 8;
                bzfg6.f169798e = str21;
            }
            bzfg bzfg7 = (bzfg) da7.mo74062i();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bzgf bzgf2 = (bzgf) da5.f164949b;
            bzfg7.getClass();
            bzgf2.f169928c = bzfg7;
            bzgf2.f169926a |= 2;
            bxvd da8 = bzgk.f169939c.mo74144da();
            if (a3 == 0) {
                a3 = 1;
            }
            if (da8.f164950c) {
                da8.mo74035c();
                da8.f164950c = false;
            }
            bzgk bzgk = (bzgk) da8.f164949b;
            bzgk.f169942b = a3 - 1;
            bzgk.f169941a |= 1;
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bzgf bzgf3 = (bzgf) da5.f164949b;
            bzgk bzgk2 = (bzgk) da8.mo74062i();
            bzgk2.getClass();
            bzgf3.f169929d = bzgk2;
            bzgf3.f169926a |= 8;
            arrayList2.add((bzgf) da5.mo74062i());
            i10++;
            size = i4;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzfc bzfc5 = (bzfc) da.f164949b;
        if (!bzfc5.f169774c.mo73666a()) {
            bzfc5.f169774c = bxvk.m124021a(bzfc5.f169774c);
        }
        bxsy.m123078a(arrayList2, bzfc5.f169774c);
        if (i7 != 0) {
            bxvd da9 = bzfu.f169871c.mo74144da();
            if (da9.f164950c) {
                da9.mo74035c();
                da9.f164950c = false;
            }
            bzfu bzfu = (bzfu) da9.f164949b;
            bzfu.f169873a |= 1;
            bzfu.f169874b = i7;
            bzfu bzfu2 = (bzfu) da9.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzfc bzfc6 = (bzfc) da.f164949b;
            bzfu2.getClass();
            bzfc6.f169783l = bzfu2;
            bzfc6.f169772a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        bxvd da10 = bzfw.f169881e.mo74144da();
        if (!TextUtils.isEmpty(str2)) {
            if (da10.f164950c) {
                da10.mo74035c();
                da10.f164950c = false;
            }
            bzfw bzfw = (bzfw) da10.f164949b;
            str2.getClass();
            bzfw.f169883a |= 8;
            bzfw.f169886d = str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            if (da10.f164950c) {
                da10.mo74035c();
                da10.f164950c = false;
            }
            bzfw bzfw2 = (bzfw) da10.f164949b;
            str3.getClass();
            bzfw2.f169883a |= 1;
            bzfw2.f169884b = str3;
        }
        if (!TextUtils.isEmpty(str4)) {
            if (da10.f164950c) {
                da10.mo74035c();
                da10.f164950c = false;
            }
            bzfw bzfw3 = (bzfw) da10.f164949b;
            str4.getClass();
            bzfw3.f169883a |= 2;
            bzfw3.f169885c = str4;
        }
        bxvd da11 = bzga.f169897d.mo74144da();
        if (da11.f164950c) {
            da11.mo74035c();
            da11.f164950c = false;
        }
        bzga bzga = (bzga) da11.f164949b;
        str.getClass();
        bzga.f169899a |= 1;
        bzga.f169900b = str;
        bzfw bzfw4 = (bzfw) da10.mo74062i();
        bzfw4.getClass();
        bzga.f169901c = bzfw4;
        bzga.f169899a |= 2;
        bzga bzga2 = (bzga) da11.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzfc bzfc7 = (bzfc) da.f164949b;
        bzga2.getClass();
        bzfc7.f169775d = bzga2;
        bzfc7.f169772a |= 2;
        if (!TextUtils.isEmpty(str7)) {
            bxvd da12 = bzge.f169919d.mo74144da();
            if (da12.f164950c) {
                da12.mo74035c();
                da12.f164950c = false;
            }
            bzge bzge = (bzge) da12.f164949b;
            str7.getClass();
            int i15 = bzge.f169921a | 1;
            bzge.f169921a = i15;
            bzge.f169922b = str7;
            if (str15 != null) {
                str6.getClass();
                bzge.f169921a = i15 | 2;
                bzge.f169923c = str15;
            }
            bzge bzge2 = (bzge) da12.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzfc bzfc8 = (bzfc) da.f164949b;
            bzge2.getClass();
            bzfc8.f169778g = bzge2;
            bzfc8.f169772a |= 8;
        }
        if (!TextUtils.isEmpty(str5) || map != null) {
            bxvd da13 = bzgb.f169902d.mo74144da();
            if (!TextUtils.isEmpty(str5)) {
                if (da13.f164950c) {
                    da13.mo74035c();
                    da13.f164950c = false;
                }
                bzgb bzgb = (bzgb) da13.f164949b;
                str5.getClass();
                bzgb.f169904a |= 1;
                bzgb.f169905b = str5;
            }
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    bxvd da14 = bzgl.f169943d.mo74144da();
                    String str22 = (String) entry.getKey();
                    if (da14.f164950c) {
                        da14.mo74035c();
                        da14.f164950c = false;
                    }
                    bzgl bzgl = (bzgl) da14.f164949b;
                    str22.getClass();
                    bzgl.f169945a |= 1;
                    bzgl.f169946b = str22;
                    String str23 = (String) entry.getValue();
                    if (da14.f164950c) {
                        da14.mo74035c();
                        da14.f164950c = false;
                    }
                    bzgl bzgl2 = (bzgl) da14.f164949b;
                    str23.getClass();
                    bzgl2.f169945a |= 2;
                    bzgl2.f169947c = str23;
                    bzgl bzgl3 = (bzgl) da14.mo74062i();
                    if (da13.f164950c) {
                        da13.mo74035c();
                        da13.f164950c = false;
                    }
                    bzgb bzgb2 = (bzgb) da13.f164949b;
                    bzgl3.getClass();
                    if (!bzgb2.f169906c.mo73666a()) {
                        bzgb2.f169906c = bxvk.m124021a(bzgb2.f169906c);
                    }
                    bzgb2.f169906c.add(bzgl3);
                }
            }
            bzgb bzgb3 = (bzgb) da13.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzfc bzfc9 = (bzfc) da.f164949b;
            bzgb3.getClass();
            bzfc9.f169779h = bzgb3;
            bzfc9.f169772a |= 16;
        }
        if (!TextUtils.isEmpty(str8)) {
            bxvd da15 = bzfk.f169822c.mo74144da();
            bxvd da16 = bzfo.f169844c.mo74144da();
            if (da16.f164950c) {
                da16.mo74035c();
                da16.f164950c = false;
            }
            bzfo bzfo = (bzfo) da16.f164949b;
            str8.getClass();
            bzfo.f169846a |= 1;
            bzfo.f169847b = str8;
            bzfo bzfo2 = (bzfo) da16.mo74062i();
            bxvd da17 = bzfs.f169863c.mo74144da();
            if (da15.f164950c) {
                da15.mo74035c();
                da15.f164950c = false;
            }
            bzfk bzfk = (bzfk) da15.f164949b;
            bzfo2.getClass();
            bzfk.f169825b = bzfo2;
            bzfk.f169824a |= 1;
            if (da17.f164950c) {
                da17.mo74035c();
                da17.f164950c = false;
            }
            bzfs bzfs = (bzfs) da17.f164949b;
            bzfk bzfk2 = (bzfk) da15.mo74062i();
            bzfk2.getClass();
            bzfs.f169866b = bzfk2;
            bzfs.f169865a |= 1;
            bzfs bzfs2 = (bzfs) da17.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzfc bzfc10 = (bzfc) da.f164949b;
            bzfs2.getClass();
            bzfc10.f169781j = bzfs2;
            bzfc10.f169772a |= 64;
        }
        if (!TextUtils.isEmpty(str11)) {
            bxvd da18 = bzfq.f169849g.mo74144da();
            if (da18.f164950c) {
                da18.mo74035c();
                da18.f164950c = false;
            }
            bzfq bzfq = (bzfq) da18.f164949b;
            str11.getClass();
            int i16 = bzfq.f169851a | 2;
            bzfq.f169851a = i16;
            bzfq.f169853c = str11;
            bzfq.f169852b = 1;
            bzfq.f169851a = i16 | 1;
            bzfq bzfq2 = (bzfq) da18.mo74062i();
            bxvd da19 = bzfv.f169875e.mo74144da();
            if (da19.f164950c) {
                da19.mo74035c();
                da19.f164950c = false;
            }
            bzfv bzfv = (bzfv) da19.f164949b;
            bzfq2.getClass();
            bzfv.f169879c = bzfq2;
            bzfv.f169877a |= 2;
            bzfv bzfv2 = (bzfv) da19.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzfc bzfc11 = (bzfc) da.f164949b;
            bzfv2.getClass();
            bzfc11.f169782k = bzfv2;
            bzfc11.f169772a |= 128;
        } else if (bArr != null) {
            bxvd da20 = bzfq.f169849g.mo74144da();
            bxtx a4 = bxtx.m123261a(bArr);
            if (da20.f164950c) {
                da20.mo74035c();
                da20.f164950c = false;
            }
            bzfq bzfq3 = (bzfq) da20.f164949b;
            a4.getClass();
            int i17 = bzfq3.f169851a | 4;
            bzfq3.f169851a = i17;
            bzfq3.f169854d = a4;
            int i18 = i17 | 16;
            bzfq3.f169851a = i18;
            bzfq3.f169855e = i;
            int i19 = i18 | 32;
            bzfq3.f169851a = i19;
            bzfq3.f169856f = i2;
            bzfq3.f169852b = 2;
            bzfq3.f169851a = i19 | 1;
            bzfq bzfq4 = (bzfq) da20.mo74062i();
            bxvd da21 = bzfv.f169875e.mo74144da();
            if (da21.f164950c) {
                da21.mo74035c();
                da21.f164950c = false;
            }
            bzfv bzfv3 = (bzfv) da21.f164949b;
            bzfq4.getClass();
            bzfv3.f169879c = bzfq4;
            bzfv3.f169877a |= 2;
            bzfv bzfv4 = (bzfv) da21.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzfc bzfc12 = (bzfc) da.f164949b;
            bzfv4.getClass();
            bzfc12.f169782k = bzfv4;
            bzfc12.f169772a |= 128;
        }
        if (!TextUtils.isEmpty(str12) || !TextUtils.isEmpty(str13)) {
            if ((((bzfc) da.f164949b).f169772a & 128) == 0) {
                bzfv bzfv5 = bzfv.f169875e;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzfc bzfc13 = (bzfc) da.f164949b;
                bzfv5.getClass();
                bzfc13.f169782k = bzfv5;
                bzfc13.f169772a |= 128;
            }
            if (!TextUtils.isEmpty(str12)) {
                bzfv bzfv6 = ((bzfc) da.f164949b).f169782k;
                if (bzfv6 == null) {
                    bzfv6 = bzfv.f169875e;
                }
                bxvd bxvd = (bxvd) bzfv6.mo74142c(5);
                bxvd.mo73625a((bxvk) bzfv6);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bzfv bzfv7 = (bzfv) bxvd.f164949b;
                str12.getClass();
                bzfv7.f169877a |= 1;
                bzfv7.f169878b = str12;
                bzfv bzfv8 = (bzfv) bxvd.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzfc bzfc14 = (bzfc) da.f164949b;
                bzfv8.getClass();
                bzfc14.f169782k = bzfv8;
                bzfc14.f169772a |= 128;
            }
            if (!TextUtils.isEmpty(str13)) {
                bzfv bzfv9 = ((bzfc) da.f164949b).f169782k;
                if (bzfv9 == null) {
                    bzfv9 = bzfv.f169875e;
                }
                bxvd bxvd2 = (bxvd) bzfv9.mo74142c(5);
                bxvd2.mo73625a((bxvk) bzfv9);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bzfv bzfv10 = (bzfv) bxvd2.f164949b;
                str13.getClass();
                bzfv10.f169877a |= 4;
                bzfv10.f169880d = str13;
                bzfv bzfv11 = (bzfv) bxvd2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzfc bzfc15 = (bzfc) da.f164949b;
                bzfv11.getClass();
                bzfc15.f169782k = bzfv11;
                bzfc15.f169772a |= 128;
            }
        }
        if (!TextUtils.isEmpty(str14)) {
            bxvd da22 = bzgp.f169964c.mo74144da();
            if (da22.f164950c) {
                da22.mo74035c();
                da22.f164950c = false;
            }
            bzgp bzgp = (bzgp) da22.f164949b;
            str14.getClass();
            bzgp.f169966a |= 1;
            bzgp.f169967b = str14;
            bzgp bzgp2 = (bzgp) da22.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzfc bzfc16 = (bzfc) da.f164949b;
            bzgp2.getClass();
            bzfc16.f169780i = bzgp2;
            bzfc16.f169772a |= 32;
        }
        fuy fuy = new fuy(fuz.f17322a, clientContext2, bzfc.f169770o, (bzfc) da.mo74062i());
        fuy.mo11377a();
        bzfd bzfd = (bzfd) fuy.mo11376a(bzfd.f169786d);
        if (!fuy.mo11379c()) {
            return bzfd;
        }
        int e = fuy.mo11381e();
        String d = fuy.mo11380d();
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 57);
        sb.append("Create invitations failed due to error code: ");
        sb.append(e);
        sb.append("\n");
        sb.append(d);
        Log.e("AppInviteAgent", sb.toString());
        throw new fup(fuy.mo11380d(), fuy.mo11381e());
    }

    /* renamed from: a */
    public final ArrayList mo11386a(ClientContext clientContext) {
        bxxc bxxc;
        AvatarReference avatarReference;
        ContactPerson.ContactMethod contactMethod;
        String str;
        ClientContext clientContext2 = clientContext;
        fuz fuz = this.f17325a;
        bzex a = fuz.mo11383a(clientContext2.f30215e);
        if (a == null) {
            return null;
        }
        fuw fuw = new fuw(fuz.f17322a, clientContext2);
        bxvj bxvj = bzfi.f169813e;
        bxvd da = bzfi.f169812d.mo74144da();
        int i = 0;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzfi bzfi = (bzfi) da.f164949b;
        a.getClass();
        bzfi.f169816b = a;
        bzfi.f169815a |= 1;
        bzgm a2 = fuz.mo11384a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzfi bzfi2 = (bzfi) da.f164949b;
        a2.getClass();
        bzfi2.f169817c = a2;
        bzfi2.f169815a |= 2;
        bzfi bzfi3 = (bzfi) da.mo74062i();
        int size = fuw.f17315c.size();
        List list = fuw.f17315c;
        bxvd da2 = blby.f125883e.mo74144da();
        int a3 = bxvj.mo73900a();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        blby blby = (blby) da2.f164949b;
        int i2 = blby.f125885a | 1;
        blby.f125885a = i2;
        blby.f125886b = a3;
        blby.f125885a = i2 | 4;
        blby.f125888d = size;
        bxvf bxvf = (bxvf) blbz.f125890a.mo74144da();
        bxvf.mo74125a(bxvj, bzfi3);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        blby blby2 = (blby) da2.f164949b;
        blbz blbz = (blbz) bxvf.mo74062i();
        blbz.getClass();
        blby2.f125887c = blbz;
        blby2.f125885a |= 2;
        list.add((blby) da2.mo74062i());
        try {
            fux fux = fuw.f17313a;
            ClientContext clientContext3 = fuw.f17314b;
            bxvd da3 = blbw.f125875b.mo74144da();
            List list2 = fuw.f17315c;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            blbw blbw = (blbw) da3.f164949b;
            if (!blbw.f125877a.mo73666a()) {
                blbw.f125877a = bxvk.m124021a(blbw.f125877a);
            }
            bxsy.m123078a(list2, blbw.f125877a);
            fuw.f17316d = ((blbx) fux.f17317a.mo25513a(clientContext3, 1, "/fetch?alt=proto", ((blbw) da3.mo74062i()).mo73642k(), blbx.f125879b)).f125881a;
            if (fuw.mo11374a()) {
                int b = fuw.mo11375b();
                if (fuw.mo11374a()) {
                    bxbg bxbg = ((blcb) fuw.f17316d.get(b)).f125902c;
                    if (bxbg == null) {
                        bxbg = bxbg.f161808c;
                    }
                    i = bxbg.f161810a;
                }
                int b2 = fuw.mo11375b();
                if (fuw.mo11374a()) {
                    bxbg bxbg2 = ((blcb) fuw.f17316d.get(b2)).f125902c;
                    if (bxbg2 == null) {
                        bxbg2 = bxbg.f161808c;
                    }
                    str = bxbg2.f161811b;
                } else {
                    str = "";
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
                sb.append("Get suggested invitees failed due to error code: ");
                sb.append(i);
                sb.append("\n");
                sb.append(str);
                Log.e("AppInviteAgent", sb.toString());
                return null;
            }
            bxvj bxvj2 = bzfj.f169819c;
            int b3 = fuw.mo11375b();
            if (b3 < 0 || (((blcb) fuw.f17316d.get(b3)).f125900a & 1) == 0) {
                bxxc = null;
            } else {
                blca blca = ((blcb) fuw.f17316d.get(b3)).f125901b;
                if (blca == null) {
                    blca = blca.f125893b;
                }
                blca.mo74135a(bxvj2);
                Object b4 = blca.f164952m.mo73913b(bxvj2.f164958d);
                if (b4 == null) {
                    b4 = bxvj2.f164956b;
                } else {
                    bxvj2.mo74139a(b4);
                }
                bxxc = (bxxc) b4;
            }
            bzfj bzfj = (bzfj) bxxc;
            if (bzfj == null) {
                return null;
            }
            bxwc bxwc = bzfj.f169821a;
            if (bxwc == null) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList(bxwc.size());
            int size2 = bxwc.size();
            for (int i3 = 0; i3 < size2; i3++) {
                bzgq bzgq = (bzgq) bxwc.get(i3);
                bxwc bxwc2 = bzgq.f169973d;
                ArrayList arrayList2 = new ArrayList(bxwc2.size());
                int size3 = bxwc2.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    bzfg bzfg = (bzfg) bxwc2.get(i4);
                    int a4 = bzff.m125739a(bzfg.f169795b);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    int i5 = a4 - 1;
                    if (i5 == 1) {
                        contactMethod = new ContactPerson.ContactMethod(0, bzfg.f169796c);
                    } else if (i5 == 2) {
                        contactMethod = new ContactPerson.ContactMethod(1, bzfg.f169797d);
                    } else if (i5 != 3) {
                        contactMethod = null;
                    } else {
                        contactMethod = new ContactPerson.ContactMethod(2, bzfg.f169798e);
                    }
                    arrayList2.add(contactMethod);
                }
                if (!bzgq.f169972c.isEmpty()) {
                    avatarReference = new AvatarReference(1, bzgq.f169972c);
                } else {
                    avatarReference = null;
                }
                String str2 = bzgq.f169971b;
                bzgh bzgh = bzgq.f169970a;
                if (bzgh == null) {
                    bzgh = bzgh.f169931f;
                }
                arrayList.add(new ContactPerson(str2, bzgh.f169935c, avatarReference, arrayList2));
            }
            return arrayList;
        } catch (gid e) {
            Log.e("AppInviteAgent", "Authentication Failed ", e);
            return null;
        } catch (VolleyError e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb2.append("Error communicating with server ");
            sb2.append(valueOf);
            Log.e("AppInviteAgent", sb2.toString());
            return null;
        }
    }
}
