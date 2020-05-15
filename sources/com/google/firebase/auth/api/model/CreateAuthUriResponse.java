package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CreateAuthUriResponse extends AbstractSafeParcelable implements brpk {
    public static final Parcelable.Creator CREATOR = new brqa();

    /* renamed from: a */
    public String f152505a;

    /* renamed from: b */
    public boolean f152506b;

    /* renamed from: c */
    public String f152507c;

    /* renamed from: d */
    public boolean f152508d;

    /* renamed from: e */
    public StringList f152509e;

    /* renamed from: f */
    public List f152510f;

    public CreateAuthUriResponse() {
        this.f152509e = StringList.m118907a();
    }

    /* renamed from: a */
    public final bxxk mo69763a() {
        return (bxxk) bkkb.f124494g.mo74142c(7);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, this.f152505a, false);
        see.m35051a(parcel, 3, this.f152506b);
        see.m35046a(parcel, 4, this.f152507c, false);
        see.m35051a(parcel, 5, this.f152508d);
        see.m35040a(parcel, 6, this.f152509e, i, false);
        see.m35065b(parcel, 7, this.f152510f, false);
        see.m35062b(parcel, a);
    }

    public CreateAuthUriResponse(String str, boolean z, String str2, boolean z2, StringList stringList, List list) {
        StringList stringList2;
        this.f152505a = str;
        this.f152506b = z;
        this.f152507c = str2;
        this.f152508d = z2;
        if (stringList != null) {
            stringList2 = new StringList(stringList.f152555b);
        } else {
            stringList2 = StringList.m118907a();
        }
        this.f152509e = stringList2;
        this.f152510f = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69764a(bxxc bxxc) {
        StringList stringList;
        List list;
        if (bxxc instanceof bkkb) {
            bkkb bkkb = (bkkb) bxxc;
            this.f152505a = stm.m36300b(bkkb.f124496a);
            this.f152506b = bkkb.f124498c;
            this.f152507c = stm.m36300b(bkkb.f124499d);
            this.f152508d = bkkb.f124500e;
            if (bkkb.f124497b.size() != 0) {
                stringList = new StringList(1, new ArrayList(bkkb.f124497b));
            } else {
                stringList = StringList.m118907a();
            }
            this.f152509e = stringList;
            if (bkkb.f124501f.size() == 0) {
                list = new ArrayList(0);
            } else {
                list = bkkb.f124501f;
            }
            this.f152510f = list;
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of CreateAuthUriResponse.");
    }
}
