package com.google.android.gms.ocr.base;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OcrImage {

    /* renamed from: a */
    public byte[] f81266a;

    /* renamed from: b */
    public int f81267b = Integer.MIN_VALUE;

    /* renamed from: c */
    public int f81268c;

    /* renamed from: d */
    public int f81269d;

    /* renamed from: e */
    public int f81270e = Integer.MIN_VALUE;

    public OcrImage() {
    }

    public byte[] getData() {
        sdo.m34966a(this.f81266a, "no data buffer allocated");
        return this.f81266a;
    }

    public int getFormat() {
        sdo.m34966a(this.f81266a, "no data buffer allocated");
        return this.f81267b;
    }

    public int getHeight() {
        sdo.m34966a(this.f81266a, "no data buffer allocated");
        return this.f81269d;
    }

    public int getOrientation() {
        sdo.m34966a(Boolean.valueOf(this.f81270e != Integer.MIN_VALUE), "no data buffer allocated");
        return this.f81270e;
    }

    public int getWidth() {
        sdo.m34966a(this.f81266a, "no data buffer allocated");
        return this.f81268c;
    }

    public final String toString() {
        if (this.f81266a == null) {
            return "no data buffer allocated";
        }
        sdf a = sdg.m34948a(this);
        a.mo25396a("length", Integer.valueOf(this.f81266a.length));
        a.mo25396a("format", Integer.valueOf(this.f81267b));
        a.mo25396a("width", Integer.valueOf(this.f81268c));
        a.mo25396a("height", Integer.valueOf(this.f81269d));
        a.mo25396a("orientiation", Integer.valueOf(this.f81270e));
        return a.toString();
    }

    public OcrImage(byte[] bArr, int i, int i2, int i3, int i4) {
        boolean z;
        sdo.m34966a(bArr, "must have data for image");
        if (!(i == 256 || i == 16 || i == 17)) {
            if (i == 4) {
                z = true;
            } else if (!(i == 0 || i == 20 || i == 842094169)) {
                z = false;
            }
            sdo.m34976b(z, "Invalid format %s", Integer.valueOf(i));
            this.f81266a = bArr;
            this.f81267b = i;
            this.f81268c = i2;
            this.f81269d = i3;
            this.f81270e = i4;
        }
        z = true;
        sdo.m34976b(z, "Invalid format %s", Integer.valueOf(i));
        this.f81266a = bArr;
        this.f81267b = i;
        this.f81268c = i2;
        this.f81269d = i3;
        this.f81270e = i4;
    }
}
