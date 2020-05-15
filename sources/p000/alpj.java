package p000;

import android.text.TextUtils;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: alpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alpj {

    /* renamed from: a */
    public SparseArray f74012a;

    /* renamed from: b */
    public SparseArray f74013b;

    /* renamed from: a */
    private static String m61469a(String str, boolean z) {
        bmxv bmxv;
        if (!z) {
            return ancn.m64025a(str);
        }
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            amig.m62939a();
            int intValue = Integer.valueOf((int) cgbe.f186279a.mo6606a().mo83377cA()).intValue();
            int i = 0;
            for (int length = str.length() - 1; length >= 0 && i != intValue; length--) {
                Character valueOf = Character.valueOf(str.charAt(length));
                if (valueOf.charValue() >= '0' && valueOf.charValue() <= '9') {
                    sb.append(valueOf);
                    i++;
                }
            }
            String sb2 = sb.toString();
            if (sb2.isEmpty()) {
                bmxv = bmvz.f131120a;
            } else {
                bmxv = bmxv.m108566b(sb2);
            }
        } else {
            bmxv = bmvz.f131120a;
        }
        if (bmxv.mo66813a()) {
            return (String) bmxv.mo66814b();
        }
        return ancn.m64025a(str);
    }

    /* renamed from: a */
    static final Set m61470a(btfi btfi) {
        HashSet hashSet = new HashSet();
        if (btfi != null) {
            if (!btfi.f148658a.isEmpty()) {
                hashSet.add(btfi.f148658a);
            }
            amig.m62939a();
            boolean booleanValue = ((Boolean) amgv.f74898a.mo41191a()).booleanValue();
            bxwc bxwc = btfi.f148662e;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                btff btff = (btff) bxwc.get(i);
                hashSet.add(m61469a(btff.f148638a, booleanValue));
                hashSet.add(btff.f148639b);
            }
            bxwc bxwc2 = btfi.f148661d;
            int size2 = bxwc2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                btfd btfd = (btfd) bxwc2.get(i2);
                hashSet.add(btfd.f148615a);
                hashSet.add(btfd.f148616b);
            }
            bxwc bxwc3 = btfi.f148663f;
            int size3 = bxwc3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                btfg btfg = (btfg) bxwc3.get(i3);
                hashSet.add(btfg.f148647a);
                hashSet.add(btfg.f148648b);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public static final Set m61471a(btfd[] btfdArr) {
        HashSet hashSet = new HashSet();
        for (btfd btfd : btfdArr) {
            hashSet.add(btfd.f148615a);
        }
        return hashSet;
    }

    /* renamed from: a */
    public static final Set m61472a(btff[] btffArr) {
        amig.m62939a();
        boolean booleanValue = ((Boolean) amgv.f74898a.mo41191a()).booleanValue();
        HashSet hashSet = new HashSet();
        for (btff btff : btffArr) {
            hashSet.add(m61469a(btff.f148638a, booleanValue));
        }
        return hashSet;
    }

    /* renamed from: a */
    public static final Set m61473a(btfg[] btfgArr) {
        HashSet hashSet = new HashSet();
        for (btfg btfg : btfgArr) {
            hashSet.add(btfg.f148647a);
        }
        return hashSet;
    }

    /* renamed from: a */
    public static final boolean m61474a(btfi btfi, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            btfi btfi2 = (btfi) it.next();
            if (sdg.m34949a(m61471a((btfd[]) btfi.f148661d.toArray(new btfd[0])), m61471a((btfd[]) btfi2.f148661d.toArray(new btfd[0]))) && sdg.m34949a(m61472a((btff[]) btfi.f148662e.toArray(new btff[0])), m61472a((btff[]) btfi2.f148662e.toArray(new btff[0]))) && sdg.m34949a(m61473a((btfg[]) btfi.f148663f.toArray(new btfg[0])), m61473a((btfg[]) btfi2.f148663f.toArray(new btfg[0]))) && sdg.m34949a(btfi.f148658a, btfi2.f148658a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo40628a(btem btem) {
        if (btem != null) {
            this.f74013b = new SparseArray();
            bxwc bxwc = btem.f148534a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                btfi btfi = (btfi) bxwc.get(i);
                int hashCode = Arrays.hashCode(new Object[]{btfi.f148658a});
                Set set = (Set) this.f74013b.get(hashCode);
                if (set == null) {
                    set = new HashSet();
                    this.f74013b.put(hashCode, set);
                }
                set.add(btfi);
            }
        }
    }
}
