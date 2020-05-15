package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: bjvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjvp {
    /* renamed from: a */
    public static Bundle m104728a(Collection collection) {
        Bundle bundle = new Bundle(collection.size());
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            bxxc bxxc = (bxxc) it.next();
            bundle.putByteArray(Integer.toString(i), bxxc != null ? bxxc.mo73642k() : null);
            i++;
        }
        return bundle;
    }

    /* renamed from: b */
    public static ArrayList m104741b(Parcel parcel, bxxk bxxk) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readInt; i++) {
            arrayList.add(m104731a(parcel, bxxk));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static bxxc m104729a(Intent intent, String str, bxxk bxxk) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra != null) {
            return m104733a(byteArrayExtra, bxxk);
        }
        return null;
    }

    /* renamed from: b */
    public static List m104742b(Bundle bundle, String str, bxxk bxxk) {
        Bundle bundle2;
        if (!bundle.containsKey(str) || (bundle2 = bundle.getBundle(str)) == null) {
            return null;
        }
        int size = bundle2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            byte[] byteArray = bundle2.getByteArray(Integer.toString(i));
            arrayList.add(byteArray != null ? m104733a(byteArray, bxxk) : null);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static bxxc m104730a(Bundle bundle, String str, bxxk bxxk) {
        byte[] byteArray = bundle.getByteArray(str);
        if (byteArray != null) {
            return m104733a(byteArray, bxxk);
        }
        return null;
    }

    /* renamed from: a */
    public static bxxc m104731a(Parcel parcel, bxxk bxxk) {
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray != null) {
            return m104733a(createByteArray, bxxk);
        }
        return null;
    }

    /* renamed from: a */
    public static bxxc m104732a(String str, bxxk bxxk) {
        if (str != null) {
            return m104733a(Base64.decode(str, 0), bxxk);
        }
        return null;
    }

    /* renamed from: a */
    public static bxxc m104733a(byte[] bArr, bxxk bxxk) {
        try {
            return (bxxc) bxxk.mo73662b(bArr, bxus.m123744c());
        } catch (bxwf e) {
            String valueOf = String.valueOf(((bxxc) bxxk.mo73653a(bxtx.f164797b)).getClass().getName());
            throw new RuntimeException(valueOf.length() == 0 ? new String("Failed to parse a known parcelable proto ") : "Failed to parse a known parcelable proto ".concat(valueOf));
        } catch (bxwf e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: a */
    public static String m104734a(bxxc bxxc) {
        if (bxxc != null) {
            return Base64.encodeToString(bxxc.mo73642k(), 0);
        }
        return null;
    }

    /* renamed from: a */
    public static void m104735a(Intent intent, String str, bxxc bxxc) {
        if (bxxc != null) {
            intent.putExtra(str, bxxc.mo73642k());
        } else {
            intent.putExtra(str, (byte[]) null);
        }
    }

    /* renamed from: a */
    public static void m104736a(Bundle bundle, String str, bxxc bxxc) {
        if (bxxc != null) {
            bundle.putByteArray(str, bxxc.mo73642k());
        } else {
            bundle.putByteArray(str, null);
        }
    }

    /* renamed from: a */
    public static void m104737a(Bundle bundle, String str, List list) {
        if (list != null) {
            bundle.putBundle(str, m104728a(list));
        }
    }

    /* renamed from: a */
    public static void m104738a(bxxc bxxc, Parcel parcel) {
        parcel.writeByteArray(bxxc != null ? bxxc.mo73642k() : null);
    }

    /* renamed from: a */
    public static void m104739a(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("Response for ");
        } else {
            "Response for ".concat(valueOf);
        }
    }

    /* renamed from: a */
    public static void m104740a(List list, Parcel parcel) {
        if (list != null) {
            int size = list.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                m104738a((bxxc) list.get(i), parcel);
            }
            return;
        }
        parcel.writeInt(-1);
    }
}
