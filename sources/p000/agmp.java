package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.EventParcel;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* renamed from: agmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agmp extends agmg {
    public agmp(agmn agmn) {
        super(agmn);
    }

    /* renamed from: a */
    static int m54562a(bxvd bxvd, String str) {
        for (int i = 0; i < ((agnm) bxvd.f164949b).f66109e.size(); i++) {
            if (str.equals(bxvd.mo73940E(i).f66149c)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    static final agnk m54574b(agni agni, String str) {
        bxwc bxwc = agni.f66067b;
        int size = bxwc.size();
        int i = 0;
        while (i < size) {
            agnk agnk = (agnk) bxwc.get(i);
            i++;
            if (agnk.f66080b.equals(str)) {
                return agnk;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo35305a() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo35716b(bxvd bxvd, Object obj) {
        sdo.m34959a(obj);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        agnk agnk = (agnk) bxvd.f164949b;
        agnk agnk2 = agnk.f66077g;
        agnk.f66079a &= -3;
        agnk.f66081c = agnk.f66077g.f66081c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        agnk agnk3 = (agnk) bxvd.f164949b;
        int i = agnk3.f66079a & -5;
        agnk3.f66079a = i;
        agnk3.f66082d = 0;
        agnk3.f66079a = i & -17;
        agnk3.f66083e = 0.0d;
        agnk3.f66084f = bxvk.m124030de();
        if (obj instanceof String) {
            String str = (String) obj;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            agnk agnk4 = (agnk) bxvd.f164949b;
            str.getClass();
            agnk4.f66079a |= 2;
            agnk4.f66081c = str;
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            agnk agnk5 = (agnk) bxvd.f164949b;
            agnk5.f66079a |= 4;
            agnk5.f66082d = longValue;
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            agnk agnk6 = (agnk) bxvd.f164949b;
            agnk6.f66079a |= 16;
            agnk6.f66083e = doubleValue;
        } else if (!cfik.m139776b() || !mo35538v().mo35314a(aghn.f65495au) || !(obj instanceof Bundle[])) {
            mo35497E().f65564c.mo35436a("Ignoring invalid (type) event param value", obj);
        } else {
            bxvd.mo73960W(m54566a((Bundle[]) obj));
        }
    }

    /* renamed from: a */
    static bxxb m54563a(bxxb bxxb, byte[] bArr) {
        bxus c = bxus.m123744c();
        if (c != null) {
            return bxxb.mo73624a(bArr, c);
        }
        return bxxb.mo73633b(bArr);
    }

    /* renamed from: a */
    public static final String m54564a(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: a */
    static List m54565a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: a */
    static List m54566a(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                bxvd da = agnk.f66077g.mo74144da();
                for (String str : bundle.keySet()) {
                    bxvd da2 = agnk.f66077g.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    agnk agnk = (agnk) da2.f164949b;
                    str.getClass();
                    agnk.f66079a |= 1;
                    agnk.f66080b = str;
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        long longValue = ((Long) obj).longValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        agnk agnk2 = (agnk) da2.f164949b;
                        agnk2.f66079a |= 4;
                        agnk2.f66082d = longValue;
                    } else if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        agnk agnk3 = (agnk) da2.f164949b;
                        str2.getClass();
                        agnk3.f66079a |= 2;
                        agnk3.f66081c = str2;
                    } else if (obj instanceof Double) {
                        double doubleValue = ((Double) obj).doubleValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        agnk agnk4 = (agnk) da2.f164949b;
                        agnk4.f66079a |= 16;
                        agnk4.f66083e = doubleValue;
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    agnk agnk5 = (agnk) da.f164949b;
                    agnk agnk6 = (agnk) da2.mo74062i();
                    agnk6.getClass();
                    agnk5.mo35757a();
                    agnk5.f66084f.add(agnk6);
                }
                if (((agnk) da.f164949b).f66084f.size() > 0) {
                    arrayList.add((agnk) da.mo74062i());
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final byte[] mo35717b(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            mo35497E().f65564c.mo35436a("Failed to gzip content", e);
            throw e;
        }
    }

    /* renamed from: a */
    public static final void m54567a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: a */
    public static final void m54568a(StringBuilder sb, int i, String str, agmy agmy) {
        String str2;
        if (agmy != null) {
            m54567a(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if ((agmy.f66008a & 1) != 0) {
                int a = agmx.m54641a(agmy.f66009b);
                if (a == 0) {
                    a = 1;
                }
                if (a != 1) {
                    str2 = a != 2 ? a != 3 ? a != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN";
                } else {
                    str2 = "UNKNOWN_COMPARISON_TYPE";
                }
                m54569a(sb, i, "comparison_type", str2);
            }
            if ((agmy.f66008a & 2) != 0) {
                m54569a(sb, i, "match_as_float", Boolean.valueOf(agmy.f66010c));
            }
            if ((agmy.f66008a & 4) != 0) {
                m54569a(sb, i, "comparison_value", agmy.f66011d);
            }
            if ((agmy.f66008a & 8) != 0) {
                m54569a(sb, i, "min_comparison_value", agmy.f66012e);
            }
            if ((agmy.f66008a & 16) != 0) {
                m54569a(sb, i, "max_comparison_value", agmy.f66013f);
            }
            m54567a(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    public static final void m54569a(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m54567a(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* renamed from: a */
    public static final void m54570a(StringBuilder sb, String str, agno agno) {
        Integer num;
        StringBuilder sb2 = sb;
        agno agno2 = agno;
        if (agno2 != null) {
            m54567a(sb2, 3);
            sb.append(str);
            sb2.append(" {\n");
            if (agno2.f66137b.size() != 0) {
                m54567a(sb2, 4);
                sb2.append("results: ");
                bxvw bxvw = agno2.f66137b;
                int size = bxvw.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    Long l = (Long) bxvw.get(i);
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(l);
                    i++;
                    i2 = i3;
                }
                sb2.append(10);
            }
            if (agno2.f66136a.size() != 0) {
                m54567a(sb2, 4);
                sb2.append("status: ");
                bxvw bxvw2 = agno2.f66136a;
                int size2 = bxvw2.size();
                int i4 = 0;
                int i5 = 0;
                while (i4 < size2) {
                    Long l2 = (Long) bxvw2.get(i4);
                    int i6 = i5 + 1;
                    if (i5 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(l2);
                    i4++;
                    i5 = i6;
                }
                sb2.append(10);
            }
            if (agno2.f66138c.size() != 0) {
                m54567a(sb2, 4);
                sb2.append("dynamic_filter_timestamps: {");
                bxwc bxwc = agno2.f66138c;
                int size3 = bxwc.size();
                int i7 = 0;
                int i8 = 0;
                while (i7 < size3) {
                    agnh agnh = (agnh) bxwc.get(i7);
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append((agnh.f66061a & 1) != 0 ? Integer.valueOf(agnh.f66062b) : null);
                    sb2.append(":");
                    sb2.append((agnh.f66061a & 2) != 0 ? Long.valueOf(agnh.f66063c) : null);
                    i7++;
                    i8 = i9;
                }
                sb2.append("}\n");
            }
            if (agno2.f66139d.size() != 0) {
                m54567a(sb2, 4);
                sb2.append("sequence_filter_timestamps: {");
                bxwc bxwc2 = agno2.f66139d;
                int size4 = bxwc2.size();
                int i10 = 0;
                int i11 = 0;
                while (i10 < size4) {
                    agnp agnp = (agnp) bxwc2.get(i10);
                    int i12 = i11 + 1;
                    if (i11 != 0) {
                        sb2.append(", ");
                    }
                    if ((agnp.f66142a & 1) != 0) {
                        num = Integer.valueOf(agnp.f66143b);
                    } else {
                        num = null;
                    }
                    sb2.append(num);
                    sb2.append(": [");
                    bxvw bxvw3 = agnp.f66144c;
                    int size5 = bxvw3.size();
                    int i13 = 0;
                    int i14 = 0;
                    while (i13 < size5) {
                        long longValue = ((Long) bxvw3.get(i13)).longValue();
                        int i15 = i14 + 1;
                        if (i14 != 0) {
                            sb2.append(", ");
                        }
                        sb2.append(longValue);
                        i13++;
                        i14 = i15;
                    }
                    sb2.append("]");
                    i10++;
                    i11 = i12;
                }
                sb2.append("}\n");
            }
            m54567a(sb2, 3);
            sb2.append("}\n");
        }
    }

    /* renamed from: a */
    static final boolean m54571a(EventParcel eventParcel, AppMetadata appMetadata) {
        sdo.m34959a(eventParcel);
        sdo.m34959a(appMetadata);
        return !TextUtils.isEmpty(appMetadata.f80099b) || !TextUtils.isEmpty(appMetadata.f80115r);
    }

    /* renamed from: a */
    static boolean m54572a(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: a */
    static boolean m54573a(List list, int i) {
        if (i >= list.size() * 64) {
            return false;
        }
        return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo35707a(byte[] bArr) {
        sdo.m34959a(bArr);
        mo35540x().mo35241h();
        MessageDigest f = agms.m54595f();
        if (f != null) {
            return agms.m54588a(f.digest(bArr));
        }
        mo35497E().f65564c.mo35435a("Failed to get MD5");
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Parcelable mo35708a(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (sec e) {
            mo35497E().f65564c.mo35435a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo35709a(agni agni, String str) {
        agnk b = m54574b(agni, str);
        if (b == null) {
            return null;
        }
        int i = b.f66079a;
        if ((i & 2) != 0) {
            return b.f66081c;
        }
        if ((i & 4) != 0) {
            return Long.valueOf(b.f66082d);
        }
        if ((i & 16) != 0) {
            return Double.valueOf(b.f66083e);
        }
        if (!cfik.m139776b() || !mo35538v().mo35314a(aghn.f65495au) || b.f66084f.size() <= 0) {
            return null;
        }
        bxwc bxwc = b.f66084f;
        ArrayList arrayList = new ArrayList();
        int size = bxwc.size();
        for (int i2 = 0; i2 < size; i2++) {
            agnk agnk = (agnk) bxwc.get(i2);
            if (agnk != null) {
                Bundle bundle = new Bundle();
                bxwc bxwc2 = agnk.f66084f;
                int size2 = bxwc2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    agnk agnk2 = (agnk) bxwc2.get(i3);
                    int i4 = agnk2.f66079a;
                    if ((i4 & 2) != 0) {
                        bundle.putString(agnk2.f66080b, agnk2.f66081c);
                    } else if ((i4 & 4) != 0) {
                        bundle.putLong(agnk2.f66080b, agnk2.f66082d);
                    } else if ((i4 & 16) != 0) {
                        bundle.putDouble(agnk2.f66080b, agnk2.f66083e);
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo35710a(List list, List list2) {
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                mo35497E().f65567f.mo35436a("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    mo35497E().f65567f.mo35437a("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (num.intValue() % 64)) ^ -1)));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (size2 >= 0 && ((Long) arrayList.get(size2)).longValue() == 0) {
            size = size2;
            size2--;
        }
        return arrayList.subList(0, size);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35711a(bxvd bxvd, Object obj) {
        sdo.m34959a(obj);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        agnq agnq = (agnq) bxvd.f164949b;
        agnq agnq2 = agnq.f66145g;
        agnq.f66147a &= -5;
        agnq.f66150d = agnq.f66145g.f66150d;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        agnq agnq3 = (agnq) bxvd.f164949b;
        int i = agnq3.f66147a & -9;
        agnq3.f66147a = i;
        agnq3.f66151e = 0;
        int i2 = i & -33;
        agnq3.f66147a = i2;
        agnq3.f66152f = 0.0d;
        if (obj instanceof String) {
            String str = (String) obj;
            str.getClass();
            agnq3.f66147a = i2 | 4;
            agnq3.f66150d = str;
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            agnq agnq4 = (agnq) bxvd.f164949b;
            agnq4.f66147a |= 8;
            agnq4.f66151e = longValue;
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            agnq agnq5 = (agnq) bxvd.f164949b;
            agnq5.f66147a |= 32;
            agnq5.f66152f = doubleValue;
        } else {
            mo35497E().f65564c.mo35436a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35712a(bxvd bxvd, String str, Object obj) {
        List unmodifiableList = Collections.unmodifiableList(((agni) bxvd.f164949b).f66067b);
        int i = 0;
        while (true) {
            if (i >= unmodifiableList.size()) {
                i = -1;
                break;
            } else if (str.equals(((agnk) unmodifiableList.get(i)).f66080b)) {
                break;
            } else {
                i++;
            }
        }
        bxvd da = agnk.f66077g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        agnk agnk = (agnk) da.f164949b;
        str.getClass();
        int i2 = agnk.f66079a | 1;
        agnk.f66079a = i2;
        agnk.f66080b = str;
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            agnk agnk2 = (agnk) da.f164949b;
            agnk2.f66079a |= 4;
            agnk2.f66082d = longValue;
        } else if (obj instanceof String) {
            String str2 = (String) obj;
            str2.getClass();
            agnk.f66079a = i2 | 2;
            agnk.f66081c = str2;
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            agnk agnk3 = (agnk) da.f164949b;
            agnk3.f66079a |= 16;
            agnk3.f66083e = doubleValue;
        } else if (cfik.m139776b() && mo35538v().mo35314a(aghn.f65495au) && (obj instanceof Bundle[])) {
            da.mo73960W(m54566a((Bundle[]) obj));
        }
        if (i >= 0) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            agni agni = (agni) bxvd.f164949b;
            agnk agnk4 = (agnk) da.mo74062i();
            agni agni2 = agni.f66064g;
            agnk4.getClass();
            agni.mo35756a();
            agni.f66067b.set(i, agnk4);
            return;
        }
        bxvd.mo74100q(da);
    }

    /* renamed from: a */
    public final void mo35713a(StringBuilder sb, int i, agmv agmv) {
        String str;
        if (agmv != null) {
            m54567a(sb, i);
            sb.append("filter {\n");
            if ((agmv.f66000a & 4) != 0) {
                m54569a(sb, i, "complement", Boolean.valueOf(agmv.f66003d));
            }
            if ((agmv.f66000a & 8) != 0) {
                m54569a(sb, i, "param_name", mo35541y().mo35424b(agmv.f66004e));
            }
            int i2 = 1;
            if ((agmv.f66000a & 1) != 0) {
                int i3 = i + 1;
                agnc agnc = agmv.f66001b;
                if (agnc == null) {
                    agnc = agnc.f66024f;
                }
                if (agnc != null) {
                    m54567a(sb, i3);
                    sb.append("string_filter {\n");
                    if ((agnc.f66026a & 1) != 0) {
                        int a = agnb.m54645a(agnc.f66027b);
                        if (a != 0) {
                            i2 = a;
                        }
                        switch (i2) {
                            case 1:
                                str = "UNKNOWN_MATCH_TYPE";
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case 6:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        m54569a(sb, i3, "match_type", str);
                    }
                    if ((agnc.f66026a & 2) != 0) {
                        m54569a(sb, i3, "expression", agnc.f66028c);
                    }
                    if ((agnc.f66026a & 4) != 0) {
                        m54569a(sb, i3, "case_sensitive", Boolean.valueOf(agnc.f66029d));
                    }
                    if (agnc.f66030e.size() > 0) {
                        m54567a(sb, i3 + 1);
                        sb.append("expression_list {\n");
                        bxwc bxwc = agnc.f66030e;
                        int size = bxwc.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            m54567a(sb, i3 + 2);
                            sb.append((String) bxwc.get(i4));
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    m54567a(sb, i3);
                    sb.append("}\n");
                }
            }
            if ((agmv.f66000a & 2) != 0) {
                int i5 = i + 1;
                agmy agmy = agmv.f66002c;
                if (agmy == null) {
                    agmy = agmy.f66006g;
                }
                m54568a(sb, i5, "number_filter", agmy);
            }
            m54567a(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    public final void mo35714a(StringBuilder sb, int i, List list) {
        String str;
        String str2;
        Long l;
        if (list != null) {
            int i2 = i + 1;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                agnk agnk = (agnk) list.get(i3);
                if (agnk != null) {
                    m54567a(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    if (!cfik.m139776b() || !mo35538v().mo35314a(aghn.f65493as)) {
                        m54569a(sb, i2, "name", mo35541y().mo35424b(agnk.f66080b));
                        m54569a(sb, i2, "string_value", agnk.f66081c);
                        m54569a(sb, i2, "int_value", (agnk.f66079a & 4) != 0 ? Long.valueOf(agnk.f66082d) : null);
                        if ((agnk.f66079a & 16) != 0) {
                            d = Double.valueOf(agnk.f66083e);
                        }
                        m54569a(sb, i2, "double_value", d);
                    } else {
                        if ((agnk.f66079a & 1) != 0) {
                            str = mo35541y().mo35424b(agnk.f66080b);
                        } else {
                            str = null;
                        }
                        m54569a(sb, i2, "name", str);
                        if ((agnk.f66079a & 2) != 0) {
                            str2 = agnk.f66081c;
                        } else {
                            str2 = null;
                        }
                        m54569a(sb, i2, "string_value", str2);
                        if ((agnk.f66079a & 4) != 0) {
                            l = Long.valueOf(agnk.f66082d);
                        } else {
                            l = null;
                        }
                        m54569a(sb, i2, "int_value", l);
                        if ((agnk.f66079a & 16) != 0) {
                            d = Double.valueOf(agnk.f66083e);
                        }
                        m54569a(sb, i2, "double_value", d);
                        if (agnk.f66084f.size() > 0) {
                            mo35714a(sb, i2, agnk.f66084f);
                        }
                    }
                    m54567a(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo35715a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(mo35534A().mo20505a() - j) > j2;
    }
}
