package p000;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import java.util.ArrayList;
import java.util.List;

/* renamed from: awvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awvq implements srl {

    /* renamed from: a */
    final /* synthetic */ Object f95171a;

    /* renamed from: b */
    final /* synthetic */ String f95172b;

    /* renamed from: c */
    final /* synthetic */ bjev f95173c;

    /* renamed from: d */
    final /* synthetic */ List f95174d;

    /* renamed from: e */
    final /* synthetic */ int f95175e;

    /* renamed from: f */
    final /* synthetic */ awvy f95176f;

    public awvq(awvy awvy, Object obj, String str, bjev bjev, List list, int i) {
        this.f95176f = awvy;
        this.f95171a = obj;
        this.f95172b = str;
        this.f95173c = bjev;
        this.f95174d = list;
        this.f95175e = i;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, bxxc], assign insn: 0x0002: IGET  (r11v2 ? I:java.lang.Object) = (r10v0 'this' awvq A[THIS]) awvq.a java.lang.Object */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo21850a(Object obj) {
        ArrayList arrayList;
        Void voidR = (Void) obj;
        ? r11 = this.f95171a;
        if (r11 instanceof bxxc) {
            byte[] k = r11.mo73642k();
            awgj awgj = this.f95176f.f95196c;
            String str = this.f95172b;
            bjev bjev = this.f95173c;
            List list = this.f95174d;
            if (list == null) {
                arrayList = null;
            } else if (list.size() != 0) {
                int size = list.size();
                if (size % 2 == 0) {
                    arrayList = new ArrayList(size / 2);
                    int i = 0;
                    while (i < size) {
                        String str2 = (String) list.get(i);
                        String str3 = (String) list.get(i + 1);
                        if (!TextUtils.isEmpty(str2)) {
                            arrayList.add(new Pair(str2, str3));
                            i += 2;
                        } else {
                            throw new IllegalArgumentException("Header names must be non empty.");
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Header arrays must have matching names and values");
                }
            } else {
                arrayList = null;
            }
            ServerResponse a = awgj.mo52126a(str, bjev, k, arrayList, this.f95175e, 39);
            if (a.mo60051d()) {
                if (a.mo60052e() != null) {
                    a.mo60052e();
                    bjvp.m104739a(this.f95172b);
                } else {
                    throw new IllegalArgumentException("ServerResponse should contain proto response");
                }
            }
            return a;
        }
        throw new IllegalArgumentException("Request should be MessageLite type");
    }
}
