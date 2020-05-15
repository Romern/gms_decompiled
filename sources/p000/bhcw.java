package p000;

import android.content.Intent;
import android.os.WorkSource;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bhcw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhcw extends bhcv {

    /* renamed from: b */
    private static final Field f118313b = m100654a("mNames");

    /* renamed from: c */
    private static final Field f118314c = m100654a("mUids");

    /* renamed from: d */
    private static final Field f118315d = m100654a("mNum");

    /* renamed from: a */
    public final WorkSource f118316a;

    public bhcw() {
        this.f118316a = new WorkSource();
    }

    /* renamed from: a */
    public static bhcw m100653a(Intent intent, String str) {
        WorkSource workSource = (WorkSource) intent.getParcelableExtra(str);
        if (workSource != null) {
            return new bhcw(workSource);
        }
        return null;
    }

    /* renamed from: b */
    public final WorkSource mo63559b() {
        return this.f118316a;
    }

    /* renamed from: c */
    public final List mo63560c() {
        ArrayList arrayList = null;
        try {
            if (!(f118313b == null || this.f118316a == null)) {
                Object obj = f118313b.get(this.f118316a);
                if (obj instanceof String[]) {
                    String[] strArr = (String[]) obj;
                    int length = strArr.length;
                    ArrayList arrayList2 = new ArrayList(length);
                    int i = 0;
                    while (i < length) {
                        try {
                            String str = strArr[i];
                            if (str != null) {
                                arrayList2.add(str);
                            }
                            i++;
                        } catch (Exception e) {
                        }
                    }
                    arrayList = arrayList2;
                }
            }
        } catch (Exception e2) {
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bhcw) {
            WorkSource workSource = ((bhcw) obj).f118316a;
            WorkSource workSource2 = this.f118316a;
            if (workSource2 != null) {
                return workSource != null && !workSource2.diff(workSource);
            }
            if (workSource == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        WorkSource workSource = this.f118316a;
        if (workSource != null) {
            return workSource.hashCode();
        }
        return 0;
    }

    public final String toString() {
        WorkSource workSource = this.f118316a;
        return workSource != null ? workSource.toString() : "";
    }

    public bhcw(WorkSource workSource) {
        this.f118316a = workSource;
    }

    /* renamed from: a */
    protected static Field m100654a(String str) {
        try {
            Field declaredField = WorkSource.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException e) {
            return null;
        }
    }

    /* renamed from: a */
    public final List mo63003a() {
        ArrayList arrayList = null;
        try {
            if (!(f118314c == null || this.f118316a == null || f118315d == null)) {
                Object obj = f118315d.get(this.f118316a);
                int i = -1;
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
                if (i > 0) {
                    Object obj2 = f118314c.get(this.f118316a);
                    if (obj2 instanceof int[]) {
                        int[] iArr = (int[]) obj2;
                        int min = Math.min(i, iArr.length);
                        ArrayList arrayList2 = new ArrayList(min);
                        int i2 = 0;
                        while (i2 < min) {
                            try {
                                arrayList2.add(Integer.valueOf(iArr[i2]));
                                i2++;
                            } catch (Exception e) {
                            }
                        }
                        arrayList = arrayList2;
                    }
                }
            }
        } catch (Exception e2) {
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* renamed from: a */
    public final void mo63004a(bgmj bgmj) {
        if (bgmj instanceof bhcw) {
            mo63558a((bhcv) ((bhcw) bgmj));
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo63558a(bhcv bhcv) {
        WorkSource workSource = ((bhcw) bhcv).f118316a;
        WorkSource workSource2 = this.f118316a;
        if (workSource2 != null && workSource != null) {
            try {
                workSource2.add(workSource);
            } catch (IllegalArgumentException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("can't add worksource");
                sb.append(valueOf);
                sb.toString();
            }
        }
    }
}
