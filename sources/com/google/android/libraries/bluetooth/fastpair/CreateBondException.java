package com.google.android.libraries.bluetooth.fastpair;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CreateBondException extends PairingException {

    /* renamed from: a */
    public int f111061a;

    /* renamed from: b */
    public final int f111062b;

    public CreateBondException(int i, int i2, String str, Object... objArr) {
        super(str, objArr);
        this.f111062b = i;
        this.f111061a = i2;
    }
}
