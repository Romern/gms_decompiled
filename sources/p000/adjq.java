package p000;

import android.app.InstantAppResolverService;
import android.content.ContentProviderClient;
import android.content.pm.InstantAppResolveInfo;
import android.database.Cursor;
import android.os.RemoteException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: adjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adjq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int[] f61937a;

    /* renamed from: b */
    final /* synthetic */ adfb f61938b;

    /* renamed from: c */
    final /* synthetic */ InstantAppResolverService.InstantAppResolutionCallback f61939c;

    /* renamed from: d */
    final /* synthetic */ adjr f61940d;

    public adjq(adjr adjr, int[] iArr, adfb adfb, InstantAppResolverService.InstantAppResolutionCallback instantAppResolutionCallback) {
        this.f61940d = adjr;
        this.f61937a = iArr;
        this.f61938b = adfb;
        this.f61939c = instantAppResolutionCallback;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v42, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x034e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0352, code lost:
        r14 = r6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x034e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:12:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03d3  */
    public final void run() {
        List list;
        List list2;
        List a;
        int i;
        Cursor cursor;
        ObjectInputStream objectInputStream;
        adjn adjn = this.f61940d.f61941a;
        int[] iArr = this.f61937a;
        adja adja = (adja) adjn;
        if (!adja.f61864a.mo33394a()) {
            list = adja.f61865b.mo33569a(iArr);
        } else {
            adjn adjn2 = adja.f61866c;
            int i2 = 0;
            if (!cepr.f183236a.mo6606a().mo79566a()) {
                list2 = bngx.m109376e();
            } else {
                adjd adjd = (adjd) adjn2;
                ContentProviderClient a2 = adjd.mo33571a();
                if (a2 != null) {
                    int i3 = 3;
                    int i4 = 1;
                    int i5 = 2;
                    try {
                        Cursor query = a2.query(adky.m50780a(iArr), new String[]{"splitId", "domain", "routes"}, null, null, null);
                        if (query != null) {
                            try {
                                if (query.moveToFirst()) {
                                    ((adjd) adjn2).f61870a.mo33423a("DevMan response some results", new Object[0]);
                                    List arrayList = new ArrayList();
                                    while (true) {
                                        if (query.getColumnCount() != i3) {
                                            ((adjd) adjn2).f61870a.mo33423a("Skipping bad column.", new Object[i2]);
                                        } else {
                                            btiq btiq = (btiq) bxvk.m124016a(btiq.f149014e, query.getBlob(i2), bxus.m123743b());
                                            String string = query.getString(i4);
                                            byte[] blob = query.getBlob(i5);
                                            camg camg = camg.f175267d;
                                            try {
                                                ObjectInputStream objectInputStream2 = new ObjectInputStream(new ByteArrayInputStream(blob));
                                                try {
                                                    byte[][] bArr = (byte[][]) objectInputStream2.readObject();
                                                    aymy.m84288a(objectInputStream2);
                                                    if (bArr != null) {
                                                        bxxc[] bxxcArr = (bxxc[]) Array.newInstance(camg.getClass(), bArr.length);
                                                        int i6 = 0;
                                                        boolean z = i2;
                                                        while (i6 < bArr.length) {
                                                            bxxcArr[i6] = (bxxc) ((bxxk) camg.mo74142c(7)).mo73657a(bArr[i6]);
                                                            i6++;
                                                            z = false;
                                                        }
                                                        List<camg> asList = Arrays.asList((camg[]) new aymy(bxxcArr).f97998a);
                                                        bxvd da = adip.f61826d.mo74144da();
                                                        bxvd da2 = adiy.f61854f.mo74144da();
                                                        int i7 = btiq.f149019d;
                                                        if (da2.f164950c) {
                                                            da2.mo74035c();
                                                            da2.f164950c = z;
                                                        }
                                                        adiy adiy = (adiy) da2.f164949b;
                                                        adiy.f61859d = i7;
                                                        String str = btiq.f149016a;
                                                        str.getClass();
                                                        adiy.f61856a = str;
                                                        adiy.f61858c = btiq.f149018c;
                                                        HashMap hashMap = new HashMap();
                                                        for (camg camg2 : asList) {
                                                            if (!hashMap.containsKey(camg2.f175270b)) {
                                                                String str2 = camg2.f175270b;
                                                                if (da2.f164950c) {
                                                                    da2.mo74035c();
                                                                    da2.f164950c = z;
                                                                }
                                                                str2.getClass();
                                                                ((adiy) da2.f164949b).f61857b = str2;
                                                                adiy adiy2 = (adiy) da2.mo74062i();
                                                                if (da.f164950c) {
                                                                    da.mo74035c();
                                                                    da.f164950c = z;
                                                                }
                                                                adip adip = (adip) da.f164949b;
                                                                adiy2.getClass();
                                                                adip.mo33555b();
                                                                adip.f61829b.add(adiy2);
                                                                hashMap.put(camg2.f175270b, Integer.valueOf(((adip) da.f164949b).f61829b.size() - 1));
                                                            }
                                                        }
                                                        boolean z2 = z;
                                                        for (camg camg3 : asList) {
                                                            bxvd da3 = adis.f61836e.mo74144da();
                                                            int intValue = ((Integer) hashMap.get(camg3.f175270b)).intValue();
                                                            if (da3.f164950c) {
                                                                da3.mo74035c();
                                                                da3.f164950c = z2;
                                                            }
                                                            ((adis) da3.f164949b).f61840c = intValue;
                                                            camm camm = camg3.f175269a;
                                                            if (camm == null) {
                                                                camm = camm.f175301e;
                                                            }
                                                            int a3 = caml.m126789a(camm.f175303a);
                                                            int i8 = a3 - 1;
                                                            if (a3 != 0) {
                                                                if (i8 != 0) {
                                                                    String str3 = "";
                                                                    if (i8 == 1) {
                                                                        if (camm.f175303a == 3) {
                                                                            str3 = (String) camm.f175304b;
                                                                        }
                                                                        bxtx a4 = bxtx.m123258a(str3);
                                                                        if (da3.f164950c) {
                                                                            da3.mo74035c();
                                                                            da3.f164950c = false;
                                                                        }
                                                                        adis adis = (adis) da3.f164949b;
                                                                        a4.getClass();
                                                                        adis.f61838a = 2;
                                                                        adis.f61839b = a4;
                                                                    } else if (i8 == 2) {
                                                                        if (camm.f175303a == 4) {
                                                                            str3 = (String) camm.f175304b;
                                                                        }
                                                                        bxtx a5 = bxtx.m123258a(str3);
                                                                        if (da3.f164950c) {
                                                                            da3.mo74035c();
                                                                            da3.f164950c = false;
                                                                        }
                                                                        adis adis2 = (adis) da3.f164949b;
                                                                        a5.getClass();
                                                                        adis2.f61838a = 3;
                                                                        adis2.f61839b = a5;
                                                                    } else if (i8 == 3) {
                                                                        if (camm.f175303a == 5) {
                                                                            str3 = (String) camm.f175304b;
                                                                        }
                                                                        bxtx a6 = bxtx.m123258a(str3);
                                                                        if (da3.f164950c) {
                                                                            da3.mo74035c();
                                                                            da3.f164950c = false;
                                                                        }
                                                                        adis adis3 = (adis) da3.f164949b;
                                                                        a6.getClass();
                                                                        adis3.f61838a = 4;
                                                                        adis3.f61839b = a6;
                                                                    } else if (i8 == 4) {
                                                                        if (camm.f175303a == 7) {
                                                                            str3 = (String) camm.f175304b;
                                                                        }
                                                                        bxtx a7 = bxtx.m123258a(str3);
                                                                        if (da3.f164950c) {
                                                                            da3.mo74035c();
                                                                            da3.f164950c = false;
                                                                        }
                                                                        adis adis4 = (adis) da3.f164949b;
                                                                        a7.getClass();
                                                                        adis4.f61838a = 5;
                                                                        adis4.f61839b = a7;
                                                                    }
                                                                } else {
                                                                    boolean booleanValue = camm.f175303a == 6 ? ((Boolean) camm.f175304b).booleanValue() : false;
                                                                    if (da3.f164950c) {
                                                                        da3.mo74035c();
                                                                        da3.f164950c = false;
                                                                    }
                                                                    adis adis5 = (adis) da3.f164949b;
                                                                    adis5.f61838a = 1;
                                                                    adis5.f61839b = Boolean.valueOf(booleanValue);
                                                                }
                                                                adis adis6 = (adis) da3.mo74062i();
                                                                if (da.f164950c) {
                                                                    da.mo74035c();
                                                                    da.f164950c = false;
                                                                }
                                                                adip adip2 = (adip) da.f164949b;
                                                                adis6.getClass();
                                                                adip2.mo33554a();
                                                                adip2.f61828a.add(adis6);
                                                                z2 = false;
                                                            } else {
                                                                throw null;
                                                            }
                                                        }
                                                        i5 = 2;
                                                        i5 = 2;
                                                        List a8 = adjp.m50665a(string, (adip) da.mo74062i(), bnoj.f131912b, false);
                                                        if (a8 == null) {
                                                            ((adjd) adjn2).f61870a.mo33426b("Found devman domain with no filters!", new Object[0]);
                                                        } else {
                                                            arrayList.addAll(a8);
                                                        }
                                                    } else {
                                                        throw new RuntimeException("failed to deserialize bytes");
                                                    }
                                                } catch (IOException | ClassNotFoundException e) {
                                                    e = e;
                                                    objectInputStream = objectInputStream2;
                                                    try {
                                                        throw new RuntimeException("failed to deserialize bytes", e);
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        aymy.m84288a(objectInputStream);
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    objectInputStream = objectInputStream2;
                                                    aymy.m84288a(objectInputStream);
                                                    throw th;
                                                }
                                            } catch (IOException | ClassNotFoundException e2) {
                                                e = e2;
                                                objectInputStream = null;
                                                throw new RuntimeException("failed to deserialize bytes", e);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                objectInputStream = null;
                                                aymy.m84288a(objectInputStream);
                                                throw th;
                                            }
                                        }
                                        if (!query.moveToNext()) {
                                            adjd.m50585a(query);
                                            list2 = arrayList;
                                            break;
                                        }
                                        i3 = 3;
                                        i2 = 0;
                                        i4 = 1;
                                    }
                                }
                            } catch (bxwf e3) {
                                throw new RuntimeException(e3);
                            } catch (Exception e4) {
                                throw new RuntimeException("failed to create message array", e4);
                            } catch (RemoteException e5) {
                                e = e5;
                                cursor = query;
                                try {
                                    ((adjd) adjn2).f61870a.mo33425a(e, "Remote exception calling devman.", new Object[0]);
                                    list2 = bngx.m109376e();
                                    adjd.m50585a(cursor);
                                    a = ((adjd) adjn2).f61871b.mo33569a(iArr);
                                    List arrayList2 = new ArrayList();
                                    arrayList2.addAll(list2);
                                    while (i < a.size()) {
                                    }
                                    list = arrayList2;
                                    if (list != null) {
                                        this.f61938b.mo33409a("InstantAppResolverService.atLeastOneHashPrefixFilterMatch");
                                        this.f61939c.onInstantAppResolveInfo(list);
                                    }
                                    this.f61938b.mo33409a("InstantAppResolverService.zeroHashPrefixFilterMatches");
                                    this.f61939c.onInstantAppResolveInfo(list);
                                } catch (Throwable th4) {
                                    th = th4;
                                    adjd.m50585a(cursor);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                            }
                        }
                        ((adjd) adjn2).f61870a.mo33423a("DevMan response with no results", new Object[0]);
                        list2 = bngx.m109376e();
                        adjd.m50585a(query);
                    } catch (RemoteException e6) {
                        e = e6;
                        cursor = null;
                        ((adjd) adjn2).f61870a.mo33425a(e, "Remote exception calling devman.", new Object[0]);
                        list2 = bngx.m109376e();
                        adjd.m50585a(cursor);
                        a = ((adjd) adjn2).f61871b.mo33569a(iArr);
                        List arrayList22 = new ArrayList();
                        arrayList22.addAll(list2);
                        while (i < a.size()) {
                        }
                        list = arrayList22;
                        if (list != null) {
                        }
                        this.f61938b.mo33409a("InstantAppResolverService.zeroHashPrefixFilterMatches");
                        this.f61939c.onInstantAppResolveInfo(list);
                    } catch (Throwable th6) {
                        th = th6;
                        cursor = null;
                        adjd.m50585a(cursor);
                        throw th;
                    }
                } else {
                    adjd.f61870a.mo33423a("No content provider client", new Object[0]);
                    list2 = bngx.m109376e();
                }
            }
            a = ((adjd) adjn2).f61871b.mo33569a(iArr);
            List arrayList222 = new ArrayList();
            arrayList222.addAll(list2);
            for (i = 0; i < a.size(); i++) {
                InstantAppResolveInfo instantAppResolveInfo = (InstantAppResolveInfo) a.get(i);
                int i9 = 0;
                while (true) {
                    if (i9 >= arrayList222.size()) {
                        arrayList222.add(instantAppResolveInfo);
                        break;
                    }
                    InstantAppResolveInfo instantAppResolveInfo2 = (InstantAppResolveInfo) arrayList222.get(i9);
                    if (instantAppResolveInfo2.getDigestPrefix() == instantAppResolveInfo.getDigestPrefix() && instantAppResolveInfo2.getPackageName().equals(instantAppResolveInfo.getPackageName())) {
                        break;
                    }
                    i9++;
                }
            }
            list = arrayList222;
        }
        if (list != null && !list.isEmpty()) {
            this.f61938b.mo33409a("InstantAppResolverService.atLeastOneHashPrefixFilterMatch");
        } else {
            this.f61938b.mo33409a("InstantAppResolverService.zeroHashPrefixFilterMatches");
        }
        this.f61939c.onInstantAppResolveInfo(list);
    }
}
