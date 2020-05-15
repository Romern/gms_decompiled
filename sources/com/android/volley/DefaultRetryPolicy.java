package com.android.volley;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DefaultRetryPolicy implements RetryPolicy {
    public static final float DEFAULT_BACKOFF_MULT = 1.0f;
    public static final int DEFAULT_MAX_RETRIES = 1;
    public static final int DEFAULT_TIMEOUT_MS = 2500;

    /* renamed from: a */
    private int f7268a;

    /* renamed from: b */
    private int f7269b;

    /* renamed from: c */
    private final int f7270c;

    /* renamed from: d */
    private final float f7271d;

    public DefaultRetryPolicy() {
        this(DEFAULT_TIMEOUT_MS, 1, 1.0f);
    }

    public float getBackoffMultiplier() {
        return this.f7271d;
    }

    public int getCurrentRetryCount() {
        return this.f7269b;
    }

    public int getCurrentTimeout() {
        return this.f7268a;
    }

    /* access modifiers changed from: protected */
    public boolean hasAttemptRemaining() {
        return this.f7269b <= this.f7270c;
    }

    public void retry(VolleyError volleyError) {
        this.f7269b++;
        int i = this.f7268a;
        this.f7268a = i + ((int) (((float) i) * this.f7271d));
        if (!hasAttemptRemaining()) {
            throw volleyError;
        }
    }

    public DefaultRetryPolicy(int i, int i2, float f) {
        this.f7268a = i;
        this.f7270c = i2;
        this.f7271d = f;
    }
}
