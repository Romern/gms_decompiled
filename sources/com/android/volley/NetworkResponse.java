package com.android.volley;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkResponse {
    public final List allHeaders;
    public final byte[] data;
    public final Map headers;
    public final long networkTimeMs;
    public final boolean notModified;
    public final int statusCode;

    private NetworkResponse(int i, byte[] bArr, Map map, List list, boolean z, long j) {
        this.statusCode = i;
        this.data = bArr;
        this.headers = map;
        this.allHeaders = list != null ? Collections.unmodifiableList(list) : null;
        this.notModified = z;
        this.networkTimeMs = j;
    }

    @Deprecated
    public NetworkResponse(int i, byte[] bArr, Map map, boolean z) {
        this(i, bArr, map, z, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @Deprecated
    public NetworkResponse(int i, byte[] bArr, Map map, boolean z, long j) {
        this(i, bArr, map, r5, z, j);
        ArrayList arrayList;
        if (map == null) {
            arrayList = null;
        } else if (map.isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList2.add(new Header((String) entry.getKey(), (String) entry.getValue()));
            }
            arrayList = arrayList2;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public NetworkResponse(int i, byte[] bArr, boolean z, long j, List list) {
        this(i, bArr, r4, list, z, j);
        TreeMap treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            TreeMap treeMap2 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Header header = (Header) it.next();
                treeMap2.put(header.getName(), header.getValue());
            }
            treeMap = treeMap2;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.android.volley.NetworkResponse.<init>(int, byte[], boolean, long, java.util.List):void
     arg types: [?, byte[], int, int, java.util.List]
     candidates:
      com.android.volley.NetworkResponse.<init>(int, byte[], java.util.Map, boolean, long):void
      com.android.volley.NetworkResponse.<init>(int, byte[], boolean, long, java.util.List):void */
    public NetworkResponse(byte[] bArr) {
        this((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, bArr, false, 0L, Collections.emptyList());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.android.volley.NetworkResponse.<init>(int, byte[], java.util.Map, boolean, long):void
     arg types: [?, byte[], java.util.Map, int, int]
     candidates:
      com.android.volley.NetworkResponse.<init>(int, byte[], boolean, long, java.util.List):void
      com.android.volley.NetworkResponse.<init>(int, byte[], java.util.Map, boolean, long):void */
    @Deprecated
    public NetworkResponse(byte[] bArr, Map map) {
        this((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, bArr, map, false, 0L);
    }
}
