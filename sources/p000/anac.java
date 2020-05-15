package p000;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: anac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anac {

    /* renamed from: a */
    private static final amzx f76461a = amzx.m63795a(true);

    /* renamed from: b */
    private static final amzx f76462b = amzx.m63795a(false);

    /* renamed from: a */
    private static ContentValues m63806a(Iterator it) {
        if (it.hasNext()) {
            return (ContentValues) it.next();
        }
        return null;
    }

    /* renamed from: b */
    public static long m63812b(ContentValues contentValues) {
        Long asLong = contentValues.getAsLong("data_version");
        if (asLong != null) {
            return asLong.longValue() + 1;
        }
        return 0;
    }

    /* renamed from: c */
    public static boolean m63813c(ContentValues contentValues) {
        Long asLong = contentValues.getAsLong("data_sync4");
        return m63814d(contentValues) && asLong != null && !asLong.equals(contentValues.getAsLong("data_version"));
    }

    /* renamed from: d */
    public static boolean m63814d(ContentValues contentValues) {
        String asString = contentValues.getAsString("data_sync2");
        return asString != null && asString.startsWith("\"");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amvu.a(android.net.Uri, android.content.ContentValues, java.lang.Long, java.lang.Integer, boolean):int
     arg types: [android.net.Uri, android.content.ContentValues, java.lang.Long, java.lang.Integer, int]
     candidates:
      amvu.a(android.net.Uri, java.lang.Long, android.content.ContentValues, boolean, boolean):void
      amvu.a(android.net.Uri, android.content.ContentValues, java.lang.Long, java.lang.Integer, boolean):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amvu.a(java.lang.Long, boolean):void
     arg types: [java.lang.Long, int]
     candidates:
      amvu.a(java.lang.Long, android.content.ContentValues):void
      amvu.a(java.lang.Long, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0246, code lost:
        if (r33 != false) goto L_0x0276;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02a1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01cc A[ADDED_TO_REGION] */
    /* renamed from: a */
    public static List m63807a(List list, List list2, Long l, Integer num, amvt amvt, anaz anaz, boolean z, boolean z2) {
        List list3;
        List<ContentValues> list4;
        List<ContentValues> list5;
        long j;
        ArrayList arrayList;
        boolean z3;
        boolean z4;
        boolean z5 = z2;
        ArrayList arrayList2 = new ArrayList();
        boolean a = ancm.m64008a((Collection) list);
        boolean a2 = ancm.m64008a((Collection) list2);
        if (a && a2) {
            return arrayList2;
        }
        amvu amvu = amvt.f76140d;
        amyy amyy = new amyy();
        char c = 1;
        if (a) {
            list4 = list2;
            list5 = null;
            list3 = null;
        } else {
            if (!a2) {
                List a3 = amyy.mo41575a();
                List b = amyy.mo41576b();
                sdo.m34974b(m63811a(a3, b));
                ArrayList arrayList3 = new ArrayList();
                m63809a(list, list2, f76461a, a3, b, new amzz(amvu, z5, arrayList3));
                if (z5) {
                    arrayList2.addAll(arrayList3);
                }
                list5 = amyy.mo41575a();
                list4 = amyy.mo41576b();
                boolean isEmpty = list5.isEmpty();
                boolean isEmpty2 = list4.isEmpty();
                if (isEmpty && isEmpty2) {
                    return arrayList2;
                }
                if (isEmpty) {
                    list5 = null;
                    list3 = null;
                } else if (!isEmpty2) {
                    List a4 = amyy.mo41575a();
                    List b2 = amyy.mo41576b();
                    List c2 = amyy.mo41577c();
                    List d = amyy.mo41578d();
                    List list6 = amyy.f76421a;
                    if (!a4.isEmpty() && !b2.isEmpty()) {
                        if (m63811a(c2, d, list6)) {
                            z4 = true;
                            sdo.m34974b(z4);
                            m63809a(a4, b2, f76462b, c2, d, new anaa(list6));
                            list5 = amyy.mo41577c();
                            list4 = amyy.mo41578d();
                            list3 = amyy.f76421a;
                        }
                    }
                    z4 = false;
                    sdo.m34974b(z4);
                    m63809a(a4, b2, f76462b, c2, d, new anaa(list6));
                    list5 = amyy.mo41577c();
                    list4 = amyy.mo41578d();
                    list3 = amyy.f76421a;
                }
            } else {
                list5 = list;
            }
            list4 = null;
            list3 = null;
        }
        ArrayList arrayList4 = new ArrayList();
        long j2 = 0;
        if (!ancm.m64008a((Collection) list5)) {
            for (ContentValues contentValues : list5) {
                m63808a(contentValues, j2);
                ContentValues contentValues2 = contentValues;
                long j3 = j2;
                ArrayList arrayList5 = arrayList4;
                amvu.mo41452a(amvu.f76144a, contentValues, l, num, false);
                if (z5) {
                    arrayList5.add(contentValues2);
                    arrayList4 = arrayList5;
                    j2 = j3;
                } else {
                    arrayList4 = arrayList5;
                    j2 = j3;
                }
            }
            j = j2;
            arrayList = arrayList4;
            list5.size();
        } else {
            j = 0;
            arrayList = arrayList4;
        }
        ArrayList arrayList6 = new ArrayList();
        if (!ancm.m64008a((Collection) list4)) {
            for (ContentValues contentValues3 : list4) {
                Long asLong = contentValues3.getAsLong("data_sync4");
                amig.m62939a();
                if (!Boolean.valueOf(cfvk.f185780a.mo6606a().mo82984av()).booleanValue()) {
                    if (asLong != null) {
                        z3 = false;
                        amvu.mo41461a(contentValues3.getAsLong("data_id"), false);
                        if (m63810a(contentValues3) || z3) {
                            c = 1;
                        } else {
                            anaz.mo41636a(ammz.REMOVE, amjf.PHOTO, true, 1, 1);
                            c = 1;
                        }
                    }
                } else if (!(asLong == null || asLong.longValue() == j)) {
                    z3 = false;
                    amvu.mo41461a(contentValues3.getAsLong("data_id"), false);
                    if (m63810a(contentValues3)) {
                    }
                    c = 1;
                }
                if (m63810a(contentValues3) && contentValues3.getAsLong("data_version") != null && contentValues3.getAsLong("data_version").longValue() == j) {
                    int i = 4;
                    String[] strArr = new String[4];
                    strArr[0] = "data_sync4";
                    strArr[c] = "data_sync2";
                    strArr[2] = "data_sync3";
                    strArr[3] = "data14";
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (!TextUtils.isEmpty(contentValues3.getAsString(strArr[i2]))) {
                                z3 = false;
                                break;
                            }
                            i2++;
                            i = 4;
                        } else {
                            z3 = true;
                            break;
                        }
                    }
                } else {
                    z3 = false;
                }
                if (z3) {
                    contentValues3.getAsLong("data_id").longValue();
                    amvu.mo41461a(contentValues3.getAsLong("data_id"), false);
                    if (m63810a(contentValues3)) {
                    }
                    c = 1;
                } else {
                    if (z5) {
                        arrayList6.add(contentValues3);
                        c = 1;
                    }
                    c = 1;
                }
            }
            list4.size();
        }
        ArrayList arrayList7 = new ArrayList();
        if (!ancm.m64008a((Collection) list3)) {
            int size = list3.size();
            for (int i3 = 0; i3 < size; i3++) {
                anae anae = (anae) list3.get(i3);
                ContentValues contentValues4 = anae.f76466b;
                amig.m62939a();
                if (!Boolean.valueOf(cfvk.f185780a.mo6606a().mo82973ak()).booleanValue() || !m63810a(contentValues4)) {
                    Long asLong2 = contentValues4.getAsLong("data_sync4");
                    if (asLong2 != null) {
                        if (asLong2.longValue() < 10) {
                        }
                    }
                    ContentValues contentValues5 = anae.f76465a;
                    m63808a(contentValues5, m63812b(contentValues4));
                    amvu.mo41460a(contentValues4.getAsLong("data_id"), contentValues5);
                    if (z5) {
                        if (!cfwa.m143263b()) {
                            ContentValues contentValues6 = new ContentValues(contentValues4);
                            contentValues6.putAll(contentValues5);
                            contentValues5 = contentValues6;
                        }
                        arrayList7.add(contentValues5);
                    }
                } else {
                    amig.m62939a();
                    if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo82985aw()).booleanValue()) {
                        if (m63813c(contentValues4)) {
                        }
                    }
                    ContentValues contentValues52 = anae.f76465a;
                    m63808a(contentValues52, m63812b(contentValues4));
                    amvu.mo41460a(contentValues4.getAsLong("data_id"), contentValues52);
                    if (z5) {
                    }
                }
                if (z5) {
                    arrayList7.add(contentValues4);
                }
            }
            list3.size();
        }
        amig.m62939a();
        if (((Boolean) amfl.f74862a.mo41191a()).booleanValue() && z) {
            amvu.f76145b.mo41497a();
        }
        if (z5) {
            arrayList2.addAll(arrayList);
            arrayList2.addAll(arrayList6);
            arrayList2.addAll(arrayList7);
        }
        return arrayList2;
    }

    /* renamed from: a */
    private static void m63808a(ContentValues contentValues, long j) {
        contentValues.put("data_sync4", Long.valueOf(anau.m63867a(j)));
        contentValues.put("data_version", Long.valueOf(j));
    }

    /* renamed from: a */
    private static void m63809a(List list, List list2, amzx amzx, List list3, List list4, anab anab) {
        Collections.sort(list, amzx);
        Collections.sort(list2, amzx);
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        ContentValues a = m63806a(it);
        ContentValues a2 = m63806a(it2);
        while (a != null && a2 != null) {
            int a3 = amzx.compare(a, a2);
            if (a3 == 0) {
                anab.mo41584a(a, a2);
                a = m63806a(it);
                a2 = m63806a(it2);
            } else if (a3 >= 0) {
                list4.add(a2);
                a2 = m63806a(it2);
            } else {
                list3.add(a);
                a = m63806a(it);
            }
        }
        while (a != null) {
            list3.add(a);
            a = m63806a(it);
        }
        while (a2 != null) {
            list4.add(a2);
            a2 = m63806a(it2);
        }
    }

    /* renamed from: a */
    public static boolean m63810a(ContentValues contentValues) {
        if (contentValues != null) {
            return "vnd.android.cursor.item/photo".equals(contentValues.getAsString("mimetype"));
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m63811a(Collection... collectionArr) {
        for (Collection collection : collectionArr) {
            if (!collection.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
