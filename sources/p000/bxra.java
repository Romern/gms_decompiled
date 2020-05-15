package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bxra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxra {

    /* renamed from: b */
    private static final bmxr f164538b = bmxr.m108544a("-");

    /* renamed from: a */
    public final bxrb f164539a = new bxrb();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* renamed from: a */
    public final String mo73610a(String str) {
        Map.Entry entry;
        boolean z;
        Map.Entry entry2;
        boolean z2;
        boolean z3;
        String str2;
        bxrb bxrb = this.f164539a;
        String str3 = bxrb.f164540a;
        Map map = bxrb.f164541b;
        Map map2 = bxrb.f164542c;
        if (map2.size() != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = map.entrySet().iterator();
            Iterator it2 = map2.entrySet().iterator();
            if (it.hasNext()) {
                entry = (Map.Entry) it.next();
            } else {
                entry = null;
            }
            if (it2.hasNext()) {
                entry2 = (Map.Entry) it2.next();
                z = false;
            } else {
                entry2 = null;
                z = false;
            }
            while (true) {
                if (entry == null && entry2 == null) {
                    if (z) {
                        arrayList.add(str3.substring(0, 0));
                    }
                    if (arrayList.isEmpty()) {
                        return "";
                    }
                    String valueOf = String.valueOf(f164538b.mo66874a((Iterable) arrayList));
                    return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
                }
                if (entry2 == null) {
                    z2 = true;
                } else if (entry != null) {
                    int compareTo = ((bxqy) entry.getKey()).compareTo((Enum) ((bxqy) entry2.getKey()));
                    z2 = compareTo < 0;
                    if (compareTo == 0) {
                        entry = null;
                    }
                } else {
                    z2 = false;
                }
                if (!z2) {
                    bxqy bxqy = (bxqy) entry2.getKey();
                    bxrc bxrc = (bxrc) entry2.getValue();
                    if (z) {
                        arrayList.add(str3.substring(0, 0));
                    }
                    if (bxrc.f164543a != null) {
                        boolean z4 = bxrc.f164544b;
                        String str4 = bxqy.f164533aP;
                        int i = bxqy.f164534aQ;
                        int i2 = i - 1;
                        if (i != 0) {
                            switch (i2) {
                                case 0:
                                    str2 = boan.f132471e.mo68783a().mo68794a(bqcr.m112599b(((Long) ((bxrc) entry2.getValue()).f164543a).longValue()));
                                    break;
                                case 1:
                                    str2 = "";
                                    break;
                                case 2:
                                    str2 = ((String) ((bxrc) entry2.getValue()).f164543a).replace(';', ':');
                                    break;
                                case 3:
                                    str2 = ((Integer) ((bxrc) entry2.getValue()).f164543a).toString();
                                    break;
                                case 4:
                                    str2 = ((Long) ((bxrc) entry2.getValue()).f164543a).toString();
                                    break;
                                case 5:
                                    str2 = ((Float) ((bxrc) entry2.getValue()).f164543a).toString();
                                    break;
                                case 6:
                                    String valueOf2 = String.valueOf(String.format("%08x", Integer.valueOf(((Integer) ((bxrc) entry2.getValue()).f164543a).intValue())));
                                    if (valueOf2.length() != 0) {
                                        str2 = "0x".concat(valueOf2);
                                        break;
                                    } else {
                                        str2 = new String("0x");
                                        break;
                                    }
                                default:
                                    String a = bxqx.m123025a(i);
                                    StringBuilder sb = new StringBuilder(a.length() + 24);
                                    sb.append("OptionType ");
                                    sb.append(a);
                                    sb.append(" not handled.");
                                    throw new IllegalStateException(sb.toString());
                            }
                            String valueOf3 = String.valueOf(str4);
                            String valueOf4 = String.valueOf(str2);
                            arrayList.add(valueOf4.length() == 0 ? new String(valueOf3) : valueOf3.concat(valueOf4));
                            entry2 = null;
                            z3 = false;
                        } else {
                            throw null;
                        }
                    } else {
                        entry2 = null;
                        z3 = false;
                    }
                } else {
                    bxqz bxqz = (bxqz) entry.getValue();
                    if (!z) {
                        int i3 = bxqz.f164535a;
                        int i4 = bxqz.f164536b;
                        entry = null;
                        z3 = true;
                    } else {
                        int i5 = bxqz.f164535a;
                        arrayList.add(str3.substring(0, 0));
                        int i6 = bxqz.f164535a;
                        int i7 = bxqz.f164536b;
                        entry = null;
                        z3 = true;
                    }
                }
                if (entry == null && it.hasNext()) {
                    entry = (Map.Entry) it.next();
                }
                if (entry2 == null && it2.hasNext()) {
                    entry2 = (Map.Entry) it2.next();
                }
            }
        } else if (str3.isEmpty()) {
            return "";
        } else {
            return str3.length() == 0 ? new String(str) : str.concat(str3);
        }
    }
}
