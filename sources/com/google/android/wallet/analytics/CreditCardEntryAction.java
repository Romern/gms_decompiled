package com.google.android.wallet.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CreditCardEntryAction implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bjeo();

    /* renamed from: a */
    public boolean f151724a;

    /* renamed from: b */
    public int f151725b;

    /* renamed from: c */
    public boolean f151726c;

    /* renamed from: d */
    public boolean f151727d;

    /* renamed from: e */
    public boolean f151728e;

    /* renamed from: f */
    public boolean f151729f;

    /* renamed from: g */
    public int f151730g;

    /* renamed from: h */
    public boolean f151731h;

    /* renamed from: i */
    public boolean f151732i;

    /* renamed from: j */
    public boolean f151733j;

    /* renamed from: k */
    public boolean f151734k;

    /* renamed from: l */
    public int f151735l;

    /* renamed from: m */
    public boolean f151736m;

    /* renamed from: n */
    public boolean f151737n;

    /* renamed from: o */
    public boolean f151738o;

    /* renamed from: p */
    public long f151739p;

    /* renamed from: q */
    public boolean f151740q;

    /* renamed from: r */
    public boolean f151741r;

    /* renamed from: s */
    public int f151742s = -1;

    /* renamed from: t */
    public int f151743t;

    /* renamed from: u */
    public int f151744u = -1;

    /* renamed from: v */
    public int f151745v;

    /* renamed from: w */
    public int f151746w;

    /* renamed from: x */
    public int f151747x;

    /* renamed from: y */
    public int f151748y;

    public CreditCardEntryAction() {
    }

    /* renamed from: a */
    private static boolean m118347a(Parcel parcel) {
        return parcel.readInt() == 1;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        sb.append("panOcrEnabled: ");
        sb.append(this.f151724a);
        sb.append("\npanEntryType: ");
        sb.append(this.f151725b);
        sb.append("\npanRecognizedByOcr: ");
        sb.append(this.f151726c);
        sb.append("\npanValidationErrorOccurred: ");
        sb.append(this.f151727d);
        sb.append("\npanRecognizedByNfc: ");
        sb.append(this.f151728e);
        sb.append("\nexpDateOcrEnabled: ");
        sb.append(this.f151729f);
        sb.append("\nexpDateEntryType: ");
        sb.append(this.f151730g);
        sb.append("\nexpDateRecognizedByOcr: ");
        sb.append(this.f151731h);
        sb.append("\nexpDateValidationErrorOccurred: ");
        sb.append(this.f151732i);
        sb.append("\nexpDateRecognizedByNfc: ");
        sb.append(this.f151733j);
        sb.append("\nnameOcrEnabled: ");
        sb.append(this.f151734k);
        sb.append("\nnameEntryType: ");
        sb.append(this.f151735l);
        sb.append("\nnameRecognizedByOcr: ");
        sb.append(this.f151736m);
        sb.append("\nnameValidationErrorOccurred: ");
        sb.append(this.f151737n);
        sb.append("\nnameRecognizedByNfc: ");
        sb.append(this.f151738o);
        sb.append("\nnfcElapsedTimeMillis: ");
        sb.append(this.f151739p);
        sb.append("\nnfcFeatureEnabled: ");
        sb.append(this.f151740q);
        sb.append("\nnfcAdapterEnabled: ");
        sb.append(this.f151741r);
        sb.append("\nnumOcrAttempts: ");
        sb.append(this.f151742s);
        sb.append("\nocrExitReason: ");
        sb.append(this.f151743t);
        sb.append("\nnumNfcAttempts: ");
        sb.append(this.f151744u);
        sb.append("\nnfcExitReason: ");
        sb.append(this.f151745v);
        sb.append("\nnfcErrorReason: ");
        sb.append(this.f151746w);
        sb.append("\ncameraInputPreference: ");
        sb.append(this.f151747x);
        sb.append("\nnfcInputPreference: ");
        sb.append(this.f151748y);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f151724a ? 1 : 0);
        parcel.writeInt(this.f151725b);
        parcel.writeInt(this.f151726c ? 1 : 0);
        parcel.writeInt(this.f151727d ? 1 : 0);
        parcel.writeInt(this.f151728e ? 1 : 0);
        parcel.writeInt(this.f151729f ? 1 : 0);
        parcel.writeInt(this.f151730g);
        parcel.writeInt(this.f151731h ? 1 : 0);
        parcel.writeInt(this.f151732i ? 1 : 0);
        parcel.writeInt(this.f151733j ? 1 : 0);
        parcel.writeInt(this.f151734k ? 1 : 0);
        parcel.writeInt(this.f151735l);
        parcel.writeInt(this.f151736m ? 1 : 0);
        parcel.writeInt(this.f151737n ? 1 : 0);
        parcel.writeInt(this.f151738o ? 1 : 0);
        parcel.writeLong(this.f151739p);
        parcel.writeInt(this.f151740q ? 1 : 0);
        parcel.writeInt(this.f151741r ? 1 : 0);
        parcel.writeInt(this.f151742s);
        parcel.writeInt(this.f151743t);
        parcel.writeInt(this.f151744u);
        parcel.writeInt(this.f151745v);
        parcel.writeInt(this.f151746w);
        parcel.writeInt(this.f151747x);
        parcel.writeInt(this.f151748y);
    }

    public CreditCardEntryAction(Parcel parcel) {
        this.f151724a = m118347a(parcel);
        this.f151725b = parcel.readInt();
        this.f151726c = m118347a(parcel);
        this.f151727d = m118347a(parcel);
        this.f151728e = m118347a(parcel);
        this.f151729f = m118347a(parcel);
        this.f151730g = parcel.readInt();
        this.f151731h = m118347a(parcel);
        this.f151732i = m118347a(parcel);
        this.f151733j = m118347a(parcel);
        this.f151734k = m118347a(parcel);
        this.f151735l = parcel.readInt();
        this.f151736m = m118347a(parcel);
        this.f151737n = m118347a(parcel);
        this.f151738o = m118347a(parcel);
        this.f151739p = parcel.readLong();
        this.f151740q = m118347a(parcel);
        this.f151741r = m118347a(parcel);
        this.f151742s = parcel.readInt();
        this.f151743t = parcel.readInt();
        this.f151744u = parcel.readInt();
        this.f151745v = parcel.readInt();
        this.f151746w = parcel.readInt();
        this.f151747x = parcel.readInt();
        this.f151748y = parcel.readInt();
    }
}
