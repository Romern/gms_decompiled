package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetAccountInfoResponse extends AbstractSafeParcelable implements brpk {
    public static final Parcelable.Creator CREATOR = new brql();

    /* renamed from: a */
    public GetAccountInfoUserList f152511a;

    public GetAccountInfoResponse() {
    }

    /* renamed from: a */
    public final bxxk mo69763a() {
        return (bxxk) bkkk.f124562b.mo74142c(7);
    }

    /* renamed from: b */
    public final List mo72410b() {
        return this.f152511a.f152525a;
    }

    public GetAccountInfoResponse(GetAccountInfoUserList getAccountInfoUserList) {
        GetAccountInfoUserList getAccountInfoUserList2;
        if (getAccountInfoUserList == null) {
            getAccountInfoUserList2 = GetAccountInfoUserList.m118898a();
        } else {
            sdo.m34959a(getAccountInfoUserList);
            List list = getAccountInfoUserList.f152525a;
            GetAccountInfoUserList getAccountInfoUserList3 = new GetAccountInfoUserList();
            if (list != null && !list.isEmpty()) {
                getAccountInfoUserList3.f152525a.addAll(list);
            }
            getAccountInfoUserList2 = getAccountInfoUserList3;
        }
        this.f152511a = getAccountInfoUserList2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f152511a, i, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69764a(bxxc bxxc) {
        ArrayList arrayList;
        ArrayList arrayList2;
        long j;
        bxxc bxxc2 = bxxc;
        if (bxxc2 instanceof bkkk) {
            bkkk bkkk = (bkkk) bxxc2;
            if (bkkk.f124564a.size() != 0) {
                ArrayList arrayList3 = new ArrayList(bkkk.f124564a.size());
                int i = 0;
                while (i < bkkk.f124564a.size()) {
                    bklp bklp = (bklp) bkkk.f124564a.get(i);
                    String b = stm.m36300b(bklp.f124821a);
                    String b2 = stm.m36300b(bklp.f124822b);
                    boolean z = bklp.f124825e;
                    String b3 = stm.m36300b(bklp.f124823c);
                    String b4 = stm.m36300b(bklp.f124824d);
                    ProviderUserInfoList a = ProviderUserInfoList.m118903a(bklp.f124826f);
                    String b5 = stm.m36300b(bklp.f124829i);
                    String b6 = stm.m36300b(bklp.f124830j);
                    int i2 = i;
                    long j2 = bklp.f124828h;
                    bkkk bkkk2 = bkkk;
                    long j3 = bklp.f124827g;
                    bxwc bxwc = bklp.f124831k;
                    if (bxwc != null) {
                        ArrayList arrayList4 = new ArrayList();
                        arrayList = arrayList3;
                        int size = bxwc.size();
                        j = j3;
                        for (int i3 = 0; i3 < size; i3++) {
                            arrayList4.add(MfaInfo.m118902a((bkll) bxwc.get(i3)));
                        }
                        arrayList2 = arrayList4;
                    } else {
                        j = j3;
                        arrayList = arrayList3;
                        arrayList2 = bngx.m109376e();
                    }
                    arrayList.add(new GetAccountInfoUser(b, b2, z, b3, b4, a, b5, b6, j2, j, false, null, arrayList2));
                    i = i2 + 1;
                    arrayList3 = arrayList;
                    bkkk = bkkk2;
                }
                this.f152511a = new GetAccountInfoUserList(arrayList3);
                return;
            }
            this.f152511a = GetAccountInfoUserList.m118898a();
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of GetAccountInfoResponse.");
    }
}
