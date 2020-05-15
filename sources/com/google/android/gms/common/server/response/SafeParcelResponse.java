package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new sjf();

    /* renamed from: a */
    public final int f30333a;

    /* renamed from: b */
    private final Parcel f30334b;

    /* renamed from: c */
    private final int f30335c;

    /* renamed from: d */
    private final FieldMappingDictionary f30336d;

    /* renamed from: e */
    private final String f30337e;

    /* renamed from: f */
    private int f30338f;

    /* renamed from: g */
    private int f30339g;

    public SafeParcelResponse(int i, Parcel parcel, FieldMappingDictionary fieldMappingDictionary) {
        this.f30333a = i;
        sdo.m34959a(parcel);
        this.f30334b = parcel;
        this.f30335c = 2;
        this.f30336d = fieldMappingDictionary;
        this.f30337e = fieldMappingDictionary != null ? fieldMappingDictionary.f30326c : null;
        this.f30338f = 2;
    }

    /* renamed from: a */
    public static FieldMappingDictionary m22678a(Class cls) {
        try {
            sio sio = (sio) cls.newInstance();
            FieldMappingDictionary fieldMappingDictionary = new FieldMappingDictionary(sio.getClass());
            m22679a(fieldMappingDictionary, sio);
            Iterator it = fieldMappingDictionary.f30325b.keySet().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Map map = (Map) fieldMappingDictionary.f30325b.get(str);
                HashMap hashMap = new HashMap();
                for (String str2 : map.keySet()) {
                    FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) map.get(str2);
                    hashMap.put(str2, new FastJsonResponse$Field(fastJsonResponse$Field.f30313a, fastJsonResponse$Field.f30314b, fastJsonResponse$Field.f30315c, fastJsonResponse$Field.f30316d, fastJsonResponse$Field.f30317e, fastJsonResponse$Field.f30318f, fastJsonResponse$Field.f30319g, fastJsonResponse$Field.f30321i, fastJsonResponse$Field.mo17858b()));
                    it = it;
                    map = map;
                }
                fieldMappingDictionary.f30325b.put(str, hashMap);
                it = it;
            }
            fieldMappingDictionary.mo17867a();
            return fieldMappingDictionary;
        } catch (InstantiationException e) {
            String valueOf = String.valueOf(cls.getCanonicalName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Could not instantiate an object of type ") : "Could not instantiate an object of type ".concat(valueOf), e);
        } catch (IllegalAccessException e2) {
            String valueOf2 = String.valueOf(cls.getCanonicalName());
            throw new IllegalStateException(valueOf2.length() == 0 ? new String("Could not access object of type ") : "Could not access object of type ".concat(valueOf2), e2);
        }
    }

    /* renamed from: c */
    private final void m22683c(FastJsonResponse$Field fastJsonResponse$Field) {
        if (fastJsonResponse$Field.f30319g != -1) {
            Parcel parcel = this.f30334b;
            if (parcel != null) {
                int i = this.f30338f;
                if (i == 0) {
                    this.f30339g = see.m35030a(parcel);
                    this.f30338f = 1;
                } else if (i != 1) {
                    throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
                }
            } else {
                throw new IllegalStateException("Internal Parcel object is null.");
            }
        } else {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
    }

    /* renamed from: b */
    public final Parcel mo17878b() {
        int i = this.f30338f;
        if (i != 0) {
            if (i == 1) {
                see.m35062b(this.f30334b, this.f30339g);
            }
            return this.f30334b;
        }
        int a = see.m35030a(this.f30334b);
        this.f30339g = a;
        see.m35062b(this.f30334b, a);
        this.f30338f = 2;
        return this.f30334b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo17879d(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        m22683c(fastJsonResponse$Field);
        int size = arrayList.size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i = 0; i < size; i++) {
            bigIntegerArr[i] = (BigInteger) arrayList.get(i);
        }
        Parcel parcel = this.f30334b;
        int a = see.m35031a(parcel, fastJsonResponse$Field.f30319g);
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(bigIntegerArr[i2].toByteArray());
        }
        see.m35062b(parcel, a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, long[], boolean):void
     arg types: [android.os.Parcel, int, long[], int]
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
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo17880e(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        m22683c(fastJsonResponse$Field);
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        see.m35056a(this.f30334b, fastJsonResponse$Field.f30319g, jArr, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, float[], boolean):void
     arg types: [android.os.Parcel, int, float[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo17881f(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        m22683c(fastJsonResponse$Field);
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = ((Float) arrayList.get(i)).floatValue();
        }
        see.m35054a(this.f30334b, fastJsonResponse$Field.f30319g, fArr, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, double[], boolean):void
     arg types: [android.os.Parcel, int, double[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo17882g(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        m22683c(fastJsonResponse$Field);
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        see.m35053a(this.f30334b, fastJsonResponse$Field.f30319g, dArr, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo17883h(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        m22683c(fastJsonResponse$Field);
        int size = arrayList.size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i = 0; i < size; i++) {
            bigDecimalArr[i] = (BigDecimal) arrayList.get(i);
        }
        Parcel parcel = this.f30334b;
        int a = see.m35031a(parcel, fastJsonResponse$Field.f30319g);
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(bigDecimalArr[i2].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i2].scale());
        }
        see.m35062b(parcel, a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, boolean[], boolean):void
     arg types: [android.os.Parcel, int, boolean[], int]
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
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo17884i(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        m22683c(fastJsonResponse$Field);
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = ((Boolean) arrayList.get(i)).booleanValue();
        }
        see.m35059a(this.f30334b, fastJsonResponse$Field.f30319g, zArr, true);
    }

    public final String toString() {
        sdo.checkIfNull(this.f30336d, "Cannot convert to JSON on client side.");
        Parcel b = mo17878b();
        b.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        m22682a(sb, this.f30336d.mo17866a(this.f30337e), b);
        return sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
     arg types: [android.os.Parcel, int, android.os.Parcel, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
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
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        FieldMappingDictionary fieldMappingDictionary;
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f30333a);
        see.m35039a(parcel, 2, mo17878b(), false);
        int i2 = this.f30335c;
        if (i2 != 0) {
            fieldMappingDictionary = i2 != 1 ? this.f30336d : this.f30336d;
        } else {
            fieldMappingDictionary = null;
        }
        see.m35040a(parcel, 3, fieldMappingDictionary, i, false);
        see.m35062b(parcel, a);
    }

    public SafeParcelResponse(FieldMappingDictionary fieldMappingDictionary, String str) {
        this.f30333a = 1;
        this.f30334b = Parcel.obtain();
        this.f30335c = 0;
        sdo.m34959a(fieldMappingDictionary);
        this.f30336d = fieldMappingDictionary;
        sdo.m34959a((Object) str);
        this.f30337e = str;
        this.f30338f = 0;
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
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo7387b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        m22683c(fastJsonResponse$Field);
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = (String) arrayList.get(i);
        }
        see.m35058a(this.f30334b, fastJsonResponse$Field.f30319g, strArr, true);
    }

    /* renamed from: c */
    public final Object mo17863c(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, int[], boolean):void
     arg types: [android.os.Parcel, int, int[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo17834c(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        m22683c(fastJsonResponse$Field);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        see.m35055a(this.f30334b, fastJsonResponse$Field.f30319g, iArr, true);
    }

    /* renamed from: d */
    public final boolean mo17864d(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: a */
    private static void m22679a(FieldMappingDictionary fieldMappingDictionary, sio sio) {
        Class<?> cls = sio.getClass();
        if (!fieldMappingDictionary.f30325b.containsKey(cls.getCanonicalName())) {
            Map a = sio.mo7367a();
            fieldMappingDictionary.f30325b.put(cls.getCanonicalName(), a);
            for (String str : a.keySet()) {
                FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) a.get(str);
                Class cls2 = fastJsonResponse$Field.f30320h;
                if (cls2 != null) {
                    try {
                        m22679a(fieldMappingDictionary, (sio) cls2.newInstance());
                    } catch (InstantiationException e) {
                        String valueOf = String.valueOf(fastJsonResponse$Field.f30320h.getCanonicalName());
                        throw new IllegalStateException(valueOf.length() == 0 ? new String("Could not instantiate an object of type ") : "Could not instantiate an object of type ".concat(valueOf), e);
                    } catch (IllegalAccessException e2) {
                        String valueOf2 = String.valueOf(fastJsonResponse$Field.f30320h.getCanonicalName());
                        throw new IllegalStateException(valueOf2.length() == 0 ? new String("Could not access object of type ") : "Could not access object of type ".concat(valueOf2), e2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static final void m22680a(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(ssd.m36199a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(sqd.m35968b((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(sqd.m35970c((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                ssf.m36208a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    private static final void m22681a(StringBuilder sb, FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        if (fastJsonResponse$Field.f30315c) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                m22680a(sb, fastJsonResponse$Field.f30314b, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        m22680a(sb, fastJsonResponse$Field.f30314b, obj);
    }

    /* renamed from: a */
    private final void m22682a(StringBuilder sb, Map map, Parcel parcel) {
        StringBuilder sb2 = sb;
        Parcel parcel2 = parcel;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse$Field) entry.getValue()).f30319g, entry);
        }
        sb2.append('{');
        int b = sed.m35001b(parcel);
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get(sed.m34995a(readInt));
            if (entry2 != null) {
                if (z) {
                    sb2.append(",");
                }
                FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) entry2.getValue();
                sb2.append("\"");
                sb2.append((String) entry2.getKey());
                sb2.append("\":");
                if (fastJsonResponse$Field.f30323k != null) {
                    int i = fastJsonResponse$Field.f30316d;
                    switch (i) {
                        case 0:
                            m22681a(sb2, fastJsonResponse$Field, sio.m35370b(fastJsonResponse$Field, Integer.valueOf(sed.m35010g(parcel2, readInt))));
                            z = true;
                            continue;
                        case 1:
                            m22681a(sb2, fastJsonResponse$Field, sio.m35370b(fastJsonResponse$Field, sed.m35014k(parcel2, readInt)));
                            z = true;
                            continue;
                        case 2:
                            m22681a(sb2, fastJsonResponse$Field, sio.m35370b(fastJsonResponse$Field, Long.valueOf(sed.m35012i(parcel2, readInt))));
                            z = true;
                            continue;
                        case 3:
                            m22681a(sb2, fastJsonResponse$Field, sio.m35370b(fastJsonResponse$Field, Float.valueOf(sed.m35015l(parcel2, readInt))));
                            z = true;
                            continue;
                        case 4:
                            m22681a(sb2, fastJsonResponse$Field, sio.m35370b(fastJsonResponse$Field, Double.valueOf(sed.m35017n(parcel2, readInt))));
                            z = true;
                            continue;
                        case 5:
                            m22681a(sb2, fastJsonResponse$Field, sio.m35370b(fastJsonResponse$Field, sed.m35019p(parcel2, readInt)));
                            z = true;
                            continue;
                        case 6:
                            m22681a(sb2, fastJsonResponse$Field, sio.m35370b(fastJsonResponse$Field, Boolean.valueOf(sed.m35006c(parcel2, readInt))));
                            z = true;
                            continue;
                        case 7:
                            m22681a(sb2, fastJsonResponse$Field, sio.m35370b(fastJsonResponse$Field, sed.m35020q(parcel2, readInt)));
                            z = true;
                            continue;
                        case 8:
                        case 9:
                            m22681a(sb2, fastJsonResponse$Field, sio.m35370b(fastJsonResponse$Field, sed.m35023t(parcel2, readInt)));
                            z = true;
                            continue;
                        case 10:
                            Bundle s = sed.m35022s(parcel2, readInt);
                            HashMap hashMap = new HashMap();
                            for (String str : s.keySet()) {
                                hashMap.put(str, s.getString(str));
                            }
                            m22681a(sb2, fastJsonResponse$Field, sio.m35370b(fastJsonResponse$Field, hashMap));
                            z = true;
                            continue;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            StringBuilder sb3 = new StringBuilder(36);
                            sb3.append("Unknown field out type = ");
                            sb3.append(i);
                            throw new IllegalArgumentException(sb3.toString());
                    }
                } else if (fastJsonResponse$Field.f30317e) {
                    sb2.append("[");
                    BigInteger[] bigIntegerArr = null;
                    Parcel[] parcelArr = null;
                    BigDecimal[] bigDecimalArr = null;
                    switch (fastJsonResponse$Field.f30316d) {
                        case 0:
                            int[] w = sed.m35026w(parcel2, readInt);
                            int length = w.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(Integer.toString(w[i2]));
                            }
                            break;
                        case 1:
                            int a = sed.m34997a(parcel2, readInt);
                            int dataPosition = parcel.dataPosition();
                            if (a != 0) {
                                int readInt2 = parcel.readInt();
                                bigIntegerArr = new BigInteger[readInt2];
                                for (int i3 = 0; i3 < readInt2; i3++) {
                                    bigIntegerArr[i3] = new BigInteger(parcel.createByteArray());
                                }
                                parcel2.setDataPosition(dataPosition + a);
                            }
                            sqc.m35956a(sb2, bigIntegerArr);
                            break;
                        case 2:
                            long[] x = sed.m35027x(parcel2, readInt);
                            int length2 = x.length;
                            for (int i4 = 0; i4 < length2; i4++) {
                                if (i4 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(Long.toString(x[i4]));
                            }
                            break;
                        case 3:
                            float[] y = sed.m35028y(parcel2, readInt);
                            int length3 = y.length;
                            for (int i5 = 0; i5 < length3; i5++) {
                                if (i5 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(Float.toString(y[i5]));
                            }
                            break;
                        case 4:
                            double[] z2 = sed.m35029z(parcel2, readInt);
                            int length4 = z2.length;
                            for (int i6 = 0; i6 < length4; i6++) {
                                if (i6 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(Double.toString(z2[i6]));
                            }
                            break;
                        case 5:
                            int a2 = sed.m34997a(parcel2, readInt);
                            int dataPosition2 = parcel.dataPosition();
                            if (a2 != 0) {
                                int readInt3 = parcel.readInt();
                                bigDecimalArr = new BigDecimal[readInt3];
                                for (int i7 = 0; i7 < readInt3; i7++) {
                                    byte[] createByteArray = parcel.createByteArray();
                                    bigDecimalArr[i7] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
                                }
                                parcel2.setDataPosition(dataPosition2 + a2);
                            }
                            sqc.m35956a(sb2, bigDecimalArr);
                            break;
                        case 6:
                            boolean[] v = sed.m35025v(parcel2, readInt);
                            int length5 = v.length;
                            for (int i8 = 0; i8 < length5; i8++) {
                                if (i8 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(Boolean.toString(v[i8]));
                            }
                            break;
                        case 7:
                            String[] A = sed.m34989A(parcel2, readInt);
                            int length6 = A.length;
                            for (int i9 = 0; i9 < length6; i9++) {
                                if (i9 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append("\"");
                                sb2.append(A[i9]);
                                sb2.append("\"");
                            }
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            int a3 = sed.m34997a(parcel2, readInt);
                            int dataPosition3 = parcel.dataPosition();
                            if (a3 != 0) {
                                int readInt4 = parcel.readInt();
                                Parcel[] parcelArr2 = new Parcel[readInt4];
                                for (int i10 = 0; i10 < readInt4; i10++) {
                                    int readInt5 = parcel.readInt();
                                    if (readInt5 != 0) {
                                        int dataPosition4 = parcel.dataPosition();
                                        Parcel obtain = Parcel.obtain();
                                        obtain.appendFrom(parcel2, dataPosition4, readInt5);
                                        parcelArr2[i10] = obtain;
                                        parcel2.setDataPosition(dataPosition4 + readInt5);
                                    } else {
                                        parcelArr2[i10] = null;
                                    }
                                }
                                parcel2.setDataPosition(dataPosition3 + a3);
                                parcelArr = parcelArr2;
                            }
                            int length7 = parcelArr.length;
                            for (int i11 = 0; i11 < length7; i11++) {
                                if (i11 > 0) {
                                    sb2.append(",");
                                }
                                parcelArr[i11].setDataPosition(0);
                                m22682a(sb2, fastJsonResponse$Field.mo17860d(), parcelArr[i11]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb2.append("]");
                    z = true;
                } else {
                    switch (fastJsonResponse$Field.f30316d) {
                        case 0:
                            sb2.append(sed.m35010g(parcel2, readInt));
                            z = true;
                            continue;
                        case 1:
                            sb2.append(sed.m35014k(parcel2, readInt));
                            z = true;
                            continue;
                        case 2:
                            sb2.append(sed.m35012i(parcel2, readInt));
                            z = true;
                            continue;
                        case 3:
                            sb2.append(sed.m35015l(parcel2, readInt));
                            z = true;
                            continue;
                        case 4:
                            sb2.append(sed.m35017n(parcel2, readInt));
                            z = true;
                            continue;
                        case 5:
                            sb2.append(sed.m35019p(parcel2, readInt));
                            z = true;
                            continue;
                        case 6:
                            sb2.append(sed.m35006c(parcel2, readInt));
                            z = true;
                            continue;
                        case 7:
                            String q = sed.m35020q(parcel2, readInt);
                            sb2.append("\"");
                            sb2.append(ssd.m36199a(q));
                            sb2.append("\"");
                            z = true;
                            continue;
                        case 8:
                            byte[] t = sed.m35023t(parcel2, readInt);
                            sb2.append("\"");
                            sb2.append(sqd.m35968b(t));
                            sb2.append("\"");
                            z = true;
                            continue;
                        case 9:
                            byte[] t2 = sed.m35023t(parcel2, readInt);
                            sb2.append("\"");
                            sb2.append(sqd.m35970c(t2));
                            sb2.append("\"");
                            z = true;
                            continue;
                        case 10:
                            Bundle s2 = sed.m35022s(parcel2, readInt);
                            Set<String> keySet = s2.keySet();
                            keySet.size();
                            sb2.append("{");
                            boolean z3 = true;
                            for (String str2 : keySet) {
                                if (!z3) {
                                    sb2.append(",");
                                }
                                sb2.append("\"");
                                sb2.append(str2);
                                sb2.append("\":\"");
                                sb2.append(ssd.m36199a(s2.getString(str2)));
                                sb2.append("\"");
                                z3 = false;
                            }
                            sb2.append("}");
                            z = true;
                            continue;
                        case 11:
                            Parcel E = sed.m34993E(parcel2, readInt);
                            E.setDataPosition(0);
                            m22682a(sb2, fastJsonResponse$Field.mo17860d(), E);
                            z = true;
                            continue;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
            }
        }
        if (parcel.dataPosition() == b) {
            sb2.append('}');
            return;
        }
        StringBuilder sb4 = new StringBuilder(37);
        sb4.append("Overread allowed size end=");
        sb4.append(b);
        throw new sec(sb4.toString(), parcel2);
    }

    /* renamed from: a */
    public final SafeParcelable mo17872a(Parcelable.Creator creator) {
        Parcel b = mo17878b();
        b.setDataPosition(0);
        return (SafeParcelable) creator.createFromParcel(b);
    }

    /* renamed from: a */
    public final Map mo7367a() {
        FieldMappingDictionary fieldMappingDictionary = this.f30336d;
        if (fieldMappingDictionary != null) {
            return fieldMappingDictionary.mo17866a(this.f30337e);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17873a(FastJsonResponse$Field fastJsonResponse$Field, String str, double d) {
        m22683c(fastJsonResponse$Field);
        see.m35033a(this.f30334b, fastJsonResponse$Field.f30319g, d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17874a(FastJsonResponse$Field fastJsonResponse$Field, String str, float f) {
        m22683c(fastJsonResponse$Field);
        see.m35034a(this.f30334b, fastJsonResponse$Field.f30319g, f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        m22683c(fastJsonResponse$Field);
        see.m35063b(this.f30334b, fastJsonResponse$Field.f30319g, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        m22683c(fastJsonResponse$Field);
        see.m35036a(this.f30334b, fastJsonResponse$Field.f30319g, j);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
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
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        m22683c(fastJsonResponse$Field);
        see.m35046a(this.f30334b, fastJsonResponse$Field.f30319g, str2, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
     arg types: [android.os.Parcel, int, java.math.BigDecimal, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17875a(FastJsonResponse$Field fastJsonResponse$Field, String str, BigDecimal bigDecimal) {
        m22683c(fastJsonResponse$Field);
        see.m35047a(this.f30334b, fastJsonResponse$Field.f30319g, bigDecimal, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17876a(FastJsonResponse$Field fastJsonResponse$Field, String str, BigInteger bigInteger) {
        m22683c(fastJsonResponse$Field);
        Parcel parcel = this.f30334b;
        int i = fastJsonResponse$Field.f30319g;
        if (bigInteger != null) {
            int a = see.m35031a(parcel, i);
            parcel.writeByteArray(bigInteger.toByteArray());
            see.m35062b(parcel, a);
            return;
        }
        see.m35035a(parcel, i, 0);
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        m22683c(fastJsonResponse$Field);
        ArrayList arrayList2 = new ArrayList();
        arrayList.size();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((SafeParcelResponse) ((sio) arrayList.get(i))).mo17878b());
        }
        Parcel parcel = this.f30334b;
        int a = see.m35031a(parcel, fastJsonResponse$Field.f30319g);
        int size2 = arrayList2.size();
        parcel.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            Parcel parcel2 = (Parcel) arrayList2.get(i2);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        see.m35062b(parcel, a);
    }

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
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17877a(FastJsonResponse$Field fastJsonResponse$Field, String str, Map map) {
        m22683c(fastJsonResponse$Field);
        Bundle bundle = new Bundle();
        for (String str2 : map.keySet()) {
            bundle.putString(str2, (String) map.get(str2));
        }
        see.m35037a(this.f30334b, fastJsonResponse$Field.f30319g, bundle, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
     arg types: [android.os.Parcel, int, android.os.Parcel, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
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
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void */
    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        m22683c(fastJsonResponse$Field);
        see.m35039a(this.f30334b, fastJsonResponse$Field.f30319g, ((SafeParcelResponse) sio).mo17878b(), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        m22683c(fastJsonResponse$Field);
        see.m35051a(this.f30334b, fastJsonResponse$Field.f30319g, z);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7392a(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        m22683c(fastJsonResponse$Field);
        see.m35052a(this.f30334b, fastJsonResponse$Field.f30319g, bArr, true);
    }
}
