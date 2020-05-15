package com.google.android.gms.ocr.credit.base;

import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class GenericResult implements Parcelable, Comparable {

    /* renamed from: c */
    public int f81301c = 1;

    /* renamed from: d */
    public double f81302d;

    /* renamed from: e */
    public final String f81303e;

    public GenericResult(String str, double d) {
        this.f81303e = str;
        this.f81302d = d;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return mo44733d() > ((GenericResult) obj).mo44733d() ? -1 : 1;
    }

    /* renamed from: d */
    public final double mo44733d() {
        double d = this.f81302d;
        double d2 = (double) this.f81301c;
        Double.isNaN(d2);
        return d / d2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GenericResult)) {
            return false;
        }
        GenericResult genericResult = (GenericResult) obj;
        boolean equals = obj.toString().equals(this.f81303e);
        if (!Double.valueOf(this.f81302d).equals(Double.valueOf(genericResult.f81302d))) {
            equals = false;
        }
        if (this.f81301c == genericResult.f81301c) {
            return equals;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f81303e;
        double d = this.f81302d;
        int i = this.f81301c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35);
        sb.append(str);
        sb.append(d);
        sb.append(i);
        return sb.toString().hashCode();
    }

    public final String toString() {
        return this.f81303e;
    }
}
