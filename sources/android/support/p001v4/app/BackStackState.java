package android.support.p001v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.BackStackState */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1003fu();

    /* renamed from: a */
    public final int[] f988a;

    /* renamed from: b */
    public final ArrayList f989b;

    /* renamed from: c */
    public final int[] f990c;

    /* renamed from: d */
    public final int[] f991d;

    /* renamed from: e */
    public final int f992e;

    /* renamed from: f */
    public final String f993f;

    /* renamed from: g */
    public final int f994g;

    /* renamed from: h */
    public final int f995h;

    /* renamed from: i */
    public final CharSequence f996i;

    /* renamed from: j */
    public final int f997j;

    /* renamed from: k */
    public final CharSequence f998k;

    /* renamed from: l */
    public final ArrayList f999l;

    /* renamed from: m */
    public final ArrayList f1000m;

    /* renamed from: n */
    public final boolean f1001n;

    public BackStackState(Parcel parcel) {
        this.f988a = parcel.createIntArray();
        this.f989b = parcel.createStringArrayList();
        this.f990c = parcel.createIntArray();
        this.f991d = parcel.createIntArray();
        this.f992e = parcel.readInt();
        this.f993f = parcel.readString();
        this.f994g = parcel.readInt();
        this.f995h = parcel.readInt();
        this.f996i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f997j = parcel.readInt();
        this.f998k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f999l = parcel.createStringArrayList();
        this.f1000m = parcel.createStringArrayList();
        this.f1001n = parcel.readInt() != 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f988a);
        parcel.writeStringList(this.f989b);
        parcel.writeIntArray(this.f990c);
        parcel.writeIntArray(this.f991d);
        parcel.writeInt(this.f992e);
        parcel.writeString(this.f993f);
        parcel.writeInt(this.f994g);
        parcel.writeInt(this.f995h);
        TextUtils.writeToParcel(this.f996i, parcel, 0);
        parcel.writeInt(this.f997j);
        TextUtils.writeToParcel(this.f998k, parcel, 0);
        parcel.writeStringList(this.f999l);
        parcel.writeStringList(this.f1000m);
        parcel.writeInt(this.f1001n ? 1 : 0);
    }

    public BackStackState(C1002ft ftVar) {
        int size = ftVar.f20270d.size();
        this.f988a = new int[(size * 5)];
        if (ftVar.f20276j) {
            this.f989b = new ArrayList(size);
            this.f990c = new int[size];
            this.f991d = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C1057hq hqVar = (C1057hq) ftVar.f20270d.get(i);
                int i3 = i2 + 1;
                this.f988a[i2] = hqVar.f20205a;
                ArrayList arrayList = this.f989b;
                C1018gh ghVar = hqVar.f20206b;
                arrayList.add(ghVar != null ? ghVar.f18192i : null);
                int i4 = i3 + 1;
                int[] iArr = this.f988a;
                iArr[i3] = hqVar.f20207c;
                int i5 = i4 + 1;
                iArr[i4] = hqVar.f20208d;
                int i6 = i5 + 1;
                iArr[i5] = hqVar.f20209e;
                iArr[i6] = hqVar.f20210f;
                this.f990c[i] = hqVar.f20211g.ordinal();
                this.f991d[i] = hqVar.f20212h.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.f992e = ftVar.f20275i;
            this.f993f = ftVar.f20278l;
            this.f994g = ftVar.f17211c;
            this.f995h = ftVar.f20279m;
            this.f996i = ftVar.f20280n;
            this.f997j = ftVar.f20281o;
            this.f998k = ftVar.f20282p;
            this.f999l = ftVar.f20283q;
            this.f1000m = ftVar.f20284r;
            this.f1001n = ftVar.f20285s;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }
}
