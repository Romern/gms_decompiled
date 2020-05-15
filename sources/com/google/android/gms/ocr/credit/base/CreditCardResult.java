package com.google.android.gms.ocr.credit.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CreditCardResult implements Parcelable, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aksp();

    /* renamed from: a */
    public PanResult f81285a;

    /* renamed from: b */
    public ArrayList f81286b = new ArrayList();

    /* renamed from: c */
    public ExpDateResult f81287c;

    /* renamed from: d */
    public ArrayList f81288d = new ArrayList();

    /* renamed from: e */
    public NameResult f81289e;

    /* renamed from: f */
    public ArrayList f81290f = new ArrayList();

    /* renamed from: g */
    public final int f81291g;

    /* renamed from: h */
    public Integer f81292h;

    public CreditCardResult(PanResult panResult, ExpDateResult expDateResult, NameResult nameResult, int i) {
        this.f81285a = panResult;
        this.f81287c = expDateResult;
        this.f81289e = nameResult;
        this.f81291g = i;
        aksq.m60381a(expDateResult, this.f81288d);
        aksq.m60381a(nameResult, this.f81290f);
        aksq.m60381a(panResult, this.f81286b);
    }

    /* renamed from: a */
    public final void mo44717a(CreditCardResult creditCardResult) {
        if (creditCardResult.f81291g == this.f81291g) {
            this.f81285a = creditCardResult.f81285a;
            this.f81286b = creditCardResult.f81286b;
            aksq.m60381a(creditCardResult.f81285a, creditCardResult.f81286b);
            ExpDateResult expDateResult = creditCardResult.f81287c;
            if (expDateResult != null) {
                this.f81287c = expDateResult;
                aksq.m60381a(creditCardResult.f81287c, this.f81288d);
            }
            NameResult nameResult = creditCardResult.f81289e;
            if (nameResult != null) {
                this.f81289e = nameResult;
                aksq.m60381a(creditCardResult.f81289e, this.f81290f);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid pipelineType");
    }

    /* renamed from: b */
    public final String[] mo44719b() {
        return aksq.m60382a(this.f81290f);
    }

    /* renamed from: c */
    public final int[] mo44720c() {
        int[] iArr = new int[0];
        ArrayList arrayList = this.f81288d;
        if (arrayList != null) {
            iArr = new int[arrayList.size()];
        }
        Collections.sort(this.f81288d);
        int size = this.f81288d.size();
        for (int i = 0; i < size; i++) {
            iArr[i] = ((ExpDateResult) this.f81288d.get(i)).mo44727a();
        }
        return iArr;
    }

    /* renamed from: d */
    public final int[] mo44721d() {
        int[] iArr = new int[0];
        ArrayList arrayList = this.f81288d;
        if (arrayList != null) {
            iArr = new int[arrayList.size()];
        }
        Collections.sort(this.f81288d);
        int size = this.f81288d.size();
        for (int i = 0; i < size; i++) {
            iArr[i] = ((ExpDateResult) this.f81288d.get(i)).mo44728b();
        }
        return iArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f81285a, i);
        parcel.writeParcelable(this.f81287c, i);
        parcel.writeParcelable(this.f81289e, i);
        parcel.writeInt(this.f81291g);
        Integer num = this.f81292h;
        if (num == null) {
            parcel.writeIntArray(new int[0]);
        } else {
            parcel.writeIntArray(new int[]{num.intValue()});
        }
        parcel.writeIntArray(mo44720c());
        parcel.writeIntArray(mo44721d());
        parcel.writeStringArray(mo44719b());
        parcel.writeStringArray(mo44718a());
    }

    /* renamed from: a */
    public final String[] mo44718a() {
        return aksq.m60382a(this.f81286b);
    }
}
