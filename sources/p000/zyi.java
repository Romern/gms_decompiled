package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.fonts.FontMatchSpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: zyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zyi {

    /* renamed from: a */
    private static final String[] f56177a = {"", "i", "italic"};

    /* renamed from: b */
    private static final bnhe f56178b;

    /* renamed from: c */
    private static final Map f56179c;

    static {
        float f;
        bnha bnha = new bnha();
        bnha.mo67695b("100", 100);
        Integer valueOf = Integer.valueOf((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR);
        bnha.mo67695b("200", valueOf);
        bnha.mo67695b("300", 300);
        bnha.mo67695b("400", 400);
        bnha.mo67695b("500", 500);
        bnha.mo67695b("600", 600);
        bnha.mo67695b("700", 700);
        bnha.mo67695b("800", 800);
        bnha.mo67695b("900", 900);
        bnha.mo67695b("thin", 100);
        bnha.mo67695b("extralight", valueOf);
        bnha.mo67695b("extra-light", valueOf);
        bnha.mo67695b("ultralight", valueOf);
        bnha.mo67695b("ultra-light", valueOf);
        bnha.mo67695b("light", 300);
        bnha.mo67695b("regular", 400);
        bnha.mo67695b("book", 400);
        bnha.mo67695b("medium", 500);
        bnha.mo67695b("semi-bold", 600);
        bnha.mo67695b("semibold", 600);
        bnha.mo67695b("demi-bold", 600);
        bnha.mo67695b("demibold", 600);
        bnha.mo67695b("bold", 700);
        bnha.mo67695b("extra-bold", 800);
        bnha.mo67695b("extrabold", 800);
        bnha.mo67695b("ultra-bold", 800);
        bnha.mo67695b("ultrabold", 800);
        bnha.mo67695b("black", 900);
        bnha.mo67695b("heavy", 900);
        bnha.mo67695b("l", 300);
        bnha.mo67695b("r", 400);
        bnha.mo67695b("b", 700);
        bnha.mo67695b("", 400);
        f56178b = bnha.mo67618b();
        HashMap hashMap = new HashMap();
        bnrd a = f56178b.entrySet().iterator();
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            String[] strArr = f56177a;
            for (String str : strArr) {
                String valueOf2 = String.valueOf((String) entry.getKey());
                String valueOf3 = String.valueOf(str);
                String str2 = valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3);
                Integer num = (Integer) entry.getValue();
                if (!str.isEmpty()) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                hashMap.put(str2, bmxw.m108574a(num, Float.valueOf(f)));
            }
        }
        f56179c = hashMap;
    }

    /* renamed from: a */
    static int m46686a(String str, int i) {
        try {
            return Integer.parseInt(str.substring(i));
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
            sb.append("query contains invalid value (");
            sb.append(str);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    static float m46688b(String str) {
        try {
            return Float.parseFloat(str.substring(4));
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
            sb.append("query contains invalid value (");
            sb.append(str);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* renamed from: a */
    public static List m46687a(String str) {
        FontMatchSpec fontMatchSpec;
        float f;
        int i;
        float f2;
        ArrayList arrayList;
        String str2 = str;
        if (str2 == null || str.isEmpty() || str.length() > 512) {
            throw new IllegalArgumentException("query cannot be null, empty, or over 512 characters");
        }
        char c = ',';
        if (str2.contains("=") || (str2.contains(",") && !str2.contains(":"))) {
            List<String> c2 = bmyx.m108640a(',').mo66917a().mo66920b().mo66925c((CharSequence) str2);
            ArrayList arrayList2 = new ArrayList(c2.size());
            for (String str3 : c2) {
                if (!str3.contains("=")) {
                    fontMatchSpec = new FontMatchSpec(str3);
                } else {
                    Map a = bmyx.m108640a('&').mo66916a(bmyx.m108640a('=').mo66920b()).mo66915a(str3);
                    String str4 = (String) a.get("name");
                    if (str4 == null || str4.isEmpty()) {
                        throw new IllegalArgumentException("'name' parameter is required.");
                    }
                    String str5 = (String) a.get("width");
                    String str6 = (String) a.get("weight");
                    String str7 = (String) a.get("italic");
                    String str8 = (String) a.get("besteffort");
                    if (str5 != null) {
                        try {
                            f = Float.parseFloat(str5);
                        } catch (NumberFormatException e) {
                            throw new IllegalArgumentException("Invalid numerical parameter", e);
                        }
                    } else {
                        f = 100.0f;
                    }
                    if (str6 != null) {
                        i = Integer.parseInt(str6);
                    } else {
                        i = 400;
                    }
                    if (str7 != null) {
                        f2 = Float.parseFloat(str7);
                    } else {
                        f2 = 0.0f;
                    }
                    fontMatchSpec = new FontMatchSpec(str4, f, i, f2, str8 != null ? Boolean.parseBoolean(str8) : false);
                }
                arrayList2.add(fontMatchSpec);
            }
            return arrayList2;
        }
        List<String> c3 = bmyx.m108640a('|').mo66917a().mo66920b().mo66925c((CharSequence) str2);
        ArrayList arrayList3 = new ArrayList();
        for (String str9 : c3) {
            if (str9 == null || str9.isEmpty()) {
                throw new IllegalArgumentException("query cannot be null or empty");
            }
            if (!str9.contains(":")) {
                arrayList = bnkn.m109665a(new FontMatchSpec(str9.replace('+', ' ')));
            } else {
                char c4 = ':';
                int indexOf = str9.indexOf(58);
                String replace = str9.substring(0, indexOf).replace('+', ' ');
                String substring = str9.substring(indexOf + 1);
                ArrayList arrayList4 = new ArrayList();
                for (String str10 : bmyx.m108640a(c).mo66917a().mo66920b().mo66925c((CharSequence) substring)) {
                    float f3 = 100.0f;
                    int i2 = 400;
                    float f4 = 0.0f;
                    boolean z = false;
                    for (String str11 : bmyx.m108640a(c4).mo66917a().mo66920b().mo66925c((CharSequence) str10)) {
                        String lowerCase = str11.toLowerCase(Locale.ENGLISH);
                        bmxw bmxw = (bmxw) f56179c.get(lowerCase);
                        if (bmxw != null) {
                            i2 = ((Integer) bmxw.f131187a).intValue();
                            f4 = ((Float) bmxw.f131188b).floatValue();
                        } else if (lowerCase.equals("nearest")) {
                            z = true;
                        } else if (lowerCase.startsWith("wght")) {
                            int a2 = m46686a(lowerCase, 4);
                            if (a2 <= 0 || a2 > 1000) {
                                StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 32);
                                sb.append("query contains invalid weight (");
                                sb.append(lowerCase);
                                sb.append(")");
                                throw new IllegalArgumentException(sb.toString());
                            }
                            i2 = a2;
                        } else if (lowerCase.startsWith("ital")) {
                            f4 = m46688b(lowerCase);
                            if (f4 < 0.0f || f4 > 1.0f) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 38);
                                sb2.append("query contains invalid italic value (");
                                sb2.append(lowerCase);
                                sb2.append(")");
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        } else if (lowerCase.startsWith("wdth")) {
                            f3 = m46688b(lowerCase);
                            if (f3 <= 0.0f) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(lowerCase).length() + 31);
                                sb3.append("query contains invalid width (");
                                sb3.append(lowerCase);
                                sb3.append(")");
                                throw new IllegalArgumentException(sb3.toString());
                            }
                        } else {
                            int a3 = m46686a(lowerCase, 0);
                            if (a3 <= 0 || a3 > 1000) {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(lowerCase).length() + 32);
                                sb4.append("query contains invalid weight (");
                                sb4.append(lowerCase);
                                sb4.append(")");
                                throw new IllegalArgumentException(sb4.toString());
                            }
                            i2 = a3;
                        }
                    }
                    arrayList4.add(new FontMatchSpec(replace, f3, i2, f4, z));
                    c4 = ':';
                }
                arrayList = arrayList4;
            }
            arrayList3.addAll(arrayList);
            c = ',';
        }
        return arrayList3;
    }
}
