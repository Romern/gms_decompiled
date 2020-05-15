package com.android.volley;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkError extends VolleyError {
    public NetworkError() {
    }

    public NetworkError(NetworkResponse networkResponse) {
        super(networkResponse);
    }

    public NetworkError(Throwable th) {
        super(th);
    }
}
