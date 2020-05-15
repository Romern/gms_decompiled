package p000;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: bhvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhvh implements bhve {

    /* renamed from: a */
    private final bhva f119681a;

    public bhvh(bhva bhva) {
        this.f119681a = bhva;
    }

    /* renamed from: a */
    private static int m101608a(int i) {
        return (i % 8) * 3;
    }

    /* renamed from: b */
    private static int m101609b(int i) {
        return (i / 8) + 1;
    }

    /* renamed from: c */
    private static boolean m101610c(int i) {
        return i == 1 || i == 7;
    }

    /* renamed from: a */
    public final String mo64340a() {
        return "HulkPersona";
    }

    /* renamed from: a */
    public final bhvi mo64339a(bhtx bhtx, List list) {
        List list2;
        Calendar calendar;
        long j;
        float f;
        int i;
        List list3;
        int i2;
        bxwc bxwc;
        List list4 = list;
        bhuj.m101555a();
        List a = bhvc.m101600a(list.size());
        long currentTimeMillis = System.currentTimeMillis();
        long micros = TimeUnit.MILLISECONDS.toMicros(currentTimeMillis);
        Calendar a2 = this.f119681a.mo64341a();
        a2.setTimeInMillis(currentTimeMillis);
        int i3 = 0;
        while (i3 < list.size()) {
            bvnw bvnw = ((bhsu) list4.get(i3)).f119499b;
            bvnk bvnk = null;
            if (!(bvnw == null || (bvnw.f156973a & 8) == 0 || (bvnk = bvnw.f156977e) != null)) {
                bvnk = bvnk.f156872d;
            }
            if (bvnk != null) {
                bhue bhue = (bhue) a.get(i3);
                long j2 = bvnk.f156874a;
                if (j2 != 0 && j2 <= micros) {
                    bhue.mo64306a(85, Float.valueOf(bhvd.m101601a((float) TimeUnit.MICROSECONDS.toHours(micros - j2), 0.1f, -1.0f)));
                    bhuj.m101555a();
                }
                long j3 = bvnk.f156876c;
                bxwc bxwc2 = bvnk.f156875b;
                if (bxwc2.isEmpty() || j3 <= 0) {
                    list2 = a;
                    j = micros;
                    calendar = a2;
                    if (j3 < 0) {
                        bhwp a3 = bhuj.m101555a();
                        StringBuilder sb = new StringBuilder(65);
                        sb.append("number of days in persona has invalid value: ");
                        sb.append(j3);
                        a3.mo64362d(sb.toString());
                    }
                } else {
                    int i4 = a2.get(7);
                    int i5 = ((i4 - 1) * 8) + (a2.get(11) / 3);
                    int a4 = m101608a(i5);
                    int b = m101609b(i5);
                    int size = bxwc2.size();
                    j = micros;
                    int i6 = 0;
                    int i7 = 0;
                    int i8 = 0;
                    while (i6 < size) {
                        bvnj bvnj = (bvnj) bxwc2.get(i6);
                        Calendar calendar2 = a2;
                        int i9 = bvnj.f156869a;
                        if ((i9 & 1) == 0 || (i9 & 2) == 0) {
                            list3 = a;
                            bxwc = bxwc2;
                            i2 = size;
                        } else {
                            int b2 = m101609b(bvnj.f156870b);
                            bxwc = bxwc2;
                            int a5 = m101608a(bvnj.f156870b);
                            i2 = size;
                            int i10 = bvnj.f156871c;
                            if (i10 < 0) {
                                bhwp a6 = bhuj.m101555a();
                                int i11 = bvnj.f156871c;
                                list3 = a;
                                StringBuilder sb2 = new StringBuilder(89);
                                sb2.append("persona bucket has invalid values: weekday ");
                                sb2.append(b2);
                                sb2.append(" hour ");
                                sb2.append(a5);
                                sb2.append(" count ");
                                sb2.append(i11);
                                a6.mo64362d(sb2.toString());
                            } else {
                                list3 = a;
                                if (a5 == a4) {
                                    if (b2 == b) {
                                        i7 += i10;
                                    }
                                    if (m101610c(b2) == m101610c(b)) {
                                        i8 += bvnj.f156871c;
                                    }
                                }
                            }
                        }
                        i6++;
                        a2 = calendar2;
                        bxwc2 = bxwc;
                        size = i2;
                        a = list3;
                    }
                    list2 = a;
                    calendar = a2;
                    if (i7 > 0) {
                        bhue.mo64306a(86, Float.valueOf(bhvd.m101601a(((float) i7) / (((float) j3) / 7.0f), 0.2f, 0.0f)));
                    }
                    if (i8 > 0) {
                        if (!m101610c(b)) {
                            f = 5.0f;
                        } else {
                            f = 2.0f;
                        }
                        float f2 = ((float) i8) / ((((float) j3) * f) / 7.0f);
                        if (!m101610c(i4)) {
                            i = 87;
                        } else {
                            i = 88;
                        }
                        bhue.mo64306a(Integer.valueOf(i), Float.valueOf(bhvd.m101601a(f2, 0.2f, 0.0f)));
                    }
                }
            } else {
                list2 = a;
                j = micros;
                calendar = a2;
            }
            i3++;
            list4 = list;
            micros = j;
            a2 = calendar;
            a = list2;
        }
        return new bhvi(list, a);
    }
}
