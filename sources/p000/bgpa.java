package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: bgpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgpa implements bgec {

    /* renamed from: a */
    final /* synthetic */ long[] f117149a;

    /* renamed from: b */
    final /* synthetic */ long[] f117150b;

    /* renamed from: c */
    final /* synthetic */ bgpc f117151c;

    /* renamed from: d */
    final /* synthetic */ bgca f117152d;

    public bgpa(bgpc bgpc, long[] jArr, long[] jArr2, bgca bgca) {
        this.f117151c = bgpc;
        this.f117149a = jArr;
        this.f117150b = jArr2;
        this.f117152d = bgca;
    }

    /* renamed from: a */
    public final void mo62705a(bgmk bgmk, bsax bsax) {
        boolean z;
        HashMap hashMap = new HashMap(this.f117149a.length);
        HashMap hashMap2 = new HashMap(this.f117150b.length);
        ArrayList arrayList = new ArrayList(this.f117150b.length);
        boolean a = this.f117151c.mo63062a(this.f117149a, hashMap, this.f117150b, hashMap2, arrayList, System.currentTimeMillis(), SystemClock.elapsedRealtime());
        int size = hashMap.size();
        int size2 = hashMap2.size();
        int size3 = arrayList.size();
        StringBuilder sb = new StringBuilder(191);
        sb.append("Returning post-GLS cache results, wifi success count is ");
        sb.append(size);
        sb.append(" Gls query might bring more wifi models, consulting GLS : ");
        sb.append(a);
        sb.append(", cell success is ");
        sb.append(size2);
        sb.append(", cell cache miss is ");
        sb.append(size3);
        sb.toString();
        if (bsax != null) {
            z = true;
        } else {
            z = false;
        }
        this.f117152d.mo62633a(z, hashMap, hashMap2);
    }
}
