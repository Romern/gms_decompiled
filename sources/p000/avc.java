package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* renamed from: avc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avc extends avb {

    /* renamed from: d */
    private final SparseIntArray f2353d;

    /* renamed from: e */
    private final Parcel f2354e;

    /* renamed from: f */
    private final int f2355f;

    /* renamed from: g */
    private final int f2356g;

    /* renamed from: h */
    private final String f2357h;

    /* renamed from: i */
    private int f2358i;

    /* renamed from: j */
    private int f2359j;

    /* renamed from: k */
    private int f2360k;

    public avc(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1245ok(), new C1245ok(), new C1245ok());
    }

    /* renamed from: a */
    public final void mo2668a(int i) {
        this.f2354e.writeInt(i);
    }

    /* renamed from: b */
    public final void mo2691b() {
        int i = this.f2358i;
        if (i >= 0) {
            int i2 = this.f2353d.get(i);
            int dataPosition = this.f2354e.dataPosition();
            this.f2354e.setDataPosition(i2);
            this.f2354e.writeInt(dataPosition - i2);
            this.f2354e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final avb mo2695c() {
        Parcel parcel = this.f2354e;
        int dataPosition = parcel.dataPosition();
        int i = this.f2359j;
        int i2 = i != this.f2355f ? i : this.f2356g;
        return new avc(parcel, dataPosition, i2, this.f2357h + "  ", this.f2350a, this.f2351b, this.f2352c);
    }

    /* renamed from: d */
    public final int mo2697d() {
        return this.f2354e.readInt();
    }

    /* renamed from: e */
    public final long mo2698e() {
        return this.f2354e.readLong();
    }

    /* renamed from: f */
    public final String mo2699f() {
        return this.f2354e.readString();
    }

    /* renamed from: g */
    public final IBinder mo2700g() {
        return this.f2354e.readStrongBinder();
    }

    /* renamed from: h */
    public final byte[] mo2701h() {
        int readInt = this.f2354e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f2354e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final CharSequence mo2702i() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f2354e);
    }

    /* renamed from: j */
    public final Parcelable mo2703j() {
        return this.f2354e.readParcelable(getClass().getClassLoader());
    }

    /* renamed from: k */
    public final boolean mo2704k() {
        return this.f2354e.readInt() != 0;
    }

    private avc(Parcel parcel, int i, int i2, String str, C1245ok okVar, C1245ok okVar2, C1245ok okVar3) {
        super(okVar, okVar2, okVar3);
        this.f2353d = new SparseIntArray();
        this.f2358i = -1;
        this.f2360k = -1;
        this.f2354e = parcel;
        this.f2355f = i;
        this.f2356g = i2;
        this.f2359j = i;
        this.f2357h = str;
    }

    /* renamed from: a */
    public final void mo2670a(long j) {
        this.f2354e.writeLong(j);
    }

    /* renamed from: c */
    public final void mo2696c(int i) {
        mo2691b();
        this.f2358i = i;
        this.f2353d.put(i, this.f2354e.dataPosition());
        mo2668a(0);
        mo2668a(i);
    }

    /* renamed from: a */
    public final void mo2671a(IBinder iBinder) {
        this.f2354e.writeStrongBinder(iBinder);
    }

    /* renamed from: b */
    public final boolean mo2692b(int i) {
        while (this.f2359j < this.f2356g) {
            int i2 = this.f2360k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f2354e.setDataPosition(this.f2359j);
            int readInt = this.f2354e.readInt();
            this.f2360k = this.f2354e.readInt();
            this.f2359j += readInt;
        }
        return this.f2360k == i;
    }

    /* renamed from: a */
    public final void mo2672a(Parcelable parcelable) {
        this.f2354e.writeParcelable(parcelable, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo2676a(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f2354e, 0);
    }

    /* renamed from: a */
    public final void mo2678a(String str) {
        this.f2354e.writeString(str);
    }

    /* renamed from: a */
    public final void mo2680a(boolean z) {
        this.f2354e.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public final void mo2683a(byte[] bArr) {
        if (bArr != null) {
            this.f2354e.writeInt(bArr.length);
            this.f2354e.writeByteArray(bArr);
            return;
        }
        this.f2354e.writeInt(-1);
    }
}
