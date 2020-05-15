package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: beao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beao {

    /* renamed from: a */
    static final Pattern f106748a = Pattern.compile("[+＋]+");

    /* renamed from: b */
    static final Pattern f106749b = Pattern.compile("[\\\\/] *x");

    /* renamed from: c */
    static final Pattern f106750c = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");

    /* renamed from: d */
    private static final Logger f106751d = Logger.getLogger(beao.class.getName());

    /* renamed from: e */
    private static final Map f106752e;

    /* renamed from: f */
    private static final Map f106753f;

    /* renamed from: g */
    private static final String f106754g = (Arrays.toString(f106752e.keySet().toArray()).replaceAll("[, \\[\\]]", "") + Arrays.toString(f106752e.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));

    /* renamed from: h */
    private static final Pattern f106755h = Pattern.compile("(\\p{Nd})");

    /* renamed from: i */
    private static final Pattern f106756i = Pattern.compile("[+＋\\p{Nd}]");

    /* renamed from: j */
    private static final Pattern f106757j = Pattern.compile("(?:.*?[A-Za-z]){3}.*");

    /* renamed from: k */
    private static final String f106758k = ("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*" + f106754g + "\\p{Nd}]*");

    /* renamed from: l */
    private static final String f106759l;

    /* renamed from: m */
    private static final Pattern f106760m = Pattern.compile("(?:" + f106759l + ")$", 66);

    /* renamed from: n */
    private static final Pattern f106761n = Pattern.compile(f106758k + "(?:" + f106759l + ")?", 66);

    /* renamed from: o */
    private static final Pattern f106762o = Pattern.compile("(\\$\\d)");

    /* renamed from: p */
    private static beao f106763p = null;

    /* renamed from: q */
    private final Map f106764q;

    /* renamed from: r */
    private final Set f106765r = new HashSet(35);

    /* renamed from: s */
    private final beax f106766s = new beax();

    /* renamed from: t */
    private final Set f106767t = new HashSet(320);

    /* renamed from: u */
    private final Set f106768u = new HashSet();

    /* renamed from: v */
    private final beam f106769v;

    /* renamed from: w */
    private final beau f106770w = new beau();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(54, "9");
        Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        Collections.unmodifiableSet(hashSet2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put('0', '0');
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        HashMap hashMap3 = new HashMap(40);
        hashMap3.put('A', '2');
        hashMap3.put('B', '2');
        hashMap3.put('C', '2');
        hashMap3.put('D', '3');
        hashMap3.put('E', '3');
        hashMap3.put('F', '3');
        hashMap3.put('G', '4');
        hashMap3.put('H', '4');
        hashMap3.put('I', '4');
        hashMap3.put('J', '5');
        hashMap3.put('K', '5');
        hashMap3.put('L', '5');
        hashMap3.put('M', '6');
        hashMap3.put('N', '6');
        hashMap3.put('O', '6');
        hashMap3.put('P', '7');
        hashMap3.put('Q', '7');
        hashMap3.put('R', '7');
        hashMap3.put('S', '7');
        hashMap3.put('T', '8');
        hashMap3.put('U', '8');
        hashMap3.put('V', '8');
        hashMap3.put('W', '9');
        hashMap3.put('X', '9');
        hashMap3.put('Y', '9');
        hashMap3.put('Z', '9');
        f106752e = Collections.unmodifiableMap(hashMap3);
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(f106752e);
        hashMap4.putAll(hashMap2);
        f106753f = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        for (Character ch : f106752e.keySet()) {
            char charValue = ch.charValue();
            Character valueOf = Character.valueOf(Character.toLowerCase(charValue));
            Character valueOf2 = Character.valueOf(charValue);
            hashMap6.put(valueOf, valueOf2);
            hashMap6.put(valueOf2, valueOf2);
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put('-', '-');
        hashMap6.put(65293, '-');
        hashMap6.put(8208, '-');
        hashMap6.put(8209, '-');
        hashMap6.put(8210, '-');
        hashMap6.put(8211, '-');
        hashMap6.put(8212, '-');
        hashMap6.put(8213, '-');
        hashMap6.put(8722, '-');
        hashMap6.put('/', '/');
        hashMap6.put(65295, '/');
        hashMap6.put(' ', ' ');
        hashMap6.put(12288, ' ');
        hashMap6.put(8288, ' ');
        hashMap6.put('.', '.');
        hashMap6.put(65294, '.');
        Collections.unmodifiableMap(hashMap6);
        StringBuilder sb = new StringBuilder();
        sb.append(",;xｘ#＃~～");
        f106759l = m91681c(sb.toString());
        m91681c("xｘ#＃~～");
    }

    public beao(beam beam, Map map) {
        this.f106769v = beam;
        this.f106764q = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() != 1 || !"001".equals(list.get(0))) {
                this.f106767t.addAll(list);
            } else {
                this.f106768u.add(entry.getKey());
            }
        }
        if (this.f106767t.remove("001")) {
            f106751d.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.f106765r.addAll((Collection) map.get(1));
    }

    /* renamed from: a */
    private final int m91667a(CharSequence charSequence, beaq beaq) {
        return m91668a(charSequence, beaq, 12);
    }

    /* renamed from: a */
    static synchronized void m91674a(beao beao) {
        synchronized (beao.class) {
            f106763p = beao;
        }
    }

    /* renamed from: b */
    public static String m91678b(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            int digit = Character.digit(charSequence.charAt(i), 10);
            if (digit != -1) {
                sb.append(digit);
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    private static beat m91680c(beat beat) {
        beat beat2 = new beat();
        beat2.f106841a = beat.f106841a;
        beat2.f106842b = beat.f106842b;
        if (beat.f106844d.length() > 0) {
            beat2.mo58505a(beat.f106844d);
        }
        if (beat.f106845e) {
            beat2.mo58503a();
            beat2.mo58504a(beat.f106846f);
        }
        return beat2;
    }

    /* renamed from: d */
    private final boolean m91682d(String str) {
        return str != null && this.f106767t.contains(str);
    }

    /* renamed from: e */
    private final int m91683e(String str) {
        beaq a = mo58482a(str);
        if (a != null) {
            return a.f106819l;
        }
        throw new IllegalArgumentException("Invalid region code: " + str);
    }

    /* renamed from: a */
    private final int m91668a(CharSequence charSequence, beaq beaq, int i) {
        ArrayList arrayList;
        beas a = m91672a(beaq, i);
        if (a.f106836b.isEmpty()) {
            arrayList = beaq.f106805a.f106836b;
        } else {
            arrayList = a.f106836b;
        }
        List list = a.f106837c;
        if (i == 3) {
            if (!m91676a(m91672a(beaq, 1))) {
                return m91668a(charSequence, beaq, 2);
            }
            beas a2 = m91672a(beaq, 2);
            if (m91676a(a2)) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList2.addAll(a2.f106836b.size() == 0 ? beaq.f106805a.f106836b : a2.f106836b);
                Collections.sort(arrayList2);
                if (!list.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList(list);
                    arrayList3.addAll(a2.f106837c);
                    Collections.sort(arrayList3);
                    list = arrayList3;
                    arrayList = arrayList2;
                } else {
                    list = a2.f106837c;
                    arrayList = arrayList2;
                }
            }
        }
        if (((Integer) arrayList.get(0)).intValue() == -1) {
            return 5;
        }
        int length = charSequence.length();
        Integer valueOf = Integer.valueOf(length);
        if (list.contains(valueOf)) {
            return 2;
        }
        int intValue = ((Integer) arrayList.get(0)).intValue();
        if (intValue == length) {
            return 1;
        }
        if (intValue > length) {
            return 4;
        }
        if (((Integer) arrayList.get(arrayList.size() - 1)).intValue() < length) {
            return 6;
        }
        if (arrayList.subList(1, arrayList.size()).contains(valueOf)) {
            return 1;
        }
        return 5;
    }

    /* renamed from: b */
    private static final boolean m91679b(beat beat, beat beat2) {
        String valueOf = String.valueOf(beat.f106842b);
        String valueOf2 = String.valueOf(beat2.f106842b);
        return valueOf.endsWith(valueOf2) || valueOf2.endsWith(valueOf);
    }

    /* renamed from: c */
    private static String m91681c(String str) {
        return ";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|[" + str + "]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#";
    }

    /* renamed from: b */
    public final int mo58491b(String str) {
        if (m91682d(str)) {
            return m91683e(str);
        }
        Logger logger = f106751d;
        Level level = Level.WARNING;
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid or missing region code (");
        if (str == null) {
            str = "null";
        }
        sb.append(str);
        sb.append(") provided.");
        logger.log(level, sb.toString());
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0076, code lost:
        r2 = r3;
     */
    /* renamed from: b */
    public final boolean mo58492b(beat beat) {
        int i = beat.f106841a;
        List list = (List) this.f106764q.get(Integer.valueOf(i));
        String str = null;
        if (list != null) {
            if (list.size() != 1) {
                String a = mo58485a(beat);
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str2 = (String) it.next();
                    beaq a2 = mo58482a(str2);
                    if (a2.f106828u) {
                        if (this.f106766s.mo58514a(a2.f106829v).matcher(a).lookingAt()) {
                            break;
                        }
                    } else if (m91669a(a, a2) != 12) {
                        break;
                    }
                }
            } else {
                str = (String) list.get(0);
            }
        } else {
            Logger logger = f106751d;
            Level level = Level.INFO;
            logger.log(level, "Missing/invalid country_code (" + i + ")");
        }
        return mo58489a(beat, str);
    }

    /* renamed from: a */
    private final int m91669a(String str, beaq beaq) {
        if (!mo58490a(str, beaq.f106805a)) {
            return 12;
        }
        if (mo58490a(str, beaq.f106812e)) {
            return 5;
        }
        if (mo58490a(str, beaq.f106811d)) {
            return 4;
        }
        if (mo58490a(str, beaq.f106813f)) {
            return 6;
        }
        if (mo58490a(str, beaq.f106815h)) {
            return 7;
        }
        if (mo58490a(str, beaq.f106814g)) {
            return 8;
        }
        if (mo58490a(str, beaq.f106816i)) {
            return 9;
        }
        if (mo58490a(str, beaq.f106817j)) {
            return 10;
        }
        if (mo58490a(str, beaq.f106818k)) {
            return 11;
        }
        if (mo58490a(str, beaq.f106809b)) {
            if (beaq.f106825r || mo58490a(str, beaq.f106810c)) {
                return 3;
            }
            return 1;
        } else if (beaq.f106825r || !mo58490a(str, beaq.f106810c)) {
            return 12;
        } else {
            return 2;
        }
    }

    /* renamed from: a */
    public static synchronized beao m91670a() {
        beao beao;
        synchronized (beao.class) {
            if (f106763p == null) {
                if (beal.f106741a != null) {
                    m91674a(new beao(new beam(), beaj.m91665a()));
                } else {
                    throw new IllegalArgumentException("metadataLoader could not be null.");
                }
            }
            beao = f106763p;
        }
        return beao;
    }

    /* renamed from: a */
    private final beaq m91671a(int i, String str) {
        if (!"001".equals(str)) {
            return mo58482a(str);
        }
        Map map = this.f106764q;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return null;
        }
        beam beam = this.f106769v;
        List list = (List) beaj.m91665a().get(valueOf);
        if (list.size() != 1 || !"001".equals(list.get(0))) {
            return null;
        }
        return beal.m91666a(valueOf, beam.f106745c, beam.f106743a);
    }

    /* renamed from: a */
    static final beas m91672a(beaq beaq, int i) {
        switch (i - 1) {
            case 0:
            case 2:
                return beaq.f106809b;
            case 1:
                return beaq.f106810c;
            case 3:
                return beaq.f106811d;
            case 4:
                return beaq.f106812e;
            case 5:
                return beaq.f106813f;
            case 6:
                return beaq.f106815h;
            case 7:
                return beaq.f106814g;
            case 8:
                return beaq.f106816i;
            case 9:
                return beaq.f106817j;
            case 10:
                return beaq.f106818k;
            default:
                return beaq.f106805a;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.StringBuilder.insert(int, char):java.lang.StringBuilder}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.StringBuilder.insert(int, java.lang.CharSequence):java.lang.StringBuilder}
      ClspMth{java.lang.StringBuilder.insert(int, java.lang.Object):java.lang.StringBuilder}
      ClspMth{java.lang.StringBuilder.insert(int, float):java.lang.StringBuilder}
      ClspMth{java.lang.StringBuilder.insert(int, java.lang.String):java.lang.StringBuilder}
      ClspMth{java.lang.StringBuilder.insert(int, long):java.lang.StringBuilder}
      ClspMth{java.lang.StringBuilder.insert(int, char[]):java.lang.StringBuilder}
      ClspMth{java.lang.StringBuilder.insert(int, int):java.lang.StringBuilder}
      ClspMth{java.lang.StringBuilder.insert(int, boolean):java.lang.StringBuilder}
      ClspMth{java.lang.StringBuilder.insert(int, double):java.lang.StringBuilder}
      ClspMth{java.lang.StringBuilder.insert(int, char):java.lang.StringBuilder} */
    /* renamed from: a */
    private static final void m91673a(int i, int i2, StringBuilder sb) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            sb.insert(0, i).insert(0, '+');
        } else if (i3 == 1) {
            sb.insert(0, " ").insert(0, i).insert(0, '+');
        }
    }

    /* renamed from: a */
    static void m91675a(StringBuilder sb) {
        if (f106757j.matcher(sb).matches()) {
            int length = sb.length();
            Map map = f106753f;
            StringBuilder sb2 = new StringBuilder(sb.length());
            for (int i = 0; i < sb.length(); i++) {
                Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(sb.charAt(i))));
                if (ch != null) {
                    sb2.append(ch);
                }
            }
            sb.replace(0, length, sb2.toString());
            return;
        }
        sb.replace(0, sb.length(), m91678b(sb));
    }

    /* renamed from: a */
    private static boolean m91676a(beas beas) {
        if (beas.mo58500a() == 1 && ((Integer) beas.f106836b.get(0)).intValue() == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static boolean m91677a(CharSequence charSequence) {
        if (charSequence.length() >= 2) {
            return f106761n.matcher(charSequence).matches();
        }
        return false;
    }

    /* renamed from: a */
    public final int mo58479a(beat beat, beat beat2) {
        beat c = m91680c(beat);
        beat c2 = m91680c(beat2);
        if (c.f106843c && c2.f106843c && !c.f106844d.equals(c2.f106844d)) {
            return 2;
        }
        int i = c.f106841a;
        int i2 = c2.f106841a;
        if (i == 0 || i2 == 0) {
            c.f106841a = i2;
            if (!c.mo58506a(c2)) {
                return !m91679b(c, c2) ? 2 : 3;
            }
            return 4;
        } else if (c.mo58506a(c2)) {
            return 5;
        } else {
            return (i != i2 || !m91679b(c, c2)) ? 2 : 3;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: beao.a(java.lang.CharSequence, java.lang.String, boolean, beat):void
     arg types: [java.lang.CharSequence, ?[OBJECT, ARRAY], int, beat]
     candidates:
      beao.a(java.lang.CharSequence, beaq, java.lang.StringBuilder, beat):int
      beao.a(java.lang.CharSequence, java.lang.String, boolean, beat):void */
    /* renamed from: a */
    public final int mo58480a(beat beat, CharSequence charSequence) {
        try {
            return mo58479a(beat, mo58483a(charSequence, "ZZ"));
        } catch (bean e) {
            if (e.f106746a == 1) {
                String a = mo58484a(beat.f106841a);
                try {
                    if (a.equals("ZZ")) {
                        beat beat2 = new beat();
                        mo58487a(charSequence, (String) null, false, beat2);
                        return mo58479a(beat, beat2);
                    }
                    int a2 = mo58479a(beat, mo58483a(charSequence, a));
                    if (a2 == 5) {
                        return 4;
                    }
                    return a2;
                } catch (bean e2) {
                    return 1;
                }
            }
            return 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo58481a(CharSequence charSequence, beaq beaq, StringBuilder sb, beat beat) {
        String str;
        int i = 0;
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        if (beaq == null) {
            str = "NonMatch";
        } else {
            str = beaq.f106820m;
        }
        if (sb2.length() != 0) {
            Matcher matcher = f106748a.matcher(sb2);
            if (matcher.lookingAt()) {
                sb2.delete(0, matcher.end());
                m91675a(sb2);
            } else {
                Pattern a = this.f106766s.mo58514a(str);
                m91675a(sb2);
                Matcher matcher2 = a.matcher(sb2);
                if (matcher2.lookingAt()) {
                    int end = matcher2.end();
                    Matcher matcher3 = f106755h.matcher(sb2.substring(end));
                    if (!matcher3.find() || !m91678b((CharSequence) matcher3.group(1)).equals("0")) {
                        sb2.delete(0, end);
                    }
                }
            }
            if (sb2.length() > 2) {
                if (sb2.length() != 0 && sb2.charAt(0) != '0') {
                    int length = sb2.length();
                    int i2 = 1;
                    while (true) {
                        if (i2 > 3 || i2 > length) {
                            break;
                        }
                        int parseInt = Integer.parseInt(sb2.substring(0, i2));
                        if (this.f106764q.containsKey(Integer.valueOf(parseInt))) {
                            sb.append(sb2.substring(i2));
                            i = parseInt;
                            break;
                        }
                        i2++;
                    }
                }
                if (i != 0) {
                    beat.f106841a = i;
                    return i;
                }
                throw new bean(1, "Country calling code supplied was not recognised.");
            }
            throw new bean(3, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
        }
        if (beaq != null) {
            int i3 = beaq.f106819l;
            String valueOf = String.valueOf(i3);
            String sb3 = sb2.toString();
            if (sb3.startsWith(valueOf)) {
                StringBuilder sb4 = new StringBuilder(sb3.substring(valueOf.length()));
                beas beas = beaq.f106805a;
                mo58488a(sb4, beaq, (StringBuilder) null);
                if ((!this.f106770w.mo58510a(sb2, beas) && this.f106770w.mo58510a(sb4, beas)) || m91667a(sb2, beaq) == 6) {
                    sb.append((CharSequence) sb4);
                    beat.f106841a = i3;
                    return i3;
                }
            }
        }
        beat.f106841a = 0;
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final beaq mo58482a(String str) {
        if (!m91682d(str)) {
            return null;
        }
        beam beam = this.f106769v;
        return beal.m91666a(str, beam.f106744b, beam.f106743a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: beao.a(java.lang.CharSequence, java.lang.String, boolean, beat):void
     arg types: [java.lang.CharSequence, java.lang.String, int, beat]
     candidates:
      beao.a(java.lang.CharSequence, beaq, java.lang.StringBuilder, beat):int
      beao.a(java.lang.CharSequence, java.lang.String, boolean, beat):void */
    /* renamed from: a */
    public final beat mo58483a(CharSequence charSequence, String str) {
        beat beat = new beat();
        mo58487a(charSequence, str, true, beat);
        return beat;
    }

    /* renamed from: a */
    public final String mo58484a(int i) {
        List list = (List) this.f106764q.get(Integer.valueOf(i));
        return list != null ? (String) list.get(0) : "ZZ";
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(char[], char):void}
     arg types: [char[], int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(long[], long):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
      ClspMth{java.util.Arrays.fill(short[], short):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void}
      ClspMth{java.util.Arrays.fill(char[], char):void} */
    /* renamed from: a */
    public final String mo58485a(beat beat) {
        int i;
        StringBuilder sb = new StringBuilder();
        if (beat.f106845e && (i = beat.f106846f) > 0) {
            char[] cArr = new char[i];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(beat.f106842b);
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo58486a(beat beat, int i) {
        List list;
        beap beap;
        if (beat.f106842b == 0) {
            boolean z = beat.f106847g;
        }
        StringBuilder sb = new StringBuilder(20);
        int i2 = 0;
        sb.setLength(0);
        int i3 = beat.f106841a;
        String a = mo58485a(beat);
        if (i == 1) {
            sb.append(a);
            m91673a(i3, 1, sb);
        } else if (!this.f106764q.containsKey(Integer.valueOf(i3))) {
            sb.append(a);
        } else {
            beaq a2 = m91671a(i3, mo58484a(i3));
            if (a2.f106827t.size() == 0 || i == 3) {
                list = a2.f106826s;
            } else {
                list = a2.f106827t;
            }
            int size = list.size();
            while (true) {
                if (i2 < size) {
                    beap = (beap) list.get(i2);
                    int a3 = beap.mo58493a();
                    if ((a3 == 0 || this.f106766s.mo58514a((String) beap.f106773c.get(a3 - 1)).matcher(a).lookingAt()) && this.f106766s.mo58514a(beap.f106771a).matcher(a).matches()) {
                        break;
                    }
                    i2++;
                } else {
                    beap = null;
                    break;
                }
            }
            if (beap != null) {
                String str = beap.f106772b;
                Matcher matcher = this.f106766s.mo58514a(beap.f106771a).matcher(a);
                String str2 = beap.f106774d;
                if (i == 3 && str2 != null && str2.length() > 0) {
                    a = matcher.replaceAll(f106762o.matcher(str).replaceFirst(str2));
                } else {
                    a = matcher.replaceAll(str);
                }
            }
            sb.append(a);
            if (beat.f106843c && beat.f106844d.length() > 0) {
                if (a2.f106821n) {
                    sb.append(a2.f106822o);
                    sb.append(beat.f106844d);
                } else {
                    sb.append(" ext. ");
                    sb.append(beat.f106844d);
                }
            }
            m91673a(i3, i, sb);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo58487a(CharSequence charSequence, String str, boolean z, beat beat) {
        int i;
        CharSequence charSequence2;
        if (charSequence == null) {
            throw new bean(2, "The phone number supplied was null.");
        } else if (charSequence.length() <= 250) {
            StringBuilder sb = new StringBuilder();
            String charSequence3 = charSequence.toString();
            int indexOf = charSequence3.indexOf(";phone-context=");
            String str2 = "";
            if (indexOf >= 0) {
                int i2 = indexOf + 15;
                if (i2 < charSequence3.length() - 1 && charSequence3.charAt(i2) == '+') {
                    int indexOf2 = charSequence3.indexOf(59, i2);
                    if (indexOf2 > 0) {
                        sb.append(charSequence3.substring(i2, indexOf2));
                    } else {
                        sb.append(charSequence3.substring(i2));
                    }
                }
                int indexOf3 = charSequence3.indexOf("tel:");
                sb.append(charSequence3.substring(indexOf3 >= 0 ? indexOf3 + 4 : 0, indexOf));
            } else {
                Matcher matcher = f106756i.matcher(charSequence3);
                if (matcher.find()) {
                    charSequence2 = charSequence3.subSequence(matcher.start(), charSequence3.length());
                    Matcher matcher2 = f106750c.matcher(charSequence2);
                    if (matcher2.find()) {
                        charSequence2 = charSequence2.subSequence(0, matcher2.start());
                    }
                    Matcher matcher3 = f106749b.matcher(charSequence2);
                    if (matcher3.find()) {
                        charSequence2 = charSequence2.subSequence(0, matcher3.start());
                    }
                } else {
                    charSequence2 = str2;
                }
                sb.append(charSequence2);
            }
            int indexOf4 = sb.indexOf(";isub=");
            if (indexOf4 > 0) {
                sb.delete(indexOf4, sb.length());
            }
            if (!m91677a((CharSequence) sb)) {
                throw new bean(2, "The string supplied did not seem to be a phone number.");
            } else if (z && !m91682d(str) && (sb.length() == 0 || !f106748a.matcher(sb).lookingAt())) {
                throw new bean(1, "Missing or invalid default region.");
            } else {
                Matcher matcher4 = f106760m.matcher(sb);
                if (matcher4.find() && m91677a((CharSequence) sb.substring(0, matcher4.start()))) {
                    int groupCount = matcher4.groupCount();
                    int i3 = 1;
                    while (true) {
                        if (i3 > groupCount) {
                            break;
                        } else if (matcher4.group(i3) != null) {
                            str2 = matcher4.group(i3);
                            sb.delete(matcher4.start(), sb.length());
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                if (str2.length() > 0) {
                    beat.mo58505a(str2);
                }
                beaq a = mo58482a(str);
                StringBuilder sb2 = new StringBuilder();
                try {
                    i = mo58481a(sb, a, sb2, beat);
                } catch (bean e) {
                    Matcher matcher5 = f106748a.matcher(sb);
                    if (e.f106746a != 1 || !matcher5.lookingAt()) {
                        throw new bean(e.f106746a, e.getMessage());
                    }
                    i = mo58481a(sb.substring(matcher5.end()), a, sb2, beat);
                    if (i == 0) {
                        throw new bean(1, "Could not interpret numbers after plus-sign.");
                    }
                }
                if (i == 0) {
                    m91675a(sb);
                    sb2.append((CharSequence) sb);
                    if (str != null) {
                        beat.f106841a = a.f106819l;
                    }
                } else {
                    String a2 = mo58484a(i);
                    if (!a2.equals(str)) {
                        a = m91671a(i, a2);
                    }
                }
                if (sb2.length() >= 2) {
                    if (a != null) {
                        StringBuilder sb3 = new StringBuilder();
                        StringBuilder sb4 = new StringBuilder(sb2);
                        mo58488a(sb4, a, sb3);
                        int a3 = m91667a(sb4, a);
                        if (!(a3 == 4 || a3 == 2 || a3 == 5)) {
                            sb2 = sb4;
                        }
                    }
                    int length = sb2.length();
                    if (length < 2) {
                        throw new bean(4, "The string supplied is too short to be a phone number.");
                    } else if (length <= 17) {
                        if (sb2.length() > 1 && sb2.charAt(0) == '0') {
                            beat.mo58503a();
                            int i4 = 1;
                            while (i4 < sb2.length() - 1 && sb2.charAt(i4) == '0') {
                                i4++;
                            }
                            if (i4 != 1) {
                                beat.mo58504a(i4);
                            }
                        }
                        beat.f106842b = Long.parseLong(sb2.toString());
                    } else {
                        throw new bean(5, "The string supplied is too long to be a phone number.");
                    }
                } else {
                    throw new bean(4, "The string supplied is too short to be a phone number.");
                }
            }
        } else {
            throw new bean(5, "The string supplied was too long to parse.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58488a(StringBuilder sb, beaq beaq, StringBuilder sb2) {
        int length = sb.length();
        String str = beaq.f106823p;
        if (length != 0 && str.length() != 0) {
            Matcher matcher = this.f106766s.mo58514a(str).matcher(sb);
            if (matcher.lookingAt()) {
                beas beas = beaq.f106805a;
                boolean a = this.f106770w.mo58510a(sb, beas);
                int groupCount = matcher.groupCount();
                String str2 = beaq.f106824q;
                if (str2 != null && str2.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder sb3 = new StringBuilder(sb);
                    sb3.replace(0, length, matcher.replaceFirst(str2));
                    if (!a || this.f106770w.mo58510a(sb3.toString(), beas)) {
                        if (sb2 != null && groupCount > 1) {
                            sb2.append(matcher.group(1));
                        }
                        sb.replace(0, sb.length(), sb3.toString());
                    }
                } else if (!a || this.f106770w.mo58510a(sb.substring(matcher.end()), beas)) {
                    if (!(sb2 == null || groupCount <= 0 || matcher.group(groupCount) == null)) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo58489a(beat beat, String str) {
        int i = beat.f106841a;
        beaq a = m91671a(i, str);
        if (a == null || ((!"001".equals(str) && i != m91683e(str)) || m91669a(mo58485a(beat), a) == 12)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo58490a(String str, beas beas) {
        int length = str.length();
        List list = beas.f106836b;
        if (list.size() <= 0 || list.contains(Integer.valueOf(length))) {
            return this.f106770w.mo58510a(str, beas);
        }
        return false;
    }
}
