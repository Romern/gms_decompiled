package p000;

import android.util.LongSparseArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: bjgj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjgj {

    /* renamed from: a */
    public bjgv f122658a;

    /* renamed from: b */
    public boolean f122659b;

    /* renamed from: c */
    public final C1225nr f122660c = new C1225nr();

    /* renamed from: d */
    LongSparseArray f122661d;

    /* renamed from: e */
    LongSparseArray f122662e;

    /* renamed from: f */
    public final ArrayList f122663f = new ArrayList(1);

    /* renamed from: g */
    public final ArrayDeque f122664g = new ArrayDeque();

    /* renamed from: a */
    private final void m103397a(long j) {
        List<Long> list;
        LongSparseArray longSparseArray = this.f122662e;
        if (longSparseArray != null && (list = (List) longSparseArray.get(j)) != null) {
            for (Long l : list) {
                long longValue = l.longValue();
                bjgd a = this.f122658a.f122693b.mo65130a(longValue);
                bmxy.m108582a(a, String.format(Locale.US, "ResultingActionComponent with dataId %s does not exist.", Long.valueOf(longValue)));
                a.mo65112b(j);
            }
        }
    }

    /* renamed from: a */
    private static void m103398a(long j, List list, LongSparseArray longSparseArray) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            long longValue = ((Long) list.get(i)).longValue();
            List arrayList = longSparseArray.get(longValue) != null ? (List) longSparseArray.get(longValue) : new ArrayList();
            arrayList.add(Long.valueOf(j));
            longSparseArray.put(longValue, arrayList);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0067, code lost:
        if (r11 != 0) goto L_0x006b;
     */
    /* renamed from: a */
    public final void mo65146a(bwou bwou) {
        int i;
        bwou bwou2 = bwou;
        ArrayList arrayList = new ArrayList(bwou2.f160495b.size());
        bxvw bxvw = bwou2.f160495b;
        int size = bxvw.size();
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) bxvw.get(i2)).longValue();
            LongSparseArray longSparseArray = this.f122661d;
            if (longSparseArray != null) {
                List list = (List) longSparseArray.get(longValue);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        long longValue2 = ((Long) it.next()).longValue();
                        bjgd a = this.f122658a.f122693b.mo65130a(longValue2);
                        bmxy.m108582a(a, String.format(Locale.US, "ConditionComponent with dataId %s does not exist.", Long.valueOf(longValue2)));
                        i = a.mo65094a(longValue);
                        if (i != 0) {
                            break;
                        }
                    }
                }
                i = 0;
            }
            i = 0;
            if (i == 0) {
                if (bjhz.m103567a().mo65272h()) {
                    arrayList.add(Long.valueOf(longValue));
                } else {
                    m103397a(longValue);
                }
            }
            if (this.f122660c.contains(Long.valueOf(longValue))) {
                int i3 = bwou2.f160496c;
                bxvd da = bpsl.f138975e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpsl bpsl = (bpsl) da.f164949b;
                int i4 = bpsl.f138977a | 1;
                bpsl.f138977a = i4;
                bpsl.f138978b = longValue;
                int i5 = i4 | 2;
                bpsl.f138977a = i5;
                bpsl.f138979c = i3;
                if (((long) i) != 0) {
                    bpsl.f138977a = i5 | 4;
                    bpsl.f138980d = i;
                }
                bxvd da2 = bpsk.f138966h.mo74144da();
                long j = this.f122658a.f122692a.f122725b;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpsk bpsk = (bpsk) da2.f164949b;
                bpsk.f138968a = 1 | bpsk.f138968a;
                bpsk.f138971d = j;
                bpsg bpsg = bpsg.EVENT_TYPE_EVENT_RULE_EVALUATION;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpsk bpsk2 = (bpsk) da2.f164949b;
                bpsk2.f138972e = bpsg.f138957l;
                bpsk2.f138968a |= 2;
                bpsl bpsl2 = (bpsl) da.mo74062i();
                bpsl2.getClass();
                bpsk2.f138970c = bpsl2;
                bpsk2.f138969b = 7;
                bjie.f122757a.mo65279c().mo65294a((bpsk) da2.mo74062i(), this.f122658a.f122692a.f122724a.mo71762a());
            }
        }
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            m103397a(((Long) arrayList.get(i6)).longValue());
        }
    }

    /* renamed from: a */
    public final void mo65147a(List list) {
        int i;
        bmxy.m108582a(list, "Cannot register an empty data list with event rule manager");
        LongSparseArray longSparseArray = this.f122661d;
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
        LongSparseArray longSparseArray2 = this.f122662e;
        if (longSparseArray2 != null) {
            longSparseArray2.clear();
        }
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            bwny bwny = (bwny) list.get(i2);
            bwog bwog = bwny.f160417b;
            if (bwog == null) {
                bwog = bwog.f160437f;
            }
            long j = bwog.f160440b;
            bxwc bxwc = bwny.f160421f;
            if (this.f122661d == null) {
                this.f122661d = new LongSparseArray(bxwc.size());
            }
            int size2 = bxwc.size();
            for (int i3 = 0; i3 < size2; i3++) {
                m103398a(j, ((bwoi) bxwc.get(i3)).f160454b, this.f122661d);
            }
            bxwc bxwc2 = bwny.f160422g;
            if (this.f122662e == null) {
                this.f122662e = new LongSparseArray(bxwc2.size());
            }
            int size3 = bxwc2.size();
            int i4 = 0;
            while (true) {
                i = i2 + 1;
                if (i4 >= size3) {
                    break;
                }
                m103398a(j, ((bwoq) bxwc2.get(i4)).f160483b, this.f122662e);
                i4++;
            }
            i2 = i;
        }
    }
}
