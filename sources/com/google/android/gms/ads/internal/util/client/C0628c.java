package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.util.client.c */
final /* synthetic */ class C0628c implements C0631f {

    /* renamed from: a */
    private final int f8959a;

    /* renamed from: b */
    private final Map f8960b;

    public C0628c(int i, Map map) {
        this.f8959a = i;
        this.f8960b = map;
    }

    /* renamed from: a */
    public final void mo6809a(JsonWriter jsonWriter) {
        int i = this.f8959a;
        Map map = this.f8960b;
        Object obj = C0632g.f8963a;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i);
        jsonWriter.endObject();
        C0632g.m5651a(jsonWriter, map);
        jsonWriter.endObject();
    }
}
