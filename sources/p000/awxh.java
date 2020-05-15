package p000;

import java.util.ArrayList;

/* renamed from: awxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awxh implements srl {

    /* renamed from: a */
    final /* synthetic */ String f95234a;

    /* renamed from: b */
    final /* synthetic */ bjev f95235b;

    /* renamed from: c */
    final /* synthetic */ btro f95236c;

    /* renamed from: d */
    final /* synthetic */ int f95237d;

    /* renamed from: e */
    final /* synthetic */ awxi f95238e;

    public awxh(awxi awxi, String str, bjev bjev, btro btro, int i) {
        this.f95238e = awxi;
        this.f95234a = str;
        this.f95235b = bjev;
        this.f95236c = btro;
        this.f95237d = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo21850a(Object obj) {
        ArrayList arrayList;
        Void voidR = (Void) obj;
        awgj awgj = this.f95238e.f95240b;
        String str = this.f95234a;
        bjev bjev = this.f95235b;
        byte[] k = this.f95236c.mo73642k();
        if (this.f95237d == 3) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(awxi.f95239a);
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return awgj.mo52126a(str, bjev, k, arrayList, 30, 17);
    }
}
