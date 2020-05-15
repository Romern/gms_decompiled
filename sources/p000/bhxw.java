package p000;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: bhxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhxw {

    /* renamed from: a */
    public final String f119852a;

    /* renamed from: b */
    public final List f119853b;

    /* renamed from: c */
    public final LatLngBounds f119854c;

    /* renamed from: d */
    public final long f119855d;

    /* renamed from: e */
    public boolean f119856e = false;

    /* renamed from: f */
    final /* synthetic */ bhyd f119857f;

    public bhxw(bhyd bhyd, String str, List list, LatLngBounds latLngBounds, long j) {
        this.f119857f = bhyd;
        this.f119852a = str;
        this.f119853b = list;
        this.f119854c = latLngBounds;
        this.f119855d = j;
    }

    /* renamed from: a */
    public final void mo64404a() {
        this.f119856e = true;
    }

    /* renamed from: b */
    public final void mo64405b() {
        boolean z;
        List list;
        if (this.f119857f.f119877h) {
            ArrayList arrayList = new ArrayList(this.f119853b.size());
            HashSet<String> hashSet = new HashSet();
            for (bhxn bhxn : this.f119853b) {
                List a = biag.m101850a(bhxn.f119830b.f109594c);
                int size = a.size();
                for (int i = 0; i < size; i++) {
                    String str = (String) a.get(i);
                    if (!TextUtils.isEmpty(str)) {
                        hashSet.add(str);
                    } else {
                        arrayList.add(bhxn);
                        if (Log.isLoggable("Places", 5)) {
                            String valueOf = String.valueOf(bhxn);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 73);
                            sb.append("Places won't be fetched for subscription which has an empty client name: ");
                            sb.append(valueOf);
                            Log.w("Places", sb.toString());
                        }
                    }
                }
            }
            this.f119857f.f119870a.removeAll(arrayList);
            this.f119853b.removeAll(arrayList);
            if (!hashSet.isEmpty()) {
                PlacesParams placesParams = new PlacesParams("com.google.android.gms", Locale.getDefault(), this.f119852a);
                bhxv bhxv = new bhxv(this);
                bhyi bhyi = this.f119857f.f119879j;
                String str2 = placesParams.f79574d;
                LatLngBounds latLngBounds = this.f119854c;
                int[] iArr = biod.f121038a;
                int l = (int) cgfr.f186745a.mo6606a().mo83637l();
                LatLng latLng = latLngBounds.f79897b;
                double d = latLng.f79894a;
                double b = ayuo.m84846b(d, latLng.f79895b, d, latLngBounds.f79896a.f79895b);
                double d2 = latLngBounds.f79897b.f79894a;
                LatLng latLng2 = latLngBounds.f79896a;
                double d3 = latLng2.f79895b;
                PlacesParams placesParams2 = placesParams;
                int ceil = (int) Math.ceil(Math.max(b, ayuo.m84846b(d2, d3, latLng2.f79894a, d3)));
                if (ceil <= biod.f121038a[0]) {
                    z = ceil >= biod.f121038a[biod.f121038a.length + -1];
                } else {
                    z = false;
                }
                sdo.m34974b(z);
                int length = biod.f121038a.length - 1;
                int i2 = 0;
                while (i2 <= length) {
                    PlacesParams placesParams3 = placesParams2;
                    int i3 = (i2 + length) / 2;
                    int i4 = biod.f121038a[i3];
                    if (i4 + i4 >= ceil) {
                        i2 = i3 + 1;
                    } else {
                        length = i3 - 1;
                    }
                    placesParams2 = placesParams3;
                }
                LatLng a2 = latLngBounds.mo43870a();
                long a3 = ayvd.m84899a(ayvd.m84895a(a2.f79894a, a2.f79895b), length);
                long[] jArr = new long[8];
                ayvd.m84902a(a3, length, jArr);
                if (length <= l) {
                    ArrayDeque arrayDeque = new ArrayDeque();
                    arrayDeque.offer(Long.valueOf(a3));
                    for (int i5 = 0; i5 < 8; i5++) {
                        long j = jArr[i5];
                        if (j == 0) {
                            break;
                        }
                        arrayDeque.offer(Long.valueOf(j));
                    }
                    while (!arrayDeque.isEmpty() && length < l) {
                        int size2 = arrayDeque.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            long longValue = ((Long) arrayDeque.poll()).longValue();
                            for (int i7 = 0; i7 < 4; i7++) {
                                long b2 = ayvd.m84912b(longValue, i7);
                                if (b2 == 0) {
                                    break;
                                }
                                arrayDeque.offer(Long.valueOf(b2));
                            }
                        }
                        length++;
                    }
                    list = biod.m102652a(latLngBounds, l, arrayDeque);
                } else {
                    HashSet hashSet2 = new HashSet();
                    hashSet2.add(Long.valueOf(ayvd.m84899a(a3, l)));
                    for (int i8 = 0; i8 < 8; i8++) {
                        long j2 = jArr[i8];
                        if (j2 != 0) {
                            hashSet2.add(Long.valueOf(ayvd.m84899a(j2, l)));
                        }
                    }
                    list = biod.m102652a(latLngBounds, l, hashSet2);
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str3 : hashSet) {
                    int size3 = list.size();
                    for (int i9 = 0; i9 < size3; i9++) {
                        arrayList2.add(bhyw.m101782a(str2, str3, Long.valueOf(((Long) list.get(i9)).longValue())));
                    }
                }
                PlacesParams placesParams4 = placesParams2;
                bhyi.f119893a.mo64427a(arrayList2, new bhyg(bhyi, placesParams4, bhxv));
                if (cgfl.m145006b()) {
                    bpqk c = bhqq.m101365c(1, placesParams4);
                    bxvd bxvd = (bxvd) c.mo74142c(5);
                    bxvd.mo73625a((bxvk) c);
                    bprg a4 = bhqq.m101359a(15, placesParams4.f79573c, Locale.getDefault().toString());
                    bxvd bxvd2 = (bxvd) a4.mo74142c(5);
                    bxvd2.mo73625a((bxvk) a4);
                    bxvd da = bprj.f138858b.mo74144da();
                    for (String str4 : hashSet) {
                        bpov a5 = bhqq.m101347a(bhqq.m101362b(str4), bhqq.m101360a(str4));
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bprj bprj = (bprj) da.f164949b;
                        a5.getClass();
                        if (!bprj.f138860a.mo73666a()) {
                            bprj.f138860a = bxvk.m124021a(bprj.f138860a);
                        }
                        bprj.f138860a.add(a5);
                    }
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    bprg bprg = (bprg) bxvd2.f164949b;
                    bprj bprj2 = (bprj) da.mo74062i();
                    bprg bprg2 = bprg.f138829s;
                    bprj2.getClass();
                    bprg.f138848r = bprj2;
                    bprg.f138831a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bpqk bpqk = (bpqk) bxvd.f164949b;
                    bprg bprg3 = (bprg) bxvd2.mo74062i();
                    bpqk bpqk2 = bpqk.f138732w;
                    bprg3.getClass();
                    bpqk.f138742i = bprg3;
                    bpqk.f138734a |= 64;
                    this.f119857f.f119876g.mo64139a(bhqq.m101346a((bpqk) bxvd.mo74062i()));
                }
            }
        }
    }
}
