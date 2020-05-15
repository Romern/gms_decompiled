package p000;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: bsbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsbh {

    /* renamed from: a */
    public Object[] f143937a;

    /* renamed from: b */
    public HashMap f143938b;

    /* renamed from: c */
    public int f143939c;

    /* renamed from: d */
    public int f143940d;

    /* renamed from: e */
    public int f143941e;

    public bsbh() {
        this(128);
    }

    /* renamed from: a */
    public final bsbg mo70165a() {
        return new bsbg(this);
    }

    /* renamed from: b */
    public final int mo70168b() {
        HashMap hashMap = this.f143938b;
        return hashMap != null ? this.f143941e + hashMap.size() : this.f143941e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof bsbh)) {
            bsbh bsbh = (bsbh) obj;
            if (mo70168b() == bsbh.mo70168b()) {
                Object[] objArr = this.f143937a;
                Object[] objArr2 = bsbh.f143937a;
                int min = Math.min(objArr.length, objArr2.length);
                int i = 0;
                while (true) {
                    if (i < min) {
                        Object obj2 = objArr[i];
                        if ((obj2 == null && objArr2[i] != null) || (obj2 != null && !obj2.equals(objArr2[i]))) {
                            break;
                        }
                        i++;
                    } else {
                        int length = objArr.length;
                        int length2 = objArr2.length;
                        if (length > length2) {
                            while (true) {
                                if (min < objArr.length) {
                                    if (objArr[min] != null) {
                                        break;
                                    }
                                    min++;
                                } else {
                                    break;
                                }
                            }
                        } else if (length < length2) {
                            while (true) {
                                if (min < objArr2.length) {
                                    if (objArr2[min] != null) {
                                        break;
                                    }
                                    min++;
                                } else {
                                    break;
                                }
                            }
                        }
                        HashMap hashMap = this.f143938b;
                        if (hashMap == null ? bsbh.f143938b == null : hashMap.equals(bsbh.f143938b)) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.f143937a;
            if (i2 >= objArr.length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj != null) {
                i = (i * 31) + obj.hashCode() + i2;
            }
            i2++;
        }
        HashMap hashMap = this.f143938b;
        return hashMap != null ? i + hashMap.hashCode() : i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntMap{lower:");
        int i = 0;
        while (true) {
            Object[] objArr = this.f143937a;
            if (i < objArr.length) {
                if (objArr[i] != null) {
                    sb.append(i);
                    sb.append("=>");
                    sb.append(this.f143937a[i]);
                    sb.append(", ");
                }
                i++;
            } else {
                String valueOf = String.valueOf(this.f143938b);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 10);
                sb2.append(", higher:");
                sb2.append(valueOf);
                sb2.append("}");
                sb.append(sb2.toString());
                return sb.toString();
            }
        }
    }

    public bsbh(int i) {
        int i2;
        if (i > 0) {
            i2 = Math.min(i, 128);
        } else {
            i2 = 1;
        }
        this.f143937a = new Object[i2];
        this.f143941e = 0;
        this.f143940d = Integer.MIN_VALUE;
        this.f143939c = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public final Object mo70166a(int i) {
        HashMap hashMap;
        if (i <= this.f143939c && i >= 0) {
            return this.f143937a[i];
        }
        if (i > this.f143940d || (hashMap = this.f143938b) == null) {
            return null;
        }
        return hashMap.get(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo70169b(int i) {
        if (i >= 0) {
            Object[] objArr = this.f143937a;
            if (i < objArr.length) {
                if (objArr[i] != null) {
                    this.f143941e--;
                }
                objArr[i] = null;
                return;
            }
        }
        HashMap hashMap = this.f143938b;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public final void mo70167a(int i, Object obj) {
        if (obj != null) {
            if (i > this.f143940d) {
                this.f143940d = i;
            }
            if (i < 0 || i >= 128) {
                if (this.f143938b == null) {
                    this.f143938b = new HashMap();
                }
                this.f143938b.put(Integer.valueOf(i), obj);
                return;
            }
            Object[] objArr = this.f143937a;
            int length = objArr.length;
            if (i < length) {
                if (i > this.f143939c) {
                    this.f143939c = i;
                }
                if (objArr[i] == null) {
                    this.f143941e++;
                }
                objArr[i] = obj;
                return;
            }
            do {
                length += length;
            } while (length <= i);
            Object[] objArr2 = new Object[Math.min(Math.max(length, 16), 128)];
            objArr2[i] = obj;
            this.f143939c = i;
            this.f143941e++;
            Object[] objArr3 = this.f143937a;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            Arrays.fill(this.f143937a, (Object) null);
            this.f143937a = objArr2;
            return;
        }
        mo70169b(i);
    }
}
