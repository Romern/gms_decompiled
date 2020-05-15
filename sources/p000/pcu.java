package p000;

import android.content.Context;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: pcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pcu implements pco {

    /* renamed from: a */
    private final Context f38847a;

    /* renamed from: b */
    private boolean f38848b = false;

    /* renamed from: c */
    private Set f38849c;

    static {
        odk.m28481a("CAR.WirelessFreqChecker");
    }

    public pcu(Context context) {
        this.f38847a = context;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.List, pcr]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* renamed from: a */
    private final Iterable m30218a(int i, bmxj bmxj) {
        return bnjd.m109575a((Iterable) Arrays.asList(this.f38847a.getResources().getStringArray(i)), (bmxj) new pcr(bmxj));
    }

    /* renamed from: a */
    public static final Iterable m30219a(String str) {
        return bmyx.m108640a(',').mo66920b().mo66917a().mo66918a((CharSequence) str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f6 A[EDGE_INSN: B:42:0x00f6->B:28:0x00f6 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    public final boolean mo22905a(int[] iArr) {
        String str;
        Map.Entry entry;
        if (iArr.length == 0) {
            return false;
        }
        if (!this.f38848b) {
            this.f38848b = true;
            String a = pcm.m30205a(this.f38847a);
            Iterable iterable = bnon.f131923a;
            Iterator it = m30218a(C0126R.array.region_locale_mapping, new pcq()).iterator();
            loop0:
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it.next();
                Iterator it2 = ((Iterable) entry2.getValue()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((String) it2.next()).equalsIgnoreCase(a)) {
                            str = (String) entry2.getKey();
                            break loop0;
                        }
                    }
                }
            }
            String format = String.format("*/*/*", new Object[0]);
            String format2 = String.format("%s/*/*", str);
            String format3 = String.format("%s/%s/%s", str, Build.MANUFACTURER, Build.MODEL);
            String format4 = String.format("%s/%s/*", str, Build.MANUFACTURER);
            String format5 = String.format("%s/*/%s", str, Build.MODEL);
            Iterator it3 = m30218a(C0126R.array.phone_frequencies, new pcp()).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    entry = (Map.Entry) it3.next();
                    if (bmwb.m108443a(format2, (CharSequence) entry.getKey()) || bmwb.m108443a(format, (CharSequence) entry.getKey()) || bmwb.m108443a(format3, (CharSequence) entry.getKey()) || bmwb.m108443a(format4, (CharSequence) entry.getKey()) || bmwb.m108443a(format5, (CharSequence) entry.getKey())) {
                        iterable = (Iterable) entry.getValue();
                    }
                    if (!it3.hasNext()) {
                        break;
                    }
                }
            }
            iterable = (Iterable) entry.getValue();
            this.f38849c = bnpf.m110049a(iterable);
        }
        for (int i : iArr) {
            if (!this.f38849c.contains(Integer.valueOf(i))) {
                return false;
            }
        }
        return true;
    }
}
