package p000;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.Set;

/* renamed from: aaeb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaeb {
    /* renamed from: a */
    public static int m21131a(Bundle bundle) {
        int size;
        if (bundle == null || (size = bundle.size()) == 0) {
            return 0;
        }
        String[] strArr = (String[]) bundle.keySet().toArray(new String[size]);
        Arrays.sort(strArr);
        int i = 1;
        for (String str : strArr) {
            i *= 31;
            Object obj = bundle.get(str);
            if (obj != null) {
                if (obj instanceof Bundle) {
                    i += m21131a((Bundle) obj);
                } else if (obj instanceof byte[]) {
                    i += Arrays.hashCode((byte[]) obj);
                } else if (obj instanceof char[]) {
                    i += Arrays.hashCode((char[]) obj);
                } else if (obj instanceof short[]) {
                    i += Arrays.hashCode((short[]) obj);
                } else if (obj instanceof float[]) {
                    i += Arrays.hashCode((float[]) obj);
                } else if (obj instanceof CharSequence[]) {
                    i += Arrays.hashCode((CharSequence[]) obj);
                } else if (obj instanceof Object[]) {
                    Object[] objArr = (Object[]) obj;
                    int i2 = 1;
                    for (Object obj2 : objArr) {
                        i2 *= 31;
                        if (obj2 instanceof Bundle) {
                            i2 += m21131a((Bundle) obj2);
                        } else if (obj2 != null) {
                            i2 += obj2.hashCode();
                        }
                    }
                    i += i2;
                } else if (obj instanceof SparseArray) {
                    SparseArray sparseArray = (SparseArray) obj;
                    int size2 = sparseArray.size();
                    int i3 = 1;
                    for (int i4 = 0; i4 < size2; i4++) {
                        i3 = ((i3 * 31) + sparseArray.keyAt(i4)) * 31;
                        Object valueAt = sparseArray.valueAt(i4);
                        if (valueAt instanceof Bundle) {
                            i3 += m21131a((Bundle) valueAt);
                        } else if (valueAt != null) {
                            i3 += valueAt.hashCode();
                        }
                    }
                    i += i3;
                } else {
                    i += obj.hashCode();
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public static boolean m21132a(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (!(bundle == null || bundle2 == null || bundle.size() != bundle2.size())) {
            Set<String> keySet = bundle.keySet();
            if (keySet.equals(bundle2.keySet())) {
                for (String str : keySet) {
                    Object obj = bundle.get(str);
                    Object obj2 = bundle2.get(str);
                    if (obj != null) {
                        if (obj instanceof Bundle) {
                            if (!(obj2 instanceof Bundle) || !m21132a((Bundle) obj, (Bundle) obj2)) {
                                return false;
                            }
                        } else if (obj instanceof byte[]) {
                            if (!(obj2 instanceof byte[]) || !Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                                return false;
                            }
                        } else if (obj instanceof char[]) {
                            if (!(obj2 instanceof char[]) || !Arrays.equals((char[]) obj, (char[]) obj2)) {
                                return false;
                            }
                        } else if (obj instanceof short[]) {
                            if (!(obj2 instanceof short[]) || !Arrays.equals((short[]) obj, (short[]) obj2)) {
                                return false;
                            }
                        } else if (obj instanceof float[]) {
                            if (!(obj2 instanceof float[]) || !Arrays.equals((float[]) obj, (float[]) obj2)) {
                                return false;
                            }
                        } else if (obj instanceof CharSequence[]) {
                            if (!(obj2 instanceof CharSequence[]) || !Arrays.equals((CharSequence[]) obj, (CharSequence[]) obj2)) {
                                return false;
                            }
                        } else if (obj instanceof Object[]) {
                            if (obj2 instanceof Object[]) {
                                Parcelable[] parcelableArr = (Parcelable[]) obj;
                                Parcelable[] parcelableArr2 = (Parcelable[]) obj2;
                                if (parcelableArr == parcelableArr2) {
                                    continue;
                                } else {
                                    int length = parcelableArr.length;
                                    if (parcelableArr2.length == length) {
                                        for (int i = 0; i < length; i++) {
                                            Parcelable parcelable = parcelableArr[i];
                                            Parcelable parcelable2 = parcelableArr2[i];
                                            if (parcelable != null) {
                                                if (parcelable instanceof Bundle) {
                                                    if ((parcelable2 instanceof Bundle) && m21132a((Bundle) parcelable, (Bundle) parcelable2)) {
                                                    }
                                                } else if (!parcelable.equals(parcelable2)) {
                                                }
                                            } else if (parcelable2 != null) {
                                            }
                                        }
                                        continue;
                                    }
                                }
                            }
                            return false;
                        } else if (obj instanceof SparseArray) {
                            if (obj2 instanceof SparseArray) {
                                SparseArray sparseArray = (SparseArray) obj;
                                SparseArray sparseArray2 = (SparseArray) obj2;
                                if (sparseArray == sparseArray2) {
                                    continue;
                                } else {
                                    int size = sparseArray.size();
                                    if (sparseArray2.size() == size) {
                                        int i2 = 0;
                                        while (i2 < size) {
                                            if (sparseArray.keyAt(i2) == sparseArray2.keyAt(i2)) {
                                                Object valueAt = sparseArray.valueAt(i2);
                                                Object valueAt2 = sparseArray2.valueAt(i2);
                                                if (valueAt != null) {
                                                    if (valueAt instanceof Bundle) {
                                                        if ((valueAt2 instanceof Bundle) && m21132a((Bundle) valueAt, (Bundle) valueAt2)) {
                                                        }
                                                    } else if (!valueAt.equals(valueAt2)) {
                                                    }
                                                } else if (valueAt2 != null) {
                                                }
                                                i2++;
                                            }
                                        }
                                        continue;
                                    }
                                }
                            }
                            return false;
                        } else if (!obj.equals(obj2)) {
                            return false;
                        }
                    } else if (obj2 != null) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
