package com.android.volley;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface RetryPolicy {
    int getCurrentRetryCount();

    int getCurrentTimeout();

    void retry(VolleyError volleyError);
}