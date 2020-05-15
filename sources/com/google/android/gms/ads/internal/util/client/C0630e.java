package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;

/* renamed from: com.google.android.gms.ads.internal.util.client.e */
final /* synthetic */ class C0630e implements C0631f {

    /* renamed from: a */
    private final String f8962a;

    public C0630e(String str) {
        this.f8962a = str;
    }

    /* renamed from: a */
    public final void mo6809a(JsonWriter jsonWriter) {
        String str = this.f8962a;
        Object obj = C0632g.f8963a;
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }
}
