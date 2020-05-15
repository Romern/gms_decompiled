package com.android.volley;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ParseError extends VolleyError {
    public ParseError() {
    }

    public ParseError(NetworkResponse networkResponse) {
        super(networkResponse);
    }

    public ParseError(Throwable th) {
        super(th);
    }
}
