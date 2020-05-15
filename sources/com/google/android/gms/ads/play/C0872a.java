package com.google.android.gms.ads.play;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* renamed from: com.google.android.gms.ads.play.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0872a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bqgg f9412a;

    /* renamed from: b */
    final /* synthetic */ GmsCachingPlayStoreParentalControlProvider f9413b;

    public C0872a(GmsCachingPlayStoreParentalControlProvider gmsCachingPlayStoreParentalControlProvider, bqgg bqgg) {
        this.f9413b = gmsCachingPlayStoreParentalControlProvider;
        this.f9412a = bqgg;
    }

    public final void run() {
        try {
            if (((Bundle) this.f9412a.get()).getBoolean("is_cacheable")) {
                synchronized (this.f9413b.f9408a) {
                    GmsCachingPlayStoreParentalControlProvider gmsCachingPlayStoreParentalControlProvider = this.f9413b;
                    gmsCachingPlayStoreParentalControlProvider.f9410c = false;
                    gmsCachingPlayStoreParentalControlProvider.f9409b = this.f9412a;
                }
            }
        } catch (Exception e) {
            C0633h.m5670c("Error waiting for future result.");
        }
    }
}
