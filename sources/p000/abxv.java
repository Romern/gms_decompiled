package p000;

import android.util.Log;
import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.Section;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.queries.QueryCall$Request;
import com.google.firebase.appindexing.Query;
import com.google.firebase.appindexing.ResultSet;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: abxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abxv extends abxm {

    /* renamed from: a */
    private final briu f58704a;

    /* renamed from: b */
    private final abrv f58705b;

    /* renamed from: c */
    private final abwu f58706c;

    /* renamed from: d */
    private final abyy f58707d;

    /* renamed from: e */
    private final Query[] f58708e;

    public abxv(abrv abrv, abwu abwu, abyy abyy, briu briu, Query[] queryArr) {
        super(abrv.mo32331n(), abwu, abrv.f58083s, abxp.m48475a(abrv.f58066b));
        this.f58705b = abrv;
        this.f58706c = abwu;
        this.f58707d = abyy;
        this.f58704a = briu;
        this.f58708e = queryArr;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abzm.a(abyy, java.lang.String[], boolean, java.lang.String):java.util.Set
     arg types: [abyy, ?[OBJECT, ARRAY], int, java.lang.String]
     candidates:
      abzm.a(acak, java.util.List, java.lang.Integer, absv):void
      abzm.a(abyy, java.lang.String[], boolean, java.lang.String):java.util.Set */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo32376a() {
        String str;
        ByteBuffer byteBuffer;
        caef caef;
        int i;
        ResultSet[] resultSetArr = new ResultSet[this.f58708e.length];
        int i2 = 0;
        while (true) {
            Query[] queryArr = this.f58708e;
            if (i2 >= queryArr.length) {
                return resultSetArr;
            }
            Query query = queryArr[i2];
            acxl acxl = new acxl(bpzh.QUERY, acky.m49364b(5));
            acxl.mo33202a();
            HashSet hashSet = new HashSet();
            abzo a = this.f58705b.mo32298a();
            abyy abyy = this.f58707d;
            String str2 = this.f58706c.f58652a;
            ArrayList arrayList = new ArrayList();
            synchronized (((abzm) a).mo32525a()) {
                for (acak acak : ((abzm) a).mo32528a(abyy, (String[]) null, true, str2)) {
                    absr d = ((abzm) a).mo32543d(acak);
                    if (d != null && abww.m48413a(d.f58138c)) {
                        arrayList.add(d);
                    }
                }
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                hashSet.add(((absr) arrayList.get(i3)).f58138c);
            }
            HashSet hashSet2 = new HashSet();
            if (query.f152337a.isEmpty()) {
                hashSet2.addAll(hashSet);
            } else {
                HashSet hashSet3 = new HashSet();
                List list = query.f152337a;
                int size2 = list.size();
                int i4 = 0;
                while (i4 < size2) {
                    String str3 = (String) list.get(i4);
                    int i5 = 3;
                    int[] iArr = {1, 2, 3};
                    int i6 = 0;
                    while (true) {
                        i = i4 + 1;
                        if (i6 >= i5) {
                            break;
                        }
                        List list2 = list;
                        int i7 = size2;
                        String b = new abww(abxt.m48504a(this.f58705b.f58066b).mo32425b(str3), this.f58706c.f58652a, iArr[i6]).mo32395b();
                        if (hashSet.contains(b)) {
                            hashSet3.add(b);
                        }
                        i6++;
                        list = list2;
                        size2 = i7;
                        i5 = 3;
                    }
                    i4 = i;
                }
                hashSet2.addAll(hashSet3);
            }
            String[] strArr = (String[]) hashSet2.toArray(new String[hashSet2.size()]);
            if (strArr.length == 0) {
                if (!query.f152337a.isEmpty()) {
                    String valueOf = String.valueOf(query.f152337a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
                    sb.append(" for types ");
                    sb.append(valueOf);
                    str = sb.toString();
                } else {
                    str = "";
                }
                String str4 = this.f58706c.f58652a;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 31 + String.valueOf(str4).length());
                sb2.append("No index");
                sb2.append(str);
                sb2.append(" is found for package: ");
                sb2.append(str4);
                throw new abxq(sb2.toString(), bpzq.INVALID_QUERY_NO_INDEX);
            }
            QueryCall$Request queryCall$Request = new QueryCall$Request();
            queryCall$Request.f107477a = query.f152338b;
            queryCall$Request.f107478b = this.f58706c.f58652a;
            queryCall$Request.f107479c = strArr;
            queryCall$Request.f107481e = 10;
            frv frv = new frv();
            frv.mo11220a(new Section("thing_proto"));
            frv.mo11222c();
            frv.f17159a = new STSortSpec(query.f152339c);
            queryCall$Request.f107482f = frv.mo11219a();
            abrv abrv = this.f58705b;
            SearchResults a2 = apsl.m70904a(abrv, queryCall$Request, this.f58707d, acxl, abrv.f58083s.mo32454b());
            if (!a2.mo7231a()) {
                bngs bngs = new bngs();
                fsn b2 = a2.iterator();
                while (b2.hasNext()) {
                    C1001fsm a3 = b2.next();
                    fsl a4 = a3.mo11251a("thing_proto");
                    if (a4 != null) {
                        a4.mo11249a(a3.f17193a);
                        byteBuffer = ByteBuffer.wrap(a4.f17192d, a4.f17190b, a4.f17191c[a4.f17189a]).asReadOnlyBuffer();
                    } else {
                        byteBuffer = null;
                    }
                    if (byteBuffer == null || !byteBuffer.hasRemaining()) {
                        caef = null;
                    } else {
                        try {
                            caef = (caef) GeneratedMessageLite.m124012a(caef.f172809f, byteBuffer);
                        } catch (bxwf e) {
                            if (briy.m114098a(6)) {
                                Log.e("FirebaseAppIndex", "Invalid thing_proto section", e);
                            }
                            caef = null;
                        }
                    }
                    if (caef == null) {
                        String a5 = a3.mo11252a();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(a5).length() + 55);
                        sb3.append("Dropping document ");
                        sb3.append(a5);
                        sb3.append(" from result set: invalid Thing proto");
                        briy.m114099b(sb3.toString());
                    } else {
                        bngs.mo67668c(abyd.m48527a(caef));
                    }
                }
                resultSetArr[i2] = new ResultSet(bngs.mo67664a());
                i2++;
            } else {
                throw new IllegalStateException(a2.f9664a);
            }
        }
        while (true) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32377a(Status status, Object obj) {
        this.f58704a.mo69573a(status, (ResultSet[]) obj);
    }
}
