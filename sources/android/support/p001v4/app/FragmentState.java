package android.support.p001v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.app.FragmentState */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1054hn();

    /* renamed from: a */
    public final String f1010a;

    /* renamed from: b */
    public final String f1011b;

    /* renamed from: c */
    public final boolean f1012c;

    /* renamed from: d */
    public final int f1013d;

    /* renamed from: e */
    public final int f1014e;

    /* renamed from: f */
    public final String f1015f;

    /* renamed from: g */
    public final boolean f1016g;

    /* renamed from: h */
    public final boolean f1017h;

    /* renamed from: i */
    public final boolean f1018i;

    /* renamed from: j */
    public final Bundle f1019j;

    /* renamed from: k */
    public final boolean f1020k;

    /* renamed from: l */
    public final int f1021l;

    /* renamed from: m */
    public Bundle f1022m;

    public FragmentState(Parcel parcel) {
        this.f1010a = parcel.readString();
        this.f1011b = parcel.readString();
        boolean z = true;
        this.f1012c = parcel.readInt() != 0;
        this.f1013d = parcel.readInt();
        this.f1014e = parcel.readInt();
        this.f1015f = parcel.readString();
        this.f1016g = parcel.readInt() != 0;
        this.f1017h = parcel.readInt() != 0;
        this.f1018i = parcel.readInt() != 0;
        this.f1019j = parcel.readBundle();
        this.f1020k = parcel.readInt() == 0 ? false : z;
        this.f1022m = parcel.readBundle();
        this.f1021l = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1010a);
        sb.append(" (");
        sb.append(this.f1011b);
        sb.append(")}:");
        if (this.f1012c) {
            sb.append(" fromLayout");
        }
        if (this.f1014e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1014e));
        }
        String str = this.f1015f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f1015f);
        }
        if (this.f1016g) {
            sb.append(" retainInstance");
        }
        if (this.f1017h) {
            sb.append(" removing");
        }
        if (this.f1018i) {
            sb.append(" detached");
        }
        if (this.f1020k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1010a);
        parcel.writeString(this.f1011b);
        parcel.writeInt(this.f1012c ? 1 : 0);
        parcel.writeInt(this.f1013d);
        parcel.writeInt(this.f1014e);
        parcel.writeString(this.f1015f);
        parcel.writeInt(this.f1016g ? 1 : 0);
        parcel.writeInt(this.f1017h ? 1 : 0);
        parcel.writeInt(this.f1018i ? 1 : 0);
        parcel.writeBundle(this.f1019j);
        parcel.writeInt(this.f1020k ? 1 : 0);
        parcel.writeBundle(this.f1022m);
        parcel.writeInt(this.f1021l);
    }

    public FragmentState(C1018gh ghVar) {
        this.f1010a = ghVar.getClass().getName();
        this.f1011b = ghVar.f18192i;
        this.f1012c = ghVar.f18200q;
        this.f1013d = ghVar.f18209z;
        this.f1014e = ghVar.f18164A;
        this.f1015f = ghVar.f18165B;
        this.f1016g = ghVar.f18168E;
        this.f1017h = ghVar.f18199p;
        this.f1018i = ghVar.f18167D;
        this.f1019j = ghVar.f18193j;
        this.f1020k = ghVar.f18166C;
        this.f1021l = ghVar.f18183T.ordinal();
    }
}
