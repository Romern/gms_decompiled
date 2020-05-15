package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ahgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahgv {

    /* renamed from: a */
    public static final ahgv f67192a;

    /* renamed from: b */
    public static final ahgv f67193b;

    /* renamed from: c */
    private final String f67194c;

    /* renamed from: d */
    private bnic f67195d;

    static {
        ahgt a = m55729a();
        a.f67189a = "first_party_whitelist";
        f67192a = a.mo36455a();
        ahgt a2 = m55729a();
        a2.f67189a = "second_party_whitelist";
        f67193b = a2.mo36455a();
    }

    public ahgv(String str) {
        bnic bnic;
        bmxy.m108581a(str);
        this.f67194c = str;
        if ("first_party_whitelist".equals(str)) {
            bnic = bnic.m109495a((Collection) m55730a(cfos.m141989c()));
        } else {
            bnic = "second_party_whitelist".equals(str) ? bnic.m109495a((Collection) m55730a(cfos.f185168a.mo6606a().mo82255g())) : null;
        }
        this.f67195d = bnic;
    }

    /* renamed from: a */
    public static ahgt m55729a() {
        return new ahgt();
    }

    /* renamed from: b */
    public static boolean m55731b(Context context, String str) {
        return f67192a.mo36457a(context, str) || f67193b.mo36457a(context, str);
    }

    /* renamed from: a */
    public static synchronized Set m55730a(String str) {
        synchronized (ahgv.class) {
            if ("".equals(str)) {
                Set emptySet = Collections.emptySet();
                return emptySet;
            }
            HashSet hashSet = new HashSet();
            for (String str2 : str.split(",")) {
                String[] split = str2.split(":");
                if (split.length == 2) {
                    hashSet.add(new ahgu(split[0], split[1]));
                }
            }
            Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
            return unmodifiableSet;
        }
    }

    /* renamed from: a */
    public final boolean mo36457a(Context context, String str) {
        if (!cfos.f185168a.mo6606a().mo82253e()) {
            if (this.f67195d == null) {
                this.f67195d = bnic.m109495a((Collection) m55730a(cfos.m141989c()));
            }
            bnic bnic = this.f67195d;
            try {
                String e = spn.m35882e(context, str);
                bnrd a = bnic.iterator();
                while (a.hasNext()) {
                    ahgu ahgu = (ahgu) a.next();
                    if (ahgu.f67190a.equals(str) && ahgu.f67191b.equalsIgnoreCase(e)) {
                        srn srn = ahfp.f67119a;
                        return true;
                    }
                }
                srn srn2 = ahfp.f67119a;
                return false;
            } catch (PackageManager.NameNotFoundException e2) {
                srn srn3 = ahfp.f67119a;
                bnsl bnsl = (bnsl) ahfp.f67119a.mo68387b();
                bnsl.mo68437a(e2);
                bnsl.mo68432a("ahgv", "a", 127, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Package not found: %s", str);
                return false;
            }
        } else {
            srn srn4 = ahfp.f67119a;
            return true;
        }
    }
}
