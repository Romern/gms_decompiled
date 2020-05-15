package p000;

import android.os.ParcelUuid;
import com.google.android.gms.beacon.BleFilter;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: neh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class neh {

    /* renamed from: a */
    public ParcelUuid f35389a;

    /* renamed from: b */
    public ParcelUuid f35390b;

    /* renamed from: c */
    private ParcelUuid f35391c;

    /* renamed from: d */
    private byte[] f35392d;

    /* renamed from: e */
    private byte[] f35393e;

    /* renamed from: f */
    private int f35394f = -1;

    /* renamed from: g */
    private byte[] f35395g;

    /* renamed from: h */
    private byte[] f35396h;

    /* renamed from: a */
    public final BleFilter mo20515a() {
        return new BleFilter(null, null, this.f35389a, this.f35390b, this.f35391c, this.f35392d, this.f35393e, this.f35394f, this.f35395g, this.f35396h);
    }

    /* renamed from: a */
    public final void mo20517a(ParcelUuid parcelUuid) {
        this.f35389a = parcelUuid;
        this.f35390b = null;
    }

    /* renamed from: a */
    public final void mo20516a(int i, byte[] bArr, byte[] bArr2) {
        if (bArr == null || i >= 0) {
            if (bArr2 != null) {
                if (bArr == null) {
                    throw new IllegalArgumentException("manufacturerData is null while manufacturerDataMask is not null");
                } else if (bArr.length != bArr2.length) {
                    throw new IllegalArgumentException("size mismatch for manufacturerData and manufacturerDataMask");
                }
            }
            this.f35394f = i;
            if (bArr == null) {
                bArr = new byte[0];
            }
            this.f35395g = bArr;
            this.f35396h = bArr2;
            return;
        }
        throw new IllegalArgumentException("invalid manufacture id");
    }

    /* renamed from: a */
    public final void mo20518a(ParcelUuid parcelUuid, byte[] bArr) {
        if (parcelUuid != null) {
            this.f35391c = parcelUuid;
            this.f35392d = bArr;
            this.f35393e = null;
            return;
        }
        throw new IllegalArgumentException("serviceDataUuid is null");
    }

    /* renamed from: a */
    public final void mo20519a(ParcelUuid parcelUuid, byte[] bArr, byte[] bArr2) {
        if (parcelUuid != null) {
            if (bArr2 != null) {
                if (bArr == null) {
                    throw new IllegalArgumentException("serviceData is null while serviceDataMask is not null");
                } else if (bArr.length != bArr2.length) {
                    throw new IllegalArgumentException("size mismatch for service data and service data mask");
                }
            }
            this.f35391c = parcelUuid;
            this.f35392d = bArr;
            this.f35393e = bArr2;
            return;
        }
        throw new IllegalArgumentException("serviceDataUuid is null");
    }

    /* renamed from: a */
    public final void mo20520a(byte[] bArr) {
        mo20516a((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, bArr, (byte[]) null);
    }
}
