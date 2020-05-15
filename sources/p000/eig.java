package p000;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Pattern;

/* renamed from: eig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eig {

    /* renamed from: a */
    static final String f15036a = eik.m10484a("hts/frbslgiggolai.o/0clgbth", "tp:/ieaeogn.ogepscmvc/o/ac");

    /* renamed from: b */
    static final String f15037b = eik.m10484a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");

    /* renamed from: e */
    private static final String f15038e = eik.m10484a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");

    /* renamed from: c */
    public final String f15039c;

    /* renamed from: d */
    public final String f15040d;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(eid.m10480a("proto"), eid.m10480a("json"))));
        new eig(f15036a, null);
        new eig(f15037b, f15038e);
    }

    public eig(String str, String str2) {
        this.f15039c = str;
        this.f15040d = str2;
    }

    /* renamed from: a */
    public static eig m10481a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new eig(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }
}
