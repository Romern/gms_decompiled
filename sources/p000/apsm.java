package p000;

/* renamed from: apsm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apsm {
    /* renamed from: a */
    public static String m70910a(abzn abzn, abyy abyy, String[] strArr, String str) {
        if (!cemw.f183016a.mo6606a().mo79374d()) {
            if (!abzn.f58821a.isEmpty()) {
                return null;
            }
            return (strArr != null && strArr.length > 0) ? "Not authorized to read requested corpora" : "Found no matching corpora for package";
        } else if (!abzn.f58821a.isEmpty()) {
            return null;
        } else {
            if (abzn.f58822b.isEmpty()) {
                String str2 = abyy.f58780f;
                if (abyy.mo32512a()) {
                    return "Found no matching corpora for package";
                }
                if (str2.equals(str)) {
                    return "Found no matching corpora for package";
                }
            }
            return "Not authorized to read requested corpora";
        }
    }
}
