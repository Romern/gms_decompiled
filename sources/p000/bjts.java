package p000;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: bjts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bjts implements bjth {

    /* renamed from: a */
    ArrayList f123310a;

    /* renamed from: b */
    private final String f123311b;

    /* renamed from: c */
    private final Context f123312c;

    /* renamed from: d */
    private final C1245ok f123313d = new C1245ok();

    protected bjts(String str, Context context) {
        this.f123311b = str;
        this.f123312c = context;
    }

    /* renamed from: a */
    public final btwp mo65522a(String str, String str2) {
        throw new UnsupportedOperationException(this.f123311b.concat(" does not use reference identifiers"));
    }

    /* renamed from: a */
    public final String mo65523a() {
        return this.f123311b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract List mo65528b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo65529c();

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        return;
     */
    /* renamed from: d */
    public final synchronized void mo65530d() {
        List list;
        if (this.f123310a == null) {
            try {
                list = mo65528b();
            } catch (Throwable th) {
                Log.e(this.f123311b, "Could not retrieve addresses", th);
                list = null;
            }
            if (list == null) {
                this.f123310a = new ArrayList();
                return;
            }
            this.f123310a = bjtl.m104567a(list, (char[]) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo65531e() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c2  */
    /* renamed from: a */
    public final List mo65524a(CharSequence charSequence, char c, char[] cArr, int i, String str) {
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i2;
        int i3;
        int i4;
        CharSequence charSequence2 = charSequence;
        char c2 = c;
        char[] cArr2 = cArr;
        int i5 = i;
        String str3 = str;
        if (charSequence.length() < mo65529c()) {
            return Collections.emptyList();
        }
        if (C1221nn.m19678a(this.f123312c.getResources().getConfiguration().locale) == 1) {
            return Collections.emptyList();
        }
        mo65530d();
        if (this.f123310a.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList3 = new ArrayList();
        String str4 = this.f123311b;
        String a = bjtv.m104615a(i);
        if (cArr2 != null) {
            str2 = new String(cArr2);
        } else {
            str2 = "*";
        }
        synchronized (this.f123313d) {
            arrayList = (ArrayList) this.f123313d.get(str2);
            int i6 = 5;
            if (arrayList == null) {
                arrayList = bjtl.m104567a(this.f123310a, cArr2);
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    btwp btwp = (btwp) arrayList.get(i7);
                    bxvd bxvd = (bxvd) btwp.mo74142c(i6);
                    bxvd.mo73625a((GeneratedMessageLite) btwp);
                    btwo btwo = (btwo) bxvd;
                    int i8 = size;
                    if (((btwp) btwo.f164949b).f152745p.size() == 1) {
                        btwo.mo72447a("");
                        arrayList.set(i7, (btwp) btwo.mo74062i());
                    }
                    i7++;
                    size = i8;
                    i6 = 5;
                }
                this.f123313d.put(str2, arrayList);
            }
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size2 = arrayList.size();
        int i9 = 0;
        while (i9 < size2) {
            btwp btwp2 = (btwp) arrayList.get(i9);
            bxvd bxvd2 = (bxvd) btwp2.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) btwp2);
            btwo btwo2 = (btwo) bxvd2;
            if (btwo2 != null) {
                String a2 = bjtg.m104555a((btwp) btwo2.mo74062i(), c2);
                int a3 = bjtw.m104617a(a2, charSequence2);
                if (a3 == -1) {
                    i2 = size2;
                    arrayList2 = arrayList;
                } else {
                    if (!TextUtils.isEmpty(charSequence)) {
                        i3 = charSequence.length();
                    } else {
                        i3 = 0;
                    }
                    Integer valueOf = Integer.valueOf(a3);
                    Integer valueOf2 = Integer.valueOf(i3);
                    SpannableString a4 = bjtw.m104618a(Collections.singletonList(Pair.create(valueOf, valueOf2)), a2);
                    i2 = size2;
                    if (i5 != 0) {
                        arrayList2 = arrayList;
                        if (!((btwp) btwo2.f164949b).f152731b.isEmpty()) {
                            i4 = bjtv.m104616b(((btwp) btwo2.f164949b).f152731b);
                        } else {
                            i4 = 858;
                        }
                        if (i4 == 0 || i4 == 858) {
                            if (i5 != 858) {
                                btwo2 = (btwo) btwo2.clone();
                                if (btwo2.f164950c) {
                                    btwo2.mo74035c();
                                    btwo2.f164950c = false;
                                }
                                btwp btwp3 = (btwp) btwo2.f164949b;
                                btwp btwp4 = btwp.f152728s;
                                a.getClass();
                                btwp3.f152730a |= 1;
                                btwp3.f152731b = a;
                                if (!TextUtils.isEmpty(str)) {
                                    if (((btwp) btwo2.f164949b).f152733d.isEmpty()) {
                                        if (btwo2.f164950c) {
                                            btwo2.mo74035c();
                                            btwo2.f164950c = false;
                                        }
                                        btwp btwp5 = (btwp) btwo2.f164949b;
                                        btwp btwp6 = btwp.f152728s;
                                        str.getClass();
                                        btwp5.f152730a |= 8;
                                        btwp5.f152733d = str3;
                                    } else if (!bjtl.m104571a(((btwp) btwo2.f164949b).f152733d, str3)) {
                                        if (c2 == 'N' && !treeMap.containsKey(a2)) {
                                            treeMap.put(a2, a4);
                                        }
                                    }
                                }
                                treeMap.put(a2, null);
                                char[] cArr3 = bjtj.f123272a;
                                String a5 = bjtg.m104558a((btwp) btwo2.mo74062i(), (String) null, cArr2, bjtj.f123272a);
                                arrayList3.add(new bjtj(a2, (btwp) btwo2.mo74062i(), bjtw.m104618a(Collections.singletonList(Pair.create(Integer.valueOf(bjtw.m104617a(a5, charSequence2)), valueOf2)), a5), str4));
                            }
                        } else if (i4 == i5) {
                            if (!TextUtils.isEmpty(str)) {
                            }
                            treeMap.put(a2, null);
                            char[] cArr32 = bjtj.f123272a;
                            String a52 = bjtg.m104558a((btwp) btwo2.mo74062i(), (String) null, cArr2, bjtj.f123272a);
                            arrayList3.add(new bjtj(a2, (btwp) btwo2.mo74062i(), bjtw.m104618a(Collections.singletonList(Pair.create(Integer.valueOf(bjtw.m104617a(a52, charSequence2)), valueOf2)), a52), str4));
                        } else if (c2 == 'N') {
                            if (!treeMap.containsKey(a2)) {
                                treeMap.put(a2, a4);
                            }
                        }
                    } else {
                        arrayList2 = arrayList;
                    }
                    if (!TextUtils.isEmpty(str)) {
                    }
                    treeMap.put(a2, null);
                    char[] cArr322 = bjtj.f123272a;
                    String a522 = bjtg.m104558a((btwp) btwo2.mo74062i(), (String) null, cArr2, bjtj.f123272a);
                    arrayList3.add(new bjtj(a2, (btwp) btwo2.mo74062i(), bjtw.m104618a(Collections.singletonList(Pair.create(Integer.valueOf(bjtw.m104617a(a522, charSequence2)), valueOf2)), a522), str4));
                }
            } else {
                i2 = size2;
                arrayList2 = arrayList;
            }
            i9++;
            size2 = i2;
            arrayList = arrayList2;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry.getValue() != null) {
                arrayList3.add(new bjtj((String) entry.getKey(), (CharSequence) entry.getValue(), str4, (String) null));
            }
        }
        if (mo65531e()) {
            Collections.sort(arrayList3, bjtj.f123273b);
        }
        return arrayList3;
    }
}
