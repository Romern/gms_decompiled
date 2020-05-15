package p000;

import android.util.Pair;
import com.google.android.gms.ocr.credit.base.PanResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: aktc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aktc extends akuu {

    /* renamed from: a */
    private final Pattern f72706a = Pattern.compile(String.format(Locale.US, "[\\dOQo]{%d}", 16));

    /* renamed from: b */
    private final akta f72707b;

    /* renamed from: c */
    private final aksc f72708c;

    /* renamed from: d */
    private final bsaq f72709d;

    public aktc(akta akta, aksc aksc, bsaq bsaq) {
        this.f72707b = akta;
        this.f72708c = aksc;
        this.f72709d = bsaq;
    }

    /* renamed from: a */
    private static final int m60408a(int i, int i2, ArrayList arrayList, StringBuilder sb) {
        int size = arrayList.size();
        while (i < size) {
            String str = (String) ((C1246ol) arrayList.get(i)).mo15646f(i2);
            if (str == null) {
                i++;
            } else {
                sb.append(str);
                return i;
            }
        }
        return size;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39834a(long j) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x017f A[EDGE_INSN: B:77:0x017f->B:58:0x017f ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Pair mo39835b(Object obj) {
        String str;
        PanResult panResult;
        boolean z;
        int i;
        int i2;
        aksy aksy = (aksy) obj;
        List f = aksy.mo39891f();
        bsaq bsaq = this.f72709d;
        int i3 = 1;
        if (bsaq != null) {
            if (bsaq.f143893a.size() != 0) {
                bxwc bxwc = this.f72709d.f143893a;
                ArrayList arrayList = new ArrayList(f.size());
                int size = f.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Collections.addAll(arrayList, ((String) f.get(i4)).split("\n"));
                }
                C1246ol olVar = new C1246ol();
                int size2 = bxwc.size();
                int i5 = 0;
                while (i5 < size2) {
                    bxvt bxvt = ((bsap) bxwc.get(i5)).f143890a;
                    int size3 = bxvt.size();
                    int i6 = 0;
                    while (true) {
                        i = i5 + 1;
                        if (i6 >= size3) {
                            break;
                        }
                        int intValue = ((Integer) bxvt.get(i6)).intValue();
                        if (olVar.mo15646f(intValue) == null) {
                            Locale locale = Locale.US;
                            i2 = size2;
                            Object[] objArr = new Object[i3];
                            objArr[0] = Integer.valueOf(intValue);
                            olVar.mo15637a(intValue, Pattern.compile(String.format(locale, "[\\dOQo]{%d}", objArr)));
                        } else {
                            i2 = size2;
                        }
                        i6++;
                        size2 = i2;
                        i3 = 1;
                    }
                    i5 = i;
                    i3 = 1;
                }
                ArrayList arrayList2 = new ArrayList(f.size());
                int size4 = arrayList.size();
                for (int i7 = 0; i7 < size4; i7++) {
                    C1246ol olVar2 = new C1246ol(olVar.mo15640c());
                    String replaceAll = ((String) arrayList.get(i7)).replaceAll("\\s+", "");
                    int c = olVar.mo15640c();
                    for (int i8 = 0; i8 < c; i8++) {
                        int b = olVar.mo15638b(i8);
                        if (replaceAll.length() >= b) {
                            Matcher matcher = ((Pattern) olVar.mo15641c(i8)).matcher(replaceAll);
                            if (matcher.find()) {
                                olVar2.mo15637a(b, m60409a(matcher));
                            }
                        }
                    }
                    arrayList2.add(olVar2);
                }
                int size5 = bxwc.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size5) {
                        str = null;
                        break;
                    }
                    bsap bsap = (bsap) bxwc.get(i9);
                    if (bsap.f143890a.size() != 0) {
                        int size6 = arrayList2.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size6) {
                                break;
                            }
                            StringBuilder sb = new StringBuilder();
                            int a = m60408a(i10, bsap.f143890a.mo74151b(0), arrayList2, sb);
                            int i11 = a;
                            for (int i12 = 1; i12 < bsap.f143890a.size(); i12++) {
                                i11 = m60408a(i11 + 1, bsap.f143890a.mo74151b(i12), arrayList2, sb);
                            }
                            if (i11 >= size6) {
                                break;
                            }
                            str = sb.toString();
                            if (this.f72707b.mo39832a(str)) {
                                break;
                            }
                            i10 = a + 1;
                        }
                        i9++;
                        if (str != null) {
                            break;
                        }
                    }
                    str = null;
                    i9++;
                    if (str != null) {
                    }
                }
                if (str == null) {
                    panResult = new PanResult(str, 1.0d, 1.0d);
                } else {
                    panResult = null;
                }
                aksy.mo39827a(panResult);
                if (str == null) {
                    z = true;
                } else {
                    z = false;
                }
                return new Pair(Boolean.valueOf(z), aksy);
            }
        }
        Iterator it = f.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            Matcher matcher2 = this.f72706a.matcher(((String) it.next()).replaceAll("\\s+", ""));
            if (matcher2.find()) {
                str = m60409a(matcher2);
                if (this.f72707b.mo39832a(str)) {
                    break;
                }
            }
        }
        if (str == null) {
        }
        aksy.mo39827a(panResult);
        if (str == null) {
        }
        return new Pair(Boolean.valueOf(z), aksy);
    }

    /* renamed from: a */
    private static final String m60409a(Matcher matcher) {
        return matcher.group().replaceAll("[OQo]", "0");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39833a() {
        this.f72708c.mo39777h();
    }
}
