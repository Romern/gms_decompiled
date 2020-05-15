package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.chimera.FragmentTransaction;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Set;
import java.util.stream.Stream;

/* renamed from: lqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lqq {

    /* renamed from: a */
    private static final bnhe f26609a = bnhe.m109411a(1, "Text", 2, "Number", 3, "Phone", 4, "DateTime");

    /* renamed from: b */
    private static final bnhe f26610b;

    /* renamed from: c */
    private static final bnhe f26611c;

    /* renamed from: d */
    private static final bnhe f26612d;

    /* renamed from: e */
    private static final bnhe f26613e;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnic.a(java.lang.Object, java.lang.Object):bnic
     arg types: [int, int]
     candidates:
      bnic.a(int, java.lang.Object[]):bnic
      bnic.a(int, int):boolean
      bngm.a(java.lang.Object[], int):int
      bnic.a(java.lang.Object, java.lang.Object):bnic */
    static {
        Integer valueOf = Integer.valueOf((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER);
        Integer valueOf2 = Integer.valueOf((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE);
        Integer valueOf3 = Integer.valueOf((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE);
        f26610b = bnhe.m109411a(1, bnic.m109494a(32, 48, valueOf, valueOf2, valueOf3, Integer.valueOf((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS), 80, 128, 96, 64, 16, Integer.valueOf((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD), 208, Integer.valueOf((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD)), 2, bnic.m109489a((Object) 16), 3, bnon.f131923a, 4, bnon.f131923a);
        f26611c = bnhe.m109411a(1, bnic.m109494a(Integer.valueOf((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE), Integer.valueOf((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT), 4096, Integer.valueOf((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES), 8192, Integer.valueOf((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS), valueOf2, valueOf3), 2, bnic.m109490a((Object) 8192, (Object) 4096), 3, bnon.f131923a, 4, bnon.f131923a);
        bnha h = bnhe.m109414h();
        h.mo67695b(49, "EmailSubject");
        h.mo67695b(177, "Filter");
        h.mo67695b(113, "PostalAddress");
        h.mo67695b(81, "LongMessage");
        h.mo67695b(129, "Password");
        h.mo67695b(97, "PersonName");
        h.mo67695b(65, "ShortMessage");
        h.mo67695b(17, "URI");
        h.mo67695b(145, "VisiblePassword");
        h.mo67695b(Integer.valueOf((int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA), "WebEmailAddress");
        h.mo67695b(225, "WebPassword");
        h.mo67695b(18, "Password");
        f26612d = h.mo67618b();
        bnha h2 = bnhe.m109414h();
        h2.mo67695b(Integer.valueOf((int) FragmentTransaction.TRANSIT_FRAGMENT_CLOSE), "NumberDecimal");
        h2.mo67695b(4098, "NumberSigned");
        h2.mo67695b(65537, "AutoComplete");
        h2.mo67695b(32769, "AutoCorrect");
        h2.mo67695b(Integer.valueOf((int) FragmentTransaction.TRANSIT_FRAGMENT_OPEN), "CapCharacters");
        h2.mo67695b(16385, "CapSentences");
        h2.mo67695b(8193, "CapWords");
        h2.mo67695b(524289, "NoSuggestions");
        h2.mo67695b(131073, "MultiLine");
        h2.mo67695b(262145, "IMEMultiLine");
        f26613e = h2.mo67618b();
    }

    /* renamed from: a */
    public static String m19540a(kbu kbu) {
        StringBuilder sb = new StringBuilder();
        bxwc bxwc = kbu.f23723d;
        int size = bxwc.size();
        int i = 0;
        while (i < size) {
            kcj kcj = (kcj) bxwc.get(i);
            Stream stream = kbu.f23723d.stream();
            kcj.getClass();
            if (!stream.noneMatch(new lcn(kcj))) {
                kbt kbt = kbu.f23722c;
                if (kbt == null) {
                    kbt = kbt.f23714c;
                }
                String str = kbt.f23716a;
                kop a = koq.m18263a();
                a.f24629a = str;
                kci kci = kcj.f23813d;
                if (kci == null) {
                    kci = kci.f23757X;
                }
                a.f24630b = lcm.m18928a(kci);
                int i2 = kcj.f23810a;
                String str2 = kcj.f23814e;
                int i3 = kcj.f23812c;
                int i4 = kcj.f23815f;
                a.mo14757a(kcj.f23811b, kcj.f23816g);
                m19541a(a.mo14756a().f24634b, sb, 0, true);
                i++;
            } else {
                throw new IllegalArgumentException("The specified WindowNodeProto does not belong to the passed in AssistStructureProto");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m19541a(kom kom, StringBuilder sb, int i, boolean z) {
        String str;
        String str2;
        String str3;
        StringBuilder sb2 = new StringBuilder();
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            sb2.append(' ');
        }
        if (z && kom.f24611j == 0) {
            z2 = true;
        }
        if (!z2) {
            sb2.append("\u001b[9m");
        }
        if (kom.f24620s) {
            sb2.append("** Node **");
        } else {
            sb2.append("Node");
        }
        if (!z2) {
            sb2.append("\u001b[0m");
        }
        sb2.append(" autofill_id=");
        sb2.append(kom.f24609h);
        sb2.append(" autofill_type=");
        int i3 = kom.f24607f;
        sb2.append(i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "unknown" : "date" : "list" : "toggle" : "text" : "none");
        String str4 = kom.f24603b;
        if (!"".equals(str4)) {
            sb2.append(" id_entry=");
            sb2.append(str4);
        }
        bnic bnic = kom.f24610i;
        if (!bnic.isEmpty()) {
            sb2.append(" autofill_hints=");
            sb2.append(bnic);
        }
        bmxv bmxv = kom.f24627z;
        if (bmxv.mo66813a()) {
            sb2.append(" important_for_autofill=");
            int intValue = ((Integer) bmxv.mo66814b()).intValue();
            if (intValue != 0) {
                str3 = intValue != 1 ? intValue != 2 ? intValue != 4 ? intValue != 8 ? "unsupported!" : "no (excl. descendants)" : "yes (excl. descendants)" : "no" : "yes";
            } else {
                str3 = "auto";
            }
            sb2.append(str3);
        }
        kol kol = kom.f24623v;
        if (kol != null && !((koh) kol).f24573b.isEmpty()) {
            sb2.append(" html_info=");
            sb2.append(kol);
        }
        String str5 = kom.f24605d;
        if (!"".equals(str5)) {
            sb2.append(" hint=");
            sb2.append(str5);
        }
        if (kom.f24607f == 1) {
            sb2.append(" maxTextLength=");
            sb2.append(kom.f24618q);
        }
        if (kom.f24607f == 1 && !"".equals(kom.f24619r)) {
            sb2.append(" contentDescription=");
            sb2.append(kom.f24619r);
        }
        String str6 = kom.f24606e;
        if (!"".equals(str6)) {
            sb2.append(" text=");
            sb2.append(str6);
        }
        int i4 = kom.f24604c;
        int i5 = i4 & 15;
        if (i5 != 0) {
            sb2.append(" inputType=");
            bnhe bnhe = f26609a;
            Integer valueOf = Integer.valueOf(i5);
            sb2.append((String) bnhe.get(valueOf));
            int i6 = i4 & 4080;
            Set<Integer> set = (Set) f26610b.get(valueOf);
            if (set != null) {
                for (Integer num : set) {
                    int intValue2 = num.intValue();
                    if ((i6 & intValue2) == intValue2 && (str2 = (String) f26612d.get(Integer.valueOf(intValue2 | i5))) != null) {
                        sb2.append('|');
                        sb2.append(str2);
                    }
                }
            }
            int i7 = i4 & 16773120;
            Set<Integer> set2 = (Set) f26611c.get(Integer.valueOf(i5));
            if (set2 != null) {
                for (Integer num2 : set2) {
                    int intValue3 = num2.intValue();
                    if ((i7 & intValue3) == intValue3 && (str = (String) f26613e.get(Integer.valueOf(intValue3 | i5))) != null) {
                        sb2.append('|');
                        sb2.append(str);
                    }
                }
                sb2.append(' ');
            }
        }
        sb2.append(10);
        sb.append((CharSequence) sb2);
        bnre i8 = kom.f24626y.listIterator();
        while (i8.hasNext()) {
            m19541a((kom) i8.next(), sb, i + 2, z2);
        }
    }
}
