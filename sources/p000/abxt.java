package p000;

import android.content.Context;
import com.google.firebase.appindexing.internal.Thing;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: abxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abxt {

    /* renamed from: c */
    private static abxt f58697c;

    /* renamed from: d */
    private static abxt f58698d;

    /* renamed from: e */
    private static abxt f58699e;

    /* renamed from: f */
    private static abvh f58700f;

    /* renamed from: a */
    final abvh f58701a;

    /* renamed from: b */
    public final bnic f58702b;

    /* renamed from: g */
    private final bnhe f58703g;

    private abxt(abvh abvh) {
        HashMap hashMap = new HashMap();
        bxwc bxwc = abvh.f58537a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            abvg abvg = (abvg) bxwc.get(i);
            hashMap.put(abvg.f58531b, abvg);
        }
        this.f58701a = abvh;
        this.f58703g = bnhe.m109413a(hashMap);
        this.f58702b = bnic.m109495a((Collection) abvh.f58538b);
    }

    /* renamed from: a */
    public static synchronized abxt m48503a() {
        abxt abxt;
        synchronized (abxt.class) {
            abvh b = celn.m137185b();
            if (f58697c == null || (acaw.m48798o() && !sdg.m34949a(f58700f, b))) {
                f58700f = b;
                abxs c = m48508c();
                if (b != null) {
                    c.mo32422a(b);
                }
                f58697c = new abxt(c.mo32420a());
            }
            bmxy.m108581a(f58697c);
            abxt = f58697c;
        }
        return abxt;
    }

    /* renamed from: b */
    public static synchronized abxt m48507b() {
        synchronized (abxt.class) {
            if (!cemz.m137436b()) {
                abxt a = m48503a();
                return a;
            }
            abxs c = m48508c();
            abvh b = celn.m137185b();
            if (b != null) {
                c.mo32422a(b);
            }
            abxt abxt = new abxt(c.mo32420a());
            f58699e = abxt;
            return abxt;
        }
    }

    /* renamed from: c */
    static abxs m48508c() {
        abxs abxs = new abxs();
        abxs.mo32421a(((Integer) abzt.f58966ca.mo58455c()).intValue(), ((Integer) abzt.f58967cb.mo58455c()).intValue(), Integer.parseInt((String) abzt.f58968cc.mo58455c()), cemw.f183016a.mo6606a().mo79376f());
        if (cemw.f183016a.mo6606a().mo79384n()) {
            bxvd da = abvg.f58528f.mo74144da();
            int seconds = (int) TimeUnit.DAYS.toSeconds(30);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abvg abvg = (abvg) da.f164949b;
            int i = abvg.f58530a | 2;
            abvg.f58530a = i;
            abvg.f58532c = seconds;
            "StashRecord".getClass();
            int i2 = i | 1;
            abvg.f58530a = i2;
            abvg.f58531b = "StashRecord";
            abvg.f58530a = i2 | 4;
            abvg.f58534e = 1;
            bxvd da2 = abvf.f58519h.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            abvf abvf = (abvf) da2.f164949b;
            "name".getClass();
            int i3 = abvf.f58521a | 1;
            abvf.f58521a = i3;
            abvf.f58522b = "name";
            abvf.f58523c = 2;
            abvf.f58521a = i3 | 2;
            da.mo74092o(da2);
            bxvd da3 = abvf.f58519h.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            abvf abvf2 = (abvf) da3.f164949b;
            "keywords".getClass();
            abvf2.f58521a |= 1;
            abvf2.f58522b = "keywords";
            da.mo74092o(da3);
            bxvd da4 = abvf.f58519h.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            abvf abvf3 = (abvf) da4.f164949b;
            "userId".getClass();
            int i4 = abvf3.f58521a | 1;
            abvf3.f58521a = i4;
            abvf3.f58522b = "userId";
            abvf3.f58523c = 1;
            abvf3.f58521a = i4 | 2;
            da.mo74092o(da4);
            bxvd da5 = abvf.f58519h.mo74144da();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            abvf abvf4 = (abvf) da5.f164949b;
            "userPayload".getClass();
            int i5 = abvf4.f58521a | 1;
            abvf4.f58521a = i5;
            abvf4.f58522b = "userPayload";
            abvf4.f58523c = 0;
            int i6 = i5 | 2;
            abvf4.f58521a = i6;
            abvf4.f58521a = i6 | 8;
            abvf4.f58525e = 5;
            da.mo74092o(da5);
            bxvd da6 = abvf.f58519h.mo74144da();
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            abvf abvf5 = (abvf) da6.f164949b;
            "title".getClass();
            int i7 = abvf5.f58521a | 1;
            abvf5.f58521a = i7;
            abvf5.f58522b = "title";
            abvf5.f58523c = 0;
            int i8 = i7 | 2;
            abvf5.f58521a = i8;
            abvf5.f58521a = i8 | 8;
            abvf5.f58525e = 4;
            da.mo74092o(da6);
            bxvd da7 = abvf.f58519h.mo74144da();
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            abvf abvf6 = (abvf) da7.f164949b;
            "content".getClass();
            int i9 = abvf6.f58521a | 1;
            abvf6.f58521a = i9;
            abvf6.f58522b = "content";
            abvf6.f58523c = 0;
            int i10 = i9 | 2;
            abvf6.f58521a = i10;
            abvf6.f58521a = i10 | 8;
            abvf6.f58525e = 2;
            da.mo74092o(da7);
            bxvd da8 = abvf.f58519h.mo74144da();
            if (da8.f164950c) {
                da8.mo74035c();
                da8.f164950c = false;
            }
            abvf abvf7 = (abvf) da8.f164949b;
            "lowPriorityContent".getClass();
            int i11 = abvf7.f58521a | 1;
            abvf7.f58521a = i11;
            abvf7.f58522b = "lowPriorityContent";
            abvf7.f58523c = 0;
            int i12 = i11 | 2;
            abvf7.f58521a = i12;
            abvf7.f58521a = i12 | 8;
            abvf7.f58525e = 1;
            da.mo74092o(da8);
            bxvd da9 = abvf.f58519h.mo74144da();
            if (da9.f164950c) {
                da9.mo74035c();
                da9.f164950c = false;
            }
            abvf abvf8 = (abvf) da9.f164949b;
            "salientTerms".getClass();
            int i13 = 1 | abvf8.f58521a;
            abvf8.f58521a = i13;
            abvf8.f58522b = "salientTerms";
            abvf8.f58523c = 0;
            int i14 = i13 | 2;
            abvf8.f58521a = i14;
            abvf8.f58521a = i14 | 8;
            abvf8.f58525e = 3;
            da.mo74092o(da9);
            abxs.f58696a.mo73983a((abvg) da.mo74062i());
        }
        return abxs;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abxt.a(java.lang.String, boolean):abvg
     arg types: [java.lang.String, int]
     candidates:
      abxt.a(com.google.firebase.appindexing.internal.Thing, java.lang.String):java.util.List
      abxt.a(java.lang.String, boolean):abvg */
    /* renamed from: b */
    public final abvg mo32425b(String str) {
        return mo32423a(str, true);
    }

    /* renamed from: a */
    public static synchronized abxt m48504a(Context context) {
        synchronized (abxt.class) {
            if (cemz.m137436b()) {
                if (f58698d == null) {
                    try {
                        f58698d = new abxt((abvh) bxvk.m124010a(abvh.f58535c, context.openFileInput("icing-predefined-type-configs")));
                    } catch (IOException e) {
                        f58698d = new abxt(m48508c().mo32420a());
                    }
                }
                abxt abxt = f58698d;
                return abxt;
            }
            abxt a = m48503a();
            return a;
        }
    }

    /* renamed from: a */
    public static List m48505a(Thing thing, String str) {
        int indexOf = str.indexOf(95);
        int i = 0;
        if (indexOf == -1) {
            String[] b = thing.mo72351b(str);
            if (b != null) {
                return Arrays.asList(b);
            }
            long[] c = thing.mo72352c(str);
            if (c != null) {
                String[] strArr = new String[c.length];
                while (i < c.length) {
                    strArr[i] = Long.toString(c[i]);
                    i++;
                }
                return Arrays.asList(strArr);
            }
            double[] d = thing.mo72353d(str);
            if (d != null) {
                String[] strArr2 = new String[d.length];
                while (i < d.length) {
                    strArr2[i] = Double.toString(d[i]);
                    i++;
                }
                return Arrays.asList(strArr2);
            }
        } else {
            Thing[] a = thing.mo72349a(str.substring(0, indexOf));
            if (a != null) {
                ArrayList arrayList = new ArrayList();
                int length = a.length;
                while (i < length) {
                    arrayList.addAll(m48505a(a[i], str.substring(indexOf + 1)));
                    i++;
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    public static synchronized void m48506a(Context context, abxt abxt, abym abym) {
        synchronized (abxt.class) {
            if (cemz.m137436b() && !sdg.m34949a(f58698d, abxt)) {
                try {
                    FileOutputStream openFileOutput = context.openFileOutput("icing-predefined-type-configs", 0);
                    abxt.f58701a.mo73638a(openFileOutput);
                    openFileOutput.close();
                    f58698d = abxt;
                } catch (IOException e) {
                    absg.m48191b("Cannot deploy PredefinedTypeIndexingConfig to disk");
                    abym.mo32453b(6014);
                }
            }
        }
    }

    /* renamed from: a */
    public final abvg mo32423a(String str, boolean z) {
        abvg abvg = (abvg) this.f58703g.get(str);
        if (abvg != null) {
            return abvg;
        }
        if (z) {
            absg.m48197c("Unsupported config type, fallback to Thing: %s", str);
        }
        abvg abvg2 = (abvg) this.f58703g.get("Thing");
        if (abvg2 != null) {
            return abvg2;
        }
        throw new IllegalStateException("THING type not found. TypeConfigMap must be malformed!");
    }

    /* renamed from: a */
    public final boolean mo32424a(String str) {
        return this.f58703g.containsKey(str);
    }
}
