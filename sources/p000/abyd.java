package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: abyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abyd {
    /* renamed from: a */
    private static Bundle m48526a(List list) {
        Bundle bundle = new Bundle();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            caed caed = (caed) list.get(i);
            String str = caed.f172802b;
            if (!caed.f172803c.isEmpty()) {
                bundle.putBooleanArray(str, bqcc.m112558a(caed.f172803c));
            } else if (!caed.f172808h.isEmpty()) {
                bundle.putDoubleArray(str, bqci.m112569a(caed.f172808h));
            } else if (!caed.f172804d.isEmpty()) {
                bundle.putLongArray(str, bqcr.m112597a(caed.f172804d));
            } else if (!caed.f172805e.isEmpty()) {
                bundle.putStringArray(str, (String[]) caed.f172805e.toArray(new String[0]));
            } else if (caed.f172807g.mo73744a() > 0) {
                bundle.putByteArray(str, caed.f172807g.mo73780k());
            } else if (!caed.f172806f.isEmpty()) {
                Thing[] thingArr = new Thing[caed.f172806f.size()];
                for (int i2 = 0; i2 < caed.f172806f.size(); i2++) {
                    thingArr[i2] = m48527a((caef) caed.f172806f.get(i2));
                }
                bundle.putParcelableArray(str, thingArr);
            } else {
                absg.m48192b("%s  unknown type!", "ThingSerializer");
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public static caef m48530b(Thing thing) {
        caeb caeb;
        caee caee = (caee) caef.f172809f.mo74144da();
        String str = thing.f152372d;
        if (str != null) {
            if (caee.f164950c) {
                caee.mo74035c();
                caee.f164950c = false;
            }
            caef caef = (caef) caee.f164949b;
            str.getClass();
            caef.f172811a |= 2;
            caef.f172813c = str;
        }
        String str2 = thing.f152373e;
        if (str2 != null) {
            if (caee.f164950c) {
                caee.mo74035c();
                caee.f164950c = false;
            }
            caef caef2 = (caef) caee.f164949b;
            str2.getClass();
            caef2.f172811a |= 1;
            caef2.f172812b = str2;
        }
        caee.mo74632a(m48528a(thing.f152370b));
        Thing.Metadata metadata = thing.f152371c;
        bxvd da = caeb.f172791g.mo74144da();
        if (metadata != null) {
            boolean z = metadata.f152374a;
            if (z != ((caeb) da.f164949b).f172794b) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                caeb caeb2 = (caeb) da.f164949b;
                caeb2.f172793a |= 1;
                caeb2.f172794b = z;
            }
            int i = metadata.f152375b;
            if (i != ((caeb) da.f164949b).f172795c) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                caeb caeb3 = (caeb) da.f164949b;
                caeb3.f172793a |= 2;
                caeb3.f172795c = i;
            }
            if (!bmxx.m108577a(metadata.f152376c)) {
                String str3 = metadata.f152376c;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                caeb caeb4 = (caeb) da.f164949b;
                str3.getClass();
                caeb4.f172793a |= 4;
                caeb4.f172796d = str3;
            }
            Bundle bundle = metadata.f152377d;
            if (bundle != null) {
                List a = m48528a(bundle);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                caeb caeb5 = (caeb) da.f164949b;
                if (!caeb5.f172797e.mo73666a()) {
                    caeb5.f172797e = bxvk.m124021a(caeb5.f172797e);
                }
                bxsy.m123078a(a, caeb5.f172797e);
            }
            List a2 = m48528a(metadata.f152378e);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caeb caeb6 = (caeb) da.f164949b;
            if (!caeb6.f172798f.mo73666a()) {
                caeb6.f172798f = bxvk.m124021a(caeb6.f172798f);
            }
            bxsy.m123078a(a2, caeb6.f172798f);
            caeb = (caeb) da.mo74062i();
        } else {
            caeb = (caeb) da.mo74062i();
        }
        if (caee.f164950c) {
            caee.mo74035c();
            caee.f164950c = false;
        }
        caef caef3 = (caef) caee.f164949b;
        caeb.getClass();
        caef3.f172815e = caeb;
        caef3.f172811a |= 4;
        return (caef) caee.mo74062i();
    }

    /* renamed from: a */
    public static Thing m48527a(caef caef) {
        Thing.Metadata metadata;
        Bundle a = m48526a(caef.f172814d);
        caeb caeb = caef.f172815e;
        if (caeb == null) {
            caeb = caeb.f172791g;
        }
        if (caeb != null) {
            metadata = new Thing.Metadata(caeb.f172794b, caeb.f172795c, caeb.f172796d, m48526a(caeb.f172797e), m48526a(caeb.f172798f));
        } else {
            metadata = new brhx().mo69540a();
        }
        return new Thing(a, metadata, caef.f172813c, caef.f172812b);
    }

    /* renamed from: a */
    private static List m48528a(Bundle bundle) {
        Parcelable[] parcelableArr;
        List list;
        ArrayList arrayList = new ArrayList();
        for (String str : bundle.keySet()) {
            caec caec = (caec) caed.f172799i.mo74144da();
            if (caec.f164950c) {
                caec.mo74035c();
                caec.f164950c = false;
            }
            caed caed = (caed) caec.f164949b;
            str.getClass();
            caed.f172801a |= 1;
            caed.f172802b = str;
            Object obj = bundle.get(str);
            if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length = zArr.length;
                if (length == 0) {
                    list = Collections.emptyList();
                } else {
                    list = new bqcb(zArr, 0, length);
                }
                if (caec.f164950c) {
                    caec.mo74035c();
                    caec.f164950c = false;
                }
                caed caed2 = (caed) caec.f164949b;
                caed2.mo74627c();
                bxsy.m123078a(list, caed2.f172803c);
            } else if (obj instanceof double[]) {
                List b = bqci.m112570b((double[]) obj);
                if (caec.f164950c) {
                    caec.mo74035c();
                    caec.f164950c = false;
                }
                caed caed3 = (caed) caec.f164949b;
                caed3.mo74630g();
                bxsy.m123078a(b, caed3.f172808h);
            } else if (obj instanceof long[]) {
                List b2 = bqcr.m112598b((long[]) obj);
                if (caec.f164950c) {
                    caec.mo74035c();
                    caec.f164950c = false;
                }
                caed caed4 = (caed) caec.f164949b;
                caed4.mo74628e();
                bxsy.m123078a(b2, caed4.f172804d);
            } else if (obj instanceof String[]) {
                List asList = Arrays.asList((String[]) obj);
                if (caec.f164950c) {
                    caec.mo74035c();
                    caec.f164950c = false;
                }
                caed caed5 = (caed) caec.f164949b;
                caed5.mo74629f();
                bxsy.m123078a(asList, caed5.f172805e);
            } else if (obj instanceof byte[]) {
                bxtx a = bxtx.m123261a((byte[]) obj);
                if (caec.f164950c) {
                    caec.mo74035c();
                    caec.f164950c = false;
                }
                caed caed6 = (caed) caec.f164949b;
                a.getClass();
                caed6.f172801a |= 2;
                caed6.f172807g = a;
            } else if (obj instanceof Parcelable[]) {
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    caec.mo74625a(m48530b((Thing) parcelable));
                }
            } else if (obj != null) {
                String valueOf = String.valueOf(obj.getClass().getSimpleName());
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unsupported type: ") : "Unsupported type: ".concat(valueOf));
            }
            arrayList.add((caed) caec.mo74062i());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static byte[] m48529a(Thing thing) {
        return m48530b(thing).mo73642k();
    }
}
