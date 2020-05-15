package p000;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: amww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amww {

    /* renamed from: a */
    private static final bnhe f76236a = bnhe.m109409a("male", 1, "female", 2);

    /* renamed from: b */
    private static final bnhe f76237b = bnhe.m109412a("user", 4, "keyword", 3, "home", 2, "work", 1, "other", 5);

    /* renamed from: c */
    private static final bnhe f76238c = bnhe.m109411a((byte) 1, 1, (byte) 2, 2, (byte) 3, 3, (byte) -1, 4);

    /* renamed from: d */
    private static final bnhe f76239d = bnhe.m109412a((byte) 1, 1, (byte) 2, 2, (byte) 3, 3, (byte) 4, 4, (byte) -1, 5);

    /* renamed from: e */
    private static final bnhe f76240e = bnhe.m109411a("6", "Contacts", "d", "Friends", "e", "Family", "f", "Coworkers");

    /* renamed from: f */
    private static final bnhe f76241f;

    /* renamed from: g */
    private static final alse f76242g = alse.f74192a;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b(1, chuv.f189215b);
        h.mo67695b(6, chuv.f189226m);
        h.mo67695b(5, chuv.f189221h);
        h.mo67695b(7, chuv.f189228o);
        h.mo67695b(3, chuv.f189218e);
        h.mo67695b(4, chuv.f189220g);
        h.mo67695b(0, chuv.f189217d);
        h.mo67695b(2, chuv.f189217d);
        f76241f = h.mo67618b();
    }

    /* renamed from: b */
    public static void m63587b(bzkv bzkv) {
        if (bzkv != null) {
            int a = bzku.m125889a(bzkv.f170483f);
            int i = 2;
            if (a != 0 && a != 2) {
                bnhe bnhe = f76241f;
                int a2 = bzku.m125889a(bzkv.f170483f);
                if (a2 != 0) {
                    i = a2;
                }
                chuv chuv = (chuv) bnhe.get(Integer.valueOf(i - 1));
                if (chuv == null) {
                    chuv = chuv.f189217d;
                }
                throw new chuw(chuv);
            } else if ((bzkv.f170478a & 2) != 0) {
                bzkq bzkq = bzkv.f170479b;
                if (bzkq == null) {
                    bzkq = bzkq.f170460c;
                }
                if (!bzkq.f170463b.isEmpty()) {
                    amvq r = amvr.m63450r();
                    bzkq bzkq2 = bzkv.f170479b;
                    if (bzkq2 == null) {
                        bzkq2 = bzkq.f170460c;
                    }
                    r.f76121d = bzkq2.f170463b;
                    r.mo41441a();
                    return;
                }
                amdk.m62659b("FSA2_ProtoToPeopleUtil", "Delete returned group with empty id.id - %s", bzkv.f170480c);
                throw new amxw(8);
            } else {
                amdk.m62659b("FSA2_ProtoToPeopleUtil", "Delete returned group with null id - %s", bzkv.f170480c);
                throw new amxw(7);
            }
        } else {
            Log.i("FSA2_ProtoToPeopleUtil", "Server returned null API group");
            throw new amxw(1);
        }
    }

    /* renamed from: c */
    private static void m63588c(bzkv bzkv) {
        bzkp bzkp = bzkv.f170481d;
        if (bzkp == null) {
            bzkp = bzkp.f170452g;
        }
        if (bzkp.f170455b == null) {
            bzkq bzkq = bzkq.f170460c;
        }
        if ((bzkp.f170454a & 2) == 0 && bzkp.f170456c == null) {
            bzkr bzkr = bzkr.f170464d;
        }
        if (bzkp.f170459f == null) {
            bzky bzky = bzky.f170485c;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:149:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0419  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x04ce  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0502  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0550  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x056a  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0583  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x059e  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x05b8  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x05d2  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x05e8  */
    /* renamed from: a */
    public static amvp m63581a(bler bler, String str) {
        List list;
        List list2;
        List list3;
        List list4;
        ArrayList arrayList;
        bley bley;
        ArrayList arrayList2;
        boolean z;
        List<ContentValues> a;
        List<ContentValues> a2;
        List<ContentValues> a3;
        List list5;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i;
        int i2;
        alrl alrl;
        alrl alrl2;
        bler bler2 = bler;
        String str2 = str;
        sdo.m34959a(bler);
        sdo.m34959a((Object) str);
        blew blew = bler2.f126253c;
        if (blew == null) {
            blew = blew.f126288f;
        }
        if (blew.f126292c.size() <= 0 || !anaw.m63873a(bler).contains(str2)) {
            return null;
        }
        amvo a4 = amvp.m63441a();
        a4.f76055a = str2;
        blew blew2 = bler2.f126253c;
        if (blew2 == null) {
            blew2 = blew.f126288f;
        }
        blec blec = blew2.f126293d;
        if (blec == null) {
            blec = blec.f126173b;
        }
        bxwc bxwc = blec.f126175a;
        int size = bxwc.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            blfd blfd = (blfd) bxwc.get(i3);
            if (blfd != null && str2.equals(blfd.f126341c)) {
                a4.f76056b = blfd.f126344f;
                long j = blfd.f126343e;
                if (j != 0) {
                    a4.f76058d = Long.valueOf(j);
                }
                if (blfd.f126342d) {
                    a4.mo41415b();
                }
            } else {
                i3++;
            }
        }
        bxwc bxwc2 = bler2.f126258h;
        bxwc bxwc3 = bler2.f126257g;
        bxwc bxwc4 = bler2.f126260j;
        bxwc bxwc5 = bler2.f126262l;
        List<ContentValues> a5 = m63584a(bler2.f126261k, str2);
        List<ContentValues> a6 = m63584a(bler2.f126274x, str2);
        List<ContentValues> a7 = m63584a(bler2.f126269s, str2);
        List<ContentValues> a8 = m63584a(bxwc3, str2);
        List<ContentValues> a9 = m63584a(bler2.f126268r, str2);
        List<ContentValues> a10 = m63584a(bler2.f126276z, str2);
        List<ContentValues> a11 = m63584a(bler2.f126270t, str2);
        List<ContentValues> a12 = m63584a(bler2.f126249C, str2);
        List<ContentValues> a13 = m63584a(bler2.f126272v, str2);
        List[] listArr = new List[3];
        alse alse = f76242g;
        if (bxwc2 == null) {
            list = bngx.m109376e();
        } else {
            alrl a14 = alse.mo40674a(blex.class);
            int size2 = bxwc2.size();
            int i4 = 0;
            List list6 = null;
            while (i4 < size2) {
                blex blex = (blex) bxwc2.get(i4);
                if (blex == null) {
                    alrl2 = a14;
                } else {
                    bleu a15 = a14.mo40672a(blex);
                    if (alse.m61627a(a15, str2)) {
                        alrl2 = a14;
                        list6 = alse.m61622a(a15, "vnd.android.cursor.item/phone_v2", blex.f126299c, list6);
                    } else {
                        alrl2 = a14;
                    }
                }
                i4++;
                a14 = alrl2;
            }
            list = list6;
        }
        listArr[0] = list;
        alse alse2 = f76242g;
        if (bxwc3 != null) {
            alrl a16 = alse2.mo40674a(bldu.class);
            int size3 = bxwc3.size();
            int i5 = 0;
            list2 = null;
            while (i5 < size3) {
                bldu bldu = (bldu) bxwc3.get(i5);
                if (bldu == null) {
                    alrl = a16;
                } else {
                    bleu a17 = a16.mo40672a(bldu);
                    if (alse.m61627a(a17, str2)) {
                        alrl = a16;
                        list2 = alse.m61622a(a17, "vnd.android.cursor.item/email_v2", bldu.f126135c, list2);
                    } else {
                        alrl = a16;
                    }
                }
                i5++;
                a16 = alrl;
            }
        } else {
            list2 = bngx.m109376e();
        }
        listArr[1] = list2;
        alse alse3 = f76242g;
        if (bxwc4 != null) {
            alrl a18 = alse3.mo40674a(blff.class);
            int size4 = bxwc4.size();
            list3 = null;
            for (int i6 = 0; i6 < size4; i6++) {
                blff blff = (blff) bxwc4.get(i6);
                if (blff != null) {
                    bleu a19 = a18.mo40672a(blff);
                    if (alse.m61627a(a19, str2)) {
                        list3 = alse.m61622a(a19, "vnd.android.cursor.item/website", blff.f126355c, list3);
                    }
                }
            }
        } else {
            list3 = bngx.m109376e();
        }
        listArr[2] = list3;
        List a20 = ancm.m64004a(listArr);
        if (a20.isEmpty()) {
            a20 = null;
        }
        List<ContentValues> a21 = m63584a(bler2.f126267q, str2);
        ArrayList arrayList6 = new ArrayList();
        List<ContentValues> a22 = m63584a(bler2.f126275y, str2);
        ArrayList arrayList7 = new ArrayList();
        List list7 = bler2.f126254d;
        if (list7.isEmpty()) {
            bxvd da = bleh.f126199o.mo74144da();
            bleu f = alse.m61636f(str);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bleh bleh = (bleh) da.f164949b;
            f.getClass();
            bleh.f126202b = f;
            bleh.f126201a |= 1;
            list7 = bngx.m109356a((bleh) da.mo74062i());
        }
        List<ContentValues> a23 = m63584a(list7, str2);
        if (bxwc5.isEmpty()) {
            bxvd da2 = blek.f126216e.mo74144da();
            if (!da2.f164950c) {
                i2 = 0;
            } else {
                da2.mo74035c();
                i2 = 0;
                da2.f164950c = false;
            }
            blek blek = (blek) da2.f164949b;
            blek.f126221d = i2;
            blek.f126218a |= 4;
            bleu f2 = alse.m61636f(str);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            blek blek2 = (blek) da2.f164949b;
            f2.getClass();
            blek2.f126219b = f2;
            blek2.f126218a |= 1;
            list4 = bngx.m109356a((blek) da2.mo74062i());
        } else {
            list4 = bxwc5;
        }
        List<ContentValues> a24 = m63584a(list4, str2);
        List list8 = bler2.f126259i;
        if (list8.isEmpty()) {
            bxvd da3 = bldg.f126061d.mo74144da();
            bleu f3 = alse.m61636f(str);
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bldg bldg = (bldg) da3.f164949b;
            f3.getClass();
            bldg.f126064b = f3;
            bldg.f126063a |= 1;
            list8 = bngx.m109356a((bldg) da3.mo74062i());
        }
        List<ContentValues> a25 = m63584a(list8, str2);
        List<ContentValues> a26 = m63584a(bler2.f126263m, str2);
        List<ContentValues> a27 = m63584a(bxwc2, str2);
        List<ContentValues> a28 = m63584a(bler2.f126265o, str2);
        bley[] bleyArr = (bley[]) bler2.f126255e.toArray(new bley[0]);
        if (!ancm.m64009a(bleyArr)) {
            int length = bleyArr.length;
            int i7 = 0;
            int i8 = -1;
            int i9 = -1;
            while (true) {
                if (i7 >= length) {
                    arrayList = arrayList7;
                    i = -1;
                    break;
                }
                bley bley2 = bleyArr[i7];
                i8++;
                int i10 = length;
                bleu bleu = bley2.f126306b;
                if (bleu == null) {
                    bleu = bleu.f126278h;
                }
                arrayList = arrayList7;
                if (!bley2.f126308d) {
                    if ((bley2.f126305a & 1) != 0) {
                        int a29 = bldn.m107047a(bleu.f126282c);
                        if (a29 != 0) {
                            if (a29 == 3 && str2.equals(bleu.f126283d)) {
                                i = i8;
                                break;
                            }
                        }
                        int a30 = bldn.m107047a(bleu.f126282c);
                        if (a30 != 0 && a30 == 2) {
                            i9 = i8;
                        }
                    }
                }
                i7++;
                length = i10;
                arrayList7 = arrayList;
            }
            if (i >= 0) {
                i9 = i;
            } else if (i9 < 0) {
                int length2 = bleyArr.length;
            }
            bley = bleyArr[i9];
            alse alse4 = f76242g;
            if (bley != null || (bley.f126305a & 1) == 0) {
                arrayList2 = null;
            } else {
                bleu bleu2 = bley.f126306b;
                if (bleu2 == null) {
                    bleu2 = bleu.f126278h;
                }
                ContentValues a31 = alse4.mo40674a(bley.class).mo40671a(bley, bleu2.f126286g);
                ArrayList arrayList8 = new ArrayList();
                arrayList8.add(a31);
                arrayList2 = arrayList8;
            }
            if (bley != null || (bley.f126305a & 1) == 0) {
                z = false;
            } else {
                bleu bleu3 = bley.f126306b;
                if (bleu3 == null) {
                    bleu3 = bleu.f126278h;
                }
                int a32 = bldn.m107047a(bleu3.f126282c);
                z = a32 == 0 ? false : a32 == 2;
            }
            List a33 = m63585a((bldk[]) bler2.f126247A.toArray(new bldk[0]));
            a = m63584a(bler2.f126266p, str2);
            a2 = m63584a(bler2.f126271u, str2);
            a3 = m63584a(bxwc4, str2);
            bxwc bxwc6 = bler2.f126256f;
            bxwc bxwc7 = bler2.f126264n;
            bxwc bxwc8 = bler2.f126273w;
            list5 = a33;
            arrayList3 = arrayList2;
            arrayList4 = arrayList;
            arrayList5 = arrayList6;
            m63586a(bxwc6, bxwc5, bxwc7, bxwc8, arrayList6, arrayList4);
            if (!ancm.m64008a((Collection) a5)) {
                for (ContentValues contentValues : a5) {
                    a4.mo41414a(contentValues);
                }
            }
            if (!ancm.m64008a((Collection) a6)) {
                for (ContentValues contentValues2 : a6) {
                    a4.mo41416b(contentValues2);
                }
            }
            if (!ancm.m64008a((Collection) a7)) {
                for (ContentValues contentValues3 : a7) {
                    a4.mo41417c(contentValues3);
                }
            }
            if (!ancm.m64008a((Collection) a8)) {
                for (ContentValues contentValues4 : a8) {
                    a4.mo41418d(contentValues4);
                }
            }
            if (!ancm.m64008a((Collection) a9)) {
                for (ContentValues contentValues5 : a9) {
                    a4.mo41419e(contentValues5);
                }
            }
            if (!ancm.m64008a((Collection) a10)) {
                for (ContentValues contentValues6 : a10) {
                    a4.mo41421g(contentValues6);
                }
            }
            if (!ancm.m64008a((Collection) a11)) {
                for (ContentValues contentValues7 : a11) {
                    a4.mo41422h(contentValues7);
                }
            }
            if (!ancm.m64008a((Collection) a12)) {
                for (ContentValues contentValues8 : a12) {
                    a4.mo41423i(contentValues8);
                }
            }
            if (!ancm.m64008a((Collection) a13)) {
                for (ContentValues contentValues9 : a13) {
                    a4.mo41424j(contentValues9);
                }
            }
            if (!ancm.m64008a((Collection) a20)) {
                int size5 = a20.size();
                for (int i11 = 0; i11 < size5; i11++) {
                    a4.mo41425k((ContentValues) a20.get(i11));
                }
            }
            if (!ancm.m64008a((Collection) a21)) {
                for (ContentValues contentValues10 : a21) {
                    a4.mo41426l(contentValues10);
                }
            }
            if (!ancm.m64008a((Collection) arrayList5)) {
                int size6 = arrayList5.size();
                for (int i12 = 0; i12 < size6; i12++) {
                    a4.mo41427m((ContentValues) arrayList5.get(i12));
                }
            }
            if (!ancm.m64008a((Collection) a22)) {
                for (ContentValues contentValues11 : a22) {
                    a4.mo41428n(contentValues11);
                }
            }
            if (!ancm.m64008a((Collection) arrayList4)) {
                int size7 = arrayList4.size();
                for (int i13 = 0; i13 < size7; i13++) {
                    a4.mo41429o((ContentValues) arrayList4.get(i13));
                }
            }
            if (!ancm.m64008a((Collection) a23)) {
                for (ContentValues contentValues12 : a23) {
                    a4.mo41430p(contentValues12);
                }
            }
            if (!ancm.m64008a((Collection) a24)) {
                for (ContentValues contentValues13 : a24) {
                    a4.mo41431q(contentValues13);
                }
            }
            if (!ancm.m64008a((Collection) a25)) {
                for (ContentValues contentValues14 : a25) {
                    a4.mo41432r(contentValues14);
                }
            }
            if (!ancm.m64008a((Collection) a26)) {
                for (ContentValues contentValues15 : a26) {
                    a4.mo41433s(contentValues15);
                }
            }
            if (!ancm.m64008a((Collection) a27)) {
                for (ContentValues contentValues16 : a27) {
                    a4.mo41434t(contentValues16);
                }
            }
            if (!ancm.m64008a((Collection) a28)) {
                for (ContentValues contentValues17 : a28) {
                    a4.mo41436v(contentValues17);
                }
            }
            if (!ancm.m64008a((Collection) arrayList3)) {
                int size8 = arrayList3.size();
                for (int i14 = 0; i14 < size8; i14++) {
                    a4.mo41435u((ContentValues) arrayList3.get(i14));
                }
            }
            if (!ancm.m64008a((Collection) list5)) {
                int size9 = list5.size();
                for (int i15 = 0; i15 < size9; i15++) {
                    a4.mo41420f((ContentValues) list5.get(i15));
                }
            }
            if (!ancm.m64008a((Collection) a)) {
                for (ContentValues contentValues18 : a) {
                    a4.mo41437w(contentValues18);
                }
            }
            if (!ancm.m64008a((Collection) a2)) {
                for (ContentValues contentValues19 : a2) {
                    a4.mo41438x(contentValues19);
                }
            }
            if (!ancm.m64008a((Collection) a3)) {
                for (ContentValues contentValues20 : a3) {
                    a4.mo41439y(contentValues20);
                }
            }
            if (z) {
                a4.f76064j = true;
            }
            return a4.mo41413a();
        }
        arrayList = arrayList7;
        bley = null;
        alse alse42 = f76242g;
        if (bley != null) {
        }
        arrayList2 = null;
        if (bley != null) {
        }
        z = false;
        List a332 = m63585a((bldk[]) bler2.f126247A.toArray(new bldk[0]));
        a = m63584a(bler2.f126266p, str2);
        a2 = m63584a(bler2.f126271u, str2);
        a3 = m63584a(bxwc4, str2);
        bxwc bxwc62 = bler2.f126256f;
        bxwc bxwc72 = bler2.f126264n;
        bxwc bxwc82 = bler2.f126273w;
        list5 = a332;
        arrayList3 = arrayList2;
        arrayList4 = arrayList;
        arrayList5 = arrayList6;
        m63586a(bxwc62, bxwc5, bxwc72, bxwc82, arrayList6, arrayList4);
        if (!ancm.m64008a((Collection) a5)) {
        }
        if (!ancm.m64008a((Collection) a6)) {
        }
        if (!ancm.m64008a((Collection) a7)) {
        }
        if (!ancm.m64008a((Collection) a8)) {
        }
        if (!ancm.m64008a((Collection) a9)) {
        }
        if (!ancm.m64008a((Collection) a10)) {
        }
        if (!ancm.m64008a((Collection) a11)) {
        }
        if (!ancm.m64008a((Collection) a12)) {
        }
        if (!ancm.m64008a((Collection) a13)) {
        }
        if (!ancm.m64008a((Collection) a20)) {
        }
        if (!ancm.m64008a((Collection) a21)) {
        }
        if (!ancm.m64008a((Collection) arrayList5)) {
        }
        if (!ancm.m64008a((Collection) a22)) {
        }
        if (!ancm.m64008a((Collection) arrayList4)) {
        }
        if (!ancm.m64008a((Collection) a23)) {
        }
        if (!ancm.m64008a((Collection) a24)) {
        }
        if (!ancm.m64008a((Collection) a25)) {
        }
        if (!ancm.m64008a((Collection) a26)) {
        }
        if (!ancm.m64008a((Collection) a27)) {
        }
        if (!ancm.m64008a((Collection) a28)) {
        }
        if (!ancm.m64008a((Collection) arrayList3)) {
        }
        if (!ancm.m64008a((Collection) list5)) {
        }
        if (!ancm.m64008a((Collection) a)) {
        }
        if (!ancm.m64008a((Collection) a2)) {
        }
        if (!ancm.m64008a((Collection) a3)) {
        }
        if (z) {
        }
        return a4.mo41413a();
    }

    /* renamed from: a */
    public static amvr m63582a(bzkv bzkv) {
        String str;
        long j;
        if (bzkv != null) {
            int a = bzku.m125889a(bzkv.f170483f);
            int i = 2;
            if (a != 0 && a != 2) {
                bnhe bnhe = f76241f;
                int a2 = bzku.m125889a(bzkv.f170483f);
                if (a2 != 0) {
                    i = a2;
                }
                chuv chuv = (chuv) bnhe.get(Integer.valueOf(i - 1));
                if (chuv == null) {
                    chuv = chuv.f189217d;
                }
                amdk.m62659b("FSA2_ProtoToPeopleUtil", "Server error: %s", chuv);
                throw new chuw(chuv);
            } else if ((bzkv.f170478a & 8) != 0) {
                bzkp bzkp = bzkv.f170481d;
                if (bzkp == null) {
                    bzkp = bzkp.f170452g;
                }
                if ((bzkp.f170454a & 1) != 0) {
                    bzkq bzkq = bzkp.f170455b;
                    if (bzkq == null) {
                        bzkq = bzkq.f170460c;
                    }
                    if (!bzkq.f170463b.isEmpty()) {
                        bzkq bzkq2 = bzkp.f170455b;
                        if (bzkq2 == null) {
                            bzkq2 = bzkq.f170460c;
                        }
                        String str2 = bzkq2.f170463b;
                        bzky bzky = bzkp.f170459f;
                        if (bzky == null) {
                            bzky = bzky.f170485c;
                        }
                        int a3 = bzkx.m125892a(bzky.f170488b);
                        String str3 = null;
                        if (a3 == 0) {
                            str = null;
                        } else if (a3 == 3) {
                            str = (String) f76240e.get(str2);
                            if (str == null) {
                                amdk.m62659b("FSA2_ProtoToPeopleUtil", "Unexpected system group {id=%s}", str2);
                                throw new amxw(5);
                            }
                        } else {
                            str = null;
                        }
                        if (bzkp.f170458e.size() != 0) {
                            bxwc bxwc = bzkp.f170458e;
                            int size = bxwc.size();
                            int i2 = 0;
                            while (i2 < size) {
                                int a4 = bzkn.m125882a(((bzko) bxwc.get(i2)).f170450a);
                                if (a4 == 0) {
                                    a4 = 1;
                                }
                                i2++;
                                if (a4 == 2) {
                                    m63588c(bzkv);
                                    amvq r = amvr.m63450r();
                                    r.f76121d = str2;
                                    r.mo41443b(true);
                                    return r.mo41441a();
                                }
                            }
                        }
                        m63588c(bzkv);
                        if ((4 & bzkp.f170454a) != 0) {
                            bzkz bzkz = bzkp.f170457d;
                            if (bzkz == null) {
                                bzkz = bzkz.f170489b;
                            }
                            j = bzkz.f170491a;
                        } else {
                            j = 0;
                        }
                        String str4 = bzkv.f170482e;
                        if ((2 & bzkp.f170454a) != 0) {
                            bzkr bzkr = bzkp.f170456c;
                            if (bzkr == null) {
                                bzkr = bzkr.f170464d;
                            }
                            if (bzkr.f170468c.isEmpty()) {
                                bzkr bzkr2 = bzkp.f170456c;
                                if (bzkr2 == null) {
                                    bzkr2 = bzkr.f170464d;
                                }
                                str3 = bzkr2.f170467b;
                            } else {
                                bzkr bzkr3 = bzkp.f170456c;
                                if (bzkr3 == null) {
                                    bzkr3 = bzkr.f170464d;
                                }
                                str3 = bzkr3.f170468c;
                            }
                        }
                        boolean equals = "Starred in Android".equals(str3);
                        if (str != null || (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3))) {
                            amvq r2 = amvr.m63450r();
                            r2.f76121d = str2;
                            r2.f76124g = str4;
                            r2.f76123f = str3;
                            if (str != null) {
                                r2.f76122e = str;
                                r2.mo41446e(true);
                                if ("6".equals(str2)) {
                                    r2.mo41442a(true);
                                }
                            }
                            if (equals) {
                                r2.mo41445d(true);
                                r2.mo41446e(true);
                            }
                            if (j != 0) {
                                r2.f76120c = Long.valueOf(j);
                            }
                            return r2.mo41441a();
                        }
                        amdk.m62659b("FSA2_ProtoToPeopleUtil", "Invalid group (contact group with no title or etag {id=%s}", str2);
                        throw new amxw(6);
                    }
                    amdk.m62659b("FSA2_ProtoToPeopleUtil", "Group with empty result.id.id - %s", bzkv.f170480c);
                    throw new amxw(4);
                }
                amdk.m62659b("FSA2_ProtoToPeopleUtil", "Group with no result.id - %s", bzkv.f170480c);
                throw new amxw(3);
            } else {
                amdk.m62659b("FSA2_ProtoToPeopleUtil", "Group returned no result - %s", bzkv.f170480c);
                throw new amxw(2);
            }
        } else {
            Log.e("FSA2_ProtoToPeopleUtil", "Server returned null API group");
            throw new amxw(1);
        }
    }

    /* renamed from: a */
    public static String m63583a(bler bler) {
        String str = null;
        if (bler == null || (bler.f126251a & 2) == 0) {
            return null;
        }
        blew blew = bler.f126253c;
        if (blew == null) {
            blew = blew.f126288f;
        }
        blec blec = blew.f126293d;
        if (blec == null) {
            blec = blec.f126173b;
        }
        bxwc bxwc = blec.f126175a;
        int size = bxwc.size();
        long j = -1;
        for (int i = 0; i < size; i++) {
            blfd blfd = (blfd) bxwc.get(i);
            int a = bldn.m107047a(blfd.f126340b);
            if (a != 0 && a == 3) {
                long j2 = blfd.f126343e;
                if (j < j2) {
                    str = blfd.f126341c;
                    j = j2;
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    private static List m63584a(List list, String str) {
        alrl a;
        if (list.isEmpty() || (a = f76242g.mo40674a(list.get(0).getClass())) == null) {
            return null;
        }
        return alse.m61624a(list, str, a, 3);
    }

    /* renamed from: a */
    public static List m63585a(bldk[] bldkArr) {
        ArrayList arrayList = null;
        if (!ancm.m64009a(bldkArr)) {
            for (bldk bldk : bldkArr) {
                if (bldk != null) {
                    String str = bldk.f126100e;
                    String str2 = bldk.f126098c;
                    if ("gdataExtendedProperty".equals(str) && "android".equals(str2)) {
                        String str3 = bldk.f126099d;
                        if (!TextUtils.isEmpty(str3)) {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                Iterator<String> keys = jSONObject.keys();
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    try {
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("mimetype", "vnd.com.google.cursor.item/contact_extended_property");
                                        contentValues.put("data1", next);
                                        contentValues.put("data2", jSONObject.getString(next));
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(contentValues);
                                    } catch (JSONException e) {
                                    }
                                }
                            } catch (JSONException e2) {
                            }
                        }
                        return arrayList;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static void m63586a(List list, List list2, List list3, List list4, List list5, List list6) {
        char c;
        char c2;
        if (!list.isEmpty() || !list2.isEmpty() || !list3.isEmpty() || !list4.isEmpty()) {
            ContentValues contentValues = new ContentValues();
            if (!list.isEmpty()) {
                Integer num = (Integer) f76236a.get(((bleb) list.get(0)).f126171c);
                if (num != null) {
                    contentValues.put("data3", num);
                }
            }
            int size = list2.size();
            int i = 0;
            while (true) {
                c = 2;
                if (i >= size) {
                    break;
                }
                blek blek = (blek) list2.get(i);
                int a = blej.m107073a(blek.f126221d);
                if (a == 0) {
                    a = 1;
                }
                String str = blek.f126220c;
                if (a != 1) {
                    int i2 = a - 1;
                    if (i2 == 2) {
                        contentValues.put("data5", str);
                    } else if (i2 == 3) {
                        contentValues.put("data10", str);
                    } else if (i2 == 4) {
                        contentValues.put("data4", str);
                    }
                }
                i++;
            }
            if (!list3.isEmpty()) {
                contentValues.put("data7", ((blel) list3.get(0)).f126226c);
            }
            int size2 = list4.size();
            int i3 = 0;
            while (i3 < size2) {
                blep blep = (blep) list4.get(i3);
                String str2 = blep.f126244d;
                String str3 = blep.f126243c;
                if (!TextUtils.isEmpty(str2)) {
                    switch (str2.hashCode()) {
                        case -1867885268:
                            if (str2.equals("subject")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1717893136:
                            if (str2.equals("directoryserver")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1165461084:
                            if (str2.equals("priority")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 364087249:
                            if (str2.equals("billinginformation")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 564403871:
                            if (str2.equals("sensitivity")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1062559946:
                            if (str2.equals("mileage")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    if (c2 == 0) {
                        contentValues.put("data1", str3);
                    } else if (c2 == 1) {
                        contentValues.put("data2", str3);
                    } else if (c2 == c) {
                        contentValues.put("data6", str3);
                    } else if (c2 == 3) {
                        try {
                            contentValues.put("data8", (Integer) f76238c.get(Byte.valueOf(Byte.parseByte(str3))));
                        } catch (NumberFormatException e) {
                            amdk.m62659b("FSA2_ProtoToPeopleUtil", "Getting priority value from %s failed", str3);
                        }
                    } else if (c2 == 4) {
                        try {
                            contentValues.put("data9", (Integer) f76239d.get(Byte.valueOf(Byte.parseByte(str3))));
                        } catch (NumberFormatException e2) {
                            amdk.m62659b("FSA2_ProtoToPeopleUtil", "Getting sensitivity value from %s failed", str3);
                        }
                    } else if (c2 != 5) {
                        Integer num2 = (Integer) f76237b.get(str2);
                        if (num2 != null) {
                            int intValue = num2.intValue();
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("mimetype", "vnd.com.google.cursor.item/contact_jot");
                            contentValues2.put("data2", Integer.valueOf(intValue));
                            alsf.m61643a(contentValues2, "data1", str3);
                            list5.add(contentValues2);
                        }
                    } else {
                        contentValues.put("data11", str3);
                    }
                }
                i3++;
                c = 2;
            }
            if (contentValues.size() > 0) {
                contentValues.put("mimetype", "vnd.com.google.cursor.item/contact_misc");
                list6.add(contentValues);
            }
        }
    }
}
