package p000;

import java.lang.Character;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: bmzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmzg {

    /* renamed from: a */
    private static final bmzf f131261a;

    /* renamed from: b */
    private static final bmzf f131262b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmwx.a(char, char):bmwx
     arg types: [int, int]
     candidates:
      bmwx.a(java.lang.CharSequence, int):int
      bmwx.a(char, char):bmwx */
    static {
        bmyx.m108640a(10).mo66917a();
        bmyx.m108642a(bmwl.f131141a).mo66917a();
        bmwx.m108504f("‘’");
        bmwx.m108504f("“”");
        HashMap hashMap = new HashMap(252);
        hashMap.put("&nbsp", 160);
        hashMap.put("&iexcl", 161);
        hashMap.put("&cent", 162);
        hashMap.put("&pound", 163);
        hashMap.put("&curren", 164);
        hashMap.put("&yen", 165);
        hashMap.put("&brvbar", 166);
        hashMap.put("&sect", 167);
        hashMap.put("&uml", 168);
        hashMap.put("&copy", 169);
        hashMap.put("&ordf", 170);
        hashMap.put("&laquo", 171);
        hashMap.put("&not", 172);
        hashMap.put("&shy", 173);
        hashMap.put("&reg", 174);
        hashMap.put("&macr", 175);
        hashMap.put("&deg", 176);
        hashMap.put("&plusmn", 177);
        hashMap.put("&sup2", 178);
        hashMap.put("&sup3", 179);
        hashMap.put("&acute", 180);
        hashMap.put("&micro", 181);
        hashMap.put("&para", 182);
        hashMap.put("&middot", 183);
        hashMap.put("&cedil", 184);
        hashMap.put("&sup1", 185);
        hashMap.put("&ordm", 186);
        hashMap.put("&raquo", 187);
        hashMap.put("&frac14", 188);
        hashMap.put("&frac12", 189);
        hashMap.put("&frac34", 190);
        hashMap.put("&iquest", 191);
        hashMap.put("&Agrave", 192);
        hashMap.put("&Aacute", 193);
        hashMap.put("&Acirc", 194);
        hashMap.put("&Atilde", 195);
        hashMap.put("&Auml", 196);
        hashMap.put("&Aring", 197);
        hashMap.put("&AElig", 198);
        hashMap.put("&Ccedil", 199);
        hashMap.put("&Egrave", 200);
        hashMap.put("&Eacute", 201);
        hashMap.put("&Ecirc", 202);
        hashMap.put("&Euml", 203);
        hashMap.put("&Igrave", 204);
        hashMap.put("&Iacute", 205);
        hashMap.put("&Icirc", 206);
        hashMap.put("&Iuml", 207);
        hashMap.put("&ETH", 208);
        hashMap.put("&Ntilde", 209);
        hashMap.put("&Ograve", 210);
        hashMap.put("&Oacute", 211);
        hashMap.put("&Ocirc", 212);
        hashMap.put("&Otilde", 213);
        hashMap.put("&Ouml", 214);
        hashMap.put("&times", 215);
        hashMap.put("&Oslash", 216);
        hashMap.put("&Ugrave", 217);
        hashMap.put("&Uacute", 218);
        hashMap.put("&Ucirc", 219);
        hashMap.put("&Uuml", 220);
        hashMap.put("&Yacute", 221);
        hashMap.put("&THORN", 222);
        hashMap.put("&szlig", 223);
        hashMap.put("&agrave", 224);
        hashMap.put("&aacute", 225);
        hashMap.put("&acirc", 226);
        hashMap.put("&atilde", 227);
        hashMap.put("&auml", 228);
        hashMap.put("&aring", 229);
        hashMap.put("&aelig", 230);
        hashMap.put("&ccedil", 231);
        hashMap.put("&egrave", 232);
        hashMap.put("&eacute", 233);
        hashMap.put("&ecirc", 234);
        hashMap.put("&euml", 235);
        hashMap.put("&igrave", 236);
        hashMap.put("&iacute", 237);
        hashMap.put("&icirc", 238);
        hashMap.put("&iuml", 239);
        hashMap.put("&eth", 240);
        hashMap.put("&ntilde", 241);
        hashMap.put("&ograve", 242);
        hashMap.put("&oacute", 243);
        hashMap.put("&ocirc", 244);
        hashMap.put("&otilde", 245);
        hashMap.put("&ouml", 246);
        hashMap.put("&divide", 247);
        hashMap.put("&oslash", 248);
        hashMap.put("&ugrave", 249);
        hashMap.put("&uacute", 250);
        hashMap.put("&ucirc", 251);
        hashMap.put("&uuml", 252);
        hashMap.put("&yacute", 253);
        hashMap.put("&thorn", 254);
        hashMap.put("&yuml", 255);
        hashMap.put("&fnof", 402);
        hashMap.put("&Alpha", 913);
        hashMap.put("&Beta", 914);
        hashMap.put("&Gamma", 915);
        hashMap.put("&Delta", 916);
        hashMap.put("&Epsilon", 917);
        hashMap.put("&Zeta", 918);
        hashMap.put("&Eta", 919);
        hashMap.put("&Theta", 920);
        hashMap.put("&Iota", 921);
        hashMap.put("&Kappa", 922);
        hashMap.put("&Lambda", 923);
        hashMap.put("&Mu", 924);
        hashMap.put("&Nu", 925);
        hashMap.put("&Xi", 926);
        hashMap.put("&Omicron", 927);
        hashMap.put("&Pi", 928);
        hashMap.put("&Rho", 929);
        hashMap.put("&Sigma", 931);
        hashMap.put("&Tau", 932);
        hashMap.put("&Upsilon", 933);
        hashMap.put("&Phi", 934);
        hashMap.put("&Chi", 935);
        hashMap.put("&Psi", 936);
        hashMap.put("&Omega", 937);
        hashMap.put("&alpha", 945);
        hashMap.put("&beta", 946);
        hashMap.put("&gamma", 947);
        hashMap.put("&delta", 948);
        hashMap.put("&epsilon", 949);
        hashMap.put("&zeta", 950);
        hashMap.put("&eta", 951);
        hashMap.put("&theta", 952);
        hashMap.put("&iota", 953);
        hashMap.put("&kappa", 954);
        hashMap.put("&lambda", 955);
        hashMap.put("&mu", 956);
        hashMap.put("&nu", 957);
        hashMap.put("&xi", 958);
        hashMap.put("&omicron", 959);
        hashMap.put("&pi", 960);
        hashMap.put("&rho", 961);
        hashMap.put("&sigmaf", 962);
        hashMap.put("&sigma", 963);
        hashMap.put("&tau", 964);
        hashMap.put("&upsilon", 965);
        hashMap.put("&phi", 966);
        hashMap.put("&chi", 967);
        hashMap.put("&psi", 968);
        hashMap.put("&omega", 969);
        hashMap.put("&thetasym", 977);
        hashMap.put("&upsih", 978);
        hashMap.put("&piv", 982);
        hashMap.put("&bull", 8226);
        hashMap.put("&hellip", 8230);
        hashMap.put("&prime", 8242);
        hashMap.put("&Prime", 8243);
        hashMap.put("&oline", 8254);
        hashMap.put("&frasl", 8260);
        hashMap.put("&weierp", 8472);
        hashMap.put("&image", 8465);
        hashMap.put("&real", 8476);
        hashMap.put("&trade", 8482);
        hashMap.put("&alefsym", 8501);
        hashMap.put("&larr", 8592);
        hashMap.put("&uarr", 8593);
        hashMap.put("&rarr", 8594);
        hashMap.put("&darr", 8595);
        hashMap.put("&harr", 8596);
        hashMap.put("&crarr", 8629);
        hashMap.put("&lArr", 8656);
        hashMap.put("&uArr", 8657);
        hashMap.put("&rArr", 8658);
        hashMap.put("&dArr", 8659);
        hashMap.put("&hArr", 8660);
        hashMap.put("&forall", 8704);
        hashMap.put("&part", 8706);
        hashMap.put("&exist", 8707);
        hashMap.put("&empty", 8709);
        hashMap.put("&nabla", 8711);
        hashMap.put("&isin", 8712);
        hashMap.put("&notin", 8713);
        hashMap.put("&ni", 8715);
        hashMap.put("&prod", 8719);
        hashMap.put("&sum", 8721);
        hashMap.put("&minus", 8722);
        hashMap.put("&lowast", 8727);
        hashMap.put("&radic", 8730);
        hashMap.put("&prop", 8733);
        hashMap.put("&infin", 8734);
        hashMap.put("&ang", 8736);
        hashMap.put("&and", 8743);
        hashMap.put("&or", 8744);
        hashMap.put("&cap", 8745);
        hashMap.put("&cup", 8746);
        hashMap.put("&int", 8747);
        hashMap.put("&there4", 8756);
        hashMap.put("&sim", 8764);
        hashMap.put("&cong", 8773);
        hashMap.put("&asymp", 8776);
        hashMap.put("&ne", 8800);
        hashMap.put("&equiv", 8801);
        hashMap.put("&le", 8804);
        hashMap.put("&ge", 8805);
        hashMap.put("&sub", 8834);
        hashMap.put("&sup", 8835);
        hashMap.put("&nsub", 8836);
        hashMap.put("&sube", 8838);
        hashMap.put("&supe", 8839);
        hashMap.put("&oplus", 8853);
        hashMap.put("&otimes", 8855);
        hashMap.put("&perp", 8869);
        hashMap.put("&sdot", 8901);
        hashMap.put("&lceil", 8968);
        hashMap.put("&rceil", 8969);
        hashMap.put("&lfloor", 8970);
        hashMap.put("&rfloor", 8971);
        hashMap.put("&lang", 9001);
        hashMap.put("&rang", 9002);
        hashMap.put("&loz", 9674);
        hashMap.put("&spades", 9824);
        hashMap.put("&clubs", 9827);
        hashMap.put("&hearts", 9829);
        hashMap.put("&diams", 9830);
        hashMap.put("&quot", '\"');
        hashMap.put("&amp", '&');
        hashMap.put("&lt", '<');
        hashMap.put("&gt", '>');
        hashMap.put("&apos", '\'');
        hashMap.put("&OElig", 338);
        hashMap.put("&oelig", 339);
        hashMap.put("&Scaron", 352);
        hashMap.put("&scaron", 353);
        hashMap.put("&Yuml", 376);
        hashMap.put("&circ", 710);
        hashMap.put("&tilde", 732);
        hashMap.put("&ensp", 8194);
        hashMap.put("&emsp", 8195);
        hashMap.put("&thinsp", 8201);
        hashMap.put("&zwnj", 8204);
        hashMap.put("&zwj", 8205);
        hashMap.put("&lrm", 8206);
        hashMap.put("&rlm", 8207);
        hashMap.put("&ndash", 8211);
        hashMap.put("&mdash", 8212);
        hashMap.put("&lsquo", 8216);
        hashMap.put("&rsquo", 8217);
        hashMap.put("&sbquo", 8218);
        hashMap.put("&ldquo", 8220);
        hashMap.put("&rdquo", 8221);
        hashMap.put("&bdquo", 8222);
        hashMap.put("&dagger", 8224);
        hashMap.put("&Dagger", 8225);
        hashMap.put("&permil", 8240);
        hashMap.put("&lsaquo", 8249);
        hashMap.put("&rsaquo", 8250);
        hashMap.put("&euro", 8364);
        Collections.unmodifiableMap(hashMap);
        bmwx.m108500a('A', 'F').mo66834b(bmwx.m108500a('a', 'f'));
        bmzd bmzd = new bmzd();
        bmzd.mo66935a('<', "&lt;");
        bmzd.mo66935a('>', "&gt;");
        int i = bmzc.f131255a;
        bmzd.mo66934a();
        HashSet hashSet = new HashSet();
        hashSet.add(Character.UnicodeBlock.HANGUL_JAMO);
        hashSet.add(Character.UnicodeBlock.CJK_RADICALS_SUPPLEMENT);
        hashSet.add(Character.UnicodeBlock.KANGXI_RADICALS);
        hashSet.add(Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION);
        hashSet.add(Character.UnicodeBlock.HIRAGANA);
        hashSet.add(Character.UnicodeBlock.KATAKANA);
        hashSet.add(Character.UnicodeBlock.BOPOMOFO);
        hashSet.add(Character.UnicodeBlock.HANGUL_COMPATIBILITY_JAMO);
        hashSet.add(Character.UnicodeBlock.KANBUN);
        hashSet.add(Character.UnicodeBlock.BOPOMOFO_EXTENDED);
        hashSet.add(Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS);
        hashSet.add(Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS);
        hashSet.add(Character.UnicodeBlock.CJK_COMPATIBILITY);
        hashSet.add(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A);
        hashSet.add(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS);
        hashSet.add(Character.UnicodeBlock.HANGUL_SYLLABLES);
        hashSet.add(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS);
        hashSet.add(Character.UnicodeBlock.CJK_COMPATIBILITY_FORMS);
        hashSet.add(Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS);
        hashSet.add(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B);
        hashSet.add(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT);
        Collections.unmodifiableSet(hashSet);
        "0123456789abcdef".toCharArray();
        bmze bmze = new bmze();
        bmze.mo66937a(173);
        bmze.mo66938a(1536, 1539);
        bmze.mo66937a(1757);
        bmze.mo66937a(1807);
        bmze.mo66938a(6068, 6069);
        bmze.mo66938a(8203, 8207);
        bmze.mo66938a(8234, 8238);
        bmze.mo66938a(8288, 8292);
        bmze.mo66938a(8298, 8303);
        bmze.mo66937a(65279);
        bmze.mo66938a(65529, 65531);
        bmze.mo66938a(119155, 119162);
        bmze.mo66937a(917505);
        bmze.mo66938a(917536, 917631);
        bmze.mo66937a(0);
        bmze.mo66937a(10);
        bmze.mo66937a(13);
        bmze.mo66938a(8232, 8233);
        bmze.mo66937a(133);
        bmze.mo66937a(Character.codePointAt("'", 0));
        bmze.mo66937a(Character.codePointAt("\"", 0));
        bmze.mo66937a(Character.codePointAt("&", 0));
        bmze.mo66937a(Character.codePointAt("<", 0));
        bmze.mo66937a(Character.codePointAt(">", 0));
        bmze.mo66937a(Character.codePointAt("=", 0));
        bmze.mo66937a(Character.codePointAt("\\", 0));
        f131261a = bmze.mo66936a();
        bmze bmze2 = new bmze();
        bmze2.mo66937a(Character.codePointAt("\"", 0));
        bmze2.mo66937a(Character.codePointAt("\\", 0));
        bmze2.mo66938a(0, 31);
        bmzf a = bmze2.mo66936a();
        f131262b = a;
        bmzf bmzf = f131261a;
        bmze bmze3 = new bmze();
        bmze3.mo66939a(a);
        bmze3.mo66939a(bmzf);
        bmze3.mo66936a();
    }

    /* renamed from: a */
    public static boolean m108671a(String str) {
        return str == null || bmww.f131155b.mo66835b(str);
    }

    /* renamed from: a */
    public static boolean m108672a(String str, String str2) {
        return str.regionMatches(true, 0, str2, 0, str2.length());
    }
}
