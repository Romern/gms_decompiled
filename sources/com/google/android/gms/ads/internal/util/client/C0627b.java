package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.util.client.b */
final /* synthetic */ class C0627b implements C0631f {

    /* renamed from: a */
    private final String f8955a;

    /* renamed from: b */
    private final String f8956b;

    /* renamed from: c */
    private final Map f8957c;

    /* renamed from: d */
    private final byte[] f8958d;

    public C0627b(String str, String str2, Map map, byte[] bArr) {
        this.f8955a = str;
        this.f8956b = str2;
        this.f8957c = map;
        this.f8958d = bArr;
    }

    /* renamed from: a */
    public final void mo6809a(JsonWriter jsonWriter) {
        String str = this.f8955a;
        String str2 = this.f8956b;
        Map map = this.f8957c;
        byte[] bArr = this.f8958d;
        Object obj = C0632g.f8963a;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        C0632g.m5651a(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(sqd.m35968b(bArr));
        }
        jsonWriter.endObject();
    }
}
