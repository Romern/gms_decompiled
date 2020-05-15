package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: sef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sef {
    /* renamed from: a */
    public static SafeParcelable m35067a(Intent intent, String str, Parcelable.Creator creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra != null) {
            return m35069a(byteArrayExtra, creator);
        }
        return null;
    }

    /* renamed from: b */
    public static String m35075b(SafeParcelable safeParcelable) {
        return sqd.m35970c(m35074a(safeParcelable));
    }

    /* renamed from: b */
    public static ArrayList m35076b(Intent intent, String str, Parcelable.Creator creator) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(m35069a((byte[]) arrayList.get(i), creator));
        }
        return arrayList2;
    }

    /* renamed from: a */
    public static SafeParcelable m35068a(String str, Parcelable.Creator creator) {
        return m35069a(sqd.m35969b(str), creator);
    }

    /* renamed from: a */
    public static SafeParcelable m35069a(byte[] bArr, Parcelable.Creator creator) {
        sdo.m34959a(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return safeParcelable;
    }

    /* renamed from: a */
    public static ArrayList m35070a(Bundle bundle, String str, Parcelable.Creator creator) {
        ArrayList arrayList = (ArrayList) bundle.getSerializable(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(m35069a((byte[]) arrayList.get(i), creator));
        }
        return arrayList2;
    }

    /* renamed from: a */
    public static void m35071a(SafeParcelable safeParcelable, Intent intent, String str) {
        intent.putExtra(str, m35074a(safeParcelable));
    }

    /* renamed from: a */
    public static void m35072a(Iterable iterable, Intent intent, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(m35074a((SafeParcelable) it.next()));
        }
        intent.putExtra(str, arrayList);
    }

    /* renamed from: a */
    public static void m35073a(Iterable iterable, Bundle bundle, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(m35074a((SafeParcelable) it.next()));
        }
        bundle.putSerializable(str, arrayList);
    }

    /* renamed from: a */
    public static byte[] m35074a(SafeParcelable safeParcelable) {
        Parcel obtain = Parcel.obtain();
        safeParcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
