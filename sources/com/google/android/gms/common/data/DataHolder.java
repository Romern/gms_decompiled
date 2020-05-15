package com.google.android.gms.common.data;

import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator CREATOR = new rtw();

    /* renamed from: k */
    private static final rtu f30160k = new rtt(new String[0]);

    /* renamed from: a */
    final int f30161a;

    /* renamed from: b */
    public final String[] f30162b;

    /* renamed from: c */
    public Bundle f30163c;

    /* renamed from: d */
    public final CursorWindow[] f30164d;

    /* renamed from: e */
    public final int f30165e;

    /* renamed from: f */
    public final Bundle f30166f;

    /* renamed from: g */
    int[] f30167g;

    /* renamed from: h */
    public int f30168h;

    /* renamed from: i */
    boolean f30169i;

    /* renamed from: j */
    public boolean f30170j;

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f30169i = false;
        this.f30170j = true;
        this.f30161a = i;
        this.f30162b = strArr;
        this.f30164d = cursorWindowArr;
        this.f30165e = i2;
        this.f30166f = bundle;
    }

    /* renamed from: a */
    public static DataHolder m22536a(int i, Bundle bundle) {
        return new DataHolder(f30160k, i, bundle);
    }

    /* renamed from: b */
    public static DataHolder m22539b(int i) {
        return m22536a(i, (Bundle) null);
    }

    /* renamed from: c */
    public final String mo17769c(String str, int i, int i2) {
        mo17765a(str, i);
        return this.f30164d[i2].getString(i, this.f30163c.getInt(str));
    }

    public final void close() {
        synchronized (this) {
            if (!this.f30169i) {
                this.f30169i = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f30164d;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    /* renamed from: d */
    public final boolean mo17771d(String str, int i, int i2) {
        mo17765a(str, i);
        return Long.valueOf(this.f30164d[i2].getLong(i, this.f30163c.getInt(str))).longValue() == 1;
    }

    /* renamed from: e */
    public final byte[] mo17772e(String str, int i, int i2) {
        mo17765a(str, i);
        return this.f30164d[i2].getBlob(i, this.f30163c.getInt(str));
    }

    /* renamed from: f */
    public final boolean mo17773f(String str, int i, int i2) {
        mo17765a(str, i);
        return this.f30164d[i2].isNull(i, this.f30163c.getInt(str));
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            if (this.f30170j && this.f30164d.length > 0 && !mo17768b()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    public DataHolder(Cursor cursor, Bundle bundle) {
        this(r7, (CursorWindow[]) r1.toArray(new CursorWindow[r1.size()]), 0, bundle);
        int i;
        sjy sjy = new sjy(cursor);
        String[] columnNames = sjy.getColumnNames();
        ArrayList arrayList = new ArrayList();
        try {
            int count = sjy.getCount();
            CursorWindow window = sjy.getWindow();
            if (window == null) {
                i = 0;
            } else if (window.getStartPosition() == 0) {
                window.acquireReference();
                sjy.mo25658a();
                arrayList.add(window);
                i = window.getNumRows();
            } else {
                i = 0;
            }
            while (true) {
                if (i < count) {
                    if (sjy.moveToPosition(i)) {
                        CursorWindow window2 = sjy.getWindow();
                        if (window2 == null) {
                            window2 = new CursorWindow(false);
                            window2.setStartPosition(i);
                            sjy.fillWindow(i, window2);
                        } else {
                            window2.acquireReference();
                            sjy.mo25658a();
                        }
                        if (window2.getNumRows() == 0) {
                            break;
                        }
                        arrayList.add(window2);
                        i = window2.getStartPosition() + window2.getNumRows();
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            sjy.close();
        } catch (Throwable th) {
            sjy.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static rtu m22537a(String[] strArr) {
        return new rtu(strArr);
    }

    /* renamed from: b */
    public final int mo17767b(String str, int i, int i2) {
        mo17765a(str, i);
        return this.f30164d[i2].getInt(i, this.f30163c.getInt(str));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String[], boolean):void
     arg types: [android.os.Parcel, int, java.lang.String[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35058a(parcel, 1, this.f30162b, false);
        see.m35057a(parcel, 2, this.f30164d, i);
        see.m35063b(parcel, 3, this.f30165e);
        see.m35037a(parcel, 4, this.f30166f, false);
        see.m35063b(parcel, 1000, this.f30161a);
        see.m35062b(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }

    /* renamed from: b */
    public final boolean mo17768b() {
        boolean z;
        synchronized (this) {
            z = this.f30169i;
        }
        return z;
    }

    /* renamed from: a */
    public static CursorWindow[] m22538a(rtu rtu) {
        if (rtu.f43677a.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList arrayList = rtu.f43678b;
        int size = arrayList.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cursorWindow);
        cursorWindow.setNumColumns(rtu.f43677a.length);
        int i = 0;
        boolean z = false;
        while (i < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    StringBuilder sb = new StringBuilder(72);
                    sb.append("Allocating additional cursor window for large data set (row ");
                    sb.append(i);
                    sb.append(")");
                    sb.toString();
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i);
                    cursorWindow.setNumColumns(rtu.f43677a.length);
                    arrayList2.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList2.remove(cursorWindow);
                        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                    }
                }
                Map map = (Map) arrayList.get(i);
                int i2 = 0;
                boolean z2 = true;
                while (true) {
                    String[] strArr = rtu.f43677a;
                    if (i2 < strArr.length) {
                        if (!z2) {
                            break;
                        }
                        String str = strArr[i2];
                        Object obj = map.get(str);
                        if (obj == null) {
                            z2 = cursorWindow.putNull(i, i2);
                        } else if (obj instanceof String) {
                            z2 = cursorWindow.putString((String) obj, i, i2);
                        } else if (obj instanceof Long) {
                            z2 = cursorWindow.putLong(((Long) obj).longValue(), i, i2);
                        } else if (obj instanceof Integer) {
                            z2 = cursorWindow.putLong((long) ((Integer) obj).intValue(), i, i2);
                        } else if (obj instanceof Boolean) {
                            z2 = cursorWindow.putLong(!((Boolean) obj).booleanValue() ? 0 : 1, i, i2);
                        } else if (obj instanceof byte[]) {
                            z2 = cursorWindow.putBlob((byte[]) obj, i, i2);
                        } else if (obj instanceof Double) {
                            z2 = cursorWindow.putDouble(((Double) obj).doubleValue(), i, i2);
                        } else if (obj instanceof Float) {
                            z2 = cursorWindow.putDouble((double) ((Float) obj).floatValue(), i, i2);
                        } else {
                            String valueOf = String.valueOf(obj);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(valueOf).length());
                            sb2.append("Unsupported object for column ");
                            sb2.append(str);
                            sb2.append(": ");
                            sb2.append(valueOf);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        i2++;
                    } else if (z2) {
                        z = false;
                    }
                }
                if (!z) {
                    StringBuilder sb3 = new StringBuilder(74);
                    sb3.append("Couldn't populate window data for row ");
                    sb3.append(i);
                    sb3.append(" - allocating new window.");
                    sb3.toString();
                    cursorWindow.freeLastRow();
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i);
                    cursorWindow.setNumColumns(rtu.f43677a.length);
                    arrayList2.add(cursorWindow);
                    i--;
                    z = true;
                    i++;
                } else {
                    throw new rtv("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                }
            } catch (RuntimeException e) {
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((CursorWindow) arrayList2.get(i3)).close();
                }
                throw e;
            }
        }
        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
    }

    public DataHolder(rtu rtu, int i, Bundle bundle) {
        this(rtu.f43677a, m22538a(rtu), i, bundle);
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i, Bundle bundle) {
        this.f30169i = false;
        this.f30170j = true;
        this.f30161a = 1;
        this.f30162b = (String[]) sdo.m34959a(strArr);
        this.f30164d = (CursorWindow[]) sdo.m34959a(cursorWindowArr);
        this.f30165e = i;
        this.f30166f = bundle;
        mo17764a();
    }

    /* renamed from: a */
    public final int mo17762a(int i) {
        boolean z;
        int length;
        int i2 = 0;
        if (i < 0 || i >= this.f30168h) {
            z = false;
        } else {
            z = true;
        }
        sdo.m34970a(z);
        while (true) {
            int[] iArr = this.f30167g;
            length = iArr.length;
            if (i2 < length) {
                if (i < iArr[i2]) {
                    i2--;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return i2 == length ? i2 - 1 : i2;
    }

    /* renamed from: a */
    public final long mo17763a(String str, int i, int i2) {
        mo17765a(str, i);
        return this.f30164d[i2].getLong(i, this.f30163c.getInt(str));
    }

    /* renamed from: a */
    public final void mo17764a() {
        this.f30163c = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.f30162b;
            if (i2 >= strArr.length) {
                break;
            }
            this.f30163c.putInt(strArr[i2], i2);
            i2++;
        }
        this.f30167g = new int[this.f30164d.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f30164d;
            if (i < cursorWindowArr.length) {
                this.f30167g[i] = i3;
                i3 += this.f30164d[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                this.f30168h = i3;
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo17765a(String str, int i) {
        Bundle bundle = this.f30163c;
        if (bundle == null || !bundle.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("No such column: ") : "No such column: ".concat(valueOf));
        } else if (mo17768b()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i < 0 || i >= this.f30168h) {
            throw new CursorIndexOutOfBoundsException(i, this.f30168h);
        }
    }

    /* renamed from: a */
    public final boolean mo17766a(String str) {
        return this.f30163c.containsKey(str);
    }
}
