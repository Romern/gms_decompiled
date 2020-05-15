package p000;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.UserMetadata;
import com.google.android.gms.drive.internal.model.Permission;
import com.google.android.gms.drive.internal.model.Property;
import com.google.android.gms.drive.internal.model.User;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/* renamed from: uhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uhc {

    /* renamed from: a */
    private static final sbw f47592a = new sbw("DocEntryConverter", "");

    /* renamed from: b */
    private static final Locale f47593b = Locale.US;

    /* renamed from: c */
    private static final vpx f47594c = m38509b("yyyy-MM-dd'T'HH:mm:ss.SSS");

    /* renamed from: d */
    private static final vpx f47595d = m38509b("yyyy-MM-dd'T'HH:mm:ss.SSSz");

    /* renamed from: e */
    private static final ThreadLocal f47596e = new uhb();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public static DriveId m38500a(uos uos, vkr vkr, boolean z) {
        sdo.m34971a(uos.mo27778b(), (Object) "The provided account should be valid.");
        sdo.m34970a(uos.mo27778b());
        String g = vkr.mo28572g();
        ujx a = uos.mo27780a(g);
        if (a == null) {
            f47592a.mo25377c("DocEntryConverter", "Prefetch should already have created all the entries!");
            String q = vkr.mo28582q();
            vdx vdx = uos.f48429d;
            a = vdx.f49098a.mo27370a(vdx.f49099b, q, g);
        }
        if (z || m38508a(vkr, a)) {
            a.mo27535M();
            sdo.m34974b(vkr.mo28572g().equals(a.mo27616i()));
            m38505a(uos.f48426a, vkr, a, (String) null);
            sdo.m34975b(vkr.mo28569d(), "Cannot copy internal fields from response of a non-Drive Android API request");
            sdo.m34975b(vkr.mo28569d(), "Cannot copy internal fields from response of a non-Drive Android API request");
            if (vkr.mo28547I()) {
                Set f = vkr.mo28571f();
                if (f.size() > 0) {
                    a.mo27602e((String) f.iterator().next());
                }
            }
            if (vkr.mo28560V() != null) {
                a.mo27618i(vkr.mo28560V().booleanValue());
            }
            boolean z2 = false;
            if (vkr.mo28550L() != null) {
                if (vkr.mo28551M() != null) {
                    a.mo27598d(vkr.mo28550L(), vkr.mo28551M());
                    a.mo27597d(vkr.mo28552N());
                } else {
                    f47592a.mo25374b("DocEntryConverter", "Creator sdkAppId of singleton (resourceId: %s) not provided.", vkr.mo28572g());
                }
            }
            a.f47825a.f47882K = vkr.mo28557S();
            if (vkr.mo28578m() != null) {
                z2 = true;
            }
            a.mo27612g(z2);
            a.mo27578an();
            m38507a(uos, vkr, a);
            a.f47828d.f49098a.mo27375a(a, new HashSet(vkr.mo28571f()));
            sdo.m34970a(uos.mo27778b());
            vdx vdx2 = uos.f48429d;
            HashSet<Long> hashSet = new HashSet();
            for (DriveId driveId : vdx2.f49098a.mo27361a(vdx2.f49100c, a)) {
                hashSet.add(Long.valueOf(driveId.f30729b));
            }
            for (String str : vkr.mo28570e()) {
                vdx vdx3 = uos.f48429d;
                ujp a2 = vdx3.f49098a.mo27368a(vdx3.f49099b, str);
                if (a2 == null) {
                    vdx vdx4 = uos.f48429d;
                    a2 = vdx4.f49098a.mo27379b(vdx4.f49099b, str);
                }
                uos.f48426a.mo27414a(a2);
                if (!hashSet.remove(Long.valueOf(a2.f48366m))) {
                    a.f47828d.f49098a.mo27374a(a, a2.f48366m);
                }
            }
            for (Long l : hashSet) {
                long longValue = l.longValue();
                vea vea = a.f47828d;
                vea.f49098a.mo27377a(ukk.m38862a(vea.f49105b.f47676a.longValue()), longValue);
            }
            a.mo27629n(true);
            return a.mo27610g();
        } else if (vkr.mo28557S() <= a.mo27576al() || !m38507a(uos, vkr, a)) {
            return null;
        } else {
            a.mo27629n(true);
            return a.mo27610g();
        }
    }

    /* renamed from: b */
    private static vpx m38509b(String str) {
        vpx vpx = new vpx(str, f47593b);
        vpx.mo28732a(TimeZone.getTimeZone("UTC"));
        return vpx;
    }

    /* renamed from: c */
    private static Date m38510c(String str) {
        try {
            return m38504a(str);
        } catch (ParseException e) {
            f47592a.mo25378c("DocEntryConverter", String.format("Failed to parse date: %s", str), e);
            return null;
        }
    }

    /* renamed from: a */
    private static UserMetadata m38501a(User user) {
        String str;
        if (user == null || (str = user.f31058e) == null) {
            return null;
        }
        User.Picture picture = user.f31059f;
        return new UserMetadata(str, user.f31055b, picture != null ? picture.f31062b : null, user.f31057d, user.f31056c);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    private static String m38502a(String str, int i) {
        boolean z;
        if (str == null) {
            return null;
        }
        if (i > 1) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "Length limit must be greater than 1");
        int length = str.length();
        if (length <= i) {
            return str;
        }
        int i2 = i / 2;
        String substring = str.substring(0, i2);
        String substring2 = str.substring((length - i2) + 1);
        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 1 + String.valueOf(substring2).length());
        sb.append(substring);
        sb.append("…");
        sb.append(substring2);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m38503a(Date date) {
        return String.valueOf(f47594c.mo28731a(date)).concat("Z");
    }

    /* renamed from: a */
    public static Date m38504a(String str) {
        if (str == null) {
            return null;
        }
        try {
            int indexOf = str.indexOf(45);
            if (indexOf == 4) {
                int parseInt = Integer.parseInt(str.substring(0, 4));
                int parseInt2 = Integer.parseInt(str.substring(5, 7));
                int parseInt3 = Integer.parseInt(str.substring(8, 10));
                int parseInt4 = Integer.parseInt(str.substring(11, 13));
                int parseInt5 = Integer.parseInt(str.substring(14, 16));
                int parseInt6 = Integer.parseInt(str.substring(17, 19));
                int parseInt7 = Integer.parseInt(str.substring(20, 23));
                ((Calendar) f47596e.get()).set(parseInt, parseInt2 - 1, parseInt3, parseInt4, parseInt5, parseInt6);
                return new Date(((Calendar) f47596e.get()).getTimeInMillis() + ((long) parseInt7));
            }
            throw new ParseException("Could not parse the year correctly.", indexOf);
        } catch (NumberFormatException | ParseException e) {
            f47592a.mo25378c("DocEntryConverter", String.format("Error parsing date using fast parser: %s", str), e);
            vpx vpx = (!str.endsWith("z") && !str.endsWith("Z")) ? f47595d : f47594c;
            synchronized (vpx.f49781b) {
                return vpx.f49780a.parse(str);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ujx.a(java.lang.String, boolean):java.util.List
     arg types: [java.lang.String, int]
     candidates:
      ujx.a(boolean, boolean):void
      ujx.a(java.lang.String, java.lang.String):uot
      ujx.a(boolean, long):void
      ujx.a(java.lang.String, boolean):java.util.List */
    /* renamed from: a */
    private static void m38505a(uhm uhm, vkr vkr, ujx ujx, String str) {
        boolean z;
        boolean z2;
        String str2;
        ukt ah = ujx.mo27572ah();
        sdo.m34974b((!ujx.mo27571ag()) ^ (ah != null));
        if (vkr.mo28569d()) {
            sdo.m34975b(vkr.mo28569d(), "Cannot copy internal fields from response of a non-Drive Android API request");
            List U = vkr.mo28559U();
            boolean Y = vkr.mo28563Y();
            if (!U.isEmpty()) {
                boolean contains = U.contains("plusMediaFolderRoot");
                ujx.f47825a.f47896Y = contains;
                Y |= U.contains("plusMediaFolder") ? true : contains;
            }
            ujx.f47825a.f47895X = Y;
            ujx.mo27608f(m38510c(vkr.mo28564Z()));
            ujx.mo27607f(vkr.mo28566aa());
            C1225nr nrVar = new C1225nr();
            for (String str3 : vkr.mo28561W()) {
                DriveSpace a = DriveSpace.m22929a(str3);
                if (a != null) {
                    nrVar.add(a);
                } else if (!"GOOGLE_PHOTOS".equals(str3)) {
                    f47592a.mo25369a("Discarding unrecognized space '%s' from response", str3);
                }
            }
            if (ah != null && ah.mo27670j().mo27683a()) {
                ah.mo27670j().mo27681a(Boolean.valueOf(nrVar.contains(DriveSpace.f30734a)));
            } else {
                ujx.mo27622k(nrVar.contains(DriveSpace.f30734a));
            }
            ujx.mo27625l(nrVar.contains(DriveSpace.f30736c));
        }
        ujx.f47825a.f47930v = vkr.mo28576k();
        ujx.f47825a.f47872A = vkr.mo28543E();
        ujx.mo27555a(m38501a(vkr.mo28553O()));
        ujx.mo27583b(m38501a(vkr.mo28554P()));
        ujx.f47825a.f47873B = vkr.mo28544F();
        ujx.f47825a.f47921m = vkr.mo28586u();
        ujx.mo27604e(vkr.mo28540B());
        ujx.mo27617i(vkr.mo28541C());
        ujx.f47825a.f47892U = vkr.mo28588w();
        ujx.f47825a.f47923o = vkr.mo28589x();
        ujx.f47825a.f47924p = vkr.mo28590y();
        if (vkr.mo28545G() != null) {
            z = true;
        } else {
            z = false;
        }
        ujx.f47825a.f47893V = z;
        ujx.f47825a.f47926r = vkr.mo28549K();
        if (ujx.mo27632p() == null) {
            ujx.mo27553a(vkr.mo28591z());
        } else {
            ujx.mo27591c(Long.valueOf(vkr.mo28591z()));
        }
        if (vkr.mo28569d()) {
            z2 = true;
        } else {
            z2 = str != null;
        }
        sdo.m34974b(z2);
        List<Property> H = vkr.mo28546H();
        Map a2 = uot.m39108a(ujx.mo27550a(str, true));
        for (Property property : H) {
            if (property.f31050c == null || property.f31051d == null) {
                f47592a.mo25374b("DocEntryConverter", "Property from server should not have null key or value. sdkAppId: %s", property.f31049b);
            } else {
                if (!"PUBLIC".equalsIgnoreCase(property.f31052e)) {
                    str2 = property.f31048a.contains(2) ? property.f31049b : str;
                } else {
                    str2 = null;
                }
                uot uot = (uot) a2.remove(uot.m39107a(property.f31050c, str2));
                if (uot == null) {
                    uot = ujx.mo27552a(property.f31050c, str2);
                }
                uot.mo27783a(property.f31051d, (Long) null);
            }
        }
        for (uot uot2 : a2.values()) {
            uot2.mo27783a((String) null, (Long) null);
        }
        String str4 = "";
        if (ah == null) {
            if (((Boolean) twy.f46804O.mo58455c()).booleanValue()) {
                ujx.mo27592c(vkr.mo28558T());
            }
            String a3 = m38502a(vkr.mo28577l(), ((Integer) twy.f46822aF.mo58455c()).intValue());
            if (a3 != null) {
                str4 = a3;
            }
            ujx.mo27557a(str4);
            ujx.mo27614h(m38502a(vkr.mo28587v(), ((Integer) twy.f46820aD.mo58455c()).intValue()));
            ujx.mo27561a(ung.m38979a(vkr.mo28583r(), vkr.mo28579n()));
            ujx.mo27611g(m38502a(vkr.mo28582q(), ((Integer) twy.f46821aE.mo58455c()).intValue()));
            ujx.mo27588b(vkr.mo28565a());
            ujx.mo27600d(vkr.mo28539A());
            ujx.mo27619j(vkr.mo28548J().f31043h);
            ujx.mo27562a(vkr.mo28584s());
            ujx.mo27595c(vkr.mo28567b());
            ujx.mo27590c(vkr.mo28542D());
            ujx.mo27554a(vkr.mo28585t());
            ujx.mo27609f(vkr.mo28555Q());
            Date c = m38510c(vkr.mo28575j());
            if (c != null) {
                ujx.mo27603e(c);
            }
            Date c2 = m38510c(vkr.mo28573h());
            if (c2 != null) {
                ujx.mo27599d(c2);
            }
            Date c3 = m38510c(vkr.mo28580o());
            if (c3 != null) {
                ujx.mo27559a(c3);
            }
            Date c4 = m38510c(vkr.mo28574i());
            if (c4 != null) {
                ujx.mo27587b(c4);
            }
            Date c5 = m38510c(vkr.mo28581p());
            if (c5 != null) {
                ujx.mo27594c(c5);
                return;
            }
            return;
        }
        if (((Boolean) twy.f46804O.mo58455c()).booleanValue()) {
            String T = vkr.mo28558T();
            if (ah.mo27662b().mo27683a()) {
                ah.mo27662b().mo27681a(T);
            } else {
                ujx.mo27592c(T);
            }
        }
        String a4 = m38502a(vkr.mo28577l(), ((Integer) twy.f46822aF.mo58455c()).intValue());
        if (a4 != null) {
            str4 = vpw.m41036a(a4);
        }
        if (ah.mo27664d().mo27683a()) {
            ah.mo27664d().mo27681a(str4);
        } else {
            ujx.mo27557a(str4);
        }
        String a5 = m38502a(vkr.mo28587v(), ((Integer) twy.f46820aD.mo58455c()).intValue());
        if (ah.mo27667g().mo27683a()) {
            ah.mo27667g().mo27681a(a5);
        } else {
            ujx.mo27614h(a5);
        }
        ung a6 = ung.m38979a(vkr.mo28583r(), vkr.mo28579n());
        if (ah.f48055c.mo27683a()) {
            ah.f48055c.mo27681a(a6);
        } else {
            ujx.mo27561a(a6);
        }
        String a7 = m38502a(vkr.mo28582q(), ((Integer) twy.f46821aE.mo58455c()).intValue());
        if (ah.mo27663c().mo27683a()) {
            ah.mo27663c().mo27681a(a7);
        } else {
            ujx.mo27611g(a7);
        }
        boolean a8 = vkr.mo28565a();
        if (ah.mo27666f().mo27683a()) {
            ah.mo27666f().mo27681a(Boolean.valueOf(a8));
        } else {
            ujx.mo27588b(a8);
        }
        boolean A = vkr.mo28539A();
        if (ah.mo27669i().mo27683a()) {
            ah.mo27669i().mo27681a(Boolean.valueOf(A));
        } else {
            ujx.mo27600d(A);
        }
        String str5 = vkr.mo28548J().f31043h;
        if (ah.mo27665e().mo27683a()) {
            ah.mo27665e().mo27681a(str5);
        } else {
            ujx.mo27619j(str5);
        }
        boolean s = vkr.mo28584s();
        if (ah.mo27671k().mo27683a()) {
            ah.mo27671k().mo27681a(Boolean.valueOf(s));
        } else {
            ujx.mo27562a(s);
        }
        boolean b = vkr.mo28567b();
        if (ah.mo27672l().mo27683a()) {
            ah.mo27672l().mo27681a(Boolean.valueOf(b));
        } else {
            ujx.mo27595c(b);
        }
        long D = vkr.mo28542D();
        if (ah.f48056d.mo27683a()) {
            ah.f48056d.mo27681a(Long.valueOf(D));
        } else {
            ujx.mo27590c(D);
        }
        bngx t = vkr.mo28585t();
        if (ah.f48057e.mo27683a()) {
            ah.f48057e.mo27681a(t);
        } else {
            ujx.mo27554a(t);
        }
        boolean Q = vkr.mo28555Q();
        if (ah.mo27674n().mo27683a()) {
            ah.mo27674n().mo27681a(Boolean.valueOf(Q));
        } else {
            ujx.mo27609f(Q);
        }
        Date c6 = m38510c(vkr.mo28575j());
        if (c6 != null) {
            if (ah.mo27668h().mo27683a()) {
                ah.mo27668h().mo27681a(c6);
            } else {
                ujx.mo27603e(c6);
            }
        }
        Date c7 = m38510c(vkr.mo28573h());
        if (c7 != null) {
            if (ah.mo27673m().mo27683a()) {
                ah.mo27673m().mo27681a(c7);
            } else {
                ujx.mo27599d(c7);
            }
        }
        Date c8 = m38510c(vkr.mo28580o());
        if (c8 != null) {
            if (ah.mo27675o().mo27683a()) {
                ah.mo27675o().mo27681a(c8);
            } else {
                ujx.mo27559a(c8);
            }
        }
        Date c9 = m38510c(vkr.mo28574i());
        if (c9 != null) {
            if (ah.mo27676p().mo27683a()) {
                ah.mo27676p().mo27681a(c9);
            } else {
                ujx.mo27587b(c9);
            }
        }
        Date c10 = m38510c(vkr.mo28581p());
        if (c10 != null) {
            if (ah.mo27677q().mo27683a()) {
                ah.mo27677q().mo27681a(c10);
            } else {
                ujx.mo27594c(c10);
            }
        }
        uhm.mo27414a(ah);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: uhc.a(uhm, vkr, ujx, java.lang.String):void
     arg types: [uhn, vkr, ujx, java.lang.String]
     candidates:
      uhc.a(uhn, vkr, ujx, java.lang.String):void
      uhc.a(uhm, vkr, ujx, java.lang.String):void */
    /* renamed from: a */
    public static void m38506a(uhn uhn, vkr vkr, ujx ujx, String str) {
        if (m38508a(vkr, ujx)) {
            m38505a((uhm) uhn, vkr, ujx, str);
        }
    }

    /* renamed from: a */
    static boolean m38507a(uos uos, vkr vkr, ujx ujx) {
        ukc ukc;
        if (!((Boolean) twy.f46807R.mo58455c()).booleanValue()) {
            return false;
        }
        List<Permission> X = vkr.mo28562X();
        List<ukc> ak = ujx.mo27575ak();
        ukc ukc2 = null;
        if (X.isEmpty()) {
            Permission J = vkr.mo28548J();
            String str = J.f31039d;
            if (str == null) {
                return false;
            }
            Iterator it = ak.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ukc ukc3 = (ukc) it.next();
                if (str.equals(ukc3.f47843b)) {
                    ukc2 = ukc3;
                    break;
                }
            }
            if (!"owner".equals(J.f31043h)) {
                if (ukc2 != null && ukc2.f47847f == 3) {
                    ukc2.mo27645a(uos.f48426a);
                    return true;
                }
            } else if (ukc2 == null) {
                ujx.mo27556a(J);
                return true;
            }
            return false;
        }
        HashSet hashSet = new HashSet();
        for (Permission permission : X) {
            if (hashSet.add(vph.m41014c(permission))) {
                Iterator it2 = ak.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        ukc = null;
                        break;
                    }
                    ukc = (ukc) it2.next();
                    if (sdg.m34949a(ukc.f47843b, vph.m41014c(permission))) {
                        ukc.mo27646a(uos.f48426a, permission);
                        break;
                    }
                }
                if (ukc != null) {
                    ak.remove(ukc);
                } else {
                    ujx.mo27556a(permission);
                }
            }
        }
        for (ukc ukc4 : ak) {
            if (ukc4.f47842a != null) {
                ukc4.mo27645a(uos.f48426a);
            }
        }
        ujx.f47825a.f47904ag = vkr.mo28557S();
        ujx.mo27578an();
        return true;
    }

    /* renamed from: a */
    private static boolean m38508a(vkr vkr, ujx ujx) {
        return ujx.mo27569ae() <= 0 || vkr.mo28557S() > ujx.mo27569ae();
    }
}
