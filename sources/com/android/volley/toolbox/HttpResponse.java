package com.android.volley.toolbox;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class HttpResponse {

    /* renamed from: a */
    private final int f7325a;

    /* renamed from: b */
    private final List f7326b;

    /* renamed from: c */
    private final int f7327c;

    /* renamed from: d */
    private final InputStream f7328d;

    public HttpResponse(int i, List list) {
        this(i, list, -1, null);
    }

    public final InputStream getContent() {
        return this.f7328d;
    }

    public final int getContentLength() {
        return this.f7327c;
    }

    public final List getHeaders() {
        return Collections.unmodifiableList(this.f7326b);
    }

    public final int getStatusCode() {
        return this.f7325a;
    }

    public HttpResponse(int i, List list, int i2, InputStream inputStream) {
        this.f7325a = i;
        this.f7326b = list;
        this.f7327c = i2;
        this.f7328d = inputStream;
    }
}
