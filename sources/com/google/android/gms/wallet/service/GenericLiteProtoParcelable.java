package com.google.android.gms.wallet.service;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class GenericLiteProtoParcelable implements Parcelable {

    /* renamed from: a */
    public final Account f110327a;

    /* renamed from: b */
    public bxxc f110328b;

    /* renamed from: c */
    public List f110329c;

    /* renamed from: d */
    private final bxxk f110330d;

    /* renamed from: e */
    private byte[] f110331e;

    public GenericLiteProtoParcelable(Account account, bxxk bxxk, bxxc bxxc) {
        this(account, bxxk, bxxc, (List) null);
    }

    /* renamed from: a */
    public final bxxc mo59970a() {
        if (this.f110328b == null) {
            this.f110328b = bjvp.m104733a(this.f110331e, this.f110330d);
        }
        return this.f110328b;
    }

    /* renamed from: b */
    public final byte[] mo59971b() {
        if (this.f110331e == null) {
            this.f110331e = this.f110328b.mo73642k();
        }
        return (byte[]) this.f110331e.clone();
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.f110327a.writeToParcel(parcel, 0);
        parcel.writeByteArray(mo59971b());
        parcel.writeStringList(this.f110329c);
    }

    public GenericLiteProtoParcelable(Account account, bxxk bxxk, bxxc bxxc, List list) {
        this.f110327a = account;
        this.f110330d = bxxk;
        this.f110328b = bxxc;
        if (list != null) {
            this.f110329c = new ArrayList(list);
        }
    }

    public GenericLiteProtoParcelable(Account account, bxxk bxxk, byte[] bArr) {
        this(account, bxxk, bArr, (List) null);
    }

    public GenericLiteProtoParcelable(Account account, bxxk bxxk, byte[] bArr, List list) {
        this.f110327a = account;
        this.f110330d = bxxk;
        this.f110331e = (byte[]) bArr.clone();
        if (list != null) {
            this.f110329c = new ArrayList(list);
        }
    }
}
