package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;

/* renamed from: com.google.android.gms.ads.internal.util.client.d */
final /* synthetic */ class C0629d implements C0631f {

    /* renamed from: a */
    private final byte[] f8961a;

    public C0629d(byte[] bArr) {
        this.f8961a = bArr;
    }

    /* renamed from: a */
    public final void mo6809a(JsonWriter jsonWriter) {
        byte[] bArr = this.f8961a;
        Object obj = C0632g.f8963a;
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String b = sqd.m35968b(bArr);
        if (length < 10000) {
            jsonWriter.name("body").value(b);
        } else {
            String a = C0626a.m5636a(b);
            if (a != null) {
                jsonWriter.name("bodydigest").value(a);
            }
        }
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }
}
