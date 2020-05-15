package p000;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: tla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tla {

    /* renamed from: a */
    public Collection f46232a;

    /* renamed from: b */
    public long f46233b;

    /* renamed from: c */
    public String f46234c;

    /* renamed from: d */
    public Collection f46235d;

    /* renamed from: e */
    private int f46236e = 1;

    /* renamed from: a */
    public final tlb mo26640a() {
        int i;
        int i2;
        boolean z;
        int i3 = this.f46236e;
        int i4 = i3 - 1;
        if (i3 != 0) {
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                String str = this.f46234c;
                Collection collection = this.f46232a;
                Collection collection2 = this.f46235d;
                if (str != null) {
                    i = str.length();
                } else {
                    i = 0;
                }
                if (collection != null) {
                    i2 = collection.size();
                } else {
                    i2 = 0;
                }
                if (i + i2 > 0) {
                    z = true;
                } else {
                    if (collection2 != null) {
                        Iterator it = collection2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((String) it.next()).length() > 0) {
                                    z = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    z = false;
                }
                sdo.m34974b(z);
            } else if (!(i4 == 4 || i4 == 5)) {
                return null;
            }
            int i5 = this.f46236e;
            Collection collection3 = this.f46232a;
            Collection<String> collection4 = this.f46235d;
            long j = this.f46233b;
            String str2 = this.f46234c;
            bxdz bxdz = (bxdz) bxec.f163078i.mo74144da();
            if (bxdz.f164950c) {
                bxdz.mo74035c();
                bxdz.f164950c = false;
            }
            bxec bxec = (bxec) bxdz.f164949b;
            int i6 = i5 - 1;
            if (i5 != 0) {
                bxec.f163081b = i6;
                int i7 = bxec.f163080a | 1;
                bxec.f163080a = i7;
                int i8 = i7 | 2;
                bxec.f163080a = i8;
                bxec.f163082c = 0;
                bxec.f163080a = 4 | i8;
                bxec.f163085f = j;
                if (collection3 != null) {
                    if (!bxec.f163083d.mo73666a()) {
                        bxec.f163083d = bxvk.m124019a(bxec.f163083d);
                    }
                    bxsy.m123078a(collection3, bxec.f163083d);
                }
                if (!TextUtils.isEmpty(str2)) {
                    if (bxdz.f164950c) {
                        bxdz.mo74035c();
                        bxdz.f164950c = false;
                    }
                    bxec bxec2 = (bxec) bxdz.f164949b;
                    str2.getClass();
                    bxec2.f163080a |= 8;
                    bxec2.f163087h = str2;
                }
                if (!sqw.m36041a(collection4)) {
                    for (String str3 : collection4) {
                        if ("Home".equals(str3) || "Work".equals(str3)) {
                            if (bxdz.f164950c) {
                                bxdz.mo74035c();
                                bxdz.f164950c = false;
                            }
                            bxec bxec3 = (bxec) bxdz.f164949b;
                            str3.getClass();
                            bxec3.mo73570b();
                            bxec3.f163086g.add(str3);
                        } else {
                            if (bxdz.f164950c) {
                                bxdz.mo74035c();
                                bxdz.f164950c = false;
                            }
                            bxec bxec4 = (bxec) bxdz.f164949b;
                            str3.getClass();
                            bxec4.mo73569a();
                            bxec4.f163084e.add(str3);
                        }
                    }
                }
                return new tlb((bxec) bxdz.mo74062i());
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo26641b() {
        int i = 1;
        int a = bxeb.m122619a(1);
        if (a != 0) {
            i = a;
        }
        this.f46236e = i;
    }
}
