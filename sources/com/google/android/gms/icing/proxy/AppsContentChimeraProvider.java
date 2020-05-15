package com.google.android.gms.icing.proxy;

import android.content.ComponentName;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppsContentChimeraProvider extends acle {

    /* renamed from: a */
    private static final acnz f79072a = new acnz();

    /* renamed from: b */
    private static final String[] f79073b = ((String[]) fsy.m12265a(Arrays.asList(acll.f60094a)).toArray(new String[0]));

    static {
        Uri.parse("content://com.google.android.gms.icing.proxy.apps");
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0182  */
    /* renamed from: a */
    public final Cursor mo32832a(Uri uri, String[] strArr) {
        List<aclj> list;
        int i;
        aclp a = aclp.m49388a(getContext());
        if (a == null) {
            return null;
        }
        fsz a2 = fsz.m12266a(strArr);
        if (!a2.mo11274a()) {
            return null;
        }
        long j = a2.f17206a;
        long j2 = a2.f17207b;
        long j3 = 1;
        if (a2.mo11276c()) {
            bngx a3 = C1599acls.m49398a(a.f60101a.getPackageManager());
            if (!a3.isEmpty()) {
                long e = a.mo32849e();
                ArrayList arrayList = new ArrayList(a3.size());
                bnre i2 = a3.listIterator();
                while (i2.hasNext()) {
                    e += j3;
                    bxvd da = aclj.f60087e.mo74144da();
                    String str = ((aclr) i2.next()).f60112a;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    aclj aclj = (aclj) da.f164949b;
                    str.getClass();
                    int i3 = aclj.f60089a | 2;
                    aclj.f60089a = i3;
                    aclj.f60091c = str;
                    aclj.f60090b = 1;
                    int i4 = i3 | 1;
                    aclj.f60089a = i4;
                    aclj.f60089a = i4 | 4;
                    aclj.f60092d = e;
                    arrayList.add((aclj) da.mo74062i());
                    j3 = 1;
                }
                a.f60102b.mo32921a((Iterable) C1599acls.m49400a(a3));
                a.f60102b.mo32923a((List) arrayList);
                a.mo32845a(e);
            }
        }
        MatrixCursor matrixCursor = new MatrixCursor(f79073b);
        acnn acnn = a.f60102b;
        acnv.m49543a("getJournalEntries for lastSeqno = %d, limit = %d", Long.valueOf(j), Long.valueOf(j2));
        synchronized (acnn.f60254a) {
            List a4 = acnn.mo32920a();
            int i5 = 0;
            while (i5 < a4.size() && ((aclj) a4.get(i5)).f60092d <= j) {
                i5++;
            }
            if (i5 >= a4.size()) {
                acnv.m49541a("Not found any entry");
                list = Collections.emptyList();
            } else {
                ArrayList arrayList2 = new ArrayList();
                int i6 = i5;
                long j4 = 0;
                while (true) {
                    if (i6 < a4.size()) {
                        if (j4 >= j2) {
                            break;
                        }
                        arrayList2.add((aclj) a4.get(i6));
                        i6++;
                        j4++;
                    } else {
                        break;
                    }
                }
                acnv.m49543a("Returning Apps corpus docs [%d,%d]", Integer.valueOf(i5), Long.valueOf((((long) i5) + j4) - 1));
                list = arrayList2;
            }
        }
        for (aclj aclj2 : list) {
            int a5 = acli.m49384a(aclj2.f60090b);
            if (a5 != 0 && a5 == 2) {
                ComponentName unflattenFromString = ComponentName.unflattenFromString(aclj2.f60091c);
                aclq a6 = unflattenFromString != null ? C1599acls.m49396a(getContext().getPackageManager(), unflattenFromString) : null;
                if (a6 != null) {
                    acnz acnz = f79072a;
                    String packageName = a6.f60108c.getPackageName();
                    MessageDigest messageDigest = acnz.f60309b;
                    if (messageDigest != null) {
                        byte[] digest = messageDigest.digest(packageName.getBytes());
                        long j5 = 0;
                        for (int i7 = 0; i7 < 8; i7++) {
                            j5 = (j5 << 8) | ((long) (digest[i7] & 255));
                        }
                        i = 0;
                        while (true) {
                            long[][] jArr = acnz.f60310c;
                            if (i < jArr.length) {
                                if (Arrays.binarySearch(jArr[i], j5) >= 0) {
                                    break;
                                }
                                i++;
                            } else {
                                break;
                            }
                        }
                        if (i == -1) {
                            i = acnz.f60310c.length;
                        }
                        matrixCursor.newRow().add(Long.valueOf(aclj2.f60092d)).add("add").add(a6.f60110e).add(Long.valueOf(acnz.f60308a[i])).add(Long.valueOf(a6.f60109d)).add(a6.f60106a).add(a6.f60107b).add(a6.f60108c.getPackageName()).add(a6.f60108c.getClassName()).add(Long.valueOf(a6.f60111f)).add("");
                    }
                    i = -1;
                    if (i == -1) {
                    }
                    matrixCursor.newRow().add(Long.valueOf(aclj2.f60092d)).add("add").add(a6.f60110e).add(Long.valueOf(acnz.f60308a[i])).add(Long.valueOf(a6.f60109d)).add(a6.f60106a).add(a6.f60107b).add(a6.f60108c.getPackageName()).add(a6.f60108c.getClassName()).add(Long.valueOf(a6.f60111f)).add("");
                }
            } else {
                int a7 = acli.m49384a(aclj2.f60090b);
                if (a7 != 0 && a7 == 3) {
                    ComponentName unflattenFromString2 = ComponentName.unflattenFromString(aclj2.f60091c);
                    if (unflattenFromString2 != null) {
                        matrixCursor.newRow().add(Long.valueOf(aclj2.f60092d)).add("del").add(aclk.m49387a(unflattenFromString2));
                    }
                }
            }
        }
        return fta.m12292a(matrixCursor, "-dummy-incarnation-");
    }

    /* renamed from: a */
    public final String mo32833a(Uri uri) {
        throw new UnsupportedOperationException();
    }
}
