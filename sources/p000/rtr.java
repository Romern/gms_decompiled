package p000;

import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.places.internal.HierarchicalPlaceLikelihoodEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: rtr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class rtr implements aekz {

    /* renamed from: a */
    public final DataHolder f43672a;

    /* renamed from: b */
    protected int f43673b;

    /* renamed from: c */
    public int f43674c;

    public rtr(DataHolder dataHolder, int i) {
        sdo.m34959a(dataHolder);
        this.f43672a = dataHolder;
        mo25144a(i);
    }

    /* renamed from: a */
    public static byte[] m34416a(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        bxvd da = bglv.f116801d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bglv bglv = (bglv) da.f164949b;
        if (!bglv.f116804b.mo73666a()) {
            bglv.f116804b = bxvk.m124019a(bglv.f116804b);
        }
        bxsy.m123078a(list, bglv.f116804b);
        return ((bglv) da.mo74062i()).mo73642k();
    }

    /* renamed from: b */
    public static byte[] m34417b(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        bxvd da = bglv.f116801d.mo74144da();
        for (int i = 0; i < list.size(); i++) {
            bxtx a = bxtx.m123261a(sef.m35074a((SafeParcelable) list.get(i)));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bglv bglv = (bglv) da.f164949b;
            a.getClass();
            if (!bglv.f116805c.mo73666a()) {
                bglv.f116805c = bxvk.m124021a(bglv.f116805c);
            }
            bglv.f116805c.add(a);
        }
        return ((bglv) da.mo74062i()).mo73642k();
    }

    /* renamed from: c */
    public static byte[] m34418c(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        bxvd da = bglv.f116801d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bglv bglv = (bglv) da.f164949b;
        if (!bglv.f116803a.mo73666a()) {
            bglv.f116803a = bxvk.m124021a(bglv.f116803a);
        }
        bxsy.m123078a(list, bglv.f116803a);
        return ((bglv) da.mo74062i()).mo73642k();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rtr.a(java.lang.String, float):float
     arg types: [java.lang.String, int]
     candidates:
      rtr.a(java.lang.String, int):int
      rtr.a(java.lang.String, android.os.Parcelable$Creator):com.google.android.gms.common.internal.safeparcel.SafeParcelable
      rtr.a(java.lang.String, java.lang.String):java.lang.String
      rtr.a(java.lang.String, java.util.List):java.util.List
      rtr.a(java.lang.String, float):float */
    /* renamed from: bA */
    public float mo25148bA() {
        return mo25138a("place_likelihood", -1.0f);
    }

    /* renamed from: bB */
    public aelh mo25149bB() {
        return new aeoj(this.f43672a, this.f43673b);
    }

    /* renamed from: d */
    public String mo25151d(String str) {
        return this.f43672a.mo17769c(str, this.f43673b, this.f43674c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final byte[] mo25152e(String str) {
        return this.f43672a.mo17772e(str, this.f43673b, this.f43674c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof rtr) {
            rtr rtr = (rtr) obj;
            return sdg.m34949a(Integer.valueOf(rtr.f43673b), Integer.valueOf(this.f43673b)) && sdg.m34949a(Integer.valueOf(rtr.f43674c), Integer.valueOf(this.f43674c)) && rtr.f43672a == this.f43672a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo25154f(String str) {
        return this.f43672a.mo17773f(str, this.f43673b, this.f43674c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final byte[] mo25155g(String str) {
        if (!mo25145a(str) || mo25154f(str)) {
            return null;
        }
        return mo25152e(str);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f43673b), Integer.valueOf(this.f43674c), this.f43672a});
    }

    /* renamed from: s */
    public final int mo25157s() {
        return mo25139a("place_hierarchy_level", 0);
    }

    /* renamed from: t */
    public final List mo25158t() {
        return mo25147b("place_contained_place_ids", HierarchicalPlaceLikelihoodEntity.f79527a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rtr.a(java.lang.String, float):float
     arg types: [java.lang.String, int]
     candidates:
      rtr.a(java.lang.String, int):int
      rtr.a(java.lang.String, android.os.Parcelable$Creator):com.google.android.gms.common.internal.safeparcel.SafeParcelable
      rtr.a(java.lang.String, java.lang.String):java.lang.String
      rtr.a(java.lang.String, java.util.List):java.util.List
      rtr.a(java.lang.String, float):float */
    /* renamed from: bF */
    public /* bridge */ /* synthetic */ Object mo7556bF() {
        return HierarchicalPlaceLikelihoodEntity.m66931a(((aeoj) mo25149bB()).mo7556bF(), mo25148bA(), mo25138a("place_hierarchy_likelihood", -1.0f), mo25157s(), mo25158t());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo25138a(String str, float f) {
        if (!mo25145a(str) || mo25154f(str)) {
            return f;
        }
        DataHolder dataHolder = this.f43672a;
        int i = this.f43673b;
        int i2 = this.f43674c;
        dataHolder.mo17765a(str, i);
        return dataHolder.f30164d[i2].getFloat(i, dataHolder.f30163c.getInt(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo25150c(String str) {
        return this.f43672a.mo17771d(str, this.f43673b, this.f43674c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo25139a(String str, int i) {
        return (!mo25145a(str) || mo25154f(str)) ? i : mo25146b(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo25146b(String str) {
        return this.f43672a.mo17767b(str, this.f43673b, this.f43674c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final SafeParcelable mo25140a(String str, Parcelable.Creator creator) {
        byte[] g = mo25155g(str);
        if (g != null) {
            return sef.m35069a(g, creator);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List mo25147b(String str, List list) {
        byte[] g = mo25155g(str);
        if (g == null) {
            return list;
        }
        try {
            bglv bglv = (bglv) bxvk.m124014a(bglv.f116801d, g);
            return bglv.f116803a.size() != 0 ? bglv.f116803a : list;
        } catch (bxwf e) {
            if (Log.isLoggable("SafeDataBufferRef", 6)) {
                Log.e("SafeDataBufferRef", "Cannot parse byte[]", e);
            }
            return list;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo25141a(String str, String str2) {
        return (!mo25145a(str) || mo25154f(str)) ? str2 : mo25151d(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List mo25142a(String str, Parcelable.Creator creator, List list) {
        byte[] g = mo25155g(str);
        if (g == null) {
            return list;
        }
        try {
            bglv bglv = (bglv) bxvk.m124014a(bglv.f116801d, g);
            if (bglv.f116805c.size() == 0) {
                return list;
            }
            ArrayList arrayList = new ArrayList(bglv.f116805c.size());
            for (bxtx bxtx : bglv.f116805c) {
                arrayList.add(sef.m35069a(bxtx.mo73780k(), creator));
            }
            return arrayList;
        } catch (bxwf e) {
            if (Log.isLoggable("SafeDataBufferRef", 6)) {
                Log.e("SafeDataBufferRef", "Cannot parse byte[]", e);
            }
            return list;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List mo25143a(String str, List list) {
        byte[] g = mo25155g(str);
        if (g == null) {
            return list;
        }
        try {
            bglv bglv = (bglv) bxvk.m124014a(bglv.f116801d, g);
            return bglv.f116804b.size() != 0 ? bglv.f116804b : list;
        } catch (bxwf e) {
            if (Log.isLoggable("SafeDataBufferRef", 6)) {
                Log.e("SafeDataBufferRef", "Cannot parse byte[]", e);
            }
            return list;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25144a(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f43672a.f30168h) {
            z = true;
        }
        sdo.m34970a(z);
        this.f43673b = i;
        this.f43674c = this.f43672a.mo17762a(i);
    }

    /* renamed from: a */
    public final boolean mo25145a(String str) {
        return this.f43672a.mo17766a(str);
    }
}
